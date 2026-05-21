package com.kmplibs.asciidoc.parse

import io.github.mirrgieriana.xarpeg.DefaultParseContext
import com.kmplibs.asciidoc.DelimitedBlockType
import com.kmplibs.asciidoc.Document

class AsciidocParseContext(src: String = "", val document: Document = Document()) : DefaultParseContext(src) {
    private val delimitedLevels = mutableMapOf<DelimitedBlockType, MutableList<Int>>()

    fun pushDelimitedLevel(type: DelimitedBlockType, level: Int) {
        delimitedLevels.getOrPut(type) { mutableListOf() }.add(level)
    }

    fun peekDelimitedLevel(type: DelimitedBlockType): Int {
        return delimitedLevels[type]?.lastOrNull() ?: 0
    }

    fun popDelimitedLevel(type: DelimitedBlockType): Int {
        return delimitedLevels[type]?.removeLastOrNull() ?: 0
    }
}
