package com.kmplibs.asciidoc.integration

import com.kmplibs.asciidoc.*
import kotlin.test.Test
import kotlin.test.Ignore

class TextTest {

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `line breaks`() {
        // Input: asciidoctor/text_test_line_breaks.adoc
        // Expected Go AST:
        // var textTestLineBreaks =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "This line is separated by a horizontal rule...",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.ThematicBreak{
        // 			AttributeList: nil,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "...from this line.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

}
