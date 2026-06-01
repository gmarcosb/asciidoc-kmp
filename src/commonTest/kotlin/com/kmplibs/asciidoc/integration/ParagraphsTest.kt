package com.kmplibs.asciidoc.integration

import kotlin.test.Test
import kotlin.test.Ignore

class ParagraphsTest {

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should treat plain text separated by blank lines as paragraphs`() {
        // Input: asciidoctor/paragraphs_test_should_treat_plain_text_separated_by_blank_lines_as_paragraphs.adoc
        // Expected: paragraphsTestShouldTreatPlainTextSeparatedByBlankLinesAsParagraphs
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should associate block title with paragraph`() {
        // Input: asciidoctor/paragraphs_test_should_associate_block_title_with_paragraph.adoc
        // Expected: paragraphsTestShouldAssociateBlockTitleWithParagraph
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `no duplicate block before next section`() {
        // Input: asciidoctor/paragraphs_test_no_duplicate_block_before_next_section.adoc
        // Expected: paragraphsTestNoDuplicateBlockBeforeNextSection
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `does not treat wrapped line as a list item`() {
        // Input: asciidoctor/paragraphs_test_does_not_treat_wrapped_line_as_a_list_item.adoc
        // Expected: paragraphsTestDoesNotTreatWrappedLineAsAListItem
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `does not treat wrapped line as a block title`() {
        // Input: asciidoctor/paragraphs_test_does_not_treat_wrapped_line_as_a_block_title.adoc
        // Expected: paragraphsTestDoesNotTreatWrappedLineAsABlockTitle
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `interprets normal paragraph style as normal paragraph`() {
        // Input: asciidoctor/paragraphs_test_interprets_normal_paragraph_style_as_normal_paragraph.adoc
        // Expected: paragraphsTestInterpretsNormalParagraphStyleAsNormalParagraph
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `removes indentation from literal paragraph marked as normal`() {
        // Input: asciidoctor/paragraphs_test_removes_indentation_from_literal_paragraph_marked_as_normal.adoc
        // Expected: paragraphsTestRemovesIndentationFromLiteralParagraphMarkedAsNormal
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `normal paragraph terminates at block attribute list`() {
        // Input: asciidoctor/paragraphs_test_normal_paragraph_terminates_at_block_attribute_list.adoc
        // Expected: paragraphsTestNormalParagraphTerminatesAtBlockAttributeList
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `normal paragraph terminates at block delimiter`() {
        // Input: asciidoctor/paragraphs_test_normal_paragraph_terminates_at_block_delimiter.adoc
        // Expected: paragraphsTestNormalParagraphTerminatesAtBlockDelimiter
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `normal paragraph terminates at list continuation`() {
        // Input: asciidoctor/paragraphs_test_normal_paragraph_terminates_at_list_continuation.adoc
        // Expected: paragraphsTestNormalParagraphTerminatesAtListContinuation
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `normal style turns literal paragraph into normal paragraph`() {
        // Input: asciidoctor/paragraphs_test_normal_style_turns_literal_paragraph_into_normal_paragraph.adoc
        // Expected: paragraphsTestNormalStyleTurnsLiteralParagraphIntoNormalParagraph
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `automatically promotes index terms in DocBook output if indexterm-promotion-option is set`() {
        // Input: asciidoctor/paragraphs_test_automatically_promotes_index_terms_in_doc_book_output_if_indexterm_promotion_option_is_set.adoc
        // Expected: paragraphsTestAutomaticallyPromotesIndexTermsInDocBookOutputIfIndextermPromotionOptionIsSet
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `does not automatically promote index terms in DocBook output if indexterm-promotion-option is not set`() {
        // Input: asciidoctor/paragraphs_test_does_not_automatically_promote_index_terms_in_doc_book_output_if_indexterm_promotion_option_is_not_set.adoc
        // Expected: paragraphsTestDoesNotAutomaticallyPromoteIndexTermsInDocBookOutputIfIndextermPromotionOptionIsNotSet
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `normal paragraph should honor explicit subs list`() {
        // Input: asciidoctor/paragraphs_test_normal_paragraph_should_honor_explicit_subs_list.adoc
        // Expected: paragraphsTestNormalParagraphShouldHonorExplicitSubsList
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `normal paragraph should honor specialchars shorthand`() {
        // Input: asciidoctor/paragraphs_test_normal_paragraph_should_honor_specialchars_shorthand.adoc
        // Expected: paragraphsTestNormalParagraphShouldHonorSpecialcharsShorthand
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should add a hardbreak at end of each line when hardbreaks option is set`() {
        // Input: asciidoctor/paragraphs_test_should_add_a_hardbreak_at_end_of_each_line_when_hardbreaks_option_is_set.adoc
        // Expected: paragraphsTestShouldAddAHardbreakAtEndOfEachLineWhenHardbreaksOptionIsSet
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should be able to toggle hardbreaks by setting hardbreaks-option on document`() {
        // Input: asciidoctor/paragraphs_test_should_be_able_to_toggle_hardbreaks_by_setting_hardbreaks_option_on_document.adoc
        // Expected: paragraphsTestShouldBeAbleToToggleHardbreaksBySettingHardbreaksOptionOnDocument
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `single-line literal paragraphs`() {
        // Input: asciidoctor/paragraphs_test_single_line_literal_paragraphs.adoc
        // Expected: paragraphsTestSingleLineLiteralParagraphs
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `multi-line literal paragraph`() {
        // Input: asciidoctor/paragraphs_test_multi_line_literal_paragraph.adoc
        // Expected: paragraphsTestMultiLineLiteralParagraph
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `literal paragraph`() {
        // Input: asciidoctor/paragraphs_test_literal_paragraph.adoc
        // Expected: paragraphsTestLiteralParagraph
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should read content below literal style verbatim`() {
        // Input: asciidoctor/paragraphs_test_should_read_content_below_literal_style_verbatim.adoc
        // Expected: paragraphsTestShouldReadContentBelowLiteralStyleVerbatim
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `listing paragraph`() {
        // Input: asciidoctor/paragraphs_test_listing_paragraph.adoc
        // Expected: paragraphsTestListingParagraph
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `source paragraph`() {
        // Input: asciidoctor/paragraphs_test_source_paragraph.adoc
        // Expected: paragraphsTestSourceParagraph
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `source code paragraph with language`() {
        // Input: asciidoctor/paragraphs_test_source_code_paragraph_with_language.adoc
        // Expected: paragraphsTestSourceCodeParagraphWithLanguage
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `literal paragraph terminates at block attribute list`() {
        // Input: asciidoctor/paragraphs_test_literal_paragraph_terminates_at_block_attribute_list.adoc
        // Expected: paragraphsTestLiteralParagraphTerminatesAtBlockAttributeList
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `literal paragraph terminates at block delimiter`() {
        // Input: asciidoctor/paragraphs_test_literal_paragraph_terminates_at_block_delimiter.adoc
        // Expected: paragraphsTestLiteralParagraphTerminatesAtBlockDelimiter
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `literal paragraph terminates at list continuation`() {
        // Input: asciidoctor/paragraphs_test_literal_paragraph_terminates_at_list_continuation.adoc
        // Expected: paragraphsTestLiteralParagraphTerminatesAtListContinuation
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `single-line quote paragraph`() {
        // Input: asciidoctor/paragraphs_test_single_line_quote_paragraph.adoc
        // Expected: paragraphsTestSingleLineQuoteParagraph
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `quote paragraph terminates at list continuation`() {
        // Input: asciidoctor/paragraphs_test_quote_paragraph_terminates_at_list_continuation.adoc
        // Expected: paragraphsTestQuoteParagraphTerminatesAtListContinuation
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `verse paragraph`() {
        // Input: asciidoctor/paragraphs_test_verse_paragraph.adoc
        // Expected: paragraphsTestVerseParagraph
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `quote paragraph should honor explicit subs list`() {
        // Input: asciidoctor/paragraphs_test_quote_paragraph_should_honor_explicit_subs_list.adoc
        // Expected: paragraphsTestQuoteParagraphShouldHonorExplicitSubsList
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `note multiline syntax`() {
        // Input: asciidoctor/paragraphs_test_note_multiline_syntax.adoc
        // Expected: paragraphsTestNoteMultilineSyntax
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should wrap text in simpara for styled paragraphs when converted to DocBook`() {
        // Input: asciidoctor/paragraphs_test_should_wrap_text_in_simpara_for_styled_paragraphs_when_converted_to_doc_book.adoc
        // Expected: paragraphsTestShouldWrapTextInSimparaForStyledParagraphsWhenConvertedToDocBook
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should convert open paragraph to open block`() {
        // Input: asciidoctor/paragraphs_test_should_convert_open_paragraph_to_open_block.adoc
        // Expected: paragraphsTestShouldConvertOpenParagraphToOpenBlock
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should wrap text in simpara for styled paragraphs with title when converted to DocBook`() {
        // Input: asciidoctor/paragraphs_test_should_wrap_text_in_simpara_for_styled_paragraphs_with_title_when_converted_to_doc_book.adoc
        // Expected: paragraphsTestShouldWrapTextInSimparaForStyledParagraphsWithTitleWhenConvertedToDocBook
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should output nil and warn if first block is not a paragraph`() {
        // Input: asciidoctor/paragraphs_test_should_output_nil_and_warn_if_first_block_is_not_a_paragraph.adoc
        // Expected: paragraphsTestShouldOutputNilAndWarnIfFirstBlockIsNotAParagraph
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should log debug message if paragraph style is unknown and debug level is enabled`() {
        // Input: asciidoctor/paragraphs_test_should_log_debug_message_if_paragraph_style_is_unknown_and_debug_level_is_enabled.adoc
        // Expected: paragraphsTestShouldLogDebugMessageIfParagraphStyleIsUnknownAndDebugLevelIsEnabled
    }

}
