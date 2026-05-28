package com.kmplibs.asciidoc.render

import com.kmplibs.asciidoc.Document
import com.kmplibs.asciidoc.Element

interface DocumentRenderer {
    fun render(document: Document): String
    fun renderElement(element: Element): String
}
