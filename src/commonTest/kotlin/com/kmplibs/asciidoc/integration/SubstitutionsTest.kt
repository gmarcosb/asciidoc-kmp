package com.kmplibs.asciidoc.integration

import com.kmplibs.asciidoc.*
import kotlin.test.Test
import kotlin.test.Ignore

class SubstitutionsTest {

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `an externalized footnote macro may contain text formatting`() {
        // Input: asciidoctor/substitutions_test_an_externalized_footnote_macro_may_contain_text_formatting.adoc
        // Expected Go AST:
        // var substitutionsTestAnExternalizedFootnoteMacroMayContainTextFormatting =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "fn-disclaimer",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "pass:q[footnote:[Only available with an _active_ subscription.]]",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "You can download patches from the production page.",
        // 		},
        // 		&asciidoc.UserAttributeReference{
        // 			Value: "fn-disclaimer",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `using a footnoteref macro should generate a warning when compat mode is not enabled`() {
        // Input: asciidoctor/substitutions_test_using_a_footnoteref_macro_should_generate_a_warning_when_compat_mode_is_not_enabled.adoc
        // Expected Go AST:
        // var substitutionsTestUsingAFootnoterefMacroShouldGenerateAWarningWhenCompatModeIsNotEnabled =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "You can download the software from the product page.footnote:sub[Option only available if you have an active subscription.]",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "You can also file a support request.footnote:sub[]",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "If all else fails, you can give us a call.footnoteref:[sub]",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should parse multiple footnote references in a single line`() {
        // Input: asciidoctor/substitutions_test_should_parse_multiple_footnote_references_in_a_single_line.adoc
        // Expected Go AST:
        // var substitutionsTestShouldParseMultipleFootnoteReferencesInASingleLine =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "fn-notable-text",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "footnote:id[about this text]",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "notable text.",
        // 		},
        // 		&asciidoc.UserAttributeReference{
        // 			Value: "fn-notable-text",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "more notable text.",
        // 		},
        // 		&asciidoc.UserAttributeReference{
        // 			Value: "fn-notable-text",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not resolve an inline footnote macro missing both id and text`() {
        // Input: asciidoctor/substitutions_test_should_not_resolve_an_inline_footnote_macro_missing_both_id_and_text.adoc
        // Expected Go AST:
        // var substitutionsTestShouldNotResolveAnInlineFootnoteMacroMissingBothIdAndText =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "The footnote:[] macro can be used for defining and referencing footnotes.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "The footnoteref:[] macro is now deprecated.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `inline footnote macro can define a numeric id without conflicting with auto-generated ID`() {
        // Input: asciidoctor/substitutions_test_inline_footnote_macro_can_define_a_numeric_id_without_conflicting_with_auto_generated_id.adoc
        // Expected Go AST:
        // var substitutionsTestInlineFootnoteMacroCanDefineANumericIdWithoutConflictingWithAutoGeneratedId =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "L'origine du mot forêt",
        // 		},
        // 		&asciidoc.CharacterReplacementReference{
        // 			Value: "blank",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "footnote:forêt[un massif forestier] est complexe.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Qu'est-ce qu'une forêt ?",
        // 		},
        // 		&asciidoc.CharacterReplacementReference{
        // 			Value: "blank",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "footnote:forêt[]",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should be able to reference a bibliography entry in a footnote`() {
        // Input: asciidoctor/substitutions_test_should_be_able_to_reference_a_bibliography_entry_in_a_footnote.adoc
        // Expected Go AST:
        // var substitutionsTestShouldBeAbleToReferenceABibliographyEntryInAFootnote =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Choose a design pattern.footnote:[See ",
        // 		},
        // 		&asciidoc.CrossReference{
        // 			AttributeList: nil,
        // 			Elements:      nil,
        // 			ID: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "gof",
        // 				},
        // 			},
        // 			Format: 0,
        // 		},
        // 		&asciidoc.String{
        // 			Value: " to find a collection of design patterns.]",
        // 		},
        // 		&asciidoc.NewLine{},
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
        // 									Value: "gof",
        // 								},
        // 							},
        // 							Elements: nil,
        // 						},
        // 						&asciidoc.String{
        // 							Value: "] Erich Gamma, et al. ",
        // 						},
        // 						&asciidoc.Italic{
        // 							AttributeList: nil,
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Design Patterns: Elements of Reusable Object-Oriented Software.",
        // 								},
        // 							},
        // 						},
        // 						&asciidoc.String{
        // 							Value: " Addison-Wesley. 1994.",
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
    fun `footnotes in headings are expected to be numbered out of sequence`() {
        // Input: asciidoctor/substitutions_test_footnotes_in_headings_are_expected_to_be_numbered_out_of_sequence.adoc
        // Expected Go AST:
        // var substitutionsTestFootnotesInHeadingsAreExpectedToBeNumberedOutOfSequence =
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
        // 					Value: "para.footnote:[first footnote]",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Section 1",
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
        // 				&asciidoc.String{
        // 					Value: "para.footnote:[third footnote]",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Section 2footnote:[second footnote]",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `a single-line index term macro with a primary term should be registered as an index reference`() {
        // Input: asciidoctor/substitutions_test_a_single_line_index_term_macro_with_a_primary_term_should_be_registered_as_an_index_reference.adoc
        // Expected Go AST:
        // var substitutionsTestASingleLineIndexTermMacroWithAPrimaryTermShouldBeRegisteredAsAnIndexReference =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Tigers are big, scary cats.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "indexterm:[Tigers, \"[Big\\],",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "scary cats\"]",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `registers multiple index term macros`() {
        // Input: asciidoctor/substitutions_test_registers_multiple_index_term_macros.adoc
        // Expected Go AST:
        // var substitutionsTestRegistersMultipleIndexTermMacros =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "chop",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "      (text with <indexterm>",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "      <primary>index term</primary>",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "      </indexterm>index term)",
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
    fun `visible shorthand index term macro should not consume leading round bracket`() {
        // Input: asciidoctor/substitutions_test_visible_shorthand_index_term_macro_should_not_consume_leading_round_bracket.adoc
        // Expected Go AST:
        // var substitutionsTestVisibleShorthandIndexTermMacroShouldNotConsumeLeadingRoundBracket =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "chop",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "      (<indexterm>",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "      <primary>index term</primary>",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "      </indexterm>index term for text)",
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
    fun `index term 2 macro with round bracket syntex should not interfer with index term macro with round bracket syntax`() {
        // Input: asciidoctor/substitutions_test_index_term_2_macro_with_round_bracket_syntex_should_not_interfer_with_index_term_macro_with_round_bracket_syntax.adoc
        // Expected Go AST:
        // var substitutionsTestIndexTerm2MacroWithRoundBracketSyntexShouldNotInterferWithIndexTermMacroWithRoundBracketSyntax =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "chop",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "      <indexterm>",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "      <primary>Flash</primary>",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "      <see>HTML 5</see>",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "      </indexterm>",
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
    fun `should parse concealed shorthand index term with see and seealso`() {
        // Input: asciidoctor/substitutions_test_should_parse_concealed_shorthand_index_term_with_see_and_seealso.adoc
        // Expected Go AST:
        // var substitutionsTestShouldParseConcealedShorthandIndexTermWithSeeAndSeealso =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "chop",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "      <indexterm>",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "      <primary>Flash</primary>",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "      <see>HTML 5</see>",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "      </indexterm>",
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
    fun `should parse visible index term macro with see and seealso`() {
        // Input: asciidoctor/substitutions_test_should_parse_visible_index_term_macro_with_see_and_seealso.adoc
        // Expected Go AST:
        // var substitutionsTestShouldParseVisibleIndexTermMacroWithSeeAndSeealso =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "chop",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "      <indexterm>",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "      <primary>Flash</primary>",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "      <see>HTML 5</see>",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "      </indexterm>",
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
    fun `should parse concealed index term macro with see and seealso`() {
        // Input: asciidoctor/substitutions_test_should_parse_concealed_index_term_macro_with_see_and_seealso.adoc
        // Expected Go AST:
        // var substitutionsTestShouldParseConcealedIndexTermMacroWithSeeAndSeealso =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "chop",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "      <indexterm>",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "      <primary>Flash</primary>",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "      <see>HTML 5</see>",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "      </indexterm>",
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
    fun `replaces dashes`() {
        // Input: asciidoctor/substitutions_test_replaces_dashes.adoc
        // Expected Go AST:
        // var substitutionsTestReplacesDashes =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "foo foo--bar foo\\--bar foo -- bar foo \\-- bar",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "stuff in between",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "--",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "foo",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "stuff in between",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "foo --",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "stuff in between",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "foo --",
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

}
