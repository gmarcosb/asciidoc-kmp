package com.kmplibs.asciidoc.render

import com.kmplibs.asciidoc.*

class HtmlRenderer : DocumentRenderer {

    override fun render(document: Document): String {
        val renderContext = UnwrappedTarget()
        elements(renderContext, "", document)
        return renderContext.toString().trim()
    }

    override fun renderElement(element: Element): String {
        val renderContext = UnwrappedTarget()
        elements(renderContext, "", element)
        return renderContext.toString()
    }
}
