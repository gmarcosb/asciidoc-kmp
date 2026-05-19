package org.projectchip.alchemy.asciidoc

class Document : ParentElement {
    private var children: Elements = Elements()
    private val attributes: MutableMap<String, String> = mutableMapOf()

    override fun type(): ElementType = ElementType.Document

    override fun equals(other: Any?): Boolean {
        if (other !is Document) return false
        return children == other.children && attributes == other.attributes
    }

    override fun clone(): Element {
        val doc = Document()
        doc.setChildren(children.clone())
        doc.attributes.putAll(attributes)
        return doc
    }

    override fun document(): Document = this

    override fun children(): Elements = children

    override fun setChildren(e: Elements) {
        children = e
    }

    fun getAttribute(name: String): String? = attributes[name]
    fun setAttribute(name: String, value: String) {
        attributes[name] = value
    }
}
