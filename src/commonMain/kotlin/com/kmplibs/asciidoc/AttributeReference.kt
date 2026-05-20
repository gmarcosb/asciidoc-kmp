package com.kmplibs.asciidoc

class AttributeReference(val name: String) : Element {
    override fun type(): ElementType = ElementType.InlineLiteral

    override fun equals(other: Any?): Boolean {
        if (other !is AttributeReference) return false
        return name == other.name
    }

    override fun clone(): Element {
        return AttributeReference(name)
    }
}
