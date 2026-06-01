package com.kmplibs.asciidoc.integration

import com.kmplibs.asciidoc.*
import kotlin.test.Test
import kotlin.test.Ignore

class PreambleTest {

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `title and single paragraph preamble before section`() {
        // Input: asciidoctor/preamble_test_title_and_single_paragraph_preamble_before_section.adoc
        // Expected Go AST:
        // var preambleTestTitleAndSingleParagraphPreambleBeforeSection =
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
        // 					Value: "Preamble paragraph 1.",
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
        // 							Value: "Section paragraph 1.",
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
    fun `title of preface is blank by default in DocBook output`() {
        // Input: asciidoctor/preamble_test_title_of_preface_is_blank_by_default_in_doc_book_output.adoc
        // Expected Go AST:
        // var preambleTestTitleOfPrefaceIsBlankByDefaultInDocBookOutput =
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
        // 				&asciidoc.String{
        // 					Value: "Preface content.",
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
        // 							Value: "Section content.",
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
    fun `preface-title attribute is assigned as title of preface in DocBook output`() {
        // Input: asciidoctor/preamble_test_preface_title_attribute_is_assigned_as_title_of_preface_in_doc_book_output.adoc
        // Expected Go AST:
        // var preambleTestPrefaceTitleAttributeIsAssignedAsTitleOfPrefaceInDocBookOutput =
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
        // 					Name: "preface-title",
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Preface",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "Preface content.",
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
        // 							Value: "Section content.",
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
    fun `title and multi-paragraph preamble before section`() {
        // Input: asciidoctor/preamble_test_title_and_multi_paragraph_preamble_before_section.adoc
        // Expected Go AST:
        // var preambleTestTitleAndMultiParagraphPreambleBeforeSection =
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
        // 					Value: "Preamble paragraph 1.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "Preamble paragraph 2.",
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
        // 							Value: "Section paragraph 1.",
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
    fun `should not wrap content in preamble if document has title but no sections`() {
        // Input: asciidoctor/preamble_test_should_not_wrap_content_in_preamble_if_document_has_title_but_no_sections.adoc
        // Expected Go AST:
        // var preambleTestShouldNotWrapContentInPreambleIfDocumentHasTitleButNoSections =
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
        // 					Value: "paragraph",
        // 				},
        // 				&asciidoc.NewLine{},
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
    fun `title and section without preamble`() {
        // Input: asciidoctor/preamble_test_title_and_section_without_preamble.adoc
        // Expected Go AST:
        // var preambleTestTitleAndSectionWithoutPreamble =
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
        // 				&asciidoc.Section{
        // 					AttributeList: nil,
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.EmptyLine{
        // 							Text: "",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "Section paragraph 1.",
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
    fun `no title with preamble and section`() {
        // Input: asciidoctor/preamble_test_no_title_with_preamble_and_section.adoc
        // Expected Go AST:
        // var preambleTestNoTitleWithPreambleAndSection =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Preamble paragraph 1.",
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
        // 					Value: "Section paragraph 1.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "First Section",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `preamble in book doctype`() {
        // Input: asciidoctor/preamble_test_preamble_in_book_doctype.adoc
        // Expected Go AST:
        // var preambleTestPreambleInBookDoctype =
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
        // 				&asciidoc.String{
        // 					Value: "Back then...",
        // 				},
        // 				&asciidoc.NewLine{},
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
        // 							Value: "It was a dark and stormy night...",
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
        // 						&asciidoc.String{
        // 							Value: "Someone's gonna get axed.",
        // 						},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.EmptyLine{
        // 							Text: "",
        // 						},
        // 					},
        // 					Title: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Scene One",
        // 						},
        // 					},
        // 					Level: 1,
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Chapter One",
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
        // 							Value: "They couldn't believe their eyes when...",
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
        // 						&asciidoc.String{
        // 							Value: "The axe came swinging.",
        // 						},
        // 						&asciidoc.NewLine{},
        // 					},
        // 					Title: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Scene One",
        // 						},
        // 					},
        // 					Level: 1,
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Chapter Two",
        // 				},
        // 			},
        // 			Level: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should output table of contents in preamble if toc-placement attribute value is preamble`() {
        // Input: asciidoctor/preamble_test_should_output_table_of_contents_in_preamble_if_toc_placement_attribute_value_is_preamble.adoc
        // Expected Go AST:
        // var preambleTestShouldOutputTableOfContentsInPreambleIfTocPlacementAttributeValueIsPreamble =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Section{
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.AttributeEntry{
        // 					Name:     "toc",
        // 					Elements: nil,
        // 				},
        // 				&asciidoc.AttributeEntry{
        // 					Name: "toc-placement",
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "preamble",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "Once upon a time...",
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
        // 							Value: "It was a dark and stormy night...",
        // 						},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.EmptyLine{
        // 							Text: "",
        // 						},
        // 					},
        // 					Title: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Section One",
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
        // 							Value: "They couldn't believe their eyes when...",
        // 						},
        // 						&asciidoc.NewLine{},
        // 					},
        // 					Title: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Section Two",
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
    fun `should move abstract in implicit preface to info tag when converting to DocBook`() {
        // Input: asciidoctor/preamble_test_should_move_abstract_in_implicit_preface_to_info_tag_when_converting_to_doc_book.adoc
        // Expected Go AST:
        // var preambleTestShouldMoveAbstractInImplicitPrefaceToInfoTagWhenConvertingToDocBook =
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
        // 							Value: "This is the abstract.",
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
        // 					Elements:      nil,
        // 					Title: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Fin",
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
    fun `should move abstract as first section to info tag when converting to DocBook`() {
        // Input: asciidoctor/preamble_test_should_move_abstract_as_first_section_to_info_tag_when_converting_to_doc_book.adoc
        // Expected Go AST:
        // var preambleTestShouldMoveAbstractAsFirstSectionToInfoTagWhenConvertingToDocBook =
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
        // 				&asciidoc.Section{
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
        // 						&asciidoc.EmptyLine{
        // 							Text: "",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "This is the abstract.",
        // 						},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.EmptyLine{
        // 							Text: "",
        // 						},
        // 					},
        // 					Title: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Abstract",
        // 						},
        // 					},
        // 					Level: 1,
        // 				},
        // 				&asciidoc.Section{
        // 					AttributeList: nil,
        // 					Elements:      nil,
        // 					Title: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Fin",
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
    fun `should move abstract in preface section to info tag when converting to DocBook`() {
        // Input: asciidoctor/preamble_test_should_move_abstract_in_preface_section_to_info_tag_when_converting_to_doc_book.adoc
        // Expected Go AST:
        // var preambleTestShouldMoveAbstractInPrefaceSectionToInfoTagWhenConvertingToDocBook =
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
        // 				&asciidoc.Section{
        // 					AttributeList: asciidoc.AttributeList{
        // 						&asciidoc.ShorthandAttribute{
        // 							Style: &asciidoc.ShorthandStyle{
        // 								Elements: asciidoc.Elements{
        // 									&asciidoc.String{
        // 										Value: "preface",
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
        // 						&asciidoc.Paragraph{
        // 							AttributeList: asciidoc.AttributeList{
        // 								&asciidoc.ShorthandAttribute{
        // 									Style: &asciidoc.ShorthandStyle{
        // 										Elements: asciidoc.Elements{
        // 											&asciidoc.String{
        // 												Value: "abstract",
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
        // 									Value: "This is the abstract.",
        // 								},
        // 								&asciidoc.NewLine{},
        // 							},
        // 							Admonition: 0,
        // 						},
        // 						&asciidoc.EmptyLine{
        // 							Text: "",
        // 						},
        // 					},
        // 					Title: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Preface",
        // 						},
        // 					},
        // 					Level: 1,
        // 				},
        // 				&asciidoc.Section{
        // 					AttributeList: nil,
        // 					Elements:      nil,
        // 					Title: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Fin",
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

}
