package org.projectchip.alchemy.asciidoc.render

import org.projectchip.alchemy.asciidoc.Document

class Renderer {
    fun process(doc: Document): String {
        val renderContext = UnwrappedTarget()
        elements(renderContext, "", *doc.children().children.toTypedArray())
        renderContext.ensureNewLine()

        var output = renderContext.toString().trim()
        output = postProcess(output)
        return output
    }

    private fun postProcess(s: String): String {
        val regex = Regex("(?m)[ ]+\n")
        return regex.replace(s, "\n") + "\n"
    }
}
