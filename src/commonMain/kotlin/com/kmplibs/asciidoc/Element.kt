package com.kmplibs.asciidoc

enum class ElementType {
    Unknown, Document, Block, Inline, InlineLiteral, Attribute, Attributes
}

interface Element {
    fun type(): ElementType
    fun clone(): Element
}

interface DocumentElement : Element {
    fun document(): Document
}

interface Parent {
    fun children(): Elements
    fun setChildren(e: Elements)
}

interface ParentElement : DocumentElement, Parent

interface ElementList {
    fun append(vararg e: Element)
}

interface HasChild {
    fun child(): Element
}

interface HasParent {
    fun parent(): Element
    fun setParent(e: Element)
}

interface ChildElement : Element, HasParent
