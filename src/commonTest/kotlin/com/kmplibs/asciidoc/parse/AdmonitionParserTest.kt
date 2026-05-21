package com.kmplibs.asciidoc.parse

import com.kmplibs.asciidoc.*
import com.kmplibs.asciidoc.parse.grammar.*
import io.github.mirrgieriana.xarpeg.Parser
import io.github.mirrgieriana.xarpeg.parseAll
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class AdmonitionParserTest {

    private fun <T : Any> assertParsed(parser: Parser<T>, input: String, expected: T) {
        val result = parser.parseAll(input) { AsciidocParseContext(it) }
        assertTrue(result.isSuccess, "Failed to parse: $input\n${result.exceptionOrNull()}")
        val value = result.getOrThrow()

        assertEquals(expected, value)
    }

    @Test
    fun testAdmonitionParagraph() {
        assertParsed(
            AdmonitionParagraphParser,
            "NOTE: This is a note.",
            Paragraph(
                AdmonitionType.Note,
                Elements(mutableListOf(StringElement("This is a note"), StringElement(".")))
            )
        )
    }

    @Test
    fun testWarningParagraph() {
        assertParsed(
            AdmonitionParagraphParser,
            "WARNING: This is a warning.",
            Paragraph(
                AdmonitionType.Warning,
                Elements(mutableListOf(StringElement("This is a warning"), StringElement(".")))
            )
        )
    }
}
