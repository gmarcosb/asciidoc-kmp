package com.kmplibs.asciidoc.parse

import com.kmplibs.asciidoc.*
import com.kmplibs.asciidoc.parse.grammar.*
import io.github.mirrgieriana.xarpeg.Parser
import io.github.mirrgieriana.xarpeg.parseAll
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class CommentParserTest {

    private fun <T : Any> assertParsed(parser: Parser<T>, input: String, expected: T) {
        val result = parser.parseAll(input) { AsciidocParseContext(it) }
        assertTrue(result.isSuccess, "Failed to parse: $input\n${result.exceptionOrNull()}")
        assertEquals(expected, result.getOrThrow())
    }

    @Test
    fun testSingleLineComment() {
        assertParsed(
            SingleLineCommentParser,
            "// A single line comment",
            SingleLineComment(" A single line comment")
        )
    }

    @Test
    fun testMultiLineComment() {
        assertParsed(
            MultiLineCommentParser,
            "////\nA multi-line\ncomment\n////",
            MultiLineComment(
                Delimiter(DelimitedBlockType.MultiLineComment, 4),
                LineList(mutableListOf("A multi-line", "comment"))
            )
        )
    }

    @Test
    fun testMultiLineCommentMoreSlashes() {
        assertParsed(
            MultiLineCommentParser,
            "//////\nA multi-line\ncomment\n//////",
            MultiLineComment(
                Delimiter(DelimitedBlockType.MultiLineComment, 6),
                LineList(mutableListOf("A multi-line", "comment"))
            )
        )
    }
}
