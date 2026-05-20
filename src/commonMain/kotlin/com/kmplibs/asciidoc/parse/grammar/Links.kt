package com.kmplibs.asciidoc.parse.grammar

import io.github.mirrgieriana.xarpeg.*
import io.github.mirrgieriana.xarpeg.parsers.*
import com.kmplibs.asciidoc.*

val URLScheme = (+Regex("https?|ftp|irc")).value

val FullURL = (URLScheme * +Regex("://") * (+Regex("[a-zA-Z0-9\\-._~:/?#@!$&'()*+,;=]+")).value).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val t = tuple as Tuple3<String, *, String>
    URL(t.a, "://" + t.c)
}

val HTMLLink = (!Regex("\\\\").toParser() * +Regex("<") * FullURL * +Regex(">")).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val t = tuple as Tuple3<*, URL, *>
    Link(t.b)
}

// Temporary stub for InlineAttributes until we fully parse attributes
val InlineAttributesStub = (+Regex("\\[[^\\]]*\\]")).value.map { AttributeList() }

// The original URL in LinkMacro can be anything up to attributes
val URLPath = (+Regex("[a-zA-Z0-9\\-._~:/?#@!$&'()*+,;=]+")).value.map { URL("", it) }

// Fix PrefixedLink priority and regex logic to consume 'link:'
val LinkMacroMarker = (+Regex("link::?")).value
val PrefixedLink = (!Regex("\\\\").toParser() * LinkMacroMarker * URLPath * InlineAttributesStub).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val t = tuple as Tuple3<*, URL, AttributeList>
    LinkMacro(t.b, t.c)
}

// Fix ExternalLink to ensure it does not intercept PrefixedLink due to URL pattern.
val ExternalLink = (!Regex("\\\\").toParser() * !LinkMacroMarker * FullURL * InlineAttributesStub.optional).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val t = tuple as Tuple2<URL, AttributeList?>
    Link(t.a, t.b ?: AttributeList())
}

val LinkParser = HTMLLink + PrefixedLink + ExternalLink
