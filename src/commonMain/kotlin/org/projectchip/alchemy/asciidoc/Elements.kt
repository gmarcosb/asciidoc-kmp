package org.projectchip.alchemy.asciidoc

data class Elements(val children: MutableList<Element> = mutableListOf()) {
    fun append(vararg e: Element) {
        children.addAll(e)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Elements) return false
        if (children.size != other.children.size) return false
        for (i in children.indices) {
            if (children[i] != other.children[i]) return false
        }
        return true
    }

    override fun hashCode(): Int = children.hashCode()

    fun clone(): Elements {
        val cloned = mutableListOf<Element>()
        for (e in children) {
            cloned.add(e.clone())
        }
        return Elements(cloned)
    }
}
