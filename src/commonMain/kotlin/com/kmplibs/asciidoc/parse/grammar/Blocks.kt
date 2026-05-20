package com.kmplibs.asciidoc.parse.grammar

import io.github.mirrgieriana.xarpeg.*
import io.github.mirrgieriana.xarpeg.parsers.*
import com.kmplibs.asciidoc.*

val BlockEmptyLine = (AnySpaces * NewLineParser).map { (spaces, _) -> EmptyLine(spaces) }

val safeNewLine = (!BlockEmptyLine * NewLineParser).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    (tuple as Tuple2<*, Element>).b
}

val ParagraphElement: Parser<Element> = object {
    val root: Parser<Element> = NakedInlineText + Punctuation + SpecialCharacterParser + SingleSpace.map { StringElement(it) } + safeNewLine
}.root

val ParagraphElements = ParagraphElement.oneOrMore.map { Elements(it.toMutableList()) }

val ParagraphParser = (ParagraphElements * -EndOfLine.optional).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val els = if (tuple is Tuple2<*, *>) tuple.a as Elements else tuple as Elements
    Paragraph(elements = els)
}

val NakedBlocks: Parser<Element> = BlockEmptyLine + SectionParser + UnorderedListItemParser + OrderedListItemParser + DelimitedBlockParser + ParagraphParser

val BlockElements: Parser<Element> = NakedBlocks
