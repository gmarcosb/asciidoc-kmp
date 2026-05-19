package com.kmplibs.asciidoc

abstract class FormattedText(
    val elements: Elements = Elements()
) : Element {
    override fun type(): ElementType = ElementType.Inline

    override fun equals(other: Any?): Boolean {
        if (other !is FormattedText) return false
        if (this::class != other::class) return false
        return elements == other.elements
    }
}

class Bold(elements: Elements = Elements()) : FormattedText(elements) {
    override fun clone(): Element = Bold(elements.clone())
}

class DoubleBold(elements: Elements = Elements()) : FormattedText(elements) {
    override fun clone(): Element = DoubleBold(elements.clone())
}

class Italic(elements: Elements = Elements()) : FormattedText(elements) {
    override fun clone(): Element = Italic(elements.clone())
}

class DoubleItalic(elements: Elements = Elements()) : FormattedText(elements) {
    override fun clone(): Element = DoubleItalic(elements.clone())
}

class Monospace(elements: Elements = Elements()) : FormattedText(elements) {
    override fun clone(): Element = Monospace(elements.clone())
}

class DoubleMonospace(elements: Elements = Elements()) : FormattedText(elements) {
    override fun clone(): Element = DoubleMonospace(elements.clone())
}

class Superscript(elements: Elements = Elements()) : FormattedText(elements) {
    override fun clone(): Element = Superscript(elements.clone())
}

class Subscript(elements: Elements = Elements()) : FormattedText(elements) {
    override fun clone(): Element = Subscript(elements.clone())
}

class Marked(elements: Elements = Elements()) : FormattedText(elements) {
    override fun clone(): Element = Marked(elements.clone())
}

class DoubleMarked(elements: Elements = Elements()) : FormattedText(elements) {
    override fun clone(): Element = DoubleMarked(elements.clone())
}
