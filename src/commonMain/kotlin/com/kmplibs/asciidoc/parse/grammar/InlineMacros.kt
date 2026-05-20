package com.kmplibs.asciidoc.parse.grammar

import io.github.mirrgieriana.xarpeg.*
import io.github.mirrgieriana.xarpeg.parsers.*
import com.kmplibs.asciidoc.*

val AttributeEntryName = (+Regex("[A-Za-z0-9_][A-Za-z0-9_-]*")).value

val AttributeReferenceValue = (!Regex("\\\\").toParser() * (+Regex("\\{")).value * AttributeEntryName * (+Regex("\\}")).value).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val t = tuple as Tuple3<String, String, String>
    AttributeReference(t.b)
}

val InlineMacroParser: Parser<Element> = AttributeReferenceValue.map { it as Element }
