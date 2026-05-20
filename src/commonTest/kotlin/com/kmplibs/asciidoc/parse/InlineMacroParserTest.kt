package com.kmplibs.asciidoc.parse

import io.github.mirrgieriana.xarpeg.*
import com.kmplibs.asciidoc.*
import com.kmplibs.asciidoc.parse.grammar.*
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class InlineMacroParserTest {

    @Test
    fun testParseAttributeReference() {
        val src = "This has an {attribute_name}.\n"
        val result = DocumentParser.parseAll(src) { AsciidocParseContext(it) }

        if (!result.isSuccess) {
            val ex = result.exceptionOrNull()
            if (ex is ParseException) {
                System.err.println(ex.formatMessage())
            } else {
                System.err.println(ex?.message)
            }
        }

        assertTrue(result.isSuccess, "Failed to parse: \${result.exceptionOrNull()?.message}")

        val doc = result.getOrNull()!!
        val children = doc.children().children
        assertEquals(1, children.size)

        val p = children[0] as Paragraph
        val inlines = p.elements.children
        val hasAttr = inlines.any { it is AttributeReference && it.name == "attribute_name" }
        assertTrue(hasAttr, "Did not find AttributeReference in inline elements")
    }
}
