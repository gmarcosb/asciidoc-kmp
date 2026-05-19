package com.kmplibs.asciidoc

interface BlockElement : Element

class BlockAttributes(
    val attributeList: AttributeList = AttributeList()
) : Element {
    override fun type(): ElementType = ElementType.Attributes

    override fun equals(other: Any?): Boolean {
        if (other !is BlockAttributes) return false
        return attributeList == other.attributeList
    }

    override fun clone(): Element {
        return BlockAttributes(attributeList.clone())
    }
}
