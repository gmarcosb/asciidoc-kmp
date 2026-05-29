package com.kmplibs.asciidoc.integration

import kotlin.test.Test
import kotlin.test.Ignore

class ApiTest {

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should load input file`() {
        // Input: asciidoctor/api_test_should_load_input_file.adoc
        // Expected: apiTestShouldLoadInputFile
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should load input string`() {
        // Input: asciidoctor/api_test_should_load_input_string.adoc
        // Expected: apiTestShouldLoadInputString
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should load input string array`() {
        // Input: asciidoctor/api_test_should_load_input_string_array.adoc
        // Expected: apiTestShouldLoadInputStringArray
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should load nil input`() {
        // Input: asciidoctor/api_test_should_load_nil_input.adoc
        // Expected: apiTestShouldLoadNilInput
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `render method on node is aliased to convert method`() {
        // Input: asciidoctor/api_test_render_method_on_node_is_aliased_to_convert_method.adoc
        // Expected: apiTestRenderMethodOnNodeIsAliasedToConvertMethod
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `content method on Inline node is aliased to text method`() {
        // Input: asciidoctor/api_test_content_method_on_inline_node_is_aliased_to_text_method.adoc
        // Expected: apiTestContentMethodOnInlineNodeIsAliasedToTextMethod
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should track file and line information with blocks if sourcemap option is set`() {
        // Input: asciidoctor/api_test_should_track_file_and_line_information_with_blocks_if_sourcemap_option_is_set.adoc
        // Expected: apiTestShouldTrackFileAndLineInformationWithBlocksIfSourcemapOptionIsSet
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should assign correct lineno for multi-line paragraph inside a conditional preprocessor directive`() {
        // Input: asciidoctor/api_test_should_assign_correct_lineno_for_multi_line_paragraph_inside_a_conditional_preprocessor_directive.adoc
        // Expected: apiTestShouldAssignCorrectLinenoForMultiLineParagraphInsideAConditionalPreprocessorDirective
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should assign correct source location to blocks that follow a detached list continuation`() {
        // Input: asciidoctor/api_test_should_assign_correct_source_location_to_blocks_that_follow_a_detached_list_continuation.adoc
        // Expected: apiTestShouldAssignCorrectSourceLocationToBlocksThatFollowADetachedListContinuation
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should assign correct source location if section occurs on last line of input`() {
        // Input: asciidoctor/api_test_should_assign_correct_source_location_if_section_occurs_on_last_line_of_input.adoc
        // Expected: apiTestShouldAssignCorrectSourceLocationIfSectionOccursOnLastLineOfInput
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should allow sourcemap option on document to be modified before document is parsed`() {
        // Input: asciidoctor/api_test_should_allow_sourcemap_option_on_document_to_be_modified_before_document_is_parsed.adoc
        // Expected: apiTestShouldAllowSourcemapOptionOnDocumentToBeModifiedBeforeDocumentIsParsed
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `find_by should return an empty Array if no matches are found`() {
        // Input: asciidoctor/api_test_find_by_should_return_an_empty_array_if_no_matches_are_found.adoc
        // Expected: apiTestFindByShouldReturnAnEmptyArrayIfNoMatchesAreFound
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `find_by should discover blocks inside AsciiDoc table cells if traverse_documents selector option is true`() {
        // Input: asciidoctor/api_test_find_by_should_discover_blocks_inside_ascii_doc_table_cells_if_traverse_documents_selector_option_is_true.adoc
        // Expected: apiTestFindByShouldDiscoverBlocksInsideAsciiDocTableCellsIfTraverseDocumentsSelectorOptionIsTrue
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `find_by should return inner document of AsciiDoc table cell if traverse_documents selector option is true`() {
        // Input: asciidoctor/api_test_find_by_should_return_inner_document_of_ascii_doc_table_cell_if_traverse_documents_selector_option_is_true.adoc
        // Expected: apiTestFindByShouldReturnInnerDocumentOfAsciiDocTableCellIfTraverseDocumentsSelectorOptionIsTrue
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `find_by should match table cells`() {
        // Input: asciidoctor/api_test_find_by_should_match_table_cells.adoc
        // Expected: apiTestFindByShouldMatchTableCells
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `find_by should return Array of blocks that match style criteria`() {
        // Input: asciidoctor/api_test_find_by_should_return_array_of_blocks_that_match_style_criteria.adoc
        // Expected: apiTestFindByShouldReturnArrayOfBlocksThatMatchStyleCriteria
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `find_by should return Array of blocks that match role criteria`() {
        // Input: asciidoctor/api_test_find_by_should_return_array_of_blocks_that_match_role_criteria.adoc
        // Expected: apiTestFindByShouldReturnArrayOfBlocksThatMatchRoleCriteria
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `find_by should return the document title section if context selector is _section`() {
        // Input: asciidoctor/api_test_find_by_should_return_the_document_title_section_if_context_selector_is_section.adoc
        // Expected: apiTestFindByShouldReturnTheDocumentTitleSectionIfContextSelectorIssection
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `find_by should only return results for which the block argument yields true`() {
        // Input: asciidoctor/api_test_find_by_should_only_return_results_for_which_the_block_argument_yields_true.adoc
        // Expected: apiTestFindByShouldOnlyReturnResultsForWhichTheBlockArgumentYieldsTrue
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `find_by should reject node and its children if block returns _reject`() {
        // Input: asciidoctor/api_test_find_by_should_reject_node_and_its_children_if_block_returns_reject.adoc
        // Expected: apiTestFindByShouldRejectNodeAndItsChildrenIfBlockReturnsreject
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `find_by should reject node matched by ID selector if block returns _reject`() {
        // Input: asciidoctor/api_test_find_by_should_reject_node_matched_by_id_selector_if_block_returns_reject.adoc
        // Expected: apiTestFindByShouldRejectNodeMatchedByIdSelectorIfBlockReturnsreject
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `find_by should accept node matched by ID selector if block returns _prune`() {
        // Input: asciidoctor/api_test_find_by_should_accept_node_matched_by_id_selector_if_block_returns_prune.adoc
        // Expected: apiTestFindByShouldAcceptNodeMatchedByIdSelectorIfBlockReturnsprune
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `find_by should accept node but reject its children if block returns _prune`() {
        // Input: asciidoctor/api_test_find_by_should_accept_node_but_reject_its_children_if_block_returns_prune.adoc
        // Expected: apiTestFindByShouldAcceptNodeButRejectItsChildrenIfBlockReturnsprune
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `find_by should stop looking for blocks when StopIteration is raised`() {
        // Input: asciidoctor/api_test_find_by_should_stop_looking_for_blocks_when_stop_iteration_is_raised.adoc
        // Expected: apiTestFindByShouldStopLookingForBlocksWhenStopIterationIsRaised
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `find_by should stop looking for blocks when filter block returns _stop directive`() {
        // Input: asciidoctor/api_test_find_by_should_stop_looking_for_blocks_when_filter_block_returns_stop_directive.adoc
        // Expected: apiTestFindByShouldStopLookingForBlocksWhenFilterBlockReturnsstopDirective
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `find_by should only return one result when matching by id`() {
        // Input: asciidoctor/api_test_find_by_should_only_return_one_result_when_matching_by_id.adoc
        // Expected: apiTestFindByShouldOnlyReturnOneResultWhenMatchingById
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `find_by should stop seeking once match is found`() {
        // Input: asciidoctor/api_test_find_by_should_stop_seeking_once_match_is_found.adoc
        // Expected: apiTestFindByShouldStopSeekingOnceMatchIsFound
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `find_by should return an empty Array if the id criteria matches but the block argument yields false`() {
        // Input: asciidoctor/api_test_find_by_should_return_an_empty_array_if_the_id_criteria_matches_but_the_block_argument_yields_false.adoc
        // Expected: apiTestFindByShouldReturnAnEmptyArrayIfTheIdCriteriaMatchesButTheBlockArgumentYieldsFalse
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `find_by should not crash if dlist entry does not have description`() {
        // Input: asciidoctor/api_test_find_by_should_not_crash_if_dlist_entry_does_not_have_description.adoc
        // Expected: apiTestFindByShouldNotCrashIfDlistEntryDoesNotHaveDescription
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `can substitute an extended syntax highlighter factory implementation using the _syntax_highlighters option`() {
        // Input: asciidoctor/api_test_can_substitute_an_extended_syntax_highlighter_factory_implementation_using_the_syntax_highlighters_option.adoc
        // Expected: apiTestCanSubstituteAnExtendedSyntaxHighlighterFactoryImplementationUsingThesyntaxHighlightersOption
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `render_file is aliased to convert_file`() {
        // Input: asciidoctor/api_test_render_file_is_aliased_to_convert_file.adoc
        // Expected: apiTestRenderFileIsAliasedToConvertFile
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should embed remote stylesheet by default if SafeMode is less than SECURE and allow-uri-read is set`() {
        // Input: asciidoctor/api_test_should_embed_remote_stylesheet_by_default_if_safe_mode_is_less_than_secure_and_allow_uri_read_is_set.adoc
        // Expected: apiTestShouldEmbedRemoteStylesheetByDefaultIfSafeModeIsLessThanSecureAndAllowUriReadIsSet
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not allow linkcss be unset from document if SafeMode is SECURE or greater`() {
        // Input: asciidoctor/api_test_should_not_allow_linkcss_be_unset_from_document_if_safe_mode_is_secure_or_greater.adoc
        // Expected: apiTestShouldNotAllowLinkcssBeUnsetFromDocumentIfSafeModeIsSecureOrGreater
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should embed default stylesheet if linkcss is unset from API and SafeMode is SECURE or greater`() {
        // Input: asciidoctor/api_test_should_embed_default_stylesheet_if_linkcss_is_unset_from_api_and_safe_mode_is_secure_or_greater.adoc
        // Expected: apiTestShouldEmbedDefaultStylesheetIfLinkcssIsUnsetFromApiAndSafeModeIsSecureOrGreater
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should embed default stylesheet if safe mode is less than SECURE and linkcss is unset from API`() {
        // Input: asciidoctor/api_test_should_embed_default_stylesheet_if_safe_mode_is_less_than_secure_and_linkcss_is_unset_from_api.adoc
        // Expected: apiTestShouldEmbedDefaultStylesheetIfSafeModeIsLessThanSecureAndLinkcssIsUnsetFromApi
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should link to custom stylesheet if specified in stylesheet attribute`() {
        // Input: asciidoctor/api_test_should_link_to_custom_stylesheet_if_specified_in_stylesheet_attribute.adoc
        // Expected: apiTestShouldLinkToCustomStylesheetIfSpecifiedInStylesheetAttribute
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should resolve custom stylesheet relative to stylesdir`() {
        // Input: asciidoctor/api_test_should_resolve_custom_stylesheet_relative_to_stylesdir.adoc
        // Expected: apiTestShouldResolveCustomStylesheetRelativeToStylesdir
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should resolve custom stylesheet to embed relative to stylesdir`() {
        // Input: asciidoctor/api_test_should_resolve_custom_stylesheet_to_embed_relative_to_stylesdir.adoc
        // Expected: apiTestShouldResolveCustomStylesheetToEmbedRelativeToStylesdir
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should embed custom stylesheet in remote stylesdir if SafeMode is less than SECURE and allow-uri-read is set`() {
        // Input: asciidoctor/api_test_should_embed_custom_stylesheet_in_remote_stylesdir_if_safe_mode_is_less_than_secure_and_allow_uri_read_is_set.adoc
        // Expected: apiTestShouldEmbedCustomStylesheetInRemoteStylesdirIfSafeModeIsLessThanSecureAndAllowUriReadIsSet
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should respect outfilesuffix soft set from API`() {
        // Input: asciidoctor/api_test_should_respect_outfilesuffix_soft_set_from_api.adoc
        // Expected: apiTestShouldRespectOutfilesuffixSoftSetFromApi
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `with no author`() {
        // Input: asciidoctor/api_test_with_no_author.adoc
        // Expected: apiTestWithNoAuthor
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `with one author`() {
        // Input: asciidoctor/api_test_with_one_author.adoc
        // Expected: apiTestWithOneAuthor
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `with two authors`() {
        // Input: asciidoctor/api_test_with_two_authors.adoc
        // Expected: apiTestWithTwoAuthors
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `with authors as attributes`() {
        // Input: asciidoctor/api_test_with_authors_as_attributes.adoc
        // Expected: apiTestWithAuthorsAsAttributes
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not crash if nil cell text is passed to Cell constructor`() {
        // Input: asciidoctor/api_test_should_not_crash_if_nil_cell_text_is_passed_to_cell_constructor.adoc
        // Expected: apiTestShouldNotCrashIfNilCellTextIsPassedToCellConstructor
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should set option on node when set_option is called`() {
        // Input: asciidoctor/api_test_should_set_option_on_node_when_set_option_is_called.adoc
        // Expected: apiTestShouldSetOptionOnNodeWhenSetOptionIsCalled
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `enabled_options should return all options which are set`() {
        // Input: asciidoctor/api_test_enabled_options_should_return_all_options_which_are_set.adoc
        // Expected: apiTestEnabledOptionsShouldReturnAllOptionsWhichAreSet
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should append option to existing options`() {
        // Input: asciidoctor/api_test_should_append_option_to_existing_options.adoc
        // Expected: apiTestShouldAppendOptionToExistingOptions
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not append option if option is already set`() {
        // Input: asciidoctor/api_test_should_not_append_option_if_option_is_already_set.adoc
        // Expected: apiTestShouldNotAppendOptionIfOptionIsAlreadySet
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should return set of option names`() {
        // Input: asciidoctor/api_test_should_return_set_of_option_names.adoc
        // Expected: apiTestShouldReturnSetOfOptionNames
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should set linenums option if linenums enabled on source block`() {
        // Input: asciidoctor/api_test_should_set_linenums_option_if_linenums_enabled_on_source_block.adoc
        // Expected: apiTestShouldSetLinenumsOptionIfLinenumsEnabledOnSourceBlock
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should set linenums option if linenums enabled on fenced code block`() {
        // Input: asciidoctor/api_test_should_set_linenums_option_if_linenums_enabled_on_fenced_code_block.adoc
        // Expected: apiTestShouldSetLinenumsOptionIfLinenumsEnabledOnFencedCodeBlock
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not set linenums attribute if linenums option is enabled on source block`() {
        // Input: asciidoctor/api_test_should_not_set_linenums_attribute_if_linenums_option_is_enabled_on_source_block.adoc
        // Expected: apiTestShouldNotSetLinenumsAttributeIfLinenumsOptionIsEnabledOnSourceBlock
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not set linenums attribute if linenums option is enabled on fenced code block`() {
        // Input: asciidoctor/api_test_should_not_set_linenums_attribute_if_linenums_option_is_enabled_on_fenced_code_block.adoc
        // Expected: apiTestShouldNotSetLinenumsAttributeIfLinenumsOptionIsEnabledOnFencedCodeBlock
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `table column should not be a block or inline`() {
        // Input: asciidoctor/api_test_table_column_should_not_be_a_block_or_inline.adoc
        // Expected: apiTestTableColumnShouldNotBeABlockOrInline
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `table cell should be a block`() {
        // Input: asciidoctor/api_test_table_cell_should_be_a_block.adoc
        // Expected: apiTestTableCellShouldBeABlock
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `next_adjacent_block should return next block`() {
        // Input: asciidoctor/api_test_next_adjacent_block_should_return_next_block.adoc
        // Expected: apiTestNextAdjacentBlockShouldReturnNextBlock
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `next_adjacent_block should return next sibling of parent if called on last sibling`() {
        // Input: asciidoctor/api_test_next_adjacent_block_should_return_next_sibling_of_parent_if_called_on_last_sibling.adoc
        // Expected: apiTestNextAdjacentBlockShouldReturnNextSiblingOfParentIfCalledOnLastSibling
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `next_adjacent_block should return next sibling of list if called on last item`() {
        // Input: asciidoctor/api_test_next_adjacent_block_should_return_next_sibling_of_list_if_called_on_last_item.adoc
        // Expected: apiTestNextAdjacentBlockShouldReturnNextSiblingOfListIfCalledOnLastItem
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `next_adjacent_block should return next item in dlist if called on last block of list item`() {
        // Input: asciidoctor/api_test_next_adjacent_block_should_return_next_item_in_dlist_if_called_on_last_block_of_list_item.adoc
        // Expected: apiTestNextAdjacentBlockShouldReturnNextItemInDlistIfCalledOnLastBlockOfListItem
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should return true when sections? is called on a document or section that has sections`() {
        // Input: asciidoctor/api_test_should_return_true_when_sections_is_called_on_a_document_or_section_that_has_sections.adoc
        // Expected: apiTestShouldReturnTrueWhenSectionsIsCalledOnADocumentOrSectionThatHasSections
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should return false when sections? is called on a document with no sections`() {
        // Input: asciidoctor/api_test_should_return_false_when_sections_is_called_on_a_document_with_no_sections.adoc
        // Expected: apiTestShouldReturnFalseWhenSectionsIsCalledOnADocumentWithNoSections
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should return false when sections? is called on a section with no sections`() {
        // Input: asciidoctor/api_test_should_return_false_when_sections_is_called_on_a_section_with_no_sections.adoc
        // Expected: apiTestShouldReturnFalseWhenSectionsIsCalledOnASectionWithNoSections
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should return false when sections? is called on anything that is not a section`() {
        // Input: asciidoctor/api_test_should_return_false_when_sections_is_called_on_anything_that_is_not_a_section.adoc
        // Expected: apiTestShouldReturnFalseWhenSectionsIsCalledOnAnythingThatIsNotASection
    }

}
