package com.kmplibs.asciidoc.parse.grammar

import io.github.mirrgieriana.xarpeg.*
import io.github.mirrgieriana.xarpeg.parsers.*
import com.kmplibs.asciidoc.*

val PreParseLineElement = AttributeReferenceValue.map { it as Element } + (+Regex("[^\\r\\n\\{]+")).value.map { StringElement(it) as Element } + (+Regex("\\{")).value.map { StringElement(it) as Element }

val PreParseLine: Parser<List<Element>> = (!EndIfDefStatement * PreParseLineElement.zeroOrMore * EndOfLine.lookAhead.optional).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val t = tuple as Tuple2<List<Element>, *>
    val els = t.a.toMutableList()
    els.add(NewLine())
    els.toList()
}

val PreParseElementParser = ref { PreParseElement }

val IfDefBlockParser: Parser<Element> = (IfDefStatement * ConditionalAttributesParser * (+Regex("\\[\\]")).value * AnySpaces * EndOfLine * PreParseElementParser.zeroOrMore * EndIfDefParser).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val t = tuple as Tuple7<*, ConditionalAttributesData, *, *, *, List<Element>, *>
    val attrs = t.b
    val els = Elements()
    t.f.forEach { el ->
        if (el is Elements) {
            el.children.forEach { els.append(it) }
        } else {
            els.append(el)
        }
    }
    IfDefBlock(attrs.names, attrs.union, els) as Element
}

val IfNDefBlockParser: Parser<Element> = (IfNDefStatement * ConditionalAttributesParser * (+Regex("\\[\\]")).value * AnySpaces * EndOfLine * PreParseElementParser.zeroOrMore * EndIfDefParser).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val t = tuple as Tuple7<*, ConditionalAttributesData, *, *, *, List<Element>, *>
    val attrs = t.b
    val els = Elements()
    t.f.forEach { el ->
        if (el is Elements) {
            el.children.forEach { els.append(it) }
        } else {
            els.append(el)
        }
    }
    IfNDefBlock(attrs.names, attrs.union, els) as Element
}

val IfEvalBlockParser: Parser<Element> = (IfEvalStatement * (+Regex("\\[")).value * AnySpaces * IfEvalValueParser * AnySpaces * IfEvalOperatorParser * AnySpaces * IfEvalValueParser * AnySpaces * (+Regex("\\]")).value * AnySpaces * EndOfLine * PreParseElementParser.zeroOrMore * EndIfDefParser).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val t = tuple as Tuple14<*, *, *, IfEvalValue, *, ConditionalOperator, *, IfEvalValue, *, *, *, *, List<Element>, *>
    val els = Elements()
    t.m.forEach { el ->
        if (el is Elements) {
            el.children.forEach { els.append(it) }
        } else {
            els.append(el)
        }
    }
    IfEvalBlock(t.d, t.f, t.h, els) as Element
}

val PreParseElement: Parser<Element> = object {
    val root: Parser<Element> = (!EndOfFile * (IfDefBlockParser + IfNDefBlockParser + IfEvalBlockParser + PreParseLine.map { els ->
        val container = Elements()
        els.forEach { container.append(it) }
        container as Element
    }) * EndOfLine).map { tuple ->
        @Suppress("UNCHECKED_CAST")
        val t = tuple as Tuple2<Element, *>
        t.a
    }
}.root

val PreParse = PreParseElement.oneOrMore * EndOfFile.map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val t = tuple as Tuple2<List<Element>, *>
    val els = Elements()
    t.a.forEach { el ->
        if (el is Elements) {
            el.children.forEach { els.append(it) }
        } else {
            els.append(el)
        }
    }
    els
}
