package com.kmplibs.asciidoc.parse.grammar

import io.github.mirrgieriana.xarpeg.*
import io.github.mirrgieriana.xarpeg.parsers.*
import com.kmplibs.asciidoc.*

val BlockEmptyLine = (AnySpaces * NewLineParser).map { (spaces, _) -> EmptyLine(spaces) }

// Since (!BlockEmptyLine) is a NegativeLookAheadParser, which returns Unit,
// Xarpeg might skip adding Unit to the Tuple. Thus, (!BlockEmptyLine * NewLineParser)
// just returns NewLine, NOT a Tuple2!
val safeNewLine = (!BlockEmptyLine * NewLineParser).map { newline -> newline as Element }

val ParagraphElement: Parser<Element> = object {
    val root: Parser<Element> = NakedInlineText + Punctuation + SpecialCharacterParser + SingleSpace.map { StringElement(it) } + safeNewLine
}.root

val ParagraphElements = ParagraphElement.oneOrMore.map { Elements(it.toMutableList()) }

val ParagraphParser = (ParagraphElements * -EndOfLine.optional).map { els -> Paragraph(elements = els) }

val NakedBlocks: Parser<Element> = BlockEmptyLine + ParagraphParser

val BlockElements: Parser<Element> = NakedBlocks
