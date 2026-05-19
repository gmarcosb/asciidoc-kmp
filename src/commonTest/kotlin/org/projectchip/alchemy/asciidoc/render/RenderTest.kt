package org.projectchip.alchemy.asciidoc.render

import io.github.mirrgieriana.xarpeg.parseAll
import org.projectchip.alchemy.asciidoc.parse.AsciidocParseContext
import org.projectchip.alchemy.asciidoc.parse.grammar.DocumentParser
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
