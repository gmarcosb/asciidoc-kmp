package com.kmplibs.asciidoc.integration

import com.kmplibs.asciidoc.*
import kotlin.test.Test
import kotlin.test.Ignore

class ExtensionsTest {

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not activate registry if no extension groups are registered`() {
        // Input: asciidoctor/extensions_test_should_not_activate_registry_if_no_extension_groups_are_registered.adoc
        // Expected Go AST:
        // var extensionsTestShouldNotActivateRegistryIfNoExtensionGroupsAreRegistered =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "junk line",
        // 		},
        // 		&asciidoc.NewLine{},
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
        // 					Value: "sample content",
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
    fun `should invoke include processor to process include directive`() {
        // Input: asciidoctor/extensions_test_should_invoke_include_processor_to_process_include_directive.adoc
        // Expected Go AST:
        // var extensionsTestShouldInvokeIncludeProcessorToProcessIncludeDirective =
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
        // 		&asciidoc.FileInclude{
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "lorem-ipsum.txt",
        // 				},
        // 			},
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
    fun `should invoke include processor if it offers to handle include directive`() {
        // Input: asciidoctor/extensions_test_should_invoke_include_processor_if_it_offers_to_handle_include_directive.adoc
        // Expected Go AST:
        // var extensionsTestShouldInvokeIncludeProcessorIfItOffersToHandleIncludeDirective =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.FileInclude{
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "skip-me.adoc",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: "line after skip",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.FileInclude{
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "include-file.adoc",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.FileInclude{
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "fixtures/grandchild-include.adoc",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "last line",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should invoke tree processors after parsing document`() {
        // Input: asciidoctor/extensions_test_should_invoke_tree_processors_after_parsing_document.adoc
        // Expected Go AST:
        // var extensionsTestShouldInvokeTreeProcessorsAfterParsingDocument =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Section{
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Doc Writer",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "content",
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
    fun `should allow tree processor to replace tree`() {
        // Input: asciidoctor/extensions_test_should_allow_tree_processor_to_replace_tree.adoc
        // Expected Go AST:
        // var extensionsTestShouldAllowTreeProcessorToReplaceTree =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Section{
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Doc Writer",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "content",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Original Document",
        // 				},
        // 			},
        // 			Level: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should honor block title assigned in tree processor`() {
        // Input: asciidoctor/extensions_test_should_honor_block_title_assigned_in_tree_processor.adoc
        // Expected Go AST:
        // var extensionsTestShouldHonorBlockTitleAssignedInTreeProcessor =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Section{
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.AttributeReset{
        // 					Name: "example-caption",
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.ExampleBlock{
        // 					Delimiter: asciidoc.Delimiter{
        // 						Type:   3,
        // 						Length: 4,
        // 					},
        // 					AttributeList: asciidoc.AttributeList{
        // 						&asciidoc.TitleAttribute{
        // 							Val: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Old block title",
        // 								},
        // 							},
        // 						},
        // 					},
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "example block content",
        // 						},
        // 						&asciidoc.NewLine{},
        // 					},
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
    fun `should invoke postprocessors after converting document`() {
        // Input: asciidoctor/extensions_test_should_invoke_postprocessors_after_converting_document.adoc
        // Expected Go AST:
        // var extensionsTestShouldInvokePostprocessorsAfterConvertingDocument =
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
    fun `should yield to document processor block if block has non-zero arity`() {
        // Input: asciidoctor/extensions_test_should_yield_to_document_processor_block_if_block_has_non_zero_arity.adoc
        // Expected Go AST:
        // var extensionsTestShouldYieldToDocumentProcessorBlockIfBlockHasNonZeroArity =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "hi!",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should invoke processor for custom block`() {
        // Input: asciidoctor/extensions_test_should_invoke_processor_for_custom_block.adoc
        // Expected Go AST:
        // var extensionsTestShouldInvokeProcessorForCustomBlock =
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
        // 								Value: "yell",
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
        // 					Value: "Hi there!",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 0,
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
        // 								Value: "yell",
        // 							},
        // 						},
        // 					},
        // 					ID:      nil,
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 				&asciidoc.NamedAttribute{
        // 					Name: "chars",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "aeiou",
        // 						},
        // 					},
        // 					Quote: 0,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Hi there!",
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
    fun `should invoke processor for custom block in an AsciiDoc table cell`() {
        // Input: asciidoctor/extensions_test_should_invoke_processor_for_custom_block_in_an_ascii_doc_table_cell.adoc
        // Expected Go AST:
        // var extensionsTestShouldInvokeProcessorForCustomBlockInAnAsciiDocTableCell =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: nil,
        // 			ColumnCount:   1,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 1,
        // 									IsSet: true,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.Paragraph{
        // 									AttributeList: asciidoc.AttributeList{
        // 										&asciidoc.ShorthandAttribute{
        // 											Style: &asciidoc.ShorthandStyle{
        // 												Elements: asciidoc.Elements{
        // 													&asciidoc.String{
        // 														Value: "yell",
        // 													},
        // 												},
        // 											},
        // 											ID:      nil,
        // 											Roles:   nil,
        // 											Options: nil,
        // 										},
        // 									},
        // 									Elements: asciidoc.Elements{
        // 										&asciidoc.String{
        // 											Value: "Hi there!",
        // 										},
        // 									},
        // 									Admonition: 0,
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should yield to syntax processor block if block has non-zero arity`() {
        // Input: asciidoctor/extensions_test_should_yield_to_syntax_processor_block_if_block_has_non_zero_arity.adoc
        // Expected Go AST:
        // var extensionsTestShouldYieldToSyntaxProcessorBlockIfBlockHasNonZeroArity =
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
        // 								Value: "eval",
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
        // 				"'yolo' * 5",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should pass cloaked context in attributes passed to process method of custom block`() {
        // Input: asciidoctor/extensions_test_should_pass_cloaked_context_in_attributes_passed_to_process_method_of_custom_block.adoc
        // Expected Go AST:
        // var extensionsTestShouldPassCloakedContextInAttributesPassedToProcessMethodOfCustomBlock =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.SidebarBlock{
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   8,
        // 				Length: 4,
        // 			},
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "custom",
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
        // 					Value: "sidebar",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should allow extension to promote paragraph to compound block`() {
        // Input: asciidoctor/extensions_test_should_allow_extension_to_promote_paragraph_to_compound_block.adoc
        // Expected Go AST:
        // var extensionsTestShouldAllowExtensionToPromoteParagraphToCompoundBlock =
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
        // 								Value: "ex",
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
        // 					Value: "example",
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
    fun `should drop block macro line if target references missing attribute and attribute-missing is drop-line`() {
        // Input: asciidoctor/extensions_test_should_drop_block_macro_line_if_target_references_missing_attribute_and_attribute_missing_is_drop_line.adoc
        // Expected Go AST:
        // var extensionsTestShouldDropBlockMacroLineIfTargetReferencesMissingAttributeAndAttributeMissingIsDropLine =
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
        // 									Value: "rolename",
        // 								},
        // 							},
        // 						},
        // 					},
        // 					Options: nil,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "snippet::",
        // 				},
        // 				&asciidoc.UserAttributeReference{
        // 					Value: "gist-ns",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "12345[mode=edit]",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 0,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "following paragraph",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should invoke processor for custom block macro in an AsciiDoc table cell`() {
        // Input: asciidoctor/extensions_test_should_invoke_processor_for_custom_block_macro_in_an_ascii_doc_table_cell.adoc
        // Expected Go AST:
        // var extensionsTestShouldInvokeProcessorForCustomBlockMacroInAnAsciiDocTableCell =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: nil,
        // 			ColumnCount:   1,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 1,
        // 									IsSet: true,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "message::hi[]",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should fail to convert if name of block macro is illegal`() {
        // Input: asciidoctor/extensions_test_should_fail_to_convert_if_name_of_block_macro_is_illegal.adoc
        // Expected Go AST:
        // var extensionsTestShouldFailToConvertIfNameOfBlockMacroIsIllegal =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "attribute::yin[yang]",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "header_attribute::foo[bar]",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should parse text in square brackets as attrlist by default`() {
        // Input: asciidoctor/extensions_test_should_parse_text_in_square_brackets_as_attrlist_by_default.adoc
        // Expected Go AST:
        // var extensionsTestShouldParseTextInSquareBracketsAsAttrlistByDefault =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.StemBlock{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.NamedAttribute{
        // 					Name: "subs",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "normal",
        // 						},
        // 					},
        // 					Quote: 0,
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   9,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"short_attributes:[]",
        // 				"short_attributes:[value,key=val]",
        // 				"short_text:[]",
        // 				"short_text:[[text\\]]",
        // 				"full-attributes:target[]",
        // 				"full-attributes:target[value,key=val]",
        // 				"full-text:target[]",
        // 				"full-text:target[[text\\]]",
        // 				"@target",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should prefer attributes parsed from inline macro over default attributes`() {
        // Input: asciidoctor/extensions_test_should_prefer_attributes_parsed_from_inline_macro_over_default_attributes.adoc
        // Expected Go AST:
        // var extensionsTestShouldPreferAttributesParsedFromInlineMacroOverDefaultAttributes =
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
        // 							Value: "unused title",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "skip-me",
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
        // 					Value: "not shown",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 0,
        // 		},
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
        // 					Value: "shown",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not invoke process method or carry over attributes if block processor declares skip content model`() {
        // Input: asciidoctor/extensions_test_should_not_invoke_process_method_or_carry_over_attributes_if_block_processor_declares_skip_content_model.adoc
        // Expected Go AST:
        // var extensionsTestShouldNotInvokeProcessMethodOrCarryOverAttributesIfBlockProcessorDeclaresSkipContentModel =
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
        // 							Value: "unused title",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "ignore",
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
        // 					Value: "not shown",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 0,
        // 		},
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
        // 					Value: "shown",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should pass attributes by value to block processor`() {
        // Input: asciidoctor/extensions_test_should_pass_attributes_by_value_to_block_processor.adoc
        // Expected Go AST:
        // var extensionsTestShouldPassAttributesByValueToBlockProcessor =
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
        // 							Value: "title",
        // 						},
        // 					},
        // 				},
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
    fun `should allow extension to replace custom block with a section`() {
        // Input: asciidoctor/extensions_test_should_allow_extension_to_replace_custom_block_with_a_section.adoc
        // Expected Go AST:
        // var extensionsTestShouldAllowExtensionToReplaceCustomBlockWithASection =
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
        // 							Value: "Section Title",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "sect",
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
        // 					Value: "a",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "b",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `can use parse_content to append blocks to current parent`() {
        // Input: asciidoctor/extensions_test_can_use_parse_content_to_append_blocks_to_current_parent.adoc
        // Expected Go AST:
        // var extensionsTestCanUseParseContentToAppendBlocksToCurrentParent =
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
        // 		&asciidoc.LiteralBlock{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "csv",
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
        // 				"a,b,c",
        // 			},
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
    fun `should ignore return value of custom block if value is parent`() {
        // Input: asciidoctor/extensions_test_should_ignore_return_value_of_custom_block_if_value_is_parent.adoc
        // Expected Go AST:
        // var extensionsTestShouldIgnoreReturnValueOfCustomBlockIfValueIsParent =
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
        // 								Value: "unwrap",
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
        // 					Value: "a",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "b",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "c",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should ignore return value of custom block macro if value is parent`() {
        // Input: asciidoctor/extensions_test_should_ignore_return_value_of_custom_block_macro_if_value_is_parent.adoc
        // Expected Go AST:
        // var extensionsTestShouldIgnoreReturnValueOfCustomBlockMacroIfValueIsParent =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "para::text[]",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `parse_content should not share attributes between parsed blocks`() {
        // Input: asciidoctor/extensions_test_parse_content_should_not_share_attributes_between_parsed_blocks.adoc
        // Expected Go AST:
        // var extensionsTestParseContentShouldNotShareAttributesBetweenParsedBlocks =
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
        // 								Value: "wrap",
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
        // 				&asciidoc.ExampleBlock{
        // 					Delimiter: asciidoc.Delimiter{
        // 						Type:   3,
        // 						Length: 4,
        // 					},
        // 					AttributeList: asciidoc.AttributeList{
        // 						&asciidoc.NamedAttribute{
        // 							Name: "foo",
        // 							Val: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "bar",
        // 								},
        // 							},
        // 							Quote: 0,
        // 						},
        // 					},
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "content",
        // 						},
        // 						&asciidoc.NewLine{},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.ExampleBlock{
        // 					Delimiter: asciidoc.Delimiter{
        // 						Type:   3,
        // 						Length: 4,
        // 					},
        // 					AttributeList: asciidoc.AttributeList{
        // 						&asciidoc.NamedAttribute{
        // 							Name: "baz",
        // 							Val: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "qux",
        // 								},
        // 							},
        // 							Quote: 0,
        // 						},
        // 					},
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "content",
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
    fun `can use parse_attributes to parse attrlist`() {
        // Input: asciidoctor/extensions_test_can_use_parse_attributes_to_parse_attrlist.adoc
        // Expected Go AST:
        // var extensionsTestCanUseParseAttributesToParseAttrlist =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
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
        // 		&asciidoc.OpenBlock{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: &asciidoc.ShorthandStyle{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "attrs",
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
        // 					Value: "a,b,c,key=val",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `create_section should set up all section properties`() {
        // Input: asciidoctor/extensions_test_create_section_should_set_up_all_section_properties.adoc
        // Expected Go AST:
        // var extensionsTestCreateSectionShouldSetUpAllSectionProperties =
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
        // 				&asciidoc.AttributeEntry{
        // 					Name:     "sectnums",
        // 					Elements: nil,
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "sect::[%s]",
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
    fun `should add docinfo to document`() {
        // Input: asciidoctor/extensions_test_should_add_docinfo_to_document.adoc
        // Expected Go AST:
        // var extensionsTestShouldAddDocinfoToDocument =
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
        // 					Value: "sample content",
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
    fun `should add multiple docinfo to document`() {
        // Input: asciidoctor/extensions_test_should_add_multiple_docinfo_to_document.adoc
        // Expected Go AST:
        // var extensionsTestShouldAddMultipleDocinfoToDocument =
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
        // 					Value: "sample content",
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
    fun `should not assign caption on image block if title is not set on custom block macro`() {
        // Input: asciidoctor/extensions_test_should_not_assign_caption_on_image_block_if_title_is_not_set_on_custom_block_macro.adoc
        // Expected Go AST:
        // var extensionsTestShouldNotAssignCaptionOnImageBlockIfTitleIsNotSetOnCustomBlockMacro =
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
        // 							Value: "Cat in Sink?",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "cat_in_sink::30[]",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 0,
        // 		},
        // 	},
        // }
    }

}
