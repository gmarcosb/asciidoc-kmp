package com.kmplibs.asciidoc.integration

import com.kmplibs.asciidoc.*
import kotlin.test.Test
import kotlin.test.Ignore

class ReaderTest {

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should prepare lines from Array data`() {
        // Input: asciidoctor/reader_test_should_prepare_lines_from_array_data.adoc
        // Expected Go AST:
        // var readerTestShouldPrepareLinesFromArrayData =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "lines",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "        This is one paragraph.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 0,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "        This is another paragraph.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `Read lines until until blank line`() {
        // Input: asciidoctor/reader_test_read_lines_until_until_blank_line.adoc
        // Expected Go AST:
        // var readerTestReadLinesUntilUntilBlankLine =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "lines",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "        This is one paragraph.",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 0,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "        This is another paragraph.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `Read lines until until blank line preserving last line`() {
        // Input: asciidoctor/reader_test_read_lines_until_until_blank_line_preserving_last_line.adoc
        // Expected Go AST:
        // var readerTestReadLinesUntilUntilBlankLinePreservingLastLine =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.String{
        // 			Value: ".split Asciidoctor::LF",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "        This is one paragraph.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "        This is another paragraph.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `Read lines until until condition is true`() {
        // Input: asciidoctor/reader_test_read_lines_until_until_condition_is_true.adoc
        // Expected Go AST:
        // var readerTestReadLinesUntilUntilConditionIsTrue =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.String{
        // 			Value: ".split Asciidoctor::LF",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "        --",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "        This is one paragraph inside the block.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "        This is another paragraph inside the block.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "        --",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "        This is a paragraph outside the block.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `Read lines until until condition is true, taking last line`() {
        // Input: asciidoctor/reader_test_read_lines_until_until_condition_is_true_taking_last_line.adoc
        // Expected Go AST:
        // var readerTestReadLinesUntilUntilConditionIsTrueTakingLastLine =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.String{
        // 			Value: ".split Asciidoctor::LF",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "        --",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "        This is one paragraph inside the block.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "        This is another paragraph inside the block.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "        --",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "        This is a paragraph outside the block.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `Read lines until until condition is true, taking and preserving last line`() {
        // Input: asciidoctor/reader_test_read_lines_until_until_condition_is_true_taking_and_preserving_last_line.adoc
        // Expected Go AST:
        // var readerTestReadLinesUntilUntilConditionIsTrueTakingAndPreservingLastLine =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.String{
        // 			Value: ".split Asciidoctor::LF",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "        --",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "        This is one paragraph inside the block.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "        This is another paragraph inside the block.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "        --",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "        This is a paragraph outside the block.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `read lines until terminator`() {
        // Input: asciidoctor/reader_test_read_lines_until_terminator.adoc
        // Expected Go AST:
        // var readerTestReadLinesUntilTerminator =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "lines",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "        ****",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "        captured",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 0,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "        also captured",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "        ****",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "        not captured",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should flag reader as unterminated if reader reaches end of source without finding terminator`() {
        // Input: asciidoctor/reader_test_should_flag_reader_as_unterminated_if_reader_reaches_end_of_source_without_finding_terminator.adoc
        // Expected Go AST:
        // var readerTestShouldFlagReaderAsUnterminatedIfReaderReachesEndOfSourceWithoutFindingTerminator =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "lines",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "        ****",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "        captured",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 0,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "        also captured",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "        captured yet again",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not skip front matter by default`() {
        // Input: asciidoctor/reader_test_should_not_skip_front_matter_by_default.adoc
        // Expected Go AST:
        // var readerTestShouldNotSkipFrontMatterByDefault =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.ThematicBreak{
        // 			AttributeList: nil,
        // 		},
        // 		&asciidoc.String{
        // 			Value: "layout: post",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "title: Document Title",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "author: username",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "tags: [ first, second ]",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.ThematicBreak{
        // 			AttributeList: nil,
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
        // 					Value: "preamble",
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
    fun `should not skip front matter if ending delimiter is not found`() {
        // Input: asciidoctor/reader_test_should_not_skip_front_matter_if_ending_delimiter_is_not_found.adoc
        // Expected Go AST:
        // var readerTestShouldNotSkipFrontMatterIfEndingDelimiterIsNotFound =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.ThematicBreak{
        // 			AttributeList: nil,
        // 		},
        // 		&asciidoc.String{
        // 			Value: "title: Document Title",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "tags: [ first, second ]",
        // 		},
        // 		&asciidoc.NewLine{},
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
        // 					Value: "preamble",
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
    fun `should skip front matter if specified by skip-front-matter attribute`() {
        // Input: asciidoctor/reader_test_should_skip_front_matter_if_specified_by_skip_front_matter_attribute.adoc
        // Expected Go AST:
        // var readerTestShouldSkipFrontMatterIfSpecifiedBySkipFrontMatterAttribute =
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
        // 					Value: "        layout: post",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "        title: Document Title",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "        author: username",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "        tags: [ first, second ]",
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
    fun `should skip TOML front matter if specified by skip-front-matter attribute`() {
        // Input: asciidoctor/reader_test_should_skip_toml_front_matter_if_specified_by_skip_front_matter_attribute.adoc
        // Expected Go AST:
        // var readerTestShouldSkipTomlFrontMatterIfSpecifiedBySkipFrontMatterAttribute =
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
        // 					Value: "        layout = 'post'",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "        title = 'Document Title'",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "        author = 'username'",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "        tags = ['first', 'second']",
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
    fun `should not track include in catalog for non-AsciiDoc include files`() {
        // Input: asciidoctor/reader_test_should_not_track_include_in_catalog_for_non_ascii_doc_include_files.adoc
        // Expected Go AST:
        // var readerTestShouldNotTrackIncludeInCatalogForNonAsciiDocIncludeFiles =
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
        // 				"include::fixtures/circle.svg[]",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `include directive should resolve file with spaces in name`() {
        // Input: asciidoctor/reader_test_include_directive_should_resolve_file_with_spaces_in_name.adoc
        // Expected Go AST:
        // var readerTestIncludeDirectiveShouldResolveFileWithSpacesInName =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "target",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "not-a-file.adoc + \\",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.Link{
        // 			AttributeList: nil,
        // 			URL: asciidoc.URL{
        // 				Scheme: "http://",
        // 				Path: asciidoc.Elements{
        // 					&asciidoc.String{
        // 						Value: "example.org/team.adoc",
        // 					},
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.FileInclude{
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.UserAttributeReference{
        // 					Value: "target",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `include directive should resolve file relative to current include`() {
        // Input: asciidoctor/reader_test_include_directive_should_resolve_file_relative_to_current_include.adoc
        // Expected Go AST:
        // var readerTestIncludeDirectiveShouldResolveFileRelativeToCurrentInclude =
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
        // 				"include::fixtures/data.tsv[]",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should fail to read include file if not UTF-8 encoded and encoding is not specified`() {
        // Input: asciidoctor/reader_test_should_fail_to_read_include_file_if_not_utf_8_encoded_and_encoding_is_not_specified.adoc
        // Expected Go AST:
        // var readerTestShouldFailToReadIncludeFileIfNotUtf8EncodedAndEncodingIsNotSpecified =
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
        // 				"include::fixtures/iso-8859-1.txt[]",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should ignore encoding attribute if value is not a valid encoding`() {
        // Input: asciidoctor/reader_test_should_ignore_encoding_attribute_if_value_is_not_a_valid_encoding.adoc
        // Expected Go AST:
        // var readerTestShouldIgnoreEncodingAttributeIfValueIsNotAValidEncoding =
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
        // 				"include::fixtures/encoding.adoc[tag=romé,encoding=iso-1000-1]",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should use encoding specified by encoding attribute when reading include file`() {
        // Input: asciidoctor/reader_test_should_use_encoding_specified_by_encoding_attribute_when_reading_include_file.adoc
        // Expected Go AST:
        // var readerTestShouldUseEncodingSpecifiedByEncodingAttributeWhenReadingIncludeFile =
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
        // 				"include::fixtures/iso-8859-1.txt[encoding=iso-8859-1]",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `unresolved target referenced by include directive is skipped when optional option is set`() {
        // Input: asciidoctor/reader_test_unresolved_target_referenced_by_include_directive_is_skipped_when_optional_option_is_set.adoc
        // Expected Go AST:
        // var readerTestUnresolvedTargetReferencedByIncludeDirectiveIsSkippedWhenOptionalOptionIsSet =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.FileInclude{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.NamedAttribute{
        // 					Name: "opts",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "optional",
        // 						},
        // 					},
        // 					Quote: 0,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "fixtures/",
        // 				},
        // 				&asciidoc.UserAttributeReference{
        // 					Value: "no-such-file",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "trailing content",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should skip include directive that references missing file if optional option is set`() {
        // Input: asciidoctor/reader_test_should_skip_include_directive_that_references_missing_file_if_optional_option_is_set.adoc
        // Expected Go AST:
        // var readerTestShouldSkipIncludeDirectiveThatReferencesMissingFileIfOptionalOptionIsSet =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.FileInclude{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.NamedAttribute{
        // 					Name: "opts",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "optional",
        // 						},
        // 					},
        // 					Quote: 0,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "fixtures/no-such-file.adoc",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "trailing content",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should replace include directive that references missing file with message`() {
        // Input: asciidoctor/reader_test_should_replace_include_directive_that_references_missing_file_with_message.adoc
        // Expected Go AST:
        // var readerTestShouldReplaceIncludeDirectiveThatReferencesMissingFileWithMessage =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.FileInclude{
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "fixtures/no-such-file.adoc",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "trailing content",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `nested include directives are resolved relative to current file`() {
        // Input: asciidoctor/reader_test_nested_include_directives_are_resolved_relative_to_current_file.adoc
        // Expected Go AST:
        // var readerTestNestedIncludeDirectivesAreResolvedRelativeToCurrentFile =
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
        // 				"include::fixtures/outer-include.adoc[]",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `include directive supports selecting lines by line number`() {
        // Input: asciidoctor/reader_test_include_directive_supports_selecting_lines_by_line_number.adoc
        // Expected Go AST:
        // var readerTestIncludeDirectiveSupportsSelectingLinesByLineNumber =
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
        // 				"include::fixtures/include-file.adoc[lines=]",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `include directive ignores lines attribute with invalid range`() {
        // Input: asciidoctor/reader_test_include_directive_ignores_lines_attribute_with_invalid_range.adoc
        // Expected Go AST:
        // var readerTestIncludeDirectiveIgnoresLinesAttributeWithInvalidRange =
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
        // 				"include::fixtures/include-file.adoc[lines=10..5]",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `include directive supports selecting lines by tag in file that has CRLF line endings`() {
        // Input: asciidoctor/reader_test_include_directive_supports_selecting_lines_by_tag_in_file_that_has_crlf_line_endings.adoc
        // Expected Go AST:
        // var readerTestIncludeDirectiveSupportsSelectingLinesByTagInFileThatHasCrlfLineEndings =
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
        // 				"include::fixtures/include-file.adoc[tags=snippet]",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `include directive skips lines inside tag which is negated`() {
        // Input: asciidoctor/reader_test_include_directive_skips_lines_inside_tag_which_is_negated.adoc
        // Expected Go AST:
        // var readerTestIncludeDirectiveSkipsLinesInsideTagWhichIsNegated =
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
        // 				"include::fixtures/tagged-class-enclosed.rb[tags=all;!bark]",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `include directive selects all lines without a tag directive when value is double asterisk`() {
        // Input: asciidoctor/reader_test_include_directive_selects_all_lines_without_a_tag_directive_when_value_is_double_asterisk.adoc
        // Expected Go AST:
        // var readerTestIncludeDirectiveSelectsAllLinesWithoutATagDirectiveWhenValueIsDoubleAsterisk =
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
        // 				"include::fixtures/tagged-class.rb[tags=**]",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `include directive selects all lines except lines inside tag which is negated when value starts with double asterisk`() {
        // Input: asciidoctor/reader_test_include_directive_selects_all_lines_except_lines_inside_tag_which_is_negated_when_value_starts_with_double_asterisk.adoc
        // Expected Go AST:
        // var readerTestIncludeDirectiveSelectsAllLinesExceptLinesInsideTagWhichIsNegatedWhenValueStartsWithDoubleAsterisk =
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
        // 				"include::fixtures/tagged-class.rb[tags=**;!bark]",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `include directive selects all lines, including lines inside nested tags, except lines inside tag which is negated when value starts with double asterisk`() {
        // Input: asciidoctor/reader_test_include_directive_selects_all_lines_including_lines_inside_nested_tags_except_lines_inside_tag_which_is_negated_when_value_starts_with_double_asterisk.adoc
        // Expected Go AST:
        // var readerTestIncludeDirectiveSelectsAllLinesIncludingLinesInsideNestedTagsExceptLinesInsideTagWhichIsNegatedWhenValueStartsWithDoubleAsterisk =
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
        // 				"include::fixtures/tagged-class.rb[tags=**;!init]",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `include directive selects all lines outside of tags when value is double asterisk followed by negated wildcard`() {
        // Input: asciidoctor/reader_test_include_directive_selects_all_lines_outside_of_tags_when_value_is_double_asterisk_followed_by_negated_wildcard.adoc
        // Expected Go AST:
        // var readerTestIncludeDirectiveSelectsAllLinesOutsideOfTagsWhenValueIsDoubleAsteriskFollowedByNegatedWildcard =
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
        // 				"include::fixtures/tagged-class.rb[tags=**;!*]",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `include directive skips all tagged regions when value of tags attribute is negated wildcard`() {
        // Input: asciidoctor/reader_test_include_directive_skips_all_tagged_regions_when_value_of_tags_attribute_is_negated_wildcard.adoc
        // Expected Go AST:
        // var readerTestIncludeDirectiveSkipsAllTaggedRegionsWhenValueOfTagsAttributeIsNegatedWildcard =
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
        // 				"include::fixtures/tagged-class.rb[tags=!*]",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `include directive selects all lines except for lines containing tag directive if value is double asterisk followed by nested tag names`() {
        // Input: asciidoctor/reader_test_include_directive_selects_all_lines_except_for_lines_containing_tag_directive_if_value_is_double_asterisk_followed_by_nested_tag_names.adoc
        // Expected Go AST:
        // var readerTestIncludeDirectiveSelectsAllLinesExceptForLinesContainingTagDirectiveIfValueIsDoubleAsteriskFollowedByNestedTagNames =
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
        // 				"include::fixtures/tagged-class.rb[tags=**;bark-beagle;bark-all]",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `include directive selects all lines except for lines containing tag directive when value is double asterisk followed by outer tag name`() {
        // Input: asciidoctor/reader_test_include_directive_selects_all_lines_except_for_lines_containing_tag_directive_when_value_is_double_asterisk_followed_by_outer_tag_name.adoc
        // Expected Go AST:
        // var readerTestIncludeDirectiveSelectsAllLinesExceptForLinesContainingTagDirectiveWhenValueIsDoubleAsteriskFollowedByOuterTagName =
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
        // 				"include::fixtures/tagged-class.rb[tags=**;bark]",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `include directive selects all lines inside unspecified tags when value is negated double asterisk followed by negated tags`() {
        // Input: asciidoctor/reader_test_include_directive_selects_all_lines_inside_unspecified_tags_when_value_is_negated_double_asterisk_followed_by_negated_tags.adoc
        // Expected Go AST:
        // var readerTestIncludeDirectiveSelectsAllLinesInsideUnspecifiedTagsWhenValueIsNegatedDoubleAsteriskFollowedByNegatedTags =
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
        // 				"include::fixtures/tagged-class.rb[tags=!**;!init]",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `include directive selects all lines except tag which is negated when value only contains negated tag`() {
        // Input: asciidoctor/reader_test_include_directive_selects_all_lines_except_tag_which_is_negated_when_value_only_contains_negated_tag.adoc
        // Expected Go AST:
        // var readerTestIncludeDirectiveSelectsAllLinesExceptTagWhichIsNegatedWhenValueOnlyContainsNegatedTag =
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
        // 				"include::fixtures/tagged-class.rb[tag=!bark]",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `include directive selects all lines except tags which are negated when value only contains negated tags`() {
        // Input: asciidoctor/reader_test_include_directive_selects_all_lines_except_tags_which_are_negated_when_value_only_contains_negated_tags.adoc
        // Expected Go AST:
        // var readerTestIncludeDirectiveSelectsAllLinesExceptTagsWhichAreNegatedWhenValueOnlyContainsNegatedTags =
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
        // 				"include::fixtures/tagged-class.rb[tags=!bark;!init]",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should recognize tag wildcard if not at start of tags list`() {
        // Input: asciidoctor/reader_test_should_recognize_tag_wildcard_if_not_at_start_of_tags_list.adoc
        // Expected Go AST:
        // var readerTestShouldRecognizeTagWildcardIfNotAtStartOfTagsList =
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
        // 				"include::fixtures/tagged-class.rb[tags=init;**;*;!bark-other]",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `include directive selects lines between tags when value of tags attribute is wildcard`() {
        // Input: asciidoctor/reader_test_include_directive_selects_lines_between_tags_when_value_of_tags_attribute_is_wildcard.adoc
        // Expected Go AST:
        // var readerTestIncludeDirectiveSelectsLinesBetweenTagsWhenValueOfTagsAttributeIsWildcard =
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
        // 				"include::fixtures/tagged-class.rb[tags=*]",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `include directive selects lines inside tags when value of tags attribute is wildcard and tag surrounds content`() {
        // Input: asciidoctor/reader_test_include_directive_selects_lines_inside_tags_when_value_of_tags_attribute_is_wildcard_and_tag_surrounds_content.adoc
        // Expected Go AST:
        // var readerTestIncludeDirectiveSelectsLinesInsideTagsWhenValueOfTagsAttributeIsWildcardAndTagSurroundsContent =
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
        // 				"include::fixtures/tagged-class-enclosed.rb[tags=*]",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `include directive selects lines inside all tags except tag which is negated when value of tags attribute is wildcard followed by negated tag`() {
        // Input: asciidoctor/reader_test_include_directive_selects_lines_inside_all_tags_except_tag_which_is_negated_when_value_of_tags_attribute_is_wildcard_followed_by_negated_tag.adoc
        // Expected Go AST:
        // var readerTestIncludeDirectiveSelectsLinesInsideAllTagsExceptTagWhichIsNegatedWhenValueOfTagsAttributeIsWildcardFollowedByNegatedTag =
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
        // 				"include::fixtures/tagged-class-enclosed.rb[tags=*;!init]",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `include directive includes regions outside tags and inside specified tags when value begins with negated wildcard`() {
        // Input: asciidoctor/reader_test_include_directive_includes_regions_outside_tags_and_inside_specified_tags_when_value_begins_with_negated_wildcard.adoc
        // Expected Go AST:
        // var readerTestIncludeDirectiveIncludesRegionsOutsideTagsAndInsideSpecifiedTagsWhenValueBeginsWithNegatedWildcard =
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
        // 				"include::fixtures/tagged-class.rb[tags=!*;bark]",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `include directive selects lines inside tag except for lines inside nested tags when tag is preceded by negated double asterisk and negated wildcard`() {
        // Input: asciidoctor/reader_test_include_directive_selects_lines_inside_tag_except_for_lines_inside_nested_tags_when_tag_is_preceded_by_negated_double_asterisk_and_negated_wildcard.adoc
        // Expected Go AST:
        // var readerTestIncludeDirectiveSelectsLinesInsideTagExceptForLinesInsideNestedTagsWhenTagIsPrecededByNegatedDoubleAsteriskAndNegatedWildcard =
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
        // 				"include::fixtures/tagged-class.rb[tags=!**;!*;bark]",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `include directive does not select lines inside tag that has been included then excluded`() {
        // Input: asciidoctor/reader_test_include_directive_does_not_select_lines_inside_tag_that_has_been_included_then_excluded.adoc
        // Expected Go AST:
        // var readerTestIncludeDirectiveDoesNotSelectLinesInsideTagThatHasBeenIncludedThenExcluded =
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
        // 				"include::fixtures/tagged-class.rb[tags=!*;init;!init]",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `include directive selects lines inside specified tag and ignores lines inside a negated tag`() {
        // Input: asciidoctor/reader_test_include_directive_selects_lines_inside_specified_tag_and_ignores_lines_inside_a_negated_tag.adoc
        // Expected Go AST:
        // var readerTestIncludeDirectiveSelectsLinesInsideSpecifiedTagAndIgnoresLinesInsideANegatedTag =
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
        // 					Quote: 0,
        // 				},
        // 			},
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   5,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"include::fixtures/tagged-class.rb[tags=bark;!bark-other]",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not warn if specified negated tag is not found in include file`() {
        // Input: asciidoctor/reader_test_should_not_warn_if_specified_negated_tag_is_not_found_in_include_file.adoc
        // Expected Go AST:
        // var readerTestShouldNotWarnIfSpecifiedNegatedTagIsNotFoundInIncludeFile =
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
        // 				"include::fixtures/tagged-class-enclosed.rb[tag=!no-such-tag]",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should warn if specified tags are not found in include file`() {
        // Input: asciidoctor/reader_test_should_warn_if_specified_tags_are_not_found_in_include_file.adoc
        // Expected Go AST:
        // var readerTestShouldWarnIfSpecifiedTagsAreNotFoundInIncludeFile =
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
        // 				"include::fixtures/include-file.adoc[tags=no-such-tag-b;no-such-tag-a]",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not warn if specified negated tags are not found in include file`() {
        // Input: asciidoctor/reader_test_should_not_warn_if_specified_negated_tags_are_not_found_in_include_file.adoc
        // Expected Go AST:
        // var readerTestShouldNotWarnIfSpecifiedNegatedTagsAreNotFoundInIncludeFile =
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
        // 				"include::fixtures/tagged-class-enclosed.rb[tags=all;!no-such-tag;!unknown-tag]",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should warn if specified tag in include file is not closed`() {
        // Input: asciidoctor/reader_test_should_warn_if_specified_tag_in_include_file_is_not_closed.adoc
        // Expected Go AST:
        // var readerTestShouldWarnIfSpecifiedTagInIncludeFileIsNotClosed =
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
        // 				"include::fixtures/unclosed-tag.adoc[tag=a]",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should warn if end tag in included file is mismatched`() {
        // Input: asciidoctor/reader_test_should_warn_if_end_tag_in_included_file_is_mismatched.adoc
        // Expected Go AST:
        // var readerTestShouldWarnIfEndTagInIncludedFileIsMismatched =
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
        // 				"include::fixtures/mismatched-end-tag.adoc[tags=a;b]",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should warn if unexpected end tag is found in included file`() {
        // Input: asciidoctor/reader_test_should_warn_if_unexpected_end_tag_is_found_in_included_file.adoc
        // Expected Go AST:
        // var readerTestShouldWarnIfUnexpectedEndTagIsFoundInIncludedFile =
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
        // 				"include::fixtures/unexpected-end-tag.adoc[tags=a]",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `lines attribute takes precedence over tags attribute in include directive`() {
        // Input: asciidoctor/reader_test_lines_attribute_takes_precedence_over_tags_attribute_in_include_directive.adoc
        // Expected Go AST:
        // var readerTestLinesAttributeTakesPrecedenceOverTagsAttributeInIncludeDirective =
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
        // 				"include::fixtures/basic-docinfo.xml[lines=2..3, indent=0]",
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should substitute attribute references in attrlist`() {
        // Input: asciidoctor/reader_test_should_substitute_attribute_references_in_attrlist.adoc
        // Expected Go AST:
        // var readerTestShouldSubstituteAttributeReferencesInAttrlist =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "name-of-tag",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "snippetA",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.FileInclude{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.NamedAttribute{
        // 					Name: "tag",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.UserAttributeReference{
        // 							Value: "name-of-tag",
        // 						},
        // 					},
        // 					Quote: 0,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "fixtures/include-file.adoc",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should fall back to built-in include directive behavior when not handled by include processor`() {
        // Input: asciidoctor/reader_test_should_fall_back_to_built_in_include_directive_behavior_when_not_handled_by_include_processor.adoc
        // Expected Go AST:
        // var readerTestShouldFallBackToBuiltInIncludeDirectiveBehaviorWhenNotHandledByIncludeProcessor =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.String{
        // 			Value: ".split Asciidoctor::LF",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "        = Main Document",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "        preamble",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "        :leveloffset: +1",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "        = Chapter A",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "        content",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "        :leveloffset!:",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `attributes are substituted in target of include directive`() {
        // Input: asciidoctor/reader_test_attributes_are_substituted_in_target_of_include_directive.adoc
        // Expected Go AST:
        // var readerTestAttributesAreSubstitutedInTargetOfIncludeDirective =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "fixturesdir",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "fixtures",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "ext",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "adoc",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.FileInclude{
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.UserAttributeReference{
        // 					Value: "fixturesdir",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "/include-file.",
        // 				},
        // 				&asciidoc.UserAttributeReference{
        // 					Value: "ext",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `line following dropped include is not dropped`() {
        // Input: asciidoctor/reader_test_line_following_dropped_include_is_not_dropped.adoc
        // Expected Go AST:
        // var readerTestLineFollowingDroppedIncludeIsNotDropped =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.FileInclude{
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.UserAttributeReference{
        // 					Value: "foodir",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "/include-file.adoc",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: "yo",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `escaped include directive is left unprocessed`() {
        // Input: asciidoctor/reader_test_escaped_include_directive_is_left_unprocessed.adoc
        // Expected Go AST:
        // var readerTestEscapedIncludeDirectiveIsLeftUnprocessed =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "\\include::fixtures/include-file.adoc[]",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "\\escape preserved here",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `include directive not at start of line is ignored`() {
        // Input: asciidoctor/reader_test_include_directive_not_at_start_of_line_is_ignored.adoc
        // Expected Go AST:
        // var readerTestIncludeDirectiveNotAtStartOfLineIsIgnored =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "max-include-depth",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "1",
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
        // 					Value: "include-file.adoc",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `include directive should be disabled if max include depth has been exceeded`() {
        // Input: asciidoctor/reader_test_include_directive_should_be_disabled_if_max_include_depth_has_been_exceeded.adoc
        // Expected Go AST:
        // var readerTestIncludeDirectiveShouldBeDisabledIfMaxIncludeDepthHasBeenExceeded =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "lines",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "        ////",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "        include::fixtures/no-such-file.adoc[]",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "        ////",
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
    fun `skip_comment_lines should not process lines read`() {
        // Input: asciidoctor/reader_test_skip_comment_lines_should_not_process_lines_read.adoc
        // Expected Go AST:
        // var readerTestSkipCommentLinesShouldNotProcessLinesRead =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "lines",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "        ////",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "        include::fixtures/no-such-file.adoc[]",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "        ////",
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
    fun `process_line returns nil if cursor advanced`() {
        // Input: asciidoctor/reader_test_process_line_returns_nil_if_cursor_advanced.adoc
        // Expected Go AST:
        // var readerTestProcessLineReturnsNilIfCursorAdvanced =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.IfDef{
        // 			Attributes: asciidoc.AttributeNames{
        // 				"asciidoctor",
        // 			},
        // 			Union:  0,
        // 			Inline: false,
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Asciidoctor!",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EndIf{
        // 			Attributes: asciidoc.AttributeNames{
        // 				"asciidoctor",
        // 			},
        // 			Union: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `peek_line advances cursor to next conditional line of content`() {
        // Input: asciidoctor/reader_test_peek_line_advances_cursor_to_next_conditional_line_of_content.adoc
        // Expected Go AST:
        // var readerTestPeekLineAdvancesCursorToNextConditionalLineOfContent =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.IfDef{
        // 			Attributes: asciidoc.AttributeNames{
        // 				"asciidoctor",
        // 			},
        // 			Union:  0,
        // 			Inline: false,
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Asciidoctor!",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EndIf{
        // 			Attributes: asciidoc.AttributeNames{
        // 				"asciidoctor",
        // 			},
        // 			Union: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `peek_lines should preprocess lines if direct is false`() {
        // Input: asciidoctor/reader_test_peek_lines_should_preprocess_lines_if_direct_is_false.adoc
        // Expected Go AST:
        // var readerTestPeekLinesShouldPreprocessLinesIfDirectIsFalse =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "The Asciidoctor",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "ifdef::asciidoctor[is in.]",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `peek_lines should not preprocess lines if direct is true`() {
        // Input: asciidoctor/reader_test_peek_lines_should_not_preprocess_lines_if_direct_is_true.adoc
        // Expected Go AST:
        // var readerTestPeekLinesShouldNotPreprocessLinesIfDirectIsTrue =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "The Asciidoctor",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "ifdef::asciidoctor[is in.]",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `peek_lines should not prevent subsequent preprocessing of peeked lines`() {
        // Input: asciidoctor/reader_test_peek_lines_should_not_prevent_subsequent_preprocessing_of_peeked_lines.adoc
        // Expected Go AST:
        // var readerTestPeekLinesShouldNotPreventSubsequentPreprocessingOfPeekedLines =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "The Asciidoctor",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "ifdef::asciidoctor[is in.]",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `process_line returns line if cursor not advanced`() {
        // Input: asciidoctor/reader_test_process_line_returns_line_if_cursor_not_advanced.adoc
        // Expected Go AST:
        // var readerTestProcessLineReturnsLineIfCursorNotAdvanced =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "content",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.IfDef{
        // 			Attributes: asciidoc.AttributeNames{
        // 				"asciidoctor",
        // 			},
        // 			Union:  0,
        // 			Inline: false,
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Asciidoctor!",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EndIf{
        // 			Attributes: asciidoc.AttributeNames{
        // 				"asciidoctor",
        // 			},
        // 			Union: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `peek_line does not advance cursor when on a regular content line`() {
        // Input: asciidoctor/reader_test_peek_line_does_not_advance_cursor_when_on_a_regular_content_line.adoc
        // Expected Go AST:
        // var readerTestPeekLineDoesNotAdvanceCursorWhenOnARegularContentLine =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "content",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.IfDef{
        // 			Attributes: asciidoc.AttributeNames{
        // 				"asciidoctor",
        // 			},
        // 			Union:  0,
        // 			Inline: false,
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Asciidoctor!",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EndIf{
        // 			Attributes: asciidoc.AttributeNames{
        // 				"asciidoctor",
        // 			},
        // 			Union: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `peek_line returns nil if cursor advances past end of source`() {
        // Input: asciidoctor/reader_test_peek_line_returns_nil_if_cursor_advances_past_end_of_source.adoc
        // Expected Go AST:
        // var readerTestPeekLineReturnsNilIfCursorAdvancesPastEndOfSource =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.IfDef{
        // 			Attributes: asciidoc.AttributeNames{
        // 				"foobar",
        // 			},
        // 			Union:  0,
        // 			Inline: false,
        // 		},
        // 		&asciidoc.String{
        // 			Value: "swallowed content",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EndIf{
        // 			Attributes: asciidoc.AttributeNames{
        // 				"foobar",
        // 			},
        // 			Union: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `peek_line returns nil if contents of skipped conditional is empty line`() {
        // Input: asciidoctor/reader_test_peek_line_returns_nil_if_contents_of_skipped_conditional_is_empty_line.adoc
        // Expected Go AST:
        // var readerTestPeekLineReturnsNilIfContentsOfSkippedConditionalIsEmptyLine =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.IfDef{
        // 			Attributes: asciidoc.AttributeNames{
        // 				"foobar",
        // 			},
        // 			Union:  0,
        // 			Inline: false,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.EndIf{
        // 			Attributes: asciidoc.AttributeNames{
        // 				"foobar",
        // 			},
        // 			Union: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `ifdef with defined attribute includes content`() {
        // Input: asciidoctor/reader_test_ifdef_with_defined_attribute_includes_content.adoc
        // Expected Go AST:
        // var readerTestIfdefWithDefinedAttributeIncludesContent =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.IfDef{
        // 			Attributes: asciidoc.AttributeNames{
        // 				"holygrail",
        // 			},
        // 			Union:  0,
        // 			Inline: false,
        // 		},
        // 		&asciidoc.String{
        // 			Value: "There is a holy grail!",
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
    fun `ifdef with defined attribute includes text in brackets`() {
        // Input: asciidoctor/reader_test_ifdef_with_defined_attribute_includes_text_in_brackets.adoc
        // Expected Go AST:
        // var readerTestIfdefWithDefinedAttributeIncludesTextInBrackets =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "On our quest we go...",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "ifdef::holygrail[There is a holy grail!]",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "There was much rejoicing.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `ifdef attribute name is not case sensitive`() {
        // Input: asciidoctor/reader_test_ifdef_attribute_name_is_not_case_sensitive.adoc
        // Expected Go AST:
        // var readerTestIfdefAttributeNameIsNotCaseSensitive =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.IfDef{
        // 			Attributes: asciidoc.AttributeNames{
        // 				"showScript",
        // 			},
        // 			Union:  0,
        // 			Inline: false,
        // 		},
        // 		&asciidoc.String{
        // 			Value: "The script is shown!",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EndIf{
        // 			Attributes: asciidoc.AttributeNames{
        // 				"showScript",
        // 			},
        // 			Union: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `ifndef with defined attribute does not include text in brackets`() {
        // Input: asciidoctor/reader_test_ifndef_with_defined_attribute_does_not_include_text_in_brackets.adoc
        // Expected Go AST:
        // var readerTestIfndefWithDefinedAttributeDoesNotIncludeTextInBrackets =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "On our quest we go...",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "ifndef::hardships[There is a holy grail!]",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "There was no rejoicing.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `include with non-matching nested exclude`() {
        // Input: asciidoctor/reader_test_include_with_non_matching_nested_exclude.adoc
        // Expected Go AST:
        // var readerTestIncludeWithNonMatchingNestedExclude =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.IfDef{
        // 			Attributes: asciidoc.AttributeNames{
        // 				"grail",
        // 			},
        // 			Union:  0,
        // 			Inline: false,
        // 		},
        // 		&asciidoc.String{
        // 			Value: "holy",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.IfDef{
        // 			Attributes: asciidoc.AttributeNames{
        // 				"swallow",
        // 			},
        // 			Union:  0,
        // 			Inline: false,
        // 		},
        // 		&asciidoc.String{
        // 			Value: "swallow",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EndIf{
        // 			Attributes: asciidoc.AttributeNames{
        // 				"swallow",
        // 			},
        // 			Union: 0,
        // 		},
        // 		&asciidoc.String{
        // 			Value: "grail",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EndIf{
        // 			Attributes: asciidoc.AttributeNames{
        // 				"grail",
        // 			},
        // 			Union: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `nested excludes with same condition`() {
        // Input: asciidoctor/reader_test_nested_excludes_with_same_condition.adoc
        // Expected Go AST:
        // var readerTestNestedExcludesWithSameCondition =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.IfNDef{
        // 			Attributes: asciidoc.AttributeNames{
        // 				"grail",
        // 			},
        // 			Union:  0,
        // 			Inline: false,
        // 		},
        // 		&asciidoc.IfNDef{
        // 			Attributes: asciidoc.AttributeNames{
        // 				"grail",
        // 			},
        // 			Union:  0,
        // 			Inline: false,
        // 		},
        // 		&asciidoc.String{
        // 			Value: "not here",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EndIf{
        // 			Attributes: asciidoc.AttributeNames{
        // 				"grail",
        // 			},
        // 			Union: 0,
        // 		},
        // 		&asciidoc.EndIf{
        // 			Attributes: asciidoc.AttributeNames{
        // 				"grail",
        // 			},
        // 			Union: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `include with nested exclude of inverted condition`() {
        // Input: asciidoctor/reader_test_include_with_nested_exclude_of_inverted_condition.adoc
        // Expected Go AST:
        // var readerTestIncludeWithNestedExcludeOfInvertedCondition =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.IfDef{
        // 			Attributes: asciidoc.AttributeNames{
        // 				"grail",
        // 			},
        // 			Union:  0,
        // 			Inline: false,
        // 		},
        // 		&asciidoc.String{
        // 			Value: "holy",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.IfNDef{
        // 			Attributes: asciidoc.AttributeNames{
        // 				"grail",
        // 			},
        // 			Union:  0,
        // 			Inline: false,
        // 		},
        // 		&asciidoc.String{
        // 			Value: "not here",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EndIf{
        // 			Attributes: asciidoc.AttributeNames{
        // 				"grail",
        // 			},
        // 			Union: 0,
        // 		},
        // 		&asciidoc.String{
        // 			Value: "grail",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EndIf{
        // 			Attributes: asciidoc.AttributeNames{
        // 				"grail",
        // 			},
        // 			Union: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `exclude with matching nested exclude`() {
        // Input: asciidoctor/reader_test_exclude_with_matching_nested_exclude.adoc
        // Expected Go AST:
        // var readerTestExcludeWithMatchingNestedExclude =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "poof",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.IfDef{
        // 			Attributes: asciidoc.AttributeNames{
        // 				"swallow",
        // 			},
        // 			Union:  0,
        // 			Inline: false,
        // 		},
        // 		&asciidoc.String{
        // 			Value: "no",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.IfDef{
        // 			Attributes: asciidoc.AttributeNames{
        // 				"swallow",
        // 			},
        // 			Union:  0,
        // 			Inline: false,
        // 		},
        // 		&asciidoc.String{
        // 			Value: "swallow",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EndIf{
        // 			Attributes: asciidoc.AttributeNames{
        // 				"swallow",
        // 			},
        // 			Union: 0,
        // 		},
        // 		&asciidoc.String{
        // 			Value: "here",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EndIf{
        // 			Attributes: asciidoc.AttributeNames{
        // 				"swallow",
        // 			},
        // 			Union: 0,
        // 		},
        // 		&asciidoc.String{
        // 			Value: "gone",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `exclude with nested include using shorthand end`() {
        // Input: asciidoctor/reader_test_exclude_with_nested_include_using_shorthand_end.adoc
        // Expected Go AST:
        // var readerTestExcludeWithNestedIncludeUsingShorthandEnd =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "poof",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.IfNDef{
        // 			Attributes: asciidoc.AttributeNames{
        // 				"grail",
        // 			},
        // 			Union:  0,
        // 			Inline: false,
        // 		},
        // 		&asciidoc.String{
        // 			Value: "no grail",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.IfNDef{
        // 			Attributes: asciidoc.AttributeNames{
        // 				"swallow",
        // 			},
        // 			Union:  0,
        // 			Inline: false,
        // 		},
        // 		&asciidoc.String{
        // 			Value: "or swallow",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EndIf{
        // 			Attributes: nil,
        // 			Union:      0,
        // 		},
        // 		&asciidoc.String{
        // 			Value: "in here",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EndIf{
        // 			Attributes: nil,
        // 			Union:      0,
        // 		},
        // 		&asciidoc.String{
        // 			Value: "gone",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `ifdef with one alternative attribute set includes content`() {
        // Input: asciidoctor/reader_test_ifdef_with_one_alternative_attribute_set_includes_content.adoc
        // Expected Go AST:
        // var readerTestIfdefWithOneAlternativeAttributeSetIncludesContent =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.IfDef{
        // 			Attributes: asciidoc.AttributeNames{
        // 				"holygrail",
        // 				"swallow",
        // 			},
        // 			Union:  0,
        // 			Inline: false,
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Our quest is complete!",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EndIf{
        // 			Attributes: asciidoc.AttributeNames{
        // 				"holygrail",
        // 				"swallow",
        // 			},
        // 			Union: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `ifdef with no alternative attributes set does not include content`() {
        // Input: asciidoctor/reader_test_ifdef_with_no_alternative_attributes_set_does_not_include_content.adoc
        // Expected Go AST:
        // var readerTestIfdefWithNoAlternativeAttributesSetDoesNotIncludeContent =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.IfDef{
        // 			Attributes: asciidoc.AttributeNames{
        // 				"holygrail",
        // 				"swallow",
        // 			},
        // 			Union:  0,
        // 			Inline: false,
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Our quest is complete!",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EndIf{
        // 			Attributes: asciidoc.AttributeNames{
        // 				"holygrail",
        // 				"swallow",
        // 			},
        // 			Union: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `ifdef with all required attributes set includes content`() {
        // Input: asciidoctor/reader_test_ifdef_with_all_required_attributes_set_includes_content.adoc
        // Expected Go AST:
        // var readerTestIfdefWithAllRequiredAttributesSetIncludesContent =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "ifdef::holygrail+swallow[]",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "Our quest is complete!",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "endif::holygrail+swallow[]",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `ifdef with missing required attributes does not include content`() {
        // Input: asciidoctor/reader_test_ifdef_with_missing_required_attributes_does_not_include_content.adoc
        // Expected Go AST:
        // var readerTestIfdefWithMissingRequiredAttributesDoesNotIncludeContent =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "ifdef::holygrail+swallow[]",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "Our quest is complete!",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "endif::holygrail+swallow[]",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `ifndef with undefined attribute includes block`() {
        // Input: asciidoctor/reader_test_ifndef_with_undefined_attribute_includes_block.adoc
        // Expected Go AST:
        // var readerTestIfndefWithUndefinedAttributeIncludesBlock =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.IfNDef{
        // 			Attributes: asciidoc.AttributeNames{
        // 				"holygrail",
        // 			},
        // 			Union:  0,
        // 			Inline: false,
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Our quest continues to find the holy grail!",
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
    fun `ifndef with one alternative attribute set does not include content`() {
        // Input: asciidoctor/reader_test_ifndef_with_one_alternative_attribute_set_does_not_include_content.adoc
        // Expected Go AST:
        // var readerTestIfndefWithOneAlternativeAttributeSetDoesNotIncludeContent =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.IfNDef{
        // 			Attributes: asciidoc.AttributeNames{
        // 				"holygrail",
        // 				"swallow",
        // 			},
        // 			Union:  0,
        // 			Inline: false,
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Our quest is complete!",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EndIf{
        // 			Attributes: asciidoc.AttributeNames{
        // 				"holygrail",
        // 				"swallow",
        // 			},
        // 			Union: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `ifndef with both alternative attributes set does not include content`() {
        // Input: asciidoctor/reader_test_ifndef_with_both_alternative_attributes_set_does_not_include_content.adoc
        // Expected Go AST:
        // var readerTestIfndefWithBothAlternativeAttributesSetDoesNotIncludeContent =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.IfNDef{
        // 			Attributes: asciidoc.AttributeNames{
        // 				"holygrail",
        // 				"swallow",
        // 			},
        // 			Union:  0,
        // 			Inline: false,
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Our quest is complete!",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EndIf{
        // 			Attributes: asciidoc.AttributeNames{
        // 				"holygrail",
        // 				"swallow",
        // 			},
        // 			Union: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `ifndef with no alternative attributes set includes content`() {
        // Input: asciidoctor/reader_test_ifndef_with_no_alternative_attributes_set_includes_content.adoc
        // Expected Go AST:
        // var readerTestIfndefWithNoAlternativeAttributesSetIncludesContent =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.IfNDef{
        // 			Attributes: asciidoc.AttributeNames{
        // 				"holygrail",
        // 				"swallow",
        // 			},
        // 			Union:  0,
        // 			Inline: false,
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Our quest is complete!",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EndIf{
        // 			Attributes: asciidoc.AttributeNames{
        // 				"holygrail",
        // 				"swallow",
        // 			},
        // 			Union: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `ifndef with no required attributes set includes content`() {
        // Input: asciidoctor/reader_test_ifndef_with_no_required_attributes_set_includes_content.adoc
        // Expected Go AST:
        // var readerTestIfndefWithNoRequiredAttributesSetIncludesContent =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "ifndef::holygrail+swallow[]",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "Our quest is complete!",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "endif::holygrail+swallow[]",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `ifndef with all required attributes set does not include content`() {
        // Input: asciidoctor/reader_test_ifndef_with_all_required_attributes_set_does_not_include_content.adoc
        // Expected Go AST:
        // var readerTestIfndefWithAllRequiredAttributesSetDoesNotIncludeContent =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "ifndef::holygrail+swallow[]",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "Our quest is complete!",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "endif::holygrail+swallow[]",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `ifndef with at least one required attributes set does not include content`() {
        // Input: asciidoctor/reader_test_ifndef_with_at_least_one_required_attributes_set_does_not_include_content.adoc
        // Expected Go AST:
        // var readerTestIfndefWithAtLeastOneRequiredAttributesSetDoesNotIncludeContent =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "ifndef::holygrail+swallow[]",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "Our quest is complete!",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "endif::holygrail+swallow[]",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `ifdef around empty line does not introduce extra line`() {
        // Input: asciidoctor/reader_test_ifdef_around_empty_line_does_not_introduce_extra_line.adoc
        // Expected Go AST:
        // var readerTestIfdefAroundEmptyLineDoesNotIntroduceExtraLine =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "before",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.IfDef{
        // 			Attributes: asciidoc.AttributeNames{
        // 				"no-such-attribute",
        // 			},
        // 			Union:  0,
        // 			Inline: false,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.EndIf{
        // 			Attributes: nil,
        // 			Union:      0,
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
    fun `should log warning if endif is unmatched`() {
        // Input: asciidoctor/reader_test_should_log_warning_if_endif_is_unmatched.adoc
        // Expected Go AST:
        // var readerTestShouldLogWarningIfEndifIsUnmatched =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Our quest is complete!",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EndIf{
        // 			Attributes: asciidoc.AttributeNames{
        // 				"on-quest",
        // 			},
        // 			Union: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should log warning if endif is mismatched`() {
        // Input: asciidoctor/reader_test_should_log_warning_if_endif_is_mismatched.adoc
        // Expected Go AST:
        // var readerTestShouldLogWarningIfEndifIsMismatched =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.IfDef{
        // 			Attributes: asciidoc.AttributeNames{
        // 				"on-quest",
        // 			},
        // 			Union:  0,
        // 			Inline: false,
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Our quest is complete!",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EndIf{
        // 			Attributes: asciidoc.AttributeNames{
        // 				"on-journey",
        // 			},
        // 			Union: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should log warning if endif contains text`() {
        // Input: asciidoctor/reader_test_should_log_warning_if_endif_contains_text.adoc
        // Expected Go AST:
        // var readerTestShouldLogWarningIfEndifContainsText =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.IfDef{
        // 			Attributes: asciidoc.AttributeNames{
        // 				"on-quest",
        // 			},
        // 			Union:  0,
        // 			Inline: false,
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Our quest is complete!",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "endif::on-quest[complete!]",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `escaped ifdef is unescaped and ignored`() {
        // Input: asciidoctor/reader_test_escaped_ifdef_is_unescaped_and_ignored.adoc
        // Expected Go AST:
        // var readerTestEscapedIfdefIsUnescapedAndIgnored =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "\\ifdef::holygrail[]",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "content",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "\\endif::holygrail[]",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `ifeval comparing missing attribute to nil includes content`() {
        // Input: asciidoctor/reader_test_ifeval_comparing_missing_attribute_to_nil_includes_content.adoc
        // Expected Go AST:
        // var readerTestIfevalComparingMissingAttributeToNilIncludesContent =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.IfEval{
        // 			Left: asciidoc.IfEvalValue{
        // 				Quote: 1,
        // 				Value: asciidoc.Elements{
        // 					&asciidoc.UserAttributeReference{
        // 						Value: "foo",
        // 					},
        // 				},
        // 			},
        // 			Operator: 1,
        // 			Right: asciidoc.IfEvalValue{
        // 				Quote: 1,
        // 				Value: nil,
        // 			},
        // 			Inline: false,
        // 		},
        // 		&asciidoc.String{
        // 			Value: "No foo for you!",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EndIf{
        // 			Attributes: nil,
        // 			Union:      0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `ifeval comparing missing attribute to 0 drops content`() {
        // Input: asciidoctor/reader_test_ifeval_comparing_missing_attribute_to_0_drops_content.adoc
        // Expected Go AST:
        // var readerTestIfevalComparingMissingAttributeTo0DropsContent =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.IfEval{
        // 			Left: asciidoc.IfEvalValue{
        // 				Quote: 0,
        // 				Value: asciidoc.Elements{
        // 					&asciidoc.UserAttributeReference{
        // 						Value: "leveloffset",
        // 					},
        // 					&asciidoc.String{
        // 						Value: " ",
        // 					},
        // 				},
        // 			},
        // 			Operator: 1,
        // 			Right: asciidoc.IfEvalValue{
        // 				Quote: 0,
        // 				Value: asciidoc.Elements{
        // 					&asciidoc.String{
        // 						Value: "0",
        // 					},
        // 				},
        // 			},
        // 			Inline: false,
        // 		},
        // 		&asciidoc.String{
        // 			Value: "I didn't make the cut!",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EndIf{
        // 			Attributes: nil,
        // 			Union:      0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `ifeval running unsupported operation on missing attribute drops content`() {
        // Input: asciidoctor/reader_test_ifeval_running_unsupported_operation_on_missing_attribute_drops_content.adoc
        // Expected Go AST:
        // var readerTestIfevalRunningUnsupportedOperationOnMissingAttributeDropsContent =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "ifeval::[",
        // 		},
        // 		&asciidoc.UserAttributeReference{
        // 			Value: "leveloffset",
        // 		},
        // 		&asciidoc.String{
        // 			Value: " >= 3]",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "I didn't make the cut!",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EndIf{
        // 			Attributes: nil,
        // 			Union:      0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `ifeval running invalid operation drops content`() {
        // Input: asciidoctor/reader_test_ifeval_running_invalid_operation_drops_content.adoc
        // Expected Go AST:
        // var readerTestIfevalRunningInvalidOperationDropsContent =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "ifeval::[",
        // 		},
        // 		&asciidoc.UserAttributeReference{
        // 			Value: "asciidoctor-version",
        // 		},
        // 		&asciidoc.String{
        // 			Value: " > true]",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "I didn't make the cut!",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EndIf{
        // 			Attributes: nil,
        // 			Union:      0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `ifeval comparing double-quoted attribute to matching string includes content`() {
        // Input: asciidoctor/reader_test_ifeval_comparing_double_quoted_attribute_to_matching_string_includes_content.adoc
        // Expected Go AST:
        // var readerTestIfevalComparingDoubleQuotedAttributeToMatchingStringIncludesContent =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.IfEval{
        // 			Left: asciidoc.IfEvalValue{
        // 				Quote: 2,
        // 				Value: asciidoc.Elements{
        // 					&asciidoc.UserAttributeReference{
        // 						Value: "gem",
        // 					},
        // 				},
        // 			},
        // 			Operator: 1,
        // 			Right: asciidoc.IfEvalValue{
        // 				Quote: 2,
        // 				Value: asciidoc.Elements{
        // 					&asciidoc.String{
        // 						Value: "asciidoctor",
        // 					},
        // 				},
        // 			},
        // 			Inline: false,
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Asciidoctor it is!",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EndIf{
        // 			Attributes: nil,
        // 			Union:      0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `ifeval comparing single-quoted attribute to matching string includes content`() {
        // Input: asciidoctor/reader_test_ifeval_comparing_single_quoted_attribute_to_matching_string_includes_content.adoc
        // Expected Go AST:
        // var readerTestIfevalComparingSingleQuotedAttributeToMatchingStringIncludesContent =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.IfEval{
        // 			Left: asciidoc.IfEvalValue{
        // 				Quote: 1,
        // 				Value: asciidoc.Elements{
        // 					&asciidoc.UserAttributeReference{
        // 						Value: "gem",
        // 					},
        // 				},
        // 			},
        // 			Operator: 1,
        // 			Right: asciidoc.IfEvalValue{
        // 				Quote: 1,
        // 				Value: asciidoc.Elements{
        // 					&asciidoc.String{
        // 						Value: "asciidoctor",
        // 					},
        // 				},
        // 			},
        // 			Inline: false,
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Asciidoctor it is!",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EndIf{
        // 			Attributes: nil,
        // 			Union:      0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `ifeval comparing quoted attribute to non-matching string drops content`() {
        // Input: asciidoctor/reader_test_ifeval_comparing_quoted_attribute_to_non_matching_string_drops_content.adoc
        // Expected Go AST:
        // var readerTestIfevalComparingQuotedAttributeToNonMatchingStringDropsContent =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.IfEval{
        // 			Left: asciidoc.IfEvalValue{
        // 				Quote: 1,
        // 				Value: asciidoc.Elements{
        // 					&asciidoc.UserAttributeReference{
        // 						Value: "gem",
        // 					},
        // 				},
        // 			},
        // 			Operator: 1,
        // 			Right: asciidoc.IfEvalValue{
        // 				Quote: 1,
        // 				Value: asciidoc.Elements{
        // 					&asciidoc.String{
        // 						Value: "asciidoctor",
        // 					},
        // 				},
        // 			},
        // 			Inline: false,
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Asciidoctor it is!",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EndIf{
        // 			Attributes: nil,
        // 			Union:      0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `ifeval comparing attribute to lower version number includes content`() {
        // Input: asciidoctor/reader_test_ifeval_comparing_attribute_to_lower_version_number_includes_content.adoc
        // Expected Go AST:
        // var readerTestIfevalComparingAttributeToLowerVersionNumberIncludesContent =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "ifeval::['",
        // 		},
        // 		&asciidoc.UserAttributeReference{
        // 			Value: "asciidoctor-version",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "' >= '0.1.0']",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "That version will do!",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EndIf{
        // 			Attributes: nil,
        // 			Union:      0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `ifeval comparing attribute to self includes content`() {
        // Input: asciidoctor/reader_test_ifeval_comparing_attribute_to_self_includes_content.adoc
        // Expected Go AST:
        // var readerTestIfevalComparingAttributeToSelfIncludesContent =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.IfEval{
        // 			Left: asciidoc.IfEvalValue{
        // 				Quote: 1,
        // 				Value: asciidoc.Elements{
        // 					&asciidoc.UserAttributeReference{
        // 						Value: "asciidoctor-version",
        // 					},
        // 				},
        // 			},
        // 			Operator: 1,
        // 			Right: asciidoc.IfEvalValue{
        // 				Quote: 1,
        // 				Value: asciidoc.Elements{
        // 					&asciidoc.UserAttributeReference{
        // 						Value: "asciidoctor-version",
        // 					},
        // 				},
        // 			},
        // 			Inline: false,
        // 		},
        // 		&asciidoc.String{
        // 			Value: "Of course it's the same!",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EndIf{
        // 			Attributes: nil,
        // 			Union:      0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `ifeval arguments can be transposed`() {
        // Input: asciidoctor/reader_test_ifeval_arguments_can_be_transposed.adoc
        // Expected Go AST:
        // var readerTestIfevalArgumentsCanBeTransposed =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "ifeval::['0.1.0' <= '",
        // 		},
        // 		&asciidoc.UserAttributeReference{
        // 			Value: "asciidoctor-version",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "']",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "That version will do!",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EndIf{
        // 			Attributes: nil,
        // 			Union:      0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `ifeval matching numeric equality includes content`() {
        // Input: asciidoctor/reader_test_ifeval_matching_numeric_equality_includes_content.adoc
        // Expected Go AST:
        // var readerTestIfevalMatchingNumericEqualityIncludesContent =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.IfEval{
        // 			Left: asciidoc.IfEvalValue{
        // 				Quote: 0,
        // 				Value: asciidoc.Elements{
        // 					&asciidoc.UserAttributeReference{
        // 						Value: "rings",
        // 					},
        // 					&asciidoc.String{
        // 						Value: " ",
        // 					},
        // 				},
        // 			},
        // 			Operator: 1,
        // 			Right: asciidoc.IfEvalValue{
        // 				Quote: 0,
        // 				Value: asciidoc.Elements{
        // 					&asciidoc.String{
        // 						Value: "1",
        // 					},
        // 				},
        // 			},
        // 			Inline: false,
        // 		},
        // 		&asciidoc.String{
        // 			Value: "One ring to rule them all!",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EndIf{
        // 			Attributes: nil,
        // 			Union:      0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `ifeval matching numeric inequality includes content`() {
        // Input: asciidoctor/reader_test_ifeval_matching_numeric_inequality_includes_content.adoc
        // Expected Go AST:
        // var readerTestIfevalMatchingNumericInequalityIncludesContent =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "ifeval::[",
        // 		},
        // 		&asciidoc.UserAttributeReference{
        // 			Value: "rings",
        // 		},
        // 		&asciidoc.String{
        // 			Value: " != 0]",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "One ring to rule them all!",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EndIf{
        // 			Attributes: nil,
        // 			Union:      0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should warn if ifeval has target`() {
        // Input: asciidoctor/reader_test_should_warn_if_ifeval_has_target.adoc
        // Expected Go AST:
        // var readerTestShouldWarnIfIfevalHasTarget =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "ifeval::target[1 == 1]",
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
    fun `should warn if ifeval has invalid expression`() {
        // Input: asciidoctor/reader_test_should_warn_if_ifeval_has_invalid_expression.adoc
        // Expected Go AST:
        // var readerTestShouldWarnIfIfevalHasInvalidExpression =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "ifeval::[1 | 2]",
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
    fun `should warn if ifeval is missing expression`() {
        // Input: asciidoctor/reader_test_should_warn_if_ifeval_is_missing_expression.adoc
        // Expected Go AST:
        // var readerTestShouldWarnIfIfevalIsMissingExpression =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "ifeval::[]",
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
    fun `ifdef with no target is ignored`() {
        // Input: asciidoctor/reader_test_ifdef_with_no_target_is_ignored.adoc
        // Expected Go AST:
        // var readerTestIfdefWithNoTargetIsIgnored =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "ifdef::[]",
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
    fun `should not warn about invalid ifdef preprocessor directive if already skipping`() {
        // Input: asciidoctor/reader_test_should_not_warn_about_invalid_ifdef_preprocessor_directive_if_already_skipping.adoc
        // Expected Go AST:
        // var readerTestShouldNotWarnAboutInvalidIfdefPreprocessorDirectiveIfAlreadySkipping =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.IfDef{
        // 			Attributes: asciidoc.AttributeNames{
        // 				"attribute-not-set",
        // 			},
        // 			Union:  0,
        // 			Inline: false,
        // 		},
        // 		&asciidoc.String{
        // 			Value: "foo",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "ifdef::[]",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "bar",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EndIf{
        // 			Attributes: nil,
        // 			Union:      0,
        // 		},
        // 		&asciidoc.String{
        // 			Value: "baz",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not warn about invalid ifeval preprocessor directive if already skipping`() {
        // Input: asciidoctor/reader_test_should_not_warn_about_invalid_ifeval_preprocessor_directive_if_already_skipping.adoc
        // Expected Go AST:
        // var readerTestShouldNotWarnAboutInvalidIfevalPreprocessorDirectiveIfAlreadySkipping =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.IfDef{
        // 			Attributes: asciidoc.AttributeNames{
        // 				"attribute-not-set",
        // 			},
        // 			Union:  0,
        // 			Inline: false,
        // 		},
        // 		&asciidoc.String{
        // 			Value: "foo",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "ifeval::[]",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "bar",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EndIf{
        // 			Attributes: nil,
        // 			Union:      0,
        // 		},
        // 		&asciidoc.String{
        // 			Value: "baz",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

}
