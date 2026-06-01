package com.kmplibs.asciidoc.integration

import com.kmplibs.asciidoc.*
import kotlin.test.Test
import kotlin.test.Ignore

class ParagraphsTest {

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should treat plain text separated by blank lines as paragraphs`() {
        // Input: asciidoctor/paragraphs_test_should_treat_plain_text_separated_by_blank_lines_as_paragraphs.adoc
        // Expected Go AST:
        // var paragraphsTestShouldTreatPlainTextSeparatedByBlankLinesAsParagraphs =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Plain text for the win!",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Yep. Text. Plain and simple.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should associate block title with paragraph`() {
        // Input: asciidoctor/paragraphs_test_should_associate_block_title_with_paragraph.adoc
        // Expected Go AST:
        // var paragraphsTestShouldAssociateBlockTitleWithParagraph =
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
        // 							Value: "Titled",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Paragraph.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 0,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Winning.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `no duplicate block before next section`() {
        // Input: asciidoctor/paragraphs_test_no_duplicate_block_before_next_section.adoc
        // Expected Go AST:
        // var paragraphsTestNoDuplicateBlockBeforeNextSection =
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
        // 					Value: "Preamble",
        // 				},
        // 				&asciidoc.NewLine{},
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
        // 							Value: "Paragraph 1",
        // 						},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.EmptyLine{
        // 							Text: "",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "Paragraph 2",
        // 						},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.EmptyLine{
        // 							Text: "",
        // 						},
        // 					},
        // 					Title: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "First Section",
        // 						},
        // 					},
        // 					Level: 1,
        // 				},
        // 				&asciidoc.Section{
        // 					AttributeList: nil,
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.EmptyLine{
        // 							Text: "",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "Last words",
        // 						},
        // 						&asciidoc.NewLine{},
        // 					},
        // 					Title: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Second Section",
        // 						},
        // 					},
        // 					Level: 1,
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Title",
        // 				},
        // 			},
        // 			Level: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `does not treat wrapped line as a list item`() {
        // Input: asciidoctor/paragraphs_test_does_not_treat_wrapped_line_as_a_list_item.adoc
        // Expected Go AST:
        // var paragraphsTestDoesNotTreatWrappedLineAsAListItem =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "paragraph",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "wrapped line",
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
    fun `does not treat wrapped line as a block title`() {
        // Input: asciidoctor/paragraphs_test_does_not_treat_wrapped_line_as_a_block_title.adoc
        // Expected Go AST:
        // var paragraphsTestDoesNotTreatWrappedLineAsABlockTitle =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "paragraph",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "wrapped line",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements:   asciidoc.Elements{},
        // 			Admonition: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `interprets normal paragraph style as normal paragraph`() {
        // Input: asciidoctor/paragraphs_test_interprets_normal_paragraph_style_as_normal_paragraph.adoc
        // Expected Go AST:
        // var paragraphsTestInterpretsNormalParagraphStyleAsNormalParagraph =
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
        // 								Value: "normal",
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
        // 					Value: "Normal paragraph.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "Nothing special.",
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
    fun `removes indentation from literal paragraph marked as normal`() {
        // Input: asciidoctor/paragraphs_test_removes_indentation_from_literal_paragraph_marked_as_normal.adoc
        // Expected Go AST:
        // var paragraphsTestRemovesIndentationFromLiteralParagraphMarkedAsNormal =
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
        // 								Value: "normal",
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
        // 					Value: "  Normal paragraph.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "    Nothing special.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "  Last line.",
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
    fun `normal paragraph terminates at block attribute list`() {
        // Input: asciidoctor/paragraphs_test_normal_paragraph_terminates_at_block_attribute_list.adoc
        // Expected Go AST:
        // var paragraphsTestNormalParagraphTerminatesAtBlockAttributeList =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "normal text",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "literal",
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
        // 					Value: "literal text",
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
    fun `normal paragraph terminates at block delimiter`() {
        // Input: asciidoctor/paragraphs_test_normal_paragraph_terminates_at_block_delimiter.adoc
        // Expected Go AST:
        // var paragraphsTestNormalParagraphTerminatesAtBlockDelimiter =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "normal text",
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
        // 					Value: "text in open block",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `normal paragraph terminates at list continuation`() {
        // Input: asciidoctor/paragraphs_test_normal_paragraph_terminates_at_list_continuation.adoc
        // Expected Go AST:
        // var paragraphsTestNormalParagraphTerminatesAtListContinuation =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "normal text",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.LineBreak{},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `normal style turns literal paragraph into normal paragraph`() {
        // Input: asciidoctor/paragraphs_test_normal_style_turns_literal_paragraph_into_normal_paragraph.adoc
        // Expected Go AST:
        // var paragraphsTestNormalStyleTurnsLiteralParagraphIntoNormalParagraph =
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
        // 								Value: "normal",
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
        // 					Value: " normal paragraph,",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: " despite the leading indent",
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
    fun `automatically promotes index terms in DocBook output if indexterm-promotion-option is set`() {
        // Input: asciidoctor/paragraphs_test_automatically_promotes_index_terms_in_doc_book_output_if_indexterm_promotion_option_is_set.adoc
        // Expected Go AST:
        // var paragraphsTestAutomaticallyPromotesIndexTermsInDocBookOutputIfIndextermPromotionOptionIsSet =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Here is an index entry for ((tigers)).",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "indexterm:[Big cats,Tigers,Siberian Tiger]",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "Here is an index entry for indexterm2:[Linux].",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "(((Operating Systems,Linux)))",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "Note that multi-entry terms generate separate index entries.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `does not automatically promote index terms in DocBook output if indexterm-promotion-option is not set`() {
        // Input: asciidoctor/paragraphs_test_does_not_automatically_promote_index_terms_in_doc_book_output_if_indexterm_promotion_option_is_not_set.adoc
        // Expected Go AST:
        // var paragraphsTestDoesNotAutomaticallyPromoteIndexTermsInDocBookOutputIfIndextermPromotionOptionIsNotSet =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "The Siberian Tiger is one of the biggest living cats.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "indexterm:[Big cats,Tigers,Siberian Tiger]",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "Note that multi-entry terms generate separate index entries.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "(((Operating Systems,Linux)))",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `normal paragraph should honor explicit subs list`() {
        // Input: asciidoctor/paragraphs_test_normal_paragraph_should_honor_explicit_subs_list.adoc
        // Expected Go AST:
        // var paragraphsTestNormalParagraphShouldHonorExplicitSubsList =
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
        // 							Value: "specialcharacters",
        // 						},
        // 					},
        // 					Quote: 2,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.Bold{
        // 					AttributeList: nil,
        // 					Elements: asciidoc.Elements{
        // 						asciidoc.SpecialCharacter{
        // 							Character: "<",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "Hey Jude",
        // 						},
        // 						asciidoc.SpecialCharacter{
        // 							Character: ">",
        // 						},
        // 					},
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
    fun `normal paragraph should honor specialchars shorthand`() {
        // Input: asciidoctor/paragraphs_test_normal_paragraph_should_honor_specialchars_shorthand.adoc
        // Expected Go AST:
        // var paragraphsTestNormalParagraphShouldHonorSpecialcharsShorthand =
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
        // 							Value: "specialchars",
        // 						},
        // 					},
        // 					Quote: 2,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.Bold{
        // 					AttributeList: nil,
        // 					Elements: asciidoc.Elements{
        // 						asciidoc.SpecialCharacter{
        // 							Character: "<",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "Hey Jude",
        // 						},
        // 						asciidoc.SpecialCharacter{
        // 							Character: ">",
        // 						},
        // 					},
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
    fun `should add a hardbreak at end of each line when hardbreaks option is set`() {
        // Input: asciidoctor/paragraphs_test_should_add_a_hardbreak_at_end_of_each_line_when_hardbreaks_option_is_set.adoc
        // Expected Go AST:
        // var paragraphsTestShouldAddAHardbreakAtEndOfEachLineWhenHardbreaksOptionIsSet =
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
        // 					Roles: nil,
        // 					Options: []*asciidoc.ShorthandOption{
        // 						&asciidoc.ShorthandOption{
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "hardbreaks",
        // 								},
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "read",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "my",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "lips",
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
    fun `should be able to toggle hardbreaks by setting hardbreaks-option on document`() {
        // Input: asciidoctor/paragraphs_test_should_be_able_to_toggle_hardbreaks_by_setting_hardbreaks_option_on_document.adoc
        // Expected Go AST:
        // var paragraphsTestShouldBeAbleToToggleHardbreaksBySettingHardbreaksOptionOnDocument =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name:     "hardbreaks-option",
        // 			Elements: nil,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "make",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "it",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "so",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeReset{
        // 			Name: "hardbreaks",
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "roll it back",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `single-line literal paragraphs`() {
        // Input: asciidoctor/paragraphs_test_single_line_literal_paragraphs.adoc
        // Expected Go AST:
        // var paragraphsTestSingleLineLiteralParagraphs =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "you know what?",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: " LITERALS",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: " ARE LITERALLY",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: " AWESOME!",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `multi-line literal paragraph`() {
        // Input: asciidoctor/paragraphs_test_multi_line_literal_paragraph.adoc
        // Expected Go AST:
        // var paragraphsTestMultiLineLiteralParagraph =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Install instructions:",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: " yum install ruby rubygems",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: " gem install asciidoctor",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "You're good to go!",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `literal paragraph`() {
        // Input: asciidoctor/paragraphs_test_literal_paragraph.adoc
        // Expected Go AST:
        // var paragraphsTestLiteralParagraph =
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
        // 								Value: "literal",
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
        // 					Value: "this text is literally literal",
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
    fun `should read content below literal style verbatim`() {
        // Input: asciidoctor/paragraphs_test_should_read_content_below_literal_style_verbatim.adoc
        // Expected Go AST:
        // var paragraphsTestShouldReadContentBelowLiteralStyleVerbatim =
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
        // 							Value: "literal",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ImagePath: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "not-an-image-block",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `listing paragraph`() {
        // Input: asciidoctor/paragraphs_test_listing_paragraph.adoc
        // Expected Go AST:
        // var paragraphsTestListingParagraph =
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
        // 								Value: "listing",
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
        // 					Value: "this text is a listing",
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
    fun `source paragraph`() {
        // Input: asciidoctor/paragraphs_test_source_paragraph.adoc
        // Expected Go AST:
        // var paragraphsTestSourceParagraph =
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
        // 								Value: "source",
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
        // 					Value: "use the source, luke!",
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
    fun `source code paragraph with language`() {
        // Input: asciidoctor/paragraphs_test_source_code_paragraph_with_language.adoc
        // Expected Go AST:
        // var paragraphsTestSourceCodeParagraphWithLanguage =
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
        // 							Value: "perl",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "die 'zomg perl is tough';",
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
    fun `literal paragraph terminates at block attribute list`() {
        // Input: asciidoctor/paragraphs_test_literal_paragraph_terminates_at_block_attribute_list.adoc
        // Expected Go AST:
        // var paragraphsTestLiteralParagraphTerminatesAtBlockAttributeList =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: " literal text",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "normal",
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
        // 					Value: "normal text",
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
    fun `literal paragraph terminates at block delimiter`() {
        // Input: asciidoctor/paragraphs_test_literal_paragraph_terminates_at_block_delimiter.adoc
        // Expected Go AST:
        // var paragraphsTestLiteralParagraphTerminatesAtBlockDelimiter =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: " literal text",
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
        // 					Value: "normal text",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `literal paragraph terminates at list continuation`() {
        // Input: asciidoctor/paragraphs_test_literal_paragraph_terminates_at_list_continuation.adoc
        // Expected Go AST:
        // var paragraphsTestLiteralParagraphTerminatesAtListContinuation =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: " literal text",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.LineBreak{},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `single-line quote paragraph`() {
        // Input: asciidoctor/paragraphs_test_single_line_quote_paragraph.adoc
        // Expected Go AST:
        // var paragraphsTestSingleLineQuoteParagraph =
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
        // 					Value: "Famous quote.",
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
    fun `quote paragraph terminates at list continuation`() {
        // Input: asciidoctor/paragraphs_test_quote_paragraph_terminates_at_list_continuation.adoc
        // Expected Go AST:
        // var paragraphsTestQuoteParagraphTerminatesAtListContinuation =
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
        // 					Value: "A famouse quote.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.LineBreak{},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `verse paragraph`() {
        // Input: asciidoctor/paragraphs_test_verse_paragraph.adoc
        // Expected Go AST:
        // var paragraphsTestVerseParagraph =
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
        // 			Admonition: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `quote paragraph should honor explicit subs list`() {
        // Input: asciidoctor/paragraphs_test_quote_paragraph_should_honor_explicit_subs_list.adoc
        // Expected Go AST:
        // var paragraphsTestQuoteParagraphShouldHonorExplicitSubsList =
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
        // 							Value: "specialcharacters",
        // 						},
        // 					},
        // 					Quote: 2,
        // 				},
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
        // 				&asciidoc.Bold{
        // 					AttributeList: nil,
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Hey Jude",
        // 						},
        // 					},
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
    fun `note multiline syntax`() {
        // Input: asciidoctor/paragraphs_test_note_multiline_syntax.adoc
        // Expected Go AST:
        // var paragraphsTestNoteMultilineSyntax =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.IfDef{
        // 			Attributes: asciidoc.AttributeNames{
        // 				"asciidoctor-version",
        // 			},
        // 			Union:  0,
        // 			Inline: false,
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "sidebar",
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
        // 					Value: "First line of sidebar.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "ifdef::backend[The backend is ",
        // 				},
        // 				&asciidoc.UserAttributeReference{
        // 					Value: "backend",
        // 				},
        // 				&asciidoc.String{
        // 					Value: ".]",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "Last line of sidebar.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 0,
        // 		},
        // 		&asciidoc.EndIf{
        // 			Attributes: nil,
        // 			Union:      0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should wrap text in simpara for styled paragraphs when converted to DocBook`() {
        // Input: asciidoctor/paragraphs_test_should_wrap_text_in_simpara_for_styled_paragraphs_when_converted_to_doc_book.adoc
        // Expected Go AST:
        // var paragraphsTestShouldWrapTextInSimparaForStyledParagraphsWhenConvertedToDocBook =
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
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "preface",
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
        // 							Value: "An abstract for the book.",
        // 						},
        // 						&asciidoc.NewLine{},
        // 					},
        // 					Admonition: 0,
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "About this book",
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
        // 							Value: "An intro to this part.",
        // 						},
        // 						&asciidoc.NewLine{},
        // 					},
        // 					Admonition: 0,
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
        // 						&asciidoc.Paragraph{
        // 							AttributeList: asciidoc.AttributeList{
        // 								&asciidoc.ShorthandAttribute{
        // 									Style: &asciidoc.ShorthandStyle{
        // 										Elements: asciidoc.Elements{
        // 											&asciidoc.String{
        // 												Value: "sidebar",
        // 											},
        // 										},
        // 									},
        // 									ID:      nil,
        // 									Roles:   nil,
        // 									Options: nil,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Just a side note.",
        // 								},
        // 								&asciidoc.NewLine{},
        // 							},
        // 							Admonition: 0,
        // 						},
        // 						&asciidoc.EmptyLine{
        // 							Text: "",
        // 						},
        // 						&asciidoc.Paragraph{
        // 							AttributeList: asciidoc.AttributeList{
        // 								&asciidoc.ShorthandAttribute{
        // 									Style: &asciidoc.ShorthandStyle{
        // 										Elements: asciidoc.Elements{
        // 											&asciidoc.String{
        // 												Value: "example",
        // 											},
        // 										},
        // 									},
        // 									ID:      nil,
        // 									Roles:   nil,
        // 									Options: nil,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "As you can see here.",
        // 								},
        // 								&asciidoc.NewLine{},
        // 							},
        // 							Admonition: 0,
        // 						},
        // 						&asciidoc.EmptyLine{
        // 							Text: "",
        // 						},
        // 						&asciidoc.Paragraph{
        // 							AttributeList: asciidoc.AttributeList{
        // 								&asciidoc.ShorthandAttribute{
        // 									Style: &asciidoc.ShorthandStyle{
        // 										Elements: asciidoc.Elements{
        // 											&asciidoc.String{
        // 												Value: "quote",
        // 											},
        // 										},
        // 									},
        // 									ID:      nil,
        // 									Roles:   nil,
        // 									Options: nil,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Wise words from a wise person.",
        // 								},
        // 								&asciidoc.NewLine{},
        // 							},
        // 							Admonition: 0,
        // 						},
        // 						&asciidoc.EmptyLine{
        // 							Text: "",
        // 						},
        // 						&asciidoc.Paragraph{
        // 							AttributeList: asciidoc.AttributeList{
        // 								&asciidoc.ShorthandAttribute{
        // 									Style: &asciidoc.ShorthandStyle{
        // 										Elements: asciidoc.Elements{
        // 											&asciidoc.String{
        // 												Value: "open",
        // 											},
        // 										},
        // 									},
        // 									ID:      nil,
        // 									Roles:   nil,
        // 									Options: nil,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Make it what you want.",
        // 								},
        // 								&asciidoc.NewLine{},
        // 							},
        // 							Admonition: 0,
        // 						},
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
    fun `should convert open paragraph to open block`() {
        // Input: asciidoctor/paragraphs_test_should_convert_open_paragraph_to_open_block.adoc
        // Expected Go AST:
        // var paragraphsTestShouldConvertOpenParagraphToOpenBlock =
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
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Make it what you want.",
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
    fun `should wrap text in simpara for styled paragraphs with title when converted to DocBook`() {
        // Input: asciidoctor/paragraphs_test_should_wrap_text_in_simpara_for_styled_paragraphs_with_title_when_converted_to_doc_book.adoc
        // Expected Go AST:
        // var paragraphsTestShouldWrapTextInSimparaForStyledParagraphsWithTitleWhenConvertedToDocBook =
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
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "preface",
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
        // 						&asciidoc.TitleAttribute{
        // 							Val: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Abstract title",
        // 								},
        // 							},
        // 						},
        // 					},
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "An abstract for the book.",
        // 						},
        // 						&asciidoc.NewLine{},
        // 					},
        // 					Admonition: 0,
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "About this book",
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
        // 						&asciidoc.TitleAttribute{
        // 							Val: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Part intro title",
        // 								},
        // 							},
        // 						},
        // 					},
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "An intro to this part.",
        // 						},
        // 						&asciidoc.NewLine{},
        // 					},
        // 					Admonition: 0,
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
        // 						&asciidoc.Paragraph{
        // 							AttributeList: asciidoc.AttributeList{
        // 								&asciidoc.ShorthandAttribute{
        // 									Style: &asciidoc.ShorthandStyle{
        // 										Elements: asciidoc.Elements{
        // 											&asciidoc.String{
        // 												Value: "sidebar",
        // 											},
        // 										},
        // 									},
        // 									ID:      nil,
        // 									Roles:   nil,
        // 									Options: nil,
        // 								},
        // 								&asciidoc.TitleAttribute{
        // 									Val: asciidoc.Elements{
        // 										&asciidoc.String{
        // 											Value: "Sidebar title",
        // 										},
        // 									},
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Just a side note.",
        // 								},
        // 								&asciidoc.NewLine{},
        // 							},
        // 							Admonition: 0,
        // 						},
        // 						&asciidoc.EmptyLine{
        // 							Text: "",
        // 						},
        // 						&asciidoc.Paragraph{
        // 							AttributeList: asciidoc.AttributeList{
        // 								&asciidoc.ShorthandAttribute{
        // 									Style: &asciidoc.ShorthandStyle{
        // 										Elements: asciidoc.Elements{
        // 											&asciidoc.String{
        // 												Value: "example",
        // 											},
        // 										},
        // 									},
        // 									ID:      nil,
        // 									Roles:   nil,
        // 									Options: nil,
        // 								},
        // 								&asciidoc.TitleAttribute{
        // 									Val: asciidoc.Elements{
        // 										&asciidoc.String{
        // 											Value: "Example title",
        // 										},
        // 									},
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "As you can see here.",
        // 								},
        // 								&asciidoc.NewLine{},
        // 							},
        // 							Admonition: 0,
        // 						},
        // 						&asciidoc.EmptyLine{
        // 							Text: "",
        // 						},
        // 						&asciidoc.Paragraph{
        // 							AttributeList: asciidoc.AttributeList{
        // 								&asciidoc.ShorthandAttribute{
        // 									Style: &asciidoc.ShorthandStyle{
        // 										Elements: asciidoc.Elements{
        // 											&asciidoc.String{
        // 												Value: "quote",
        // 											},
        // 										},
        // 									},
        // 									ID:      nil,
        // 									Roles:   nil,
        // 									Options: nil,
        // 								},
        // 								&asciidoc.TitleAttribute{
        // 									Val: asciidoc.Elements{
        // 										&asciidoc.String{
        // 											Value: "Quote title",
        // 										},
        // 									},
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Wise words from a wise person.",
        // 								},
        // 								&asciidoc.NewLine{},
        // 							},
        // 							Admonition: 0,
        // 						},
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
    fun `should output nil and warn if first block is not a paragraph`() {
        // Input: asciidoctor/paragraphs_test_should_output_nil_and_warn_if_first_block_is_not_a_paragraph.adoc
        // Expected Go AST:
        // var paragraphsTestShouldOutputNilAndWarnIfFirstBlockIsNotAParagraph =
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
        // 								Value: "foo",
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
        // 					Value: "bar",
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
    fun `should log debug message if paragraph style is unknown and debug level is enabled`() {
        // Input: asciidoctor/paragraphs_test_should_log_debug_message_if_paragraph_style_is_unknown_and_debug_level_is_enabled.adoc
        // Expected Go AST:
        // var paragraphsTestShouldLogDebugMessageIfParagraphStyleIsUnknownAndDebugLevelIsEnabled =
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
        // 								Value: "foo",
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
        // 					Value: "bar",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 0,
        // 		},
        // 	},
        // }
    }

}
