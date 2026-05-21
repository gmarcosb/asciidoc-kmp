package com.kmplibs.asciidoc.parse.grammar

import io.github.mirrgieriana.xarpeg.*
import io.github.mirrgieriana.xarpeg.parsers.*
import com.kmplibs.asciidoc.*
import com.kmplibs.asciidoc.parse.AsciidocParseContext

val SingleLineCommentDelimiter = (+Regex("//")).value

val SingleLineCommentContent = (+Regex("[^\\r\\n]*")).value

val SingleLineCommentParser = (SingleLineCommentDelimiter * !(+Regex("//")).value * SingleLineCommentContent * EndOfLine.lookAhead.optional).map { tuple ->
    // (String * !String * String * String?) -> !String drops from tuple, so it becomes Tuple3<String, String, String?>
    @Suppress("UNCHECKED_CAST")
    val t = tuple as Tuple3<String, String, *>
    SingleLineComment(t.b)
}

val MultiLineCommentForwardSlashes = ((+Regex("////")).value * (+Regex("/*")).value).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val t = tuple as Tuple2<String, String>
    t.a.length + t.b.length
}

val MultiLineCommentDelimiter = (MultiLineCommentForwardSlashes * AnySpaces).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val t = tuple as Tuple2<Int, String>
    Delimiter(DelimitedBlockType.MultiLineComment, t.a)
}

val MultiLineCommentStart = (MultiLineCommentDelimiter * EndOfLine).mapEx { ctx, res ->
    @Suppress("UNCHECKED_CAST")
    val tuple = res.value as Tuple2<Delimiter, *>
    val delimiter = tuple.a
    if (ctx is AsciidocParseContext) {
        ctx.pushDelimitedLevel(DelimitedBlockType.MultiLineComment, delimiter.length)
    }
    delimiter
}

val MultiLineCommentEnd = (MultiLineCommentDelimiter * EndOfLine.lookAhead.optional).mapEx { ctx, res ->
    @Suppress("UNCHECKED_CAST")
    val tuple = res.value as Tuple2<Delimiter, *>
    val delimiter = tuple.a
    if (ctx is AsciidocParseContext) {
        val previous = ctx.peekDelimitedLevel(DelimitedBlockType.MultiLineComment)
        if (previous == delimiter.length) {
            ctx.popDelimitedLevel(DelimitedBlockType.MultiLineComment)
            delimiter
        } else {
            null
        }
    } else {
        delimiter
    }
}

val MultiLineCommentLine = (!MultiLineCommentDelimiter * !EndOfFile * (+Regex("[^\\r\\n]*")).value * EndOfLine).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val t = tuple as Tuple2<String, *>
    t.a
}

val MultiLineCommentParser = (MultiLineCommentStart * MultiLineCommentLine.zeroOrMore * MultiLineCommentEnd).map { tuple ->
    @Suppress("UNCHECKED_CAST")
    val t = tuple as Tuple3<Delimiter, List<String>, Delimiter>
    MultiLineComment(t.a, LineList(t.b.toMutableList()))
}
