package com.kmplibs.asciidoc.parse

import io.github.mirrgieriana.xarpeg.*
import com.kmplibs.asciidoc.*
import com.kmplibs.asciidoc.parse.grammar.*
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class LinkParserTest {

    @Test
    fun testParseHTMLLink() {
        val src = "<https://example.com>"
        val result = DocumentParser.parseAll(src) { AsciidocParseContext(it) }
        assertTrue(result.isSuccess)

        val doc = result.getOrNull()!!
        val children = doc.children().children
        assertEquals(1, children.size)

        val p = children[0] as Paragraph
        val inlines = p.elements.children
        val link = inlines.first { it is Link } as Link
        assertEquals("https", link.url.scheme)
        assertEquals("://example.com", link.url.path)
    }

    @Test
    fun testParseExternalLink() {
        val src = "Visit https://example.com[Google]"
        val result = DocumentParser.parseAll(src) { AsciidocParseContext(it) }
        assertTrue(result.isSuccess)

        val doc = result.getOrNull()!!
        val children = doc.children().children
        assertEquals(1, children.size)

        val p = children[0] as Paragraph
        val inlines = p.elements.children
        val link = inlines.first { it is Link } as Link
        assertEquals("https", link.url.scheme)
        assertEquals("://example.com", link.url.path)
    }

    @Test
    fun testParseLinkMacro() {
        val src = "link:https://example.com[]"
        val result = DocumentParser.parseAll(src) { AsciidocParseContext(it) }
        assertTrue(result.isSuccess)

        val doc = result.getOrNull()!!
        val children = doc.children().children
        val p = children[0] as Paragraph
        val inlines = p.elements.children
        val linkMacro = inlines.first { it is LinkMacro } as LinkMacro
        assertEquals("", linkMacro.url.scheme)
        assertEquals("https://example.com", linkMacro.url.path)
    }
}
