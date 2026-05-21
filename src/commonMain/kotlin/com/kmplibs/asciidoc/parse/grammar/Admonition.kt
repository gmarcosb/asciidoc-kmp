package com.kmplibs.asciidoc.parse.grammar

import io.github.mirrgieriana.xarpeg.*
import io.github.mirrgieriana.xarpeg.parsers.*
import com.kmplibs.asciidoc.*

val AdmonitionPrefixParser: Parser<Admonition> =
    (+Regex("NOTE: ")).value.map { Admonition(AdmonitionType.Note) } +
    (+Regex("TIP: ")).value.map { Admonition(AdmonitionType.Tip) } +
    (+Regex("IMPORTANT: ")).value.map { Admonition(AdmonitionType.Important) } +
    (+Regex("CAUTION: ")).value.map { Admonition(AdmonitionType.Caution) } +
    (+Regex("WARNING: ")).value.map { Admonition(AdmonitionType.Warning) }

val AdmonitionParagraphParser = (AdmonitionPrefixParser * ParagraphElements * EndOfLine.lookAhead.optional).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val t = tuple as Tuple3<Admonition, Elements, *>
    Paragraph(t.a.admonitionType, t.b)
}
