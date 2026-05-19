package com.kmplibs.asciidoc.parse

import io.github.mirrgieriana.xarpeg.DefaultParseContext
import com.kmplibs.asciidoc.Document

class AsciidocParseContext(src: String, val document: Document = Document()) : DefaultParseContext(src) {
    // Allows maintaining parser state, like tracking indent level or delimters
}
