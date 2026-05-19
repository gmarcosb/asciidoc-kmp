package com.kmplibs.asciidoc

data class LineList(val lines: MutableList<String> = mutableListOf()) {
    fun appendLine(e: String) {
        lines.add(e)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is LineList) return false
        if (lines.size != other.lines.size) return false
        for (i in lines.indices) {
            if (lines[i] != other.lines[i]) return false
        }
        return true
    }

    override fun hashCode(): Int = lines.hashCode()

    fun clone(): LineList {
        val cloned = mutableListOf<String>()
        cloned.addAll(lines)
        return LineList(cloned)
    }
}

interface HasLines : Element {
    fun lines(): List<String>
    fun appendLine(e: String)
    fun setLines(e: List<String>)
}
