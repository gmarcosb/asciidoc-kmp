package com.kmplibs.asciidoc.parse

import io.github.mirrgieriana.xarpeg.*
import com.kmplibs.asciidoc.*
import com.kmplibs.asciidoc.parse.grammar.*
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class DelimitedBlockParserTest {

    @Test
    fun testParseListingBlock() {
        val src = "----\nline 1\nline 2\n----\n"
        val result = DocumentParser.parseAll(src) { AsciidocParseContext(it) }
        assertTrue(result.isSuccess)

        val doc = result.getOrNull()!!
        val children = doc.children().children

        assertEquals(2, children.size)
        val block = children[0]
        assertTrue(block is Listing)
        assertEquals(DelimitedBlockType.Listing, block.delimiter.type)
        assertEquals(2, block.lineList.lines.size)
        assertEquals("line 1", block.lineList.lines[0])
        assertEquals("line 2", block.lineList.lines[1])
    }
}
