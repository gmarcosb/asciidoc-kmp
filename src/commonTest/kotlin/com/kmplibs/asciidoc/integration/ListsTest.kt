package com.kmplibs.asciidoc.integration

import com.kmplibs.asciidoc.*
import kotlin.test.Test
import kotlin.test.Ignore

class ListsTest {

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `dash elements with no blank lines`() {
        // Input: asciidoctor/lists_test_dash_elements_with_no_blank_lines.adoc
        // Expected Go AST:
        // var listsTestDashElementsWithNoBlankLines =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "List",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "====",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Foo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Boo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Blech",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `dash elements separated by blank lines should merge lists`() {
        // Input: asciidoctor/lists_test_dash_elements_separated_by_blank_lines_should_merge_lists.adoc
        // Expected Go AST:
        // var listsTestDashElementsSeparatedByBlankLinesShouldMergeLists =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "List",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "====",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Foo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Boo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Blech",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `dash elements with interspersed line comments should be skipped and not break list`() {
        // Input: asciidoctor/lists_test_dash_elements_with_interspersed_line_comments_should_be_skipped_and_not_break_list.adoc
        // Expected Go AST:
        // var listsTestDashElementsWithInterspersedLineCommentsShouldBeSkippedAndNotBreakList =
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
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Foo",
        // 						},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "// line comment",
        // 						},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "// another line comment",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        "-",
        // 					Checklist:     0,
        // 				},
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Boo",
        // 						},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "// line comment",
        // 						},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "more text",
        // 						},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "// another line comment",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        "-",
        // 					Checklist:     0,
        // 				},
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Blech",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        "-",
        // 					Checklist:     0,
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "List",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `dash elements separated by a line comment offset by blank lines should not merge lists`() {
        // Input: asciidoctor/lists_test_dash_elements_separated_by_a_line_comment_offset_by_blank_lines_should_not_merge_lists.adoc
        // Expected Go AST:
        // var listsTestDashElementsSeparatedByALineCommentOffsetByBlankLinesShouldNotMergeLists =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "List",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "====",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Foo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Boo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.SingleLineComment{
        // 			Value: "",
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Blech",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `dash elements separated by a block title offset by a blank line should not merge lists`() {
        // Input: asciidoctor/lists_test_dash_elements_separated_by_a_block_title_offset_by_a_blank_line_should_not_merge_lists.adoc
        // Expected Go AST:
        // var listsTestDashElementsSeparatedByABlockTitleOffsetByABlankLineShouldNotMergeLists =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "List",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "====",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Foo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Boo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Blech",
        // 				},
        // 			},
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Also",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Indent:    "",
        // 			Marker:    "-",
        // 			Checklist: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `dash elements separated by an attribute entry offset by a blank line should not merge lists`() {
        // Input: asciidoctor/lists_test_dash_elements_separated_by_an_attribute_entry_offset_by_a_blank_line_should_not_merge_lists.adoc
        // Expected Go AST:
        // var listsTestDashElementsSeparatedByAnAttributeEntryOffsetByABlankLineShouldNotMergeLists =
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
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Foo",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        "-",
        // 					Checklist:     0,
        // 				},
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Boo",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        "-",
        // 					Checklist:     0,
        // 				},
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
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Blech",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        "-",
        // 					Checklist:     0,
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "List",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `a non-indented wrapped line is folded into text of list item`() {
        // Input: asciidoctor/lists_test_a_non_indented_wrapped_line_is_folded_into_text_of_list_item.adoc
        // Expected Go AST:
        // var listsTestANonIndentedWrappedLineIsFoldedIntoTextOfListItem =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "List",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "====",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Foo",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "wrapped content",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Boo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Blech",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `a non-indented wrapped line that resembles a block title is folded into text of list item`() {
        // Input: asciidoctor/lists_test_a_non_indented_wrapped_line_that_resembles_a_block_title_is_folded_into_text_of_list_item.adoc
        // Expected Go AST:
        // var listsTestANonIndentedWrappedLineThatResemblesABlockTitleIsFoldedIntoTextOfListItem =
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
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Foo",
        // 						},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: ".wrapped content",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        "-",
        // 					Checklist:     0,
        // 				},
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Boo",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        "-",
        // 					Checklist:     0,
        // 				},
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Blech",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        "-",
        // 					Checklist:     0,
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "List",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `a non-indented wrapped line that resembles an attribute entry is folded into text of list item`() {
        // Input: asciidoctor/lists_test_a_non_indented_wrapped_line_that_resembles_an_attribute_entry_is_folded_into_text_of_list_item.adoc
        // Expected Go AST:
        // var listsTestANonIndentedWrappedLineThatResemblesAnAttributeEntryIsFoldedIntoTextOfListItem =
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
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Foo",
        // 						},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: ":foo: bar",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        "-",
        // 					Checklist:     0,
        // 				},
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Boo",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        "-",
        // 					Checklist:     0,
        // 				},
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Blech",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        "-",
        // 					Checklist:     0,
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "List",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `a list item with a nested marker terminates non-indented paragraph for text of list item`() {
        // Input: asciidoctor/lists_test_a_list_item_with_a_nested_marker_terminates_non_indented_paragraph_for_text_of_list_item.adoc
        // Expected Go AST:
        // var listsTestAListItemWithANestedMarkerTerminatesNonIndentedParagraphForTextOfListItem =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Foo",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "Bar",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Foo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `a list item for a different list terminates non-indented paragraph for text of list item`() {
        // Input: asciidoctor/lists_test_a_list_item_for_a_different_list_terminates_non_indented_paragraph_for_text_of_list_item.adoc
        // Expected Go AST:
        // var listsTestAListItemForADifferentListTerminatesNonIndentedParagraphForTextOfListItem =
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
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Foo",
        // 						},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "Bar",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        "-",
        // 					Checklist:     0,
        // 				},
        // 				&asciidoc.OrderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Foo",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        ".",
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Example 1",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 		&asciidoc.Section{
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Item",
        // 						},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "text",
        // 						},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "term:: def",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        "*",
        // 					Checklist:     0,
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Example 2",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `an indented wrapped line is unindented and folded into text of list item`() {
        // Input: asciidoctor/lists_test_an_indented_wrapped_line_is_unindented_and_folded_into_text_of_list_item.adoc
        // Expected Go AST:
        // var listsTestAnIndentedWrappedLineIsUnindentedAndFoldedIntoTextOfListItem =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "List",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "====",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Foo",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "  wrapped content",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Boo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Blech",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `wrapped list item with hanging indent followed by non-indented line`() {
        // Input: asciidoctor/lists_test_wrapped_list_item_with_hanging_indent_followed_by_non_indented_line.adoc
        // Expected Go AST:
        // var listsTestWrappedListItemWithHangingIndentFollowedByNonIndentedLine =
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
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "list item 1",
        // 						},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "  // not line comment",
        // 						},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "second wrapped line",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        "-",
        // 					Checklist:     0,
        // 				},
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "list item 2",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        "-",
        // 					Checklist:     0,
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `a list item with a nested marker terminates indented paragraph for text of list item`() {
        // Input: asciidoctor/lists_test_a_list_item_with_a_nested_marker_terminates_indented_paragraph_for_text_of_list_item.adoc
        // Expected Go AST:
        // var listsTestAListItemWithANestedMarkerTerminatesIndentedParagraphForTextOfListItem =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Foo",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "  Bar",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Foo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `a list item for a different list terminates indented paragraph for text of list item`() {
        // Input: asciidoctor/lists_test_a_list_item_for_a_different_list_terminates_indented_paragraph_for_text_of_list_item.adoc
        // Expected Go AST:
        // var listsTestAListItemForADifferentListTerminatesIndentedParagraphForTextOfListItem =
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
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Foo",
        // 						},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "  Bar",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        "-",
        // 					Checklist:     0,
        // 				},
        // 				&asciidoc.OrderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Foo",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        ".",
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Example 1",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 		&asciidoc.Section{
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Item",
        // 						},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "  text",
        // 						},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "term:: def",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        "*",
        // 					Checklist:     0,
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Example 2",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `a literal paragraph offset by blank lines in list content is appended as a literal block`() {
        // Input: asciidoctor/lists_test_a_literal_paragraph_offset_by_blank_lines_in_list_content_is_appended_as_a_literal_block.adoc
        // Expected Go AST:
        // var listsTestALiteralParagraphOffsetByBlankLinesInListContentIsAppendedAsALiteralBlock =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "List",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "====",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Foo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "  literal",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Boo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Blech",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should escape special characters in all literal paragraphs attached to list item`() {
        // Input: asciidoctor/lists_test_should_escape_special_characters_in_all_literal_paragraphs_attached_to_list_item.adoc
        // Expected Go AST:
        // var listsTestShouldEscapeSpecialCharactersInAllLiteralParagraphsAttachedToListItem =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "first item",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "  <code>text</code>",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "  more <code>text</code>",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "second item",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `a literal paragraph offset by a blank line in list content followed by line with continuation is appended as two blocks`() {
        // Input: asciidoctor/lists_test_a_literal_paragraph_offset_by_a_blank_line_in_list_content_followed_by_line_with_continuation_is_appended_as_two_blocks.adoc
        // Expected Go AST:
        // var listsTestALiteralParagraphOffsetByABlankLineInListContentFollowedByLineWithContinuationIsAppendedAsTwoBlocks =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "List",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "====",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Foo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "  literal",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.LineBreak{},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "para",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Boo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Blech",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `an admonition paragraph attached by a line continuation to a list item with wrapped text should produce admonition`() {
        // Input: asciidoctor/lists_test_an_admonition_paragraph_attached_by_a_line_continuation_to_a_list_item_with_wrapped_text_should_produce_admonition.adoc
        // Expected Go AST:
        // var listsTestAnAdmonitionParagraphAttachedByALineContinuationToAListItemWithWrappedTextShouldProduceAdmonition =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "first-line text",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "  wrapped text",
        // 				},
        // 				&asciidoc.ListContinuation{
        // 					ChildElement: &asciidoc.Paragraph{
        // 						AttributeList: nil,
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.Paragraph{
        // 								AttributeList: nil,
        // 								Elements: asciidoc.Elements{
        // 									&asciidoc.String{
        // 										Value: "This is a note.",
        // 									},
        // 								},
        // 								Admonition: 1,
        // 							},
        // 						},
        // 						Admonition: 0,
        // 					},
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `paragraph-like blocks attached to an ancestor list item by a list continuation should produce blocks`() {
        // Input: asciidoctor/lists_test_paragraph_like_blocks_attached_to_an_ancestor_list_item_by_a_list_continuation_should_produce_blocks.adoc
        // Expected Go AST:
        // var listsTestParagraphLikeBlocksAttachedToAnAncestorListItemByAListContinuationShouldProduceBlocks =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "parent",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "child",
        // 				},
        // 				&asciidoc.ListContinuation{
        // 					ChildElement: &asciidoc.Paragraph{
        // 						AttributeList: nil,
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.Paragraph{
        // 								AttributeList: nil,
        // 								Elements: asciidoc.Elements{
        // 									&asciidoc.String{
        // 										Value: "This is a note.",
        // 									},
        // 								},
        // 								Admonition: 1,
        // 							},
        // 						},
        // 						Admonition: 0,
        // 					},
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        " ",
        // 			Marker:        "**",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "another parent",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "another child",
        // 				},
        // 				&asciidoc.ListContinuation{
        // 					ChildElement: &asciidoc.ThematicBreak{
        // 						AttributeList: nil,
        // 					},
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        " ",
        // 			Marker:        "**",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not inherit block attributes from previous block when block is attached using a list continuation`() {
        // Input: asciidoctor/lists_test_should_not_inherit_block_attributes_from_previous_block_when_block_is_attached_using_a_list_continuation.adoc
        // Expected Go AST:
        // var listsTestShouldNotInheritBlockAttributesFromPreviousBlockWhenBlockIsAttachedUsingAListContinuation =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "complex list item",
        // 				},
        // 				&asciidoc.ListContinuation{
        // 					ChildElement: &asciidoc.Listing{
        // 						AttributeList: asciidoc.AttributeList{
        // 							&asciidoc.ShorthandAttribute{
        // 								Style: &asciidoc.ShorthandStyle{
        // 									Elements: asciidoc.Elements{
        // 										&asciidoc.String{
        // 											Value: "source",
        // 										},
        // 									},
        // 								},
        // 								ID:      nil,
        // 								Roles:   nil,
        // 								Options: nil,
        // 							},
        // 							&asciidoc.PositionalAttribute{
        // 								Offset:      1,
        // 								ImpliedName: "",
        // 								Val: asciidoc.Elements{
        // 									&asciidoc.String{
        // 										Value: "xml",
        // 									},
        // 								},
        // 							},
        // 						},
        // 						Delimiter: asciidoc.Delimiter{
        // 							Type:   5,
        // 							Length: 4,
        // 						},
        // 						LineList: asciidoc.LineList{
        // 							"<name>value</name> <!--1-->",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.String{
        // 			Value: "<1> a configuration value",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should continue to parse blocks attached by a list continuation after block is dropped`() {
        // Input: asciidoctor/lists_test_should_continue_to_parse_blocks_attached_by_a_list_continuation_after_block_is_dropped.adoc
        // Expected Go AST:
        // var listsTestShouldContinueToParseBlocksAttachedByAListContinuationAfterBlockIsDropped =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "item",
        // 				},
        // 				&asciidoc.ListContinuation{
        // 					ChildElement: &asciidoc.Paragraph{
        // 						AttributeList: nil,
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "paragraph",
        // 							},
        // 						},
        // 						Admonition: 0,
        // 					},
        // 				},
        // 				&asciidoc.ListContinuation{
        // 					ChildElement: &asciidoc.Paragraph{
        // 						AttributeList: nil,
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "[comment]",
        // 							},
        // 						},
        // 						Admonition: 0,
        // 					},
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.String{
        // 			Value: "comment",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.LineBreak{},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.ExampleBlock{
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   3,
        // 				Length: 4,
        // 			},
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "example",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 		&asciidoc.ThematicBreak{
        // 			AttributeList: nil,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `appends line as paragraph if attached by continuation following line comment`() {
        // Input: asciidoctor/lists_test_appends_line_as_paragraph_if_attached_by_continuation_following_line_comment.adoc
        // Expected Go AST:
        // var listsTestAppendsLineAsParagraphIfAttachedByContinuationFollowingLineComment =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "list item 1",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "// line comment",
        // 				},
        // 				&asciidoc.ListContinuation{
        // 					ChildElement: &asciidoc.Paragraph{
        // 						AttributeList: nil,
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "paragraph in list item 1",
        // 							},
        // 						},
        // 						Admonition: 0,
        // 					},
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "list item 2",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `a literal paragraph with a line that appears as a list item that is followed by a continuation should create two blocks`() {
        // Input: asciidoctor/lists_test_a_literal_paragraph_with_a_line_that_appears_as_a_list_item_that_is_followed_by_a_continuation_should_create_two_blocks.adoc
        // Expected Go AST:
        // var listsTestALiteralParagraphWithALineThatAppearsAsAListItemThatIsFollowedByAContinuationShouldCreateTwoBlocks =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Foo",
        // 				},
        // 				&asciidoc.ListContinuation{
        // 					ChildElement: &asciidoc.Paragraph{
        // 						AttributeList: nil,
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "  literal",
        // 							},
        // 						},
        // 						Admonition: 0,
        // 					},
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "still literal",
        // 				},
        // 				&asciidoc.ListContinuation{
        // 					ChildElement: &asciidoc.Paragraph{
        // 						AttributeList: nil,
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "para",
        // 							},
        // 						},
        // 						Admonition: 0,
        // 					},
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        ".",
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Bar",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `consecutive literal paragraph offset by blank lines in list content are appended as a literal blocks`() {
        // Input: asciidoctor/lists_test_consecutive_literal_paragraph_offset_by_blank_lines_in_list_content_are_appended_as_a_literal_blocks.adoc
        // Expected Go AST:
        // var listsTestConsecutiveLiteralParagraphOffsetByBlankLinesInListContentAreAppendedAsALiteralBlocks =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "List",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "====",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Foo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "  literal",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "  more",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "  literal",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Boo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Blech",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `a literal paragraph without a trailing blank line consumes following list items`() {
        // Input: asciidoctor/lists_test_a_literal_paragraph_without_a_trailing_blank_line_consumes_following_list_items.adoc
        // Expected Go AST:
        // var listsTestALiteralParagraphWithoutATrailingBlankLineConsumesFollowingListItems =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "List",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "====",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Foo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "  literal",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Boo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Blech",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `asterisk elements with no blank lines`() {
        // Input: asciidoctor/lists_test_asterisk_elements_with_no_blank_lines.adoc
        // Expected Go AST:
        // var listsTestAsteriskElementsWithNoBlankLines =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "List",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "====",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Foo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Boo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Blech",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `asterisk elements separated by blank lines should merge lists`() {
        // Input: asciidoctor/lists_test_asterisk_elements_separated_by_blank_lines_should_merge_lists.adoc
        // Expected Go AST:
        // var listsTestAsteriskElementsSeparatedByBlankLinesShouldMergeLists =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "List",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "====",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Foo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Boo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Blech",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `asterisk elements with interspersed line comments should be skipped and not break list`() {
        // Input: asciidoctor/lists_test_asterisk_elements_with_interspersed_line_comments_should_be_skipped_and_not_break_list.adoc
        // Expected Go AST:
        // var listsTestAsteriskElementsWithInterspersedLineCommentsShouldBeSkippedAndNotBreakList =
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
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Foo",
        // 						},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "// line comment",
        // 						},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "// another line comment",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        "*",
        // 					Checklist:     0,
        // 				},
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Boo",
        // 						},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "// line comment",
        // 						},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "more text",
        // 						},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "// another line comment",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        "*",
        // 					Checklist:     0,
        // 				},
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Blech",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        "*",
        // 					Checklist:     0,
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "List",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `asterisk elements separated by a line comment offset by blank lines should not merge lists`() {
        // Input: asciidoctor/lists_test_asterisk_elements_separated_by_a_line_comment_offset_by_blank_lines_should_not_merge_lists.adoc
        // Expected Go AST:
        // var listsTestAsteriskElementsSeparatedByALineCommentOffsetByBlankLinesShouldNotMergeLists =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "List",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "====",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Foo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Boo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.SingleLineComment{
        // 			Value: "",
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Blech",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `asterisk elements separated by a block title offset by a blank line should not merge lists`() {
        // Input: asciidoctor/lists_test_asterisk_elements_separated_by_a_block_title_offset_by_a_blank_line_should_not_merge_lists.adoc
        // Expected Go AST:
        // var listsTestAsteriskElementsSeparatedByABlockTitleOffsetByABlankLineShouldNotMergeLists =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "List",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "====",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Foo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Boo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Blech",
        // 				},
        // 			},
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Also",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Indent:    "",
        // 			Marker:    "*",
        // 			Checklist: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `asterisk elements separated by an attribute entry offset by a blank line should not merge lists`() {
        // Input: asciidoctor/lists_test_asterisk_elements_separated_by_an_attribute_entry_offset_by_a_blank_line_should_not_merge_lists.adoc
        // Expected Go AST:
        // var listsTestAsteriskElementsSeparatedByAnAttributeEntryOffsetByABlankLineShouldNotMergeLists =
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
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Foo",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        "*",
        // 					Checklist:     0,
        // 				},
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Boo",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        "*",
        // 					Checklist:     0,
        // 				},
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
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Blech",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        "*",
        // 					Checklist:     0,
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "List",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `list should terminate before next lower section heading`() {
        // Input: asciidoctor/lists_test_list_should_terminate_before_next_lower_section_heading.adoc
        // Expected Go AST:
        // var listsTestListShouldTerminateBeforeNextLowerSectionHeading =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "List",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "====",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "first",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "item",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "second",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "item",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Section{
        // 			AttributeList: nil,
        // 			Elements:      nil,
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
    fun `list should terminate before next lower section heading with implicit id`() {
        // Input: asciidoctor/lists_test_list_should_terminate_before_next_lower_section_heading_with_implicit_id.adoc
        // Expected Go AST:
        // var listsTestListShouldTerminateBeforeNextLowerSectionHeadingWithImplicitId =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "List",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "====",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "first",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "item",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "second",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "item",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Section{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.AnchorAttribute{
        // 					ID: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "sec",
        // 						},
        // 					},
        // 					Label: nil,
        // 				},
        // 			},
        // 			Elements: nil,
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
    fun `should not find section title immediately below last list item`() {
        // Input: asciidoctor/lists_test_should_not_find_section_title_immediately_below_last_list_item.adoc
        // Expected Go AST:
        // var listsTestShouldNotFindSectionTitleImmediatelyBelowLastListItem =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "first",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "second",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "== Not a section",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `quoted text`() {
        // Input: asciidoctor/lists_test_quoted_text.adoc
        // Expected Go AST:
        // var listsTestQuotedText =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "List",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "====",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "I am ",
        // 				},
        // 				&asciidoc.Bold{
        // 					AttributeList: nil,
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "strong",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.String{
        // 					Value: ".",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "I am ",
        // 				},
        // 				&asciidoc.Italic{
        // 					AttributeList: nil,
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "stressed",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.String{
        // 					Value: ".",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "I am ",
        // 				},
        // 				&asciidoc.Monospace{
        // 					AttributeList: nil,
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "flexible",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.String{
        // 					Value: ".",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `attribute substitutions`() {
        // Input: asciidoctor/lists_test_attribute_substitutions.adoc
        // Expected Go AST:
        // var listsTestAttributeSubstitutions =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "List",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "====",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "foo",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "bar",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "side a ",
        // 				},
        // 				&asciidoc.CharacterReplacementReference{
        // 					Value: "vbar",
        // 				},
        // 				&asciidoc.String{
        // 					Value: " side b",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Take me to a ",
        // 				},
        // 				&asciidoc.UserAttributeReference{
        // 					Value: "foo",
        // 				},
        // 				&asciidoc.String{
        // 					Value: ".",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `leading dot is treated as text not block title`() {
        // Input: asciidoctor/lists_test_leading_dot_is_treated_as_text_not_block_title.adoc
        // Expected Go AST:
        // var listsTestLeadingDotIsTreatedAsTextNotBlockTitle =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: ".first",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: ".second",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: ".third",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `word ending sentence on continuing line not treated as a list item`() {
        // Input: asciidoctor/lists_test_word_ending_sentence_on_continuing_line_not_treated_as_a_list_item.adoc
        // Expected Go AST:
        // var listsTestWordEndingSentenceOnContinuingLineNotTreatedAsAListItem =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "This is the story about",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "   AsciiDoc. It begins here.",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "A.",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "And it ends here.",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "B.",
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should discover anchor at start of unordered list item text and register it as a reference`() {
        // Input: asciidoctor/lists_test_should_discover_anchor_at_start_of_unordered_list_item_text_and_register_it_as_a_reference.adoc
        // Expected Go AST:
        // var listsTestShouldDiscoverAnchorAtStartOfUnorderedListItemTextAndRegisterItAsAReference =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "The highest peak in the Front Range is ",
        // 		},
        // 		&asciidoc.CrossReference{
        // 			AttributeList: nil,
        // 			Elements:      nil,
        // 			ID: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "grays-peak",
        // 				},
        // 			},
        // 			Format: 0,
        // 		},
        // 		&asciidoc.String{
        // 			Value: ", which tops ",
        // 		},
        // 		&asciidoc.CrossReference{
        // 			AttributeList: nil,
        // 			Elements:      nil,
        // 			ID: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "mount-evans",
        // 				},
        // 			},
        // 			Format: 0,
        // 		},
        // 		&asciidoc.String{
        // 			Value: " by just a few feet.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.Anchor{
        // 					ID: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "mount-evans",
        // 						},
        // 					},
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Mount Evans",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.String{
        // 					Value: "At 14,271 feet, Mount Evans is the highest summit of the Chicago Peaks in the Front Range of the Rocky Mountains.",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.Anchor{
        // 					ID: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "grays-peak",
        // 						},
        // 					},
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Grays Peak",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "Grays Peak rises to 14,278 feet, making it the highest summit in the Front Range of the Rocky Mountains.",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Longs Peak is a 14,259-foot high, prominent mountain summit in the northern Front Range of the Rocky Mountains.",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Pikes Peak is the highest summit of the southern Front Range of the Rocky Mountains at 14,115 feet.",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should discover anchor at start of ordered list item text and register it as a reference`() {
        // Input: asciidoctor/lists_test_should_discover_anchor_at_start_of_ordered_list_item_text_and_register_it_as_a_reference.adoc
        // Expected Go AST:
        // var listsTestShouldDiscoverAnchorAtStartOfOrderedListItemTextAndRegisterItAsAReference =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "This is a cross-reference to ",
        // 		},
        // 		&asciidoc.CrossReference{
        // 			AttributeList: nil,
        // 			Elements:      nil,
        // 			ID: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "step-2",
        // 				},
        // 			},
        // 			Format: 0,
        // 		},
        // 		&asciidoc.String{
        // 			Value: ".",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "This is a cross-reference to ",
        // 		},
        // 		&asciidoc.CrossReference{
        // 			AttributeList: nil,
        // 			Elements:      nil,
        // 			ID: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "step-4",
        // 				},
        // 			},
        // 			Format: 0,
        // 		},
        // 		&asciidoc.String{
        // 			Value: ".",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Ordered list, item 1, without anchor",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        ".",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.Anchor{
        // 					ID: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "step-2",
        // 						},
        // 					},
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Step 2",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.String{
        // 					Value: "Ordered list, item 2, with anchor",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        ".",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Ordered list, item 3, without anchor",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        ".",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.Anchor{
        // 					ID: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "step-4",
        // 						},
        // 					},
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Step 4",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.String{
        // 					Value: "Ordered list, item 4, with anchor",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        ".",
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should discover anchor at start of callout list item text and register it as a reference`() {
        // Input: asciidoctor/lists_test_should_discover_anchor_at_start_of_callout_list_item_text_and_register_it_as_a_reference.adoc
        // Expected Go AST:
        // var listsTestShouldDiscoverAnchorAtStartOfCalloutListItemTextAndRegisterItAsAReference =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "This is a cross-reference to ",
        // 		},
        // 		&asciidoc.CrossReference{
        // 			AttributeList: nil,
        // 			Elements:      nil,
        // 			ID: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "url-mapping",
        // 				},
        // 			},
        // 			Format: 0,
        // 		},
        // 		&asciidoc.String{
        // 			Value: ".",
        // 		},
        // 		&asciidoc.NewLine{},
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
        // 				"require 'sinatra' <1>",
        // 				"",
        // 				"get '/hi' do <2> <3>",
        // 				"  \"Hello World!\"",
        // 				"end",
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: "<1> Library import",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "<2> ",
        // 		},
        // 		&asciidoc.Anchor{
        // 			ID: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "url-mapping",
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "url mapping",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: "URL mapping",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "<3> Response block",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `asterisk element mixed with dash elements should be nested`() {
        // Input: asciidoctor/lists_test_asterisk_element_mixed_with_dash_elements_should_be_nested.adoc
        // Expected Go AST:
        // var listsTestAsteriskElementMixedWithDashElementsShouldBeNested =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "List",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "====",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Foo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Boo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Blech",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `dash element mixed with asterisks elements should be nested`() {
        // Input: asciidoctor/lists_test_dash_element_mixed_with_asterisks_elements_should_be_nested.adoc
        // Expected Go AST:
        // var listsTestDashElementMixedWithAsterisksElementsShouldBeNested =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "List",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "====",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Foo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Boo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Blech",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `lines prefixed with alternating list markers separated by blank lines should be nested`() {
        // Input: asciidoctor/lists_test_lines_prefixed_with_alternating_list_markers_separated_by_blank_lines_should_be_nested.adoc
        // Expected Go AST:
        // var listsTestLinesPrefixedWithAlternatingListMarkersSeparatedByBlankLinesShouldBeNested =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "List",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "====",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Foo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Boo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Blech",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `nested elements (2) with asterisks`() {
        // Input: asciidoctor/lists_test_nested_elements_(2)_with_asterisks.adoc
        // Expected Go AST:
        // var listsTestNestedElements2WithAsterisks =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "List",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "====",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Foo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Boo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "**",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Blech",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `nested elements (3) with asterisks`() {
        // Input: asciidoctor/lists_test_nested_elements_(3)_with_asterisks.adoc
        // Expected Go AST:
        // var listsTestNestedElements3WithAsterisks =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "List",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "====",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Foo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Boo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "**",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Snoo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "***",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Blech",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `nested elements (4) with asterisks`() {
        // Input: asciidoctor/lists_test_nested_elements_(4)_with_asterisks.adoc
        // Expected Go AST:
        // var listsTestNestedElements4WithAsterisks =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "List",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "====",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Foo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Boo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "**",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Snoo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "***",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Froo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "****",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Blech",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `nested elements (5) with asterisks`() {
        // Input: asciidoctor/lists_test_nested_elements_(5)_with_asterisks.adoc
        // Expected Go AST:
        // var listsTestNestedElements5WithAsterisks =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "List",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "====",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Foo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Boo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "**",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Snoo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "***",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Froo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "****",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Groo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*****",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Blech",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `level of unordered list should match section level`() {
        // Input: asciidoctor/lists_test_level_of_unordered_list_should_match_section_level.adoc
        // Expected Go AST:
        // var listsTestLevelOfUnorderedListShouldMatchSectionLevel =
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
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "item 1.1",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        "*",
        // 					Checklist:     0,
        // 				},
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "item 2.1",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        " ",
        // 					Marker:        "**",
        // 					Checklist:     0,
        // 				},
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "item 3.1",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "  ",
        // 					Marker:        "***",
        // 					Checklist:     0,
        // 				},
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "item 2.2",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        " ",
        // 					Marker:        "**",
        // 					Checklist:     0,
        // 				},
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "item 1.2",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        "*",
        // 					Checklist:     0,
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
        // 						&asciidoc.UnorderedListItem{
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "item 1.1",
        // 								},
        // 							},
        // 							AttributeList: nil,
        // 							Indent:        "",
        // 							Marker:        "*",
        // 							Checklist:     0,
        // 						},
        // 					},
        // 					Title: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Nested Section",
        // 						},
        // 					},
        // 					Level: 2,
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Parent Section",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `does not recognize lists with repeating unicode bullets`() {
        // Input: asciidoctor/lists_test_does_not_recognize_lists_with_repeating_unicode_bullets.adoc
        // Expected Go AST:
        // var listsTestDoesNotRecognizeListsWithRepeatingUnicodeBullets =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "List",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "====",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Foo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        ".",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Boo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "..",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Blech",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        ".",
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `nested ordered elements (3)`() {
        // Input: asciidoctor/lists_test_nested_ordered_elements_(3).adoc
        // Expected Go AST:
        // var listsTestNestedOrderedElements3 =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "List",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "====",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Foo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        ".",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Boo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "..",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Snoo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "...",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Blech",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        ".",
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `level of ordered list should match section level`() {
        // Input: asciidoctor/lists_test_level_of_ordered_list_should_match_section_level.adoc
        // Expected Go AST:
        // var listsTestLevelOfOrderedListShouldMatchSectionLevel =
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
        // 				&asciidoc.OrderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "item 1.1",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        ".",
        // 				},
        // 				&asciidoc.OrderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "item 2.1",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        " ",
        // 					Marker:        "..",
        // 				},
        // 				&asciidoc.OrderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "item 3.1",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "  ",
        // 					Marker:        "...",
        // 				},
        // 				&asciidoc.OrderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "item 2.2",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        " ",
        // 					Marker:        "..",
        // 				},
        // 				&asciidoc.OrderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "item 1.2",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        ".",
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
        // 						&asciidoc.OrderedListItem{
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "item 1.1",
        // 								},
        // 							},
        // 							AttributeList: nil,
        // 							Indent:        "",
        // 							Marker:        ".",
        // 						},
        // 					},
        // 					Title: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Nested Section",
        // 						},
        // 					},
        // 					Level: 2,
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Parent Section",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `nested unordered inside ordered elements`() {
        // Input: asciidoctor/lists_test_nested_unordered_inside_ordered_elements.adoc
        // Expected Go AST:
        // var listsTestNestedUnorderedInsideOrderedElements =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "List",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "====",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Foo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        ".",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Boo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Blech",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        ".",
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `nested ordered inside unordered elements`() {
        // Input: asciidoctor/lists_test_nested_ordered_inside_unordered_elements.adoc
        // Expected Go AST:
        // var listsTestNestedOrderedInsideUnorderedElements =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "List",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "====",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Foo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Boo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        ".",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Blech",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `three levels of alternating unordered and ordered elements`() {
        // Input: asciidoctor/lists_test_three_levels_of_alternating_unordered_and_ordered_elements.adoc
        // Expected Go AST:
        // var listsTestThreeLevelsOfAlternatingUnorderedAndOrderedElements =
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
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "bullet 1",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        "*",
        // 					Checklist:     0,
        // 				},
        // 				&asciidoc.OrderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "numbered 1.1",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        ".",
        // 				},
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "bullet 1.1.1",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        "**",
        // 					Checklist:     0,
        // 				},
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "bullet 2",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        "*",
        // 					Checklist:     0,
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `lines with alternating markers of unordered and ordered list types separated by blank lines should be nested`() {
        // Input: asciidoctor/lists_test_lines_with_alternating_markers_of_unordered_and_ordered_list_types_separated_by_blank_lines_should_be_nested.adoc
        // Expected Go AST:
        // var listsTestLinesWithAlternatingMarkersOfUnorderedAndOrderedListTypesSeparatedByBlankLinesShouldBeNested =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "List",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "====",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Foo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Boo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        ".",
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Blech",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `list item with literal content should not consume nested list of different type`() {
        // Input: asciidoctor/lists_test_list_item_with_literal_content_should_not_consume_nested_list_of_different_type.adoc
        // Expected Go AST:
        // var listsTestListItemWithLiteralContentShouldNotConsumeNestedListOfDifferentType =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "List",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "====",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "bullet",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "  literal",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "  but not",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "  hungry",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "numbered",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        ".",
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `nested list item does not eat the title of the following detached block`() {
        // Input: asciidoctor/lists_test_nested_list_item_does_not_eat_the_title_of_the_following_detached_block.adoc
        // Expected Go AST:
        // var listsTestNestedListItemDoesNotEatTheTitleOfTheFollowingDetachedBlock =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "List",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "====",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "bullet",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "nested bullet 1",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "  ",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "nested bullet 2",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "  ",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.LiteralBlock{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Title",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   6,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"literal",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `lines with alternating markers of bulleted and description list types separated by blank lines should be nested`() {
        // Input: asciidoctor/lists_test_lines_with_alternating_markers_of_bulleted_and_description_list_types_separated_by_blank_lines_should_be_nested.adoc
        // Expected Go AST:
        // var listsTestLinesWithAlternatingMarkersOfBulletedAndDescriptionListTypesSeparatedByBlankLinesShouldBeNested =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "List",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "====",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Foo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "term1:: def1",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Blech",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `nested ordered with attribute inside unordered elements`() {
        // Input: asciidoctor/lists_test_nested_ordered_with_attribute_inside_unordered_elements.adoc
        // Expected Go AST:
        // var listsTestNestedOrderedWithAttributeInsideUnorderedElements =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Blah",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "====",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Foo",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "[start=2]",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Boo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        ".",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Blech",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `adjacent list continuation line attaches following paragraph`() {
        // Input: asciidoctor/lists_test_adjacent_list_continuation_line_attaches_following_paragraph.adoc
        // Expected Go AST:
        // var listsTestAdjacentListContinuationLineAttachesFollowingParagraph =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Lists",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "=====",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Item one, paragraph one",
        // 				},
        // 				&asciidoc.ListContinuation{
        // 					ChildElement: &asciidoc.Paragraph{
        // 						AttributeList: nil,
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "Item one, paragraph two",
        // 							},
        // 						},
        // 						Admonition: 0,
        // 					},
        // 				},
        // 				&asciidoc.ListContinuation{
        // 					ChildElement: &asciidoc.UnorderedListItem{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "Item two",
        // 							},
        // 						},
        // 						AttributeList: nil,
        // 						Indent:        "",
        // 						Marker:        "*",
        // 						Checklist:     0,
        // 					},
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `adjacent list continuation line attaches following block`() {
        // Input: asciidoctor/lists_test_adjacent_list_continuation_line_attaches_following_block.adoc
        // Expected Go AST:
        // var listsTestAdjacentListContinuationLineAttachesFollowingBlock =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Lists",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "=====",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Item one, paragraph one",
        // 				},
        // 				&asciidoc.ListContinuation{
        // 					ChildElement: &asciidoc.LiteralBlock{
        // 						AttributeList: nil,
        // 						Delimiter: asciidoc.Delimiter{
        // 							Type:   6,
        // 							Length: 4,
        // 						},
        // 						LineList: asciidoc.LineList{
        // 							"Item one, literal block",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.ListContinuation{
        // 					ChildElement: &asciidoc.UnorderedListItem{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "Item two",
        // 							},
        // 						},
        // 						AttributeList: nil,
        // 						Indent:        "",
        // 						Marker:        "*",
        // 						Checklist:     0,
        // 					},
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `adjacent list continuation line attaches following block with block attributes`() {
        // Input: asciidoctor/lists_test_adjacent_list_continuation_line_attaches_following_block_with_block_attributes.adoc
        // Expected Go AST:
        // var listsTestAdjacentListContinuationLineAttachesFollowingBlockWithBlockAttributes =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Lists",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "=====",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Item one, paragraph one",
        // 				},
        // 				&asciidoc.ListContinuation{
        // 					ChildElement: &asciidoc.AttributeEntry{
        // 						Name: "foo",
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "bar",
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.Listing{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.AnchorAttribute{
        // 					ID: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "beck",
        // 						},
        // 					},
        // 					Label: nil,
        // 				},
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Read the following aloud to yourself",
        // 						},
        // 					},
        // 				},
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
        // 				"5.times { print \"Odelay!\" }",
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Item two",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `trailing block attribute line attached by continuation should not create block`() {
        // Input: asciidoctor/lists_test_trailing_block_attribute_line_attached_by_continuation_should_not_create_block.adoc
        // Expected Go AST:
        // var listsTestTrailingBlockAttributeLineAttachedByContinuationShouldNotCreateBlock =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Lists",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "=====",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Item one, paragraph one",
        // 				},
        // 				&asciidoc.ListContinuation{
        // 					ChildElement: &asciidoc.UnorderedListItem{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "Item two",
        // 							},
        // 						},
        // 						AttributeList: asciidoc.AttributeList{
        // 							&asciidoc.ShorthandAttribute{
        // 								Style: &asciidoc.ShorthandStyle{
        // 									Elements: asciidoc.Elements{
        // 										&asciidoc.String{
        // 											Value: "source",
        // 										},
        // 									},
        // 								},
        // 								ID:      nil,
        // 								Roles:   nil,
        // 								Options: nil,
        // 							},
        // 						},
        // 						Indent:    "",
        // 						Marker:    "*",
        // 						Checklist: 0,
        // 					},
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `trailing block title line attached by continuation should not create block`() {
        // Input: asciidoctor/lists_test_trailing_block_title_line_attached_by_continuation_should_not_create_block.adoc
        // Expected Go AST:
        // var listsTestTrailingBlockTitleLineAttachedByContinuationShouldNotCreateBlock =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Lists",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "=====",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Item one, paragraph one",
        // 				},
        // 				&asciidoc.ListContinuation{
        // 					ChildElement: &asciidoc.UnorderedListItem{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "Item two",
        // 							},
        // 						},
        // 						AttributeList: asciidoc.AttributeList{
        // 							&asciidoc.TitleAttribute{
        // 								Val: asciidoc.Elements{
        // 									&asciidoc.String{
        // 										Value: "Disappears into the ether",
        // 									},
        // 								},
        // 							},
        // 						},
        // 						Indent:    "",
        // 						Marker:    "*",
        // 						Checklist: 0,
        // 					},
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `consecutive blocks in list continuation attach to list item`() {
        // Input: asciidoctor/lists_test_consecutive_blocks_in_list_continuation_attach_to_list_item.adoc
        // Expected Go AST:
        // var listsTestConsecutiveBlocksInListContinuationAttachToListItem =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Lists",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "=====",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Item one, paragraph one",
        // 				},
        // 				&asciidoc.ListContinuation{
        // 					ChildElement: &asciidoc.LiteralBlock{
        // 						AttributeList: nil,
        // 						Delimiter: asciidoc.Delimiter{
        // 							Type:   6,
        // 							Length: 4,
        // 						},
        // 						LineList: asciidoc.LineList{
        // 							"Item one, literal block",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.ListContinuation{
        // 					ChildElement: &asciidoc.QuoteBlock{
        // 						Delimiter: asciidoc.Delimiter{
        // 							Type:   11,
        // 							Length: 4,
        // 						},
        // 						AttributeList: nil,
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "Item one, quote block",
        // 							},
        // 							&asciidoc.NewLine{},
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.ListContinuation{
        // 					ChildElement: &asciidoc.UnorderedListItem{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "Item two",
        // 							},
        // 						},
        // 						AttributeList: nil,
        // 						Indent:        "",
        // 						Marker:        "*",
        // 						Checklist:     0,
        // 					},
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `list item with hanging indent followed by block attached by list continuation`() {
        // Input: asciidoctor/lists_test_list_item_with_hanging_indent_followed_by_block_attached_by_list_continuation.adoc
        // Expected Go AST:
        // var listsTestListItemWithHangingIndentFollowedByBlockAttachedByListContinuation =
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
        // 				&asciidoc.OrderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "list item 1",
        // 						},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "  continued",
        // 						},
        // 						&asciidoc.ListContinuation{
        // 							ChildElement: &asciidoc.OpenBlock{
        // 								AttributeList: nil,
        // 								Delimiter: asciidoc.Delimiter{
        // 									Type:   7,
        // 									Length: 2,
        // 								},
        // 								Elements: asciidoc.Elements{
        // 									&asciidoc.String{
        // 										Value: "open block in list item 1",
        // 									},
        // 									&asciidoc.NewLine{},
        // 								},
        // 							},
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        ".",
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.OrderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "list item 2",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        ".",
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `list item paragraph in list item and nested list item`() {
        // Input: asciidoctor/lists_test_list_item_paragraph_in_list_item_and_nested_list_item.adoc
        // Expected Go AST:
        // var listsTestListItemParagraphInListItemAndNestedListItem =
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
        // 				&asciidoc.OrderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "list item 1",
        // 						},
        // 						&asciidoc.ListContinuation{
        // 							ChildElement: &asciidoc.Paragraph{
        // 								AttributeList: nil,
        // 								Elements: asciidoc.Elements{
        // 									&asciidoc.String{
        // 										Value: "list item 1 paragraph",
        // 									},
        // 								},
        // 								Admonition: 0,
        // 							},
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        ".",
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "nested list item",
        // 						},
        // 						&asciidoc.ListContinuation{
        // 							ChildElement: &asciidoc.Paragraph{
        // 								AttributeList: nil,
        // 								Elements: asciidoc.Elements{
        // 									&asciidoc.String{
        // 										Value: "nested list item paragraph",
        // 									},
        // 								},
        // 								Admonition: 0,
        // 							},
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        "*",
        // 					Checklist:     0,
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.OrderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "list item 2",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        ".",
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `trailing list continuations should attach to list items at respective levels`() {
        // Input: asciidoctor/lists_test_trailing_list_continuations_should_attach_to_list_items_at_respective_levels.adoc
        // Expected Go AST:
        // var listsTestTrailingListContinuationsShouldAttachToListItemsAtRespectiveLevels =
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
        // 				&asciidoc.OrderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "list item 1",
        // 						},
        // 						&asciidoc.ListContinuation{
        // 							ChildElement: &asciidoc.UnorderedListItem{
        // 								Elements: asciidoc.Elements{
        // 									&asciidoc.String{
        // 										Value: "nested list item 1",
        // 									},
        // 								},
        // 								AttributeList: nil,
        // 								Indent:        "",
        // 								Marker:        "*",
        // 								Checklist:     0,
        // 							},
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        ".",
        // 				},
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "nested list item 2",
        // 						},
        // 						&asciidoc.ListContinuation{
        // 							ChildElement: &asciidoc.Paragraph{
        // 								AttributeList: nil,
        // 								Elements: asciidoc.Elements{
        // 									&asciidoc.String{
        // 										Value: "paragraph for nested list item 2",
        // 									},
        // 								},
        // 								Admonition: 0,
        // 							},
        // 						},
        // 						&asciidoc.ListContinuation{
        // 							ChildElement: &asciidoc.Paragraph{
        // 								AttributeList: nil,
        // 								Elements: asciidoc.Elements{
        // 									&asciidoc.String{
        // 										Value: "paragraph for list item 1",
        // 									},
        // 								},
        // 								Admonition: 0,
        // 							},
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        "*",
        // 					Checklist:     0,
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.OrderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "list item 2",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        ".",
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `trailing list continuations should attach to list items of different types at respective levels`() {
        // Input: asciidoctor/lists_test_trailing_list_continuations_should_attach_to_list_items_of_different_types_at_respective_levels.adoc
        // Expected Go AST:
        // var listsTestTrailingListContinuationsShouldAttachToListItemsOfDifferentTypesAtRespectiveLevels =
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
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "bullet 1",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        "*",
        // 					Checklist:     0,
        // 				},
        // 				&asciidoc.OrderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "numbered 1.1",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        ".",
        // 				},
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "bullet 1.1.1",
        // 						},
        // 						&asciidoc.ListContinuation{
        // 							ChildElement: &asciidoc.Paragraph{
        // 								AttributeList: nil,
        // 								Elements: asciidoc.Elements{
        // 									&asciidoc.String{
        // 										Value: "numbered 1.1 paragraph",
        // 									},
        // 								},
        // 								Admonition: 0,
        // 							},
        // 						},
        // 						&asciidoc.ListContinuation{
        // 							ChildElement: &asciidoc.Paragraph{
        // 								AttributeList: nil,
        // 								Elements: asciidoc.Elements{
        // 									&asciidoc.String{
        // 										Value: "bullet 1 paragraph",
        // 									},
        // 								},
        // 								Admonition: 0,
        // 							},
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        "**",
        // 					Checklist:     0,
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "bullet 2",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        "*",
        // 					Checklist:     0,
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `repeated list continuations should attach to list items at respective levels`() {
        // Input: asciidoctor/lists_test_repeated_list_continuations_should_attach_to_list_items_at_respective_levels.adoc
        // Expected Go AST:
        // var listsTestRepeatedListContinuationsShouldAttachToListItemsAtRespectiveLevels =
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
        // 				&asciidoc.OrderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "list item 1",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        ".",
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "nested list item 1",
        // 						},
        // 						&asciidoc.ListContinuation{
        // 							ChildElement: &asciidoc.OpenBlock{
        // 								AttributeList: nil,
        // 								Delimiter: asciidoc.Delimiter{
        // 									Type:   7,
        // 									Length: 2,
        // 								},
        // 								Elements: asciidoc.Elements{
        // 									&asciidoc.String{
        // 										Value: "open block for nested list item 1",
        // 									},
        // 									&asciidoc.NewLine{},
        // 								},
        // 							},
        // 						},
        // 						&asciidoc.ListContinuation{
        // 							ChildElement: &asciidoc.UnorderedListItem{
        // 								Elements: asciidoc.Elements{
        // 									&asciidoc.String{
        // 										Value: "nested list item 2",
        // 									},
        // 									&asciidoc.ListContinuation{
        // 										ChildElement: &asciidoc.Paragraph{
        // 											AttributeList: nil,
        // 											Elements: asciidoc.Elements{
        // 												&asciidoc.String{
        // 													Value: "paragraph for nested list item 2",
        // 												},
        // 											},
        // 											Admonition: 0,
        // 										},
        // 									},
        // 									&asciidoc.ListContinuation{
        // 										ChildElement: &asciidoc.Paragraph{
        // 											AttributeList: nil,
        // 											Elements: asciidoc.Elements{
        // 												&asciidoc.String{
        // 													Value: "paragraph for list item 1",
        // 												},
        // 											},
        // 											Admonition: 0,
        // 										},
        // 									},
        // 								},
        // 								AttributeList: nil,
        // 								Indent:        "",
        // 								Marker:        "*",
        // 								Checklist:     0,
        // 							},
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        "*",
        // 					Checklist:     0,
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.OrderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "list item 2",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        ".",
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `repeated list continuations attached directly to list item should attach to list items at respective levels`() {
        // Input: asciidoctor/lists_test_repeated_list_continuations_attached_directly_to_list_item_should_attach_to_list_items_at_respective_levels.adoc
        // Expected Go AST:
        // var listsTestRepeatedListContinuationsAttachedDirectlyToListItemShouldAttachToListItemsAtRespectiveLevels =
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
        // 				&asciidoc.OrderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "list item 1",
        // 						},
        // 						&asciidoc.ListContinuation{
        // 							ChildElement: &asciidoc.UnorderedListItem{
        // 								Elements: asciidoc.Elements{
        // 									&asciidoc.String{
        // 										Value: "nested list item 1",
        // 									},
        // 									&asciidoc.ListContinuation{
        // 										ChildElement: &asciidoc.OpenBlock{
        // 											AttributeList: nil,
        // 											Delimiter: asciidoc.Delimiter{
        // 												Type:   7,
        // 												Length: 2,
        // 											},
        // 											Elements: asciidoc.Elements{
        // 												&asciidoc.String{
        // 													Value: "open block for nested list item 1",
        // 												},
        // 												&asciidoc.NewLine{},
        // 											},
        // 										},
        // 									},
        // 									&asciidoc.ListContinuation{
        // 										ChildElement: &asciidoc.UnorderedListItem{
        // 											Elements: asciidoc.Elements{
        // 												&asciidoc.String{
        // 													Value: "nested list item 2",
        // 												},
        // 												&asciidoc.ListContinuation{
        // 													ChildElement: &asciidoc.Paragraph{
        // 														AttributeList: nil,
        // 														Elements: asciidoc.Elements{
        // 															&asciidoc.String{
        // 																Value: "paragraph for nested list item 2",
        // 															},
        // 														},
        // 														Admonition: 0,
        // 													},
        // 												},
        // 												&asciidoc.ListContinuation{
        // 													ChildElement: &asciidoc.Paragraph{
        // 														AttributeList: nil,
        // 														Elements: asciidoc.Elements{
        // 															&asciidoc.String{
        // 																Value: "paragraph for list item 1",
        // 															},
        // 														},
        // 														Admonition: 0,
        // 													},
        // 												},
        // 											},
        // 											AttributeList: nil,
        // 											Indent:        "",
        // 											Marker:        "*",
        // 											Checklist:     0,
        // 										},
        // 									},
        // 								},
        // 								AttributeList: nil,
        // 								Indent:        "",
        // 								Marker:        "*",
        // 								Checklist:     0,
        // 							},
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        ".",
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.OrderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "list item 2",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        ".",
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `repeated list continuations should attach to list items at respective levels ignoring blank lines`() {
        // Input: asciidoctor/lists_test_repeated_list_continuations_should_attach_to_list_items_at_respective_levels_ignoring_blank_lines.adoc
        // Expected Go AST:
        // var listsTestRepeatedListContinuationsShouldAttachToListItemsAtRespectiveLevelsIgnoringBlankLines =
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
        // 				&asciidoc.OrderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "list item 1",
        // 						},
        // 						&asciidoc.ListContinuation{
        // 							ChildElement: &asciidoc.UnorderedListItem{
        // 								Elements: asciidoc.Elements{
        // 									&asciidoc.String{
        // 										Value: "nested list item 1",
        // 									},
        // 									&asciidoc.ListContinuation{
        // 										ChildElement: &asciidoc.OpenBlock{
        // 											AttributeList: nil,
        // 											Delimiter: asciidoc.Delimiter{
        // 												Type:   7,
        // 												Length: 2,
        // 											},
        // 											Elements: asciidoc.Elements{
        // 												&asciidoc.String{
        // 													Value: "open block for nested list item 1",
        // 												},
        // 												&asciidoc.NewLine{},
        // 											},
        // 										},
        // 									},
        // 									&asciidoc.ListContinuation{
        // 										ChildElement: &asciidoc.UnorderedListItem{
        // 											Elements: asciidoc.Elements{
        // 												&asciidoc.String{
        // 													Value: "nested list item 2",
        // 												},
        // 												&asciidoc.ListContinuation{
        // 													ChildElement: &asciidoc.Paragraph{
        // 														AttributeList: nil,
        // 														Elements: asciidoc.Elements{
        // 															&asciidoc.String{
        // 																Value: "paragraph for nested list item 2",
        // 															},
        // 														},
        // 														Admonition: 0,
        // 													},
        // 												},
        // 												&asciidoc.ListContinuation{
        // 													ChildElement: &asciidoc.Paragraph{
        // 														AttributeList: nil,
        // 														Elements: asciidoc.Elements{
        // 															&asciidoc.String{
        // 																Value: "paragraph for list item 1",
        // 															},
        // 														},
        // 														Admonition: 0,
        // 													},
        // 												},
        // 											},
        // 											AttributeList: nil,
        // 											Indent:        "",
        // 											Marker:        "*",
        // 											Checklist:     0,
        // 										},
        // 									},
        // 								},
        // 								AttributeList: nil,
        // 								Indent:        "",
        // 								Marker:        "*",
        // 								Checklist:     0,
        // 							},
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        ".",
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.OrderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "list item 2",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        ".",
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `trailing list continuations should ignore preceding blank lines`() {
        // Input: asciidoctor/lists_test_trailing_list_continuations_should_ignore_preceding_blank_lines.adoc
        // Expected Go AST:
        // var listsTestTrailingListContinuationsShouldIgnorePrecedingBlankLines =
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
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "bullet 1",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        "*",
        // 					Checklist:     0,
        // 				},
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "bullet 1.1",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        "**",
        // 					Checklist:     0,
        // 				},
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "bullet 1.1.1",
        // 						},
        // 						&asciidoc.ListContinuation{
        // 							ChildElement: &asciidoc.OpenBlock{
        // 								AttributeList: nil,
        // 								Delimiter: asciidoc.Delimiter{
        // 									Type:   7,
        // 									Length: 2,
        // 								},
        // 								Elements: asciidoc.Elements{
        // 									&asciidoc.String{
        // 										Value: "open block",
        // 									},
        // 									&asciidoc.NewLine{},
        // 								},
        // 							},
        // 						},
        // 						&asciidoc.ListContinuation{
        // 							ChildElement: &asciidoc.Paragraph{
        // 								AttributeList: nil,
        // 								Elements: asciidoc.Elements{
        // 									&asciidoc.String{
        // 										Value: "bullet 1.1 paragraph",
        // 									},
        // 								},
        // 								Admonition: 0,
        // 							},
        // 						},
        // 						&asciidoc.ListContinuation{
        // 							ChildElement: &asciidoc.Paragraph{
        // 								AttributeList: nil,
        // 								Elements: asciidoc.Elements{
        // 									&asciidoc.String{
        // 										Value: "bullet 1 paragraph",
        // 									},
        // 								},
        // 								Admonition: 0,
        // 							},
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        "***",
        // 					Checklist:     0,
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "bullet 2",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        "*",
        // 					Checklist:     0,
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `indented outline list item with different marker offset by a blank line should be recognized as a nested list`() {
        // Input: asciidoctor/lists_test_indented_outline_list_item_with_different_marker_offset_by_a_blank_line_should_be_recognized_as_a_nested_list.adoc
        // Expected Go AST:
        // var listsTestIndentedOutlineListItemWithDifferentMarkerOffsetByABlankLineShouldBeRecognizedAsANestedList =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "item 1",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "item 1.1",
        // 				},
        // 				&asciidoc.ListContinuation{
        // 					ChildElement: &asciidoc.Paragraph{
        // 						AttributeList: nil,
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "attached paragraph",
        // 							},
        // 						},
        // 						Admonition: 0,
        // 					},
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "  ",
        // 			Marker:        ".",
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "item 1.2",
        // 				},
        // 				&asciidoc.ListContinuation{
        // 					ChildElement: &asciidoc.Paragraph{
        // 						AttributeList: nil,
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "attached paragraph",
        // 							},
        // 						},
        // 						Admonition: 0,
        // 					},
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "  ",
        // 			Marker:        ".",
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "item 2",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `indented description list item inside outline list item offset by a blank line should be recognized as a nested list`() {
        // Input: asciidoctor/lists_test_indented_description_list_item_inside_outline_list_item_offset_by_a_blank_line_should_be_recognized_as_a_nested_list.adoc
        // Expected Go AST:
        // var listsTestIndentedDescriptionListItemInsideOutlineListItemOffsetByABlankLineShouldBeRecognizedAsANestedList =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "item 1",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "  term a:: description a",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.LineBreak{},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "attached paragraph",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "  term b:: description b",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.LineBreak{},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "attached paragraph",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "item 2",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `consecutive list continuation lines are folded`() {
        // Input: asciidoctor/lists_test_consecutive_list_continuation_lines_are_folded.adoc
        // Expected Go AST:
        // var listsTestConsecutiveListContinuationLinesAreFolded =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Lists",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "=====",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Item one, paragraph one",
        // 				},
        // 				&asciidoc.ListContinuation{
        // 					ChildElement: &asciidoc.Paragraph{
        // 						AttributeList: nil,
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.LineBreak{},
        // 						},
        // 						Admonition: 0,
        // 					},
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Item one, paragraph two",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.LineBreak{},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.LineBreak{},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Item two",
        // 				},
        // 				&asciidoc.ListContinuation{
        // 					ChildElement: &asciidoc.Paragraph{
        // 						AttributeList: nil,
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.LineBreak{},
        // 						},
        // 						Admonition: 0,
        // 					},
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should warn if unterminated block is detected in list item`() {
        // Input: asciidoctor/lists_test_should_warn_if_unterminated_block_is_detected_in_list_item.adoc
        // Expected Go AST:
        // var listsTestShouldWarnIfUnterminatedBlockIsDetectedInListItem =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "item",
        // 				},
        // 				&asciidoc.ListContinuation{
        // 					ChildElement: &asciidoc.Paragraph{
        // 						AttributeList: nil,
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "====",
        // 							},
        // 						},
        // 						Admonition: 0,
        // 					},
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.String{
        // 			Value: "example",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "swallowed item",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `dot elements with no blank lines`() {
        // Input: asciidoctor/lists_test_dot_elements_with_no_blank_lines.adoc
        // Expected Go AST:
        // var listsTestDotElementsWithNoBlankLines =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "List",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "====",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Foo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        ".",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Boo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        ".",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Blech",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        ".",
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should represent explicit role attribute as style class`() {
        // Input: asciidoctor/lists_test_should_represent_explicit_role_attribute_as_style_class.adoc
        // Expected Go AST:
        // var listsTestShouldRepresentExplicitRoleAttributeAsStyleClass =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Once",
        // 				},
        // 			},
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.NamedAttribute{
        // 					Name: "role",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "dry",
        // 						},
        // 					},
        // 					Quote: 2,
        // 				},
        // 			},
        // 			Indent: "",
        // 			Marker: ".",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Again",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        ".",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Refactor!",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        ".",
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should base list style on marker length rather than list depth`() {
        // Input: asciidoctor/lists_test_should_base_list_style_on_marker_length_rather_than_list_depth.adoc
        // Expected Go AST:
        // var listsTestShouldBaseListStyleOnMarkerLengthRatherThanListDepth =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "parent",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "...",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "child",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "..",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "grandchild",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        ".",
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should allow list style to be specified explicitly when using markers with implicit style`() {
        // Input: asciidoctor/lists_test_should_allow_list_style_to_be_specified_explicitly_when_using_markers_with_implicit_style.adoc
        // Expected Go AST:
        // var listsTestShouldAllowListStyleToBeSpecifiedExplicitlyWhenUsingMarkersWithImplicitStyle =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "1",
        // 				},
        // 			},
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "loweralpha",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Indent: "",
        // 			Marker: "i)",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "2",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "ii)",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "3",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "iii)",
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should represent custom numbering and explicit role attribute as style classes`() {
        // Input: asciidoctor/lists_test_should_represent_custom_numbering_and_explicit_role_attribute_as_style_classes.adoc
        // Expected Go AST:
        // var listsTestShouldRepresentCustomNumberingAndExplicitRoleAttributeAsStyleClasses =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Once",
        // 				},
        // 			},
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "loweralpha",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 				&asciidoc.NamedAttribute{
        // 					Name: "role",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "dry",
        // 						},
        // 					},
        // 					Quote: 2,
        // 				},
        // 			},
        // 			Indent: "",
        // 			Marker: ".",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Again",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        ".",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Refactor!",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        ".",
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should set reversed attribute on list if reversed option is set`() {
        // Input: asciidoctor/lists_test_should_set_reversed_attribute_on_list_if_reversed_option_is_set.adoc
        // Expected Go AST:
        // var listsTestShouldSetReversedAttributeOnListIfReversedOptionIsSet =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "three",
        // 				},
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
        // 									Value: "reversed",
        // 								},
        // 							},
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.NamedAttribute{
        // 					Name: "start",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "3",
        // 						},
        // 					},
        // 					Quote: 0,
        // 				},
        // 			},
        // 			Indent: "",
        // 			Marker: ".",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "two",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        ".",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "one",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        ".",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "blast off!",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        ".",
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should represent implicit role attribute as style class`() {
        // Input: asciidoctor/lists_test_should_represent_implicit_role_attribute_as_style_class.adoc
        // Expected Go AST:
        // var listsTestShouldRepresentImplicitRoleAttributeAsStyleClass =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Once",
        // 				},
        // 			},
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: nil,
        // 					ID:    nil,
        // 					Roles: []*asciidoc.ShorthandRole{
        // 						&asciidoc.ShorthandRole{
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "dry",
        // 								},
        // 							},
        // 						},
        // 					},
        // 					Options: nil,
        // 				},
        // 			},
        // 			Indent: "",
        // 			Marker: ".",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Again",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        ".",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Refactor!",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        ".",
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should represent custom numbering and implicit role attribute as style classes`() {
        // Input: asciidoctor/lists_test_should_represent_custom_numbering_and_implicit_role_attribute_as_style_classes.adoc
        // Expected Go AST:
        // var listsTestShouldRepresentCustomNumberingAndImplicitRoleAttributeAsStyleClasses =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Once",
        // 				},
        // 			},
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "loweralpha",
        // 							},
        // 						},
        // 					},
        // 					ID: nil,
        // 					Roles: []*asciidoc.ShorthandRole{
        // 						&asciidoc.ShorthandRole{
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "dry",
        // 								},
        // 							},
        // 						},
        // 					},
        // 					Options: nil,
        // 				},
        // 			},
        // 			Indent: "",
        // 			Marker: ".",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Again",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        ".",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Refactor!",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        ".",
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `dot elements separated by blank lines should merge lists`() {
        // Input: asciidoctor/lists_test_dot_elements_separated_by_blank_lines_should_merge_lists.adoc
        // Expected Go AST:
        // var listsTestDotElementsSeparatedByBlankLinesShouldMergeLists =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "List",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "====",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Foo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        ".",
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Boo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        ".",
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Blech",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        ".",
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `dot elements with interspersed line comments should be skipped and not break list`() {
        // Input: asciidoctor/lists_test_dot_elements_with_interspersed_line_comments_should_be_skipped_and_not_break_list.adoc
        // Expected Go AST:
        // var listsTestDotElementsWithInterspersedLineCommentsShouldBeSkippedAndNotBreakList =
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
        // 				&asciidoc.OrderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Foo",
        // 						},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "// line comment",
        // 						},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "// another line comment",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        ".",
        // 				},
        // 				&asciidoc.OrderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Boo",
        // 						},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "// line comment",
        // 						},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "more text",
        // 						},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "// another line comment",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        ".",
        // 				},
        // 				&asciidoc.OrderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Blech",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        ".",
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "List",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `dot elements separated by line comment offset by blank lines should not merge lists`() {
        // Input: asciidoctor/lists_test_dot_elements_separated_by_line_comment_offset_by_blank_lines_should_not_merge_lists.adoc
        // Expected Go AST:
        // var listsTestDotElementsSeparatedByLineCommentOffsetByBlankLinesShouldNotMergeLists =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "List",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "====",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Foo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        ".",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Boo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        ".",
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.SingleLineComment{
        // 			Value: "",
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Blech",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        ".",
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `dot elements separated by a block title offset by a blank line should not merge lists`() {
        // Input: asciidoctor/lists_test_dot_elements_separated_by_a_block_title_offset_by_a_blank_line_should_not_merge_lists.adoc
        // Expected Go AST:
        // var listsTestDotElementsSeparatedByABlockTitleOffsetByABlankLineShouldNotMergeLists =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "List",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "====",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Foo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        ".",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Boo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        ".",
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Blech",
        // 				},
        // 			},
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Also",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Indent: "",
        // 			Marker: ".",
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `dot elements separated by an attribute entry offset by a blank line should not merge lists`() {
        // Input: asciidoctor/lists_test_dot_elements_separated_by_an_attribute_entry_offset_by_a_blank_line_should_not_merge_lists.adoc
        // Expected Go AST:
        // var listsTestDotElementsSeparatedByAnAttributeEntryOffsetByABlankLineShouldNotMergeLists =
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
        // 				&asciidoc.OrderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Foo",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        ".",
        // 				},
        // 				&asciidoc.OrderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Boo",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        ".",
        // 				},
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
        // 				&asciidoc.OrderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Blech",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        ".",
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "List",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should use start number in docbook5 backend`() {
        // Input: asciidoctor/lists_test_should_use_start_number_in_docbook_5_backend.adoc
        // Expected Go AST:
        // var listsTestShouldUseStartNumberInDocbook5Backend =
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
        // 				&asciidoc.OrderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "item 7",
        // 						},
        // 					},
        // 					AttributeList: asciidoc.AttributeList{
        // 						&asciidoc.NamedAttribute{
        // 							Name: "start",
        // 							Val: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "7",
        // 								},
        // 							},
        // 							Quote: 0,
        // 						},
        // 					},
        // 					Indent: "",
        // 					Marker: ".",
        // 				},
        // 				&asciidoc.OrderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "item 8",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        ".",
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "List",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should warn if explicit uppercase roman numerals in list are out of sequence`() {
        // Input: asciidoctor/lists_test_should_warn_if_explicit_uppercase_roman_numerals_in_list_are_out_of_sequence.adoc
        // Expected Go AST:
        // var listsTestShouldWarnIfExplicitUppercaseRomanNumeralsInListAreOutOfSequence =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "one",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "I)",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "three",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "III)",
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should warn if explicit lowercase roman numerals in list are out of sequence`() {
        // Input: asciidoctor/lists_test_should_warn_if_explicit_lowercase_roman_numerals_in_list_are_out_of_sequence.adoc
        // Expected Go AST:
        // var listsTestShouldWarnIfExplicitLowercaseRomanNumeralsInListAreOutOfSequence =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "one",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "i)",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "three",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "iii)",
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not parse a bare dlist delimiter as a dlist`() {
        // Input: asciidoctor/lists_test_should_not_parse_a_bare_dlist_delimiter_as_a_dlist.adoc
        // Expected Go AST:
        // var listsTestShouldNotParseABareDlistDelimiterAsADlist =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "term1:: def1",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "term2:: def2",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should parse sibling items using same rules`() {
        // Input: asciidoctor/lists_test_should_parse_sibling_items_using_same_rules.adoc
        // Expected Go AST:
        // var listsTestShouldParseSiblingItemsUsingSameRules =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "term1;; ;; def1",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "term2;; ;; def2",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should allow term to end with a semicolon when using double semicolon delimiter`() {
        // Input: asciidoctor/lists_test_should_allow_term_to_end_with_a_semicolon_when_using_double_semicolon_delimiter.adoc
        // Expected Go AST:
        // var listsTestShouldAllowTermToEndWithASemicolonWhenUsingDoubleSemicolonDelimiter =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "term;;; def",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `single-line indented adjacent elements`() {
        // Input: asciidoctor/lists_test_single_line_indented_adjacent_elements.adoc
        // Expected Go AST:
        // var listsTestSingleLineIndentedAdjacentElements =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "term1:: def1",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: " term2:: def2",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `single-line elements separated by blank line should create a single list`() {
        // Input: asciidoctor/lists_test_single_line_elements_separated_by_blank_line_should_create_a_single_list.adoc
        // Expected Go AST:
        // var listsTestSingleLineElementsSeparatedByBlankLineShouldCreateASingleList =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "term1:: def1",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "term2:: def2",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `a line comment between elements should divide them into separate lists`() {
        // Input: asciidoctor/lists_test_a_line_comment_between_elements_should_divide_them_into_separate_lists.adoc
        // Expected Go AST:
        // var listsTestALineCommentBetweenElementsShouldDivideThemIntoSeparateLists =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "term1:: def1",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.SingleLineComment{
        // 			Value: "",
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "term2:: def2",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `a ruler between elements should divide them into separate lists`() {
        // Input: asciidoctor/lists_test_a_ruler_between_elements_should_divide_them_into_separate_lists.adoc
        // Expected Go AST:
        // var listsTestARulerBetweenElementsShouldDivideThemIntoSeparateLists =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "term1:: def1",
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
        // 			Value: "term2:: def2",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `a block title between elements should divide them into separate lists`() {
        // Input: asciidoctor/lists_test_a_block_title_between_elements_should_divide_them_into_separate_lists.adoc
        // Expected Go AST:
        // var listsTestABlockTitleBetweenElementsShouldDivideThemIntoSeparateLists =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "term1:: def1",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Some more",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "term2:: def2",
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
    fun `multi-line elements with paragraph content`() {
        // Input: asciidoctor/lists_test_multi_line_elements_with_paragraph_content.adoc
        // Expected Go AST:
        // var listsTestMultiLineElementsWithParagraphContent =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "def1",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "term",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "1",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "def2",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "term",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "2",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `multi-line elements with indented paragraph content`() {
        // Input: asciidoctor/lists_test_multi_line_elements_with_indented_paragraph_content.adoc
        // Expected Go AST:
        // var listsTestMultiLineElementsWithIndentedParagraphContent =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: " def1",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "term",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "1",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "  def2",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "term",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "2",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `multi-line elements with indented paragraph content that includes comment lines`() {
        // Input: asciidoctor/lists_test_multi_line_elements_with_indented_paragraph_content_that_includes_comment_lines.adoc
        // Expected Go AST:
        // var listsTestMultiLineElementsWithIndentedParagraphContentThatIncludesCommentLines =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: " def1",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "term",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "1",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.SingleLineComment{
        // 			Value: " comment",
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "  def2",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "term",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "2",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.SingleLineComment{
        // 			Value: " comment",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "  def2 continued",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not strip comment line in literal paragraph block attached to list item`() {
        // Input: asciidoctor/lists_test_should_not_strip_comment_line_in_literal_paragraph_block_attached_to_list_item.adoc
        // Expected Go AST:
        // var listsTestShouldNotStripCommentLineInLiteralParagraphBlockAttachedToListItem =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.LineBreak{},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "term",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "1",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: " line 1",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.SingleLineComment{
        // 			Value: " not a comment",
        // 		},
        // 		&asciidoc.String{
        // 			Value: " line 3",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `multi-line element with paragraph starting with multiple dashes should not be seen as list`() {
        // Input: asciidoctor/lists_test_multi_line_element_with_paragraph_starting_with_multiple_dashes_should_not_be_seen_as_list.adoc
        // Expected Go AST:
        // var listsTestMultiLineElementWithParagraphStartingWithMultipleDashesShouldNotBeSeenAsList =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "  def1",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "term",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "1",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "and a note",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "  ",
        // 			Marker:        "--",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "  def2",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "term",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "2",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `multi-line element with multiple terms`() {
        // Input: asciidoctor/lists_test_multi_line_element_with_multiple_terms.adoc
        // Expected Go AST:
        // var listsTestMultiLineElementWithMultipleTerms =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "term2::",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "term",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "1",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: "def2",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `consecutive terms share same varlistentry in docbook`() {
        // Input: asciidoctor/lists_test_consecutive_terms_share_same_varlistentry_in_docbook.adoc
        // Expected Go AST:
        // var listsTestConsecutiveTermsShareSameVarlistentryInDocbook =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "alt term::",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "term",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: "description",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "last::",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `multi-line elements with blank line before paragraph content`() {
        // Input: asciidoctor/lists_test_multi_line_elements_with_blank_line_before_paragraph_content.adoc
        // Expected Go AST:
        // var listsTestMultiLineElementsWithBlankLineBeforeParagraphContent =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "def1",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "term",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "1",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "def2",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "term",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "2",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `multi-line elements with paragraph and literal content`() {
        // Input: asciidoctor/lists_test_multi_line_elements_with_paragraph_and_literal_content.adoc
        // Expected Go AST:
        // var listsTestMultiLineElementsWithParagraphAndLiteralContent =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "def1",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "term",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "1",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "  literal",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "  def2",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "term",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "2",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `mixed single and multi-line adjacent elements`() {
        // Input: asciidoctor/lists_test_mixed_single_and_multi_line_adjacent_elements.adoc
        // Expected Go AST:
        // var listsTestMixedSingleAndMultiLineAdjacentElements =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "term1:: def1",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "def2",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "term",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "2",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should discover anchor at start of description term text and register it as a reference`() {
        // Input: asciidoctor/lists_test_should_discover_anchor_at_start_of_description_term_text_and_register_it_as_a_reference.adoc
        // Expected Go AST:
        // var listsTestShouldDiscoverAnchorAtStartOfDescriptionTermTextAndRegisterItAsAReference =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "The highest peak in the Front Range is ",
        // 		},
        // 		&asciidoc.CrossReference{
        // 			AttributeList: nil,
        // 			Elements:      nil,
        // 			ID: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "grays-peak",
        // 				},
        // 			},
        // 			Format: 0,
        // 		},
        // 		&asciidoc.String{
        // 			Value: ", which tops ",
        // 		},
        // 		&asciidoc.CrossReference{
        // 			AttributeList: nil,
        // 			Elements:      nil,
        // 			ID: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "mount-evans",
        // 				},
        // 			},
        // 			Format: 0,
        // 		},
        // 		&asciidoc.String{
        // 			Value: " by just a few feet.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Anchor{
        // 			ID: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "mount-evans",
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Mount Evans",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Mount Evans:: 14,271 feet",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.Anchor{
        // 			ID: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "grays-peak",
        // 				},
        // 			},
        // 			Elements: nil,
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Grays Peak:: 14,278 feet",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `missing space before term does not produce description list`() {
        // Input: asciidoctor/lists_test_missing_space_before_term_does_not_produce_description_list.adoc
        // Expected Go AST:
        // var listsTestMissingSpaceBeforeTermDoesNotProduceDescriptionList =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "term1::def1",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "term2::def2",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `literal block inside description list`() {
        // Input: asciidoctor/lists_test_literal_block_inside_description_list.adoc
        // Expected Go AST:
        // var listsTestLiteralBlockInsideDescriptionList =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.LineBreak{},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "term",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.LiteralBlock{
        // 			AttributeList: nil,
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   6,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"literal, line 1",
        // 				"",
        // 				"literal, line 2",
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: "anotherterm:: def",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `literal block inside description list with trailing line continuation`() {
        // Input: asciidoctor/lists_test_literal_block_inside_description_list_with_trailing_line_continuation.adoc
        // Expected Go AST:
        // var listsTestLiteralBlockInsideDescriptionListWithTrailingLineContinuation =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.LineBreak{},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "term",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.LiteralBlock{
        // 			AttributeList: nil,
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   6,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"literal, line 1",
        // 				"",
        // 				"literal, line 2",
        // 			},
        // 		},
        // 		&asciidoc.LineBreak{},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "anotherterm:: def",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `multiple listing blocks inside description list`() {
        // Input: asciidoctor/lists_test_multiple_listing_blocks_inside_description_list.adoc
        // Expected Go AST:
        // var listsTestMultipleListingBlocksInsideDescriptionList =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.LineBreak{},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "term",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.Listing{
        // 			AttributeList: nil,
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   5,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"listing, line 1",
        // 				"",
        // 				"listing, line 2",
        // 			},
        // 		},
        // 		&asciidoc.LineBreak{},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.Listing{
        // 			AttributeList: nil,
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   5,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"listing, line 1",
        // 				"",
        // 				"listing, line 2",
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: "anotherterm:: def",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `open block inside description list`() {
        // Input: asciidoctor/lists_test_open_block_inside_description_list.adoc
        // Expected Go AST:
        // var listsTestOpenBlockInsideDescriptionList =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.LineBreak{},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "term",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.OpenBlock{
        // 			AttributeList: nil,
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   7,
        // 				Length: 2,
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Open block as description of term.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "And some more detail...",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: "anotherterm:: def",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `paragraph attached by a list continuation on either side in a description list`() {
        // Input: asciidoctor/lists_test_paragraph_attached_by_a_list_continuation_on_either_side_in_a_description_list.adoc
        // Expected Go AST:
        // var listsTestParagraphAttachedByAListContinuationOnEitherSideInADescriptionList =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "term1:: def1",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.LineBreak{},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "more detail",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.LineBreak{},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "term2:: def2",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `paragraph attached by a list continuation on either side to a multi-line element in a description list`() {
        // Input: asciidoctor/lists_test_paragraph_attached_by_a_list_continuation_on_either_side_to_a_multi_line_element_in_a_description_list.adoc
        // Expected Go AST:
        // var listsTestParagraphAttachedByAListContinuationOnEitherSideToAMultiLineElementInADescriptionList =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "def1",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "term",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "1",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.LineBreak{},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "more detail",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.LineBreak{},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "term2:: def2",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should continue to parse subsequent blocks attached to list item after first block is dropped`() {
        // Input: asciidoctor/lists_test_should_continue_to_parse_subsequent_blocks_attached_to_list_item_after_first_block_is_dropped.adoc
        // Expected Go AST:
        // var listsTestShouldContinueToParseSubsequentBlocksAttachedToListItemAfterFirstBlockIsDropped =
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
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.LineBreak{},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "term",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.BlockImage{
        // 			AttributeList: nil,
        // 			ImagePath: asciidoc.Elements{
        // 				&asciidoc.UserAttributeReference{
        // 					Value: "unresolved",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.LineBreak{},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "paragraph",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `verse paragraph inside a description list`() {
        // Input: asciidoctor/lists_test_verse_paragraph_inside_a_description_list.adoc
        // Expected Go AST:
        // var listsTestVerseParagraphInsideADescriptionList =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "term1:: def",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.LineBreak{},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.Paragraph{
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
        // 					Value: "la la la",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 0,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "term2:: def",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `list inside a description list`() {
        // Input: asciidoctor/lists_test_list_inside_a_description_list.adoc
        // Expected Go AST:
        // var listsTestListInsideADescriptionList =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "* level 1",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "term",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "1",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "level 2",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "**",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "level 1",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "term2:: def",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `list inside a description list offset by blank lines`() {
        // Input: asciidoctor/lists_test_list_inside_a_description_list_offset_by_blank_lines.adoc
        // Expected Go AST:
        // var listsTestListInsideADescriptionListOffsetByBlankLines =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "* level 1",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "term",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "1",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "level 2",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "**",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "level 1",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "term2:: def",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should only grab one line following last item if item has no inline description`() {
        // Input: asciidoctor/lists_test_should_only_grab_one_line_following_last_item_if_item_has_no_inline_description.adoc
        // Expected Go AST:
        // var listsTestShouldOnlyGrabOneLineFollowingLastItemIfItemHasNoInlineDescription =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "def1",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "term",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "1",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "def2",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "term",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "2",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "A new paragraph",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Another new paragraph",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should only grab one literal line following last item if item has no inline description`() {
        // Input: asciidoctor/lists_test_should_only_grab_one_literal_line_following_last_item_if_item_has_no_inline_description.adoc
        // Expected Go AST:
        // var listsTestShouldOnlyGrabOneLiteralLineFollowingLastItemIfItemHasNoInlineDescription =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "def1",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "term",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "1",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "  def2",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "term",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "2",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "A new paragraph",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Another new paragraph",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should append subsequent paragraph literals to list item as block content`() {
        // Input: asciidoctor/lists_test_should_append_subsequent_paragraph_literals_to_list_item_as_block_content.adoc
        // Expected Go AST:
        // var listsTestShouldAppendSubsequentParagraphLiteralsToListItemAsBlockContent =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "def1",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "term",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "1",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "  def2",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "term",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "2",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "  literal",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "A new paragraph.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not match comment line that looks like description list term`() {
        // Input: asciidoctor/lists_test_should_not_match_comment_line_that_looks_like_description_list_term.adoc
        // Expected Go AST:
        // var listsTestShouldNotMatchCommentLineThatLooksLikeDescriptionListTerm =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "before",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.SingleLineComment{
        // 			Value: "key:: val",
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "after",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not match comment line following list that looks like description list term`() {
        // Input: asciidoctor/lists_test_should_not_match_comment_line_following_list_that_looks_like_description_list_term.adoc
        // Expected Go AST:
        // var listsTestShouldNotMatchCommentLineFollowingListThatLooksLikeDescriptionListTerm =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "item",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.SingleLineComment{
        // 			Value: "term:: desc",
        // 		},
        // 		&asciidoc.Section{
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "section text",
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
    fun `should not match comment line that looks like sibling description list term`() {
        // Input: asciidoctor/lists_test_should_not_match_comment_line_that_looks_like_sibling_description_list_term.adoc
        // Expected Go AST:
        // var listsTestShouldNotMatchCommentLineThatLooksLikeSiblingDescriptionListTerm =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "before",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "foo:: bar",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.SingleLineComment{
        // 			Value: "yin:: yang",
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "after",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not hang on description list item in list that begins with ___`() {
        // Input: asciidoctor/lists_test_should_not_hang_on_description_list_item_in_list_that_begins_with.adoc
        // Expected Go AST:
        // var listsTestShouldNotHangOnDescriptionListItemInListThatBeginsWith =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "a",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "///b::",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "c",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not hang on sibling description list item that begins with ___`() {
        // Input: asciidoctor/lists_test_should_not_hang_on_sibling_description_list_item_that_begins_with.adoc
        // Expected Go AST:
        // var listsTestShouldNotHangOnSiblingDescriptionListItemThatBeginsWith =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "///b::",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "a",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: "c",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should skip dlist term that begins with __ unless it begins with ___`() {
        // Input: asciidoctor/lists_test_should_skip_dlist_term_that_begins_with____unless_it_begins_with.adoc
        // Expected Go AST:
        // var listsTestShouldSkipDlistTermThatBeginsWithUnlessItBeginsWith =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "//ignored term:: def",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "category a",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "///term:: def",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "category b",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `more than 4 consecutive colons should become part of description list term`() {
        // Input: asciidoctor/lists_test_more_than_4_consecutive_colons_should_become_part_of_description_list_term.adoc
        // Expected Go AST:
        // var listsTestMoreThan4ConsecutiveColonsShouldBecomePartOfDescriptionListTerm =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "A term::::: a description",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `text method of dd node should return nil if dd node only contains blocks`() {
        // Input: asciidoctor/lists_test_text_method_of_dd_node_should_return_nil_if_dd_node_only_contains_blocks.adoc
        // Expected Go AST:
        // var listsTestTextMethodOfDdNodeShouldReturnNilIfDdNodeOnlyContainsBlocks =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.LineBreak{},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "term",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: "paragraph",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not parse a nested dlist delimiter without a term as a dlist`() {
        // Input: asciidoctor/lists_test_should_not_parse_a_nested_dlist_delimiter_without_a_term_as_a_dlist.adoc
        // Expected Go AST:
        // var listsTestShouldNotParseANestedDlistDelimiterWithoutATermAsADlist =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: ";;",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "t",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not parse a nested indented dlist delimiter without a term as a dlist`() {
        // Input: asciidoctor/lists_test_should_not_parse_a_nested_indented_dlist_delimiter_without_a_term_as_a_dlist.adoc
        // Expected Go AST:
        // var listsTestShouldNotParseANestedIndentedDlistDelimiterWithoutATermAsADlist =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "desc",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "t",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: "  ;;",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `single-line adjacent nested elements`() {
        // Input: asciidoctor/lists_test_single_line_adjacent_nested_elements.adoc
        // Expected Go AST:
        // var listsTestSingleLineAdjacentNestedElements =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "term1:: def1",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "label1::: detail1",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "term2:: def2",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `single-line adjacent maximum nested elements`() {
        // Input: asciidoctor/lists_test_single_line_adjacent_maximum_nested_elements.adoc
        // Expected Go AST:
        // var listsTestSingleLineAdjacentMaximumNestedElements =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "term1:: def1",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "label1::: detail1",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "name1:::: value1",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "item1;; price1",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "term2:: def2",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `single-line nested elements separated by blank line at top level`() {
        // Input: asciidoctor/lists_test_single_line_nested_elements_separated_by_blank_line_at_top_level.adoc
        // Expected Go AST:
        // var listsTestSingleLineNestedElementsSeparatedByBlankLineAtTopLevel =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "term1:: def1",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "label1::: detail1",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "term2:: def2",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `single-line nested elements separated by blank line at nested level`() {
        // Input: asciidoctor/lists_test_single_line_nested_elements_separated_by_blank_line_at_nested_level.adoc
        // Expected Go AST:
        // var listsTestSingleLineNestedElementsSeparatedByBlankLineAtNestedLevel =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "term1:: def1",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "label1::: detail1",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "label2::: detail2",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "term2:: def2",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `single-line adjacent nested elements with alternate delimiters`() {
        // Input: asciidoctor/lists_test_single_line_adjacent_nested_elements_with_alternate_delimiters.adoc
        // Expected Go AST:
        // var listsTestSingleLineAdjacentNestedElementsWithAlternateDelimiters =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "term1:: def1",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "label1;; detail1",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "term2:: def2",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `multi-line adjacent nested elements`() {
        // Input: asciidoctor/lists_test_multi_line_adjacent_nested_elements.adoc
        // Expected Go AST:
        // var listsTestMultiLineAdjacentNestedElements =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "def1",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "term",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "1",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "detail1",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        ":::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "label",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "1",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "def2",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "term",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "2",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `multi-line nested elements separated by blank line at nested level repeated`() {
        // Input: asciidoctor/lists_test_multi_line_nested_elements_separated_by_blank_line_at_nested_level_repeated.adoc
        // Expected Go AST:
        // var listsTestMultiLineNestedElementsSeparatedByBlankLineAtNestedLevelRepeated =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "def1",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "term",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "1",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "detail1",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        ":::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "label",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "1",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "detail2",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        ":::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "label",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "2",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "term2:: def2",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `multi-line element with indented nested element`() {
        // Input: asciidoctor/lists_test_multi_line_element_with_indented_nested_element.adoc
        // Expected Go AST:
        // var listsTestMultiLineElementWithIndentedNestedElement =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "  def1",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "term",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "1",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "   detail1",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        ";;",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "  label",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "1",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "  def2",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "term",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "2",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `mixed single and multi-line elements with indented nested elements`() {
        // Input: asciidoctor/lists_test_mixed_single_and_multi_line_elements_with_indented_nested_elements.adoc
        // Expected Go AST:
        // var listsTestMixedSingleAndMultiLineElementsWithIndentedNestedElements =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "term1:: def1",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "   detail1",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        ":::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "  label",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "1",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: "term2:: def2",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `multi-line elements with first paragraph folded to text with adjacent nested element`() {
        // Input: asciidoctor/lists_test_multi_line_elements_with_first_paragraph_folded_to_text_with_adjacent_nested_element.adoc
        // Expected Go AST:
        // var listsTestMultiLineElementsWithFirstParagraphFoldedToTextWithAdjacentNestedElement =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "term1:: def1",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "continued",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "detail1",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        ":::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "label",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "1",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `nested dlist attached by list continuation should not consume detached paragraph`() {
        // Input: asciidoctor/lists_test_nested_dlist_attached_by_list_continuation_should_not_consume_detached_paragraph.adoc
        // Expected Go AST:
        // var listsTestNestedDlistAttachedByListContinuationShouldNotConsumeDetachedParagraph =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "term:: text",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.LineBreak{},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "nested term::: text",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "paragraph",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `nested dlist with attached block offset by empty line`() {
        // Input: asciidoctor/lists_test_nested_dlist_with_attached_block_offset_by_empty_line.adoc
        // Expected Go AST:
        // var listsTestNestedDlistWithAttachedBlockOffsetByEmptyLine =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "term 1:::",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "category",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.LineBreak{},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.OpenBlock{
        // 			AttributeList: nil,
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   7,
        // 				Length: 2,
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "def 1",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should convert glossary list with proper semantics`() {
        // Input: asciidoctor/lists_test_should_convert_glossary_list_with_proper_semantics.adoc
        // Expected Go AST:
        // var listsTestShouldConvertGlossaryListWithProperSemantics =
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
        // 								Value: "glossary",
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
        // 					Value: "term 1:: def 1",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "term 2:: def 2",
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
    fun `consecutive glossary terms should share same glossentry element in docbook`() {
        // Input: asciidoctor/lists_test_consecutive_glossary_terms_should_share_same_glossentry_element_in_docbook.adoc
        // Expected Go AST:
        // var listsTestConsecutiveGlossaryTermsShouldShareSameGlossentryElementInDocbook =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "alt term::",
        // 				},
        // 			},
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "glossary",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Marker: "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "term",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: "description",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "last::",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should convert horizontal list with proper markup`() {
        // Input: asciidoctor/lists_test_should_convert_horizontal_list_with_proper_markup.adoc
        // Expected Go AST:
        // var listsTestShouldConvertHorizontalListWithProperMarkup =
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
        // 								Value: "horizontal",
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
        // 					Value: "first term:: description",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.LineBreak{},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "more detail",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 0,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "second term:: description",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should set col widths of item and label if specified`() {
        // Input: asciidoctor/lists_test_should_set_col_widths_of_item_and_label_if_specified.adoc
        // Expected Go AST:
        // var listsTestShouldSetColWidthsOfItemAndLabelIfSpecified =
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
        // 								Value: "horizontal",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 				&asciidoc.NamedAttribute{
        // 					Name: "labelwidth",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "25",
        // 						},
        // 					},
        // 					Quote: 2,
        // 				},
        // 				&asciidoc.NamedAttribute{
        // 					Name: "itemwidth",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "75",
        // 						},
        // 					},
        // 					Quote: 2,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "term:: def",
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
    fun `should set col widths of item and label in docbook if specified`() {
        // Input: asciidoctor/lists_test_should_set_col_widths_of_item_and_label_in_docbook_if_specified.adoc
        // Expected Go AST:
        // var listsTestShouldSetColWidthsOfItemAndLabelInDocbookIfSpecified =
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
        // 								Value: "horizontal",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 				&asciidoc.NamedAttribute{
        // 					Name: "labelwidth",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "25",
        // 						},
        // 					},
        // 					Quote: 2,
        // 				},
        // 				&asciidoc.NamedAttribute{
        // 					Name: "itemwidth",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "75",
        // 						},
        // 					},
        // 					Quote: 2,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "term:: def",
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
    fun `should add strong class to label if strong option is set`() {
        // Input: asciidoctor/lists_test_should_add_strong_class_to_label_if_strong_option_is_set.adoc
        // Expected Go AST:
        // var listsTestShouldAddStrongClassToLabelIfStrongOptionIsSet =
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
        // 								Value: "horizontal",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 				&asciidoc.NamedAttribute{
        // 					Name: "options",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "strong",
        // 						},
        // 					},
        // 					Quote: 2,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "term:: def",
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
    fun `consecutive terms in horizontal list should share same cell`() {
        // Input: asciidoctor/lists_test_consecutive_terms_in_horizontal_list_should_share_same_cell.adoc
        // Expected Go AST:
        // var listsTestConsecutiveTermsInHorizontalListShouldShareSameCell =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "alt term::",
        // 				},
        // 			},
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "horizontal",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Marker: "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "term",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: "description",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "last::",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `consecutive terms in horizontal list should share same entry in docbook`() {
        // Input: asciidoctor/lists_test_consecutive_terms_in_horizontal_list_should_share_same_entry_in_docbook.adoc
        // Expected Go AST:
        // var listsTestConsecutiveTermsInHorizontalListShouldShareSameEntryInDocbook =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "alt term::",
        // 				},
        // 			},
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "horizontal",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Marker: "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "term",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: "description",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "last::",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should convert horizontal list in docbook with proper markup`() {
        // Input: asciidoctor/lists_test_should_convert_horizontal_list_in_docbook_with_proper_markup.adoc
        // Expected Go AST:
        // var listsTestShouldConvertHorizontalListInDocbookWithProperMarkup =
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
        // 							Value: "Terms",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "horizontal",
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
        // 					Value: "first term:: description",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.LineBreak{},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "more detail",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 0,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "second term:: description",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should convert qanda list in HTML with proper semantics`() {
        // Input: asciidoctor/lists_test_should_convert_qanda_list_in_html_with_proper_semantics.adoc
        // Expected Go AST:
        // var listsTestShouldConvertQandaListInHtmlWithProperSemantics =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "        Answer 1.",
        // 				},
        // 			},
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "qanda",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Marker: "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Question ",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "1",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "        Answer 2.",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Question ",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "2",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.LineBreak{},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "A note about Answer 2.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should convert qanda list in DocBook with proper semantics`() {
        // Input: asciidoctor/lists_test_should_convert_qanda_list_in_doc_book_with_proper_semantics.adoc
        // Expected Go AST:
        // var listsTestShouldConvertQandaListInDocBookWithProperSemantics =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "        Answer 1.",
        // 				},
        // 			},
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "qanda",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Marker: "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Question ",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "1",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "        Answer 2.",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Question ",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "2",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.LineBreak{},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "A note about Answer 2.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `consecutive questions should share same question element in docbook`() {
        // Input: asciidoctor/lists_test_consecutive_questions_should_share_same_question_element_in_docbook.adoc
        // Expected Go AST:
        // var listsTestConsecutiveQuestionsShouldShareSameQuestionElementInDocbook =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "follow-up question::",
        // 				},
        // 			},
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "qanda",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Marker: "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "question",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: "response",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "last question::",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should convert bibliography list with proper semantics`() {
        // Input: asciidoctor/lists_test_should_convert_bibliography_list_with_proper_semantics.adoc
        // Expected Go AST:
        // var listsTestShouldConvertBibliographyListWithProperSemantics =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "[",
        // 				},
        // 				&asciidoc.Anchor{
        // 					ID: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "taoup",
        // 						},
        // 					},
        // 					Elements: nil,
        // 				},
        // 				&asciidoc.String{
        // 					Value: "] Eric Steven Raymond. _The Art of Unix",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "  Programming_. Addison-Wesley. ISBN 0-13-142901-9.",
        // 				},
        // 			},
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "bibliography",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Indent:    "",
        // 			Marker:    "-",
        // 			Checklist: 0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "[",
        // 				},
        // 				&asciidoc.Anchor{
        // 					ID: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "walsh-muellner",
        // 						},
        // 					},
        // 					Elements: nil,
        // 				},
        // 				&asciidoc.String{
        // 					Value: "] Norman Walsh & Leonard Muellner.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "  ",
        // 				},
        // 				&asciidoc.Italic{
        // 					AttributeList: nil,
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "DocBook - The Definitive Guide",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.String{
        // 					Value: ". O'Reilly & Associates. 1999.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "  ISBN 1-56592-580-7.",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should convert bibliography list with proper semantics to DocBook`() {
        // Input: asciidoctor/lists_test_should_convert_bibliography_list_with_proper_semantics_to_doc_book.adoc
        // Expected Go AST:
        // var listsTestShouldConvertBibliographyListWithProperSemanticsToDocBook =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "[",
        // 				},
        // 				&asciidoc.Anchor{
        // 					ID: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "taoup",
        // 						},
        // 					},
        // 					Elements: nil,
        // 				},
        // 				&asciidoc.String{
        // 					Value: "] Eric Steven Raymond. _The Art of Unix",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "  Programming_. Addison-Wesley. ISBN 0-13-142901-9.",
        // 				},
        // 			},
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "bibliography",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Indent:    "",
        // 			Marker:    "-",
        // 			Checklist: 0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "[",
        // 				},
        // 				&asciidoc.Anchor{
        // 					ID: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "walsh-muellner",
        // 						},
        // 					},
        // 					Elements: nil,
        // 				},
        // 				&asciidoc.String{
        // 					Value: "] Norman Walsh & Leonard Muellner.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "  ",
        // 				},
        // 				&asciidoc.Italic{
        // 					AttributeList: nil,
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "DocBook - The Definitive Guide",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.String{
        // 					Value: ". O'Reilly & Associates. 1999.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "  ISBN 1-56592-580-7.",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should warn if a bibliography ID is already in use`() {
        // Input: asciidoctor/lists_test_should_warn_if_a_bibliography_id_is_already_in_use.adoc
        // Expected Go AST:
        // var listsTestShouldWarnIfABibliographyIdIsAlreadyInUse =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "[",
        // 				},
        // 				&asciidoc.Anchor{
        // 					ID: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Fowler",
        // 						},
        // 					},
        // 					Elements: nil,
        // 				},
        // 				&asciidoc.String{
        // 					Value: "] Fowler M. ",
        // 				},
        // 				&asciidoc.Italic{
        // 					AttributeList: nil,
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Analysis Patterns: Reusable Object Models",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.String{
        // 					Value: ".",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "Addison-Wesley. 1997.",
        // 				},
        // 			},
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "bibliography",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Indent:    "",
        // 			Marker:    "*",
        // 			Checklist: 0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "[",
        // 				},
        // 				&asciidoc.Anchor{
        // 					ID: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Fowler",
        // 						},
        // 					},
        // 					Elements: nil,
        // 				},
        // 				&asciidoc.String{
        // 					Value: "] Fowler M. ",
        // 				},
        // 				&asciidoc.Italic{
        // 					AttributeList: nil,
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Analysis Patterns: Reusable Object Models",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.String{
        // 					Value: ".",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "Addison-Wesley. 1997.",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should automatically add bibliography style to top-level lists in bibliography section`() {
        // Input: asciidoctor/lists_test_should_automatically_add_bibliography_style_to_top_level_lists_in_bibliography_section.adoc
        // Expected Go AST:
        // var listsTestShouldAutomaticallyAddBibliographyStyleToTopLevelListsInBibliographySection =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Section{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "bibliography",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "[",
        // 						},
        // 						&asciidoc.Anchor{
        // 							ID: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "taoup",
        // 								},
        // 							},
        // 							Elements: nil,
        // 						},
        // 						&asciidoc.String{
        // 							Value: "] Eric Steven Raymond. _The Art of Unix",
        // 						},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "  Programming_. Addison-Wesley. ISBN 0-13-142901-9.",
        // 						},
        // 					},
        // 					AttributeList: asciidoc.AttributeList{
        // 						&asciidoc.TitleAttribute{
        // 							Val: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Books",
        // 								},
        // 							},
        // 						},
        // 					},
        // 					Indent:    "",
        // 					Marker:    "*",
        // 					Checklist: 0,
        // 				},
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "[",
        // 						},
        // 						&asciidoc.Anchor{
        // 							ID: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "walsh-muellner",
        // 								},
        // 							},
        // 							Elements: nil,
        // 						},
        // 						&asciidoc.String{
        // 							Value: "] Norman Walsh & Leonard Muellner.",
        // 						},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "  ",
        // 						},
        // 						&asciidoc.Italic{
        // 							AttributeList: nil,
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "DocBook - The Definitive Guide",
        // 								},
        // 							},
        // 						},
        // 						&asciidoc.String{
        // 							Value: ". O'Reilly & Associates. 1999.",
        // 						},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "  ISBN 1-56592-580-7.",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        "*",
        // 					Checklist:     0,
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "[",
        // 						},
        // 						&asciidoc.Anchor{
        // 							ID: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "doc-writer",
        // 								},
        // 							},
        // 							Elements: nil,
        // 						},
        // 						&asciidoc.String{
        // 							Value: "] Doc Writer. ",
        // 						},
        // 						&asciidoc.Italic{
        // 							AttributeList: nil,
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Documentation As Code",
        // 								},
        // 							},
        // 						},
        // 						&asciidoc.String{
        // 							Value: ". Static Times, 54. August 2016.",
        // 						},
        // 					},
        // 					AttributeList: asciidoc.AttributeList{
        // 						&asciidoc.TitleAttribute{
        // 							Val: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Periodicals",
        // 								},
        // 							},
        // 						},
        // 					},
        // 					Indent:    "",
        // 					Marker:    "*",
        // 					Checklist: 0,
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Bibliography",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not recognize bibliography anchor that begins with a digit`() {
        // Input: asciidoctor/lists_test_should_not_recognize_bibliography_anchor_that_begins_with_a_digit.adoc
        // Expected Go AST:
        // var listsTestShouldNotRecognizeBibliographyAnchorThatBeginsWithADigit =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "[[[1984]]] George Orwell. ",
        // 				},
        // 				&asciidoc.Italic{
        // 					AttributeList: nil,
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "1984",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.String{
        // 					Value: ". New American Library. 1950.",
        // 				},
        // 			},
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "bibliography",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Indent:    "",
        // 			Marker:    "-",
        // 			Checklist: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should recognize bibliography anchor that contains a digit but does not start with one`() {
        // Input: asciidoctor/lists_test_should_recognize_bibliography_anchor_that_contains_a_digit_but_does_not_start_with_one.adoc
        // Expected Go AST:
        // var listsTestShouldRecognizeBibliographyAnchorThatContainsADigitButDoesNotStartWithOne =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "[",
        // 				},
        // 				&asciidoc.Anchor{
        // 					ID: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "_1984",
        // 						},
        // 					},
        // 					Elements: nil,
        // 				},
        // 				&asciidoc.String{
        // 					Value: "] George Orwell. ",
        // 				},
        // 				&asciidoc.DoubleItalic{
        // 					AttributeList: nil,
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "1984",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.String{
        // 					Value: ". New American Library. 1950.",
        // 				},
        // 			},
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "bibliography",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Indent:    "",
        // 			Marker:    "-",
        // 			Checklist: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should catalog bibliography anchors in bibliography list`() {
        // Input: asciidoctor/lists_test_should_catalog_bibliography_anchors_in_bibliography_list.adoc
        // Expected Go AST:
        // var listsTestShouldCatalogBibliographyAnchorsInBibliographyList =
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
        // 				&asciidoc.String{
        // 					Value: "Please read ",
        // 				},
        // 				&asciidoc.CrossReference{
        // 					AttributeList: nil,
        // 					Elements:      nil,
        // 					ID: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Fowler_1997",
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
        // 				&asciidoc.Section{
        // 					AttributeList: asciidoc.AttributeList{
        // 						&asciidoc.ShorthandAttribute{
        // 							Style: &asciidoc.ShorthandStyle{
        // 								Elements: asciidoc.Elements{
        // 									&asciidoc.String{
        // 										Value: "bibliography",
        // 									},
        // 								},
        // 							},
        // 							ID:      nil,
        // 							Roles:   nil,
        // 							Options: nil,
        // 						},
        // 					},
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.EmptyLine{
        // 							Text: "",
        // 						},
        // 						&asciidoc.UnorderedListItem{
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "[",
        // 								},
        // 								&asciidoc.Anchor{
        // 									ID: asciidoc.Elements{
        // 										&asciidoc.String{
        // 											Value: "Fowler_1997",
        // 										},
        // 									},
        // 									Elements: nil,
        // 								},
        // 								&asciidoc.String{
        // 									Value: "] Fowler M. ",
        // 								},
        // 								&asciidoc.Italic{
        // 									AttributeList: nil,
        // 									Elements: asciidoc.Elements{
        // 										&asciidoc.String{
        // 											Value: "Analysis Patterns: Reusable Object Models",
        // 										},
        // 									},
        // 								},
        // 								&asciidoc.String{
        // 									Value: ". Addison-Wesley. 1997.",
        // 								},
        // 							},
        // 							AttributeList: nil,
        // 							Indent:        "",
        // 							Marker:        "*",
        // 							Checklist:     0,
        // 						},
        // 					},
        // 					Title: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "References",
        // 						},
        // 					},
        // 					Level: 1,
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Article Title",
        // 				},
        // 			},
        // 			Level: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should use reftext from bibliography anchor at xref and entry`() {
        // Input: asciidoctor/lists_test_should_use_reftext_from_bibliography_anchor_at_xref_and_entry.adoc
        // Expected Go AST:
        // var listsTestShouldUseReftextFromBibliographyAnchorAtXrefAndEntry =
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
        // 				&asciidoc.String{
        // 					Value: "Begin with ",
        // 				},
        // 				&asciidoc.CrossReference{
        // 					AttributeList: nil,
        // 					Elements:      nil,
        // 					ID: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "TMMM",
        // 						},
        // 					},
        // 					Format: 0,
        // 				},
        // 				&asciidoc.String{
        // 					Value: ".",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "Then move on to ",
        // 				},
        // 				&asciidoc.CrossReference{
        // 					AttributeList: nil,
        // 					Elements:      nil,
        // 					ID: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Fowler_1997",
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
        // 				&asciidoc.Section{
        // 					AttributeList: asciidoc.AttributeList{
        // 						&asciidoc.ShorthandAttribute{
        // 							Style: &asciidoc.ShorthandStyle{
        // 								Elements: asciidoc.Elements{
        // 									&asciidoc.String{
        // 										Value: "bibliography",
        // 									},
        // 								},
        // 							},
        // 							ID:      nil,
        // 							Roles:   nil,
        // 							Options: nil,
        // 						},
        // 					},
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.EmptyLine{
        // 							Text: "",
        // 						},
        // 						&asciidoc.UnorderedListItem{
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "[",
        // 								},
        // 								&asciidoc.Anchor{
        // 									ID: asciidoc.Elements{
        // 										&asciidoc.String{
        // 											Value: "TMMM",
        // 										},
        // 									},
        // 									Elements: nil,
        // 								},
        // 								&asciidoc.String{
        // 									Value: "] Brooks F. ",
        // 								},
        // 								&asciidoc.Italic{
        // 									AttributeList: nil,
        // 									Elements: asciidoc.Elements{
        // 										&asciidoc.String{
        // 											Value: "The Mythical Man-Month",
        // 										},
        // 									},
        // 								},
        // 								&asciidoc.String{
        // 									Value: ". Addison-Wesley. 1975.",
        // 								},
        // 							},
        // 							AttributeList: nil,
        // 							Indent:        "",
        // 							Marker:        "*",
        // 							Checklist:     0,
        // 						},
        // 						&asciidoc.UnorderedListItem{
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "[",
        // 								},
        // 								&asciidoc.Anchor{
        // 									ID: asciidoc.Elements{
        // 										&asciidoc.String{
        // 											Value: "Fowler_1997",
        // 										},
        // 									},
        // 									Elements: asciidoc.Elements{
        // 										&asciidoc.String{
        // 											Value: "1",
        // 										},
        // 									},
        // 								},
        // 								&asciidoc.String{
        // 									Value: "] Fowler M. ",
        // 								},
        // 								&asciidoc.Italic{
        // 									AttributeList: nil,
        // 									Elements: asciidoc.Elements{
        // 										&asciidoc.String{
        // 											Value: "Analysis Patterns: Reusable Object Models",
        // 										},
        // 									},
        // 								},
        // 								&asciidoc.String{
        // 									Value: ". Addison-Wesley. 1997.",
        // 								},
        // 							},
        // 							AttributeList: nil,
        // 							Indent:        "",
        // 							Marker:        "*",
        // 							Checklist:     0,
        // 						},
        // 					},
        // 					Title: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "References",
        // 						},
        // 					},
        // 					Level: 1,
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Article Title",
        // 				},
        // 			},
        // 			Level: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should assign reftext of bibliography anchor to xreflabel in DocBook backend`() {
        // Input: asciidoctor/lists_test_should_assign_reftext_of_bibliography_anchor_to_xreflabel_in_doc_book_backend.adoc
        // Expected Go AST:
        // var listsTestShouldAssignReftextOfBibliographyAnchorToXreflabelInDocBookBackend =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "[",
        // 				},
        // 				&asciidoc.Anchor{
        // 					ID: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Fowler_1997",
        // 						},
        // 					},
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "1",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.String{
        // 					Value: "] Fowler M. ",
        // 				},
        // 				&asciidoc.Italic{
        // 					AttributeList: nil,
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Analysis Patterns: Reusable Object Models",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.String{
        // 					Value: ". Addison-Wesley. 1997.",
        // 				},
        // 			},
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "bibliography",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Indent:    "",
        // 			Marker:    "*",
        // 			Checklist: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `folds text from subsequent line`() {
        // Input: asciidoctor/lists_test_folds_text_from_subsequent_line.adoc
        // Expected Go AST:
        // var listsTestFoldsTextFromSubsequentLine =
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
        // 				&asciidoc.DescriptionListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "def1",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Marker:        "::",
        // 					Term: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "term",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "1",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `folds text from first line after blank lines`() {
        // Input: asciidoctor/lists_test_folds_text_from_first_line_after_blank_lines.adoc
        // Expected Go AST:
        // var listsTestFoldsTextFromFirstLineAfterBlankLines =
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
        // 				&asciidoc.DescriptionListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "def1",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Marker:        "::",
        // 					Term: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "term",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "1",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `folds text from first line after blank line and immediately preceding next item`() {
        // Input: asciidoctor/lists_test_folds_text_from_first_line_after_blank_line_and_immediately_preceding_next_item.adoc
        // Expected Go AST:
        // var listsTestFoldsTextFromFirstLineAfterBlankLineAndImmediatelyPrecedingNextItem =
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
        // 				&asciidoc.DescriptionListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "def1",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Marker:        "::",
        // 					Term: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "term",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "1",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.String{
        // 					Value: "term2:: def2",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `paragraph offset by blank lines does not break list if label does not have inline text`() {
        // Input: asciidoctor/lists_test_paragraph_offset_by_blank_lines_does_not_break_list_if_label_does_not_have_inline_text.adoc
        // Expected Go AST:
        // var listsTestParagraphOffsetByBlankLinesDoesNotBreakListIfLabelDoesNotHaveInlineText =
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
        // 				&asciidoc.DescriptionListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "def1",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Marker:        "::",
        // 					Term: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "term",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "1",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "term2:: def2",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `folds text from first line after comment line`() {
        // Input: asciidoctor/lists_test_folds_text_from_first_line_after_comment_line.adoc
        // Expected Go AST:
        // var listsTestFoldsTextFromFirstLineAfterCommentLine =
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
        // 				&asciidoc.DescriptionListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "// comment",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Marker:        "::",
        // 					Term: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "term",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "1",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.String{
        // 					Value: "def1",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `folds text from line following comment line offset by blank line`() {
        // Input: asciidoctor/lists_test_folds_text_from_line_following_comment_line_offset_by_blank_line.adoc
        // Expected Go AST:
        // var listsTestFoldsTextFromLineFollowingCommentLineOffsetByBlankLine =
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
        // 				&asciidoc.DescriptionListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "// comment",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Marker:        "::",
        // 					Term: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "term",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "1",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.String{
        // 					Value: "def1",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `folds text from subsequent indented line`() {
        // Input: asciidoctor/lists_test_folds_text_from_subsequent_indented_line.adoc
        // Expected Go AST:
        // var listsTestFoldsTextFromSubsequentIndentedLine =
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
        // 				&asciidoc.DescriptionListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "  def1",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Marker:        "::",
        // 					Term: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "term",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "1",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `folds text from indented line after blank line`() {
        // Input: asciidoctor/lists_test_folds_text_from_indented_line_after_blank_line.adoc
        // Expected Go AST:
        // var listsTestFoldsTextFromIndentedLineAfterBlankLine =
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
        // 				&asciidoc.DescriptionListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "  def1",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Marker:        "::",
        // 					Term: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "term",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "1",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `folds text that looks like ruler offset by blank line`() {
        // Input: asciidoctor/lists_test_folds_text_that_looks_like_ruler_offset_by_blank_line.adoc
        // Expected Go AST:
        // var listsTestFoldsTextThatLooksLikeRulerOffsetByBlankLine =
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
        // 				&asciidoc.DescriptionListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "'''",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Marker:        "::",
        // 					Term: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "term",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "1",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `folds text that looks like ruler offset by blank line and line comment`() {
        // Input: asciidoctor/lists_test_folds_text_that_looks_like_ruler_offset_by_blank_line_and_line_comment.adoc
        // Expected Go AST:
        // var listsTestFoldsTextThatLooksLikeRulerOffsetByBlankLineAndLineComment =
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
        // 				&asciidoc.DescriptionListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "// comment",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Marker:        "::",
        // 					Term: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "term",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "1",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.ThematicBreak{
        // 					AttributeList: nil,
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `folds text that looks like ruler and the line following it offset by blank line`() {
        // Input: asciidoctor/lists_test_folds_text_that_looks_like_ruler_and_the_line_following_it_offset_by_blank_line.adoc
        // Expected Go AST:
        // var listsTestFoldsTextThatLooksLikeRulerAndTheLineFollowingItOffsetByBlankLine =
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
        // 				&asciidoc.DescriptionListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "'''",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Marker:        "::",
        // 					Term: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "term",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "1",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.String{
        // 					Value: "continued",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `folds text that looks like title offset by blank line`() {
        // Input: asciidoctor/lists_test_folds_text_that_looks_like_title_offset_by_blank_line.adoc
        // Expected Go AST:
        // var listsTestFoldsTextThatLooksLikeTitleOffsetByBlankLine =
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
        // 				&asciidoc.DescriptionListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: ".def1",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Marker:        "::",
        // 					Term: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "term",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "1",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `folds text that looks like title offset by blank line and line comment`() {
        // Input: asciidoctor/lists_test_folds_text_that_looks_like_title_offset_by_blank_line_and_line_comment.adoc
        // Expected Go AST:
        // var listsTestFoldsTextThatLooksLikeTitleOffsetByBlankLineAndLineComment =
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
        // 				&asciidoc.DescriptionListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "// comment",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Marker:        "::",
        // 					Term: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "term",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "1",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.Paragraph{
        // 					AttributeList: asciidoc.AttributeList{
        // 						&asciidoc.TitleAttribute{
        // 							Val: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "def1",
        // 								},
        // 							},
        // 						},
        // 					},
        // 					Elements:   asciidoc.Elements{},
        // 					Admonition: 0,
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `folds text that looks like admonition offset by blank line`() {
        // Input: asciidoctor/lists_test_folds_text_that_looks_like_admonition_offset_by_blank_line.adoc
        // Expected Go AST:
        // var listsTestFoldsTextThatLooksLikeAdmonitionOffsetByBlankLine =
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
        // 				&asciidoc.DescriptionListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.Paragraph{
        // 							AttributeList: nil,
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "def1",
        // 								},
        // 							},
        // 							Admonition: 1,
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Marker:        "::",
        // 					Term: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "term",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "1",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `folds text that looks like section title offset by blank line`() {
        // Input: asciidoctor/lists_test_folds_text_that_looks_like_section_title_offset_by_blank_line.adoc
        // Expected Go AST:
        // var listsTestFoldsTextThatLooksLikeSectionTitleOffsetByBlankLine =
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
        // 				&asciidoc.DescriptionListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "== Another Section",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Marker:        "::",
        // 					Term: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "term",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "1",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `folds text of first literal line offset by blank line appends subsequent literals offset by blank line as blocks`() {
        // Input: asciidoctor/lists_test_folds_text_of_first_literal_line_offset_by_blank_line_appends_subsequent_literals_offset_by_blank_line_as_blocks.adoc
        // Expected Go AST:
        // var listsTestFoldsTextOfFirstLiteralLineOffsetByBlankLineAppendsSubsequentLiteralsOffsetByBlankLineAsBlocks =
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
        // 				&asciidoc.DescriptionListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "  def1",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Marker:        "::",
        // 					Term: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "term",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "1",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "  literal",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "  literal",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `folds text of subsequent line and appends following literal line offset by blank line as block if term has no inline description`() {
        // Input: asciidoctor/lists_test_folds_text_of_subsequent_line_and_appends_following_literal_line_offset_by_blank_line_as_block_if_term_has_no_inline_description.adoc
        // Expected Go AST:
        // var listsTestFoldsTextOfSubsequentLineAndAppendsFollowingLiteralLineOffsetByBlankLineAsBlockIfTermHasNoInlineDescription =
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
        // 				&asciidoc.DescriptionListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "def1",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Marker:        "::",
        // 					Term: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "term",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "1",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "  literal",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "term2:: def2",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `appends literal line attached by continuation as block if item has no inline description`() {
        // Input: asciidoctor/lists_test_appends_literal_line_attached_by_continuation_as_block_if_item_has_no_inline_description.adoc
        // Expected Go AST:
        // var listsTestAppendsLiteralLineAttachedByContinuationAsBlockIfItemHasNoInlineDescription =
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
        // 				&asciidoc.DescriptionListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.LineBreak{},
        // 					},
        // 					AttributeList: nil,
        // 					Marker:        "::",
        // 					Term: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "term",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "1",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.String{
        // 					Value: "  literal",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `appends literal line attached by continuation as block if item has no inline description followed by ruler`() {
        // Input: asciidoctor/lists_test_appends_literal_line_attached_by_continuation_as_block_if_item_has_no_inline_description_followed_by_ruler.adoc
        // Expected Go AST:
        // var listsTestAppendsLiteralLineAttachedByContinuationAsBlockIfItemHasNoInlineDescriptionFollowedByRuler =
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
        // 				&asciidoc.DescriptionListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.LineBreak{},
        // 					},
        // 					AttributeList: nil,
        // 					Marker:        "::",
        // 					Term: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "term",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "1",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.String{
        // 					Value: "  literal",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.ThematicBreak{
        // 					AttributeList: nil,
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `appends line attached by continuation as block if item has no inline description followed by ruler`() {
        // Input: asciidoctor/lists_test_appends_line_attached_by_continuation_as_block_if_item_has_no_inline_description_followed_by_ruler.adoc
        // Expected Go AST:
        // var listsTestAppendsLineAttachedByContinuationAsBlockIfItemHasNoInlineDescriptionFollowedByRuler =
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
        // 				&asciidoc.DescriptionListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.LineBreak{},
        // 					},
        // 					AttributeList: nil,
        // 					Marker:        "::",
        // 					Term: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "term",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "1",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.String{
        // 					Value: "para",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.ThematicBreak{
        // 					AttributeList: nil,
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `appends line attached by continuation as block if item has no inline description followed by block`() {
        // Input: asciidoctor/lists_test_appends_line_attached_by_continuation_as_block_if_item_has_no_inline_description_followed_by_block.adoc
        // Expected Go AST:
        // var listsTestAppendsLineAttachedByContinuationAsBlockIfItemHasNoInlineDescriptionFollowedByBlock =
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
        // 				&asciidoc.DescriptionListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.LineBreak{},
        // 					},
        // 					AttributeList: nil,
        // 					Marker:        "::",
        // 					Term: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "term",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "1",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.String{
        // 					Value: "para",
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
        // 						"literal",
        // 					},
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `appends block attached by continuation but not subsequent block not attached by continuation`() {
        // Input: asciidoctor/lists_test_appends_block_attached_by_continuation_but_not_subsequent_block_not_attached_by_continuation.adoc
        // Expected Go AST:
        // var listsTestAppendsBlockAttachedByContinuationButNotSubsequentBlockNotAttachedByContinuation =
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
        // 				&asciidoc.DescriptionListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.LineBreak{},
        // 					},
        // 					AttributeList: nil,
        // 					Marker:        "::",
        // 					Term: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "term",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "1",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.LiteralBlock{
        // 					AttributeList: nil,
        // 					Delimiter: asciidoc.Delimiter{
        // 						Type:   6,
        // 						Length: 4,
        // 					},
        // 					LineList: asciidoc.LineList{
        // 						"literal",
        // 					},
        // 				},
        // 				&asciidoc.LiteralBlock{
        // 					AttributeList: nil,
        // 					Delimiter: asciidoc.Delimiter{
        // 						Type:   6,
        // 						Length: 4,
        // 					},
        // 					LineList: asciidoc.LineList{
        // 						"detached",
        // 					},
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `appends list if item has no inline description`() {
        // Input: asciidoctor/lists_test_appends_list_if_item_has_no_inline_description.adoc
        // Expected Go AST:
        // var listsTestAppendsListIfItemHasNoInlineDescription =
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
        // 				&asciidoc.DescriptionListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "* one",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Marker:        "::",
        // 					Term: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "term",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "1",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "two",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        "*",
        // 					Checklist:     0,
        // 				},
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "three",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        "*",
        // 					Checklist:     0,
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `appends list to first term when followed immediately by second term`() {
        // Input: asciidoctor/lists_test_appends_list_to_first_term_when_followed_immediately_by_second_term.adoc
        // Expected Go AST:
        // var listsTestAppendsListToFirstTermWhenFollowedImmediatelyBySecondTerm =
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
        // 				&asciidoc.DescriptionListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "* one",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Marker:        "::",
        // 					Term: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "term",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "1",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "two",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        "*",
        // 					Checklist:     0,
        // 				},
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "three",
        // 						},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "term2:: def2",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        "*",
        // 					Checklist:     0,
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `appends indented list to first term that is adjacent to second term`() {
        // Input: asciidoctor/lists_test_appends_indented_list_to_first_term_that_is_adjacent_to_second_term.adoc
        // Expected Go AST:
        // var listsTestAppendsIndentedListToFirstTermThatIsAdjacentToSecondTerm =
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
        // 				&asciidoc.DescriptionListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "  description 1",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Marker:        "::",
        // 					Term: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "label ",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "1",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "one",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "  ",
        // 					Marker:        "*",
        // 					Checklist:     0,
        // 				},
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "two",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "  ",
        // 					Marker:        "*",
        // 					Checklist:     0,
        // 				},
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "three",
        // 						},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "label 2::",
        // 						},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "  description 2",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "  ",
        // 					Marker:        "*",
        // 					Checklist:     0,
        // 				},
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
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `appends indented list to first term that is attached by a continuation and adjacent to second term`() {
        // Input: asciidoctor/lists_test_appends_indented_list_to_first_term_that_is_attached_by_a_continuation_and_adjacent_to_second_term.adoc
        // Expected Go AST:
        // var listsTestAppendsIndentedListToFirstTermThatIsAttachedByAContinuationAndAdjacentToSecondTerm =
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
        // 				&asciidoc.DescriptionListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "  description 1",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Marker:        "::",
        // 					Term: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "label ",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "1",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.LineBreak{},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "one",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "  ",
        // 					Marker:        "*",
        // 					Checklist:     0,
        // 				},
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "two",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "  ",
        // 					Marker:        "*",
        // 					Checklist:     0,
        // 				},
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "three",
        // 						},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "label 2::",
        // 						},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "  description 2",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "  ",
        // 					Marker:        "*",
        // 					Checklist:     0,
        // 				},
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
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `appends list and paragraph block when line following list attached by continuation`() {
        // Input: asciidoctor/lists_test_appends_list_and_paragraph_block_when_line_following_list_attached_by_continuation.adoc
        // Expected Go AST:
        // var listsTestAppendsListAndParagraphBlockWhenLineFollowingListAttachedByContinuation =
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
        // 				&asciidoc.DescriptionListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "* one",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Marker:        "::",
        // 					Term: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "term",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "1",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "two",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        "*",
        // 					Checklist:     0,
        // 				},
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "three",
        // 						},
        // 						&asciidoc.ListContinuation{
        // 							ChildElement: &asciidoc.Paragraph{
        // 								AttributeList: nil,
        // 								Elements: asciidoc.Elements{
        // 									&asciidoc.String{
        // 										Value: "para",
        // 									},
        // 								},
        // 								Admonition: 0,
        // 							},
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        "*",
        // 					Checklist:     0,
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `first continued line associated with nested list item and second continued line associated with term`() {
        // Input: asciidoctor/lists_test_first_continued_line_associated_with_nested_list_item_and_second_continued_line_associated_with_term.adoc
        // Expected Go AST:
        // var listsTestFirstContinuedLineAssociatedWithNestedListItemAndSecondContinuedLineAssociatedWithTerm =
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
        // 				&asciidoc.DescriptionListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "* one",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Marker:        "::",
        // 					Term: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "term",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "1",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.LineBreak{},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "nested list para",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.LineBreak{},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "term1 para",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `literal line attached by continuation swallows adjacent line that looks like term`() {
        // Input: asciidoctor/lists_test_literal_line_attached_by_continuation_swallows_adjacent_line_that_looks_like_term.adoc
        // Expected Go AST:
        // var listsTestLiteralLineAttachedByContinuationSwallowsAdjacentLineThatLooksLikeTerm =
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
        // 				&asciidoc.DescriptionListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.LineBreak{},
        // 					},
        // 					AttributeList: nil,
        // 					Marker:        "::",
        // 					Term: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "term",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "1",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.String{
        // 					Value: "  literal",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.DescriptionListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.LineBreak{},
        // 					},
        // 					AttributeList: nil,
        // 					Marker:        ":::",
        // 					Term: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "notnestedterm",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.String{
        // 					Value: "  literal",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "notnestedterm:::",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `line attached by continuation is appended as paragraph if term has no inline description`() {
        // Input: asciidoctor/lists_test_line_attached_by_continuation_is_appended_as_paragraph_if_term_has_no_inline_description.adoc
        // Expected Go AST:
        // var listsTestLineAttachedByContinuationIsAppendedAsParagraphIfTermHasNoInlineDescription =
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
        // 				&asciidoc.DescriptionListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.LineBreak{},
        // 					},
        // 					AttributeList: nil,
        // 					Marker:        "::",
        // 					Term: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "term",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "1",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.String{
        // 					Value: "para",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `attached paragraph does not break on adjacent nested description list term`() {
        // Input: asciidoctor/lists_test_attached_paragraph_does_not_break_on_adjacent_nested_description_list_term.adoc
        // Expected Go AST:
        // var listsTestAttachedParagraphDoesNotBreakOnAdjacentNestedDescriptionListTerm =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "term1:: def",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.LineBreak{},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "more description",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "not a term::: def",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `attached paragraph is terminated by adjacent sibling description list term`() {
        // Input: asciidoctor/lists_test_attached_paragraph_is_terminated_by_adjacent_sibling_description_list_term.adoc
        // Expected Go AST:
        // var listsTestAttachedParagraphIsTerminatedByAdjacentSiblingDescriptionListTerm =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "term1:: def",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.LineBreak{},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "more description",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "not a term:: def",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `attached styled paragraph does not break on adjacent nested description list term`() {
        // Input: asciidoctor/lists_test_attached_styled_paragraph_does_not_break_on_adjacent_nested_description_list_term.adoc
        // Expected Go AST:
        // var listsTestAttachedStyledParagraphDoesNotBreakOnAdjacentNestedDescriptionListTerm =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "term1:: def",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.LineBreak{},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.Paragraph{
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
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "more description",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "not a term::: def",
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
    fun `appends line as paragraph if attached by continuation following blank line and line comment when term has no inline description`() {
        // Input: asciidoctor/lists_test_appends_line_as_paragraph_if_attached_by_continuation_following_blank_line_and_line_comment_when_term_has_no_inline_description.adoc
        // Expected Go AST:
        // var listsTestAppendsLineAsParagraphIfAttachedByContinuationFollowingBlankLineAndLineCommentWhenTermHasNoInlineDescription =
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
        // 				&asciidoc.DescriptionListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "// comment",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Marker:        "::",
        // 					Term: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "term",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "1",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.LineBreak{},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "para",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `line attached by continuation offset by blank line is appended as paragraph if term has no inline description`() {
        // Input: asciidoctor/lists_test_line_attached_by_continuation_offset_by_blank_line_is_appended_as_paragraph_if_term_has_no_inline_description.adoc
        // Expected Go AST:
        // var listsTestLineAttachedByContinuationOffsetByBlankLineIsAppendedAsParagraphIfTermHasNoInlineDescription =
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
        // 				&asciidoc.DescriptionListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.LineBreak{},
        // 					},
        // 					AttributeList: nil,
        // 					Marker:        "::",
        // 					Term: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "term",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "1",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.String{
        // 					Value: "para",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `delimited block breaks list even when term has no inline description`() {
        // Input: asciidoctor/lists_test_delimited_block_breaks_list_even_when_term_has_no_inline_description.adoc
        // Expected Go AST:
        // var listsTestDelimitedBlockBreaksListEvenWhenTermHasNoInlineDescription =
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
        // 				&asciidoc.DescriptionListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "====",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Marker:        "::",
        // 					Term: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "term",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "1",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.String{
        // 					Value: "detached",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "====",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `block attribute line above delimited block that breaks a dlist is not duplicated`() {
        // Input: asciidoctor/lists_test_block_attribute_line_above_delimited_block_that_breaks_a_dlist_is_not_duplicated.adoc
        // Expected Go AST:
        // var listsTestBlockAttributeLineAboveDelimitedBlockThatBreaksADlistIsNotDuplicated =
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
        // 				&asciidoc.String{
        // 					Value: "term:: desc",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.Listing{
        // 					AttributeList: asciidoc.AttributeList{
        // 						&asciidoc.ShorthandAttribute{
        // 							Style: nil,
        // 							ID:    nil,
        // 							Roles: []*asciidoc.ShorthandRole{
        // 								&asciidoc.ShorthandRole{
        // 									Elements: asciidoc.Elements{
        // 										&asciidoc.String{
        // 											Value: "rolename",
        // 										},
        // 									},
        // 								},
        // 							},
        // 							Options: nil,
        // 						},
        // 					},
        // 					Delimiter: asciidoc.Delimiter{
        // 						Type:   5,
        // 						Length: 4,
        // 					},
        // 					LineList: asciidoc.LineList{
        // 						"detached",
        // 					},
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `block attribute line above paragraph breaks list even when term has no inline description`() {
        // Input: asciidoctor/lists_test_block_attribute_line_above_paragraph_breaks_list_even_when_term_has_no_inline_description.adoc
        // Expected Go AST:
        // var listsTestBlockAttributeLineAboveParagraphBreaksListEvenWhenTermHasNoInlineDescription =
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
        // 				&asciidoc.DescriptionListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "[verse]",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Marker:        "::",
        // 					Term: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "term",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "1",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.String{
        // 					Value: "detached",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `block attribute line above paragraph that breaks a dlist is not duplicated`() {
        // Input: asciidoctor/lists_test_block_attribute_line_above_paragraph_that_breaks_a_dlist_is_not_duplicated.adoc
        // Expected Go AST:
        // var listsTestBlockAttributeLineAboveParagraphThatBreaksADlistIsNotDuplicated =
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
        // 				&asciidoc.String{
        // 					Value: "term:: desc",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.Paragraph{
        // 					AttributeList: asciidoc.AttributeList{
        // 						&asciidoc.ShorthandAttribute{
        // 							Style: nil,
        // 							ID:    nil,
        // 							Roles: []*asciidoc.ShorthandRole{
        // 								&asciidoc.ShorthandRole{
        // 									Elements: asciidoc.Elements{
        // 										&asciidoc.String{
        // 											Value: "rolename",
        // 										},
        // 									},
        // 								},
        // 							},
        // 							Options: nil,
        // 						},
        // 					},
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "detached",
        // 						},
        // 						&asciidoc.NewLine{},
        // 					},
        // 					Admonition: 0,
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `block anchor line breaks list even when term has no inline description`() {
        // Input: asciidoctor/lists_test_block_anchor_line_breaks_list_even_when_term_has_no_inline_description.adoc
        // Expected Go AST:
        // var listsTestBlockAnchorLineBreaksListEvenWhenTermHasNoInlineDescription =
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
        // 				&asciidoc.DescriptionListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.Anchor{
        // 							ID: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "id",
        // 								},
        // 							},
        // 							Elements: nil,
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Marker:        "::",
        // 					Term: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "term",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "1",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.String{
        // 					Value: "detached",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `block attribute lines above nested horizontal list does not break list`() {
        // Input: asciidoctor/lists_test_block_attribute_lines_above_nested_horizontal_list_does_not_break_list.adoc
        // Expected Go AST:
        // var listsTestBlockAttributeLinesAboveNestedHorizontalListDoesNotBreakList =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "[horizontal]",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Operating Systems",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: "  Linux::: Fedora",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "  BSD::: OpenBSD",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "  PaaS::: OpenShift",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Cloud Providers",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: "  IaaS::: AWS",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `block attribute lines above nested list with style does not break list`() {
        // Input: asciidoctor/lists_test_block_attribute_lines_above_nested_list_with_style_does_not_break_list.adoc
        // Expected Go AST:
        // var listsTestBlockAttributeLinesAboveNestedListWithStyleDoesNotBreakList =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "* get groceries",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "TODO List",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "[square]",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Grocery List",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "bread",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "milk",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "lettuce",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `multiple block attribute lines above nested list does not break list`() {
        // Input: asciidoctor/lists_test_multiple_block_attribute_lines_above_nested_list_does_not_break_list.adoc
        // Expected Go AST:
        // var listsTestMultipleBlockAttributeLinesAboveNestedListDoesNotBreakList =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.Anchor{
        // 					ID: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "variants",
        // 						},
        // 					},
        // 					Elements: nil,
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Operating Systems",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "horizontal",
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
        // 					Value: "  Linux::: Fedora",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "  BSD::: OpenBSD",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 0,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "  PaaS::: OpenShift",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Cloud Providers",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: "  IaaS::: AWS",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `multiple block attribute lines separated by empty line above nested list does not break list`() {
        // Input: asciidoctor/lists_test_multiple_block_attribute_lines_separated_by_empty_line_above_nested_list_does_not_break_list.adoc
        // Expected Go AST:
        // var listsTestMultipleBlockAttributeLinesSeparatedByEmptyLineAboveNestedListDoesNotBreakList =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.Anchor{
        // 					ID: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "variants",
        // 						},
        // 					},
        // 					Elements: nil,
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Operating Systems",
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
        // 								Value: "horizontal",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Elements:   asciidoc.Elements{},
        // 			Admonition: 0,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "  Linux::: Fedora",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "  BSD::: OpenBSD",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "  PaaS::: OpenShift",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Cloud Providers",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: "  IaaS::: AWS",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `folds text from inline description and subsequent line`() {
        // Input: asciidoctor/lists_test_folds_text_from_inline_description_and_subsequent_line.adoc
        // Expected Go AST:
        // var listsTestFoldsTextFromInlineDescriptionAndSubsequentLine =
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
        // 				&asciidoc.String{
        // 					Value: "term1:: def1",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "continued",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `folds text from inline description and subsequent lines`() {
        // Input: asciidoctor/lists_test_folds_text_from_inline_description_and_subsequent_lines.adoc
        // Expected Go AST:
        // var listsTestFoldsTextFromInlineDescriptionAndSubsequentLines =
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
        // 				&asciidoc.String{
        // 					Value: "term1:: def1",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "continued",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "continued",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `folds text from inline description and line following comment line`() {
        // Input: asciidoctor/lists_test_folds_text_from_inline_description_and_line_following_comment_line.adoc
        // Expected Go AST:
        // var listsTestFoldsTextFromInlineDescriptionAndLineFollowingCommentLine =
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
        // 				&asciidoc.String{
        // 					Value: "term1:: def1",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.SingleLineComment{
        // 					Value: " comment",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "continued",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `folds text from inline description and subsequent indented line`() {
        // Input: asciidoctor/lists_test_folds_text_from_inline_description_and_subsequent_indented_line.adoc
        // Expected Go AST:
        // var listsTestFoldsTextFromInlineDescriptionAndSubsequentIndentedLine =
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
        // 				&asciidoc.String{
        // 					Value: "term1:: def1",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "  continued",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "List",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `appends literal line offset by blank line as block if item has inline description`() {
        // Input: asciidoctor/lists_test_appends_literal_line_offset_by_blank_line_as_block_if_item_has_inline_description.adoc
        // Expected Go AST:
        // var listsTestAppendsLiteralLineOffsetByBlankLineAsBlockIfItemHasInlineDescription =
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
        // 				&asciidoc.String{
        // 					Value: "term1:: def1",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "  literal",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `appends literal line offset by blank line as block and appends line after continuation as block if item has inline description`() {
        // Input: asciidoctor/lists_test_appends_literal_line_offset_by_blank_line_as_block_and_appends_line_after_continuation_as_block_if_item_has_inline_description.adoc
        // Expected Go AST:
        // var listsTestAppendsLiteralLineOffsetByBlankLineAsBlockAndAppendsLineAfterContinuationAsBlockIfItemHasInlineDescription =
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
        // 				&asciidoc.String{
        // 					Value: "term1:: def1",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "  literal",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.LineBreak{},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "para",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `appends line after continuation as block and literal line offset by blank line as block if item has inline description`() {
        // Input: asciidoctor/lists_test_appends_line_after_continuation_as_block_and_literal_line_offset_by_blank_line_as_block_if_item_has_inline_description.adoc
        // Expected Go AST:
        // var listsTestAppendsLineAfterContinuationAsBlockAndLiteralLineOffsetByBlankLineAsBlockIfItemHasInlineDescription =
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
        // 				&asciidoc.String{
        // 					Value: "term1:: def1",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.LineBreak{},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "para",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "  literal",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `appends list if item has inline description`() {
        // Input: asciidoctor/lists_test_appends_list_if_item_has_inline_description.adoc
        // Expected Go AST:
        // var listsTestAppendsListIfItemHasInlineDescription =
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
        // 				&asciidoc.String{
        // 					Value: "term1:: def1",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "one",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        "*",
        // 					Checklist:     0,
        // 				},
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "two",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        "*",
        // 					Checklist:     0,
        // 				},
        // 				&asciidoc.UnorderedListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "three",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Indent:        "",
        // 					Marker:        "*",
        // 					Checklist:     0,
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `appends literal line attached by continuation as block if item has inline description followed by ruler`() {
        // Input: asciidoctor/lists_test_appends_literal_line_attached_by_continuation_as_block_if_item_has_inline_description_followed_by_ruler.adoc
        // Expected Go AST:
        // var listsTestAppendsLiteralLineAttachedByContinuationAsBlockIfItemHasInlineDescriptionFollowedByRuler =
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
        // 				&asciidoc.String{
        // 					Value: "term1:: def1",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.LineBreak{},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "  literal",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.ThematicBreak{
        // 					AttributeList: nil,
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `line offset by blank line breaks list if term has inline description`() {
        // Input: asciidoctor/lists_test_line_offset_by_blank_line_breaks_list_if_term_has_inline_description.adoc
        // Expected Go AST:
        // var listsTestLineOffsetByBlankLineBreaksListIfTermHasInlineDescription =
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
        // 				&asciidoc.String{
        // 					Value: "term1:: def1",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "detached",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `nested term with description does not consume following heading`() {
        // Input: asciidoctor/lists_test_nested_term_with_description_does_not_consume_following_heading.adoc
        // Expected Go AST:
        // var listsTestNestedTermWithDescriptionDoesNotConsumeFollowingHeading =
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
        // 				&asciidoc.DescriptionListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "  def",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Marker:        "::",
        // 					Term: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "term",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.DescriptionListItem{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.String{
        // 							Value: "    nesteddef",
        // 						},
        // 					},
        // 					AttributeList: nil,
        // 					Marker:        ";;",
        // 					Term: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "  nestedterm",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "Detached",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "~~~~~~~~",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `line attached by continuation is appended as paragraph if term has inline description followed by detached paragraph`() {
        // Input: asciidoctor/lists_test_line_attached_by_continuation_is_appended_as_paragraph_if_term_has_inline_description_followed_by_detached_paragraph.adoc
        // Expected Go AST:
        // var listsTestLineAttachedByContinuationIsAppendedAsParagraphIfTermHasInlineDescriptionFollowedByDetachedParagraph =
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
        // 				&asciidoc.String{
        // 					Value: "term1:: def1",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.LineBreak{},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "para",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "detached",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `line attached by continuation is appended as paragraph if term has inline description followed by detached block`() {
        // Input: asciidoctor/lists_test_line_attached_by_continuation_is_appended_as_paragraph_if_term_has_inline_description_followed_by_detached_block.adoc
        // Expected Go AST:
        // var listsTestLineAttachedByContinuationIsAppendedAsParagraphIfTermHasInlineDescriptionFollowedByDetachedBlock =
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
        // 				&asciidoc.String{
        // 					Value: "term1:: def1",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.LineBreak{},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "para",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.SidebarBlock{
        // 					Delimiter: asciidoc.Delimiter{
        // 						Type:   8,
        // 						Length: 4,
        // 					},
        // 					AttributeList: nil,
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "detached",
        // 						},
        // 						&asciidoc.NewLine{},
        // 					},
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `line attached by continuation offset by line comment is appended as paragraph if term has inline description`() {
        // Input: asciidoctor/lists_test_line_attached_by_continuation_offset_by_line_comment_is_appended_as_paragraph_if_term_has_inline_description.adoc
        // Expected Go AST:
        // var listsTestLineAttachedByContinuationOffsetByLineCommentIsAppendedAsParagraphIfTermHasInlineDescription =
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
        // 				&asciidoc.String{
        // 					Value: "term1:: def1",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.SingleLineComment{
        // 					Value: " comment",
        // 				},
        // 				&asciidoc.LineBreak{},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "para",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `line attached by continuation offset by blank line is appended as paragraph if term has inline description`() {
        // Input: asciidoctor/lists_test_line_attached_by_continuation_offset_by_blank_line_is_appended_as_paragraph_if_term_has_inline_description.adoc
        // Expected Go AST:
        // var listsTestLineAttachedByContinuationOffsetByBlankLineIsAppendedAsParagraphIfTermHasInlineDescription =
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
        // 				&asciidoc.String{
        // 					Value: "term1:: def1",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.LineBreak{},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "para",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `line comment offset by blank line divides lists because item has text`() {
        // Input: asciidoctor/lists_test_line_comment_offset_by_blank_line_divides_lists_because_item_has_text.adoc
        // Expected Go AST:
        // var listsTestLineCommentOffsetByBlankLineDividesListsBecauseItemHasText =
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
        // 				&asciidoc.String{
        // 					Value: "term1:: def1",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.SingleLineComment{
        // 					Value: "",
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "term2:: def2",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `ruler offset by blank line divides lists because item has text`() {
        // Input: asciidoctor/lists_test_ruler_offset_by_blank_line_divides_lists_because_item_has_text.adoc
        // Expected Go AST:
        // var listsTestRulerOffsetByBlankLineDividesListsBecauseItemHasText =
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
        // 				&asciidoc.String{
        // 					Value: "term1:: def1",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.ThematicBreak{
        // 					AttributeList: nil,
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "term2:: def2",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `block title offset by blank line divides lists and becomes title of second list because item has text`() {
        // Input: asciidoctor/lists_test_block_title_offset_by_blank_line_divides_lists_and_becomes_title_of_second_list_because_item_has_text.adoc
        // Expected Go AST:
        // var listsTestBlockTitleOffsetByBlankLineDividesListsAndBecomesTitleOfSecondListBecauseItemHasText =
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
        // 				&asciidoc.String{
        // 					Value: "term1:: def1",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.Paragraph{
        // 					AttributeList: asciidoc.AttributeList{
        // 						&asciidoc.TitleAttribute{
        // 							Val: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "title",
        // 								},
        // 							},
        // 						},
        // 					},
        // 					Elements:   asciidoc.Elements{},
        // 					Admonition: 0,
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "term2:: def2",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Lists",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `does not recognize callout list denoted by markers that only have a trailing bracket`() {
        // Input: asciidoctor/lists_test_does_not_recognize_callout_list_denoted_by_markers_that_only_have_a_trailing_bracket.adoc
        // Expected Go AST:
        // var listsTestDoesNotRecognizeCalloutListDenotedByMarkersThatOnlyHaveATrailingBracket =
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
        // 				"require 'asciidoctor' # <1>",
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: "1> Not a callout list item",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not hang if obsolete callout list is found inside list item`() {
        // Input: asciidoctor/lists_test_should_not_hang_if_obsolete_callout_list_is_found_inside_list_item.adoc
        // Expected Go AST:
        // var listsTestShouldNotHangIfObsoleteCalloutListIsFoundInsideListItem =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "foo",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "1> bar",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not hang if obsolete callout list is found inside dlist item`() {
        // Input: asciidoctor/lists_test_should_not_hang_if_obsolete_callout_list_is_found_inside_dlist_item.adoc
        // Expected Go AST:
        // var listsTestShouldNotHangIfObsoleteCalloutListIsFoundInsideDlistItem =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "1> bar",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "foo",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should recognize auto-numberd callout list inside list`() {
        // Input: asciidoctor/lists_test_should_recognize_auto_numberd_callout_list_inside_list.adoc
        // Expected Go AST:
        // var listsTestShouldRecognizeAutoNumberdCalloutListInsideList =
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
        // 				"require 'asciidoctor' # <1>",
        // 			},
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "foo",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "<.> bar",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `listing block with sequential callouts followed by adjacent callout list`() {
        // Input: asciidoctor/lists_test_listing_block_with_sequential_callouts_followed_by_adjacent_callout_list.adoc
        // Expected Go AST:
        // var listsTestListingBlockWithSequentialCalloutsFollowedByAdjacentCalloutList =
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
        // 				"require 'asciidoctor' # <1>",
        // 				"doc = Asciidoctor::Document.new('Hello, World!') # <2>",
        // 				"puts doc.convert # <3>",
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: "<1> Describe the first line",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "<2> Describe the second line",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "<3> Describe the third line",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `listing block with sequential callouts followed by non-adjacent callout list`() {
        // Input: asciidoctor/lists_test_listing_block_with_sequential_callouts_followed_by_non_adjacent_callout_list.adoc
        // Expected Go AST:
        // var listsTestListingBlockWithSequentialCalloutsFollowedByNonAdjacentCalloutList =
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
        // 				"require 'asciidoctor' # <1>",
        // 				"doc = Asciidoctor::Document.new('Hello, World!') # <2>",
        // 				"puts doc.convert # <3>",
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Paragraph.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "<1> Describe the first line",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "<2> Describe the second line",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "<3> Describe the third line",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `listing block with a callout that refers to two different lines`() {
        // Input: asciidoctor/lists_test_listing_block_with_a_callout_that_refers_to_two_different_lines.adoc
        // Expected Go AST:
        // var listsTestListingBlockWithACalloutThatRefersToTwoDifferentLines =
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
        // 				"require 'asciidoctor' # <1>",
        // 				"doc = Asciidoctor::Document.new('Hello, World!') # <2>",
        // 				"puts doc.convert # <2>",
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: "<1> Import the library",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "<2> Where the magic happens",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `source block with non-sequential callouts followed by adjacent callout list`() {
        // Input: asciidoctor/lists_test_source_block_with_non_sequential_callouts_followed_by_adjacent_callout_list.adoc
        // Expected Go AST:
        // var listsTestSourceBlockWithNonSequentialCalloutsFollowedByAdjacentCalloutList =
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
        // 				"require 'asciidoctor' # <2>",
        // 				"doc = Asciidoctor::Document.new('Hello, World!') # <3>",
        // 				"puts doc.convert # <1>",
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: "<1> Describe the first line",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "<2> Describe the second line",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "<3> Describe the third line",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `two listing blocks can share the same callout list`() {
        // Input: asciidoctor/lists_test_two_listing_blocks_can_share_the_same_callout_list.adoc
        // Expected Go AST:
        // var listsTestTwoListingBlocksCanShareTheSameCalloutList =
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
        // 							Value: "Import library",
        // 						},
        // 					},
        // 				},
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
        // 				"require 'asciidoctor' # <1>",
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
        // 							Value: "Use library",
        // 						},
        // 					},
        // 				},
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
        // 				"doc = Asciidoctor::Document.new('Hello, World!') # <2>",
        // 				"puts doc.convert # <3>",
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "<1> Describe the first line",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "<2> Describe the second line",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "<3> Describe the third line",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `two listing blocks each followed by an adjacent callout list`() {
        // Input: asciidoctor/lists_test_two_listing_blocks_each_followed_by_an_adjacent_callout_list.adoc
        // Expected Go AST:
        // var listsTestTwoListingBlocksEachFollowedByAnAdjacentCalloutList =
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
        // 							Value: "Import library",
        // 						},
        // 					},
        // 				},
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
        // 				"require 'asciidoctor' # <1>",
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: "<1> Describe the first line",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Listing{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Use library",
        // 						},
        // 					},
        // 				},
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
        // 				"doc = Asciidoctor::Document.new('Hello, World!') # <1>",
        // 				"puts doc.convert # <2>",
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: "<1> Describe the second line",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "<2> Describe the third line",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `callout list retains block content`() {
        // Input: asciidoctor/lists_test_callout_list_retains_block_content.adoc
        // Expected Go AST:
        // var listsTestCalloutListRetainsBlockContent =
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
        // 				"require 'asciidoctor' # <1>",
        // 				"doc = Asciidoctor::Document.new('Hello, World!') # <2>",
        // 				"puts doc.convert # <3>",
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: "<1> Imports the library",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "as a RubyGem",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "<2> Creates a new document",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Scans the lines for known blocks",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Converts the lines into blocks",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "<3> Renders the document",
        // 				},
        // 				&asciidoc.ListContinuation{
        // 					ChildElement: &asciidoc.Paragraph{
        // 						AttributeList: nil,
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "You can write this to file rather than printing to stdout.",
        // 							},
        // 						},
        // 						Admonition: 0,
        // 					},
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `callout list retains block content when converted to DocBook`() {
        // Input: asciidoctor/lists_test_callout_list_retains_block_content_when_converted_to_doc_book.adoc
        // Expected Go AST:
        // var listsTestCalloutListRetainsBlockContentWhenConvertedToDocBook =
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
        // 				"require 'asciidoctor' # <1>",
        // 				"doc = Asciidoctor::Document.new('Hello, World!') # <2>",
        // 				"puts doc.convert # <3>",
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: "<1> Imports the library",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "as a RubyGem",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "<2> Creates a new document",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Scans the lines for known blocks",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Converts the lines into blocks",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "<3> Renders the document",
        // 				},
        // 				&asciidoc.ListContinuation{
        // 					ChildElement: &asciidoc.Paragraph{
        // 						AttributeList: nil,
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "You can write this to file rather than printing to stdout.",
        // 							},
        // 						},
        // 						Admonition: 0,
        // 					},
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `escaped callout should not be interpreted as a callout`() {
        // Input: asciidoctor/lists_test_escaped_callout_should_not_be_interpreted_as_a_callout.adoc
        // Expected Go AST:
        // var listsTestEscapedCalloutShouldNotBeInterpretedAsACallout =
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
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      1,
        // 					ImpliedName: "",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "text",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   5,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"require 'asciidoctor' # \\<1>",
        // 				"Asciidoctor.convert 'convert me!' \\<2>",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should autonumber ___ callouts`() {
        // Input: asciidoctor/lists_test_should_autonumber___callouts.adoc
        // Expected Go AST:
        // var listsTestShouldAutonumberCallouts =
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
        // 				"require 'asciidoctor' # <.>",
        // 				"doc = Asciidoctor::Document.new('Hello, World!') # <.>",
        // 				"puts doc.convert # <.>",
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: "<.> Describe the first line",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "<.> Describe the second line",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "<.> Describe the third line",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not recognize callouts in middle of line`() {
        // Input: asciidoctor/lists_test_should_not_recognize_callouts_in_middle_of_line.adoc
        // Expected Go AST:
        // var listsTestShouldNotRecognizeCalloutsInMiddleOfLine =
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
        // 				"puts \"The syntax <1> at the end of the line makes a code callout\"",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should allow multiple callouts on the same line`() {
        // Input: asciidoctor/lists_test_should_allow_multiple_callouts_on_the_same_line.adoc
        // Expected Go AST:
        // var listsTestShouldAllowMultipleCalloutsOnTheSameLine =
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
        // 				"require 'asciidoctor' <1>",
        // 				"doc = Asciidoctor.load('Hello, World!') # <2> <3> <4>",
        // 				"puts doc.convert <5><6>",
        // 				"exit 0",
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: "<1> Require library",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "<2> Load document from String",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "<3> Uses default backend and doctype",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "<4> One more for good luck",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "<5> Renders document to String",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "<6> Prints output to stdout",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should allow XML comment-style callouts`() {
        // Input: asciidoctor/lists_test_should_allow_xml_comment_style_callouts.adoc
        // Expected Go AST:
        // var listsTestShouldAllowXmlCommentStyleCallouts =
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
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      1,
        // 					ImpliedName: "",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "xml",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   5,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"<section>",
        // 				"  <title>Section Title</title> <!--1-->",
        // 				"  <simpara>Just a paragraph</simpara> <!--2-->",
        // 				"</section>",
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: "<1> The title is required",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "<2> The content isn't",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not allow callouts with half an XML comment`() {
        // Input: asciidoctor/lists_test_should_not_allow_callouts_with_half_an_xml_comment.adoc
        // Expected Go AST:
        // var listsTestShouldNotAllowCalloutsWithHalfAnXmlComment =
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
        // 				"First line <1-->",
        // 				"Second line <2-->",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not recognize callouts in an indented description list paragraph`() {
        // Input: asciidoctor/lists_test_should_not_recognize_callouts_in_an_indented_description_list_paragraph.adoc
        // Expected Go AST:
        // var listsTestShouldNotRecognizeCalloutsInAnIndentedDescriptionListParagraph =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.DescriptionListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "  bar <1>",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Marker:        "::",
        // 			Term: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "foo",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
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
    fun `should not recognize callouts in an indented outline list paragraph`() {
        // Input: asciidoctor/lists_test_should_not_recognize_callouts_in_an_indented_outline_list_paragraph.adoc
        // Expected Go AST:
        // var listsTestShouldNotRecognizeCalloutsInAnIndentedOutlineListParagraph =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "foo",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "  bar <1>",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
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
    fun `should warn if numbers in callout list are out of sequence`() {
        // Input: asciidoctor/lists_test_should_warn_if_numbers_in_callout_list_are_out_of_sequence.adoc
        // Expected Go AST:
        // var listsTestShouldWarnIfNumbersInCalloutListAreOutOfSequence =
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
        // 				"<beans> <1>",
        // 				"  <bean class=\"com.example.HelloWorld\"/>",
        // 				"</beans>",
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: "<1> Container of beans.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "Beans are fun.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "<3> An actual bean.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should preserve line comment chars that precede callout number if icons is not set`() {
        // Input: asciidoctor/lists_test_should_preserve_line_comment_chars_that_precede_callout_number_if_icons_is_not_set.adoc
        // Expected Go AST:
        // var listsTestShouldPreserveLineCommentCharsThatPrecedeCalloutNumberIfIconsIsNotSet =
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
        // 				"puts 'Hello, world!' # <1>",
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: "<1> Ruby",
        // 		},
        // 		&asciidoc.NewLine{},
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
        // 							Value: "groovy",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   5,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"println 'Hello, world!' // <1>",
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: "<1> Groovy",
        // 		},
        // 		&asciidoc.NewLine{},
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
        // 							Value: "clojure",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   5,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"(def hello (fn [] \"Hello, world!\")) ;; <1>",
        // 				"(hello)",
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: "<1> Clojure",
        // 		},
        // 		&asciidoc.NewLine{},
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
        // 							Value: "haskell",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   5,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"main = putStrLn \"Hello, World!\" -- <1>",
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: "<1> Haskell",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should remove line comment chars that precede callout number if icons is font`() {
        // Input: asciidoctor/lists_test_should_remove_line_comment_chars_that_precede_callout_number_if_icons_is_font.adoc
        // Expected Go AST:
        // var listsTestShouldRemoveLineCommentCharsThatPrecedeCalloutNumberIfIconsIsFont =
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
        // 				"puts 'Hello, world!' # <1>",
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: "<1> Ruby",
        // 		},
        // 		&asciidoc.NewLine{},
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
        // 							Value: "groovy",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   5,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"println 'Hello, world!' // <1>",
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: "<1> Groovy",
        // 		},
        // 		&asciidoc.NewLine{},
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
        // 							Value: "clojure",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   5,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"(def hello (fn [] \"Hello, world!\")) ;; <1>",
        // 				"(hello)",
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: "<1> Clojure",
        // 		},
        // 		&asciidoc.NewLine{},
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
        // 							Value: "haskell",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   5,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"main = putStrLn \"Hello, World!\" -- <1>",
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: "<1> Haskell",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should allow line comment chars that precede callout number to be specified`() {
        // Input: asciidoctor/lists_test_should_allow_line_comment_chars_that_precede_callout_number_to_be_specified.adoc
        // Expected Go AST:
        // var listsTestShouldAllowLineCommentCharsThatPrecedeCalloutNumberToBeSpecified =
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
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      1,
        // 					ImpliedName: "",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "erlang",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.NamedAttribute{
        // 					Name: "line-comment",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "%",
        // 						},
        // 					},
        // 					Quote: 0,
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   5,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"hello_world() -> % <1>",
        // 				"  io:fwrite(\"hello, world~n\"). %<2>",
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: "<1> Erlang function clause head.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "<2> ~n adds a new line to the output.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should allow line comment chars preceding callout number to be configurable when source-highlighter is coderay`() {
        // Input: asciidoctor/lists_test_should_allow_line_comment_chars_preceding_callout_number_to_be_configurable_when_source_highlighter_is_coderay.adoc
        // Expected Go AST:
        // var listsTestShouldAllowLineCommentCharsPrecedingCalloutNumberToBeConfigurableWhenSourceHighlighterIsCoderay =
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
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      1,
        // 					ImpliedName: "",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "html",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.NamedAttribute{
        // 					Name: "line-comment",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "-#",
        // 						},
        // 					},
        // 					Quote: 0,
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   5,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"-# <1>",
        // 				"%p Hello",
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: "<1> Prints a paragraph with the text \"Hello\"",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not eat whitespace before callout number if line-comment attribute is empty`() {
        // Input: asciidoctor/lists_test_should_not_eat_whitespace_before_callout_number_if_line_comment_attribute_is_empty.adoc
        // Expected Go AST:
        // var listsTestShouldNotEatWhitespaceBeforeCalloutNumberIfLineCommentAttributeIsEmpty =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "[source,asciidoc,line-comment=]",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.Listing{
        // 			AttributeList: nil,
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   5,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"-- <1>",
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: "<1> The start of an open block.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `literal block with callouts`() {
        // Input: asciidoctor/lists_test_literal_block_with_callouts.adoc
        // Expected Go AST:
        // var listsTestLiteralBlockWithCallouts =
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
        // 				"Roses are red <1>",
        // 				"Violets are blue <2>",
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "<1> And so is Ruby",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "<2> But violet is more like purple",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `callout list with icons enabled`() {
        // Input: asciidoctor/lists_test_callout_list_with_icons_enabled.adoc
        // Expected Go AST:
        // var listsTestCalloutListWithIconsEnabled =
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
        // 				"require 'asciidoctor' # <1>",
        // 				"doc = Asciidoctor::Document.new('Hello, World!') # <2>",
        // 				"puts doc.convert # <3>",
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: "<1> Describe the first line",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "<2> Describe the second line",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "<3> Describe the third line",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `callout list with font-based icons enabled`() {
        // Input: asciidoctor/lists_test_callout_list_with_font_based_icons_enabled.adoc
        // Expected Go AST:
        // var listsTestCalloutListWithFontBasedIconsEnabled =
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
        // 				"require 'asciidoctor' # <1>",
        // 				"doc = Asciidoctor::Document.new('Hello, World!') #<2>",
        // 				"puts doc.convert #<3>",
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: "<1> Describe the first line",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "<2> Describe the second line",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "<3> Describe the third line",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should create checklist if at least one item has checkbox syntax`() {
        // Input: asciidoctor/lists_test_should_create_checklist_if_at_least_one_item_has_checkbox_syntax.adoc
        // Expected Go AST:
        // var listsTestShouldCreateChecklistIfAtLeastOneItemHasCheckboxSyntax =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "todo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     1,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "done",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     2,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "another todo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     1,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "another done",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     2,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "plain",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should create checklist with font icons if at least one item has checkbox syntax and icons attribute is font`() {
        // Input: asciidoctor/lists_test_should_create_checklist_with_font_icons_if_at_least_one_item_has_checkbox_syntax_and_icons_attribute_is_font.adoc
        // Expected Go AST:
        // var listsTestShouldCreateChecklistWithFontIconsIfAtLeastOneItemHasCheckboxSyntaxAndIconsAttributeIsFont =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "todo",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     1,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "done",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     2,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "plain",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should create interactive checklist if interactive option is set even with icons attribute is font`() {
        // Input: asciidoctor/lists_test_should_create_interactive_checklist_if_interactive_option_is_set_even_with_icons_attribute_is_font.adoc
        // Expected Go AST:
        // var listsTestShouldCreateInteractiveChecklistIfInteractiveOptionIsSetEvenWithIconsAttributeIsFont =
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
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "todo",
        // 				},
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
        // 									Value: "interactive",
        // 								},
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Indent:    "",
        // 			Marker:    "-",
        // 			Checklist: 1,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "done",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "-",
        // 			Checklist:     2,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `content should return items in list`() {
        // Input: asciidoctor/lists_test_content_should_return_items_in_list.adoc
        // Expected Go AST:
        // var listsTestContentShouldReturnItemsInList =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "one",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "two",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "three",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `list item should be the parent of block attached to a list item`() {
        // Input: asciidoctor/lists_test_list_item_should_be_the_parent_of_block_attached_to_a_list_item.adoc
        // Expected Go AST:
        // var listsTestListItemShouldBeTheParentOfBlockAttachedToAListItem =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "list item 1",
        // 				},
        // 				&asciidoc.ListContinuation{
        // 					ChildElement: &asciidoc.Listing{
        // 						AttributeList: nil,
        // 						Delimiter: asciidoc.Delimiter{
        // 							Type:   5,
        // 							Length: 4,
        // 						},
        // 						LineList: asciidoc.LineList{
        // 							"listing block in list item 1",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `outline? should return true for unordered list`() {
        // Input: asciidoctor/lists_test_outline_should_return_true_for_unordered_list.adoc
        // Expected Go AST:
        // var listsTestOutlineShouldReturnTrueForUnorderedList =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "one",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "two",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "three",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `outline? should return true for ordered list`() {
        // Input: asciidoctor/lists_test_outline_should_return_true_for_ordered_list.adoc
        // Expected Go AST:
        // var listsTestOutlineShouldReturnTrueForOrderedList =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "one",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        ".",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "two",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        ".",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "three",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        ".",
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `outline? should return false for description list`() {
        // Input: asciidoctor/lists_test_outline_should_return_false_for_description_list.adoc
        // Expected Go AST:
        // var listsTestOutlineShouldReturnFalseForDescriptionList =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "one",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "two",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "three",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `simple? should return true for list item with nested outline list`() {
        // Input: asciidoctor/lists_test_simple_should_return_true_for_list_item_with_nested_outline_list.adoc
        // Expected Go AST:
        // var listsTestSimpleShouldReturnTrueForListItemWithNestedOutlineList =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "one",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "more about one",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "  ",
        // 			Marker:        "**",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "and more",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "  ",
        // 			Marker:        "**",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "two",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "three",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `simple? should return false for list item with block content`() {
        // Input: asciidoctor/lists_test_simple_should_return_false_for_list_item_with_block_content.adoc
        // Expected Go AST:
        // var listsTestSimpleShouldReturnFalseForListItemWithBlockContent =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "one",
        // 				},
        // 				&asciidoc.ListContinuation{
        // 					ChildElement: &asciidoc.Listing{
        // 						AttributeList: nil,
        // 						Delimiter: asciidoc.Delimiter{
        // 							Type:   5,
        // 							Length: 4,
        // 						},
        // 						LineList: asciidoc.LineList{
        // 							"listing block in list item 1",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "two",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "three",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should allow text of ListItem to be assigned`() {
        // Input: asciidoctor/lists_test_should_allow_text_of_list_item_to_be_assigned.adoc
        // Expected Go AST:
        // var listsTestShouldAllowTextOfListItemToBeAssigned =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "one",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "two",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "three",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `id and role assigned to ulist item in model are transmitted to output`() {
        // Input: asciidoctor/lists_test_id_and_role_assigned_to_ulist_item_in_model_are_transmitted_to_output.adoc
        // Expected Go AST:
        // var listsTestIdAndRoleAssignedToUlistItemInModelAreTransmittedToOutput =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "one",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "two",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "three",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `id and role assigned to olist item in model are transmitted to output`() {
        // Input: asciidoctor/lists_test_id_and_role_assigned_to_olist_item_in_model_are_transmitted_to_output.adoc
        // Expected Go AST:
        // var listsTestIdAndRoleAssignedToOlistItemInModelAreTransmittedToOutput =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "one",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        ".",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "two",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        ".",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "three",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        ".",
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should allow API control over substitutions applied to ListItem text`() {
        // Input: asciidoctor/lists_test_should_allow_api_control_over_substitutions_applied_to_list_item_text.adoc
        // Expected Go AST:
        // var listsTestShouldAllowApiControlOverSubstitutionsAppliedToListItemText =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.Bold{
        // 					AttributeList: nil,
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "one",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.Italic{
        // 					AttributeList: nil,
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "two",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.Monospace{
        // 					AttributeList: nil,
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "three",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.Marked{
        // 					AttributeList: nil,
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "four",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should set lineno to line number in source where list starts`() {
        // Input: asciidoctor/lists_test_should_set_lineno_to_line_number_in_source_where_list_starts.adoc
        // Expected Go AST:
        // var listsTestShouldSetLinenoToLineNumberInSourceWhereListStarts =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "bullet 1",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "bullet 1.1",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "**",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "bullet 1.1.1",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "***",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "bullet 2",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 	},
        // }
    }

}
