package com.kmplibs.asciidoc.parse

import io.github.mirrgieriana.xarpeg.*
import com.kmplibs.asciidoc.*
import com.kmplibs.asciidoc.parse.grammar.*
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class SectionParserTest {

    @Test
    fun testParseSimpleSection() {
        val src = "== My Section Title\n\nParagraph text here\n"
        val result = DocumentParser.parseAll(src) { AsciidocParseContext(it) }

        if (!result.isSuccess) {
            val ex = result.exceptionOrNull()
            if (ex is ParseException) {
                System.err.println(ex.formatMessage())
            } else {
                System.err.println(ex?.message)
            }
        }
        assertTrue(result.isSuccess)

        val doc = result.getOrNull()!!
        val children = doc.children().children

        // 3 means Section -> EmptyLine -> Paragraph
        assertEquals(3, children.size)
    }
}
