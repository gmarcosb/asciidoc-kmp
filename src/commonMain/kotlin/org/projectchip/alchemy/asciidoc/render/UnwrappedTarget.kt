package org.projectchip.alchemy.asciidoc.render

class UnwrappedTarget : Target {
    private val out = StringBuilder()
    private var lastRune: Char = '\u0000'

    override fun writeString(s: String) {
        if (s.isNotEmpty()) {
            lastRune = s.last()
            out.append(s)
        }
    }

    override fun writeRune(r: Char) {
        out.append(r)
        lastRune = r
    }

    override fun ensureNewLine() {
        if (lastRune == '\n' || out.isEmpty()) {
            return
        }
        writeRune('\n')
    }

    override fun toString(): String {
        return out.toString()
    }

    override fun flushWrap() {}
    override fun enableWrap() {}
    override fun disableWrap() {}
    override fun startBlock() {}
    override fun endBlock() {}

    override fun subtarget(): Target {
        return UnwrappedTarget()
    }
}
