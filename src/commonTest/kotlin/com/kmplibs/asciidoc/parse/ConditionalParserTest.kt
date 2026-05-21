package com.kmplibs.asciidoc.parse

import com.kmplibs.asciidoc.*
import com.kmplibs.asciidoc.parse.grammar.*
import io.github.mirrgieriana.xarpeg.Parser
import io.github.mirrgieriana.xarpeg.parseAll
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class ConditionalParserTest {

    private fun <T : Any> assertParsed(parser: Parser<T>, input: String, expected: T) {
        val result = parser.parseAll(input) { AsciidocParseContext(it) }
        assertTrue(result.isSuccess, "Failed to parse: $input\n${result.exceptionOrNull()}")
        val value = result.getOrThrow()
        assertEquals(expected, value)
    }

    @Test
    fun testInlineIfDef() {
        assertParsed(
            InlineIfDefParser,
            "ifdef::foo[bar]",
            InlineIfDef(listOf("foo"), ConditionalUnion.Any, Elements(mutableListOf(StringElement("bar"))))
        )
    }

    @Test
    fun testEndIfDef() {
        assertParsed(
            EndIfDefParser,
            "endif::[]",
            EndIf(emptyList(), ConditionalUnion.Any)
        )
    }
}
