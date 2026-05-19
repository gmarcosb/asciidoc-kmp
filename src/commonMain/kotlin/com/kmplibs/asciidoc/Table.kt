package com.kmplibs.asciidoc

enum class TableCellHorizontalAlign {
    Left, Right, Center
}

enum class TableCellVerticalAlign {
    Top, Bottom, Middle
}

enum class TableCellStyle {
    Default, AsciiDoc, Emphasis, Header, Literal, Monospace, Strong
}

data class TableCellSpan(val column: Int? = null, val row: Int? = null)

data class TableCellFormat(
    var multiplier: Int? = null,
    var span: TableCellSpan = TableCellSpan(),
    var horizontalAlign: TableCellHorizontalAlign? = null,
    var verticalAlign: TableCellVerticalAlign? = null,
    var style: TableCellStyle? = null
) {
    fun clone(): TableCellFormat = this.copy(span = span.copy())
}

class TableCell(
    var format: TableCellFormat = TableCellFormat(),
    var parent: TableRow? = null,
    val elements: Elements = Elements(),
    var blank: Boolean = false
) : BlockElement {

    override fun type(): ElementType = ElementType.Block

    override fun equals(other: Any?): Boolean {
        if (other !is TableCell) return false
        return format == other.format && elements == other.elements && blank == other.blank
    }

    override fun clone(): Element {
        return TableCell(format.clone(), parent, elements.clone(), blank)
    }
}

class TableRow(
    var parent: Table? = null,
    val elements: Elements = Elements()
) : BlockElement {

    override fun type(): ElementType = ElementType.Block

    override fun equals(other: Any?): Boolean {
        if (other !is TableRow) return false
        return elements == other.elements
    }

    override fun clone(): Element {
        val newRow = TableRow(parent = parent, elements = Elements())
        for (e in elements.children) {
            val clonedChild = e.clone()
            if (clonedChild is TableCell) {
                clonedChild.parent = newRow
            }
            newRow.elements.append(clonedChild)
        }
        return newRow
    }
}

class Table(
    val attributeList: AttributeList = AttributeList(),
    var columnCount: Int = 0,
    val elements: Elements = Elements()
) : BlockElement {

    override fun type(): ElementType = ElementType.Block

    override fun equals(other: Any?): Boolean {
        if (other !is Table) return false
        return columnCount == other.columnCount && attributeList == other.attributeList && elements == other.elements
    }

    override fun clone(): Element {
        val newTable = Table(attributeList.clone(), columnCount, Elements())
        for (e in elements.children) {
            val clonedChild = e.clone()
            if (clonedChild is TableRow) {
                clonedChild.parent = newTable
            }
            newTable.elements.append(clonedChild)
        }
        return newTable
    }
}
