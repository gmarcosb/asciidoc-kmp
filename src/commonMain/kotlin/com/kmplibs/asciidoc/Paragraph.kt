package com.kmplibs.asciidoc

enum class AdmonitionType {
    None, Note, Tip, Important, Caution, Warning;
}

class Admonition(
    val admonitionType: AdmonitionType,
    val attributeList: AttributeList = AttributeList()
) : BlockElement {

    override fun type(): ElementType = ElementType.Block

    override fun equals(other: Any?): Boolean {
        if (other !is Admonition) return false
        return admonitionType == other.admonitionType && attributeList == other.attributeList
    }

    override fun clone(): Element {
        return Admonition(admonitionType, attributeList.clone())
    }
}

class Paragraph(
    var admonition: AdmonitionType = AdmonitionType.None,
    val elements: Elements = Elements(),
    val attributeList: AttributeList = AttributeList()
) : BlockElement {

    override fun type(): ElementType = ElementType.Block

    override fun equals(other: Any?): Boolean {
        if (other !is Paragraph) return false
        return admonition == other.admonition && elements == other.elements && attributeList == other.attributeList
    }

    override fun clone(): Element {
        return Paragraph(admonition, elements.clone(), attributeList.clone())
    }
}
