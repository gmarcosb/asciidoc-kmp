package com.kmplibs.asciidoc.parse

import io.github.mirrgieriana.xarpeg.*
import com.kmplibs.asciidoc.*
import com.kmplibs.asciidoc.parse.grammar.*
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class DocumentParserTest {

    @Test
    fun testParseSimpleInlineText() {
        val src = "Hello World"
        val result = DocumentParser.parseAll(src) { AsciidocParseContext(it) }
        assertTrue(result.isSuccess, "Failed to parse:\n\n" + (result.exceptionOrNull()?.let { if (it is ParseException) it.formatMessage() else it.message }))

        val doc = result.getOrNull()
        assertTrue(doc != null)
        val children = doc.children().children
        assertEquals(1, children.size)

        val block = children[0]
        assertTrue(block is Paragraph)

        val inlines = block.elements.children
        assertEquals(1, inlines.size)
        val text = inlines[0]
        assertTrue(text is StringElement)
        assertEquals("Hello World", text.value)
    }

    @Test
    fun testParseMultipleBlocks() {
        val src = "Block 1\n\nBlock 2\n"
        val result = DocumentParser.parseAll(src) { AsciidocParseContext(it) }
        assertTrue(result.isSuccess, "Failed to parse:\n\n" + (result.exceptionOrNull()?.let { if (it is ParseException) it.formatMessage() else it.message }))

        val children = result.getOrNull()!!.children().children
        assertEquals(3, children.size)

        assertTrue(children[0] is Paragraph)
        assertEquals("Block 1", ((children[0] as Paragraph).elements.children[0] as StringElement).value)

        assertTrue(children[1] is EmptyLine)

        assertTrue(children[2] is Paragraph)
        assertEquals("Block 2", ((children[2] as Paragraph).elements.children[0] as StringElement).value)
    }
}
