package com.kmplibs.asciidoc.parse

import io.github.mirrgieriana.xarpeg.*
import com.kmplibs.asciidoc.*
import com.kmplibs.asciidoc.parse.grammar.*
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class FormatParserTest {

    @Test
    fun testParseSingleBoldText() {
        val src = "*Bold Text*"
        val result = FormattedText.parseAll(src)
        assertTrue(result.isSuccess)
        val text = result.getOrNull()!!
        assertTrue(text is Bold)

        assertEquals(1, text.elements.children.size)
        assertEquals("Bold Text", (text.elements.children[0] as StringElement).value)
    }

    @Test
    fun testParseDoubleBoldText() {
        val src = "**Double Bold**"
        val result = FormattedText.parseAll(src)
        assertTrue(result.isSuccess)
        val text = result.getOrNull()!!
        assertTrue(text is DoubleBold)

        assertEquals(1, text.elements.children.size)
        assertEquals("Double Bold", (text.elements.children[0] as StringElement).value)
    }

    @Test
    fun testParseItalicText() {
        val src = "_Italic_"
        val result = FormattedText.parseAll(src)
        assertTrue(result.isSuccess)
        val text = result.getOrNull()!!
        assertTrue(text is Italic)

        assertEquals(1, text.elements.children.size)
        assertEquals("Italic", (text.elements.children[0] as StringElement).value)
    }

    @Test
    fun testParseDoubleItalicText() {
        val src = "__Double Italic__"
        val result = FormattedText.parseAll(src)
        assertTrue(result.isSuccess)
        val text = result.getOrNull()!!
        assertTrue(text is DoubleItalic)

        assertEquals(1, text.elements.children.size)
        assertEquals("Double Italic", (text.elements.children[0] as StringElement).value)
    }

    @Test
    fun testParseMonospaceText() {
        val src = "`Mono`"
        val result = FormattedText.parseAll(src)
        assertTrue(result.isSuccess)
        val text = result.getOrNull()!!
        assertTrue(text is Monospace)

        assertEquals(1, text.elements.children.size)
        assertEquals("Mono", (text.elements.children[0] as StringElement).value)
    }
}
