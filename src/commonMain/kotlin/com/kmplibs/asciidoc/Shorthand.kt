package com.kmplibs.asciidoc

class ShorthandStyle(val elements: Elements = Elements()) : Element {
    override fun type(): ElementType = ElementType.Unknown

    override fun equals(other: Any?): Boolean {
        if (other !is ShorthandStyle) return false
        return elements == other.elements
    }

    override fun clone(): Element {
        return ShorthandStyle(elements.clone())
    }
}

class ShorthandID(val elements: Elements = Elements()) : Element {
    override fun type(): ElementType = ElementType.Unknown

    override fun equals(other: Any?): Boolean {
        if (other !is ShorthandID) return false
        return elements == other.elements
    }

    override fun clone(): Element {
        return ShorthandID(elements.clone())
    }
}

class ShorthandRole(val elements: Elements = Elements()) : Element {
    override fun type(): ElementType = ElementType.Unknown

    override fun equals(other: Any?): Boolean {
        if (other !is ShorthandRole) return false
        return elements == other.elements
    }

    override fun clone(): Element {
        return ShorthandRole(elements.clone())
    }
}

class ShorthandOption(val elements: Elements = Elements()) : Element {
    override fun type(): ElementType = ElementType.Unknown

    override fun equals(other: Any?): Boolean {
        if (other !is ShorthandOption) return false
        return elements == other.elements
    }

    override fun clone(): Element {
        return ShorthandOption(elements.clone())
    }
}

class ShorthandAttribute(
    var style: ShorthandStyle? = null,
    var id: ShorthandID? = null,
    var roles: MutableList<ShorthandRole> = mutableListOf(),
    var options: MutableList<ShorthandOption> = mutableListOf()
) : Attribute {
    override fun type(): ElementType = ElementType.Attribute

    override fun equals(other: Any?): Boolean {
        if (other !is ShorthandAttribute) return false
        return style == other.style && id == other.id && roles == other.roles && options == other.options
    }

    override fun clone(): Element {
        val clonedRoles = roles.map { it.clone() as ShorthandRole }.toMutableList()
        val clonedOptions = options.map { it.clone() as ShorthandOption }.toMutableList()
        return ShorthandAttribute(
            style?.clone() as ShorthandStyle?,
            id?.clone() as ShorthandID?,
            clonedRoles,
            clonedOptions
        )
    }
}
