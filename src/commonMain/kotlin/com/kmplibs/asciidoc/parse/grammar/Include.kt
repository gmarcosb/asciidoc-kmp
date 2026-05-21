package com.kmplibs.asciidoc.parse.grammar

import io.github.mirrgieriana.xarpeg.*
import io.github.mirrgieriana.xarpeg.parsers.*
import com.kmplibs.asciidoc.*

val FileIncludePath = (!AnySpaces * (+Regex("[^ \\t\\r\\n\\[]+")).value).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    (tuple as Tuple2<*, String>).b
}

val FileInclude = (!(+Regex("\\\\")).value * (+Regex("include::")).value * FileIncludePath * (+Regex("\\[")).value * AnySpaces * (+Regex("\\]")).value * AnySpaces * EndOfLine.lookAhead.optional).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val t = tuple as Tuple8<*, *, String, *, *, *, *, *>
    FileInclude(t.c) as Element
}

val IncludeParseLine = ((+Regex("[^\\r\\n]*")).value * EndOfLine.lookAhead.optional).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val t = tuple as Tuple2<String, *>
    val els = Elements()
    els.append(StringElement(t.a))
    els.append(NewLine())
    els as Element
}

val IncludeParseElement = (!EndOfFile * (!EndOfLine.lookAhead.optional).map{""} * (FileInclude + IncludeParseLine) * EndOfLine).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val t = tuple as Tuple4<*, *, Element, *>
    t.c
}

val IncludeParse = IncludeParseElement.oneOrMore * EndOfFile.map { tuple ->
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
    els as Element
}
