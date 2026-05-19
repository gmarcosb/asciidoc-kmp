package com.kmplibs.asciidoc

enum class Checklist {
    Unknown, Unchecked, Checked
}

class UnorderedList(
    val elements: Elements = Elements(),
    val attributeList: AttributeList = AttributeList()
) : BlockElement {
    override fun type(): ElementType = ElementType.Block

    override fun equals(other: Any?): Boolean {
        if (other !is UnorderedList) return false
        return elements == other.elements && attributeList == other.attributeList
    }

    override fun clone(): Element {
        return UnorderedList(elements.clone(), attributeList.clone())
    }
}

class OrderedListItem(
    val indent: String,
    val marker: String,
    val elements: Elements = Elements(),
    val attributeList: AttributeList = AttributeList()
) : BlockElement {
    override fun type(): ElementType = ElementType.Block

    override fun equals(other: Any?): Boolean {
        if (other !is OrderedListItem) return false
        return marker == other.marker && elements == other.elements && attributeList == other.attributeList
    }

    override fun clone(): Element {
        return OrderedListItem(indent, marker, elements.clone(), attributeList.clone())
    }
}

class UnorderedListItem(
    val indent: String,
    val marker: String,
    val checklist: Checklist = Checklist.Unknown,
    val elements: Elements = Elements(),
    val attributeList: AttributeList = AttributeList()
) : BlockElement {
    override fun type(): ElementType = ElementType.Block

    override fun equals(other: Any?): Boolean {
        if (other !is UnorderedListItem) return false
        return marker == other.marker && checklist == other.checklist && elements == other.elements && attributeList == other.attributeList
    }

    override fun clone(): Element {
        return UnorderedListItem(indent, marker, checklist, elements.clone(), attributeList.clone())
    }
}

class DescriptionListItem(
    val marker: String,
    val term: Elements,
    val elements: Elements = Elements(),
    val attributeList: AttributeList = AttributeList()
) : BlockElement {
    override fun type(): ElementType = ElementType.Block

    override fun equals(other: Any?): Boolean {
        if (other !is DescriptionListItem) return false
        return marker == other.marker && term == other.term && elements == other.elements && attributeList == other.attributeList
    }

    override fun clone(): Element {
        return DescriptionListItem(marker, term.clone(), elements.clone(), attributeList.clone())
    }
}

class ListContinuation(
    val childElement: Element,
    val newLineCount: Int = 0
) : BlockElement, HasChild {
    override fun type(): ElementType = ElementType.Block

    override fun child(): Element = childElement

    override fun equals(other: Any?): Boolean {
        if (other !is ListContinuation) return false
        return childElement == other.childElement && newLineCount == other.newLineCount
    }

    override fun clone(): Element {
        return ListContinuation(childElement.clone(), newLineCount)
    }
}
