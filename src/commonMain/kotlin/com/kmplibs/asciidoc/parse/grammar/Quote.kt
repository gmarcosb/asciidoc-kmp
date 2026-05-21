package com.kmplibs.asciidoc.parse.grammar

import io.github.mirrgieriana.xarpeg.*
import io.github.mirrgieriana.xarpeg.parsers.*
import com.kmplibs.asciidoc.*
import com.kmplibs.asciidoc.parse.AsciidocParseContext

val QuoteUnderlines = ((+Regex("____")).value * (+Regex("_*")).value).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val t = tuple as Tuple2<String, String>
    t.a.length + t.b.length
}

val QuoteDelimiterParser = (QuoteUnderlines * AnySpaces).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val t = tuple as Tuple2<Int, String>
    Delimiter(DelimitedBlockType.Quote, t.a)
}

val QuoteStart = (QuoteDelimiterParser * EndOfLine).mapEx { ctx, res ->
    @Suppress("UNCHECKED_CAST")
    val tuple = res.value as Tuple2<Delimiter, *>
    val delimiter = tuple.a
    if (ctx is AsciidocParseContext) {
        ctx.pushDelimitedLevel(DelimitedBlockType.Quote, delimiter.length)
    }
    delimiter
}

val QuoteEnd = (QuoteDelimiterParser * EndOfLine.lookAhead.optional).mapEx { ctx, res ->
    @Suppress("UNCHECKED_CAST")
    val tuple = res.value as Tuple2<Delimiter, *>
    val delimiter = tuple.a
    if (ctx is AsciidocParseContext) {
        val previous = ctx.peekDelimitedLevel(DelimitedBlockType.Quote)
        if (previous == delimiter.length) {
            ctx.popDelimitedLevel(DelimitedBlockType.Quote)
            delimiter
        } else {
            null
        }
    } else {
        delimiter
    }
}

val QuoteBlockLineParser: Parser<Element> = object {
    val root: Parser<Element> = (!QuoteDelimiterParser * ref { BlockElements }).map { tuple ->
        tuple as Element
    }
}.root

val QuoteBlockParser: Parser<QuoteBlock> = (QuoteStart * QuoteBlockLineParser.zeroOrMore * QuoteEnd).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val t = tuple as Tuple3<Delimiter, List<Element>, Delimiter>
    QuoteBlock(t.a, Elements(t.b.toMutableList()))
}
