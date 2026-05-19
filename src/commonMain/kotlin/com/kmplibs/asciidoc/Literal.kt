package com.kmplibs.asciidoc

class LiteralBlock(
    val delimiter: Delimiter,
    val lineList: LineList = LineList(),
    val attributeList: AttributeList = AttributeList()
) : BlockElement {

    override fun type(): ElementType = ElementType.Block

    override fun equals(other: Any?): Boolean {
        if (other !is LiteralBlock) return false
        return delimiter == other.delimiter && lineList == other.lineList && attributeList == other.attributeList
    }

    override fun clone(): Element {
        return LiteralBlock(delimiter.copy(), lineList.clone(), attributeList.clone())
    }
}
