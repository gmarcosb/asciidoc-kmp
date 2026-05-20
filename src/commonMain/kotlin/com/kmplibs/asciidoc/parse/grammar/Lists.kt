package com.kmplibs.asciidoc.parse.grammar

import io.github.mirrgieriana.xarpeg.*
import io.github.mirrgieriana.xarpeg.parsers.*
import com.kmplibs.asciidoc.*

val UnorderedListMarker = (AnySpaces * (+Regex("\\*+|-+")).value * SingleSpace.oneOrMore).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val t = tuple as Tuple3<String, String, *>
    Pair(t.a, t.b) // indent, marker
}

val ChecklistParser = (!Regex("\\[[ x\\*]\\]").toParser() * (+Regex("\\[( |x|\\*)\\]")).value * SingleSpace.oneOrMore).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val v = (tuple as Tuple3<Unit, String, *>).b
    when (v) {
        "[ ]" -> Checklist.Unchecked
        "[x]", "[*]" -> Checklist.Checked
        else -> Checklist.Unknown
    }
}

val ListItemLineParser: Parser<Element> = object {
    val root: Parser<Element> = (!EndOfLine * (NakedInlineText + Punctuation + SpecialCharacterParser + SingleSpace.map { StringElement(it) })).map { el ->
        el as Element
    }
}.root

val ListItemValue = (ListItemLineParser.oneOrMore * EndOfLine.optional).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val els = (tuple as Tuple2<List<Element>, *>).a
    Elements(els.toMutableList())
}

val UnorderedListItemParser = (UnorderedListMarker * ChecklistParser.optional * ListItemValue).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val t = tuple as Tuple3<Pair<String, String>, Checklist?, Elements>
    UnorderedListItem(
        indent = t.a.first,
        marker = t.a.second,
        checklist = t.b ?: Checklist.Unknown,
        elements = t.c
    )
}

val OrderedListMarker = (AnySpaces * (+Regex("\\.+|[0-9]+\\.|[a-zA-Z]\\.|[ivxlcdmIVXLCDM]+\\)")).value * SingleSpace.oneOrMore).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val t = tuple as Tuple3<String, String, *>
    Pair(t.a, t.b)
}

val OrderedListItemParser = (OrderedListMarker * ListItemValue).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val t = tuple as Tuple2<Pair<String, String>, Elements>
    OrderedListItem(
        indent = t.a.first,
        marker = t.a.second,
        elements = t.b
    )
}
