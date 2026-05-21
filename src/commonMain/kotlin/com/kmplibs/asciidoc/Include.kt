package com.kmplibs.asciidoc

class FileInclude(
    val path: String,
    val attributes: AttributeList = AttributeList()
) : BlockElement {
    override fun type(): ElementType = ElementType.Block

    override fun equals(other: Any?): Boolean {
        if (other !is FileInclude) return false
        return path == other.path && attributes == other.attributes
    }

    override fun clone(): Element {
        return FileInclude(path, attributes.clone())
    }
}
