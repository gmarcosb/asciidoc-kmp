package com.kmplibs.asciidoc

class Link(
    val url: URL,
    val attributeList: AttributeList = AttributeList()
) : Element {
    override fun type(): ElementType = ElementType.Inline

    override fun equals(other: Any?): Boolean {
        if (other !is Link) return false
        return url == other.url && attributeList == other.attributeList
    }

    override fun clone(): Element {
        return Link(url.clone() as URL, attributeList.clone())
    }
}

class LinkMacro(
    val url: URL,
    val attributeList: AttributeList = AttributeList()
) : Element {
    override fun type(): ElementType = ElementType.Inline

    override fun equals(other: Any?): Boolean {
        if (other !is LinkMacro) return false
        return url == other.url && attributeList == other.attributeList
    }

    override fun clone(): Element {
        return LinkMacro(url.clone() as URL, attributeList.clone())
    }
}
