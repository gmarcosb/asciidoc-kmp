package com.kmplibs.asciidoc.render

import io.github.mirrgieriana.xarpeg.parseAll
import com.kmplibs.asciidoc.parse.AsciidocParseContext
import com.kmplibs.asciidoc.parse.grammar.DocumentParser
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class RenderTest {

    @Test
    fun testParseAndRenderSymmetry() {
        val src = "Block 1\n\nBlock 2\n"
        val parseResult = DocumentParser.parseAll(src) { AsciidocParseContext(it) }
        assertTrue(parseResult.isSuccess)
        val doc = parseResult.getOrNull()!!

        val renderer = Renderer()
        val out = renderer.process(doc)

        assertEquals(src, out)
    }
}
