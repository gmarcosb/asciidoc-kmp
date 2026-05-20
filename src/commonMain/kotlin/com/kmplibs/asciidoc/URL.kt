package com.kmplibs.asciidoc

class URL(val scheme: String, val path: String) : Element {
    override fun type(): ElementType = ElementType.InlineLiteral

    override fun equals(other: Any?): Boolean {
        if (other !is URL) return false
        return scheme == other.scheme && path == other.path
    }

    override fun clone(): Element {
        return URL(scheme, path)
    }
}
