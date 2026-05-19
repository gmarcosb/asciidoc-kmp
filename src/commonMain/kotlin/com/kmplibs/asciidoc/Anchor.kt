package com.kmplibs.asciidoc

class AnchorAttribute(
    val id: Elements,
    val label: Elements = Elements()
) : Attribute {
    override fun type(): ElementType = ElementType.Attribute

    override fun equals(other: Any?): Boolean {
        if (other !is AnchorAttribute) return false
        return id == other.id && label == other.label
    }

    override fun clone(): Element {
        return AnchorAttribute(id.clone(), label.clone())
    }
}

class Anchor(
    val id: Elements,
    val elements: Elements = Elements()
) : Element {
    override fun type(): ElementType = ElementType.Inline

    override fun equals(other: Any?): Boolean {
        if (other !is Anchor) return false
        return id == other.id && elements == other.elements
    }

    override fun clone(): Element {
        return Anchor(id.clone(), elements.clone())
    }
}
