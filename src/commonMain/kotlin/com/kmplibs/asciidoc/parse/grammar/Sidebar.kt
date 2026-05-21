package com.kmplibs.asciidoc.parse.grammar

import io.github.mirrgieriana.xarpeg.*
import io.github.mirrgieriana.xarpeg.parsers.*
import com.kmplibs.asciidoc.*
import com.kmplibs.asciidoc.parse.AsciidocParseContext

val SidebarAsterisks = ((+Regex("\\*\\*\\*\\*")).value * (+Regex("\\**")).value).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val t = tuple as Tuple2<String, String>
    t.a.length + t.b.length
}

val SidebarDelimiterParser = (SidebarAsterisks * AnySpaces).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val t = tuple as Tuple2<Int, String>
    Delimiter(DelimitedBlockType.Sidebar, t.a)
}

val SidebarStart = (SidebarDelimiterParser * EndOfLine).mapEx { ctx, res ->
    @Suppress("UNCHECKED_CAST")
    val tuple = res.value as Tuple2<Delimiter, *>
    val delimiter = tuple.a
    if (ctx is AsciidocParseContext) {
        ctx.pushDelimitedLevel(DelimitedBlockType.Sidebar, delimiter.length)
    }
    delimiter
}

val SidebarEnd = (SidebarDelimiterParser * EndOfLine.lookAhead.optional).mapEx { ctx, res ->
    @Suppress("UNCHECKED_CAST")
    val tuple = res.value as Tuple2<Delimiter, *>
    val delimiter = tuple.a
    if (ctx is AsciidocParseContext) {
        val previous = ctx.peekDelimitedLevel(DelimitedBlockType.Sidebar)
        if (previous == delimiter.length) {
            ctx.popDelimitedLevel(DelimitedBlockType.Sidebar)
            delimiter
        } else {
            null
        }
    } else {
        delimiter
    }
}

val SidebarBlockLineParser: Parser<Element> = object {
    val root: Parser<Element> = (!SidebarDelimiterParser * ref { BlockElements }).map { tuple ->
        tuple as Element
    }
}.root

val SidebarBlockParser: Parser<SidebarBlock> = (SidebarStart * SidebarBlockLineParser.zeroOrMore * SidebarEnd).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val t = tuple as Tuple3<Delimiter, List<Element>, Delimiter>
    SidebarBlock(t.a, Elements(t.b.toMutableList()))
}
