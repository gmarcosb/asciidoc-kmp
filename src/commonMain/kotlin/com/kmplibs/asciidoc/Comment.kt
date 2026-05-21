package com.kmplibs.asciidoc

class SingleLineComment(
    val value: String
) : BlockElement {

    override fun type(): ElementType = ElementType.Block

    override fun equals(other: Any?): Boolean {
        if (other !is SingleLineComment) return false
        return value == other.value
    }

    override fun clone(): Element {
        return SingleLineComment(value)
    }
}

class MultiLineComment(
    val delimiter: Delimiter,
    val lineList: LineList = LineList()
) : BlockElement {

    override fun type(): ElementType = ElementType.Block

    override fun equals(other: Any?): Boolean {
        if (other !is MultiLineComment) return false
        return delimiter == other.delimiter && lineList == other.lineList
    }

    override fun clone(): Element {
        return MultiLineComment(delimiter.copy(), lineList.clone())
    }
}
