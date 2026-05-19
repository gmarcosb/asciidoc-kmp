package com.kmplibs.asciidoc

class StemBlock(
    val delimiter: Delimiter,
    val lineList: LineList = LineList(),
    val attributeList: AttributeList = AttributeList()
) : BlockElement {

    override fun type(): ElementType = ElementType.Block

    override fun equals(other: Any?): Boolean {
        if (other !is StemBlock) return false
        return delimiter == other.delimiter && lineList == other.lineList && attributeList == other.attributeList
    }

    override fun clone(): Element {
        return StemBlock(delimiter.copy(), lineList.clone(), attributeList.clone())
    }
}
