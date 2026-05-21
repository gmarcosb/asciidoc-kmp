package com.kmplibs.asciidoc

enum class ConditionalOperator(val value: String) {
    None(""),
    Equal("=="),
    NotEqual("!="),
    LessThan("<"),
    LessThanOrEqual("<="),
    GreaterThan(">"),
    GreaterThanOrEqual(">=");

    override fun toString(): String = value
}

enum class ConditionalUnion {
    Any, All
}

enum class AttributeQuoteType {
    None, Single, Double
}

class InlineIfDef(
    val attributes: List<String>,
    val union: ConditionalUnion,
    val elements: Elements = Elements()
) : Element {

    override fun type(): ElementType = ElementType.InlineLiteral

    override fun equals(other: Any?): Boolean {
        if (other !is InlineIfDef) return false
        return attributes == other.attributes && union == other.union && elements == other.elements
    }

    override fun clone(): Element {
        return InlineIfDef(attributes.toList(), union, elements.clone())
    }
}

class InlineIfNDef(
    val attributes: List<String>,
    val union: ConditionalUnion,
    val elements: Elements = Elements()
) : Element {

    override fun type(): ElementType = ElementType.InlineLiteral

    override fun equals(other: Any?): Boolean {
        if (other !is InlineIfNDef) return false
        return attributes == other.attributes && union == other.union && elements == other.elements
    }

    override fun clone(): Element {
        return InlineIfNDef(attributes.toList(), union, elements.clone())
    }
}

class EndIf(
    val attributes: List<String>,
    val union: ConditionalUnion
) : BlockElement {

    override fun type(): ElementType = ElementType.Block

    override fun equals(other: Any?): Boolean {
        if (other !is EndIf) return false
        return attributes == other.attributes && union == other.union
    }

    override fun clone(): Element {
        return EndIf(attributes.toList(), union)
    }
}

class IfEvalValue(
    val quote: AttributeQuoteType,
    val value: Elements
) {
    override fun equals(other: Any?): Boolean {
        if (other !is IfEvalValue) return false
        return quote == other.quote && value == other.value
    }

    fun clone(): IfEvalValue {
        return IfEvalValue(quote, value.clone())
    }
}

class IfEval(
    val left: IfEvalValue,
    val operator: ConditionalOperator,
    val right: IfEvalValue
) : BlockElement {

    override fun type(): ElementType = ElementType.Block

    override fun equals(other: Any?): Boolean {
        if (other !is IfEval) return false
        return left == other.left && operator == other.operator && right == other.right
    }

    override fun clone(): Element {
        return IfEval(left.clone(), operator, right.clone())
    }
}

class IfDefBlock(
    val attributes: List<String>,
    val union: ConditionalUnion,
    val elements: Elements = Elements()
) : BlockElement {

    override fun type(): ElementType = ElementType.Block

    override fun equals(other: Any?): Boolean {
        if (other !is IfDefBlock) return false
        return attributes == other.attributes && union == other.union && elements == other.elements
    }

    override fun clone(): Element {
        return IfDefBlock(attributes.toList(), union, elements.clone())
    }
}

class IfNDefBlock(
    val attributes: List<String>,
    val union: ConditionalUnion,
    val elements: Elements = Elements()
) : BlockElement {

    override fun type(): ElementType = ElementType.Block

    override fun equals(other: Any?): Boolean {
        if (other !is IfNDefBlock) return false
        return attributes == other.attributes && union == other.union && elements == other.elements
    }

    override fun clone(): Element {
        return IfNDefBlock(attributes.toList(), union, elements.clone())
    }
}

class IfEvalBlock(
    val left: IfEvalValue,
    val operator: ConditionalOperator,
    val right: IfEvalValue,
    val elements: Elements = Elements()
) : BlockElement {

    override fun type(): ElementType = ElementType.Block

    override fun equals(other: Any?): Boolean {
        if (other !is IfEvalBlock) return false
        return left == other.left && operator == other.operator && right == other.right && elements == other.elements
    }

    override fun clone(): Element {
        return IfEvalBlock(left.clone(), operator, right.clone(), elements.clone())
    }
}
