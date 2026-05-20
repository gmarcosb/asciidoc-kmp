package com.kmplibs.asciidoc.parse.grammar

import io.github.mirrgieriana.xarpeg.*
import io.github.mirrgieriana.xarpeg.parsers.*
import com.kmplibs.asciidoc.*

val InlineElement: Parser<Element> = object {
    // Inject the InlineMacroParser into our InlineElement resolution
    val root: Parser<Element> = InlineMacroParser + NakedInlineText + Punctuation + SpecialCharacterParser + SingleSpace.map { StringElement(it) } + NewLineParser
}.root

val InlineElements = InlineElement.oneOrMore.map { Elements(it.toMutableList()) }

val InlineBlock = (InlineElements * -EndOfLine.optional).map { (els) -> els }
