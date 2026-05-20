package com.kmplibs.asciidoc.parse.grammar

import io.github.mirrgieriana.xarpeg.*
import io.github.mirrgieriana.xarpeg.parsers.*
import com.kmplibs.asciidoc.*

val SectionLevel = (+Regex("={1,6}")).value.map { it.length - 1 }

val SectionTitleValue: Parser<Element> = object {
    // !EndOfLine is a NegativeLookAheadParser which does not emit a tuple value if successful.
    // So the parser only returns the result of the OrParser, which is an Element directly.
    val root: Parser<Element> = (!EndOfLine * (NakedInlineText + Punctuation + SpecialCharacterParser + SingleSpace.map { StringElement(it) })).map { el -> el as Element }
}.root

val SectionTitle = SectionTitleValue.oneOrMore.map { Elements(it.toMutableList()) }

val EndOfLineLookahead = (!EndOfLine).map { "" }

val SectionParser = (SectionLevel * AnySpaces.map { Unit } * SectionTitle * EndOfLineLookahead).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val t = tuple as Tuple4<Int, *, Elements, *>
    Section(title = t.c, level = t.a)
}
