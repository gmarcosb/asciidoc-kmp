package com.kmplibs.asciidoc.parse

import io.github.mirrgieriana.xarpeg.*
import com.kmplibs.asciidoc.*
import com.kmplibs.asciidoc.parse.grammar.*
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class TableParserTest {

    @Test
    fun testParseSimpleTable() {
        val src = "|===\n|Cell 1 |Cell 2\n|===\n"
        val result = DocumentParser.parseAll(src) { AsciidocParseContext(it) }

        if (!result.isSuccess) {
            val ex = result.exceptionOrNull()
            if (ex is ParseException) {
                System.err.println("TABLE:\n" + ex.formatMessage())
            } else {
                System.err.println("TABLE Ex:\n" + ex?.message)
            }
        }

        assertTrue(result.isSuccess)
        val doc = result.getOrNull()!!
        val children = doc.children().children

        assertEquals(1, children.size)
        val block = children[0]
        assertTrue(block is Table)

        val rows = block.elements.children
        assertEquals(1, rows.size)
        val row = rows[0] as TableRow

        val cells = row.elements.children
        assertEquals(2, cells.size)

        val cell1 = cells[0] as TableCell
        val cell1Text = cell1.elements.children[0] as StringElement
        assertEquals("Cell 1 ", cell1Text.value) // Looks like the parser aggregates text and trailing spaces until the delimiter.

        // Assert second cell exists
        assertTrue(cells[1] is TableCell)
    }
}
