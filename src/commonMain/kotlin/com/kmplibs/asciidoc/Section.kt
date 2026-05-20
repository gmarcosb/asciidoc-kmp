package com.kmplibs.asciidoc

class Section(
    val title: Elements,
    val level: Int,
    val attributeList: AttributeList = AttributeList(),
    val elements: Elements = Elements()
) : BlockElement, ParentElement, ChildElement {
    private var parentElement: Element? = null

    override fun document(): Document {
        var current: Element? = this
        while (current != null && current !is Document) {
            current = (current as? ChildElement)?.parent()
        }
        return current as? Document ?: throw IllegalStateException("Section has no document")
    }

    override fun children(): Elements = elements

    override fun setChildren(e: Elements) {
        elements.children.clear()
        elements.children.addAll(e.children)
    }

    override fun parent(): Element = parentElement ?: throw IllegalStateException("No parent set")

    override fun setParent(e: Element) {
        parentElement = e
    }

    override fun type(): ElementType = ElementType.Block

    override fun equals(other: Any?): Boolean {
        if (other !is Section) return false
        return level == other.level && title == other.title && attributeList == other.attributeList && elements == other.elements
    }

    override fun clone(): Element {
        return Section(title.clone(), level, attributeList.clone(), elements.clone())
    }
}
