package org.projectchip.alchemy.asciidoc.render

interface Target {
    fun ensureNewLine()
    fun writeRune(r: Char)
    fun writeString(s: String)
    override fun toString(): String
    fun enableWrap()
    fun disableWrap()
    fun flushWrap()
    fun startBlock()
    fun endBlock()
    fun subtarget(): Target
}
