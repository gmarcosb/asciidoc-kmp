package com.kmplibs.asciidoc.integration

import kotlin.test.Test
import kotlin.test.Ignore

class LinksTest {

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `unescapes square bracket in reftext of anchor macro`() {
        // Input: asciidoctor/links_test_unescapes_square_bracket_in_reftext_of_anchor_macro.adoc
        // Expected: linksTestUnescapesSquareBracketInReftextOfAnchorMacro
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `xref using angled bracket syntax with label`() {
        // Input: asciidoctor/links_test_xref_using_angled_bracket_syntax_with_label.adoc
        // Expected: linksTestXrefUsingAngledBracketSyntaxWithLabel
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `xref should use title of target as link text when no explicit reftext is specified`() {
        // Input: asciidoctor/links_test_xref_should_use_title_of_target_as_link_text_when_no_explicit_reftext_is_specified.adoc
        // Expected: linksTestXrefShouldUseTitleOfTargetAsLinkTextWhenNoExplicitReftextIsSpecified
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `xref should use title of target as link text when explicit link text is empty`() {
        // Input: asciidoctor/links_test_xref_should_use_title_of_target_as_link_text_when_explicit_link_text_is_empty.adoc
        // Expected: linksTestXrefShouldUseTitleOfTargetAsLinkTextWhenExplicitLinkTextIsEmpty
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `xref using angled bracket syntax with quoted label`() {
        // Input: asciidoctor/links_test_xref_using_angled_bracket_syntax_with_quoted_label.adoc
        // Expected: linksTestXrefUsingAngledBracketSyntaxWithQuotedLabel
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `xref using angled bracket syntax inline with text`() {
        // Input: asciidoctor/links_test_xref_using_angled_bracket_syntax_inline_with_text.adoc
        // Expected: linksTestXrefUsingAngledBracketSyntaxInlineWithText
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `xref using angled bracket syntax with multi-line label inline with text`() {
        // Input: asciidoctor/links_test_xref_using_angled_bracket_syntax_with_multi_line_label_inline_with_text.adoc
        // Expected: linksTestXrefUsingAngledBracketSyntaxWithMultiLineLabelInlineWithText
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `xref with escaped text`() {
        // Input: asciidoctor/links_test_xref_with_escaped_text.adoc
        // Expected: linksTestXrefWithEscapedText
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `xref using macro syntax`() {
        // Input: asciidoctor/links_test_xref_using_macro_syntax.adoc
        // Expected: linksTestXrefUsingMacroSyntax
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `xref using macro syntax with explicit hash`() {
        // Input: asciidoctor/links_test_xref_using_macro_syntax_with_explicit_hash.adoc
        // Expected: linksTestXrefUsingMacroSyntaxWithExplicitHash
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `xref using macro syntax inline with text`() {
        // Input: asciidoctor/links_test_xref_using_macro_syntax_inline_with_text.adoc
        // Expected: linksTestXrefUsingMacroSyntaxInlineWithText
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `xref using macro syntax with multi-line label inline with text`() {
        // Input: asciidoctor/links_test_xref_using_macro_syntax_with_multi_line_label_inline_with_text.adoc
        // Expected: linksTestXrefUsingMacroSyntaxWithMultiLineLabelInlineWithText
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `xref using macro syntax with text that ends with an escaped closing bracket`() {
        // Input: asciidoctor/links_test_xref_using_macro_syntax_with_text_that_ends_with_an_escaped_closing_bracket.adoc
        // Expected: linksTestXrefUsingMacroSyntaxWithTextThatEndsWithAnEscapedClosingBracket
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `xref using macro syntax with text that contains an escaped closing bracket`() {
        // Input: asciidoctor/links_test_xref_using_macro_syntax_with_text_that_contains_an_escaped_closing_bracket.adoc
        // Expected: linksTestXrefUsingMacroSyntaxWithTextThatContainsAnEscapedClosingBracket
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `unescapes square bracket in reftext used by xref`() {
        // Input: asciidoctor/links_test_unescapes_square_bracket_in_reftext_used_by_xref.adoc
        // Expected: linksTestUnescapesSquareBracketInReftextUsedByXref
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `xref using invalid macro syntax does not create link`() {
        // Input: asciidoctor/links_test_xref_using_invalid_macro_syntax_does_not_create_link.adoc
        // Expected: linksTestXrefUsingInvalidMacroSyntaxDoesNotCreateLink
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not warn if verbose flag is set and reference is found in compat mode`() {
        // Input: asciidoctor/links_test_should_not_warn_if_verbose_flag_is_set_and_reference_is_found_in_compat_mode.adoc
        // Expected: linksTestShouldNotWarnIfVerboseFlagIsSetAndReferenceIsFoundInCompatMode
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should warn and create link if verbose flag is set and reference using # notation is not found`() {
        // Input: asciidoctor/links_test_should_warn_and_create_link_if_verbose_flag_is_set_and_reference_using_#_notation_is_not_found.adoc
        // Expected: linksTestShouldWarnAndCreateLinkIfVerboseFlagIsSetAndReferenceUsingNotationIsNotFound
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should produce an internal anchor from an inter-document xref to file included into current file`() {
        // Input: asciidoctor/links_test_should_produce_an_internal_anchor_from_an_inter_document_xref_to_file_included_into_current_file.adoc
        // Expected: linksTestShouldProduceAnInternalAnchorFromAnInterDocumentXrefToFileIncludedIntoCurrentFile
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should produce an internal anchor from an inter-document xref to file included entirely into current file using tags`() {
        // Input: asciidoctor/links_test_should_produce_an_internal_anchor_from_an_inter_document_xref_to_file_included_entirely_into_current_file_using_tags.adoc
        // Expected: linksTestShouldProduceAnInternalAnchorFromAnInterDocumentXrefToFileIncludedEntirelyIntoCurrentFileUsingTags
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not produce an internal anchor for inter-document xref to file partially included into current file`() {
        // Input: asciidoctor/links_test_should_not_produce_an_internal_anchor_for_inter_document_xref_to_file_partially_included_into_current_file.adoc
        // Expected: linksTestShouldNotProduceAnInternalAnchorForInterDocumentXrefToFilePartiallyIncludedIntoCurrentFile
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should produce an internal anchor for inter-document xref to file included fully and partially`() {
        // Input: asciidoctor/links_test_should_produce_an_internal_anchor_for_inter_document_xref_to_file_included_fully_and_partially.adoc
        // Expected: linksTestShouldProduceAnInternalAnchorForInterDocumentXrefToFileIncludedFullyAndPartially
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should warn and create link if debug mode is enabled, inter-document xref points to current doc, and reference not found`() {
        // Input: asciidoctor/links_test_should_warn_and_create_link_if_debug_mode_is_enabled_inter_document_xref_points_to_current_doc_and_reference_not_found.adoc
        // Expected: linksTestShouldWarnAndCreateLinkIfDebugModeIsEnabledInterDocumentXrefPointsToCurrentDocAndReferenceNotFound
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should use doctitle as fallback link text if inter-document xref points to current doc and no link text is provided`() {
        // Input: asciidoctor/links_test_should_use_doctitle_as_fallback_link_text_if_inter_document_xref_points_to_current_doc_and_no_link_text_is_provided.adoc
        // Expected: linksTestShouldUseDoctitleAsFallbackLinkTextIfInterDocumentXrefPointsToCurrentDocAndNoLinkTextIsProvided
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should use doctitle of root document as fallback link text for inter-document xref in AsciiDoc table cell that resolves to current doc`() {
        // Input: asciidoctor/links_test_should_use_doctitle_of_root_document_as_fallback_link_text_for_inter_document_xref_in_ascii_doc_table_cell_that_resolves_to_current_doc.adoc
        // Expected: linksTestShouldUseDoctitleOfRootDocumentAsFallbackLinkTextForInterDocumentXrefInAsciiDocTableCellThatResolvesToCurrentDoc
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should use reftext on document as fallback link text if inter-document xref points to current doc and no link text is provided`() {
        // Input: asciidoctor/links_test_should_use_reftext_on_document_as_fallback_link_text_if_inter_document_xref_points_to_current_doc_and_no_link_text_is_provided.adoc
        // Expected: linksTestShouldUseReftextOnDocumentAsFallbackLinkTextIfInterDocumentXrefPointsToCurrentDocAndNoLinkTextIsProvided
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should use reftext on document as fallback link text if xref points to empty fragment and no link text is provided`() {
        // Input: asciidoctor/links_test_should_use_reftext_on_document_as_fallback_link_text_if_xref_points_to_empty_fragment_and_no_link_text_is_provided.adoc
        // Expected: linksTestShouldUseReftextOnDocumentAsFallbackLinkTextIfXrefPointsToEmptyFragmentAndNoLinkTextIsProvided
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should use fallback link text if inter-document xref points to current doc without header and no link text is provided`() {
        // Input: asciidoctor/links_test_should_use_fallback_link_text_if_inter_document_xref_points_to_current_doc_without_header_and_no_link_text_is_provided.adoc
        // Expected: linksTestShouldUseFallbackLinkTextIfInterDocumentXrefPointsToCurrentDocWithoutHeaderAndNoLinkTextIsProvided
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should use fallback link text if fragment of internal xref is empty and no link text is provided`() {
        // Input: asciidoctor/links_test_should_use_fallback_link_text_if_fragment_of_internal_xref_is_empty_and_no_link_text_is_provided.adoc
        // Expected: linksTestShouldUseFallbackLinkTextIfFragmentOfInternalXrefIsEmptyAndNoLinkTextIsProvided
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should use document id as linkend for self xref in DocBook backend`() {
        // Input: asciidoctor/links_test_should_use_document_id_as_linkend_for_self_xref_in_doc_book_backend.adoc
        // Expected: linksTestShouldUseDocumentIdAsLinkendForSelfXrefInDocBookBackend
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should auto-generate document id to use as linkend for self xref in DocBook backend`() {
        // Input: asciidoctor/links_test_should_auto_generate_document_id_to_use_as_linkend_for_self_xref_in_doc_book_backend.adoc
        // Expected: linksTestShouldAutoGenerateDocumentIdToUseAsLinkendForSelfXrefInDocBookBackend
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should produce an internal anchor for inter-document xref to file outside of base directory`() {
        // Input: asciidoctor/links_test_should_produce_an_internal_anchor_for_inter_document_xref_to_file_outside_of_base_directory.adoc
        // Expected: linksTestShouldProduceAnInternalAnchorForInterDocumentXrefToFileOutsideOfBaseDirectory
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `xref uses title of target as label for forward and backward references in html output`() {
        // Input: asciidoctor/links_test_xref_uses_title_of_target_as_label_for_forward_and_backward_references_in_html_output.adoc
        // Expected: linksTestXrefUsesTitleOfTargetAsLabelForForwardAndBackwardReferencesInHtmlOutput
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not fail to resolve broken xref in title of block with ID`() {
        // Input: asciidoctor/links_test_should_not_fail_to_resolve_broken_xref_in_title_of_block_with_id.adoc
        // Expected: linksTestShouldNotFailToResolveBrokenXrefInTitleOfBlockWithId
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should resolve forward xref in title of block with ID`() {
        // Input: asciidoctor/links_test_should_resolve_forward_xref_in_title_of_block_with_id.adoc
        // Expected: linksTestShouldResolveForwardXrefInTitleOfBlockWithId
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not fail to resolve broken xref in section title`() {
        // Input: asciidoctor/links_test_should_not_fail_to_resolve_broken_xref_in_section_title.adoc
        // Expected: linksTestShouldNotFailToResolveBrokenXrefInSectionTitle
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should break circular xref reference in section title`() {
        // Input: asciidoctor/links_test_should_break_circular_xref_reference_in_section_title.adoc
        // Expected: linksTestShouldBreakCircularXrefReferenceInSectionTitle
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should drop nested anchor in xreftext`() {
        // Input: asciidoctor/links_test_should_drop_nested_anchor_in_xreftext.adoc
        // Expected: linksTestShouldDropNestedAnchorInXreftext
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not resolve forward xref evaluated during parsing`() {
        // Input: asciidoctor/links_test_should_not_resolve_forward_xref_evaluated_during_parsing.adoc
        // Expected: linksTestShouldNotResolveForwardXrefEvaluatedDuringParsing
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not resolve forward natural xref evaluated during parsing`() {
        // Input: asciidoctor/links_test_should_not_resolve_forward_natural_xref_evaluated_during_parsing.adoc
        // Expected: linksTestShouldNotResolveForwardNaturalXrefEvaluatedDuringParsing
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should resolve first matching natural xref`() {
        // Input: asciidoctor/links_test_should_resolve_first_matching_natural_xref.adoc
        // Expected: linksTestShouldResolveFirstMatchingNaturalXref
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not match numeric character references while searching for fragment in xref target`() {
        // Input: asciidoctor/links_test_should_not_match_numeric_character_references_while_searching_for_fragment_in_xref_target.adoc
        // Expected: linksTestShouldNotMatchNumericCharacterReferencesWhileSearchingForFragmentInXrefTarget
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not match numeric character references in path of interdocument xref`() {
        // Input: asciidoctor/links_test_should_not_match_numeric_character_references_in_path_of_interdocument_xref.adoc
        // Expected: linksTestShouldNotMatchNumericCharacterReferencesInPathOfInterdocumentXref
    }

}
