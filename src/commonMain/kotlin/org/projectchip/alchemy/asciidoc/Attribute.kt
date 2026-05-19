package org.projectchip.alchemy.asciidoc

interface Attribute : Element

class NamedAttribute(
    val name: String,
    val value: Elements
) : Attribute {
    override fun type(): ElementType = ElementType.Attribute

    override fun equals(other: Any?): Boolean {
        if (other !is NamedAttribute) return false
        return name == other.name && value == other.value
    }

    override fun clone(): Element {
        return NamedAttribute(name, value.clone())
    }
}

class PositionalAttribute(
    val value: Elements
) : Attribute {
    override fun type(): ElementType = ElementType.Attribute

    override fun equals(other: Any?): Boolean {
        if (other !is PositionalAttribute) return false
        return value == other.value
    }

    override fun clone(): Element {
        return PositionalAttribute(value.clone())
    }
}
