package com.kmplibs.asciidoc

enum class DelimitedBlockType {
    None, Comment, MultiLineComment, Example, Fenced, Listing, Literal, Open, Sidebar, Stem, Table, Quote
}

data class Delimiter(
    val type: DelimitedBlockType,
    val length: Int
)

class FencedDelimiter(
    val delimiter: Delimiter,
    val language: Elements = Elements()
) {
    override fun equals(other: Any?): Boolean {
        if (other !is FencedDelimiter) return false
        return delimiter == other.delimiter && language == other.language
    }

    override fun hashCode(): Int {
        var result = delimiter.hashCode()
        result = 31 * result + language.hashCode()
        return result
    }
}

class FencedBlock(
    val delimiter: FencedDelimiter,
    val elements: Elements = Elements(),
    val attributeList: AttributeList = AttributeList()
) : BlockElement {
    override fun type(): ElementType = ElementType.Block

    override fun equals(other: Any?): Boolean {
        if (other !is FencedBlock) return false
        return delimiter == other.delimiter && elements == other.elements && attributeList == other.attributeList
    }

    override fun clone(): Element {
        return FencedBlock(FencedDelimiter(delimiter.delimiter.copy(), delimiter.language.clone()), elements.clone(), attributeList.clone())
    }
}
