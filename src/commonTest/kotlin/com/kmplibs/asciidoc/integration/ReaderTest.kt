package com.kmplibs.asciidoc.integration

import kotlin.test.Test
import kotlin.test.Ignore

class ReaderTest {

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should prepare lines from Array data`() {
        // Input: asciidoctor/reader_test_should_prepare_lines_from_array_data.adoc
        // Expected: readerTestShouldPrepareLinesFromArrayData
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `Read lines until until blank line`() {
        // Input: asciidoctor/reader_test_read_lines_until_until_blank_line.adoc
        // Expected: readerTestReadLinesUntilUntilBlankLine
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `Read lines until until blank line preserving last line`() {
        // Input: asciidoctor/reader_test_read_lines_until_until_blank_line_preserving_last_line.adoc
        // Expected: readerTestReadLinesUntilUntilBlankLinePreservingLastLine
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `Read lines until until condition is true`() {
        // Input: asciidoctor/reader_test_read_lines_until_until_condition_is_true.adoc
        // Expected: readerTestReadLinesUntilUntilConditionIsTrue
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `Read lines until until condition is true, taking last line`() {
        // Input: asciidoctor/reader_test_read_lines_until_until_condition_is_true_taking_last_line.adoc
        // Expected: readerTestReadLinesUntilUntilConditionIsTrueTakingLastLine
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `Read lines until until condition is true, taking and preserving last line`() {
        // Input: asciidoctor/reader_test_read_lines_until_until_condition_is_true_taking_and_preserving_last_line.adoc
        // Expected: readerTestReadLinesUntilUntilConditionIsTrueTakingAndPreservingLastLine
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `read lines until terminator`() {
        // Input: asciidoctor/reader_test_read_lines_until_terminator.adoc
        // Expected: readerTestReadLinesUntilTerminator
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should flag reader as unterminated if reader reaches end of source without finding terminator`() {
        // Input: asciidoctor/reader_test_should_flag_reader_as_unterminated_if_reader_reaches_end_of_source_without_finding_terminator.adoc
        // Expected: readerTestShouldFlagReaderAsUnterminatedIfReaderReachesEndOfSourceWithoutFindingTerminator
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not skip front matter by default`() {
        // Input: asciidoctor/reader_test_should_not_skip_front_matter_by_default.adoc
        // Expected: readerTestShouldNotSkipFrontMatterByDefault
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not skip front matter if ending delimiter is not found`() {
        // Input: asciidoctor/reader_test_should_not_skip_front_matter_if_ending_delimiter_is_not_found.adoc
        // Expected: readerTestShouldNotSkipFrontMatterIfEndingDelimiterIsNotFound
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should skip front matter if specified by skip-front-matter attribute`() {
        // Input: asciidoctor/reader_test_should_skip_front_matter_if_specified_by_skip_front_matter_attribute.adoc
        // Expected: readerTestShouldSkipFrontMatterIfSpecifiedBySkipFrontMatterAttribute
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should skip TOML front matter if specified by skip-front-matter attribute`() {
        // Input: asciidoctor/reader_test_should_skip_toml_front_matter_if_specified_by_skip_front_matter_attribute.adoc
        // Expected: readerTestShouldSkipTomlFrontMatterIfSpecifiedBySkipFrontMatterAttribute
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not track include in catalog for non-AsciiDoc include files`() {
        // Input: asciidoctor/reader_test_should_not_track_include_in_catalog_for_non_ascii_doc_include_files.adoc
        // Expected: readerTestShouldNotTrackIncludeInCatalogForNonAsciiDocIncludeFiles
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `include directive should resolve file with spaces in name`() {
        // Input: asciidoctor/reader_test_include_directive_should_resolve_file_with_spaces_in_name.adoc
        // Expected: readerTestIncludeDirectiveShouldResolveFileWithSpacesInName
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `include directive should resolve file relative to current include`() {
        // Input: asciidoctor/reader_test_include_directive_should_resolve_file_relative_to_current_include.adoc
        // Expected: readerTestIncludeDirectiveShouldResolveFileRelativeToCurrentInclude
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should fail to read include file if not UTF-8 encoded and encoding is not specified`() {
        // Input: asciidoctor/reader_test_should_fail_to_read_include_file_if_not_utf_8_encoded_and_encoding_is_not_specified.adoc
        // Expected: readerTestShouldFailToReadIncludeFileIfNotUtf8EncodedAndEncodingIsNotSpecified
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should ignore encoding attribute if value is not a valid encoding`() {
        // Input: asciidoctor/reader_test_should_ignore_encoding_attribute_if_value_is_not_a_valid_encoding.adoc
        // Expected: readerTestShouldIgnoreEncodingAttributeIfValueIsNotAValidEncoding
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should use encoding specified by encoding attribute when reading include file`() {
        // Input: asciidoctor/reader_test_should_use_encoding_specified_by_encoding_attribute_when_reading_include_file.adoc
        // Expected: readerTestShouldUseEncodingSpecifiedByEncodingAttributeWhenReadingIncludeFile
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `unresolved target referenced by include directive is skipped when optional option is set`() {
        // Input: asciidoctor/reader_test_unresolved_target_referenced_by_include_directive_is_skipped_when_optional_option_is_set.adoc
        // Expected: readerTestUnresolvedTargetReferencedByIncludeDirectiveIsSkippedWhenOptionalOptionIsSet
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should skip include directive that references missing file if optional option is set`() {
        // Input: asciidoctor/reader_test_should_skip_include_directive_that_references_missing_file_if_optional_option_is_set.adoc
        // Expected: readerTestShouldSkipIncludeDirectiveThatReferencesMissingFileIfOptionalOptionIsSet
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should replace include directive that references missing file with message`() {
        // Input: asciidoctor/reader_test_should_replace_include_directive_that_references_missing_file_with_message.adoc
        // Expected: readerTestShouldReplaceIncludeDirectiveThatReferencesMissingFileWithMessage
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `nested include directives are resolved relative to current file`() {
        // Input: asciidoctor/reader_test_nested_include_directives_are_resolved_relative_to_current_file.adoc
        // Expected: readerTestNestedIncludeDirectivesAreResolvedRelativeToCurrentFile
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `include directive supports selecting lines by line number`() {
        // Input: asciidoctor/reader_test_include_directive_supports_selecting_lines_by_line_number.adoc
        // Expected: readerTestIncludeDirectiveSupportsSelectingLinesByLineNumber
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `include directive ignores lines attribute with invalid range`() {
        // Input: asciidoctor/reader_test_include_directive_ignores_lines_attribute_with_invalid_range.adoc
        // Expected: readerTestIncludeDirectiveIgnoresLinesAttributeWithInvalidRange
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `include directive supports selecting lines by tag in file that has CRLF line endings`() {
        // Input: asciidoctor/reader_test_include_directive_supports_selecting_lines_by_tag_in_file_that_has_crlf_line_endings.adoc
        // Expected: readerTestIncludeDirectiveSupportsSelectingLinesByTagInFileThatHasCrlfLineEndings
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `include directive skips lines inside tag which is negated`() {
        // Input: asciidoctor/reader_test_include_directive_skips_lines_inside_tag_which_is_negated.adoc
        // Expected: readerTestIncludeDirectiveSkipsLinesInsideTagWhichIsNegated
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `include directive selects all lines without a tag directive when value is double asterisk`() {
        // Input: asciidoctor/reader_test_include_directive_selects_all_lines_without_a_tag_directive_when_value_is_double_asterisk.adoc
        // Expected: readerTestIncludeDirectiveSelectsAllLinesWithoutATagDirectiveWhenValueIsDoubleAsterisk
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `include directive selects all lines except lines inside tag which is negated when value starts with double asterisk`() {
        // Input: asciidoctor/reader_test_include_directive_selects_all_lines_except_lines_inside_tag_which_is_negated_when_value_starts_with_double_asterisk.adoc
        // Expected: readerTestIncludeDirectiveSelectsAllLinesExceptLinesInsideTagWhichIsNegatedWhenValueStartsWithDoubleAsterisk
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `include directive selects all lines, including lines inside nested tags, except lines inside tag which is negated when value starts with double asterisk`() {
        // Input: asciidoctor/reader_test_include_directive_selects_all_lines_including_lines_inside_nested_tags_except_lines_inside_tag_which_is_negated_when_value_starts_with_double_asterisk.adoc
        // Expected: readerTestIncludeDirectiveSelectsAllLinesIncludingLinesInsideNestedTagsExceptLinesInsideTagWhichIsNegatedWhenValueStartsWithDoubleAsterisk
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `include directive selects all lines outside of tags when value is double asterisk followed by negated wildcard`() {
        // Input: asciidoctor/reader_test_include_directive_selects_all_lines_outside_of_tags_when_value_is_double_asterisk_followed_by_negated_wildcard.adoc
        // Expected: readerTestIncludeDirectiveSelectsAllLinesOutsideOfTagsWhenValueIsDoubleAsteriskFollowedByNegatedWildcard
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `include directive skips all tagged regions when value of tags attribute is negated wildcard`() {
        // Input: asciidoctor/reader_test_include_directive_skips_all_tagged_regions_when_value_of_tags_attribute_is_negated_wildcard.adoc
        // Expected: readerTestIncludeDirectiveSkipsAllTaggedRegionsWhenValueOfTagsAttributeIsNegatedWildcard
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `include directive selects all lines except for lines containing tag directive if value is double asterisk followed by nested tag names`() {
        // Input: asciidoctor/reader_test_include_directive_selects_all_lines_except_for_lines_containing_tag_directive_if_value_is_double_asterisk_followed_by_nested_tag_names.adoc
        // Expected: readerTestIncludeDirectiveSelectsAllLinesExceptForLinesContainingTagDirectiveIfValueIsDoubleAsteriskFollowedByNestedTagNames
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `include directive selects all lines except for lines containing tag directive when value is double asterisk followed by outer tag name`() {
        // Input: asciidoctor/reader_test_include_directive_selects_all_lines_except_for_lines_containing_tag_directive_when_value_is_double_asterisk_followed_by_outer_tag_name.adoc
        // Expected: readerTestIncludeDirectiveSelectsAllLinesExceptForLinesContainingTagDirectiveWhenValueIsDoubleAsteriskFollowedByOuterTagName
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `include directive selects all lines inside unspecified tags when value is negated double asterisk followed by negated tags`() {
        // Input: asciidoctor/reader_test_include_directive_selects_all_lines_inside_unspecified_tags_when_value_is_negated_double_asterisk_followed_by_negated_tags.adoc
        // Expected: readerTestIncludeDirectiveSelectsAllLinesInsideUnspecifiedTagsWhenValueIsNegatedDoubleAsteriskFollowedByNegatedTags
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `include directive selects all lines except tag which is negated when value only contains negated tag`() {
        // Input: asciidoctor/reader_test_include_directive_selects_all_lines_except_tag_which_is_negated_when_value_only_contains_negated_tag.adoc
        // Expected: readerTestIncludeDirectiveSelectsAllLinesExceptTagWhichIsNegatedWhenValueOnlyContainsNegatedTag
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `include directive selects all lines except tags which are negated when value only contains negated tags`() {
        // Input: asciidoctor/reader_test_include_directive_selects_all_lines_except_tags_which_are_negated_when_value_only_contains_negated_tags.adoc
        // Expected: readerTestIncludeDirectiveSelectsAllLinesExceptTagsWhichAreNegatedWhenValueOnlyContainsNegatedTags
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should recognize tag wildcard if not at start of tags list`() {
        // Input: asciidoctor/reader_test_should_recognize_tag_wildcard_if_not_at_start_of_tags_list.adoc
        // Expected: readerTestShouldRecognizeTagWildcardIfNotAtStartOfTagsList
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `include directive selects lines between tags when value of tags attribute is wildcard`() {
        // Input: asciidoctor/reader_test_include_directive_selects_lines_between_tags_when_value_of_tags_attribute_is_wildcard.adoc
        // Expected: readerTestIncludeDirectiveSelectsLinesBetweenTagsWhenValueOfTagsAttributeIsWildcard
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `include directive selects lines inside tags when value of tags attribute is wildcard and tag surrounds content`() {
        // Input: asciidoctor/reader_test_include_directive_selects_lines_inside_tags_when_value_of_tags_attribute_is_wildcard_and_tag_surrounds_content.adoc
        // Expected: readerTestIncludeDirectiveSelectsLinesInsideTagsWhenValueOfTagsAttributeIsWildcardAndTagSurroundsContent
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `include directive selects lines inside all tags except tag which is negated when value of tags attribute is wildcard followed by negated tag`() {
        // Input: asciidoctor/reader_test_include_directive_selects_lines_inside_all_tags_except_tag_which_is_negated_when_value_of_tags_attribute_is_wildcard_followed_by_negated_tag.adoc
        // Expected: readerTestIncludeDirectiveSelectsLinesInsideAllTagsExceptTagWhichIsNegatedWhenValueOfTagsAttributeIsWildcardFollowedByNegatedTag
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `include directive includes regions outside tags and inside specified tags when value begins with negated wildcard`() {
        // Input: asciidoctor/reader_test_include_directive_includes_regions_outside_tags_and_inside_specified_tags_when_value_begins_with_negated_wildcard.adoc
        // Expected: readerTestIncludeDirectiveIncludesRegionsOutsideTagsAndInsideSpecifiedTagsWhenValueBeginsWithNegatedWildcard
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `include directive selects lines inside tag except for lines inside nested tags when tag is preceded by negated double asterisk and negated wildcard`() {
        // Input: asciidoctor/reader_test_include_directive_selects_lines_inside_tag_except_for_lines_inside_nested_tags_when_tag_is_preceded_by_negated_double_asterisk_and_negated_wildcard.adoc
        // Expected: readerTestIncludeDirectiveSelectsLinesInsideTagExceptForLinesInsideNestedTagsWhenTagIsPrecededByNegatedDoubleAsteriskAndNegatedWildcard
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `include directive does not select lines inside tag that has been included then excluded`() {
        // Input: asciidoctor/reader_test_include_directive_does_not_select_lines_inside_tag_that_has_been_included_then_excluded.adoc
        // Expected: readerTestIncludeDirectiveDoesNotSelectLinesInsideTagThatHasBeenIncludedThenExcluded
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `include directive selects lines inside specified tag and ignores lines inside a negated tag`() {
        // Input: asciidoctor/reader_test_include_directive_selects_lines_inside_specified_tag_and_ignores_lines_inside_a_negated_tag.adoc
        // Expected: readerTestIncludeDirectiveSelectsLinesInsideSpecifiedTagAndIgnoresLinesInsideANegatedTag
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not warn if specified negated tag is not found in include file`() {
        // Input: asciidoctor/reader_test_should_not_warn_if_specified_negated_tag_is_not_found_in_include_file.adoc
        // Expected: readerTestShouldNotWarnIfSpecifiedNegatedTagIsNotFoundInIncludeFile
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should warn if specified tags are not found in include file`() {
        // Input: asciidoctor/reader_test_should_warn_if_specified_tags_are_not_found_in_include_file.adoc
        // Expected: readerTestShouldWarnIfSpecifiedTagsAreNotFoundInIncludeFile
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not warn if specified negated tags are not found in include file`() {
        // Input: asciidoctor/reader_test_should_not_warn_if_specified_negated_tags_are_not_found_in_include_file.adoc
        // Expected: readerTestShouldNotWarnIfSpecifiedNegatedTagsAreNotFoundInIncludeFile
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should warn if specified tag in include file is not closed`() {
        // Input: asciidoctor/reader_test_should_warn_if_specified_tag_in_include_file_is_not_closed.adoc
        // Expected: readerTestShouldWarnIfSpecifiedTagInIncludeFileIsNotClosed
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should warn if end tag in included file is mismatched`() {
        // Input: asciidoctor/reader_test_should_warn_if_end_tag_in_included_file_is_mismatched.adoc
        // Expected: readerTestShouldWarnIfEndTagInIncludedFileIsMismatched
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should warn if unexpected end tag is found in included file`() {
        // Input: asciidoctor/reader_test_should_warn_if_unexpected_end_tag_is_found_in_included_file.adoc
        // Expected: readerTestShouldWarnIfUnexpectedEndTagIsFoundInIncludedFile
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `lines attribute takes precedence over tags attribute in include directive`() {
        // Input: asciidoctor/reader_test_lines_attribute_takes_precedence_over_tags_attribute_in_include_directive.adoc
        // Expected: readerTestLinesAttributeTakesPrecedenceOverTagsAttributeInIncludeDirective
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should substitute attribute references in attrlist`() {
        // Input: asciidoctor/reader_test_should_substitute_attribute_references_in_attrlist.adoc
        // Expected: readerTestShouldSubstituteAttributeReferencesInAttrlist
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should fall back to built-in include directive behavior when not handled by include processor`() {
        // Input: asciidoctor/reader_test_should_fall_back_to_built_in_include_directive_behavior_when_not_handled_by_include_processor.adoc
        // Expected: readerTestShouldFallBackToBuiltInIncludeDirectiveBehaviorWhenNotHandledByIncludeProcessor
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `attributes are substituted in target of include directive`() {
        // Input: asciidoctor/reader_test_attributes_are_substituted_in_target_of_include_directive.adoc
        // Expected: readerTestAttributesAreSubstitutedInTargetOfIncludeDirective
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `line following dropped include is not dropped`() {
        // Input: asciidoctor/reader_test_line_following_dropped_include_is_not_dropped.adoc
        // Expected: readerTestLineFollowingDroppedIncludeIsNotDropped
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `escaped include directive is left unprocessed`() {
        // Input: asciidoctor/reader_test_escaped_include_directive_is_left_unprocessed.adoc
        // Expected: readerTestEscapedIncludeDirectiveIsLeftUnprocessed
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `include directive not at start of line is ignored`() {
        // Input: asciidoctor/reader_test_include_directive_not_at_start_of_line_is_ignored.adoc
        // Expected: readerTestIncludeDirectiveNotAtStartOfLineIsIgnored
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `include directive should be disabled if max include depth has been exceeded`() {
        // Input: asciidoctor/reader_test_include_directive_should_be_disabled_if_max_include_depth_has_been_exceeded.adoc
        // Expected: readerTestIncludeDirectiveShouldBeDisabledIfMaxIncludeDepthHasBeenExceeded
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `skip_comment_lines should not process lines read`() {
        // Input: asciidoctor/reader_test_skip_comment_lines_should_not_process_lines_read.adoc
        // Expected: readerTestSkipCommentLinesShouldNotProcessLinesRead
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `process_line returns nil if cursor advanced`() {
        // Input: asciidoctor/reader_test_process_line_returns_nil_if_cursor_advanced.adoc
        // Expected: readerTestProcessLineReturnsNilIfCursorAdvanced
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `peek_line advances cursor to next conditional line of content`() {
        // Input: asciidoctor/reader_test_peek_line_advances_cursor_to_next_conditional_line_of_content.adoc
        // Expected: readerTestPeekLineAdvancesCursorToNextConditionalLineOfContent
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `peek_lines should preprocess lines if direct is false`() {
        // Input: asciidoctor/reader_test_peek_lines_should_preprocess_lines_if_direct_is_false.adoc
        // Expected: readerTestPeekLinesShouldPreprocessLinesIfDirectIsFalse
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `peek_lines should not preprocess lines if direct is true`() {
        // Input: asciidoctor/reader_test_peek_lines_should_not_preprocess_lines_if_direct_is_true.adoc
        // Expected: readerTestPeekLinesShouldNotPreprocessLinesIfDirectIsTrue
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `peek_lines should not prevent subsequent preprocessing of peeked lines`() {
        // Input: asciidoctor/reader_test_peek_lines_should_not_prevent_subsequent_preprocessing_of_peeked_lines.adoc
        // Expected: readerTestPeekLinesShouldNotPreventSubsequentPreprocessingOfPeekedLines
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `process_line returns line if cursor not advanced`() {
        // Input: asciidoctor/reader_test_process_line_returns_line_if_cursor_not_advanced.adoc
        // Expected: readerTestProcessLineReturnsLineIfCursorNotAdvanced
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `peek_line does not advance cursor when on a regular content line`() {
        // Input: asciidoctor/reader_test_peek_line_does_not_advance_cursor_when_on_a_regular_content_line.adoc
        // Expected: readerTestPeekLineDoesNotAdvanceCursorWhenOnARegularContentLine
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `peek_line returns nil if cursor advances past end of source`() {
        // Input: asciidoctor/reader_test_peek_line_returns_nil_if_cursor_advances_past_end_of_source.adoc
        // Expected: readerTestPeekLineReturnsNilIfCursorAdvancesPastEndOfSource
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `peek_line returns nil if contents of skipped conditional is empty line`() {
        // Input: asciidoctor/reader_test_peek_line_returns_nil_if_contents_of_skipped_conditional_is_empty_line.adoc
        // Expected: readerTestPeekLineReturnsNilIfContentsOfSkippedConditionalIsEmptyLine
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `ifdef with defined attribute includes content`() {
        // Input: asciidoctor/reader_test_ifdef_with_defined_attribute_includes_content.adoc
        // Expected: readerTestIfdefWithDefinedAttributeIncludesContent
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `ifdef with defined attribute includes text in brackets`() {
        // Input: asciidoctor/reader_test_ifdef_with_defined_attribute_includes_text_in_brackets.adoc
        // Expected: readerTestIfdefWithDefinedAttributeIncludesTextInBrackets
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `ifdef attribute name is not case sensitive`() {
        // Input: asciidoctor/reader_test_ifdef_attribute_name_is_not_case_sensitive.adoc
        // Expected: readerTestIfdefAttributeNameIsNotCaseSensitive
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `ifndef with defined attribute does not include text in brackets`() {
        // Input: asciidoctor/reader_test_ifndef_with_defined_attribute_does_not_include_text_in_brackets.adoc
        // Expected: readerTestIfndefWithDefinedAttributeDoesNotIncludeTextInBrackets
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `include with non-matching nested exclude`() {
        // Input: asciidoctor/reader_test_include_with_non_matching_nested_exclude.adoc
        // Expected: readerTestIncludeWithNonMatchingNestedExclude
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `nested excludes with same condition`() {
        // Input: asciidoctor/reader_test_nested_excludes_with_same_condition.adoc
        // Expected: readerTestNestedExcludesWithSameCondition
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `include with nested exclude of inverted condition`() {
        // Input: asciidoctor/reader_test_include_with_nested_exclude_of_inverted_condition.adoc
        // Expected: readerTestIncludeWithNestedExcludeOfInvertedCondition
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `exclude with matching nested exclude`() {
        // Input: asciidoctor/reader_test_exclude_with_matching_nested_exclude.adoc
        // Expected: readerTestExcludeWithMatchingNestedExclude
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `exclude with nested include using shorthand end`() {
        // Input: asciidoctor/reader_test_exclude_with_nested_include_using_shorthand_end.adoc
        // Expected: readerTestExcludeWithNestedIncludeUsingShorthandEnd
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `ifdef with one alternative attribute set includes content`() {
        // Input: asciidoctor/reader_test_ifdef_with_one_alternative_attribute_set_includes_content.adoc
        // Expected: readerTestIfdefWithOneAlternativeAttributeSetIncludesContent
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `ifdef with no alternative attributes set does not include content`() {
        // Input: asciidoctor/reader_test_ifdef_with_no_alternative_attributes_set_does_not_include_content.adoc
        // Expected: readerTestIfdefWithNoAlternativeAttributesSetDoesNotIncludeContent
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `ifdef with all required attributes set includes content`() {
        // Input: asciidoctor/reader_test_ifdef_with_all_required_attributes_set_includes_content.adoc
        // Expected: readerTestIfdefWithAllRequiredAttributesSetIncludesContent
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `ifdef with missing required attributes does not include content`() {
        // Input: asciidoctor/reader_test_ifdef_with_missing_required_attributes_does_not_include_content.adoc
        // Expected: readerTestIfdefWithMissingRequiredAttributesDoesNotIncludeContent
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `ifndef with undefined attribute includes block`() {
        // Input: asciidoctor/reader_test_ifndef_with_undefined_attribute_includes_block.adoc
        // Expected: readerTestIfndefWithUndefinedAttributeIncludesBlock
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `ifndef with one alternative attribute set does not include content`() {
        // Input: asciidoctor/reader_test_ifndef_with_one_alternative_attribute_set_does_not_include_content.adoc
        // Expected: readerTestIfndefWithOneAlternativeAttributeSetDoesNotIncludeContent
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `ifndef with both alternative attributes set does not include content`() {
        // Input: asciidoctor/reader_test_ifndef_with_both_alternative_attributes_set_does_not_include_content.adoc
        // Expected: readerTestIfndefWithBothAlternativeAttributesSetDoesNotIncludeContent
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `ifndef with no alternative attributes set includes content`() {
        // Input: asciidoctor/reader_test_ifndef_with_no_alternative_attributes_set_includes_content.adoc
        // Expected: readerTestIfndefWithNoAlternativeAttributesSetIncludesContent
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `ifndef with no required attributes set includes content`() {
        // Input: asciidoctor/reader_test_ifndef_with_no_required_attributes_set_includes_content.adoc
        // Expected: readerTestIfndefWithNoRequiredAttributesSetIncludesContent
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `ifndef with all required attributes set does not include content`() {
        // Input: asciidoctor/reader_test_ifndef_with_all_required_attributes_set_does_not_include_content.adoc
        // Expected: readerTestIfndefWithAllRequiredAttributesSetDoesNotIncludeContent
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `ifndef with at least one required attributes set does not include content`() {
        // Input: asciidoctor/reader_test_ifndef_with_at_least_one_required_attributes_set_does_not_include_content.adoc
        // Expected: readerTestIfndefWithAtLeastOneRequiredAttributesSetDoesNotIncludeContent
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `ifdef around empty line does not introduce extra line`() {
        // Input: asciidoctor/reader_test_ifdef_around_empty_line_does_not_introduce_extra_line.adoc
        // Expected: readerTestIfdefAroundEmptyLineDoesNotIntroduceExtraLine
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should log warning if endif is unmatched`() {
        // Input: asciidoctor/reader_test_should_log_warning_if_endif_is_unmatched.adoc
        // Expected: readerTestShouldLogWarningIfEndifIsUnmatched
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should log warning if endif is mismatched`() {
        // Input: asciidoctor/reader_test_should_log_warning_if_endif_is_mismatched.adoc
        // Expected: readerTestShouldLogWarningIfEndifIsMismatched
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should log warning if endif contains text`() {
        // Input: asciidoctor/reader_test_should_log_warning_if_endif_contains_text.adoc
        // Expected: readerTestShouldLogWarningIfEndifContainsText
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `escaped ifdef is unescaped and ignored`() {
        // Input: asciidoctor/reader_test_escaped_ifdef_is_unescaped_and_ignored.adoc
        // Expected: readerTestEscapedIfdefIsUnescapedAndIgnored
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `ifeval comparing missing attribute to nil includes content`() {
        // Input: asciidoctor/reader_test_ifeval_comparing_missing_attribute_to_nil_includes_content.adoc
        // Expected: readerTestIfevalComparingMissingAttributeToNilIncludesContent
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `ifeval comparing missing attribute to 0 drops content`() {
        // Input: asciidoctor/reader_test_ifeval_comparing_missing_attribute_to_0_drops_content.adoc
        // Expected: readerTestIfevalComparingMissingAttributeTo0DropsContent
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `ifeval running unsupported operation on missing attribute drops content`() {
        // Input: asciidoctor/reader_test_ifeval_running_unsupported_operation_on_missing_attribute_drops_content.adoc
        // Expected: readerTestIfevalRunningUnsupportedOperationOnMissingAttributeDropsContent
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `ifeval running invalid operation drops content`() {
        // Input: asciidoctor/reader_test_ifeval_running_invalid_operation_drops_content.adoc
        // Expected: readerTestIfevalRunningInvalidOperationDropsContent
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `ifeval comparing double-quoted attribute to matching string includes content`() {
        // Input: asciidoctor/reader_test_ifeval_comparing_double_quoted_attribute_to_matching_string_includes_content.adoc
        // Expected: readerTestIfevalComparingDoubleQuotedAttributeToMatchingStringIncludesContent
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `ifeval comparing single-quoted attribute to matching string includes content`() {
        // Input: asciidoctor/reader_test_ifeval_comparing_single_quoted_attribute_to_matching_string_includes_content.adoc
        // Expected: readerTestIfevalComparingSingleQuotedAttributeToMatchingStringIncludesContent
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `ifeval comparing quoted attribute to non-matching string drops content`() {
        // Input: asciidoctor/reader_test_ifeval_comparing_quoted_attribute_to_non_matching_string_drops_content.adoc
        // Expected: readerTestIfevalComparingQuotedAttributeToNonMatchingStringDropsContent
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `ifeval comparing attribute to lower version number includes content`() {
        // Input: asciidoctor/reader_test_ifeval_comparing_attribute_to_lower_version_number_includes_content.adoc
        // Expected: readerTestIfevalComparingAttributeToLowerVersionNumberIncludesContent
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `ifeval comparing attribute to self includes content`() {
        // Input: asciidoctor/reader_test_ifeval_comparing_attribute_to_self_includes_content.adoc
        // Expected: readerTestIfevalComparingAttributeToSelfIncludesContent
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `ifeval arguments can be transposed`() {
        // Input: asciidoctor/reader_test_ifeval_arguments_can_be_transposed.adoc
        // Expected: readerTestIfevalArgumentsCanBeTransposed
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `ifeval matching numeric equality includes content`() {
        // Input: asciidoctor/reader_test_ifeval_matching_numeric_equality_includes_content.adoc
        // Expected: readerTestIfevalMatchingNumericEqualityIncludesContent
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `ifeval matching numeric inequality includes content`() {
        // Input: asciidoctor/reader_test_ifeval_matching_numeric_inequality_includes_content.adoc
        // Expected: readerTestIfevalMatchingNumericInequalityIncludesContent
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should warn if ifeval has target`() {
        // Input: asciidoctor/reader_test_should_warn_if_ifeval_has_target.adoc
        // Expected: readerTestShouldWarnIfIfevalHasTarget
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should warn if ifeval has invalid expression`() {
        // Input: asciidoctor/reader_test_should_warn_if_ifeval_has_invalid_expression.adoc
        // Expected: readerTestShouldWarnIfIfevalHasInvalidExpression
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should warn if ifeval is missing expression`() {
        // Input: asciidoctor/reader_test_should_warn_if_ifeval_is_missing_expression.adoc
        // Expected: readerTestShouldWarnIfIfevalIsMissingExpression
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `ifdef with no target is ignored`() {
        // Input: asciidoctor/reader_test_ifdef_with_no_target_is_ignored.adoc
        // Expected: readerTestIfdefWithNoTargetIsIgnored
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not warn about invalid ifdef preprocessor directive if already skipping`() {
        // Input: asciidoctor/reader_test_should_not_warn_about_invalid_ifdef_preprocessor_directive_if_already_skipping.adoc
        // Expected: readerTestShouldNotWarnAboutInvalidIfdefPreprocessorDirectiveIfAlreadySkipping
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not warn about invalid ifeval preprocessor directive if already skipping`() {
        // Input: asciidoctor/reader_test_should_not_warn_about_invalid_ifeval_preprocessor_directive_if_already_skipping.adoc
        // Expected: readerTestShouldNotWarnAboutInvalidIfevalPreprocessorDirectiveIfAlreadySkipping
    }

}
