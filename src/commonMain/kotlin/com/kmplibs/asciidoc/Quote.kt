package com.kmplibs.asciidoc

class QuoteBlock(
    val delimiter: Delimiter,
    val elements: Elements = Elements(),
    val attributeList: AttributeList = AttributeList()
) : BlockElement {

    override fun type(): ElementType = ElementType.Block

    override fun equals(other: Any?): Boolean {
        if (other !is QuoteBlock) return false
        return delimiter == other.delimiter && elements == other.elements && attributeList == other.attributeList
    }

    override fun clone(): Element {
        return QuoteBlock(delimiter.copy(), elements.clone(), attributeList.clone())
    }
}
