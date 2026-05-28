package com.kmplibs.asciidoc

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

    fun getString(key: String): String? {
        val attr = attributes.filterIsInstance<NamedAttribute>().find { it.name == key }
        if (attr != null) {
            val children = attr.value.children
            return children.joinToString("") { it.toString() }
        }
        return null
    }

    fun positionalAttributes(): List<PositionalAttribute> {
        return attributes.filterIsInstance<PositionalAttribute>()
    }
}
