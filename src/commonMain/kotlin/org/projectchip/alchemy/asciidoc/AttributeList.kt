package org.projectchip.alchemy.asciidoc

class AttributeList : ElementList {
    val attributes: MutableList<Element> = mutableListOf()

    override fun append(vararg e: Element) {
        attributes.addAll(e)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AttributeList) return false
        if (attributes.size != other.attributes.size) return false
        for (i in attributes.indices) {
            if (attributes[i] != other.attributes[i]) return false
        }
        return true
    }

    override fun hashCode(): Int = attributes.hashCode()

    fun clone(): AttributeList {
        val cloned = AttributeList()
        for (a in attributes) {
            cloned.append(a.clone())
        }
        return cloned
    }
}
