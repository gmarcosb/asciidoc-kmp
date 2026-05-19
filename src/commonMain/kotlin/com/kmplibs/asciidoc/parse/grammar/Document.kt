package com.kmplibs.asciidoc.parse.grammar

import io.github.mirrgieriana.xarpeg.*
import io.github.mirrgieriana.xarpeg.parsers.*
import com.kmplibs.asciidoc.*
import com.kmplibs.asciidoc.parse.AsciidocParseContext

val DocumentParser: Parser<Document> = (BlockElements.oneOrMore * -EndOfFile).mapEx { ctx, (blocks) ->
    val doc = (ctx as? AsciidocParseContext)?.document ?: Document()
    val elements = Elements()
    blocks.forEach { block -> elements.append(block) }
    doc.setChildren(elements)
    doc
}
