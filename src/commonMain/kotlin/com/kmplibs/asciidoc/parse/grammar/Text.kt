package com.kmplibs.asciidoc.parse.grammar

import io.github.mirrgieriana.xarpeg.*
import io.github.mirrgieriana.xarpeg.parsers.*
import com.kmplibs.asciidoc.*

val AnySpaces = (+Regex("[ \t]*")).value

val NewLineParser = (+Regex("\r\n|\n")).value.map { NewLine() }

val EndOfFile = endOfInput

// Match any end of line, including EOF
val EndOfLine = (+Regex("\r\n|\n")).value.map { it } + endOfInput.map { "" }

val AlphaNumeric = (+Regex("[\\p{L}\\p{N}]+")).value

val CharacterClassInline = (+Regex("[^\r\n]")).value

val SingleSpace = (+Regex("[ \t]")).value

val Punctuation = (+Regex("[,;.?)/:!=\"'@\\-\\[\\]]|\\((?!\\()")).value.map { StringElement(it) }

// Improved NakedInlineText to ensure it doesn't fail right before a newline or other element boundaries.
// Using a simpler fallback character-by-character approach to build continuous text strings.
val NakedInlineText = (+Regex("(?:(?![a-z]+://)(?!(?:https?|ftp|irc)://)(?![a-zA-Z0-9_]+@)(?![a-zA-Z0-9_]+://)(?![A-Za-z]+://)[A-Za-z0-9 ])+")).value.map { StringElement(it) }

val SpecialCharacterParser = (+Regex("[<>&]")).value.map { SpecialCharacter(it) }
