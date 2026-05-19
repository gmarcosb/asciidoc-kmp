package org.projectchip.alchemy.asciidoc.parse.grammar

import io.github.mirrgieriana.xarpeg.*
import io.github.mirrgieriana.xarpeg.parsers.*
import org.projectchip.alchemy.asciidoc.*
import org.projectchip.alchemy.asciidoc.parse.AsciidocParseContext

val DocumentParser: Parser<Document> = (BlockElements.oneOrMore * -EndOfFile).mapEx { ctx, (blocks) ->
    val doc = (ctx as? AsciidocParseContext)?.document ?: Document()
    val elements = Elements()
    blocks.forEach { block -> elements.append(block) }
    doc.setChildren(elements)
    doc
}
