package com.kmplibs.asciidoc.parse.grammar

import io.github.mirrgieriana.xarpeg.*
import io.github.mirrgieriana.xarpeg.parsers.*
import com.kmplibs.asciidoc.*

val FormattedTextElement: Parser<Element> = object {
    val root: Parser<Element> = NakedInlineText + Punctuation + SpecialCharacterParser + SingleSpace.map { StringElement(it) } + AttributeReferenceValue.map { it as Element }
}.root

// BOLD
val SingleBoldTextElement = (!Regex("\\*(?!\\*)").toParser() * FormattedTextElement).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    tuple as Element
}

val SingleBoldTextValue = (!Regex("[ \t]").toParser() * SingleBoldTextElement.oneOrMore).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val els = tuple as List<Element>
    Bold(Elements(els.toMutableList()))
}

val SingleBoldText = (!Regex("\\\\").toParser() * +Regex("\\*(?!\\*)") * SingleBoldTextValue * +Regex("\\*(?!\\*)") * !Regex("[\\p{L}\\p{N}]").toParser()).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val t = tuple as Tuple3<*, Bold, *>
    t.b as Element
}

val DoubleBoldTextElement = (!Regex("\\*\\*").toParser() * FormattedTextElement).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    tuple as Element
}

val DoubleBoldTextValue = (!Regex("[ \t]").toParser() * DoubleBoldTextElement.oneOrMore).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val els = tuple as List<Element>
    DoubleBold(Elements(els.toMutableList()))
}

val DoubleBoldText = (!Regex("\\\\\\\\").toParser() * +Regex("\\*\\*") * DoubleBoldTextValue * +Regex("\\*\\*")).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val t = tuple as Tuple3<*, DoubleBold, *>
    t.b as Element
}

val BoldText = SingleBoldText + DoubleBoldText

// ITALIC
val SingleItalicTextElement = (!Regex("_(?!_)").toParser() * FormattedTextElement).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    tuple as Element
}

val SingleItalicTextValue = (!Regex("[ \t]").toParser() * SingleItalicTextElement.oneOrMore).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val els = tuple as List<Element>
    Italic(Elements(els.toMutableList()))
}

val SingleItalicText = (!Regex("\\\\").toParser() * +Regex("_(?!_)") * SingleItalicTextValue * +Regex("_(?!_)") * !Regex("[\\p{L}\\p{N}]").toParser()).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val t = tuple as Tuple3<*, Italic, *>
    t.b as Element
}

val DoubleItalicTextElement = (!Regex("__").toParser() * FormattedTextElement).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    tuple as Element
}

val DoubleItalicTextValue = (!Regex("[ \t]").toParser() * DoubleItalicTextElement.oneOrMore).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val els = tuple as List<Element>
    DoubleItalic(Elements(els.toMutableList()))
}

val DoubleItalicText = (!Regex("\\\\\\\\").toParser() * +Regex("__") * DoubleItalicTextValue * +Regex("__")).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val t = tuple as Tuple3<*, DoubleItalic, *>
    t.b as Element
}

val ItalicText = SingleItalicText + DoubleItalicText

// MONOSPACE
val SingleMonospaceTextElement = (!Regex("`(?!`)").toParser() * FormattedTextElement).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    tuple as Element
}

val SingleMonospaceTextValue = (!Regex("[ \t]").toParser() * SingleMonospaceTextElement.oneOrMore).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val els = tuple as List<Element>
    Monospace(Elements(els.toMutableList()))
}

val SingleMonospaceText = (!Regex("\\\\").toParser() * +Regex("`(?!`)") * SingleMonospaceTextValue * +Regex("`(?!`)") * !Regex("[\\p{L}\\p{N}]").toParser()).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val t = tuple as Tuple3<*, Monospace, *>
    t.b as Element
}

val DoubleMonospaceTextElement = (!Regex("``").toParser() * FormattedTextElement).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    tuple as Element
}

val DoubleMonospaceTextValue = (!Regex("[ \t]").toParser() * DoubleMonospaceTextElement.oneOrMore).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val els = tuple as List<Element>
    DoubleMonospace(Elements(els.toMutableList()))
}

val DoubleMonospaceText = (!Regex("\\\\\\\\").toParser() * +Regex("``") * DoubleMonospaceTextValue * +Regex("``")).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val t = tuple as Tuple3<*, DoubleMonospace, *>
    t.b as Element
}

val MonospaceText = SingleMonospaceText + DoubleMonospaceText


// SUBSCRIPT & SUPERSCRIPT & MARKED
val SuperscriptTextElement = (!Regex("\\^(?!\\^)").toParser() * FormattedTextElement).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    tuple as Element
}
val SuperscriptTextValue = (!Regex("[ \t]").toParser() * SuperscriptTextElement.oneOrMore).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val els = tuple as List<Element>
    Superscript(Elements(els.toMutableList()))
}
val SuperscriptText = (!Regex("\\\\").toParser() * +Regex("\\^(?!\\^)") * SuperscriptTextValue * +Regex("\\^(?!\\^)") * !Regex("[\\p{L}\\p{N}]").toParser()).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val t = tuple as Tuple3<*, Superscript, *>
    t.b as Element
}

val SubscriptTextElement = (!Regex("~(?!~)").toParser() * FormattedTextElement).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    tuple as Element
}
val SubscriptTextValue = (!Regex("[ \t]").toParser() * SubscriptTextElement.oneOrMore).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val els = tuple as List<Element>
    Subscript(Elements(els.toMutableList()))
}
val SubscriptText = (!Regex("\\\\").toParser() * +Regex("~(?!~)") * SubscriptTextValue * +Regex("~(?!~)") * !Regex("[\\p{L}\\p{N}]").toParser()).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val t = tuple as Tuple3<*, Subscript, *>
    t.b as Element
}

val MarkedTextElement = (!Regex("#(?!#)").toParser() * FormattedTextElement).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    tuple as Element
}
val MarkedTextValue = (!Regex("[ \t]").toParser() * MarkedTextElement.oneOrMore).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val els = tuple as List<Element>
    Marked(Elements(els.toMutableList()))
}
val MarkedText = (!Regex("\\\\").toParser() * +Regex("#(?!#)") * MarkedTextValue * +Regex("#(?!#)") * !Regex("[\\p{L}\\p{N}]").toParser()).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val t = tuple as Tuple3<*, Marked, *>
    t.b as Element
}

val FormattedText = BoldText + ItalicText + MonospaceText + SuperscriptText + SubscriptText + MarkedText
