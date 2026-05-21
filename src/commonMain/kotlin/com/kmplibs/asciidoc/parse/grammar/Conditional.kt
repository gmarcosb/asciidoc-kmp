package com.kmplibs.asciidoc.parse.grammar

import io.github.mirrgieriana.xarpeg.*
import io.github.mirrgieriana.xarpeg.parsers.*
import com.kmplibs.asciidoc.*

data class ConditionalAttributesData(val names: List<String>, val union: ConditionalUnion)

val ConditionalAttributesAnyParser: Parser<ConditionalAttributesData> = (AttributeEntryName * AnySpaces * (+Regex(",?")).value * AnySpaces).mapEx { _, res ->
    @Suppress("UNCHECKED_CAST")
    val tuple = res.value as Tuple4<String, *, *, *>
    if (tuple.a.isNotEmpty()) tuple.a else null
}.oneOrMore.map { names ->
    ConditionalAttributesData(names.toList(), ConditionalUnion.Any)
}

val ConditionalAttributesAllParser: Parser<ConditionalAttributesData> = (AttributeEntryName * AnySpaces * (+Regex("\\+?")).value * AnySpaces).mapEx { _, res ->
    @Suppress("UNCHECKED_CAST")
    val tuple = res.value as Tuple4<String, *, *, *>
    if (tuple.a.isNotEmpty()) tuple.a else null
}.oneOrMore.map { names ->
    ConditionalAttributesData(names.toList(), ConditionalUnion.All)
}

val ConditionalAttributesParser: Parser<ConditionalAttributesData> = ConditionalAttributesAnyParser + ConditionalAttributesAllParser

val IfDefStatement = (+Regex("ifdef::")).value
val IfNDefStatement = (+Regex("ifndef::")).value
val EndIfDefStatement = (+Regex("endif::")).value

val InlineConditionalContent: Parser<Elements> = (!(+Regex("\\]")).value * InlineElement).map { tuple ->
    // Negative lookahead evaluates to nothing, resulting in pure Element value
    tuple as Element
}.oneOrMore.map { Elements(it.toMutableList()) }

val InlineIfDefParser: Parser<Element> = (IfDefStatement * ConditionalAttributesParser * (+Regex("\\[")).value * InlineConditionalContent * (+Regex("\\]")).value * AnySpaces).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val t = tuple as Tuple6<*, ConditionalAttributesData, *, Elements, *, *>
    InlineIfDef(t.b.names, t.b.union, t.d) as Element
}

val InlineIfNDefParser: Parser<Element> = (IfNDefStatement * ConditionalAttributesParser * (+Regex("\\[")).value * InlineConditionalContent * (+Regex("\\]")).value * AnySpaces).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val t = tuple as Tuple6<*, ConditionalAttributesData, *, Elements, *, *>
    InlineIfNDef(t.b.names, t.b.union, t.d) as Element
}

val EndIfDefParser: Parser<Element> = (EndIfDefStatement * ConditionalAttributesParser.optional * (+Regex("\\[\\]")).value * AnySpaces * EndOfLine.lookAhead.optional).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val t = tuple as Tuple5<*, ConditionalAttributesData?, *, *, *>
    val attrData = t.b
    if (attrData != null) {
        EndIf(attrData.names, attrData.union) as Element
    } else {
        EndIf(emptyList(), ConditionalUnion.Any) as Element
    }
}

val IfEvalStatement = (+Regex("ifeval::")).value

val IfEvalOperatorParser: Parser<ConditionalOperator> =
    (+Regex("==")).value.map { ConditionalOperator.Equal } +
    (+Regex("!=")).value.map { ConditionalOperator.NotEqual } +
    (+Regex("<=")).value.map { ConditionalOperator.LessThanOrEqual } +
    (+Regex("<")).value.map { ConditionalOperator.LessThan } +
    (+Regex(">=")).value.map { ConditionalOperator.GreaterThanOrEqual } +
    (+Regex(">")).value.map { ConditionalOperator.GreaterThan }

val SingleQuoteAttributeValue: Parser<IfEvalValue> = ((+Regex("'")).value * (!(+Regex("'")).value * InlineElement).map { t -> t as Element }.oneOrMore * (+Regex("'")).value).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val t = tuple as Tuple3<*, List<Element>, *>
    IfEvalValue(AttributeQuoteType.Single, Elements(t.b.toMutableList()))
}

val DoubleQuoteAttributeValue: Parser<IfEvalValue> = ((+Regex("\"")).value * (!(+Regex("\"")).value * InlineElement).map { t -> t as Element }.oneOrMore * (+Regex("\"")).value).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val t = tuple as Tuple3<*, List<Element>, *>
    IfEvalValue(AttributeQuoteType.Double, Elements(t.b.toMutableList()))
}

val NakedAttributeValueParser: Parser<IfEvalValue> = (!(+Regex("\\]")).value * !AnySpaces * InlineElement).map { t -> t as Element }.oneOrMore.map { els ->
    IfEvalValue(AttributeQuoteType.None, Elements(els.toMutableList()))
}

val IfEvalValueParser: Parser<IfEvalValue> = SingleQuoteAttributeValue + DoubleQuoteAttributeValue + NakedAttributeValueParser

val IfEvalParser: Parser<Element> = (IfEvalStatement * (+Regex("\\[")).value * AnySpaces * IfEvalValueParser * AnySpaces * IfEvalOperatorParser * AnySpaces * IfEvalValueParser * AnySpaces * (+Regex("\\]")).value * AnySpaces).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val t = tuple as Tuple10<*, *, *, IfEvalValue, *, ConditionalOperator, *, IfEvalValue, *, *>
    IfEval(t.d, t.f, t.h) as Element
}
