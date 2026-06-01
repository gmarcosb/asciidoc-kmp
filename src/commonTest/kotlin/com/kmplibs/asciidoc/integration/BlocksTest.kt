package com.kmplibs.asciidoc.integration

import com.kmplibs.asciidoc.*
import kotlin.test.Test
import kotlin.test.Ignore

class BlocksTest {

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `horizontal rule between blocks`() {
        // Input: asciidoctor/blocks_test_horizontal_rule_between_blocks.adoc
        // Expected Go AST:
        // var blocksTestHorizontalRuleBetweenBlocks =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.ThematicBreak{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: nil,
        // 					ID:    nil,
        // 					Roles: []*asciidoc.ShorthandRole{
        // 						&asciidoc.ShorthandRole{
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "fancy",
        // 								},
        // 							},
        // 						},
        // 					},
        // 					Options: nil,
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `line comment between paragraphs offset by blank lines`() {
        // Input: asciidoctor/blocks_test_line_comment_between_paragraphs_offset_by_blank_lines.adoc
        // Expected Go AST:
        // var blocksTestLineCommentBetweenParagraphsOffsetByBlankLines =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "first paragraph",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.SingleLineComment{
        // 			Value: " line comment",
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "second paragraph",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `adjacent line comment between paragraphs`() {
        // Input: asciidoctor/blocks_test_adjacent_line_comment_between_paragraphs.adoc
        // Expected Go AST:
        // var blocksTestAdjacentLineCommentBetweenParagraphs =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "first line",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.SingleLineComment{
        // 			Value: " line comment",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "second line",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `comment block between paragraphs offset by blank lines`() {
        // Input: asciidoctor/blocks_test_comment_block_between_paragraphs_offset_by_blank_lines.adoc
        // Expected Go AST:
        // var blocksTestCommentBlockBetweenParagraphsOffsetByBlankLines =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "first paragraph",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.MultiLineComment{
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   2,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"block comment",
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "second paragraph",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `comment block between paragraphs offset by blank lines inside delimited block`() {
        // Input: asciidoctor/blocks_test_comment_block_between_paragraphs_offset_by_blank_lines_inside_delimited_block.adoc
        // Expected Go AST:
        // var blocksTestCommentBlockBetweenParagraphsOffsetByBlankLinesInsideDelimitedBlock =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.ExampleBlock{
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   3,
        // 				Length: 4,
        // 			},
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "first paragraph",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.MultiLineComment{
        // 					Delimiter: asciidoc.Delimiter{
        // 						Type:   2,
        // 						Length: 4,
        // 					},
        // 					LineList: asciidoc.LineList{
        // 						"block comment",
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "second paragraph",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `adjacent comment block between paragraphs`() {
        // Input: asciidoctor/blocks_test_adjacent_comment_block_between_paragraphs.adoc
        // Expected Go AST:
        // var blocksTestAdjacentCommentBlockBetweenParagraphs =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "first paragraph",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.MultiLineComment{
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   2,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"block comment",
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: "second paragraph",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `can convert with block comment at end of document with trailing newlines`() {
        // Input: asciidoctor/blocks_test_can_convert_with_block_comment_at_end_of_document_with_trailing_newlines.adoc
        // Expected Go AST:
        // var blocksTestCanConvertWithBlockCommentAtEndOfDocumentWithTrailingNewlines =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "paragraph",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.MultiLineComment{
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   2,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"block comment",
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `trailing newlines after block comment at end of document does not create paragraph`() {
        // Input: asciidoctor/blocks_test_trailing_newlines_after_block_comment_at_end_of_document_does_not_create_paragraph.adoc
        // Expected Go AST:
        // var blocksTestTrailingNewlinesAfterBlockCommentAtEndOfDocumentDoesNotCreateParagraph =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "paragraph",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.MultiLineComment{
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   2,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"block comment",
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `line starting with three slashes should not be line comment`() {
        // Input: asciidoctor/blocks_test_line_starting_with_three_slashes_should_not_be_line_comment.adoc
        // Expected Go AST:
        // var blocksTestLineStartingWithThreeSlashesShouldNotBeLineComment =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "sample title",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements:   asciidoc.Elements{},
        // 			Admonition: 0,
        // 		},
        // 		&asciidoc.MultiLineComment{
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   2,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"ifdef::asciidoctor[////]",
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: "line should be shown",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `preprocessor directives should not be processed within comment block`() {
        // Input: asciidoctor/blocks_test_preprocessor_directives_should_not_be_processed_within_comment_block.adoc
        // Expected Go AST:
        // var blocksTestPreprocessorDirectivesShouldNotBeProcessedWithinCommentBlock =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "dummy line",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.MultiLineComment{
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   2,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"ifdef::asciidoctor[////]",
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "line should be shown",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should warn if unterminated comment block is detected in body`() {
        // Input: asciidoctor/blocks_test_should_warn_if_unterminated_comment_block_is_detected_in_body.adoc
        // Expected Go AST:
        // var blocksTestShouldWarnIfUnterminatedCommentBlockIsDetectedInBody =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "before comment block",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "////",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "content that has been disabled",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "supposed to be after comment block, except it got swallowed by block comment",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should warn if unterminated comment block is detected inside another block`() {
        // Input: asciidoctor/blocks_test_should_warn_if_unterminated_comment_block_is_detected_inside_another_block.adoc
        // Expected Go AST:
        // var blocksTestShouldWarnIfUnterminatedCommentBlockIsDetectedInsideAnotherBlock =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "before sidebar block",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.SidebarBlock{
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   8,
        // 				Length: 4,
        // 			},
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "////",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "content that has been disabled",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "supposed to be after sidebar block, except it got swallowed by block comment",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `preprocessor directives should not be processed within comment open block`() {
        // Input: asciidoctor/blocks_test_preprocessor_directives_should_not_be_processed_within_comment_open_block.adoc
        // Expected Go AST:
        // var blocksTestPreprocessorDirectivesShouldNotBeProcessedWithinCommentOpenBlock =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.OpenBlock{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "comment",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   7,
        // 				Length: 2,
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "first line of comment",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "ifdef::asciidoctor[--]",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "line should not be shown",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `preprocessor directives should not be processed on subsequent lines of a comment paragraph`() {
        // Input: asciidoctor/blocks_test_preprocessor_directives_should_not_be_processed_on_subsequent_lines_of_a_comment_paragraph.adoc
        // Expected Go AST:
        // var blocksTestPreprocessorDirectivesShouldNotBeProcessedOnSubsequentLinesOfACommentParagraph =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "comment",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "first line of content",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "ifdef::asciidoctor[////]",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 0,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "this line should be shown",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `comment style on open block should only skip block`() {
        // Input: asciidoctor/blocks_test_comment_style_on_open_block_should_only_skip_block.adoc
        // Expected Go AST:
        // var blocksTestCommentStyleOnOpenBlockShouldOnlySkipBlock =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.OpenBlock{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "comment",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   7,
        // 				Length: 2,
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "skip",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "this block",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "not this text",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `comment style on paragraph should only skip paragraph`() {
        // Input: asciidoctor/blocks_test_comment_style_on_paragraph_should_only_skip_paragraph.adoc
        // Expected Go AST:
        // var blocksTestCommentStyleOnParagraphShouldOnlySkipParagraph =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "comment",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "skip",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "this paragraph",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 0,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "not this text",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `comment style on paragraph should not cause adjacent block to be skipped`() {
        // Input: asciidoctor/blocks_test_comment_style_on_paragraph_should_not_cause_adjacent_block_to_be_skipped.adoc
        // Expected Go AST:
        // var blocksTestCommentStyleOnParagraphShouldNotCauseAdjacentBlockToBeSkipped =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "comment",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "skip",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "this paragraph",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 0,
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "example",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "not this text",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not drop content that follows skipped content inside a delimited block`() {
        // Input: asciidoctor/blocks_test_should_not_drop_content_that_follows_skipped_content_inside_a_delimited_block.adoc
        // Expected Go AST:
        // var blocksTestShouldNotDropContentThatFollowsSkippedContentInsideADelimitedBlock =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.ExampleBlock{
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   3,
        // 				Length: 4,
        // 			},
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "paragraph",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.Paragraph{
        // 					AttributeList: asciidoc.AttributeList{
        // 						&asciidoc.ShorthandAttribute{
        // 							Style: &asciidoc.ShorthandStyle{
        // 								Elements: asciidoc.Elements{
        // 									&asciidoc.String{
        // 										Value: "comment",
        // 									},
        // 								},
        // 							},
        // 							ID: &asciidoc.ShorthandID{
        // 								Elements: asciidoc.Elements{
        // 									&asciidoc.String{
        // 										Value: "idname",
        // 									},
        // 								},
        // 							},
        // 							Roles:   nil,
        // 							Options: nil,
        // 						},
        // 					},
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "skip",
        // 						},
        // 						&asciidoc.NewLine{},
        // 					},
        // 					Admonition: 0,
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "paragraph",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should parse sidebar block`() {
        // Input: asciidoctor/blocks_test_should_parse_sidebar_block.adoc
        // Expected Go AST:
        // var blocksTestShouldParseSidebarBlock =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Section{
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.SidebarBlock{
        // 					Delimiter: asciidoc.Delimiter{
        // 						Type:   8,
        // 						Length: 4,
        // 					},
        // 					AttributeList: asciidoc.AttributeList{
        // 						&asciidoc.TitleAttribute{
        // 							Val: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Sidebar",
        // 								},
        // 							},
        // 						},
        // 					},
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Content goes here",
        // 						},
        // 						&asciidoc.NewLine{},
        // 					},
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Section",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `quote block with no attribution`() {
        // Input: asciidoctor/blocks_test_quote_block_with_no_attribution.adoc
        // Expected Go AST:
        // var blocksTestQuoteBlockWithNoAttribution =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.QuoteBlock{
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   11,
        // 				Length: 4,
        // 			},
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "A famous quote.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `quote block with attribution`() {
        // Input: asciidoctor/blocks_test_quote_block_with_attribution.adoc
        // Expected Go AST:
        // var blocksTestQuoteBlockWithAttribution =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.QuoteBlock{
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   11,
        // 				Length: 4,
        // 			},
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "quote",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      1,
        // 					ImpliedName: "",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Famous Person",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      2,
        // 					ImpliedName: "",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Famous Book (1999)",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "A famous quote.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `quote block with attribute and id and role shorthand`() {
        // Input: asciidoctor/blocks_test_quote_block_with_attribute_and_id_and_role_shorthand.adoc
        // Expected Go AST:
        // var blocksTestQuoteBlockWithAttributeAndIdAndRoleShorthand =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.QuoteBlock{
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   11,
        // 				Length: 4,
        // 			},
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "quote",
        // 							},
        // 						},
        // 					},
        // 					ID: &asciidoc.ShorthandID{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "justice-to-all",
        // 							},
        // 						},
        // 					},
        // 					Roles: []*asciidoc.ShorthandRole{
        // 						&asciidoc.ShorthandRole{
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "solidarity",
        // 								},
        // 							},
        // 						},
        // 					},
        // 					Options: nil,
        // 				},
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      1,
        // 					ImpliedName: "",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Martin Luther King",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      2,
        // 					ImpliedName: "",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Jr.",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Injustice anywhere is a threat to justice everywhere.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `setting ID using style shorthand should not reset block style`() {
        // Input: asciidoctor/blocks_test_setting_id_using_style_shorthand_should_not_reset_block_style.adoc
        // Expected Go AST:
        // var blocksTestSettingIdUsingStyleShorthandShouldNotResetBlockStyle =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.QuoteBlock{
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   11,
        // 				Length: 4,
        // 			},
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "quote",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      1,
        // 					ImpliedName: "",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "#justice-to-all.solidarity",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      2,
        // 					ImpliedName: "",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Martin Luther King",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      3,
        // 					ImpliedName: "",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Jr.",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Injustice anywhere is a threat to justice everywhere.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `quote block with complex content`() {
        // Input: asciidoctor/blocks_test_quote_block_with_complex_content.adoc
        // Expected Go AST:
        // var blocksTestQuoteBlockWithComplexContent =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.QuoteBlock{
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   11,
        // 				Length: 4,
        // 			},
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "A famous quote.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.Paragraph{
        // 					AttributeList: nil,
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.Italic{
        // 							AttributeList: nil,
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "That",
        // 								},
        // 							},
        // 						},
        // 						&asciidoc.String{
        // 							Value: " was inspiring.",
        // 						},
        // 						&asciidoc.NewLine{},
        // 					},
        // 					Admonition: 1,
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `quote block with attribution converted to DocBook`() {
        // Input: asciidoctor/blocks_test_quote_block_with_attribution_converted_to_doc_book.adoc
        // Expected Go AST:
        // var blocksTestQuoteBlockWithAttributionConvertedToDocBook =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.QuoteBlock{
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   11,
        // 				Length: 4,
        // 			},
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "quote",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      1,
        // 					ImpliedName: "",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Famous Person",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      2,
        // 					ImpliedName: "",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Famous Book (1999)",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "A famous quote.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `epigraph quote block with attribution converted to DocBook`() {
        // Input: asciidoctor/blocks_test_epigraph_quote_block_with_attribution_converted_to_doc_book.adoc
        // Expected Go AST:
        // var blocksTestEpigraphQuoteBlockWithAttributionConvertedToDocBook =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.QuoteBlock{
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   11,
        // 				Length: 4,
        // 			},
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: nil,
        // 					ID:    nil,
        // 					Roles: []*asciidoc.ShorthandRole{
        // 						&asciidoc.ShorthandRole{
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "epigraph",
        // 								},
        // 							},
        // 						},
        // 					},
        // 					Options: nil,
        // 				},
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      1,
        // 					ImpliedName: "",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Famous Person",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      2,
        // 					ImpliedName: "",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Famous Book (1999)",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "A famous quote.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `markdown-style quote block with single paragraph and no attribution`() {
        // Input: asciidoctor/blocks_test_markdown_style_quote_block_with_single_paragraph_and_no_attribution.adoc
        // Expected Go AST:
        // var blocksTestMarkdownStyleQuoteBlockWithSingleParagraphAndNoAttribution =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "> A famous quote.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "> Some more inspiring words.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `lazy markdown-style quote block with single paragraph and no attribution`() {
        // Input: asciidoctor/blocks_test_lazy_markdown_style_quote_block_with_single_paragraph_and_no_attribution.adoc
        // Expected Go AST:
        // var blocksTestLazyMarkdownStyleQuoteBlockWithSingleParagraphAndNoAttribution =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "> A famous quote.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "Some more inspiring words.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `markdown-style quote block with multiple paragraphs and no attribution`() {
        // Input: asciidoctor/blocks_test_markdown_style_quote_block_with_multiple_paragraphs_and_no_attribution.adoc
        // Expected Go AST:
        // var blocksTestMarkdownStyleQuoteBlockWithMultipleParagraphsAndNoAttribution =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "> A famous quote.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: ">",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "> Some more inspiring words.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `markdown-style quote block with multiple blocks and no attribution`() {
        // Input: asciidoctor/blocks_test_markdown_style_quote_block_with_multiple_blocks_and_no_attribution.adoc
        // Expected Go AST:
        // var blocksTestMarkdownStyleQuoteBlockWithMultipleBlocksAndNoAttribution =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "> A famous quote.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: ">",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "> NOTE: Some more inspiring words.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `markdown-style quote block with single paragraph and attribution`() {
        // Input: asciidoctor/blocks_test_markdown_style_quote_block_with_single_paragraph_and_attribution.adoc
        // Expected Go AST:
        // var blocksTestMarkdownStyleQuoteBlockWithSingleParagraphAndAttribution =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "> A famous quote.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "> Some more inspiring words.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "> -- Famous Person, Famous Source, Volume 1 (1999)",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `markdown-style quote block with only attribution`() {
        // Input: asciidoctor/blocks_test_markdown_style_quote_block_with_only_attribution.adoc
        // Expected Go AST:
        // var blocksTestMarkdownStyleQuoteBlockWithOnlyAttribution =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "> I hold it that a little rebellion now and then is a good thing,",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "> and as necessary in the political world as storms in the physical.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Thomas Jefferson, ",
        // 				},
        // 				&asciidoc.Link{
        // 					AttributeList: asciidoc.AttributeList{
        // 						&asciidoc.PositionalAttribute{
        // 							Offset:      0,
        // 							ImpliedName: "alt",
        // 							Val: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "The Papers of Thomas Jefferson",
        // 								},
        // 							},
        // 						},
        // 						&asciidoc.PositionalAttribute{
        // 							Offset:      1,
        // 							ImpliedName: "",
        // 							Val: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Volume 11",
        // 								},
        // 							},
        // 						},
        // 					},
        // 					URL: asciidoc.URL{
        // 						Scheme: "https://",
        // 						Path: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "jeffersonpapers.princeton.edu/selected-documents/james-madison-1",
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "--",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `quoted paragraph-style quote block with attribution`() {
        // Input: asciidoctor/blocks_test_quoted_paragraph_style_quote_block_with_attribution.adoc
        // Expected Go AST:
        // var blocksTestQuotedParagraphStyleQuoteBlockWithAttribution =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "\"A famous quote.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "Some more inspiring words.\"",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Famous Person, Famous Source, Volume 1 (1999)",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "--",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should parse credit line in quoted paragraph-style quote block like positional block attributes`() {
        // Input: asciidoctor/blocks_test_should_parse_credit_line_in_quoted_paragraph_style_quote_block_like_positional_block_attributes.adoc
        // Expected Go AST:
        // var blocksTestShouldParseCreditLineInQuotedParagraphStyleQuoteBlockLikePositionalBlockAttributes =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "\"I hold it that a little rebellion now and then is a good thing,",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "and as necessary in the political world as storms in the physical.\"",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Thomas Jefferson, ",
        // 				},
        // 				&asciidoc.Link{
        // 					AttributeList: asciidoc.AttributeList{
        // 						&asciidoc.PositionalAttribute{
        // 							Offset:      0,
        // 							ImpliedName: "alt",
        // 							Val: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "The Papers of Thomas Jefferson",
        // 								},
        // 							},
        // 						},
        // 						&asciidoc.PositionalAttribute{
        // 							Offset:      1,
        // 							ImpliedName: "",
        // 							Val: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Volume 11",
        // 								},
        // 							},
        // 						},
        // 					},
        // 					URL: asciidoc.URL{
        // 						Scheme: "https://",
        // 						Path: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "jeffersonpapers.princeton.edu/selected-documents/james-madison-1",
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "--",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `single-line verse block without attribution`() {
        // Input: asciidoctor/blocks_test_single_line_verse_block_without_attribution.adoc
        // Expected Go AST:
        // var blocksTestSingleLineVerseBlockWithoutAttribution =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.QuoteBlock{
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   11,
        // 				Length: 4,
        // 			},
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "verse",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "A famous verse.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `single-line verse block with attribution`() {
        // Input: asciidoctor/blocks_test_single_line_verse_block_with_attribution.adoc
        // Expected Go AST:
        // var blocksTestSingleLineVerseBlockWithAttribution =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.QuoteBlock{
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   11,
        // 				Length: 4,
        // 			},
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "verse",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      1,
        // 					ImpliedName: "",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Famous Poet",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      2,
        // 					ImpliedName: "",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Famous Poem",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "A famous verse.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `single-line verse block with attribution converted to DocBook`() {
        // Input: asciidoctor/blocks_test_single_line_verse_block_with_attribution_converted_to_doc_book.adoc
        // Expected Go AST:
        // var blocksTestSingleLineVerseBlockWithAttributionConvertedToDocBook =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.QuoteBlock{
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   11,
        // 				Length: 4,
        // 			},
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "verse",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      1,
        // 					ImpliedName: "",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Famous Poet",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      2,
        // 					ImpliedName: "",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Famous Poem",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "A famous verse.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `single-line epigraph verse block with attribution converted to DocBook`() {
        // Input: asciidoctor/blocks_test_single_line_epigraph_verse_block_with_attribution_converted_to_doc_book.adoc
        // Expected Go AST:
        // var blocksTestSingleLineEpigraphVerseBlockWithAttributionConvertedToDocBook =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.QuoteBlock{
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   11,
        // 				Length: 4,
        // 			},
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "verse",
        // 							},
        // 						},
        // 					},
        // 					ID: nil,
        // 					Roles: []*asciidoc.ShorthandRole{
        // 						&asciidoc.ShorthandRole{
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "epigraph",
        // 								},
        // 							},
        // 						},
        // 					},
        // 					Options: nil,
        // 				},
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      1,
        // 					ImpliedName: "",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Famous Poet",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      2,
        // 					ImpliedName: "",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Famous Poem",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "A famous verse.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `multi-stanza verse block`() {
        // Input: asciidoctor/blocks_test_multi_stanza_verse_block.adoc
        // Expected Go AST:
        // var blocksTestMultiStanzaVerseBlock =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.QuoteBlock{
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   11,
        // 				Length: 4,
        // 			},
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "verse",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "A famous verse.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "Stanza two.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `verse block does not contain block elements`() {
        // Input: asciidoctor/blocks_test_verse_block_does_not_contain_block_elements.adoc
        // Expected Go AST:
        // var blocksTestVerseBlockDoesNotContainBlockElements =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.QuoteBlock{
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   11,
        // 				Length: 4,
        // 			},
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "verse",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "A famous verse.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.LiteralBlock{
        // 					AttributeList: nil,
        // 					Delimiter: asciidoc.Delimiter{
        // 						Type:   6,
        // 						Length: 4,
        // 					},
        // 					LineList: asciidoc.LineList{
        // 						"not a literal",
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `verse should have normal subs`() {
        // Input: asciidoctor/blocks_test_verse_should_have_normal_subs.adoc
        // Expected Go AST:
        // var blocksTestVerseShouldHaveNormalSubs =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.QuoteBlock{
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   11,
        // 				Length: 4,
        // 			},
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "verse",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "A famous verse",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not recognize callouts in a verse`() {
        // Input: asciidoctor/blocks_test_should_not_recognize_callouts_in_a_verse.adoc
        // Expected Go AST:
        // var blocksTestShouldNotRecognizeCalloutsInAVerse =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.QuoteBlock{
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   11,
        // 				Length: 4,
        // 			},
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "verse",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "La la la <1>",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: "<1> Not pointing to a callout",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should perform normal subs on a verse block`() {
        // Input: asciidoctor/blocks_test_should_perform_normal_subs_on_a_verse_block.adoc
        // Expected Go AST:
        // var blocksTestShouldPerformNormalSubsOnAVerseBlock =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.QuoteBlock{
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   11,
        // 				Length: 4,
        // 			},
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "verse",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.Italic{
        // 					AttributeList: nil,
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "GET /groups/link:#group-id[\\{group-id\\}]",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `can convert example block`() {
        // Input: asciidoctor/blocks_test_can_convert_example_block.adoc
        // Expected Go AST:
        // var blocksTestCanConvertExampleBlock =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.ExampleBlock{
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   3,
        // 				Length: 4,
        // 			},
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "This is an example of an example block.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "How crazy is that?",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `assigns sequential numbered caption to example block with title`() {
        // Input: asciidoctor/blocks_test_assigns_sequential_numbered_caption_to_example_block_with_title.adoc
        // Expected Go AST:
        // var blocksTestAssignsSequentialNumberedCaptionToExampleBlockWithTitle =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.ExampleBlock{
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   3,
        // 				Length: 4,
        // 			},
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Writing Docs with AsciiDoc",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Here's how you write AsciiDoc.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "You just write.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.ExampleBlock{
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   3,
        // 				Length: 4,
        // 			},
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Writing Docs with DocBook",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Here's how you write DocBook.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "You futz with XML.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `assigns sequential character caption to example block with title`() {
        // Input: asciidoctor/blocks_test_assigns_sequential_character_caption_to_example_block_with_title.adoc
        // Expected Go AST:
        // var blocksTestAssignsSequentialCharacterCaptionToExampleBlockWithTitle =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "example-number",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "@",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.ExampleBlock{
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   3,
        // 				Length: 4,
        // 			},
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Writing Docs with AsciiDoc",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Here's how you write AsciiDoc.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "You just write.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.ExampleBlock{
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   3,
        // 				Length: 4,
        // 			},
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Writing Docs with DocBook",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Here's how you write DocBook.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "You futz with XML.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should increment counter for example even when example-number is locked by the API`() {
        // Input: asciidoctor/blocks_test_should_increment_counter_for_example_even_when_example_number_is_locked_by_the_api.adoc
        // Expected Go AST:
        // var blocksTestShouldIncrementCounterForExampleEvenWhenExampleNumberIsLockedByTheApi =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.ExampleBlock{
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   3,
        // 				Length: 4,
        // 			},
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Writing Docs with AsciiDoc",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Here's how you write AsciiDoc.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "You just write.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.ExampleBlock{
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   3,
        // 				Length: 4,
        // 			},
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Writing Docs with DocBook",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Here's how you write DocBook.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "You futz with XML.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should use explicit caption if specified`() {
        // Input: asciidoctor/blocks_test_should_use_explicit_caption_if_specified.adoc
        // Expected Go AST:
        // var blocksTestShouldUseExplicitCaptionIfSpecified =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.ExampleBlock{
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   3,
        // 				Length: 4,
        // 			},
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.NamedAttribute{
        // 					Name: "caption",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Look! ",
        // 						},
        // 					},
        // 					Quote: 2,
        // 				},
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Writing Docs with AsciiDoc",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Here's how you write AsciiDoc.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "You just write.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `automatic caption can be turned off and on and modified`() {
        // Input: asciidoctor/blocks_test_automatic_caption_can_be_turned_off_and_on_and_modified.adoc
        // Expected Go AST:
        // var blocksTestAutomaticCaptionCanBeTurnedOffAndOnAndModified =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.ExampleBlock{
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   3,
        // 				Length: 4,
        // 			},
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "first example",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "an example",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name:     "caption",
        // 			Elements: nil,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.ExampleBlock{
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   3,
        // 				Length: 4,
        // 			},
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "second example",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "another example",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeReset{
        // 			Name: "caption",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "example-caption",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Exhibit",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.ExampleBlock{
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   3,
        // 				Length: 4,
        // 			},
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "third example",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "yet another example",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should use explicit caption if specified even if block-specific global caption is disabled`() {
        // Input: asciidoctor/blocks_test_should_use_explicit_caption_if_specified_even_if_block_specific_global_caption_is_disabled.adoc
        // Expected Go AST:
        // var blocksTestShouldUseExplicitCaptionIfSpecifiedEvenIfBlockSpecificGlobalCaptionIsDisabled =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeReset{
        // 			Name: "example-caption",
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.ExampleBlock{
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   3,
        // 				Length: 4,
        // 			},
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.NamedAttribute{
        // 					Name: "caption",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Look! ",
        // 						},
        // 					},
        // 					Quote: 2,
        // 				},
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Writing Docs with AsciiDoc",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Here's how you write AsciiDoc.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "You just write.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should use global caption if specified even if block-specific global caption is disabled`() {
        // Input: asciidoctor/blocks_test_should_use_global_caption_if_specified_even_if_block_specific_global_caption_is_disabled.adoc
        // Expected Go AST:
        // var blocksTestShouldUseGlobalCaptionIfSpecifiedEvenIfBlockSpecificGlobalCaptionIsDisabled =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeReset{
        // 			Name: "example-caption",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "caption",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Look!{sp}",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.ExampleBlock{
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   3,
        // 				Length: 4,
        // 			},
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Writing Docs with AsciiDoc",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Here's how you write AsciiDoc.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "You just write.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not process caption attribute on block that does not support a caption`() {
        // Input: asciidoctor/blocks_test_should_not_process_caption_attribute_on_block_that_does_not_support_a_caption.adoc
        // Expected Go AST:
        // var blocksTestShouldNotProcessCaptionAttributeOnBlockThatDoesNotSupportACaption =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.OpenBlock{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.NamedAttribute{
        // 					Name: "caption",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Look! ",
        // 						},
        // 					},
        // 					Quote: 2,
        // 				},
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "No caption here",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   7,
        // 				Length: 2,
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "content",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should create details_summary set if collapsible option is set`() {
        // Input: asciidoctor/blocks_test_should_create_details_summary_set_if_collapsible_option_is_set.adoc
        // Expected Go AST:
        // var blocksTestShouldCreateDetailsSummarySetIfCollapsibleOptionIsSet =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.ExampleBlock{
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   3,
        // 				Length: 4,
        // 			},
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Toggle Me",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: nil,
        // 					ID:    nil,
        // 					Roles: nil,
        // 					Options: []*asciidoc.ShorthandOption{
        // 						&asciidoc.ShorthandOption{
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "collapsible",
        // 								},
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "This content is revealed when the user clicks the words \"Toggle Me\".",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should open details_summary set if collapsible and open options are set`() {
        // Input: asciidoctor/blocks_test_should_open_details_summary_set_if_collapsible_and_open_options_are_set.adoc
        // Expected Go AST:
        // var blocksTestShouldOpenDetailsSummarySetIfCollapsibleAndOpenOptionsAreSet =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.ExampleBlock{
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   3,
        // 				Length: 4,
        // 			},
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Toggle Me",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: nil,
        // 					ID:    nil,
        // 					Roles: nil,
        // 					Options: []*asciidoc.ShorthandOption{
        // 						&asciidoc.ShorthandOption{
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "collapsible",
        // 								},
        // 							},
        // 						},
        // 						&asciidoc.ShorthandOption{
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "open",
        // 								},
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "This content is revealed when the user clicks the words \"Toggle Me\".",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should add default summary element if collapsible option is set and title is not specifed`() {
        // Input: asciidoctor/blocks_test_should_add_default_summary_element_if_collapsible_option_is_set_and_title_is_not_specifed.adoc
        // Expected Go AST:
        // var blocksTestShouldAddDefaultSummaryElementIfCollapsibleOptionIsSetAndTitleIsNotSpecifed =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.ExampleBlock{
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   3,
        // 				Length: 4,
        // 			},
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: nil,
        // 					ID:    nil,
        // 					Roles: nil,
        // 					Options: []*asciidoc.ShorthandOption{
        // 						&asciidoc.ShorthandOption{
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "collapsible",
        // 								},
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "This content is revealed when the user clicks the words \"Details\".",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not allow collapsible block to increment example number`() {
        // Input: asciidoctor/blocks_test_should_not_allow_collapsible_block_to_increment_example_number.adoc
        // Expected Go AST:
        // var blocksTestShouldNotAllowCollapsibleBlockToIncrementExampleNumber =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.ExampleBlock{
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   3,
        // 				Length: 4,
        // 			},
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Before",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "before",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.ExampleBlock{
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   3,
        // 				Length: 4,
        // 			},
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Show Me The Goods",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: nil,
        // 					ID:    nil,
        // 					Roles: nil,
        // 					Options: []*asciidoc.ShorthandOption{
        // 						&asciidoc.ShorthandOption{
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "collapsible",
        // 								},
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "This content is revealed when the user clicks the words \"Show Me The Goods\".",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.ExampleBlock{
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   3,
        // 				Length: 4,
        // 			},
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "After",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "after",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should warn if example block is not terminated`() {
        // Input: asciidoctor/blocks_test_should_warn_if_example_block_is_not_terminated.adoc
        // Expected Go AST:
        // var blocksTestShouldWarnIfExampleBlockIsNotTerminated =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "outside",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "====",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "inside",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "still inside",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "eof",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `caption block-level attribute should be used as caption`() {
        // Input: asciidoctor/blocks_test_caption_block_level_attribute_should_be_used_as_caption.adoc
        // Expected Go AST:
        // var blocksTestCaptionBlockLevelAttributeShouldBeUsedAsCaption =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "tip-caption",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Pro Tip",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.NamedAttribute{
        // 					Name: "caption",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Pro Tip",
        // 						},
        // 					},
        // 					Quote: 2,
        // 				},
        // 			},
        // 			Elements:   asciidoc.Elements{},
        // 			Admonition: 0,
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Override the caption of an admonition block using an attribute entry",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 2,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `can override caption of admonition block using document attribute`() {
        // Input: asciidoctor/blocks_test_can_override_caption_of_admonition_block_using_document_attribute.adoc
        // Expected Go AST:
        // var blocksTestCanOverrideCaptionOfAdmonitionBlockUsingDocumentAttribute =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "tip-caption",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Pro Tip",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Override the caption of an admonition block using an attribute entry",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 2,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `blank caption document attribute should not blank admonition block caption`() {
        // Input: asciidoctor/blocks_test_blank_caption_document_attribute_should_not_blank_admonition_block_caption.adoc
        // Expected Go AST:
        // var blocksTestBlankCaptionDocumentAttributeShouldNotBlankAdmonitionBlockCaption =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name:     "caption",
        // 			Elements: nil,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Override the caption of an admonition block using an attribute entry",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 2,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should separate adjacent paragraphs and listing into blocks`() {
        // Input: asciidoctor/blocks_test_should_separate_adjacent_paragraphs_and_listing_into_blocks.adoc
        // Expected Go AST:
        // var blocksTestShouldSeparateAdjacentParagraphsAndListingIntoBlocks =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "paragraph 1",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.Listing{
        // 			AttributeList: nil,
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   5,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"listing content",
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: "paragraph 2",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should warn if listing block is not terminated`() {
        // Input: asciidoctor/blocks_test_should_warn_if_listing_block_is_not_terminated.adoc
        // Expected Go AST:
        // var blocksTestShouldWarnIfListingBlockIsNotTerminated =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "outside",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "----",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "inside",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "still inside",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "eof",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not crash when converting verbatim block that has no lines`() {
        // Input: asciidoctor/blocks_test_should_not_crash_when_converting_verbatim_block_that_has_no_lines.adoc
        // Expected Go AST:
        // var blocksTestShouldNotCrashWhenConvertingVerbatimBlockThatHasNoLines =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.LiteralBlock{
        // 			AttributeList: nil,
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   6,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"line one",
        // 				"",
        // 				"line two",
        // 				"",
        // 				"line three",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should preserve newlines in listing block`() {
        // Input: asciidoctor/blocks_test_should_preserve_newlines_in_listing_block.adoc
        // Expected Go AST:
        // var blocksTestShouldPreserveNewlinesInListingBlock =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Listing{
        // 			AttributeList: nil,
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   5,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"line one",
        // 				"",
        // 				"line two",
        // 				"",
        // 				"line three",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should preserve newlines in verse block`() {
        // Input: asciidoctor/blocks_test_should_preserve_newlines_in_verse_block.adoc
        // Expected Go AST:
        // var blocksTestShouldPreserveNewlinesInVerseBlock =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.OpenBlock{
        // 			AttributeList: nil,
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   7,
        // 				Length: 2,
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.QuoteBlock{
        // 					Delimiter: asciidoc.Delimiter{
        // 						Type:   11,
        // 						Length: 4,
        // 					},
        // 					AttributeList: asciidoc.AttributeList{
        // 						&asciidoc.ShorthandAttribute{
        // 							Style: &asciidoc.ShorthandStyle{
        // 								Elements: asciidoc.Elements{
        // 									&asciidoc.String{
        // 										Value: "verse",
        // 									},
        // 								},
        // 							},
        // 							ID:      nil,
        // 							Roles:   nil,
        // 							Options: nil,
        // 						},
        // 					},
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "line one",
        // 						},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.EmptyLine{
        // 							Text: "",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "line two",
        // 						},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.EmptyLine{
        // 							Text: "",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "line three",
        // 						},
        // 						&asciidoc.NewLine{},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should strip leading and trailing blank lines when converting verbatim block`() {
        // Input: asciidoctor/blocks_test_should_strip_leading_and_trailing_blank_lines_when_converting_verbatim_block.adoc
        // Expected Go AST:
        // var blocksTestShouldStripLeadingAndTrailingBlankLinesWhenConvertingVerbatimBlock =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.LiteralBlock{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.NamedAttribute{
        // 					Name: "subs",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "attributes+",
        // 						},
        // 					},
        // 					Quote: 0,
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   6,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"",
        // 				"",
        // 				"  first line",
        // 				"",
        // 				"last line",
        // 				"",
        // 				"{empty}",
        // 				"",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should remove block indent if indent attribute is 0`() {
        // Input: asciidoctor/blocks_test_should_remove_block_indent_if_indent_attribute_is_0.adoc
        // Expected Go AST:
        // var blocksTestShouldRemoveBlockIndentIfIndentAttributeIs0 =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Listing{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.NamedAttribute{
        // 					Name: "indent",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "0",
        // 						},
        // 					},
        // 					Quote: 2,
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   5,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"    def names",
        // 				"",
        // 				"      @names.split",
        // 				"",
        // 				"    end",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not remove block indent if indent attribute is -1`() {
        // Input: asciidoctor/blocks_test_should_not_remove_block_indent_if_indent_attribute_is__1.adoc
        // Expected Go AST:
        // var blocksTestShouldNotRemoveBlockIndentIfIndentAttributeIs1 =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Listing{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.NamedAttribute{
        // 					Name: "indent",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "-1",
        // 						},
        // 					},
        // 					Quote: 2,
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   5,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"    def names",
        // 				"",
        // 				"      @names.split",
        // 				"",
        // 				"    end",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should set block indent to value specified by indent attribute`() {
        // Input: asciidoctor/blocks_test_should_set_block_indent_to_value_specified_by_indent_attribute.adoc
        // Expected Go AST:
        // var blocksTestShouldSetBlockIndentToValueSpecifiedByIndentAttribute =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Listing{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.NamedAttribute{
        // 					Name: "indent",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "1",
        // 						},
        // 					},
        // 					Quote: 2,
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   5,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"    def names",
        // 				"",
        // 				"      @names.split",
        // 				"",
        // 				"    end",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should set block indent to value specified by indent document attribute`() {
        // Input: asciidoctor/blocks_test_should_set_block_indent_to_value_specified_by_indent_document_attribute.adoc
        // Expected Go AST:
        // var blocksTestShouldSetBlockIndentToValueSpecifiedByIndentDocumentAttribute =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "source-indent",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "1",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Listing{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "source",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      1,
        // 					ImpliedName: "",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "ruby",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   5,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"    def names",
        // 				"",
        // 				"      @names.split",
        // 				"",
        // 				"    end",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `literal block should honor nowrap option`() {
        // Input: asciidoctor/blocks_test_literal_block_should_honor_nowrap_option.adoc
        // Expected Go AST:
        // var blocksTestLiteralBlockShouldHonorNowrapOption =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Listing{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.NamedAttribute{
        // 					Name: "options",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "nowrap",
        // 						},
        // 					},
        // 					Quote: 2,
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   5,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"Do not wrap me if I get too long.",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `literal block should set nowrap class if prewrap document attribute is disabled`() {
        // Input: asciidoctor/blocks_test_literal_block_should_set_nowrap_class_if_prewrap_document_attribute_is_disabled.adoc
        // Expected Go AST:
        // var blocksTestLiteralBlockShouldSetNowrapClassIfPrewrapDocumentAttributeIsDisabled =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeReset{
        // 			Name: "prewrap",
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Listing{
        // 			AttributeList: nil,
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   5,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"Do not wrap me if I get too long.",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should preserve guard in front of callout if icons are not enabled`() {
        // Input: asciidoctor/blocks_test_should_preserve_guard_in_front_of_callout_if_icons_are_not_enabled.adoc
        // Expected Go AST:
        // var blocksTestShouldPreserveGuardInFrontOfCalloutIfIconsAreNotEnabled =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Listing{
        // 			AttributeList: nil,
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   5,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"puts 'Hello, World!' # <1>",
        // 				"puts 'Goodbye, World ;(' # <2>",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should preserve guard around callout if icons are not enabled`() {
        // Input: asciidoctor/blocks_test_should_preserve_guard_around_callout_if_icons_are_not_enabled.adoc
        // Expected Go AST:
        // var blocksTestShouldPreserveGuardAroundCalloutIfIconsAreNotEnabled =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Listing{
        // 			AttributeList: nil,
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   5,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"<parent> <!--1-->",
        // 				"  <child/> <!--2-->",
        // 				"</parent>",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `literal block should honor explicit subs list`() {
        // Input: asciidoctor/blocks_test_literal_block_should_honor_explicit_subs_list.adoc
        // Expected Go AST:
        // var blocksTestLiteralBlockShouldHonorExplicitSubsList =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Listing{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.NamedAttribute{
        // 					Name: "subs",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "verbatim,quotes",
        // 						},
        // 					},
        // 					Quote: 2,
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   5,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"Map<String, String> *attributes*; //<1>",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should be able to disable callouts for literal block`() {
        // Input: asciidoctor/blocks_test_should_be_able_to_disable_callouts_for_literal_block.adoc
        // Expected Go AST:
        // var blocksTestShouldBeAbleToDisableCalloutsForLiteralBlock =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Listing{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.NamedAttribute{
        // 					Name: "subs",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "specialcharacters",
        // 						},
        // 					},
        // 					Quote: 2,
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   5,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"No callout here <1>",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `listing block should honor explicit subs list`() {
        // Input: asciidoctor/blocks_test_listing_block_should_honor_explicit_subs_list.adoc
        // Expected Go AST:
        // var blocksTestListingBlockShouldHonorExplicitSubsList =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Listing{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.NamedAttribute{
        // 					Name: "subs",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "specialcharacters,quotes",
        // 						},
        // 					},
        // 					Quote: 2,
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   5,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"$ *python functional_tests.py*",
        // 				"Traceback (most recent call last):",
        // 				"  File \"functional_tests.py\", line 4, in <module>",
        // 				"    assert 'Django' in browser.title",
        // 				"AssertionError",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not mangle array that contains formatted text with role in listing block with quotes sub enabled`() {
        // Input: asciidoctor/blocks_test_should_not_mangle_array_that_contains_formatted_text_with_role_in_listing_block_with_quotes_sub_enabled.adoc
        // Expected Go AST:
        // var blocksTestShouldNotMangleArrayThatContainsFormattedTextWithRoleInListingBlockWithQuotesSubEnabled =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "[,ruby,subs=+quotes]",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.Listing{
        // 			AttributeList: nil,
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   5,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"nums = [1, 2, 3, [.added]#4#]",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `first character of block title may be a period if not followed by space`() {
        // Input: asciidoctor/blocks_test_first_character_of_block_title_may_be_a_period_if_not_followed_by_space.adoc
        // Expected Go AST:
        // var blocksTestFirstCharacterOfBlockTitleMayBeAPeriodIfNotFollowedBySpace =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "..gitignore",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.Listing{
        // 			AttributeList: nil,
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   5,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"/.bundle/",
        // 				"/build/",
        // 				"/Gemfile.lock",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `listing block without title should generate screen element in docbook`() {
        // Input: asciidoctor/blocks_test_listing_block_without_title_should_generate_screen_element_in_docbook.adoc
        // Expected Go AST:
        // var blocksTestListingBlockWithoutTitleShouldGenerateScreenElementInDocbook =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Listing{
        // 			AttributeList: nil,
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   5,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"listing block",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `listing block with title should generate screen element inside formalpara element in docbook`() {
        // Input: asciidoctor/blocks_test_listing_block_with_title_should_generate_screen_element_inside_formalpara_element_in_docbook.adoc
        // Expected Go AST:
        // var blocksTestListingBlockWithTitleShouldGenerateScreenElementInsideFormalparaElementInDocbook =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Listing{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "title",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   5,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"listing block",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not prepend caption to title of listing block with title if listing-caption attribute is not set`() {
        // Input: asciidoctor/blocks_test_should_not_prepend_caption_to_title_of_listing_block_with_title_if_listing_caption_attribute_is_not_set.adoc
        // Expected Go AST:
        // var blocksTestShouldNotPrependCaptionToTitleOfListingBlockWithTitleIfListingCaptionAttributeIsNotSet =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Listing{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "title",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   5,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"listing block content",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should prepend caption specified by listing-caption attribute and number to title of listing block with title`() {
        // Input: asciidoctor/blocks_test_should_prepend_caption_specified_by_listing_caption_attribute_and_number_to_title_of_listing_block_with_title.adoc
        // Expected Go AST:
        // var blocksTestShouldPrependCaptionSpecifiedByListingCaptionAttributeAndNumberToTitleOfListingBlockWithTitle =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "listing-caption",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Listing",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Listing{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "title",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   5,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"listing block content",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should prepend caption specified by caption attribute on listing block even if listing-caption attribute is not set`() {
        // Input: asciidoctor/blocks_test_should_prepend_caption_specified_by_caption_attribute_on_listing_block_even_if_listing_caption_attribute_is_not_set.adoc
        // Expected Go AST:
        // var blocksTestShouldPrependCaptionSpecifiedByCaptionAttributeOnListingBlockEvenIfListingCaptionAttributeIsNotSet =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Listing{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.NamedAttribute{
        // 					Name: "caption",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Listing ",
        // 						},
        // 						&asciidoc.Counter{
        // 							Name:         "listing-number",
        // 							InitialValue: "",
        // 							Display:      asciidoc.CounterVisibilityVisible,
        // 						},
        // 						&asciidoc.String{
        // 							Value: ". ",
        // 						},
        // 					},
        // 					Quote: 2,
        // 				},
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Behold!",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   5,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"listing block content",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `listing block without an explicit style and with a second positional argument should be promoted to a source block`() {
        // Input: asciidoctor/blocks_test_listing_block_without_an_explicit_style_and_with_a_second_positional_argument_should_be_promoted_to_a_source_block.adoc
        // Expected Go AST:
        // var blocksTestListingBlockWithoutAnExplicitStyleAndWithASecondPositionalArgumentShouldBePromotedToASourceBlock =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "[,ruby]",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.Listing{
        // 			AttributeList: nil,
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   5,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"puts 'Hello, Ruby!'",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `listing block without an explicit style should be promoted to a source block if source-language is set`() {
        // Input: asciidoctor/blocks_test_listing_block_without_an_explicit_style_should_be_promoted_to_a_source_block_if_source_language_is_set.adoc
        // Expected Go AST:
        // var blocksTestListingBlockWithoutAnExplicitStyleShouldBePromotedToASourceBlockIfSourceLanguageIsSet =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "source-language",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "ruby",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Listing{
        // 			AttributeList: nil,
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   5,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"puts 'Hello, Ruby!'",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `listing block with an explicit style and a second positional argument should not be promoted to a source block`() {
        // Input: asciidoctor/blocks_test_listing_block_with_an_explicit_style_and_a_second_positional_argument_should_not_be_promoted_to_a_source_block.adoc
        // Expected Go AST:
        // var blocksTestListingBlockWithAnExplicitStyleAndASecondPositionalArgumentShouldNotBePromotedToASourceBlock =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Listing{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "listing",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      1,
        // 					ImpliedName: "",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "ruby",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   5,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"puts 'Hello, Ruby!'",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `listing block with an explicit style should not be promoted to a source block if source-language is set`() {
        // Input: asciidoctor/blocks_test_listing_block_with_an_explicit_style_should_not_be_promoted_to_a_source_block_if_source_language_is_set.adoc
        // Expected Go AST:
        // var blocksTestListingBlockWithAnExplicitStyleShouldNotBePromotedToASourceBlockIfSourceLanguageIsSet =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "source-language",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "ruby",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Listing{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "listing",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   5,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"puts 'Hello, Ruby!'",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `source block with no title or language should generate screen element in docbook`() {
        // Input: asciidoctor/blocks_test_source_block_with_no_title_or_language_should_generate_screen_element_in_docbook.adoc
        // Expected Go AST:
        // var blocksTestSourceBlockWithNoTitleOrLanguageShouldGenerateScreenElementInDocbook =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Listing{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "source",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   5,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"source block",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `source block with title and no language should generate screen element inside formalpara element for docbook`() {
        // Input: asciidoctor/blocks_test_source_block_with_title_and_no_language_should_generate_screen_element_inside_formalpara_element_for_docbook.adoc
        // Expected Go AST:
        // var blocksTestSourceBlockWithTitleAndNoLanguageShouldGenerateScreenElementInsideFormalparaElementForDocbook =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Listing{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "source",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "title",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   5,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"source block",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `can convert open block`() {
        // Input: asciidoctor/blocks_test_can_convert_open_block.adoc
        // Expected Go AST:
        // var blocksTestCanConvertOpenBlock =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.OpenBlock{
        // 			AttributeList: nil,
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   7,
        // 				Length: 2,
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "This is an open block.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "It can span multiple lines.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `open block can contain another block`() {
        // Input: asciidoctor/blocks_test_open_block_can_contain_another_block.adoc
        // Expected Go AST:
        // var blocksTestOpenBlockCanContainAnotherBlock =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.OpenBlock{
        // 			AttributeList: nil,
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   7,
        // 				Length: 2,
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "This is an open block.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "It can span multiple lines.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.QuoteBlock{
        // 					Delimiter: asciidoc.Delimiter{
        // 						Type:   11,
        // 						Length: 4,
        // 					},
        // 					AttributeList: nil,
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "It can hold great quotes like this one.",
        // 						},
        // 						&asciidoc.NewLine{},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should transfer id and reftext on open block to DocBook output`() {
        // Input: asciidoctor/blocks_test_should_transfer_id_and_reftext_on_open_block_to_doc_book_output.adoc
        // Expected Go AST:
        // var blocksTestShouldTransferIdAndReftextOnOpenBlockToDocBookOutput =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Check out that ",
        // 		},
        // 		&asciidoc.CrossReference{
        // 			AttributeList: nil,
        // 			Elements:      nil,
        // 			ID: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "open",
        // 				},
        // 			},
        // 			Format: 0,
        // 		},
        // 		&asciidoc.String{
        // 			Value: "!",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.OpenBlock{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.AnchorAttribute{
        // 					ID: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "open",
        // 						},
        // 					},
        // 					Label: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Open Block",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   7,
        // 				Length: 2,
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "This is an open block.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.Paragraph{
        // 					AttributeList: nil,
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "An open block can have other blocks inside of it.",
        // 						},
        // 						&asciidoc.NewLine{},
        // 					},
        // 					Admonition: 2,
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Back to our regularly scheduled programming.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should transfer id and reftext on open paragraph to DocBook output`() {
        // Input: asciidoctor/blocks_test_should_transfer_id_and_reftext_on_open_paragraph_to_doc_book_output.adoc
        // Expected Go AST:
        // var blocksTestShouldTransferIdAndReftextOnOpenParagraphToDocBookOutput =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "open",
        // 							},
        // 						},
        // 					},
        // 					ID: &asciidoc.ShorthandID{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "openpara",
        // 							},
        // 						},
        // 					},
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 				&asciidoc.NamedAttribute{
        // 					Name: "reftext",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Open Paragraph",
        // 						},
        // 					},
        // 					Quote: 2,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "This is an open paragraph.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should transfer title on open block to DocBook output`() {
        // Input: asciidoctor/blocks_test_should_transfer_title_on_open_block_to_doc_book_output.adoc
        // Expected Go AST:
        // var blocksTestShouldTransferTitleOnOpenBlockToDocBookOutput =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.OpenBlock{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Behold the open",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   7,
        // 				Length: 2,
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "This is an open block with a title.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should transfer title on open paragraph to DocBook output`() {
        // Input: asciidoctor/blocks_test_should_transfer_title_on_open_paragraph_to_doc_book_output.adoc
        // Expected Go AST:
        // var blocksTestShouldTransferTitleOnOpenParagraphToDocBookOutput =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Behold the open",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "This is an open paragraph with a title.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should transfer role on open block to DocBook output`() {
        // Input: asciidoctor/blocks_test_should_transfer_role_on_open_block_to_doc_book_output.adoc
        // Expected Go AST:
        // var blocksTestShouldTransferRoleOnOpenBlockToDocBookOutput =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.OpenBlock{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: nil,
        // 					ID:    nil,
        // 					Roles: []*asciidoc.ShorthandRole{
        // 						&asciidoc.ShorthandRole{
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "container",
        // 								},
        // 							},
        // 						},
        // 					},
        // 					Options: nil,
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   7,
        // 				Length: 2,
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "This is an open block.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "It holds stuff.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should transfer role on open paragraph to DocBook output`() {
        // Input: asciidoctor/blocks_test_should_transfer_role_on_open_paragraph_to_doc_book_output.adoc
        // Expected Go AST:
        // var blocksTestShouldTransferRoleOnOpenParagraphToDocBookOutput =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: nil,
        // 					ID:    nil,
        // 					Roles: []*asciidoc.ShorthandRole{
        // 						&asciidoc.ShorthandRole{
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "container",
        // 								},
        // 							},
        // 						},
        // 					},
        // 					Options: nil,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "This is an open block.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "It holds stuff.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `can parse a passthrough block`() {
        // Input: asciidoctor/blocks_test_can_parse_a_passthrough_block.adoc
        // Expected Go AST:
        // var blocksTestCanParseAPassthroughBlock =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.StemBlock{
        // 			AttributeList: nil,
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   9,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"This is a passthrough block.",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `does not perform subs on a passthrough block by default`() {
        // Input: asciidoctor/blocks_test_does_not_perform_subs_on_a_passthrough_block_by_default.adoc
        // Expected Go AST:
        // var blocksTestDoesNotPerformSubsOnAPassthroughBlockByDefault =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "type",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "passthrough",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.StemBlock{
        // 			AttributeList: nil,
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   9,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"This is a '{type}' block.",
        // 				"http://asciidoc.org",
        // 				"image:tiger.png[]",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `does not perform subs on a passthrough block with pass style by default`() {
        // Input: asciidoctor/blocks_test_does_not_perform_subs_on_a_passthrough_block_with_pass_style_by_default.adoc
        // Expected Go AST:
        // var blocksTestDoesNotPerformSubsOnAPassthroughBlockWithPassStyleByDefault =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "type",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "passthrough",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.StemBlock{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "pass",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   9,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"This is a '{type}' block.",
        // 				"http://asciidoc.org",
        // 				"image:tiger.png[]",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `passthrough block honors explicit subs list`() {
        // Input: asciidoctor/blocks_test_passthrough_block_honors_explicit_subs_list.adoc
        // Expected Go AST:
        // var blocksTestPassthroughBlockHonorsExplicitSubsList =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "type",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "passthrough",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.StemBlock{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.NamedAttribute{
        // 					Name: "subs",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "attributes,quotes,macros",
        // 						},
        // 					},
        // 					Quote: 2,
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   9,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"This is a _{type}_ block.",
        // 				"http://asciidoc.org",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should strip leading and trailing blank lines when converting raw block`() {
        // Input: asciidoctor/blocks_test_should_strip_leading_and_trailing_blank_lines_when_converting_raw_block.adoc
        // Expected Go AST:
        // var blocksTestShouldStripLeadingAndTrailingBlankLinesWhenConvertingRawBlock =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.StemBlock{
        // 			AttributeList: nil,
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   9,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"line above",
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.StemBlock{
        // 			AttributeList: nil,
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   9,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"",
        // 				"",
        // 				"  first line",
        // 				"",
        // 				"last line",
        // 				"",
        // 				"",
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.StemBlock{
        // 			AttributeList: nil,
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   9,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"line below",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not crash when converting stem block that has no lines`() {
        // Input: asciidoctor/blocks_test_should_not_crash_when_converting_stem_block_that_has_no_lines.adoc
        // Expected Go AST:
        // var blocksTestShouldNotCrashWhenConvertingStemBlockThatHasNoLines =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.StemBlock{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "stem",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   9,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should return content as empty string for stem or pass block that has no lines`() {
        // Input: asciidoctor/blocks_test_should_return_content_as_empty_string_for_stem_or_pass_block_that_has_no_lines.adoc
        // Expected Go AST:
        // var blocksTestShouldReturnContentAsEmptyStringForStemOrPassBlockThatHasNoLines =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.StemBlock{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "latexmath",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   9,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"\\sqrt{3x-1}+(1+x)^2 < y",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not add LaTeX math delimiters around latexmath block content if already present`() {
        // Input: asciidoctor/blocks_test_should_not_add_la_te_x_math_delimiters_around_latexmath_block_content_if_already_present.adoc
        // Expected Go AST:
        // var blocksTestShouldNotAddLaTeXMathDelimitersAroundLatexmathBlockContentIfAlreadyPresent =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.StemBlock{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "latexmath",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   9,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"\\[\\sqrt{3x-1}+(1+x)^2 < y\\]",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should display latexmath block in alt of equation in DocBook backend`() {
        // Input: asciidoctor/blocks_test_should_display_latexmath_block_in_alt_of_equation_in_doc_book_backend.adoc
        // Expected Go AST:
        // var blocksTestShouldDisplayLatexmathBlockInAltOfEquationInDocBookBackend =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.StemBlock{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "latexmath",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   9,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"\\sqrt{3x-1}+(1+x)^2 < y",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should set autoNumber option for latexmath to none by default`() {
        // Input: asciidoctor/blocks_test_should_set_auto_number_option_for_latexmath_to_none_by_default.adoc
        // Expected Go AST:
        // var blocksTestShouldSetAutoNumberOptionForLatexmathToNoneByDefault =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "stem",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "latexmath",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.StemBlock{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "stem",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   9,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"y = x^2",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should set autoNumber option for latexmath to none if eqnums is set to none`() {
        // Input: asciidoctor/blocks_test_should_set_auto_number_option_for_latexmath_to_none_if_eqnums_is_set_to_none.adoc
        // Expected Go AST:
        // var blocksTestShouldSetAutoNumberOptionForLatexmathToNoneIfEqnumsIsSetToNone =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "stem",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "latexmath",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "eqnums",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "none",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.StemBlock{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "stem",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   9,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"y = x^2",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should set autoNumber option for latexmath to AMS if eqnums is set`() {
        // Input: asciidoctor/blocks_test_should_set_auto_number_option_for_latexmath_to_ams_if_eqnums_is_set.adoc
        // Expected Go AST:
        // var blocksTestShouldSetAutoNumberOptionForLatexmathToAmsIfEqnumsIsSet =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "stem",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "latexmath",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name:     "eqnums",
        // 			Elements: nil,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.StemBlock{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "stem",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   9,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"\\begin{equation}",
        // 				"y = x^2",
        // 				"\\end{equation}",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should set autoNumber option for latexmath to all if eqnums is set to all`() {
        // Input: asciidoctor/blocks_test_should_set_auto_number_option_for_latexmath_to_all_if_eqnums_is_set_to_all.adoc
        // Expected Go AST:
        // var blocksTestShouldSetAutoNumberOptionForLatexmathToAllIfEqnumsIsSetToAll =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "stem",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "latexmath",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "eqnums",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "all",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.StemBlock{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "stem",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   9,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"y = x^2",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not split equation in AsciiMath block at single newline`() {
        // Input: asciidoctor/blocks_test_should_not_split_equation_in_ascii_math_block_at_single_newline.adoc
        // Expected Go AST:
        // var blocksTestShouldNotSplitEquationInAsciiMathBlockAtSingleNewline =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.StemBlock{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "asciimath",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   9,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"f: bbb\"N\" -> bbb\"N\"",
        // 				"f: x |-> x + 1",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should split equation in AsciiMath block at escaped newline`() {
        // Input: asciidoctor/blocks_test_should_split_equation_in_ascii_math_block_at_escaped_newline.adoc
        // Expected Go AST:
        // var blocksTestShouldSplitEquationInAsciiMathBlockAtEscapedNewline =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.StemBlock{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "asciimath",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   9,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"f: bbb\"N\" -> bbb\"N\" \\",
        // 				"f: x |-> x + 1",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should split equation in AsciiMath block at sequence of escaped newlines`() {
        // Input: asciidoctor/blocks_test_should_split_equation_in_ascii_math_block_at_sequence_of_escaped_newlines.adoc
        // Expected Go AST:
        // var blocksTestShouldSplitEquationInAsciiMathBlockAtSequenceOfEscapedNewlines =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.StemBlock{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "asciimath",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   9,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"f: bbb\"N\" -> bbb\"N\" \\",
        // 				"\\",
        // 				"f: x |-> x + 1",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should split equation in AsciiMath block at newline sequence and preserve breaks`() {
        // Input: asciidoctor/blocks_test_should_split_equation_in_ascii_math_block_at_newline_sequence_and_preserve_breaks.adoc
        // Expected Go AST:
        // var blocksTestShouldSplitEquationInAsciiMathBlockAtNewlineSequenceAndPreserveBreaks =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.StemBlock{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "asciimath",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   9,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"f: bbb\"N\" -> bbb\"N\"",
        // 				"",
        // 				"",
        // 				"f: x |-> x + 1",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should add AsciiMath delimiters around asciimath block content`() {
        // Input: asciidoctor/blocks_test_should_add_ascii_math_delimiters_around_asciimath_block_content.adoc
        // Expected Go AST:
        // var blocksTestShouldAddAsciiMathDelimitersAroundAsciimathBlockContent =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.StemBlock{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "asciimath",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   9,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"sqrt(3x-1)+(1+x)^2 < y",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not add AsciiMath delimiters around asciimath block content if already present`() {
        // Input: asciidoctor/blocks_test_should_not_add_ascii_math_delimiters_around_asciimath_block_content_if_already_present.adoc
        // Expected Go AST:
        // var blocksTestShouldNotAddAsciiMathDelimitersAroundAsciimathBlockContentIfAlreadyPresent =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.StemBlock{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "asciimath",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   9,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"\\$sqrt(3x-1)+(1+x)^2 < y\\$",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should convert contents of asciimath block to MathML in DocBook output if asciimath gem is available`() {
        // Input: asciidoctor/blocks_test_should_convert_contents_of_asciimath_block_to_math_ml_in_doc_book_output_if_asciimath_gem_is_available.adoc
        // Expected Go AST:
        // var blocksTestShouldConvertContentsOfAsciimathBlockToMathMlInDocBookOutputIfAsciimathGemIsAvailable =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.StemBlock{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "asciimath",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   9,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"x+b/(2a)<+-sqrt((b^2)/(4a^2)-c/a)",
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.StemBlock{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "asciimath",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   9,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should output title for latexmath block if defined`() {
        // Input: asciidoctor/blocks_test_should_output_title_for_latexmath_block_if_defined.adoc
        // Expected Go AST:
        // var blocksTestShouldOutputTitleForLatexmathBlockIfDefined =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.StemBlock{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "The Lorenz Equations",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "latexmath",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   9,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"\\begin{aligned}",
        // 				"\\dot{x} & = \\sigma(y-x) \\\\",
        // 				"\\dot{y} & = \\rho x - y - xz \\\\",
        // 				"\\dot{z} & = -\\beta z + xy",
        // 				"\\end{aligned}",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should output title for asciimath block if defined`() {
        // Input: asciidoctor/blocks_test_should_output_title_for_asciimath_block_if_defined.adoc
        // Expected Go AST:
        // var blocksTestShouldOutputTitleForAsciimathBlockIfDefined =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.StemBlock{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Simple fraction",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "asciimath",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   9,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"a//b",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should add AsciiMath delimiters around stem block content if stem attribute is asciimath, empty, or not set`() {
        // Input: asciidoctor/blocks_test_should_add_ascii_math_delimiters_around_stem_block_content_if_stem_attribute_is_asciimath_empty_or_not_set.adoc
        // Expected Go AST:
        // var blocksTestShouldAddAsciiMathDelimitersAroundStemBlockContentIfStemAttributeIsAsciimathEmptyOrNotSet =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.StemBlock{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "stem",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   9,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"sqrt(3x-1)+(1+x)^2 < y",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should add LaTeX math delimiters around stem block content if stem attribute is latexmath, latex, or tex`() {
        // Input: asciidoctor/blocks_test_should_add_la_te_x_math_delimiters_around_stem_block_content_if_stem_attribute_is_latexmath_latex_or_tex.adoc
        // Expected Go AST:
        // var blocksTestShouldAddLaTeXMathDelimitersAroundStemBlockContentIfStemAttributeIsLatexmathLatexOrTex =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.StemBlock{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "stem",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   9,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"\\sqrt{3x-1}+(1+x)^2 < y",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should allow stem style to be set using second positional argument of block attributes`() {
        // Input: asciidoctor/blocks_test_should_allow_stem_style_to_be_set_using_second_positional_argument_of_block_attributes.adoc
        // Expected Go AST:
        // var blocksTestShouldAllowStemStyleToBeSetUsingSecondPositionalArgumentOfBlockAttributes =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "stem",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "latexmath",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.StemBlock{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "stem",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      1,
        // 					ImpliedName: "",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "asciimath",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   9,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"sqrt(3x-1)+(1+x)^2 < y",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not warn if block style is unknown`() {
        // Input: asciidoctor/blocks_test_should_not_warn_if_block_style_is_unknown.adoc
        // Expected Go AST:
        // var blocksTestShouldNotWarnIfBlockStyleIsUnknown =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.OpenBlock{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "foo",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   7,
        // 				Length: 2,
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "bar",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should log debug message if block style is unknown and debug level is enabled`() {
        // Input: asciidoctor/blocks_test_should_log_debug_message_if_block_style_is_unknown_and_debug_level_is_enabled.adoc
        // Expected Go AST:
        // var blocksTestShouldLogDebugMessageIfBlockStyleIsUnknownAndDebugLevelIsEnabled =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.OpenBlock{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "foo",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   7,
        // 				Length: 2,
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "bar",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `block title above section gets carried over to first block in section`() {
        // Input: asciidoctor/blocks_test_block_title_above_section_gets_carried_over_to_first_block_in_section.adoc
        // Expected Go AST:
        // var blocksTestBlockTitleAboveSectionGetsCarriedOverToFirstBlockInSection =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Section{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Title",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "paragraph",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Section",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `block title above document title demotes document title to a section title`() {
        // Input: asciidoctor/blocks_test_block_title_above_document_title_demotes_document_title_to_a_section_title.adoc
        // Expected Go AST:
        // var blocksTestBlockTitleAboveDocumentTitleDemotesDocumentTitleToASectionTitle =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Section{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Block title",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "section paragraph",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Section Title",
        // 				},
        // 			},
        // 			Level: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `block title above document title gets carried over to first block in first section if no preamble`() {
        // Input: asciidoctor/blocks_test_block_title_above_document_title_gets_carried_over_to_first_block_in_first_section_if_no_preamble.adoc
        // Expected Go AST:
        // var blocksTestBlockTitleAboveDocumentTitleGetsCarriedOverToFirstBlockInFirstSectionIfNoPreamble =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "doctype",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "book",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.Section{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Block title",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.Section{
        // 					AttributeList: nil,
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.EmptyLine{
        // 							Text: "",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "paragraph",
        // 						},
        // 						&asciidoc.NewLine{},
        // 					},
        // 					Title: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "First Section",
        // 						},
        // 					},
        // 					Level: 1,
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Document Title",
        // 				},
        // 			},
        // 			Level: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should apply substitutions to a block title in normal order`() {
        // Input: asciidoctor/blocks_test_should_apply_substitutions_to_a_block_title_in_normal_order.adoc
        // Expected Go AST:
        // var blocksTestShouldApplySubstitutionsToABlockTitleInNormalOrder =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.UserAttributeReference{
        // 							Value: "link-url",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "[",
        // 						},
        // 						&asciidoc.UserAttributeReference{
        // 							Value: "link-text",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "]",
        // 						},
        // 						&asciidoc.UserAttributeReference{
        // 							Value: "tm",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "The one and only!",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `empty attribute list should not appear in output`() {
        // Input: asciidoctor/blocks_test_empty_attribute_list_should_not_appear_in_output.adoc
        // Expected Go AST:
        // var blocksTestEmptyAttributeListShouldNotAppearInOutput =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.OpenBlock{
        // 			AttributeList: nil,
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   7,
        // 				Length: 2,
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Block content",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `empty block anchor should not appear in output`() {
        // Input: asciidoctor/blocks_test_empty_block_anchor_should_not_appear_in_output.adoc
        // Expected Go AST:
        // var blocksTestEmptyBlockAnchorShouldNotAppearInOutput =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "[[]]",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.OpenBlock{
        // 			AttributeList: nil,
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   7,
        // 				Length: 2,
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Block content",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `can convert block image with alt text defined in macro`() {
        // Input: asciidoctor/blocks_test_can_convert_block_image_with_alt_text_defined_in_macro.adoc
        // Expected Go AST:
        // var blocksTestCanConvertBlockImageWithAltTextDefinedInMacro =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "imagesdir",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "images",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.BlockImage{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      0,
        // 					ImpliedName: "alt",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Tiger",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      1,
        // 					ImpliedName: "width",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "100",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      0,
        // 					ImpliedName: "alt",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "%interactive",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ImagePath: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "tiger.svg",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `converts SVG image with alt text using img element when safe mode is secure`() {
        // Input: asciidoctor/blocks_test_converts_svg_image_with_alt_text_using_img_element_when_safe_mode_is_secure.adoc
        // Expected Go AST:
        // var blocksTestConvertsSvgImageWithAltTextUsingImgElementWhenSafeModeIsSecure =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.BlockImage{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      0,
        // 					ImpliedName: "alt",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Tiger",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      1,
        // 					ImpliedName: "width",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "100",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      0,
        // 					ImpliedName: "alt",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "%interactive",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ImagePath: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "images/tiger.svg",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `inserts fallback image for SVG inside object element using same dimensions`() {
        // Input: asciidoctor/blocks_test_inserts_fallback_image_for_svg_inside_object_element_using_same_dimensions.adoc
        // Expected Go AST:
        // var blocksTestInsertsFallbackImageForSvgInsideObjectElementUsingSameDimensions =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "imagesdir",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "images",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.BlockImage{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      0,
        // 					ImpliedName: "alt",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Tiger",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      1,
        // 					ImpliedName: "width",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "100",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.NamedAttribute{
        // 					Name: "fallback",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "tiger.png",
        // 						},
        // 					},
        // 					Quote: 0,
        // 				},
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      0,
        // 					ImpliedName: "alt",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "%interactive",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ImagePath: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "tiger.svg",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `detects SVG image URI that contains a query string`() {
        // Input: asciidoctor/blocks_test_detects_svg_image_uri_that_contains_a_query_string.adoc
        // Expected Go AST:
        // var blocksTestDetectsSvgImageUriThatContainsAQueryString =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "imagesdir",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "images",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.BlockImage{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      0,
        // 					ImpliedName: "alt",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Tiger",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      1,
        // 					ImpliedName: "width",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "100",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      0,
        // 					ImpliedName: "alt",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "%interactive",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ImagePath: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "http://example.org/tiger.svg?foo=bar",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `detects SVG image when format attribute is svg`() {
        // Input: asciidoctor/blocks_test_detects_svg_image_when_format_attribute_is_svg.adoc
        // Expected Go AST:
        // var blocksTestDetectsSvgImageWhenFormatAttributeIsSvg =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "imagesdir",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "images",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.BlockImage{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      0,
        // 					ImpliedName: "alt",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Tiger",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      1,
        // 					ImpliedName: "width",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "100",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.NamedAttribute{
        // 					Name: "format",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "svg",
        // 						},
        // 					},
        // 					Quote: 0,
        // 				},
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      0,
        // 					ImpliedName: "alt",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "%interactive",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ImagePath: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "http://example.org/tiger-svg",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `converts to inline SVG image when inline option is set on block`() {
        // Input: asciidoctor/blocks_test_converts_to_inline_svg_image_when_inline_option_is_set_on_block.adoc
        // Expected Go AST:
        // var blocksTestConvertsToInlineSvgImageWhenInlineOptionIsSetOnBlock =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "imagesdir",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "fixtures",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.BlockImage{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      0,
        // 					ImpliedName: "alt",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Tiger",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      1,
        // 					ImpliedName: "width",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "100",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      0,
        // 					ImpliedName: "alt",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "%inline",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ImagePath: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "circle.svg",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should ignore link attribute if value is self and image target is inline SVG`() {
        // Input: asciidoctor/blocks_test_should_ignore_link_attribute_if_value_is_self_and_image_target_is_inline_svg.adoc
        // Expected Go AST:
        // var blocksTestShouldIgnoreLinkAttributeIfValueIsSelfAndImageTargetIsInlineSvg =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "imagesdir",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "fixtures",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.BlockImage{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      0,
        // 					ImpliedName: "alt",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Tiger",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      1,
        // 					ImpliedName: "width",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "100",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.NamedAttribute{
        // 					Name: "link",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "self",
        // 						},
        // 					},
        // 					Quote: 0,
        // 				},
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      0,
        // 					ImpliedName: "alt",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "%inline",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ImagePath: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "circle.svg",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should honor percentage width for SVG image with inline option`() {
        // Input: asciidoctor/blocks_test_should_honor_percentage_width_for_svg_image_with_inline_option.adoc
        // Expected Go AST:
        // var blocksTestShouldHonorPercentageWidthForSvgImageWithInlineOption =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "imagesdir",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "fixtures",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.BlockImage{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      0,
        // 					ImpliedName: "alt",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Circle",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      1,
        // 					ImpliedName: "width",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "50%",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.NamedAttribute{
        // 					Name: "opts",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "inline",
        // 						},
        // 					},
        // 					Quote: 0,
        // 				},
        // 			},
        // 			ImagePath: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "circle.svg",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not crash if explicit width on SVG image block is an integer`() {
        // Input: asciidoctor/blocks_test_should_not_crash_if_explicit_width_on_svg_image_block_is_an_integer.adoc
        // Expected Go AST:
        // var blocksTestShouldNotCrashIfExplicitWidthOnSvgImageBlockIsAnInteger =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "imagesdir",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "fixtures",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.BlockImage{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      0,
        // 					ImpliedName: "alt",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Circle",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.NamedAttribute{
        // 					Name: "opts",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "inline",
        // 						},
        // 					},
        // 					Quote: 0,
        // 				},
        // 			},
        // 			ImagePath: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "circle.svg",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `converts to inline SVG image when inline option is set on block and data-uri is set on document`() {
        // Input: asciidoctor/blocks_test_converts_to_inline_svg_image_when_inline_option_is_set_on_block_and_data_uri_is_set_on_document.adoc
        // Expected Go AST:
        // var blocksTestConvertsToInlineSvgImageWhenInlineOptionIsSetOnBlockAndDataUriIsSetOnDocument =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "imagesdir",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "fixtures",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name:     "data-uri",
        // 			Elements: nil,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.BlockImage{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      0,
        // 					ImpliedName: "alt",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Tiger",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      1,
        // 					ImpliedName: "width",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "100",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      0,
        // 					ImpliedName: "alt",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "%inline",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ImagePath: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "circle.svg",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not throw exception if SVG to inline is empty`() {
        // Input: asciidoctor/blocks_test_should_not_throw_exception_if_svg_to_inline_is_empty.adoc
        // Expected Go AST:
        // var blocksTestShouldNotThrowExceptionIfSvgToInlineIsEmpty =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.BlockImage{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      0,
        // 					ImpliedName: "alt",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Alt Text",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      0,
        // 					ImpliedName: "alt",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "%inline",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ImagePath: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "no-such-image.svg",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `can convert block image with alt text defined in macro containing square bracket`() {
        // Input: asciidoctor/blocks_test_can_convert_block_image_with_alt_text_defined_in_macro_containing_square_bracket.adoc
        // Expected Go AST:
        // var blocksTestCanConvertBlockImageWithAltTextDefinedInMacroContainingSquareBracket =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.BlockImage{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      0,
        // 					ImpliedName: "alt",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Tiger",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ImagePath: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "images/tiger.png",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `alt text in macro overrides alt text above macro`() {
        // Input: asciidoctor/blocks_test_alt_text_in_macro_overrides_alt_text_above_macro.adoc
        // Expected Go AST:
        // var blocksTestAltTextInMacroOverridesAltTextAboveMacro =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.BlockImage{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      0,
        // 					ImpliedName: "alt",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Tiger",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      0,
        // 					ImpliedName: "alt",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Alt Text",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ImagePath: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "images/tiger.png",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should substitute attribute references in alt text defined in image block macro`() {
        // Input: asciidoctor/blocks_test_should_substitute_attribute_references_in_alt_text_defined_in_image_block_macro.adoc
        // Expected Go AST:
        // var blocksTestShouldSubstituteAttributeReferencesInAltTextDefinedInImageBlockMacro =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "alt-text",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Tiger",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.BlockImage{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      0,
        // 					ImpliedName: "alt",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.UserAttributeReference{
        // 							Value: "alt-text",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ImagePath: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "images/tiger.png",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should set direction CSS class on image if float attribute is set`() {
        // Input: asciidoctor/blocks_test_should_set_direction_css_class_on_image_if_float_attribute_is_set.adoc
        // Expected Go AST:
        // var blocksTestShouldSetDirectionCssClassOnImageIfFloatAttributeIsSet =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.BlockImage{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      0,
        // 					ImpliedName: "alt",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Tiger",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.NamedAttribute{
        // 					Name: "float",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "left",
        // 						},
        // 					},
        // 					Quote: 0,
        // 				},
        // 			},
        // 			ImagePath: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "images/tiger.png",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should set text alignment CSS class on image if align attribute is set`() {
        // Input: asciidoctor/blocks_test_should_set_text_alignment_css_class_on_image_if_align_attribute_is_set.adoc
        // Expected Go AST:
        // var blocksTestShouldSetTextAlignmentCssClassOnImageIfAlignAttributeIsSet =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.BlockImage{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      0,
        // 					ImpliedName: "alt",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Tiger",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.NamedAttribute{
        // 					Name: "align",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "center",
        // 						},
        // 					},
        // 					Quote: 0,
        // 				},
        // 			},
        // 			ImagePath: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "images/tiger.png",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `style attribute is dropped from image macro`() {
        // Input: asciidoctor/blocks_test_style_attribute_is_dropped_from_image_macro.adoc
        // Expected Go AST:
        // var blocksTestStyleAttributeIsDroppedFromImageMacro =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.BlockImage{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      0,
        // 					ImpliedName: "alt",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Tiger",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.NamedAttribute{
        // 					Name: "style",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "value",
        // 						},
        // 					},
        // 					Quote: 0,
        // 				},
        // 			},
        // 			ImagePath: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "images/tiger.png",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should auto-generate alt text for block image if alt text is not specified`() {
        // Input: asciidoctor/blocks_test_should_auto_generate_alt_text_for_block_image_if_alt_text_is_not_specified.adoc
        // Expected Go AST:
        // var blocksTestShouldAutoGenerateAltTextForBlockImageIfAltTextIsNotSpecified =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.BlockImage{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      0,
        // 					ImpliedName: "alt",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Tiger",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.NamedAttribute{
        // 					Name: "link",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "http://en.wikipedia.org/wiki/Tiger",
        // 						},
        // 					},
        // 					Quote: 1,
        // 				},
        // 			},
        // 			ImagePath: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "images/tiger.png",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `can convert block image with link to self`() {
        // Input: asciidoctor/blocks_test_can_convert_block_image_with_link_to_self.adoc
        // Expected Go AST:
        // var blocksTestCanConvertBlockImageWithLinkToSelf =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "imagesdir",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "img",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.BlockImage{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      0,
        // 					ImpliedName: "alt",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Tiger",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.NamedAttribute{
        // 					Name: "link",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "self",
        // 						},
        // 					},
        // 					Quote: 0,
        // 				},
        // 			},
        // 			ImagePath: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "tiger.png",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `adds rel=noopener attribute to block image with link that targets _blank window`() {
        // Input: asciidoctor/blocks_test_adds_rel=noopener_attribute_to_block_image_with_link_that_targets__blank_window.adoc
        // Expected Go AST:
        // var blocksTestAddsRelnoopenerAttributeToBlockImageWithLinkThatTargetsBlankWindow =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.BlockImage{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      0,
        // 					ImpliedName: "alt",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Tiger",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "The AsciiDoc Tiger",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ImagePath: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "images/tiger.png",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `can convert block image with explicit caption`() {
        // Input: asciidoctor/blocks_test_can_convert_block_image_with_explicit_caption.adoc
        // Expected Go AST:
        // var blocksTestCanConvertBlockImageWithExplicitCaption =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.BlockImage{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      0,
        // 					ImpliedName: "alt",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Tiger",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.NamedAttribute{
        // 					Name: "caption",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Voila! ",
        // 						},
        // 					},
        // 					Quote: 2,
        // 				},
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "The AsciiDoc Tiger",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ImagePath: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "images/tiger.png",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `can align image in DocBook backend`() {
        // Input: asciidoctor/blocks_test_can_align_image_in_doc_book_backend.adoc
        // Expected Go AST:
        // var blocksTestCanAlignImageInDocBookBackend =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "attribute-missing",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "skip",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.BlockImage{
        // 			AttributeList: nil,
        // 			ImagePath: asciidoc.Elements{
        // 				&asciidoc.UserAttributeReference{
        // 					Value: "bogus",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not drop line if image target is missing attribute reference and attribute-missing is drop`() {
        // Input: asciidoctor/blocks_test_should_not_drop_line_if_image_target_is_missing_attribute_reference_and_attribute_missing_is_drop.adoc
        // Expected Go AST:
        // var blocksTestShouldNotDropLineIfImageTargetIsMissingAttributeReferenceAndAttributeMissingIsDrop =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "attribute-missing",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "drop",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.BlockImage{
        // 			AttributeList: nil,
        // 			ImagePath: asciidoc.Elements{
        // 				&asciidoc.UserAttributeReference{
        // 					Value: "bogus",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "/photo.jpg",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `drops line if image target is missing attribute reference and attribute-missing is drop-line`() {
        // Input: asciidoctor/blocks_test_drops_line_if_image_target_is_missing_attribute_reference_and_attribute_missing_is_drop_line.adoc
        // Expected Go AST:
        // var blocksTestDropsLineIfImageTargetIsMissingAttributeReferenceAndAttributeMissingIsDropLine =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "attribute-missing",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "drop-line",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.BlockImage{
        // 			AttributeList: nil,
        // 			ImagePath: asciidoc.Elements{
        // 				&asciidoc.UserAttributeReference{
        // 					Value: "bogus",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not drop line if image target resolves to blank and attribute-missing is drop-line`() {
        // Input: asciidoctor/blocks_test_should_not_drop_line_if_image_target_resolves_to_blank_and_attribute_missing_is_drop_line.adoc
        // Expected Go AST:
        // var blocksTestShouldNotDropLineIfImageTargetResolvesToBlankAndAttributeMissingIsDropLine =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "attribute-missing",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "drop-line",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.BlockImage{
        // 			AttributeList: nil,
        // 			ImagePath: asciidoc.Elements{
        // 				&asciidoc.CharacterReplacementReference{
        // 					Value: "blank",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `dropped image does not break processing of following section and attribute-missing is drop-line`() {
        // Input: asciidoctor/blocks_test_dropped_image_does_not_break_processing_of_following_section_and_attribute_missing_is_drop_line.adoc
        // Expected Go AST:
        // var blocksTestDroppedImageDoesNotBreakProcessingOfFollowingSectionAndAttributeMissingIsDropLine =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "attribute-missing",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "drop-line",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.BlockImage{
        // 			AttributeList: nil,
        // 			ImagePath: asciidoc.Elements{
        // 				&asciidoc.UserAttributeReference{
        // 					Value: "bogus",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Section{
        // 			AttributeList: nil,
        // 			Elements:      nil,
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Section Title",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should pass through image that references uri`() {
        // Input: asciidoctor/blocks_test_should_pass_through_image_that_references_uri.adoc
        // Expected Go AST:
        // var blocksTestShouldPassThroughImageThatReferencesUri =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "imagesdir",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "images",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.BlockImage{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      0,
        // 					ImpliedName: "alt",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Tiger",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ImagePath: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "http://asciidoc.org/images/tiger.png",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should encode spaces in image target if value is a URI`() {
        // Input: asciidoctor/blocks_test_should_encode_spaces_in_image_target_if_value_is_a_uri.adoc
        // Expected Go AST:
        // var blocksTestShouldEncodeSpacesInImageTargetIfValueIsAUri =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "imagesdir",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "images",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.BlockImage{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      0,
        // 					ImpliedName: "alt",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Tiger",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ImagePath: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "tiger.png",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `embeds base64-encoded data uri for image when data-uri attribute is set`() {
        // Input: asciidoctor/blocks_test_embeds_base_64_encoded_data_uri_for_image_when_data_uri_attribute_is_set.adoc
        // Expected Go AST:
        // var blocksTestEmbedsBase64EncodedDataUriForImageWhenDataUriAttributeIsSet =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name:     "data-uri",
        // 			Elements: nil,
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "imagesdir",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "fixtures",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.BlockImage{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      0,
        // 					ImpliedName: "alt",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Dot",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ImagePath: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "dot.gif",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `embeds SVG image with image_svg+xml mimetype when file extension is _svg`() {
        // Input: asciidoctor/blocks_test_embeds_svg_image_with_image_svg+xml_mimetype_when_file_extension_is__svg.adoc
        // Expected Go AST:
        // var blocksTestEmbedsSvgImageWithImageSvgxmlMimetypeWhenFileExtensionIsSvg =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "imagesdir",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "fixtures",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name:     "data-uri",
        // 			Elements: nil,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.BlockImage{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      0,
        // 					ImpliedName: "alt",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Tiger",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      1,
        // 					ImpliedName: "width",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "100",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ImagePath: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "circle.svg",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should link to data URI if value of link attribute is self and image is embedded`() {
        // Input: asciidoctor/blocks_test_should_link_to_data_uri_if_value_of_link_attribute_is_self_and_image_is_embedded.adoc
        // Expected Go AST:
        // var blocksTestShouldLinkToDataUriIfValueOfLinkAttributeIsSelfAndImageIsEmbedded =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "imagesdir",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "fixtures",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name:     "data-uri",
        // 			Elements: nil,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.BlockImage{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      0,
        // 					ImpliedName: "alt",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Tiger",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      1,
        // 					ImpliedName: "width",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "100",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.NamedAttribute{
        // 					Name: "link",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "self",
        // 						},
        // 					},
        // 					Quote: 0,
        // 				},
        // 			},
        // 			ImagePath: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "circle.svg",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `embeds empty base64-encoded data uri for unreadable image when data-uri attribute is set`() {
        // Input: asciidoctor/blocks_test_embeds_empty_base_64_encoded_data_uri_for_unreadable_image_when_data_uri_attribute_is_set.adoc
        // Expected Go AST:
        // var blocksTestEmbedsEmptyBase64EncodedDataUriForUnreadableImageWhenDataUriAttributeIsSet =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name:     "data-uri",
        // 			Elements: nil,
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "imagesdir",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "fixtures",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.BlockImage{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      0,
        // 					ImpliedName: "alt",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Dot",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ImagePath: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "unreadable.gif",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `embeds base64-encoded data uri with application_octet-stream mimetype when file extension is missing`() {
        // Input: asciidoctor/blocks_test_embeds_base_64_encoded_data_uri_with_application_octet_stream_mimetype_when_file_extension_is_missing.adoc
        // Expected Go AST:
        // var blocksTestEmbedsBase64EncodedDataUriWithApplicationOctetStreamMimetypeWhenFileExtensionIsMissing =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name:     "data-uri",
        // 			Elements: nil,
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "imagesdir",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "fixtures",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.BlockImage{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      0,
        // 					ImpliedName: "alt",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Dot",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ImagePath: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "dot",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `can handle embedded data uri images`() {
        // Input: asciidoctor/blocks_test_can_handle_embedded_data_uri_images.adoc
        // Expected Go AST:
        // var blocksTestCanHandleEmbeddedDataUriImages =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name:     "data-uri",
        // 			Elements: nil,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.BlockImage{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      0,
        // 					ImpliedName: "alt",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Dot",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ImagePath: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "data:image/gif;base64,R0lGODlhAQABAIAAAAUEBAAAACwAAAAAAQABAAACAkQBADs=",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `cleans reference to ancestor directories in imagesdir before reading image if safe mode level is at least SAFE`() {
        // Input: asciidoctor/blocks_test_cleans_reference_to_ancestor_directories_in_imagesdir_before_reading_image_if_safe_mode_level_is_at_least_safe.adoc
        // Expected Go AST:
        // var blocksTestCleansReferenceToAncestorDirectoriesInImagesdirBeforeReadingImageIfSafeModeLevelIsAtLeastSafe =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name:     "data-uri",
        // 			Elements: nil,
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "imagesdir",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "../..//fixtures/./../../fixtures",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.BlockImage{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      0,
        // 					ImpliedName: "alt",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Dot",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ImagePath: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "dot.gif",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `cleans reference to ancestor directories in target before reading image if safe mode level is at least SAFE`() {
        // Input: asciidoctor/blocks_test_cleans_reference_to_ancestor_directories_in_target_before_reading_image_if_safe_mode_level_is_at_least_safe.adoc
        // Expected Go AST:
        // var blocksTestCleansReferenceToAncestorDirectoriesInTargetBeforeReadingImageIfSafeModeLevelIsAtLeastSafe =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name:     "data-uri",
        // 			Elements: nil,
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "imagesdir",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "./",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.BlockImage{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      0,
        // 					ImpliedName: "alt",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Dot",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ImagePath: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "../..//fixtures/./../../fixtures/dot.gif",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should detect and convert video macro`() {
        // Input: asciidoctor/blocks_test_should_detect_and_convert_video_macro.adoc
        // Expected Go AST:
        // var blocksTestShouldDetectAndConvertVideoMacro =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "imagesdir",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "assets",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "video::cats-vs-dogs.avi[cats-and-dogs.png, 200, 300]",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `video macro should not use imagesdir attribute to resolve target if target is a URL`() {
        // Input: asciidoctor/blocks_test_video_macro_should_not_use_imagesdir_attribute_to_resolve_target_if_target_is_a_url.adoc
        // Expected Go AST:
        // var blocksTestVideoMacroShouldNotUseImagesdirAttributeToResolveTargetIfTargetIsAUrl =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "imagesdir",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "assets",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "video::",
        // 		},
        // 		&asciidoc.Link{
        // 			AttributeList: nil,
        // 			URL: asciidoc.URL{
        // 				Scheme: "http://",
        // 				Path: asciidoc.Elements{
        // 					&asciidoc.String{
        // 						Value: "example.org/videos/cats-vs-dogs.avi",
        // 					},
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `video macro should output custom HTML with iframe for vimeo service`() {
        // Input: asciidoctor/blocks_test_video_macro_should_output_custom_html_with_iframe_for_vimeo_service.adoc
        // Expected Go AST:
        // var blocksTestVideoMacroShouldOutputCustomHtmlWithIframeForVimeoService =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "imagesdir",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "assets",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "audio::podcast.mp3[]",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `audio macro should not use imagesdir attribute to resolve target if target is a URL`() {
        // Input: asciidoctor/blocks_test_audio_macro_should_not_use_imagesdir_attribute_to_resolve_target_if_target_is_a_url.adoc
        // Expected Go AST:
        // var blocksTestAudioMacroShouldNotUseImagesdirAttributeToResolveTargetIfTargetIsAUrl =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "imagesdir",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "assets",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "video::",
        // 		},
        // 		&asciidoc.Link{
        // 			AttributeList: nil,
        // 			URL: asciidoc.URL{
        // 				Scheme: "http://",
        // 				Path: asciidoc.Elements{
        // 					&asciidoc.String{
        // 						Value: "example.org/podcast.mp3",
        // 					},
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `audio macro should honor all options`() {
        // Input: asciidoctor/blocks_test_audio_macro_should_honor_all_options.adoc
        // Expected Go AST:
        // var blocksTestAudioMacroShouldHonorAllOptions =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name:     "icons",
        // 			Elements: nil,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "TIP",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "You can use icons for admonitions by setting the 'icons' attribute.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `can resolve icon relative to custom iconsdir`() {
        // Input: asciidoctor/blocks_test_can_resolve_icon_relative_to_custom_iconsdir.adoc
        // Expected Go AST:
        // var blocksTestCanResolveIconRelativeToCustomIconsdir =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name:     "icons",
        // 			Elements: nil,
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "iconsdir",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "icons",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "TIP",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "You can use icons for admonitions by setting the 'icons' attribute.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should add file extension to custom icon if not specified`() {
        // Input: asciidoctor/blocks_test_should_add_file_extension_to_custom_icon_if_not_specified.adoc
        // Expected Go AST:
        // var blocksTestShouldAddFileExtensionToCustomIconIfNotSpecified =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "icons",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "font",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "iconsdir",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "images/icons",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "TIP",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 				&asciidoc.NamedAttribute{
        // 					Name: "icon",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "a",
        // 						},
        // 					},
        // 					Quote: 0,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Override the icon of an admonition block using an attribute",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should allow icontype to be specified when using built-in admonition icon`() {
        // Input: asciidoctor/blocks_test_should_allow_icontype_to_be_specified_when_using_built_in_admonition_icon.adoc
        // Expected Go AST:
        // var blocksTestShouldAllowIcontypeToBeSpecifiedWhenUsingBuiltInAdmonitionIcon =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "TIP",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 				&asciidoc.NamedAttribute{
        // 					Name: "icon",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "hint",
        // 						},
        // 					},
        // 					Quote: 0,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Set the icontype using either the icontype attribute on the icons attribute.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `embeds base64-encoded data uri of icon when data-uri attribute is set and safe mode level is less than SECURE`() {
        // Input: asciidoctor/blocks_test_embeds_base_64_encoded_data_uri_of_icon_when_data_uri_attribute_is_set_and_safe_mode_level_is_less_than_secure.adoc
        // Expected Go AST:
        // var blocksTestEmbedsBase64EncodedDataUriOfIconWhenDataUriAttributeIsSetAndSafeModeLevelIsLessThanSecure =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name:     "icons",
        // 			Elements: nil,
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "iconsdir",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "fixtures",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "icontype",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "gif",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name:     "data-uri",
        // 			Elements: nil,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "TIP",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "You can use icons for admonitions by setting the 'icons' attribute.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should embed base64-encoded data uri of custom icon when data-uri attribute is set`() {
        // Input: asciidoctor/blocks_test_should_embed_base_64_encoded_data_uri_of_custom_icon_when_data_uri_attribute_is_set.adoc
        // Expected Go AST:
        // var blocksTestShouldEmbedBase64EncodedDataUriOfCustomIconWhenDataUriAttributeIsSet =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name:     "icons",
        // 			Elements: nil,
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "iconsdir",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "fixtures",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "icontype",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "gif",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name:     "data-uri",
        // 			Elements: nil,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "TIP",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 				&asciidoc.NamedAttribute{
        // 					Name: "icon",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "tip",
        // 						},
        // 					},
        // 					Quote: 0,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "You can set a custom icon using the icon attribute on the block.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `does not embed base64-encoded data uri of icon when safe mode level is SECURE or greater`() {
        // Input: asciidoctor/blocks_test_does_not_embed_base_64_encoded_data_uri_of_icon_when_safe_mode_level_is_secure_or_greater.adoc
        // Expected Go AST:
        // var blocksTestDoesNotEmbedBase64EncodedDataUriOfIconWhenSafeModeLevelIsSecureOrGreater =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name:     "icons",
        // 			Elements: nil,
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "iconsdir",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "fixtures",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "icontype",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "gif",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name:     "data-uri",
        // 			Elements: nil,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "TIP",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "You can use icons for admonitions by setting the 'icons' attribute.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `cleans reference to ancestor directories before reading icon if safe mode level is at least SAFE`() {
        // Input: asciidoctor/blocks_test_cleans_reference_to_ancestor_directories_before_reading_icon_if_safe_mode_level_is_at_least_safe.adoc
        // Expected Go AST:
        // var blocksTestCleansReferenceToAncestorDirectoriesBeforeReadingIconIfSafeModeLevelIsAtLeastSafe =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name:     "icons",
        // 			Elements: nil,
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "iconsdir",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "../fixtures",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "icontype",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "gif",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name:     "data-uri",
        // 			Elements: nil,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "TIP",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "You can use icons for admonitions by setting the 'icons' attribute.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should import Font Awesome and use font-based icons when value of icons attribute is font`() {
        // Input: asciidoctor/blocks_test_should_import_font_awesome_and_use_font_based_icons_when_value_of_icons_attribute_is_font.adoc
        // Expected Go AST:
        // var blocksTestShouldImportFontAwesomeAndUseFontBasedIconsWhenValueOfIconsAttributeIsFont =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "icons",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "font",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "TIP",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "You can use icons for admonitions by setting the 'icons' attribute.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `font-based icon should not override icon specified on admonition`() {
        // Input: asciidoctor/blocks_test_font_based_icon_should_not_override_icon_specified_on_admonition.adoc
        // Expected Go AST:
        // var blocksTestFontBasedIconShouldNotOverrideIconSpecifiedOnAdmonition =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "icons",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "font",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "iconsdir",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "images/icons",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "TIP",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 				&asciidoc.NamedAttribute{
        // 					Name: "icon",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "a.png",
        // 						},
        // 					},
        // 					Quote: 0,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Override the icon of an admonition block using an attribute",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should use http uri scheme for assets when asset-uri-scheme is http`() {
        // Input: asciidoctor/blocks_test_should_use_http_uri_scheme_for_assets_when_asset_uri_scheme_is_http.adoc
        // Expected Go AST:
        // var blocksTestShouldUseHttpUriSchemeForAssetsWhenAssetUriSchemeIsHttp =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "asset-uri-scheme",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "http",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "icons",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "font",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "source-highlighter",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "highlightjs",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "You can control the URI scheme used for assets with the asset-uri-scheme attribute",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 2,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "source",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      1,
        // 					ImpliedName: "",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "ruby",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "puts \"AsciiDoc, FTW!\"",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should use no uri scheme for assets when asset-uri-scheme is blank`() {
        // Input: asciidoctor/blocks_test_should_use_no_uri_scheme_for_assets_when_asset_uri_scheme_is_blank.adoc
        // Expected Go AST:
        // var blocksTestShouldUseNoUriSchemeForAssetsWhenAssetUriSchemeIsBlank =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name:     "asset-uri-scheme",
        // 			Elements: nil,
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "icons",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "font",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "source-highlighter",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "highlightjs",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "You can control the URI scheme used for assets with the asset-uri-scheme attribute",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 2,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "source",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      1,
        // 					ImpliedName: "",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "ruby",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "puts \"AsciiDoc, FTW!\"",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `restricts access to ancestor directories when safe mode level is at least SAFE`() {
        // Input: asciidoctor/blocks_test_restricts_access_to_ancestor_directories_when_safe_mode_level_is_at_least_safe.adoc
        // Expected Go AST:
        // var blocksTestRestrictsAccessToAncestorDirectoriesWhenSafeModeLevelIsAtLeastSafe =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.FencedBlock{
        // 			Delimiter: asciidoc.FencedDelimiter{
        // 				Delimiter: asciidoc.Delimiter{
        // 					Type:   4,
        // 					Length: 3,
        // 				},
        // 				Language: nil,
        // 			},
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "puts \"Hello, World!\"",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not recognize fenced code blocks with more than three delimiters`() {
        // Input: asciidoctor/blocks_test_should_not_recognize_fenced_code_blocks_with_more_than_three_delimiters.adoc
        // Expected Go AST:
        // var blocksTestShouldNotRecognizeFencedCodeBlocksWithMoreThanThreeDelimiters =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "````ruby",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "puts \"Hello, World!\"",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "````",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "~~~~ javascript",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "alert(\"Hello, World!\")",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "~~~~",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should support fenced code blocks with languages`() {
        // Input: asciidoctor/blocks_test_should_support_fenced_code_blocks_with_languages.adoc
        // Expected Go AST:
        // var blocksTestShouldSupportFencedCodeBlocksWithLanguages =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.FencedBlock{
        // 			Delimiter: asciidoc.FencedDelimiter{
        // 				Delimiter: asciidoc.Delimiter{
        // 					Type:   4,
        // 					Length: 3,
        // 				},
        // 				Language: asciidoc.Elements{
        // 					&asciidoc.String{
        // 						Value: "ruby",
        // 					},
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "puts \"Hello, World!\"",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.FencedBlock{
        // 			Delimiter: asciidoc.FencedDelimiter{
        // 				Delimiter: asciidoc.Delimiter{
        // 					Type:   4,
        // 					Length: 3,
        // 				},
        // 				Language: asciidoc.Elements{
        // 					&asciidoc.String{
        // 						Value: " javascript",
        // 					},
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "alert(\"Hello, World!\")",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should support fenced code blocks with languages and numbering`() {
        // Input: asciidoctor/blocks_test_should_support_fenced_code_blocks_with_languages_and_numbering.adoc
        // Expected Go AST:
        // var blocksTestShouldSupportFencedCodeBlocksWithLanguagesAndNumbering =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.FencedBlock{
        // 			Delimiter: asciidoc.FencedDelimiter{
        // 				Delimiter: asciidoc.Delimiter{
        // 					Type:   4,
        // 					Length: 3,
        // 				},
        // 				Language: asciidoc.Elements{
        // 					&asciidoc.String{
        // 						Value: "ruby,numbered",
        // 					},
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "puts \"Hello, World!\"",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.FencedBlock{
        // 			Delimiter: asciidoc.FencedDelimiter{
        // 				Delimiter: asciidoc.Delimiter{
        // 					Type:   4,
        // 					Length: 3,
        // 				},
        // 				Language: asciidoc.Elements{
        // 					&asciidoc.String{
        // 						Value: " javascript, numbered",
        // 					},
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "alert(\"Hello, World!\")",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should allow source style to be specified on literal block`() {
        // Input: asciidoctor/blocks_test_should_allow_source_style_to_be_specified_on_literal_block.adoc
        // Expected Go AST:
        // var blocksTestShouldAllowSourceStyleToBeSpecifiedOnLiteralBlock =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.LiteralBlock{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "source",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   6,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"console.log('Hello, World!')",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should allow source style and language to be specified on literal block`() {
        // Input: asciidoctor/blocks_test_should_allow_source_style_and_language_to_be_specified_on_literal_block.adoc
        // Expected Go AST:
        // var blocksTestShouldAllowSourceStyleAndLanguageToBeSpecifiedOnLiteralBlock =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.LiteralBlock{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "source",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      1,
        // 					ImpliedName: "",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "js",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   6,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"console.log('Hello, World!')",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should make abstract on open block without title a quote block for article`() {
        // Input: asciidoctor/blocks_test_should_make_abstract_on_open_block_without_title_a_quote_block_for_article.adoc
        // Expected Go AST:
        // var blocksTestShouldMakeAbstractOnOpenBlockWithoutTitleAQuoteBlockForArticle =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Section{
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.OpenBlock{
        // 					AttributeList: asciidoc.AttributeList{
        // 						&asciidoc.ShorthandAttribute{
        // 							Style: &asciidoc.ShorthandStyle{
        // 								Elements: asciidoc.Elements{
        // 									&asciidoc.String{
        // 										Value: "abstract",
        // 									},
        // 								},
        // 							},
        // 							ID:      nil,
        // 							Roles:   nil,
        // 							Options: nil,
        // 						},
        // 					},
        // 					Delimiter: asciidoc.Delimiter{
        // 						Type:   7,
        // 						Length: 2,
        // 					},
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "This article is about stuff.",
        // 						},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.EmptyLine{
        // 							Text: "",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "And other stuff.",
        // 						},
        // 						&asciidoc.NewLine{},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.Section{
        // 					AttributeList: nil,
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.EmptyLine{
        // 							Text: "",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "content",
        // 						},
        // 						&asciidoc.NewLine{},
        // 					},
        // 					Title: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Section One",
        // 						},
        // 					},
        // 					Level: 1,
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Article",
        // 				},
        // 			},
        // 			Level: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should make abstract on open block with title a quote block with title for article`() {
        // Input: asciidoctor/blocks_test_should_make_abstract_on_open_block_with_title_a_quote_block_with_title_for_article.adoc
        // Expected Go AST:
        // var blocksTestShouldMakeAbstractOnOpenBlockWithTitleAQuoteBlockWithTitleForArticle =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Section{
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.OpenBlock{
        // 					AttributeList: asciidoc.AttributeList{
        // 						&asciidoc.TitleAttribute{
        // 							Val: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "My abstract",
        // 								},
        // 							},
        // 						},
        // 						&asciidoc.ShorthandAttribute{
        // 							Style: &asciidoc.ShorthandStyle{
        // 								Elements: asciidoc.Elements{
        // 									&asciidoc.String{
        // 										Value: "abstract",
        // 									},
        // 								},
        // 							},
        // 							ID:      nil,
        // 							Roles:   nil,
        // 							Options: nil,
        // 						},
        // 					},
        // 					Delimiter: asciidoc.Delimiter{
        // 						Type:   7,
        // 						Length: 2,
        // 					},
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "This article is about stuff.",
        // 						},
        // 						&asciidoc.NewLine{},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.Section{
        // 					AttributeList: nil,
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.EmptyLine{
        // 							Text: "",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "content",
        // 						},
        // 						&asciidoc.NewLine{},
        // 					},
        // 					Title: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Section One",
        // 						},
        // 					},
        // 					Level: 1,
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Article",
        // 				},
        // 			},
        // 			Level: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should allow abstract in document with title if doctype is book`() {
        // Input: asciidoctor/blocks_test_should_allow_abstract_in_document_with_title_if_doctype_is_book.adoc
        // Expected Go AST:
        // var blocksTestShouldAllowAbstractInDocumentWithTitleIfDoctypeIsBook =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Section{
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.AttributeEntry{
        // 					Name: "doctype",
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "book",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.Paragraph{
        // 					AttributeList: asciidoc.AttributeList{
        // 						&asciidoc.ShorthandAttribute{
        // 							Style: &asciidoc.ShorthandStyle{
        // 								Elements: asciidoc.Elements{
        // 									&asciidoc.String{
        // 										Value: "abstract",
        // 									},
        // 								},
        // 							},
        // 							ID:      nil,
        // 							Roles:   nil,
        // 							Options: nil,
        // 						},
        // 					},
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Abstract for book with title is valid",
        // 						},
        // 						&asciidoc.NewLine{},
        // 					},
        // 					Admonition: 0,
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Book",
        // 				},
        // 			},
        // 			Level: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not allow abstract as direct child of document if doctype is book`() {
        // Input: asciidoctor/blocks_test_should_not_allow_abstract_as_direct_child_of_document_if_doctype_is_book.adoc
        // Expected Go AST:
        // var blocksTestShouldNotAllowAbstractAsDirectChildOfDocumentIfDoctypeIsBook =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "doctype",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "book",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "abstract",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Abstract for book without title is invalid.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should make abstract on open block without title converted to DocBook`() {
        // Input: asciidoctor/blocks_test_should_make_abstract_on_open_block_without_title_converted_to_doc_book.adoc
        // Expected Go AST:
        // var blocksTestShouldMakeAbstractOnOpenBlockWithoutTitleConvertedToDocBook =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Section{
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.OpenBlock{
        // 					AttributeList: asciidoc.AttributeList{
        // 						&asciidoc.ShorthandAttribute{
        // 							Style: &asciidoc.ShorthandStyle{
        // 								Elements: asciidoc.Elements{
        // 									&asciidoc.String{
        // 										Value: "abstract",
        // 									},
        // 								},
        // 							},
        // 							ID:      nil,
        // 							Roles:   nil,
        // 							Options: nil,
        // 						},
        // 					},
        // 					Delimiter: asciidoc.Delimiter{
        // 						Type:   7,
        // 						Length: 2,
        // 					},
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "This article is about stuff.",
        // 						},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.EmptyLine{
        // 							Text: "",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "And other stuff.",
        // 						},
        // 						&asciidoc.NewLine{},
        // 					},
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Article",
        // 				},
        // 			},
        // 			Level: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should make abstract on open block with title converted to DocBook`() {
        // Input: asciidoctor/blocks_test_should_make_abstract_on_open_block_with_title_converted_to_doc_book.adoc
        // Expected Go AST:
        // var blocksTestShouldMakeAbstractOnOpenBlockWithTitleConvertedToDocBook =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Section{
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.OpenBlock{
        // 					AttributeList: asciidoc.AttributeList{
        // 						&asciidoc.TitleAttribute{
        // 							Val: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "My abstract",
        // 								},
        // 							},
        // 						},
        // 						&asciidoc.ShorthandAttribute{
        // 							Style: &asciidoc.ShorthandStyle{
        // 								Elements: asciidoc.Elements{
        // 									&asciidoc.String{
        // 										Value: "abstract",
        // 									},
        // 								},
        // 							},
        // 							ID:      nil,
        // 							Roles:   nil,
        // 							Options: nil,
        // 						},
        // 					},
        // 					Delimiter: asciidoc.Delimiter{
        // 						Type:   7,
        // 						Length: 2,
        // 					},
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "This article is about stuff.",
        // 						},
        // 						&asciidoc.NewLine{},
        // 					},
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Article",
        // 				},
        // 			},
        // 			Level: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should allow abstract in document with title if doctype is book converted to DocBook`() {
        // Input: asciidoctor/blocks_test_should_allow_abstract_in_document_with_title_if_doctype_is_book_converted_to_doc_book.adoc
        // Expected Go AST:
        // var blocksTestShouldAllowAbstractInDocumentWithTitleIfDoctypeIsBookConvertedToDocBook =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Section{
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.AttributeEntry{
        // 					Name: "doctype",
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "book",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.Paragraph{
        // 					AttributeList: asciidoc.AttributeList{
        // 						&asciidoc.ShorthandAttribute{
        // 							Style: &asciidoc.ShorthandStyle{
        // 								Elements: asciidoc.Elements{
        // 									&asciidoc.String{
        // 										Value: "abstract",
        // 									},
        // 								},
        // 							},
        // 							ID:      nil,
        // 							Roles:   nil,
        // 							Options: nil,
        // 						},
        // 					},
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Abstract for book with title is valid",
        // 						},
        // 						&asciidoc.NewLine{},
        // 					},
        // 					Admonition: 0,
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Book",
        // 				},
        // 			},
        // 			Level: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not allow abstract as direct child of document if doctype is book converted to DocBook`() {
        // Input: asciidoctor/blocks_test_should_not_allow_abstract_as_direct_child_of_document_if_doctype_is_book_converted_to_doc_book.adoc
        // Expected Go AST:
        // var blocksTestShouldNotAllowAbstractAsDirectChildOfDocumentIfDoctypeIsBookConvertedToDocBook =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "doctype",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "book",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "abstract",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Abstract for book is invalid.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should accept partintro on open block without title`() {
        // Input: asciidoctor/blocks_test_should_accept_partintro_on_open_block_without_title.adoc
        // Expected Go AST:
        // var blocksTestShouldAcceptPartintroOnOpenBlockWithoutTitle =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Section{
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.AttributeEntry{
        // 					Name: "doctype",
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "book",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Book",
        // 				},
        // 			},
        // 			Level: 0,
        // 		},
        // 		&asciidoc.Section{
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.OpenBlock{
        // 					AttributeList: asciidoc.AttributeList{
        // 						&asciidoc.ShorthandAttribute{
        // 							Style: &asciidoc.ShorthandStyle{
        // 								Elements: asciidoc.Elements{
        // 									&asciidoc.String{
        // 										Value: "partintro",
        // 									},
        // 								},
        // 							},
        // 							ID:      nil,
        // 							Roles:   nil,
        // 							Options: nil,
        // 						},
        // 					},
        // 					Delimiter: asciidoc.Delimiter{
        // 						Type:   7,
        // 						Length: 2,
        // 					},
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "This is a part intro.",
        // 						},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.EmptyLine{
        // 							Text: "",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "It can have multiple paragraphs.",
        // 						},
        // 						&asciidoc.NewLine{},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.Section{
        // 					AttributeList: nil,
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.EmptyLine{
        // 							Text: "",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "content",
        // 						},
        // 						&asciidoc.NewLine{},
        // 					},
        // 					Title: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Chapter 1",
        // 						},
        // 					},
        // 					Level: 1,
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Part 1",
        // 				},
        // 			},
        // 			Level: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should accept partintro on open block with title`() {
        // Input: asciidoctor/blocks_test_should_accept_partintro_on_open_block_with_title.adoc
        // Expected Go AST:
        // var blocksTestShouldAcceptPartintroOnOpenBlockWithTitle =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Section{
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.AttributeEntry{
        // 					Name: "doctype",
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "book",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Book",
        // 				},
        // 			},
        // 			Level: 0,
        // 		},
        // 		&asciidoc.Section{
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.OpenBlock{
        // 					AttributeList: asciidoc.AttributeList{
        // 						&asciidoc.TitleAttribute{
        // 							Val: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Intro title",
        // 								},
        // 							},
        // 						},
        // 						&asciidoc.ShorthandAttribute{
        // 							Style: &asciidoc.ShorthandStyle{
        // 								Elements: asciidoc.Elements{
        // 									&asciidoc.String{
        // 										Value: "partintro",
        // 									},
        // 								},
        // 							},
        // 							ID:      nil,
        // 							Roles:   nil,
        // 							Options: nil,
        // 						},
        // 					},
        // 					Delimiter: asciidoc.Delimiter{
        // 						Type:   7,
        // 						Length: 2,
        // 					},
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "This is a part intro with a title.",
        // 						},
        // 						&asciidoc.NewLine{},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.Section{
        // 					AttributeList: nil,
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.EmptyLine{
        // 							Text: "",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "content",
        // 						},
        // 						&asciidoc.NewLine{},
        // 					},
        // 					Title: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Chapter 1",
        // 						},
        // 					},
        // 					Level: 1,
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Part 1",
        // 				},
        // 			},
        // 			Level: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should exclude partintro if not a child of part`() {
        // Input: asciidoctor/blocks_test_should_exclude_partintro_if_not_a_child_of_part.adoc
        // Expected Go AST:
        // var blocksTestShouldExcludePartintroIfNotAChildOfPart =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Section{
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.AttributeEntry{
        // 					Name: "doctype",
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "book",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.Paragraph{
        // 					AttributeList: asciidoc.AttributeList{
        // 						&asciidoc.ShorthandAttribute{
        // 							Style: &asciidoc.ShorthandStyle{
        // 								Elements: asciidoc.Elements{
        // 									&asciidoc.String{
        // 										Value: "partintro",
        // 									},
        // 								},
        // 							},
        // 							ID:      nil,
        // 							Roles:   nil,
        // 							Options: nil,
        // 						},
        // 					},
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "part intro paragraph",
        // 						},
        // 						&asciidoc.NewLine{},
        // 					},
        // 					Admonition: 0,
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Book",
        // 				},
        // 			},
        // 			Level: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not allow partintro unless doctype is book`() {
        // Input: asciidoctor/blocks_test_should_not_allow_partintro_unless_doctype_is_book.adoc
        // Expected Go AST:
        // var blocksTestShouldNotAllowPartintroUnlessDoctypeIsBook =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "partintro",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "part intro paragraph",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should accept partintro on open block without title converted to DocBook`() {
        // Input: asciidoctor/blocks_test_should_accept_partintro_on_open_block_without_title_converted_to_doc_book.adoc
        // Expected Go AST:
        // var blocksTestShouldAcceptPartintroOnOpenBlockWithoutTitleConvertedToDocBook =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Section{
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.AttributeEntry{
        // 					Name: "doctype",
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "book",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Book",
        // 				},
        // 			},
        // 			Level: 0,
        // 		},
        // 		&asciidoc.Section{
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.OpenBlock{
        // 					AttributeList: asciidoc.AttributeList{
        // 						&asciidoc.ShorthandAttribute{
        // 							Style: &asciidoc.ShorthandStyle{
        // 								Elements: asciidoc.Elements{
        // 									&asciidoc.String{
        // 										Value: "partintro",
        // 									},
        // 								},
        // 							},
        // 							ID:      nil,
        // 							Roles:   nil,
        // 							Options: nil,
        // 						},
        // 					},
        // 					Delimiter: asciidoc.Delimiter{
        // 						Type:   7,
        // 						Length: 2,
        // 					},
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "This is a part intro.",
        // 						},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.EmptyLine{
        // 							Text: "",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "It can have multiple paragraphs.",
        // 						},
        // 						&asciidoc.NewLine{},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.Section{
        // 					AttributeList: nil,
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.EmptyLine{
        // 							Text: "",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "content",
        // 						},
        // 						&asciidoc.NewLine{},
        // 					},
        // 					Title: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Chapter 1",
        // 						},
        // 					},
        // 					Level: 1,
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Part 1",
        // 				},
        // 			},
        // 			Level: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should accept partintro on open block with title converted to DocBook`() {
        // Input: asciidoctor/blocks_test_should_accept_partintro_on_open_block_with_title_converted_to_doc_book.adoc
        // Expected Go AST:
        // var blocksTestShouldAcceptPartintroOnOpenBlockWithTitleConvertedToDocBook =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Section{
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.AttributeEntry{
        // 					Name: "doctype",
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "book",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Book",
        // 				},
        // 			},
        // 			Level: 0,
        // 		},
        // 		&asciidoc.Section{
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.OpenBlock{
        // 					AttributeList: asciidoc.AttributeList{
        // 						&asciidoc.TitleAttribute{
        // 							Val: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Intro title",
        // 								},
        // 							},
        // 						},
        // 						&asciidoc.ShorthandAttribute{
        // 							Style: &asciidoc.ShorthandStyle{
        // 								Elements: asciidoc.Elements{
        // 									&asciidoc.String{
        // 										Value: "partintro",
        // 									},
        // 								},
        // 							},
        // 							ID:      nil,
        // 							Roles:   nil,
        // 							Options: nil,
        // 						},
        // 					},
        // 					Delimiter: asciidoc.Delimiter{
        // 						Type:   7,
        // 						Length: 2,
        // 					},
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "This is a part intro with a title.",
        // 						},
        // 						&asciidoc.NewLine{},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.Section{
        // 					AttributeList: nil,
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.EmptyLine{
        // 							Text: "",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "content",
        // 						},
        // 						&asciidoc.NewLine{},
        // 					},
        // 					Title: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Chapter 1",
        // 						},
        // 					},
        // 					Level: 1,
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Part 1",
        // 				},
        // 			},
        // 			Level: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should exclude partintro if not a child of part converted to DocBook`() {
        // Input: asciidoctor/blocks_test_should_exclude_partintro_if_not_a_child_of_part_converted_to_doc_book.adoc
        // Expected Go AST:
        // var blocksTestShouldExcludePartintroIfNotAChildOfPartConvertedToDocBook =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Section{
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.AttributeEntry{
        // 					Name: "doctype",
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "book",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.Paragraph{
        // 					AttributeList: asciidoc.AttributeList{
        // 						&asciidoc.ShorthandAttribute{
        // 							Style: &asciidoc.ShorthandStyle{
        // 								Elements: asciidoc.Elements{
        // 									&asciidoc.String{
        // 										Value: "partintro",
        // 									},
        // 								},
        // 							},
        // 							ID:      nil,
        // 							Roles:   nil,
        // 							Options: nil,
        // 						},
        // 					},
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "part intro paragraph",
        // 						},
        // 						&asciidoc.NewLine{},
        // 					},
        // 					Admonition: 0,
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Book",
        // 				},
        // 			},
        // 			Level: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not allow partintro unless doctype is book converted to DocBook`() {
        // Input: asciidoctor/blocks_test_should_not_allow_partintro_unless_doctype_is_book_converted_to_doc_book.adoc
        // Expected Go AST:
        // var blocksTestShouldNotAllowPartintroUnlessDoctypeIsBookConvertedToDocBook =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "partintro",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "part intro paragraph",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `processor should not crash if subs are empty`() {
        // Input: asciidoctor/blocks_test_processor_should_not_crash_if_subs_are_empty.adoc
        // Expected Go AST:
        // var blocksTestProcessorShouldNotCrashIfSubsAreEmpty =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.LiteralBlock{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.NamedAttribute{
        // 					Name: "subs",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: ",",
        // 						},
        // 					},
        // 					Quote: 2,
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   6,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"content",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should be able to append subs to default block substitution list`() {
        // Input: asciidoctor/blocks_test_should_be_able_to_append_subs_to_default_block_substitution_list.adoc
        // Expected Go AST:
        // var blocksTestShouldBeAbleToAppendSubsToDefaultBlockSubstitutionList =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "application",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Asciidoctor",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.LiteralBlock{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.NamedAttribute{
        // 					Name: "subs",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "+attributes,+macros",
        // 						},
        // 					},
        // 					Quote: 2,
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   6,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"{application}",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should be able to prepend subs to default block substitution list`() {
        // Input: asciidoctor/blocks_test_should_be_able_to_prepend_subs_to_default_block_substitution_list.adoc
        // Expected Go AST:
        // var blocksTestShouldBeAbleToPrependSubsToDefaultBlockSubstitutionList =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "application",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Asciidoctor",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.LiteralBlock{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.NamedAttribute{
        // 					Name: "subs",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "attributes+",
        // 						},
        // 					},
        // 					Quote: 2,
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   6,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"{application}",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should be able to remove subs to default block substitution list`() {
        // Input: asciidoctor/blocks_test_should_be_able_to_remove_subs_to_default_block_substitution_list.adoc
        // Expected Go AST:
        // var blocksTestShouldBeAbleToRemoveSubsToDefaultBlockSubstitutionList =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.NamedAttribute{
        // 					Name: "subs",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "-quotes,-replacements",
        // 						},
        // 					},
        // 					Quote: 2,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "content",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should be able to prepend, append and remove subs from default block substitution list`() {
        // Input: asciidoctor/blocks_test_should_be_able_to_prepend_append_and_remove_subs_from_default_block_substitution_list.adoc
        // Expected Go AST:
        // var blocksTestShouldBeAbleToPrependAppendAndRemoveSubsFromDefaultBlockSubstitutionList =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "application",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "asciidoctor",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.LiteralBlock{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.NamedAttribute{
        // 					Name: "subs",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "attributes+,-verbatim,+specialcharacters,+macros",
        // 						},
        // 					},
        // 					Quote: 2,
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   6,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"https://{application}.org[{gt}{gt}] <1>",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should be able to set subs then modify them`() {
        // Input: asciidoctor/blocks_test_should_be_able_to_set_subs_then_modify_them.adoc
        // Expected Go AST:
        // var blocksTestShouldBeAbleToSetSubsThenModifyThem =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.NamedAttribute{
        // 					Name: "subs",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "verbatim,-callouts",
        // 						},
        // 					},
        // 					Quote: 2,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.Italic{
        // 					AttributeList: nil,
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "hey now",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.String{
        // 					Value: " <1>",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not recognize block anchor with illegal id characters`() {
        // Input: asciidoctor/blocks_test_should_not_recognize_block_anchor_with_illegal_id_characters.adoc
        // Expected Go AST:
        // var blocksTestShouldNotRecognizeBlockAnchorWithIllegalIdCharacters =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "[[illegal$id,Reference Text]]",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.Listing{
        // 			AttributeList: nil,
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   5,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"content",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not recognize block anchor that starts with digit`() {
        // Input: asciidoctor/blocks_test_should_not_recognize_block_anchor_that_starts_with_digit.adoc
        // Expected Go AST:
        // var blocksTestShouldNotRecognizeBlockAnchorThatStartsWithDigit =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "[[3-blind-mice]]",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.OpenBlock{
        // 			AttributeList: nil,
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   7,
        // 				Length: 2,
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "see how they run",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should recognize block anchor that starts with colon`() {
        // Input: asciidoctor/blocks_test_should_recognize_block_anchor_that_starts_with_colon.adoc
        // Expected Go AST:
        // var blocksTestShouldRecognizeBlockAnchorThatStartsWithColon =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.OpenBlock{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.AnchorAttribute{
        // 					ID: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: ":idname",
        // 						},
        // 					},
        // 					Label: nil,
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   7,
        // 				Length: 2,
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "content",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should use specified id and reftext when registering block reference`() {
        // Input: asciidoctor/blocks_test_should_use_specified_id_and_reftext_when_registering_block_reference.adoc
        // Expected Go AST:
        // var blocksTestShouldUseSpecifiedIdAndReftextWhenRegisteringBlockReference =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Listing{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.AnchorAttribute{
        // 					ID: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "debian",
        // 						},
        // 					},
        // 					Label: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Debian Install",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Installation on Debian",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   5,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"$ apt-get install asciidoctor",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should allow square brackets in block reference text`() {
        // Input: asciidoctor/blocks_test_should_allow_square_brackets_in_block_reference_text.adoc
        // Expected Go AST:
        // var blocksTestShouldAllowSquareBracketsInBlockReferenceText =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "[[debian,[Debian] Install]]",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.Listing{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Installation on Debian",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   5,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"$ apt-get install asciidoctor",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should allow comma in block reference text`() {
        // Input: asciidoctor/blocks_test_should_allow_comma_in_block_reference_text.adoc
        // Expected Go AST:
        // var blocksTestShouldAllowCommaInBlockReferenceText =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Listing{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.AnchorAttribute{
        // 					ID: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "debian",
        // 						},
        // 					},
        // 					Label: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: " Debian, Ubuntu",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Installation on Debian",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   5,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"$ apt-get install asciidoctor",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should resolve attribute reference in title using attribute defined at location of block`() {
        // Input: asciidoctor/blocks_test_should_resolve_attribute_reference_in_title_using_attribute_defined_at_location_of_block.adoc
        // Expected Go AST:
        // var blocksTestShouldResolveAttributeReferenceInTitleUsingAttributeDefinedAtLocationOfBlock =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Section{
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.AttributeEntry{
        // 					Name: "foo",
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "baz",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "intro paragraph. see ",
        // 				},
        // 				&asciidoc.CrossReference{
        // 					AttributeList: nil,
        // 					Elements:      nil,
        // 					ID: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "free-standing",
        // 						},
        // 					},
        // 					Format: 0,
        // 				},
        // 				&asciidoc.String{
        // 					Value: ".",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.AttributeEntry{
        // 					Name: "foo",
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "bar",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.Paragraph{
        // 					AttributeList: asciidoc.AttributeList{
        // 						&asciidoc.TitleAttribute{
        // 							Val: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "foo is ",
        // 								},
        // 								&asciidoc.UserAttributeReference{
        // 									Value: "foo",
        // 								},
        // 							},
        // 						},
        // 						&asciidoc.ShorthandAttribute{
        // 							Style: nil,
        // 							ID: &asciidoc.ShorthandID{
        // 								Elements: asciidoc.Elements{
        // 									&asciidoc.String{
        // 										Value: "formal-para",
        // 									},
        // 								},
        // 							},
        // 							Roles:   nil,
        // 							Options: nil,
        // 						},
        // 					},
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "paragraph with title",
        // 						},
        // 						&asciidoc.NewLine{},
        // 					},
        // 					Admonition: 0,
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.Section{
        // 					AttributeList: asciidoc.AttributeList{
        // 						&asciidoc.ShorthandAttribute{
        // 							Style: &asciidoc.ShorthandStyle{
        // 								Elements: asciidoc.Elements{
        // 									&asciidoc.String{
        // 										Value: "discrete",
        // 									},
        // 								},
        // 							},
        // 							ID: &asciidoc.ShorthandID{
        // 								Elements: asciidoc.Elements{
        // 									&asciidoc.String{
        // 										Value: "free-standing",
        // 									},
        // 								},
        // 							},
        // 							Roles:   nil,
        // 							Options: nil,
        // 						},
        // 					},
        // 					Elements: nil,
        // 					Title: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "foo is still {foo}",
        // 						},
        // 					},
        // 					Level: 1,
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Document Title",
        // 				},
        // 			},
        // 			Level: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should substitute attribute references in reftext when registering block reference`() {
        // Input: asciidoctor/blocks_test_should_substitute_attribute_references_in_reftext_when_registering_block_reference.adoc
        // Expected Go AST:
        // var blocksTestShouldSubstituteAttributeReferencesInReftextWhenRegisteringBlockReference =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "label-tiger",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Tiger",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.SidebarBlock{
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   8,
        // 				Length: 4,
        // 			},
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.AnchorAttribute{
        // 					ID: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "tiger-evolution",
        // 						},
        // 					},
        // 					Label: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Evolution of the ",
        // 						},
        // 						&asciidoc.UserAttributeReference{
        // 							Value: "label-tiger",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Information about the evolution of the tiger.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should use specified reftext when registering block reference`() {
        // Input: asciidoctor/blocks_test_should_use_specified_reftext_when_registering_block_reference.adoc
        // Expected Go AST:
        // var blocksTestShouldUseSpecifiedReftextWhenRegisteringBlockReference =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Listing{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.AnchorAttribute{
        // 					ID: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "debian",
        // 						},
        // 					},
        // 					Label: nil,
        // 				},
        // 				&asciidoc.NamedAttribute{
        // 					Name: "reftext",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Debian Install",
        // 						},
        // 					},
        // 					Quote: 2,
        // 				},
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Installation on Debian",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   5,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"$ apt-get install asciidoctor",
        // 			},
        // 		},
        // 	},
        // }
    }

}
