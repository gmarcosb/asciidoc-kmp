package com.kmplibs.asciidoc

class Listing(
    val delimiter: Delimiter,
    val lineList: LineList = LineList(),
    val attributeList: AttributeList = AttributeList()
) : BlockElement {

    override fun type(): ElementType = ElementType.Block

    override fun equals(other: Any?): Boolean {
        if (other !is Listing) return false
        return delimiter == other.delimiter && lineList == other.lineList && attributeList == other.attributeList
    }

    override fun clone(): Element {
        return Listing(delimiter.copy(), lineList.clone(), attributeList.clone())
    }
}
