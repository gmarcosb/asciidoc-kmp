package com.kmplibs.asciidoc.integration

import com.kmplibs.asciidoc.*
import kotlin.test.Test
import kotlin.test.Ignore

class AttributesTest {

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `creates an attribute by fusing a legacy multi-line value`() {
        // Input: asciidoctor/attributes_test_creates_an_attribute_by_fusing_a_legacy_multi_line_value.adoc
        // Expected Go AST:
        // var attributesTestCreatesAnAttributeByFusingALegacyMultiLineValue =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "description",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "This is the first      ",
        // 				},
        // 				&asciidoc.LineBreak{},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "              Ruby implementation of ",
        // 				},
        // 				&asciidoc.LineBreak{},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "              AsciiDoc.",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `creates an attribute by fusing a multi-line value`() {
        // Input: asciidoctor/attributes_test_creates_an_attribute_by_fusing_a_multi_line_value.adoc
        // Expected Go AST:
        // var attributesTestCreatesAnAttributeByFusingAMultiLineValue =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "description",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "This is the first \\",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: "              Ruby implementation of \\",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "              AsciiDoc.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `honors line break characters in multi-line values`() {
        // Input: asciidoctor/attributes_test_honors_line_break_characters_in_multi_line_values.adoc
        // Expected Go AST:
        // var attributesTestHonorsLineBreakCharactersInMultiLineValues =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "signature",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Linus Torvalds + \\",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Linux Hacker + \\",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		asciidoc.Email{
        // 			Address: "linus.torvalds@example.com",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should allow pass macro to surround a multi-line value that contains line breaks`() {
        // Input: asciidoctor/attributes_test_should_allow_pass_macro_to_surround_a_multi_line_value_that_contains_line_breaks.adoc
        // Expected Go AST:
        // var attributesTestShouldAllowPassMacroToSurroundAMultiLineValueThatContainsLineBreaks =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "signature",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "pass:a[{author} + \\",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.UserAttributeReference{
        // 			Value: "title",
        // 		},
        // 		&asciidoc.String{
        // 			Value: " + \\",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.UserAttributeReference{
        // 			Value: "email",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "]",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `performs attribute substitution on attribute value`() {
        // Input: asciidoctor/attributes_test_performs_attribute_substitution_on_attribute_value.adoc
        // Expected Go AST:
        // var attributesTestPerformsAttributeSubstitutionOnAttributeValue =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "release",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Asciidoctor ",
        // 				},
        // 				&asciidoc.LineBreak{},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "          {version}",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `resolves attributes inside attribute value within header`() {
        // Input: asciidoctor/attributes_test_resolves_attributes_inside_attribute_value_within_header.adoc
        // Expected Go AST:
        // var attributesTestResolvesAttributesInsideAttributeValueWithinHeader =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Section{
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.AttributeEntry{
        // 					Name: "big",
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "big",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.AttributeEntry{
        // 					Name: "bigfoot",
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "{big}foot",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.UserAttributeReference{
        // 					Value: "bigfoot",
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
    fun `resolves attributes and pass macro inside attribute value outside header`() {
        // Input: asciidoctor/attributes_test_resolves_attributes_and_pass_macro_inside_attribute_value_outside_header.adoc
        // Expected Go AST:
        // var attributesTestResolvesAttributesAndPassMacroInsideAttributeValueOutsideHeader =
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
        // 					Value: "content",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.AttributeEntry{
        // 					Name: "big",
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "pass:a,q[_big_]",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.AttributeEntry{
        // 					Name: "bigfoot",
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "{big}foot",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.UserAttributeReference{
        // 					Value: "bigfoot",
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
    fun `should handle multibyte characters when limiting attribute value size`() {
        // Input: asciidoctor/attributes_test_should_handle_multibyte_characters_when_limiting_attribute_value_size.adoc
        // Expected Go AST:
        // var attributesTestShouldHandleMultibyteCharactersWhenLimitingAttributeValueSize =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "name",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "日本語",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UserAttributeReference{
        // 			Value: "name",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not mangle multibyte characters when limiting attribute value size`() {
        // Input: asciidoctor/attributes_test_should_not_mangle_multibyte_characters_when_limiting_attribute_value_size.adoc
        // Expected Go AST:
        // var attributesTestShouldNotMangleMultibyteCharactersWhenLimitingAttributeValueSize =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "name",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "日本語",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UserAttributeReference{
        // 			Value: "name",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `resolves user-home attribute if safe mode is less than SERVER`() {
        // Input: asciidoctor/attributes_test_resolves_user_home_attribute_if_safe_mode_is_less_than_server.adoc
        // Expected Go AST:
        // var attributesTestResolvesUserHomeAttributeIfSafeModeIsLessThanServer =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "imagesdir",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "{user-home}/etc/images",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UserAttributeReference{
        // 			Value: "imagesdir",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `user-home attribute resolves to _ if safe mode is SERVER or greater`() {
        // Input: asciidoctor/attributes_test_user_home_attribute_resolves_to___if_safe_mode_is_server_or_greater.adoc
        // Expected Go AST:
        // var attributesTestUserHomeAttributeResolvesToIfSafeModeIsServerOrGreater =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "imagesdir",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "{user-home}/etc/images",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UserAttributeReference{
        // 			Value: "imagesdir",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `user-home attribute can be overridden by API if safe mode is less than SERVER`() {
        // Input: asciidoctor/attributes_test_user_home_attribute_can_be_overridden_by_api_if_safe_mode_is_less_than_server.adoc
        // Expected Go AST:
        // var attributesTestUserHomeAttributeCanBeOverriddenByApiIfSafeModeIsLessThanServer =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Go ",
        // 		},
        // 		&asciidoc.UserAttributeReference{
        // 			Value: "user-home",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "!",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `user-home attribute can be overridden by API if safe mode is SERVER or greater`() {
        // Input: asciidoctor/attributes_test_user_home_attribute_can_be_overridden_by_api_if_safe_mode_is_server_or_greater.adoc
        // Expected Go AST:
        // var attributesTestUserHomeAttributeCanBeOverriddenByApiIfSafeModeIsServerOrGreater =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Go ",
        // 		},
        // 		&asciidoc.UserAttributeReference{
        // 			Value: "user-home",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "!",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not recognize pass macro with invalid substitution list in attribute value`() {
        // Input: asciidoctor/attributes_test_should_not_recognize_pass_macro_with_invalid_substitution_list_in_attribute_value.adoc
        // Expected Go AST:
        // var attributesTestShouldNotRecognizePassMacroWithInvalidSubstitutionListInAttributeValue =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name:     "holygrail",
        // 			Elements: nil,
        // 		},
        // 		&asciidoc.IfDef{
        // 			Attributes: asciidoc.AttributeNames{
        // 				"holygrail",
        // 			},
        // 			Union:  0,
        // 			Inline: false,
        // 		},
        // 		&asciidoc.String{
        // 			Value: "The holy grail has been found!",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EndIf{
        // 			Attributes: asciidoc.AttributeNames{
        // 				"holygrail",
        // 			},
        // 			Union: 0,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeReset{
        // 			Name: "holygrail",
        // 		},
        // 		&asciidoc.IfNDef{
        // 			Attributes: asciidoc.AttributeNames{
        // 				"holygrail",
        // 			},
        // 			Union:  0,
        // 			Inline: false,
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Buggers! What happened to the grail?",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EndIf{
        // 			Attributes: asciidoc.AttributeNames{
        // 				"holygrail",
        // 			},
        // 			Union: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `attribute set via API overrides attribute set in document`() {
        // Input: asciidoctor/attributes_test_attribute_set_via_api_overrides_attribute_set_in_document.adoc
        // Expected Go AST:
        // var attributesTestAttributeSetViaApiOverridesAttributeSetInDocument =
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
    fun `backend and doctype attributes are set by default in custom configuration`() {
        // Input: asciidoctor/attributes_test_backend_and_doctype_attributes_are_set_by_default_in_custom_configuration.adoc
        // Expected Go AST:
        // var attributesTestBackendAndDoctypeAttributesAreSetByDefaultInCustomConfiguration =
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
    fun `backend attributes are updated if backend attribute is defined in document and safe mode is less than SERVER`() {
        // Input: asciidoctor/attributes_test_backend_attributes_are_updated_if_backend_attribute_is_defined_in_document_and_safe_mode_is_less_than_server.adoc
        // Expected Go AST:
        // var attributesTestBackendAttributesAreUpdatedIfBackendAttributeIsDefinedInDocumentAndSafeModeIsLessThanServer =
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
        // 				&asciidoc.AttributeEntry{
        // 					Name: "backend",
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "docbook",
        // 						},
        // 					},
        // 				},
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
    fun `backend attributes defined in document options overrides backend attribute in document`() {
        // Input: asciidoctor/attributes_test_backend_attributes_defined_in_document_options_overrides_backend_attribute_in_document.adoc
        // Expected Go AST:
        // var attributesTestBackendAttributesDefinedInDocumentOptionsOverridesBackendAttributeInDocument =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "uri",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "http://example.org",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UserAttributeReference{
        // 			Value: "uri",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `set_attribute should set attribute if key is not locked`() {
        // Input: asciidoctor/attributes_test_set_attribute_should_set_attribute_if_key_is_not_locked.adoc
        // Expected Go AST:
        // var attributesTestSetAttributeShouldSetAttributeIfKeyIsNotLocked =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "#attributes                               |toc|toc-position|toc-placement|toc-class",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "toc                                       |   |nil         |auto         |nil",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "toc=header                                |   |nil         |auto         |nil",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "toc=beeboo                                |   |nil         |auto         |nil",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "toc=left                                  |   |left        |auto         |toc2",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "toc2                                      |   |left        |auto         |toc2",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "toc=right                                 |   |right       |auto         |toc2",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "toc=preamble                              |   |content     |preamble     |nil",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "toc=macro                                 |   |content     |macro        |nil",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "toc toc-placement=macro toc-position=left |   |content     |macro        |nil",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "toc toc-placement!                        |   |content     |macro        |nil",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `convert properly with simple names`() {
        // Input: asciidoctor/attributes_test_convert_properly_with_simple_names.adoc
        // Expected Go AST:
        // var attributesTestConvertProperlyWithSimpleNames =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "He-Man",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "The most powerful man in the universe",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "He-Man: ",
        // 		},
        // 		&asciidoc.UserAttributeReference{
        // 			Value: "He-Man",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "She-Ra: ",
        // 		},
        // 		&asciidoc.UserAttributeReference{
        // 			Value: "She-Ra",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `convert properly with single character name`() {
        // Input: asciidoctor/attributes_test_convert_properly_with_single_character_name.adoc
        // Expected Go AST:
        // var attributesTestConvertProperlyWithSingleCharacterName =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Main Header",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "===========",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: ":My frog: Tanglefoot",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Yo, ",
        // 		},
        // 		&asciidoc.UserAttributeReference{
        // 			Value: "myfrog",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "!",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `ignores lines with bad attributes if attribute-missing is drop-line`() {
        // Input: asciidoctor/attributes_test_ignores_lines_with_bad_attributes_if_attribute_missing_is_drop_line.adoc
        // Expected Go AST:
        // var attributesTestIgnoresLinesWithBadAttributesIfAttributeMissingIsDropLine =
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
        // 		&asciidoc.String{
        // 			Value: "This is",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "blah blah ",
        // 		},
        // 		&asciidoc.UserAttributeReference{
        // 			Value: "foobarbaz",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "all there is.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `attribute value gets interpreted when converting`() {
        // Input: asciidoctor/attributes_test_attribute_value_gets_interpreted_when_converting.adoc
        // Expected Go AST:
        // var attributesTestAttributeValueGetsInterpretedWhenConverting =
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
        // 		&asciidoc.String{
        // 			Value: "Line 1: This line should appear in the output.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "Line 2: Oh no, a ",
        // 		},
        // 		&asciidoc.UserAttributeReference{
        // 			Value: "bogus-attribute",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "! This line should not appear in the output.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not drop line with reference to missing attribute by default`() {
        // Input: asciidoctor/attributes_test_should_not_drop_line_with_reference_to_missing_attribute_by_default.adoc
        // Expected Go AST:
        // var attributesTestShouldNotDropLineWithReferenceToMissingAttributeByDefault =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Line 1: This line should appear in the output.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "Line 2: A ",
        // 		},
        // 		&asciidoc.UserAttributeReference{
        // 			Value: "bogus-attribute",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "! This time, this line should appear in the output.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should drop line with attribute unassignment by default`() {
        // Input: asciidoctor/attributes_test_should_drop_line_with_attribute_unassignment_by_default.adoc
        // Expected Go AST:
        // var attributesTestShouldDropLineWithAttributeUnassignmentByDefault =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name:     "a",
        // 			Elements: nil,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Line 1: This line should appear in the output.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "Line 2: {set:a!}This line should not appear in the output.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not drop line with attribute unassignment if attribute-undefined is drop`() {
        // Input: asciidoctor/attributes_test_should_not_drop_line_with_attribute_unassignment_if_attribute_undefined_is_drop.adoc
        // Expected Go AST:
        // var attributesTestShouldNotDropLineWithAttributeUnassignmentIfAttributeUndefinedIsDrop =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "attribute-undefined",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "drop",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name:     "a",
        // 			Elements: nil,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Line 1: This line should appear in the output.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "Line 2: {set:a!}This line should appear in the output.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should drop line that only contains attribute assignment`() {
        // Input: asciidoctor/attributes_test_should_drop_line_that_only_contains_attribute_assignment.adoc
        // Expected Go AST:
        // var attributesTestShouldDropLineThatOnlyContainsAttributeAssignment =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Line 1",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "{set:a}",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "Line 2",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should drop line that only contains unresolved attribute when attribute-missing is drop`() {
        // Input: asciidoctor/attributes_test_should_drop_line_that_only_contains_unresolved_attribute_when_attribute_missing_is_drop.adoc
        // Expected Go AST:
        // var attributesTestShouldDropLineThatOnlyContainsUnresolvedAttributeWhenAttributeMissingIsDrop =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Line 1",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.UserAttributeReference{
        // 			Value: "unresolved",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "Line 2",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `substitutes inside unordered list items`() {
        // Input: asciidoctor/attributes_test_substitutes_inside_unordered_list_items.adoc
        // Expected Go AST:
        // var attributesTestSubstitutesInsideUnorderedListItems =
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
        // 				&asciidoc.AttributeEntry{
        // 					Name: "attribute-a",
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "value",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.AttributeEntry{
        // 					Name: "attribute-b",
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "{attribute-a}",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "preamble",
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
    fun `interpolates author attribute inside attribute entry in header`() {
        // Input: asciidoctor/attributes_test_interpolates_author_attribute_inside_attribute_entry_in_header.adoc
        // Expected Go AST:
        // var attributesTestInterpolatesAuthorAttributeInsideAttributeEntryInHeader =
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
        // 				&asciidoc.AttributeEntry{
        // 					Name: "name",
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "{author}",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "preamble",
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
    fun `interpolates revinfo attribute inside attribute entry in header`() {
        // Input: asciidoctor/attributes_test_interpolates_revinfo_attribute_inside_attribute_entry_in_header.adoc
        // Expected Go AST:
        // var attributesTestInterpolatesRevinfoAttributeInsideAttributeEntryInHeader =
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
        // 				&asciidoc.String{
        // 					Value: "2013-01-01",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.AttributeEntry{
        // 					Name: "date",
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "{revdate}",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "preamble",
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
    fun `attribute entries can resolve previously defined attributes`() {
        // Input: asciidoctor/attributes_test_attribute_entries_can_resolve_previously_defined_attributes.adoc
        // Expected Go AST:
        // var attributesTestAttributeEntriesCanResolvePreviouslyDefinedAttributes =
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
        // 				&asciidoc.String{
        // 					Value: "v1.0, 2010-01-01: First release!",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.AttributeEntry{
        // 					Name: "a",
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "value",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.AttributeEntry{
        // 					Name: "a2",
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "{a}",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.AttributeEntry{
        // 					Name: "revdate2",
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "{revdate}",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.UserAttributeReference{
        // 					Value: "a",
        // 				},
        // 				&asciidoc.String{
        // 					Value: " == ",
        // 				},
        // 				&asciidoc.UserAttributeReference{
        // 					Value: "a2",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.UserAttributeReference{
        // 					Value: "revdate",
        // 				},
        // 				&asciidoc.String{
        // 					Value: " == ",
        // 				},
        // 				&asciidoc.UserAttributeReference{
        // 					Value: "revdate2",
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
    fun `should warn if unterminated block comment is detected in document header`() {
        // Input: asciidoctor/attributes_test_should_warn_if_unterminated_block_comment_is_detected_in_document_header.adoc
        // Expected Go AST:
        // var attributesTestShouldWarnIfUnterminatedBlockCommentIsDetectedInDocumentHeader =
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
        // 							Value: "bar",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.String{
        // 					Value: "////",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.AttributeEntry{
        // 					Name: "hey",
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "there",
        // 						},
        // 					},
        // 				},
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
    fun `substitutes inside block title`() {
        // Input: asciidoctor/attributes_test_substitutes_inside_block_title.adoc
        // Expected Go AST:
        // var attributesTestSubstitutesInsideBlockTitle =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "gem_name",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "asciidoctor",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Require the +",
        // 						},
        // 						&asciidoc.UserAttributeReference{
        // 							Value: "gem_name",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "+ gem",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "To use ",
        // 				},
        // 				&asciidoc.UserAttributeReference{
        // 					Value: "gem_name",
        // 				},
        // 				&asciidoc.String{
        // 					Value: ", the first thing to do is to import it in your Ruby source file.",
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
    fun `sets attribute until it is deleted`() {
        // Input: asciidoctor/attributes_test_sets_attribute_until_it_is_deleted.adoc
        // Expected Go AST:
        // var attributesTestSetsAttributeUntilItIsDeleted =
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
        // 		&asciidoc.String{
        // 			Value: "Crossing the ",
        // 		},
        // 		&asciidoc.UserAttributeReference{
        // 			Value: "foo",
        // 		},
        // 		&asciidoc.String{
        // 			Value: ".",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeReset{
        // 			Name: "foo",
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Belly up to the ",
        // 		},
        // 		&asciidoc.UserAttributeReference{
        // 			Value: "foo",
        // 		},
        // 		&asciidoc.String{
        // 			Value: ".",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should allow compat-mode to be set and unset in middle of document`() {
        // Input: asciidoctor/attributes_test_should_allow_compat_mode_to_be_set_and_unset_in_middle_of_document.adoc
        // Expected Go AST:
        // var attributesTestShouldAllowCompatModeToBeSetAndUnsetInMiddleOfDocument =
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
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.AnchorAttribute{
        // 					ID: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "paragraph-a",
        // 						},
        // 					},
        // 					Label: nil,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.Monospace{
        // 					AttributeList: nil,
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.UserAttributeReference{
        // 							Value: "foo",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 0,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeReset{
        // 			Name: "compat-mode",
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.AnchorAttribute{
        // 					ID: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "paragraph-b",
        // 						},
        // 					},
        // 					Label: nil,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.Monospace{
        // 					AttributeList: nil,
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.UserAttributeReference{
        // 							Value: "foo",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 0,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name:     "compat-mode",
        // 			Elements: nil,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.AnchorAttribute{
        // 					ID: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "paragraph-c",
        // 						},
        // 					},
        // 					Label: nil,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.Monospace{
        // 					AttributeList: nil,
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.UserAttributeReference{
        // 							Value: "foo",
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
    fun `does not disturb attribute-looking things escaped with backslash`() {
        // Input: asciidoctor/attributes_test_does_not_disturb_attribute_looking_things_escaped_with_backslash.adoc
        // Expected Go AST:
        // var attributesTestDoesNotDisturbAttributeLookingThingsEscapedWithBackslash =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "forecast",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "snow",
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
        // 				"puts 'The forecast for today is {forecast}'",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `does not substitute attributes inside literal blocks`() {
        // Input: asciidoctor/attributes_test_does_not_substitute_attributes_inside_literal_blocks.adoc
        // Expected Go AST:
        // var attributesTestDoesNotSubstituteAttributesInsideLiteralBlocks =
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
        // 		&asciidoc.LiteralBlock{
        // 			AttributeList: nil,
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   6,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"You insert the text {foo} to expand the value",
        // 				"of the attribute named foo in your document.",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `does not show docdir and shows relative docfile if safe mode is SERVER or greater`() {
        // Input: asciidoctor/attributes_test_does_not_show_docdir_and_shows_relative_docfile_if_safe_mode_is_server_or_greater.adoc
        // Expected Go AST:
        // var attributesTestDoesNotShowDocdirAndShowsRelativeDocfileIfSafeModeIsServerOrGreater =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "docdir: ",
        // 				},
        // 				&asciidoc.UserAttributeReference{
        // 					Value: "docdir",
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
        // 					Value: "docfile: ",
        // 				},
        // 				&asciidoc.UserAttributeReference{
        // 					Value: "docfile",
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
    fun `shows absolute docdir and docfile paths if safe mode is less than SERVER`() {
        // Input: asciidoctor/attributes_test_shows_absolute_docdir_and_docfile_paths_if_safe_mode_is_less_than_server.adoc
        // Expected Go AST:
        // var attributesTestShowsAbsoluteDocdirAndDocfilePathsIfSafeModeIsLessThanServer =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "docdir: ",
        // 				},
        // 				&asciidoc.UserAttributeReference{
        // 					Value: "docdir",
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
        // 					Value: "docfile: ",
        // 				},
        // 				&asciidoc.UserAttributeReference{
        // 					Value: "docfile",
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
    fun `assigns attribute defined in attribute reference with set prefix and value`() {
        // Input: asciidoctor/attributes_test_assigns_attribute_defined_in_attribute_reference_with_set_prefix_and_value.adoc
        // Expected Go AST:
        // var attributesTestAssignsAttributeDefinedInAttributeReferenceWithSetPrefixAndValue =
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
        // 		&asciidoc.AttributeEntry{
        // 			Name:     "foo",
        // 			Elements: nil,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "{set:foo!}",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.UserAttributeReference{
        // 			Value: "foo",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "yes",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `creates counter`() {
        // Input: asciidoctor/attributes_test_creates_counter.adoc
        // Expected Go AST:
        // var attributesTestCreatesCounter =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "mycounter",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "0",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Counter{
        // 			Name:         "mycounter",
        // 			InitialValue: "",
        // 			Display:      asciidoc.CounterVisibilityVisible,
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `can seed counter to start at A`() {
        // Input: asciidoctor/attributes_test_can_seed_counter_to_start_at_a.adoc
        // Expected Go AST:
        // var attributesTestCanSeedCounterToStartAtA =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "mycounter",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "@",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Counter{
        // 			Name:         "mycounter",
        // 			InitialValue: "",
        // 			Display:      asciidoc.CounterVisibilityVisible,
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `increments counter with positive numeric value`() {
        // Input: asciidoctor/attributes_test_increments_counter_with_positive_numeric_value.adoc
        // Expected Go AST:
        // var attributesTestIncrementsCounterWithPositiveNumericValue =
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
        // 							Value: "attributes",
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
        // 				"{counter:mycounter:1}",
        // 				"{counter:mycounter}",
        // 				"{counter:mycounter}",
        // 				"{mycounter}",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `increments counter with negative numeric value`() {
        // Input: asciidoctor/attributes_test_increments_counter_with_negative_numeric_value.adoc
        // Expected Go AST:
        // var attributesTestIncrementsCounterWithNegativeNumericValue =
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
        // 							Value: "attributes",
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
        // 				"{counter:mycounter:-2}",
        // 				"{counter:mycounter}",
        // 				"{counter:mycounter}",
        // 				"{mycounter}",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `increments counter with ASCII character value`() {
        // Input: asciidoctor/attributes_test_increments_counter_with_ascii_character_value.adoc
        // Expected Go AST:
        // var attributesTestIncrementsCounterWithAsciiCharacterValue =
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
        // 							Value: "attributes",
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
        // 				"{counter:mycounter:A}",
        // 				"{counter:mycounter}",
        // 				"{counter:mycounter}",
        // 				"{mycounter}",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `increments counter with non-ASCII character value`() {
        // Input: asciidoctor/attributes_test_increments_counter_with_non_ascii_character_value.adoc
        // Expected Go AST:
        // var attributesTestIncrementsCounterWithNonAsciiCharacterValue =
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
        // 							Value: "attributes",
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
        // 				"{counter:mycounter:é}",
        // 				"{counter:mycounter}",
        // 				"{counter:mycounter}",
        // 				"{mycounter}",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `increments counter with emoji character value`() {
        // Input: asciidoctor/attributes_test_increments_counter_with_emoji_character_value.adoc
        // Expected Go AST:
        // var attributesTestIncrementsCounterWithEmojiCharacterValue =
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
        // 							Value: "attributes",
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
        // 				"{counter:smiley:😋}",
        // 				"{counter:smiley}",
        // 				"{counter:smiley}",
        // 				"{smiley}",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `increments counter with multi-character value`() {
        // Input: asciidoctor/attributes_test_increments_counter_with_multi_character_value.adoc
        // Expected Go AST:
        // var attributesTestIncrementsCounterWithMultiCharacterValue =
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
        // 							Value: "attributes",
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
        // 				"{counter:math:1x}",
        // 				"{counter:math}",
        // 				"{counter:math}",
        // 				"{math}",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `counter uses 0 as seed value if seed attribute is nil`() {
        // Input: asciidoctor/attributes_test_counter_uses_0_as_seed_value_if_seed_attribute_is_nil.adoc
        // Expected Go AST:
        // var attributesTestCounterUses0AsSeedValueIfSeedAttributeIsNil =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name:     "mycounter",
        // 			Elements: nil,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Counter{
        // 			Name:         "mycounter",
        // 			InitialValue: "",
        // 			Display:      asciidoc.CounterVisibilityVisible,
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UserAttributeReference{
        // 			Value: "mycounter",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `counter value can be reset by attribute entry`() {
        // Input: asciidoctor/attributes_test_counter_value_can_be_reset_by_attribute_entry.adoc
        // Expected Go AST:
        // var attributesTestCounterValueCanBeResetByAttributeEntry =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name:     "mycounter",
        // 			Elements: nil,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "before: ",
        // 		},
        // 		&asciidoc.Counter{
        // 			Name:         "mycounter",
        // 			InitialValue: "",
        // 			Display:      asciidoc.CounterVisibilityVisible,
        // 		},
        // 		&asciidoc.String{
        // 			Value: " ",
        // 		},
        // 		&asciidoc.Counter{
        // 			Name:         "mycounter",
        // 			InitialValue: "",
        // 			Display:      asciidoc.CounterVisibilityVisible,
        // 		},
        // 		&asciidoc.String{
        // 			Value: " ",
        // 		},
        // 		&asciidoc.Counter{
        // 			Name:         "mycounter",
        // 			InitialValue: "",
        // 			Display:      asciidoc.CounterVisibilityVisible,
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeReset{
        // 			Name: "mycounter",
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "after: ",
        // 		},
        // 		&asciidoc.Counter{
        // 			Name:         "mycounter",
        // 			InitialValue: "",
        // 			Display:      asciidoc.CounterVisibilityVisible,
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `counter value can be advanced by attribute entry`() {
        // Input: asciidoctor/attributes_test_counter_value_can_be_advanced_by_attribute_entry.adoc
        // Expected Go AST:
        // var attributesTestCounterValueCanBeAdvancedByAttributeEntry =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "before: ",
        // 		},
        // 		&asciidoc.Counter{
        // 			Name:         "mycounter",
        // 			InitialValue: "",
        // 			Display:      asciidoc.CounterVisibilityVisible,
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "mycounter",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "10",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "after: ",
        // 		},
        // 		&asciidoc.Counter{
        // 			Name:         "mycounter",
        // 			InitialValue: "",
        // 			Display:      asciidoc.CounterVisibilityVisible,
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `nested document should use counter from parent document`() {
        // Input: asciidoctor/attributes_test_nested_document_should_use_counter_from_parent_document.adoc
        // Expected Go AST:
        // var attributesTestNestedDocumentShouldUseCounterFromParentDocument =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.BlockImage{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Title for Foo",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ImagePath: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "foo.jpg",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TableColumnsAttribute{
        // 					Columns: []*asciidoc.TableColumn{
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 2,
        // 								IsSet: true,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 1,
        // 								IsSet: true,
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ColumnCount: 2,
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
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.BlockImage{
        // 									AttributeList: asciidoc.AttributeList{
        // 										&asciidoc.TitleAttribute{
        // 											Val: asciidoc.Elements{
        // 												&asciidoc.String{
        // 													Value: "Title for Bar",
        // 												},
        // 											},
        // 										},
        // 									},
        // 									ImagePath: asciidoc.Elements{
        // 										&asciidoc.String{
        // 											Value: "bar.jpg",
        // 										},
        // 									},
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
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
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.String{
        // 									Value: ".Title for Baz",
        // 								},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.String{
        // 									Value: "image::baz.jpg[]",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "\n",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.BlockImage{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Title for Qux",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ImagePath: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "qux.jpg",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not allow counter to modify locked attribute`() {
        // Input: asciidoctor/attributes_test_should_not_allow_counter_to_modify_locked_attribute.adoc
        // Expected Go AST:
        // var attributesTestShouldNotAllowCounterToModifyLockedAttribute =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "{counter:foo:ignored} is not ",
        // 		},
        // 		&asciidoc.UserAttributeReference{
        // 			Value: "foo",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not allow counter2 to modify locked attribute`() {
        // Input: asciidoctor/attributes_test_should_not_allow_counter_2_to_modify_locked_attribute.adoc
        // Expected Go AST:
        // var attributesTestShouldNotAllowCounter2ToModifyLockedAttribute =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "{counter2:foo:ignored}",
        // 		},
        // 		&asciidoc.UserAttributeReference{
        // 			Value: "foo",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not allow counter to modify built-in locked attribute`() {
        // Input: asciidoctor/attributes_test_should_not_allow_counter_to_modify_built_in_locked_attribute.adoc
        // Expected Go AST:
        // var attributesTestShouldNotAllowCounterToModifyBuiltInLockedAttribute =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Counter{
        // 			Name:         "max-include-depth",
        // 			InitialValue: "",
        // 			Display:      asciidoc.CounterVisibilityVisible,
        // 		},
        // 		&asciidoc.String{
        // 			Value: " is one more than ",
        // 		},
        // 		&asciidoc.UserAttributeReference{
        // 			Value: "max-include-depth",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not allow counter2 to modify built-in locked attribute`() {
        // Input: asciidoctor/attributes_test_should_not_allow_counter_2_to_modify_built_in_locked_attribute.adoc
        // Expected Go AST:
        // var attributesTestShouldNotAllowCounter2ToModifyBuiltInLockedAttribute =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Counter{
        // 			Name:         "max-include-depth",
        // 			InitialValue: "",
        // 			Display:      asciidoc.CounterVisibilityHidden,
        // 		},
        // 		&asciidoc.UserAttributeReference{
        // 			Value: "max-include-depth",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `parses named attribute with valid name`() {
        // Input: asciidoctor/attributes_test_parses_named_attribute_with_valid_name.adoc
        // Expected Go AST:
        // var attributesTestParsesNamedAttributeWithValidName =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "[normal,foo=\"bar\",_foo=\"_bar\",foo1=\"bar1\",foo-foo=\"bar-bar\",foo.foo=\"bar.bar\"]",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "content",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `does not parse named attribute if name is invalid`() {
        // Input: asciidoctor/attributes_test_does_not_parse_named_attribute_if_name_is_invalid.adoc
        // Expected Go AST:
        // var attributesTestDoesNotParseNamedAttributeIfNameIsInvalid =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "[normal,foo.foo=\"bar.bar\",-foo-foo=\"-bar-bar\"]",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "content",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `positional attributes assigned to block`() {
        // Input: asciidoctor/attributes_test_positional_attributes_assigned_to_block.adoc
        // Expected Go AST:
        // var attributesTestPositionalAttributesAssignedToBlock =
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
        // 							Value: "author",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      2,
        // 					ImpliedName: "",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "source",
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
    fun `normal substitutions are performed on single-quoted positional attribute`() {
        // Input: asciidoctor/attributes_test_normal_substitutions_are_performed_on_single_quoted_positional_attribute.adoc
        // Expected Go AST:
        // var attributesTestNormalSubstitutionsArePerformedOnSingleQuotedPositionalAttribute =
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
        // 							Value: "author",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      2,
        // 					ImpliedName: "",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "http://wikipedia.org[source]",
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
    fun `normal substitutions are performed on single-quoted named attribute`() {
        // Input: asciidoctor/attributes_test_normal_substitutions_are_performed_on_single_quoted_named_attribute.adoc
        // Expected Go AST:
        // var attributesTestNormalSubstitutionsArePerformedOnSingleQuotedNamedAttribute =
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
        // 							Value: "author",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.NamedAttribute{
        // 					Name: "citetitle",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "http://wikipedia.org[source]",
        // 						},
        // 					},
        // 					Quote: 1,
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
    fun `normal substitutions are performed once on single-quoted named title attribute`() {
        // Input: asciidoctor/attributes_test_normal_substitutions_are_performed_once_on_single_quoted_named_title_attribute.adoc
        // Expected Go AST:
        // var attributesTestNormalSubstitutionsArePerformedOnceOnSingleQuotedNamedTitleAttribute =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.NamedAttribute{
        // 					Name: "title",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "*title*",
        // 						},
        // 					},
        // 					Quote: 1,
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
    fun `attribute list may not begin with space`() {
        // Input: asciidoctor/attributes_test_attribute_list_may_not_begin_with_space.adoc
        // Expected Go AST:
        // var attributesTestAttributeListMayNotBeginWithSpace =
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
    fun `attribute list may begin with comma`() {
        // Input: asciidoctor/attributes_test_attribute_list_may_begin_with_comma.adoc
        // Expected Go AST:
        // var attributesTestAttributeListMayBeginWithComma =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "[, author, source]",
        // 		},
        // 		&asciidoc.NewLine{},
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
    fun `first attribute in list may be double quoted`() {
        // Input: asciidoctor/attributes_test_first_attribute_in_list_may_be_double_quoted.adoc
        // Expected Go AST:
        // var attributesTestFirstAttributeInListMayBeDoubleQuoted =
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
        // 							Value: "author",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      2,
        // 					ImpliedName: "",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "source",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.NamedAttribute{
        // 					Name: "role",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "famous",
        // 						},
        // 					},
        // 					Quote: 2,
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
    fun `first attribute in list may be single quoted`() {
        // Input: asciidoctor/attributes_test_first_attribute_in_list_may_be_single_quoted.adoc
        // Expected Go AST:
        // var attributesTestFirstAttributeInListMayBeSingleQuoted =
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
        // 							Value: "author",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      2,
        // 					ImpliedName: "",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "source",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.NamedAttribute{
        // 					Name: "role",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "famous",
        // 						},
        // 					},
        // 					Quote: 1,
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
    fun `attribute with value None without quotes is ignored`() {
        // Input: asciidoctor/attributes_test_attribute_with_value_none_without_quotes_is_ignored.adoc
        // Expected Go AST:
        // var attributesTestAttributeWithValueNoneWithoutQuotesIsIgnored =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.NamedAttribute{
        // 					Name: "id",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "None",
        // 						},
        // 					},
        // 					Quote: 0,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "paragraph",
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
    fun `role? returns true if role is assigned`() {
        // Input: asciidoctor/attributes_test_role_returns_true_if_role_is_assigned.adoc
        // Expected Go AST:
        // var attributesTestRoleReturnsTrueIfRoleIsAssigned =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.NamedAttribute{
        // 					Name: "role",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "lead",
        // 						},
        // 					},
        // 					Quote: 2,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "A paragraph",
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
    fun `role? does not return true if role attribute is set on document`() {
        // Input: asciidoctor/attributes_test_role_does_not_return_true_if_role_attribute_is_set_on_document.adoc
        // Expected Go AST:
        // var attributesTestRoleDoesNotReturnTrueIfRoleAttributeIsSetOnDocument =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "role",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "lead",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "A paragraph",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `role? can check for exact role name match`() {
        // Input: asciidoctor/attributes_test_role_can_check_for_exact_role_name_match.adoc
        // Expected Go AST:
        // var attributesTestRoleCanCheckForExactRoleNameMatch =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.NamedAttribute{
        // 					Name: "role",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "lead",
        // 						},
        // 					},
        // 					Quote: 2,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "A paragraph",
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
    fun `has_role? can check for presence of role name`() {
        // Input: asciidoctor/attributes_test_has_role_can_check_for_presence_of_role_name.adoc
        // Expected Go AST:
        // var attributesTestHasRoleCanCheckForPresenceOfRoleName =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.NamedAttribute{
        // 					Name: "role",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "lead abstract",
        // 						},
        // 					},
        // 					Quote: 2,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "A paragraph",
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
    fun `has_role? does not look for role defined as document attribute`() {
        // Input: asciidoctor/attributes_test_has_role_does_not_look_for_role_defined_as_document_attribute.adoc
        // Expected Go AST:
        // var attributesTestHasRoleDoesNotLookForRoleDefinedAsDocumentAttribute =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "role",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "lead abstract",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "A paragraph",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `roles returns array of role names`() {
        // Input: asciidoctor/attributes_test_roles_returns_array_of_role_names.adoc
        // Expected Go AST:
        // var attributesTestRolesReturnsArrayOfRoleNames =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.NamedAttribute{
        // 					Name: "role",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "story lead",
        // 						},
        // 					},
        // 					Quote: 2,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "A paragraph",
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
    fun `roles returns empty array if role attribute is not set`() {
        // Input: asciidoctor/attributes_test_roles_returns_empty_array_if_role_attribute_is_not_set.adoc
        // Expected Go AST:
        // var attributesTestRolesReturnsEmptyArrayIfRoleAttributeIsNotSet =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "role",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "story lead",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "A paragraph",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `roles= sets the role attribute on the node`() {
        // Input: asciidoctor/attributes_test_roles=_sets_the_role_attribute_on_the_node.adoc
        // Expected Go AST:
        // var attributesTestRolesSetsTheRoleAttributeOnTheNode =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "lead",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "role=\"lead\"",
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
        // 							&asciidoc.UserAttributeReference{
        // 								Value: "lead",
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
        // 					Value: "A paragraph",
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
    fun `id, role and options attributes can be specified on block style using shorthand syntax`() {
        // Input: asciidoctor/attributes_test_id_role_and_options_attributes_can_be_specified_on_block_style_using_shorthand_syntax.adoc
        // Expected Go AST:
        // var attributesTestIdRoleAndOptionsAttributesCanBeSpecifiedOnBlockStyleUsingShorthandSyntax =
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
        // 					ID: &asciidoc.ShorthandID{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "first",
        // 							},
        // 						},
        // 					},
        // 					Roles: []*asciidoc.ShorthandRole{
        // 						&asciidoc.ShorthandRole{
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "lead",
        // 								},
        // 							},
        // 						},
        // 					},
        // 					Options: []*asciidoc.ShorthandOption{
        // 						&asciidoc.ShorthandOption{
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "step",
        // 								},
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "A literal paragraph.",
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
    fun `id, role and options attributes can be specified using shorthand syntax on block style using multiple block attribute lines`() {
        // Input: asciidoctor/attributes_test_id_role_and_options_attributes_can_be_specified_using_shorthand_syntax_on_block_style_using_multiple_block_attribute_lines.adoc
        // Expected Go AST:
        // var attributesTestIdRoleAndOptionsAttributesCanBeSpecifiedUsingShorthandSyntaxOnBlockStyleUsingMultipleBlockAttributeLines =
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
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      1,
        // 					ImpliedName: "",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "#first",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      2,
        // 					ImpliedName: "",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: ".lead",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      3,
        // 					ImpliedName: "",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "%step",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "A literal paragraph.",
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
    fun `multiple roles and options can be specified in block style using shorthand syntax`() {
        // Input: asciidoctor/attributes_test_multiple_roles_and_options_can_be_specified_in_block_style_using_shorthand_syntax.adoc
        // Expected Go AST:
        // var attributesTestMultipleRolesAndOptionsCanBeSpecifiedInBlockStyleUsingShorthandSyntax =
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
        // 									Value: "role1",
        // 								},
        // 							},
        // 						},
        // 						&asciidoc.ShorthandRole{
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "role2",
        // 								},
        // 							},
        // 						},
        // 					},
        // 					Options: []*asciidoc.ShorthandOption{
        // 						&asciidoc.ShorthandOption{
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "option1",
        // 								},
        // 							},
        // 						},
        // 						&asciidoc.ShorthandOption{
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "option2",
        // 								},
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Text",
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
    fun `options specified using shorthand syntax on block style across multiple lines should be additive`() {
        // Input: asciidoctor/attributes_test_options_specified_using_shorthand_syntax_on_block_style_across_multiple_lines_should_be_additive.adoc
        // Expected Go AST:
        // var attributesTestOptionsSpecifiedUsingShorthandSyntaxOnBlockStyleAcrossMultipleLinesShouldBeAdditive =
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
        // 									Value: "option1",
        // 								},
        // 							},
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      1,
        // 					ImpliedName: "",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "%option2",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Text",
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
    fun `roles specified using shorthand syntax on block style across multiple lines should be additive`() {
        // Input: asciidoctor/attributes_test_roles_specified_using_shorthand_syntax_on_block_style_across_multiple_lines_should_be_additive.adoc
        // Expected Go AST:
        // var attributesTestRolesSpecifiedUsingShorthandSyntaxOnBlockStyleAcrossMultipleLinesShouldBeAdditive =
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
        // 									Value: "role1",
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
        // 							Value: ".role2.role3",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Text",
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
    fun `setting a role using the role attribute replaces any existing roles`() {
        // Input: asciidoctor/attributes_test_setting_a_role_using_the_role_attribute_replaces_any_existing_roles.adoc
        // Expected Go AST:
        // var attributesTestSettingARoleUsingTheRoleAttributeReplacesAnyExistingRoles =
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
        // 									Value: "role1",
        // 								},
        // 							},
        // 						},
        // 					},
        // 					Options: nil,
        // 				},
        // 				&asciidoc.NamedAttribute{
        // 					Name: "role",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "role2",
        // 						},
        // 					},
        // 					Quote: 0,
        // 				},
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      1,
        // 					ImpliedName: "",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: ".role3",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Text",
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
    fun `setting a role using the shorthand syntax on block style should not clear the ID`() {
        // Input: asciidoctor/attributes_test_setting_a_role_using_the_shorthand_syntax_on_block_style_should_not_clear_the_id.adoc
        // Expected Go AST:
        // var attributesTestSettingARoleUsingTheShorthandSyntaxOnBlockStyleShouldNotClearTheId =
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
        // 								Value: "id",
        // 							},
        // 						},
        // 					},
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 				&asciidoc.PositionalAttribute{
        // 					Offset:      1,
        // 					ImpliedName: "",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: ".role",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Text",
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
    fun `a role can be added using add_role when the node has no roles`() {
        // Input: asciidoctor/attributes_test_a_role_can_be_added_using_add_role_when_the_node_has_no_roles.adoc
        // Expected Go AST:
        // var attributesTestARoleCanBeAddedUsingAddRoleWhenTheNodeHasNoRoles =
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
        // 									Value: "role1",
        // 								},
        // 							},
        // 						},
        // 					},
        // 					Options: nil,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "A normal paragraph",
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
    fun `a role is not added using add_role if the node already has that role`() {
        // Input: asciidoctor/attributes_test_a_role_is_not_added_using_add_role_if_the_node_already_has_that_role.adoc
        // Expected Go AST:
        // var attributesTestARoleIsNotAddedUsingAddRoleIfTheNodeAlreadyHasThatRole =
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
        // 									Value: "role1",
        // 								},
        // 							},
        // 						},
        // 					},
        // 					Options: nil,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "A normal paragraph",
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
    fun `an existing role can be removed using remove_role`() {
        // Input: asciidoctor/attributes_test_an_existing_role_can_be_removed_using_remove_role.adoc
        // Expected Go AST:
        // var attributesTestAnExistingRoleCanBeRemovedUsingRemoveRole =
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
        // 									Value: "role1",
        // 								},
        // 							},
        // 						},
        // 						&asciidoc.ShorthandRole{
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "role2",
        // 								},
        // 							},
        // 						},
        // 					},
        // 					Options: nil,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "A normal paragraph",
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
    fun `roles are removed when last role is removed using remove_role`() {
        // Input: asciidoctor/attributes_test_roles_are_removed_when_last_role_is_removed_using_remove_role.adoc
        // Expected Go AST:
        // var attributesTestRolesAreRemovedWhenLastRoleIsRemovedUsingRemoveRole =
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
        // 									Value: "role1",
        // 								},
        // 							},
        // 						},
        // 					},
        // 					Options: nil,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "A normal paragraph",
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
    fun `roles are not changed when a non-existent role is removed using remove_role`() {
        // Input: asciidoctor/attributes_test_roles_are_not_changed_when_a_non_existent_role_is_removed_using_remove_role.adoc
        // Expected Go AST:
        // var attributesTestRolesAreNotChangedWhenANonExistentRoleIsRemovedUsingRemoveRole =
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
        // 									Value: "role1",
        // 								},
        // 							},
        // 						},
        // 					},
        // 					Options: nil,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "A normal paragraph",
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
    fun `roles are not changed when using remove_role if the node has no roles`() {
        // Input: asciidoctor/attributes_test_roles_are_not_changed_when_using_remove_role_if_the_node_has_no_roles.adoc
        // Expected Go AST:
        // var attributesTestRolesAreNotChangedWhenUsingRemoveRoleIfTheNodeHasNoRoles =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "checked",
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
        // 			Checklist: 2,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `id and role attributes can be specified on section style using shorthand syntax`() {
        // Input: asciidoctor/attributes_test_id_and_role_attributes_can_be_specified_on_section_style_using_shorthand_syntax.adoc
        // Expected Go AST:
        // var attributesTestIdAndRoleAttributesCanBeSpecifiedOnSectionStyleUsingShorthandSyntax =
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
        // 								Value: "dedication",
        // 							},
        // 						},
        // 					},
        // 					ID: &asciidoc.ShorthandID{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "dedication",
        // 							},
        // 						},
        // 					},
        // 					Roles: []*asciidoc.ShorthandRole{
        // 						&asciidoc.ShorthandRole{
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "small",
        // 								},
        // 							},
        // 						},
        // 					},
        // 					Options: nil,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Content.",
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
    fun `id attribute specified using shorthand syntax should not create a special section`() {
        // Input: asciidoctor/attributes_test_id_attribute_specified_using_shorthand_syntax_should_not_create_a_special_section.adoc
        // Expected Go AST:
        // var attributesTestIdAttributeSpecifiedUsingShorthandSyntaxShouldNotCreateASpecialSection =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Section{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: nil,
        // 					ID: &asciidoc.ShorthandID{
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.String{
        // 								Value: "idname",
        // 							},
        // 						},
        // 					},
        // 					Roles:   nil,
        // 					Options: nil,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
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
    fun `Block attributes are additive`() {
        // Input: asciidoctor/attributes_test_block_attributes_are_additive.adoc
        // Expected Go AST:
        // var attributesTestBlockAttributesAreAdditive =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.NamedAttribute{
        // 					Name: "id",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "foo",
        // 						},
        // 					},
        // 					Quote: 1,
        // 				},
        // 				&asciidoc.NamedAttribute{
        // 					Name: "role",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "lead",
        // 						},
        // 					},
        // 					Quote: 1,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "A paragraph.",
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
    fun `Last wins for id attribute`() {
        // Input: asciidoctor/attributes_test_last_wins_for_id_attribute.adoc
        // Expected Go AST:
        // var attributesTestLastWinsForIdAttribute =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Section{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.AnchorAttribute{
        // 					ID: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "bar",
        // 						},
        // 					},
        // 					Label: nil,
        // 				},
        // 				&asciidoc.AnchorAttribute{
        // 					ID: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "foo",
        // 						},
        // 					},
        // 					Label: nil,
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
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.Section{
        // 					AttributeList: asciidoc.AttributeList{
        // 						&asciidoc.AnchorAttribute{
        // 							ID: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "baz",
        // 								},
        // 							},
        // 							Label: nil,
        // 						},
        // 						&asciidoc.NamedAttribute{
        // 							Name: "id",
        // 							Val: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "coolio",
        // 								},
        // 							},
        // 							Quote: 1,
        // 						},
        // 					},
        // 					Elements: nil,
        // 					Title: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Section",
        // 						},
        // 					},
        // 					Level: 2,
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
    fun `trailing block attributes transfer to the following section`() {
        // Input: asciidoctor/attributes_test_trailing_block_attributes_transfer_to_the_following_section.adoc
        // Expected Go AST:
        // var attributesTestTrailingBlockAttributesTransferToTheFollowingSection =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Section{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.AnchorAttribute{
        // 					ID: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "one",
        // 						},
        // 					},
        // 					Label: nil,
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
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.Paragraph{
        // 					AttributeList: asciidoc.AttributeList{
        // 						&asciidoc.AnchorAttribute{
        // 							ID: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "sub",
        // 								},
        // 							},
        // 							Label: nil,
        // 						},
        // 					},
        // 					Elements:   asciidoc.Elements{},
        // 					Admonition: 0,
        // 				},
        // 				&asciidoc.SingleLineComment{
        // 					Value: " try to mess this up!",
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
        // 							Value: "paragraph",
        // 						},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.EmptyLine{
        // 							Text: "",
        // 						},
        // 						&asciidoc.Paragraph{
        // 							AttributeList: asciidoc.AttributeList{
        // 								&asciidoc.NamedAttribute{
        // 									Name: "role",
        // 									Val: asciidoc.Elements{
        // 										&asciidoc.String{
        // 											Value: "classy",
        // 										},
        // 									},
        // 									Quote: 1,
        // 								},
        // 							},
        // 							Elements:   asciidoc.Elements{},
        // 							Admonition: 0,
        // 						},
        // 						&asciidoc.EmptyLine{
        // 							Text: "",
        // 						},
        // 						&asciidoc.MultiLineComment{
        // 							Delimiter: asciidoc.Delimiter{
        // 								Type:   2,
        // 								Length: 4,
        // 							},
        // 							LineList: asciidoc.LineList{
        // 								"block comment",
        // 							},
        // 						},
        // 						&asciidoc.EmptyLine{
        // 							Text: "",
        // 						},
        // 					},
        // 					Title: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Sub-section",
        // 						},
        // 					},
        // 					Level: 2,
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Section One",
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
        // 					Value: "content",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Section Two",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

}
