package com.kmplibs.asciidoc.parse

import io.github.mirrgieriana.xarpeg.*
import com.kmplibs.asciidoc.*
import com.kmplibs.asciidoc.parse.grammar.*
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class ListParserTest {

    @Test
    fun testUnorderedList() {
        val src = "* Item 1\n* Item 2\n"
        val result = DocumentParser.parseAll(src) { AsciidocParseContext(it) }

        if (!result.isSuccess) {
            val ex = result.exceptionOrNull()
            if (ex is ParseException) {
                System.err.println("UL:\n" + ex.formatMessage())
            } else {
                System.err.println("UL Ex:\n" + ex?.message)
                ex?.printStackTrace()
            }
        }

        assertTrue(result.isSuccess)
        val doc = result.getOrNull()!!
        val children = doc.children().children

        assertEquals(2, children.size)
        assertTrue(children[0] is UnorderedListItem)
        assertTrue(children[1] is UnorderedListItem)

        assertEquals("*", (children[0] as UnorderedListItem).marker)
        assertEquals("Item 1", ((children[0] as UnorderedListItem).elements.children[0] as StringElement).value)
    }

    @Test
    fun testOrderedList() {
        val src = "1. First\n2. Second\n"
        val result = DocumentParser.parseAll(src) { AsciidocParseContext(it) }
        if (!result.isSuccess) {
            val ex = result.exceptionOrNull()
            if (ex is ParseException) {
                System.err.println("OL:\n" + ex.formatMessage())
            } else {
                System.err.println("OL Ex:\n" + ex?.message)
            }
        }
        assertTrue(result.isSuccess)
    }
}
