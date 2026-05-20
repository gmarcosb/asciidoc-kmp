package com.kmplibs.asciidoc.parse.grammar

import io.github.mirrgieriana.xarpeg.*
import io.github.mirrgieriana.xarpeg.parsers.*
import com.kmplibs.asciidoc.*

val TableStart = (!Regex("\\\\").toParser() * (+Regex("\\|===")) * (+Regex("=")).value.zeroOrMore * AnySpaces).map { "" }

val TableStartFull = (TableStart * EndOfLine).map { "" }

// Fix EndOfLineLookahead -> EndOfLine since table ends the block and optionally consumes the newline.
val TableEnd = (!Regex("\\\\").toParser() * (+Regex("\\|===")) * (+Regex("=")).value.zeroOrMore * AnySpaces).map { "" }

val TableEndFull = (TableEnd * EndOfLine.optional).map { "" }

val TableCellDelimiter = (+Regex("\\|")).value

val InlineTableElements: Parser<Element> = object {
    // Modified to break correctly before TableEnd and TableCellDelimiter
    val root: Parser<Element> = (!TableEnd * !TableCellDelimiter * !EndOfLine * (NakedInlineText + Punctuation + SpecialCharacterParser + SingleSpace.map { StringElement(it) })).map { el ->
        el as Element
    }
}.root

val TableCellParser = (TableCellDelimiter * AnySpaces * InlineTableElements.oneOrMore.optional).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val t = tuple as Tuple3<String, String, List<Element>?>

    val els = Elements()
    t.c?.let { it.forEach { e -> els.append(e) } }

    TableCell(format = TableCellFormat(), elements = els)
}

val TableRowParser = (TableCellParser.oneOrMore * EndOfLine.optional).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val t = tuple as Tuple2<List<TableCell>, *>
    val row = TableRow()
    t.a.forEach {
        it.parent = row
        row.elements.append(it)
    }
    row
}

// Fixed map function syntax
val TableParser = (TableStartFull * (!TableEnd * TableRowParser).map { el -> el as TableRow }.zeroOrMore * TableEndFull).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val t = tuple as Tuple3<*, List<TableRow>, *>
    val table = Table()
    t.b.forEach {
        it.parent = table
        table.elements.append(it)
    }
    table
}
