package com.kmplibs.asciidoc.parse

import com.kmplibs.asciidoc.*
import com.kmplibs.asciidoc.parse.grammar.*
import io.github.mirrgieriana.xarpeg.Parser
import io.github.mirrgieriana.xarpeg.parseAll
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class SidebarParserTest {

    private fun <T : Any> assertParsed(parser: Parser<T>, input: String, expected: T) {
        val result = parser.parseAll(input) { AsciidocParseContext(it) }
        assertTrue(result.isSuccess, "Failed to parse: $input\n${result.exceptionOrNull()}")
        val value = result.getOrThrow()
        assertEquals(expected, value)
    }

    @Test
    fun testSidebarBlock() {
        assertParsed(
            SidebarBlockParser,
            "****\nA sidebar block\n****",
            SidebarBlock(
                Delimiter(DelimitedBlockType.Sidebar, 4),
                Elements(
                    mutableListOf(
                        Paragraph(
                            AdmonitionType.None,
                            Elements(mutableListOf(StringElement("A sidebar block")))
                        )
                    )
                )
            )
        )
    }
}
