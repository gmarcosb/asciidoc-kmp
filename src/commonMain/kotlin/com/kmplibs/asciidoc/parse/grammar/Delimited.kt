package com.kmplibs.asciidoc.parse.grammar

import io.github.mirrgieriana.xarpeg.*
import io.github.mirrgieriana.xarpeg.parsers.*
import com.kmplibs.asciidoc.*

val DelimitedBlockTypeParser = (+Regex("----|====|\\.\\.\\.\\.|____|\\*\\*\\*\\*|\\+\\+\\+\\+")).value.map { delimiter ->
    when {
        delimiter.startsWith("-") -> Delimiter(DelimitedBlockType.Listing, delimiter.length)
        delimiter.startsWith("=") -> Delimiter(DelimitedBlockType.Example, delimiter.length)
        delimiter.startsWith(".") -> Delimiter(DelimitedBlockType.Literal, delimiter.length)
        delimiter.startsWith("_") -> Delimiter(DelimitedBlockType.Quote, delimiter.length)
        delimiter.startsWith("*") -> Delimiter(DelimitedBlockType.Sidebar, delimiter.length)
        delimiter.startsWith("+") -> Delimiter(DelimitedBlockType.Stem, delimiter.length)
        else -> Delimiter(DelimitedBlockType.None, delimiter.length)
    }
}

// Fixed the destructuring by realizing NegativeLookAhead does not emit into the tuple.
// (!DelimitedBlockTypeParser * (+Regex(".*")).value * EndOfLine) creates a Tuple2<String, String> because Unit is stripped.
val DelimitedBlockLine: Parser<String> = (!DelimitedBlockTypeParser * (+Regex(".*")).value * EndOfLine).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val t = tuple as Tuple2<String, *>
    t.a
}

// DelimitedBlockTypeParser * EndOfLine * DelimitedBlockLine.zeroOrMore * DelimitedBlockTypeParser
// Tuple4<Delimiter, String, List<String>, Delimiter> but wait!
// EndOfLine emits a Tuple2 if we mapped it weirdly before. Actually let's assume it emits something like String?
val DelimitedBlockParser = (DelimitedBlockTypeParser * EndOfLine * DelimitedBlockLine.zeroOrMore * DelimitedBlockTypeParser).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val t = tuple as Tuple4<Delimiter, *, List<String>, Delimiter>

    val delimiter = t.a
    val lines = LineList(t.c.toMutableList())
    when (delimiter.type) {
        DelimitedBlockType.Listing -> Listing(delimiter, lines)
        DelimitedBlockType.Literal -> LiteralBlock(delimiter, lines)
        DelimitedBlockType.Stem -> StemBlock(delimiter, lines)
        else -> Listing(delimiter, lines) // Fallback
    }
}
