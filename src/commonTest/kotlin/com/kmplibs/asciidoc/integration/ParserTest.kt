package com.kmplibs.asciidoc.integration

import com.kmplibs.asciidoc.*
import kotlin.test.Test
import kotlin.test.Ignore

class ParserTest {

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `parse name with more than 3 parts in author attribute`() {
        // Input: asciidoctor/parser_test_parse_name_with_more_than_3_parts_in_author_attribute.adoc
        // Expected Go AST:
        // var parserTestParseNameWithMoreThan3PartsInAuthorAttribute =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Jean-Claude Van Damme",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "authorinitials",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "JCVD",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `use explicit authorinitials if set after author attribute`() {
        // Input: asciidoctor/parser_test_use_explicit_authorinitials_if_set_after_author_attribute.adoc
        // Expected Go AST:
        // var parserTestUseExplicitAuthorinitialsIfSetAfterAuthorAttribute =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "author",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Jean-Claude Van Damme",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "authorinitials",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "JCVD",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `use implicit authors if value of authors attribute matches computed value`() {
        // Input: asciidoctor/parser_test_use_implicit_authors_if_value_of_authors_attribute_matches_computed_value.adoc
        // Expected Go AST:
        // var parserTestUseImplicitAuthorsIfValueOfAuthorsAttributeMatchesComputedValue =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Doc Writer; Junior Writer",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "authors",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Doc Writer, Junior Writer",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `replace implicit authors if value of authors attribute does not match computed value`() {
        // Input: asciidoctor/parser_test_replace_implicit_authors_if_value_of_authors_attribute_does_not_match_computed_value.adoc
        // Expected Go AST:
        // var parserTestReplaceImplicitAuthorsIfValueOfAuthorsAttributeDoesNotMatchComputedValue =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Doc Writer; Junior Writer",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "authors",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Stuart Rackham; Dan Allen; Sarah White",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `sets authorcount to 0 if document has no authors`() {
        // Input: asciidoctor/parser_test_sets_authorcount_to_0_if_document_has_no_authors.adoc
        // Expected Go AST:
        // var parserTestSetsAuthorcountTo0IfDocumentHasNoAuthors =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Kismet Chameleon; Johnny Bravo; Lazarus het_Draeke",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "author_2",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Danger Mouse",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `parse rev number date remark`() {
        // Input: asciidoctor/parser_test_parse_rev_number_date_remark.adoc
        // Expected Go AST:
        // var parserTestParseRevNumberDateRemark =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Ryan Waldron",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "v0.0.7, 2013-12-18: The first release you can stand on",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `parse rev number, data, and remark as attribute references`() {
        // Input: asciidoctor/parser_test_parse_rev_number_data_and_remark_as_attribute_references.adoc
        // Expected Go AST:
        // var parserTestParseRevNumberDataAndRemarkAsAttributeReferences =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Author Name",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "v",
        // 		},
        // 		&asciidoc.UserAttributeReference{
        // 			Value: "project-version",
        // 		},
        // 		&asciidoc.String{
        // 			Value: ", ",
        // 		},
        // 		&asciidoc.UserAttributeReference{
        // 			Value: "release-date",
        // 		},
        // 		&asciidoc.String{
        // 			Value: ": ",
        // 		},
        // 		&asciidoc.UserAttributeReference{
        // 			Value: "release-summary",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should resolve attribute references in rev number, data, and remark`() {
        // Input: asciidoctor/parser_test_should_resolve_attribute_references_in_rev_number_data_and_remark.adoc
        // Expected Go AST:
        // var parserTestShouldResolveAttributeReferencesInRevNumberDataAndRemark =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Section{
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Author Name",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.UserAttributeReference{
        // 					Value: "project-version",
        // 				},
        // 				&asciidoc.String{
        // 					Value: ", ",
        // 				},
        // 				&asciidoc.UserAttributeReference{
        // 					Value: "release-date",
        // 				},
        // 				&asciidoc.String{
        // 					Value: ": ",
        // 				},
        // 				&asciidoc.UserAttributeReference{
        // 					Value: "release-summary",
        // 				},
        // 				&asciidoc.NewLine{},
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
    fun `parse rev date`() {
        // Input: asciidoctor/parser_test_parse_rev_date.adoc
        // Expected Go AST:
        // var parserTestParseRevDate =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Ryan Waldron",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "2013-12-18",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `parse rev number with trailing comma`() {
        // Input: asciidoctor/parser_test_parse_rev_number_with_trailing_comma.adoc
        // Expected Go AST:
        // var parserTestParseRevNumberWithTrailingComma =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Stuart Rackham",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "v8.6.8,",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `parse rev number`() {
        // Input: asciidoctor/parser_test_parse_rev_number.adoc
        // Expected Go AST:
        // var parserTestParseRevNumber =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Stuart Rackham",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "v8.6.8",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `treats arbitrary text on rev line as revdate`() {
        // Input: asciidoctor/parser_test_treats_arbitrary_text_on_rev_line_as_revdate.adoc
        // Expected Go AST:
        // var parserTestTreatsArbitraryTextOnRevLineAsRevdate =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Ryan Waldron",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "foobar",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `parse rev date remark`() {
        // Input: asciidoctor/parser_test_parse_rev_date_remark.adoc
        // Expected Go AST:
        // var parserTestParseRevDateRemark =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Ryan Waldron",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "2013-12-18:  The first release you can stand on",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not mistake attribute entry as rev remark`() {
        // Input: asciidoctor/parser_test_should_not_mistake_attribute_entry_as_rev_remark.adoc
        // Expected Go AST:
        // var parserTestShouldNotMistakeAttributeEntryAsRevRemark =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Joe Cool",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "page-layout",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "post",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `parse rev remark only`() {
        // Input: asciidoctor/parser_test_parse_rev_remark_only.adoc
        // Expected Go AST:
        // var parserTestParseRevRemarkOnly =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Joe Cool",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: " :Must start revremark-only line with space",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `skip line comments before author`() {
        // Input: asciidoctor/parser_test_skip_line_comments_before_author.adoc
        // Expected Go AST:
        // var parserTestSkipLineCommentsBeforeAuthor =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.SingleLineComment{
        // 			Value: " Asciidoctor",
        // 		},
        // 		&asciidoc.SingleLineComment{
        // 			Value: " release artist",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Ryan Waldron",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `skip block comment before author`() {
        // Input: asciidoctor/parser_test_skip_block_comment_before_author.adoc
        // Expected Go AST:
        // var parserTestSkipBlockCommentBeforeAuthor =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.MultiLineComment{
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   2,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"Asciidoctor",
        // 				"release artist",
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Ryan Waldron",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `skip block comment before rev`() {
        // Input: asciidoctor/parser_test_skip_block_comment_before_rev.adoc
        // Expected Go AST:
        // var parserTestSkipBlockCommentBeforeRev =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Ryan Waldron",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.MultiLineComment{
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   2,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"Asciidoctor",
        // 				"release info",
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: "v0.0.7, 2013-12-18",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `break header at line with three forward slashes`() {
        // Input: asciidoctor/parser_test_break_header_at_line_with_three_forward_slashes.adoc
        // Expected Go AST:
        // var parserTestBreakHeaderAtLineWithThreeForwardSlashes =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Joe Cool",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "v1.0",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.SingleLineComment{
        // 			Value: "/",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "stuff",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `expands tabs to spaces`() {
        // Input: asciidoctor/parser_test_expands_tabs_to_spaces.adoc
        // Expected Go AST:
        // var parserTestExpandsTabsToSpaces =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Filesystem\t\t\t\tSize\tUsed\tAvail\tUse%\tMounted on",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "Filesystem              Size    Used    Avail   Use%    Mounted on",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "devtmpfs\t\t\t\t3.9G\t   0\t 3.9G\t  0%\t/dev",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "/dev/mapper/fedora-root\t 48G\t 18G\t  29G\t 39%\t/",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `adjust indentation handles empty lines gracefully`() {
        // Input: asciidoctor/parser_test_adjust_indentation_handles_empty_lines_gracefully.adoc
        // Expected Go AST:
        // var parserTestAdjustIndentationHandlesEmptyLinesGracefully =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: nil,
        // 					ID: &asciidoc.ShorthandID{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "in-use",
        // 							},
        // 						},
        // 					},
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "A paragraph with an id.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 0,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Another paragraph",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.Anchor{
        // 			ID: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "in-use",
        // 				},
        // 			},
        // 			Elements: nil,
        // 		},
        // 		&asciidoc.String{
        // 			Value: "that uses an id",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "which is already in use.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

}
