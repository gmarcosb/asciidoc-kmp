package com.kmplibs.asciidoc.render

import com.kmplibs.asciidoc.*

fun elements(cxt: Target, prefix: String, vararg elementList: Element) {
    for (e in elementList) {
        when (e) {
            is EmptyLine -> {
                cxt.ensureNewLine()
                cxt.writeRune('\n')
            }
            is NewLine -> {
                cxt.writeRune('\n')
            }
            is Paragraph -> {
                renderParagraph(cxt, e)
            }
            is StringElement -> {
                val text = e.value
                if (text.startsWith("ifdef::") || text.startsWith("ifndef::") || text.startsWith("endif::[]")) {
                    cxt.ensureNewLine()
                }
                cxt.writeString(text)
            }
            is SpecialCharacter -> {
                cxt.writeString(e.character)
            }
            // More elements will be added iteratively
            else -> {
                throw Exception("unknown render element type: \${e::class.simpleName}")
            }
        }
    }
}

fun renderParagraph(cxt: Target, p: Paragraph) {
    if (p.admonition != AdmonitionType.None) {
        // Handle Admonition render if necessary
    }
    // Assume block attributes rendering would go here
    elements(cxt, "", *p.elements.children.toTypedArray())
    cxt.ensureNewLine()
}
