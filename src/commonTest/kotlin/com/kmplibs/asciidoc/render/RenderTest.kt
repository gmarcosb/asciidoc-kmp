package com.kmplibs.asciidoc.render

import com.kmplibs.asciidoc.*
import com.kmplibs.asciidoc.parse.grammar.*
import com.kmplibs.asciidoc.parse.AsciidocParseContext
import io.github.mirrgieriana.xarpeg.parseAll
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class RenderTest {

    @Test
    fun testRendererEndToEnd() {
        val src = "= Document Title\n\nThis is a simple paragraph."
        val parseResult = DocumentParser.parseAll(src) { AsciidocParseContext(it) }
        assertTrue(parseResult.isSuccess, "Failed to parse document: ${parseResult.exceptionOrNull()}")
        val doc = parseResult.getOrThrow()

        val renderer = HtmlRenderer()
        val html = renderer.render(doc)

        assertTrue(html.contains("Document Title"), "HTML output did not contain section title")
        assertTrue(html.contains("This is a simple paragraph."), "HTML output did not contain the text")
    }
}
