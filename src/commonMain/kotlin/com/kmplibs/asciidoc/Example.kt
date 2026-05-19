package com.kmplibs.asciidoc

class ExampleBlock(
    val delimiter: Delimiter,
    val elements: Elements = Elements(),
    val attributeList: AttributeList = AttributeList()
) : BlockElement {

    override fun type(): ElementType = ElementType.Block

    override fun equals(other: Any?): Boolean {
        if (other !is ExampleBlock) return false
        return delimiter == other.delimiter && elements == other.elements && attributeList == other.attributeList
    }

    override fun clone(): Element {
        return ExampleBlock(delimiter.copy(), elements.clone(), attributeList.clone())
    }
}
