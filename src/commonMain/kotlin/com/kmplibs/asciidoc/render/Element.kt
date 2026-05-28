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
            is Section -> {
                val level = e.level + 1
                cxt.writeString("<h$level>")
                elements(cxt, prefix, *e.title.children.toTypedArray())
                cxt.writeString("</h$level>\n")
                elements(cxt, prefix, *e.children().children.toTypedArray())
            }
            is Elements -> {
                elements(cxt, prefix, *e.children.toTypedArray())
            }
            is StringElement -> {
                val text = e.value
                if (text.startsWith("ifdef::") || text.startsWith("ifndef::") || text.startsWith("endif::[]")) {
                    cxt.ensureNewLine()
                }
                cxt.writeString(text)
            }
            is Bold -> {
                cxt.writeString("<strong>")
                elements(cxt, prefix, *e.elements.children.toTypedArray())
                cxt.writeString("</strong>")
            }
            is Italic -> {
                cxt.writeString("<em>")
                elements(cxt, prefix, *e.elements.children.toTypedArray())
                cxt.writeString("</em>")
            }
            is Link -> {
                cxt.writeString("<a href=\"${e.url.path}\">${e.url.path}</a>")
            }
            is SpecialCharacter -> {
                cxt.writeString(e.character)
            }
            is UnorderedList -> {
                cxt.writeString("<ul>\n")
                elements(cxt, prefix, *e.elements.children.toTypedArray())
                cxt.writeString("</ul>\n")
            }
            is UnorderedListItem -> {
                cxt.writeString("<li>")
                elements(cxt, prefix, *e.elements.children.toTypedArray())
                cxt.writeString("</li>\n")
            }
            is Document -> {
                elements(cxt, prefix, *e.children().children.toTypedArray())
            }
            else -> {
                // Ignore unsupported items
            }
        }
    }
}

fun renderParagraph(cxt: Target, p: Paragraph) {
    if (p.admonition != AdmonitionType.None) {
        // Handle Admonition render if necessary
    }
    cxt.writeString("<div class=\"paragraph\">\n<p>")
    elements(cxt, "", *p.elements.children.toTypedArray())
    cxt.writeString("</p>\n</div>\n")
    cxt.ensureNewLine()
}
