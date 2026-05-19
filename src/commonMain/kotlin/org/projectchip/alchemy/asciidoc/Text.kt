package org.projectchip.alchemy.asciidoc

data class StringElement(var value: String) : Element {
    override fun type(): ElementType = ElementType.InlineLiteral

    override fun clone(): Element {
        return StringElement(value)
    }
}

data class SpecialCharacter(val character: String) : Element {
    override fun type(): ElementType = ElementType.InlineLiteral

    override fun clone(): Element {
        return SpecialCharacter(character)
    }
}

class LineContinuation : Element {
    override fun type(): ElementType = ElementType.InlineLiteral

    override fun equals(other: Any?): Boolean {
        return other is LineContinuation
    }

    override fun hashCode() = this::class.hashCode()

    override fun clone(): Element {
        return LineContinuation()
    }
}

class LineBreak : Element {
    override fun type(): ElementType = ElementType.InlineLiteral

    override fun equals(other: Any?): Boolean {
        return other is LineBreak
    }

    override fun hashCode() = this::class.hashCode()

    override fun clone(): Element {
        return LineBreak()
    }
}

class NewLine : Element {
    override fun type(): ElementType = ElementType.InlineLiteral

    override fun equals(other: Any?): Boolean {
        return other is NewLine
    }

    override fun hashCode() = this::class.hashCode()

    override fun clone(): Element {
        return NewLine()
    }
}

data class EmptyLine(val value: String = "") : Element {
    override fun type(): ElementType = ElementType.InlineLiteral

    override fun clone(): Element {
        return EmptyLine(value)
    }
}

fun elementStringValue(el: Element): String {
    if (el is StringElement) {
        return el.value
    }
    return ""
}
