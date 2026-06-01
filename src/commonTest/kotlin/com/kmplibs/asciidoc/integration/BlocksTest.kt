package com.kmplibs.asciidoc.integration

import kotlin.test.Test
import kotlin.test.Ignore

class BlocksTest {

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `horizontal rule between blocks`() {
        // Input: asciidoctor/blocks_test_horizontal_rule_between_blocks.adoc
        // Expected: blocksTestHorizontalRuleBetweenBlocks
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `line comment between paragraphs offset by blank lines`() {
        // Input: asciidoctor/blocks_test_line_comment_between_paragraphs_offset_by_blank_lines.adoc
        // Expected: blocksTestLineCommentBetweenParagraphsOffsetByBlankLines
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `adjacent line comment between paragraphs`() {
        // Input: asciidoctor/blocks_test_adjacent_line_comment_between_paragraphs.adoc
        // Expected: blocksTestAdjacentLineCommentBetweenParagraphs
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `comment block between paragraphs offset by blank lines`() {
        // Input: asciidoctor/blocks_test_comment_block_between_paragraphs_offset_by_blank_lines.adoc
        // Expected: blocksTestCommentBlockBetweenParagraphsOffsetByBlankLines
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `comment block between paragraphs offset by blank lines inside delimited block`() {
        // Input: asciidoctor/blocks_test_comment_block_between_paragraphs_offset_by_blank_lines_inside_delimited_block.adoc
        // Expected: blocksTestCommentBlockBetweenParagraphsOffsetByBlankLinesInsideDelimitedBlock
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `adjacent comment block between paragraphs`() {
        // Input: asciidoctor/blocks_test_adjacent_comment_block_between_paragraphs.adoc
        // Expected: blocksTestAdjacentCommentBlockBetweenParagraphs
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `can convert with block comment at end of document with trailing newlines`() {
        // Input: asciidoctor/blocks_test_can_convert_with_block_comment_at_end_of_document_with_trailing_newlines.adoc
        // Expected: blocksTestCanConvertWithBlockCommentAtEndOfDocumentWithTrailingNewlines
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `trailing newlines after block comment at end of document does not create paragraph`() {
        // Input: asciidoctor/blocks_test_trailing_newlines_after_block_comment_at_end_of_document_does_not_create_paragraph.adoc
        // Expected: blocksTestTrailingNewlinesAfterBlockCommentAtEndOfDocumentDoesNotCreateParagraph
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `line starting with three slashes should not be line comment`() {
        // Input: asciidoctor/blocks_test_line_starting_with_three_slashes_should_not_be_line_comment.adoc
        // Expected: blocksTestLineStartingWithThreeSlashesShouldNotBeLineComment
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `preprocessor directives should not be processed within comment block`() {
        // Input: asciidoctor/blocks_test_preprocessor_directives_should_not_be_processed_within_comment_block.adoc
        // Expected: blocksTestPreprocessorDirectivesShouldNotBeProcessedWithinCommentBlock
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should warn if unterminated comment block is detected in body`() {
        // Input: asciidoctor/blocks_test_should_warn_if_unterminated_comment_block_is_detected_in_body.adoc
        // Expected: blocksTestShouldWarnIfUnterminatedCommentBlockIsDetectedInBody
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should warn if unterminated comment block is detected inside another block`() {
        // Input: asciidoctor/blocks_test_should_warn_if_unterminated_comment_block_is_detected_inside_another_block.adoc
        // Expected: blocksTestShouldWarnIfUnterminatedCommentBlockIsDetectedInsideAnotherBlock
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `preprocessor directives should not be processed within comment open block`() {
        // Input: asciidoctor/blocks_test_preprocessor_directives_should_not_be_processed_within_comment_open_block.adoc
        // Expected: blocksTestPreprocessorDirectivesShouldNotBeProcessedWithinCommentOpenBlock
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `preprocessor directives should not be processed on subsequent lines of a comment paragraph`() {
        // Input: asciidoctor/blocks_test_preprocessor_directives_should_not_be_processed_on_subsequent_lines_of_a_comment_paragraph.adoc
        // Expected: blocksTestPreprocessorDirectivesShouldNotBeProcessedOnSubsequentLinesOfACommentParagraph
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `comment style on open block should only skip block`() {
        // Input: asciidoctor/blocks_test_comment_style_on_open_block_should_only_skip_block.adoc
        // Expected: blocksTestCommentStyleOnOpenBlockShouldOnlySkipBlock
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `comment style on paragraph should only skip paragraph`() {
        // Input: asciidoctor/blocks_test_comment_style_on_paragraph_should_only_skip_paragraph.adoc
        // Expected: blocksTestCommentStyleOnParagraphShouldOnlySkipParagraph
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `comment style on paragraph should not cause adjacent block to be skipped`() {
        // Input: asciidoctor/blocks_test_comment_style_on_paragraph_should_not_cause_adjacent_block_to_be_skipped.adoc
        // Expected: blocksTestCommentStyleOnParagraphShouldNotCauseAdjacentBlockToBeSkipped
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not drop content that follows skipped content inside a delimited block`() {
        // Input: asciidoctor/blocks_test_should_not_drop_content_that_follows_skipped_content_inside_a_delimited_block.adoc
        // Expected: blocksTestShouldNotDropContentThatFollowsSkippedContentInsideADelimitedBlock
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should parse sidebar block`() {
        // Input: asciidoctor/blocks_test_should_parse_sidebar_block.adoc
        // Expected: blocksTestShouldParseSidebarBlock
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `quote block with no attribution`() {
        // Input: asciidoctor/blocks_test_quote_block_with_no_attribution.adoc
        // Expected: blocksTestQuoteBlockWithNoAttribution
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `quote block with attribution`() {
        // Input: asciidoctor/blocks_test_quote_block_with_attribution.adoc
        // Expected: blocksTestQuoteBlockWithAttribution
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `quote block with attribute and id and role shorthand`() {
        // Input: asciidoctor/blocks_test_quote_block_with_attribute_and_id_and_role_shorthand.adoc
        // Expected: blocksTestQuoteBlockWithAttributeAndIdAndRoleShorthand
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `setting ID using style shorthand should not reset block style`() {
        // Input: asciidoctor/blocks_test_setting_id_using_style_shorthand_should_not_reset_block_style.adoc
        // Expected: blocksTestSettingIdUsingStyleShorthandShouldNotResetBlockStyle
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `quote block with complex content`() {
        // Input: asciidoctor/blocks_test_quote_block_with_complex_content.adoc
        // Expected: blocksTestQuoteBlockWithComplexContent
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `quote block with attribution converted to DocBook`() {
        // Input: asciidoctor/blocks_test_quote_block_with_attribution_converted_to_doc_book.adoc
        // Expected: blocksTestQuoteBlockWithAttributionConvertedToDocBook
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `epigraph quote block with attribution converted to DocBook`() {
        // Input: asciidoctor/blocks_test_epigraph_quote_block_with_attribution_converted_to_doc_book.adoc
        // Expected: blocksTestEpigraphQuoteBlockWithAttributionConvertedToDocBook
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `markdown-style quote block with single paragraph and no attribution`() {
        // Input: asciidoctor/blocks_test_markdown_style_quote_block_with_single_paragraph_and_no_attribution.adoc
        // Expected: blocksTestMarkdownStyleQuoteBlockWithSingleParagraphAndNoAttribution
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `lazy markdown-style quote block with single paragraph and no attribution`() {
        // Input: asciidoctor/blocks_test_lazy_markdown_style_quote_block_with_single_paragraph_and_no_attribution.adoc
        // Expected: blocksTestLazyMarkdownStyleQuoteBlockWithSingleParagraphAndNoAttribution
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `markdown-style quote block with multiple paragraphs and no attribution`() {
        // Input: asciidoctor/blocks_test_markdown_style_quote_block_with_multiple_paragraphs_and_no_attribution.adoc
        // Expected: blocksTestMarkdownStyleQuoteBlockWithMultipleParagraphsAndNoAttribution
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `markdown-style quote block with multiple blocks and no attribution`() {
        // Input: asciidoctor/blocks_test_markdown_style_quote_block_with_multiple_blocks_and_no_attribution.adoc
        // Expected: blocksTestMarkdownStyleQuoteBlockWithMultipleBlocksAndNoAttribution
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `markdown-style quote block with single paragraph and attribution`() {
        // Input: asciidoctor/blocks_test_markdown_style_quote_block_with_single_paragraph_and_attribution.adoc
        // Expected: blocksTestMarkdownStyleQuoteBlockWithSingleParagraphAndAttribution
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `markdown-style quote block with only attribution`() {
        // Input: asciidoctor/blocks_test_markdown_style_quote_block_with_only_attribution.adoc
        // Expected: blocksTestMarkdownStyleQuoteBlockWithOnlyAttribution
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `quoted paragraph-style quote block with attribution`() {
        // Input: asciidoctor/blocks_test_quoted_paragraph_style_quote_block_with_attribution.adoc
        // Expected: blocksTestQuotedParagraphStyleQuoteBlockWithAttribution
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should parse credit line in quoted paragraph-style quote block like positional block attributes`() {
        // Input: asciidoctor/blocks_test_should_parse_credit_line_in_quoted_paragraph_style_quote_block_like_positional_block_attributes.adoc
        // Expected: blocksTestShouldParseCreditLineInQuotedParagraphStyleQuoteBlockLikePositionalBlockAttributes
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `single-line verse block without attribution`() {
        // Input: asciidoctor/blocks_test_single_line_verse_block_without_attribution.adoc
        // Expected: blocksTestSingleLineVerseBlockWithoutAttribution
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `single-line verse block with attribution`() {
        // Input: asciidoctor/blocks_test_single_line_verse_block_with_attribution.adoc
        // Expected: blocksTestSingleLineVerseBlockWithAttribution
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `single-line verse block with attribution converted to DocBook`() {
        // Input: asciidoctor/blocks_test_single_line_verse_block_with_attribution_converted_to_doc_book.adoc
        // Expected: blocksTestSingleLineVerseBlockWithAttributionConvertedToDocBook
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `single-line epigraph verse block with attribution converted to DocBook`() {
        // Input: asciidoctor/blocks_test_single_line_epigraph_verse_block_with_attribution_converted_to_doc_book.adoc
        // Expected: blocksTestSingleLineEpigraphVerseBlockWithAttributionConvertedToDocBook
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `multi-stanza verse block`() {
        // Input: asciidoctor/blocks_test_multi_stanza_verse_block.adoc
        // Expected: blocksTestMultiStanzaVerseBlock
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `verse block does not contain block elements`() {
        // Input: asciidoctor/blocks_test_verse_block_does_not_contain_block_elements.adoc
        // Expected: blocksTestVerseBlockDoesNotContainBlockElements
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `verse should have normal subs`() {
        // Input: asciidoctor/blocks_test_verse_should_have_normal_subs.adoc
        // Expected: blocksTestVerseShouldHaveNormalSubs
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not recognize callouts in a verse`() {
        // Input: asciidoctor/blocks_test_should_not_recognize_callouts_in_a_verse.adoc
        // Expected: blocksTestShouldNotRecognizeCalloutsInAVerse
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should perform normal subs on a verse block`() {
        // Input: asciidoctor/blocks_test_should_perform_normal_subs_on_a_verse_block.adoc
        // Expected: blocksTestShouldPerformNormalSubsOnAVerseBlock
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `can convert example block`() {
        // Input: asciidoctor/blocks_test_can_convert_example_block.adoc
        // Expected: blocksTestCanConvertExampleBlock
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `assigns sequential numbered caption to example block with title`() {
        // Input: asciidoctor/blocks_test_assigns_sequential_numbered_caption_to_example_block_with_title.adoc
        // Expected: blocksTestAssignsSequentialNumberedCaptionToExampleBlockWithTitle
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `assigns sequential character caption to example block with title`() {
        // Input: asciidoctor/blocks_test_assigns_sequential_character_caption_to_example_block_with_title.adoc
        // Expected: blocksTestAssignsSequentialCharacterCaptionToExampleBlockWithTitle
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should increment counter for example even when example-number is locked by the API`() {
        // Input: asciidoctor/blocks_test_should_increment_counter_for_example_even_when_example_number_is_locked_by_the_api.adoc
        // Expected: blocksTestShouldIncrementCounterForExampleEvenWhenExampleNumberIsLockedByTheApi
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should use explicit caption if specified`() {
        // Input: asciidoctor/blocks_test_should_use_explicit_caption_if_specified.adoc
        // Expected: blocksTestShouldUseExplicitCaptionIfSpecified
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `automatic caption can be turned off and on and modified`() {
        // Input: asciidoctor/blocks_test_automatic_caption_can_be_turned_off_and_on_and_modified.adoc
        // Expected: blocksTestAutomaticCaptionCanBeTurnedOffAndOnAndModified
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should use explicit caption if specified even if block-specific global caption is disabled`() {
        // Input: asciidoctor/blocks_test_should_use_explicit_caption_if_specified_even_if_block_specific_global_caption_is_disabled.adoc
        // Expected: blocksTestShouldUseExplicitCaptionIfSpecifiedEvenIfBlockSpecificGlobalCaptionIsDisabled
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should use global caption if specified even if block-specific global caption is disabled`() {
        // Input: asciidoctor/blocks_test_should_use_global_caption_if_specified_even_if_block_specific_global_caption_is_disabled.adoc
        // Expected: blocksTestShouldUseGlobalCaptionIfSpecifiedEvenIfBlockSpecificGlobalCaptionIsDisabled
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not process caption attribute on block that does not support a caption`() {
        // Input: asciidoctor/blocks_test_should_not_process_caption_attribute_on_block_that_does_not_support_a_caption.adoc
        // Expected: blocksTestShouldNotProcessCaptionAttributeOnBlockThatDoesNotSupportACaption
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should create details_summary set if collapsible option is set`() {
        // Input: asciidoctor/blocks_test_should_create_details_summary_set_if_collapsible_option_is_set.adoc
        // Expected: blocksTestShouldCreateDetailsSummarySetIfCollapsibleOptionIsSet
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should open details_summary set if collapsible and open options are set`() {
        // Input: asciidoctor/blocks_test_should_open_details_summary_set_if_collapsible_and_open_options_are_set.adoc
        // Expected: blocksTestShouldOpenDetailsSummarySetIfCollapsibleAndOpenOptionsAreSet
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should add default summary element if collapsible option is set and title is not specifed`() {
        // Input: asciidoctor/blocks_test_should_add_default_summary_element_if_collapsible_option_is_set_and_title_is_not_specifed.adoc
        // Expected: blocksTestShouldAddDefaultSummaryElementIfCollapsibleOptionIsSetAndTitleIsNotSpecifed
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not allow collapsible block to increment example number`() {
        // Input: asciidoctor/blocks_test_should_not_allow_collapsible_block_to_increment_example_number.adoc
        // Expected: blocksTestShouldNotAllowCollapsibleBlockToIncrementExampleNumber
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should warn if example block is not terminated`() {
        // Input: asciidoctor/blocks_test_should_warn_if_example_block_is_not_terminated.adoc
        // Expected: blocksTestShouldWarnIfExampleBlockIsNotTerminated
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `caption block-level attribute should be used as caption`() {
        // Input: asciidoctor/blocks_test_caption_block_level_attribute_should_be_used_as_caption.adoc
        // Expected: blocksTestCaptionBlockLevelAttributeShouldBeUsedAsCaption
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `can override caption of admonition block using document attribute`() {
        // Input: asciidoctor/blocks_test_can_override_caption_of_admonition_block_using_document_attribute.adoc
        // Expected: blocksTestCanOverrideCaptionOfAdmonitionBlockUsingDocumentAttribute
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `blank caption document attribute should not blank admonition block caption`() {
        // Input: asciidoctor/blocks_test_blank_caption_document_attribute_should_not_blank_admonition_block_caption.adoc
        // Expected: blocksTestBlankCaptionDocumentAttributeShouldNotBlankAdmonitionBlockCaption
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should separate adjacent paragraphs and listing into blocks`() {
        // Input: asciidoctor/blocks_test_should_separate_adjacent_paragraphs_and_listing_into_blocks.adoc
        // Expected: blocksTestShouldSeparateAdjacentParagraphsAndListingIntoBlocks
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should warn if listing block is not terminated`() {
        // Input: asciidoctor/blocks_test_should_warn_if_listing_block_is_not_terminated.adoc
        // Expected: blocksTestShouldWarnIfListingBlockIsNotTerminated
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not crash when converting verbatim block that has no lines`() {
        // Input: asciidoctor/blocks_test_should_not_crash_when_converting_verbatim_block_that_has_no_lines.adoc
        // Expected: blocksTestShouldNotCrashWhenConvertingVerbatimBlockThatHasNoLines
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should preserve newlines in listing block`() {
        // Input: asciidoctor/blocks_test_should_preserve_newlines_in_listing_block.adoc
        // Expected: blocksTestShouldPreserveNewlinesInListingBlock
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should preserve newlines in verse block`() {
        // Input: asciidoctor/blocks_test_should_preserve_newlines_in_verse_block.adoc
        // Expected: blocksTestShouldPreserveNewlinesInVerseBlock
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should strip leading and trailing blank lines when converting verbatim block`() {
        // Input: asciidoctor/blocks_test_should_strip_leading_and_trailing_blank_lines_when_converting_verbatim_block.adoc
        // Expected: blocksTestShouldStripLeadingAndTrailingBlankLinesWhenConvertingVerbatimBlock
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should remove block indent if indent attribute is 0`() {
        // Input: asciidoctor/blocks_test_should_remove_block_indent_if_indent_attribute_is_0.adoc
        // Expected: blocksTestShouldRemoveBlockIndentIfIndentAttributeIs0
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not remove block indent if indent attribute is -1`() {
        // Input: asciidoctor/blocks_test_should_not_remove_block_indent_if_indent_attribute_is__1.adoc
        // Expected: blocksTestShouldNotRemoveBlockIndentIfIndentAttributeIs1
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should set block indent to value specified by indent attribute`() {
        // Input: asciidoctor/blocks_test_should_set_block_indent_to_value_specified_by_indent_attribute.adoc
        // Expected: blocksTestShouldSetBlockIndentToValueSpecifiedByIndentAttribute
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should set block indent to value specified by indent document attribute`() {
        // Input: asciidoctor/blocks_test_should_set_block_indent_to_value_specified_by_indent_document_attribute.adoc
        // Expected: blocksTestShouldSetBlockIndentToValueSpecifiedByIndentDocumentAttribute
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `literal block should honor nowrap option`() {
        // Input: asciidoctor/blocks_test_literal_block_should_honor_nowrap_option.adoc
        // Expected: blocksTestLiteralBlockShouldHonorNowrapOption
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `literal block should set nowrap class if prewrap document attribute is disabled`() {
        // Input: asciidoctor/blocks_test_literal_block_should_set_nowrap_class_if_prewrap_document_attribute_is_disabled.adoc
        // Expected: blocksTestLiteralBlockShouldSetNowrapClassIfPrewrapDocumentAttributeIsDisabled
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should preserve guard in front of callout if icons are not enabled`() {
        // Input: asciidoctor/blocks_test_should_preserve_guard_in_front_of_callout_if_icons_are_not_enabled.adoc
        // Expected: blocksTestShouldPreserveGuardInFrontOfCalloutIfIconsAreNotEnabled
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should preserve guard around callout if icons are not enabled`() {
        // Input: asciidoctor/blocks_test_should_preserve_guard_around_callout_if_icons_are_not_enabled.adoc
        // Expected: blocksTestShouldPreserveGuardAroundCalloutIfIconsAreNotEnabled
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `literal block should honor explicit subs list`() {
        // Input: asciidoctor/blocks_test_literal_block_should_honor_explicit_subs_list.adoc
        // Expected: blocksTestLiteralBlockShouldHonorExplicitSubsList
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should be able to disable callouts for literal block`() {
        // Input: asciidoctor/blocks_test_should_be_able_to_disable_callouts_for_literal_block.adoc
        // Expected: blocksTestShouldBeAbleToDisableCalloutsForLiteralBlock
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `listing block should honor explicit subs list`() {
        // Input: asciidoctor/blocks_test_listing_block_should_honor_explicit_subs_list.adoc
        // Expected: blocksTestListingBlockShouldHonorExplicitSubsList
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not mangle array that contains formatted text with role in listing block with quotes sub enabled`() {
        // Input: asciidoctor/blocks_test_should_not_mangle_array_that_contains_formatted_text_with_role_in_listing_block_with_quotes_sub_enabled.adoc
        // Expected: blocksTestShouldNotMangleArrayThatContainsFormattedTextWithRoleInListingBlockWithQuotesSubEnabled
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `first character of block title may be a period if not followed by space`() {
        // Input: asciidoctor/blocks_test_first_character_of_block_title_may_be_a_period_if_not_followed_by_space.adoc
        // Expected: blocksTestFirstCharacterOfBlockTitleMayBeAPeriodIfNotFollowedBySpace
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `listing block without title should generate screen element in docbook`() {
        // Input: asciidoctor/blocks_test_listing_block_without_title_should_generate_screen_element_in_docbook.adoc
        // Expected: blocksTestListingBlockWithoutTitleShouldGenerateScreenElementInDocbook
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `listing block with title should generate screen element inside formalpara element in docbook`() {
        // Input: asciidoctor/blocks_test_listing_block_with_title_should_generate_screen_element_inside_formalpara_element_in_docbook.adoc
        // Expected: blocksTestListingBlockWithTitleShouldGenerateScreenElementInsideFormalparaElementInDocbook
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not prepend caption to title of listing block with title if listing-caption attribute is not set`() {
        // Input: asciidoctor/blocks_test_should_not_prepend_caption_to_title_of_listing_block_with_title_if_listing_caption_attribute_is_not_set.adoc
        // Expected: blocksTestShouldNotPrependCaptionToTitleOfListingBlockWithTitleIfListingCaptionAttributeIsNotSet
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should prepend caption specified by listing-caption attribute and number to title of listing block with title`() {
        // Input: asciidoctor/blocks_test_should_prepend_caption_specified_by_listing_caption_attribute_and_number_to_title_of_listing_block_with_title.adoc
        // Expected: blocksTestShouldPrependCaptionSpecifiedByListingCaptionAttributeAndNumberToTitleOfListingBlockWithTitle
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should prepend caption specified by caption attribute on listing block even if listing-caption attribute is not set`() {
        // Input: asciidoctor/blocks_test_should_prepend_caption_specified_by_caption_attribute_on_listing_block_even_if_listing_caption_attribute_is_not_set.adoc
        // Expected: blocksTestShouldPrependCaptionSpecifiedByCaptionAttributeOnListingBlockEvenIfListingCaptionAttributeIsNotSet
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `listing block without an explicit style and with a second positional argument should be promoted to a source block`() {
        // Input: asciidoctor/blocks_test_listing_block_without_an_explicit_style_and_with_a_second_positional_argument_should_be_promoted_to_a_source_block.adoc
        // Expected: blocksTestListingBlockWithoutAnExplicitStyleAndWithASecondPositionalArgumentShouldBePromotedToASourceBlock
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `listing block without an explicit style should be promoted to a source block if source-language is set`() {
        // Input: asciidoctor/blocks_test_listing_block_without_an_explicit_style_should_be_promoted_to_a_source_block_if_source_language_is_set.adoc
        // Expected: blocksTestListingBlockWithoutAnExplicitStyleShouldBePromotedToASourceBlockIfSourceLanguageIsSet
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `listing block with an explicit style and a second positional argument should not be promoted to a source block`() {
        // Input: asciidoctor/blocks_test_listing_block_with_an_explicit_style_and_a_second_positional_argument_should_not_be_promoted_to_a_source_block.adoc
        // Expected: blocksTestListingBlockWithAnExplicitStyleAndASecondPositionalArgumentShouldNotBePromotedToASourceBlock
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `listing block with an explicit style should not be promoted to a source block if source-language is set`() {
        // Input: asciidoctor/blocks_test_listing_block_with_an_explicit_style_should_not_be_promoted_to_a_source_block_if_source_language_is_set.adoc
        // Expected: blocksTestListingBlockWithAnExplicitStyleShouldNotBePromotedToASourceBlockIfSourceLanguageIsSet
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `source block with no title or language should generate screen element in docbook`() {
        // Input: asciidoctor/blocks_test_source_block_with_no_title_or_language_should_generate_screen_element_in_docbook.adoc
        // Expected: blocksTestSourceBlockWithNoTitleOrLanguageShouldGenerateScreenElementInDocbook
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `source block with title and no language should generate screen element inside formalpara element for docbook`() {
        // Input: asciidoctor/blocks_test_source_block_with_title_and_no_language_should_generate_screen_element_inside_formalpara_element_for_docbook.adoc
        // Expected: blocksTestSourceBlockWithTitleAndNoLanguageShouldGenerateScreenElementInsideFormalparaElementForDocbook
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `can convert open block`() {
        // Input: asciidoctor/blocks_test_can_convert_open_block.adoc
        // Expected: blocksTestCanConvertOpenBlock
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `open block can contain another block`() {
        // Input: asciidoctor/blocks_test_open_block_can_contain_another_block.adoc
        // Expected: blocksTestOpenBlockCanContainAnotherBlock
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should transfer id and reftext on open block to DocBook output`() {
        // Input: asciidoctor/blocks_test_should_transfer_id_and_reftext_on_open_block_to_doc_book_output.adoc
        // Expected: blocksTestShouldTransferIdAndReftextOnOpenBlockToDocBookOutput
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should transfer id and reftext on open paragraph to DocBook output`() {
        // Input: asciidoctor/blocks_test_should_transfer_id_and_reftext_on_open_paragraph_to_doc_book_output.adoc
        // Expected: blocksTestShouldTransferIdAndReftextOnOpenParagraphToDocBookOutput
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should transfer title on open block to DocBook output`() {
        // Input: asciidoctor/blocks_test_should_transfer_title_on_open_block_to_doc_book_output.adoc
        // Expected: blocksTestShouldTransferTitleOnOpenBlockToDocBookOutput
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should transfer title on open paragraph to DocBook output`() {
        // Input: asciidoctor/blocks_test_should_transfer_title_on_open_paragraph_to_doc_book_output.adoc
        // Expected: blocksTestShouldTransferTitleOnOpenParagraphToDocBookOutput
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should transfer role on open block to DocBook output`() {
        // Input: asciidoctor/blocks_test_should_transfer_role_on_open_block_to_doc_book_output.adoc
        // Expected: blocksTestShouldTransferRoleOnOpenBlockToDocBookOutput
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should transfer role on open paragraph to DocBook output`() {
        // Input: asciidoctor/blocks_test_should_transfer_role_on_open_paragraph_to_doc_book_output.adoc
        // Expected: blocksTestShouldTransferRoleOnOpenParagraphToDocBookOutput
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `can parse a passthrough block`() {
        // Input: asciidoctor/blocks_test_can_parse_a_passthrough_block.adoc
        // Expected: blocksTestCanParseAPassthroughBlock
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `does not perform subs on a passthrough block by default`() {
        // Input: asciidoctor/blocks_test_does_not_perform_subs_on_a_passthrough_block_by_default.adoc
        // Expected: blocksTestDoesNotPerformSubsOnAPassthroughBlockByDefault
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `does not perform subs on a passthrough block with pass style by default`() {
        // Input: asciidoctor/blocks_test_does_not_perform_subs_on_a_passthrough_block_with_pass_style_by_default.adoc
        // Expected: blocksTestDoesNotPerformSubsOnAPassthroughBlockWithPassStyleByDefault
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `passthrough block honors explicit subs list`() {
        // Input: asciidoctor/blocks_test_passthrough_block_honors_explicit_subs_list.adoc
        // Expected: blocksTestPassthroughBlockHonorsExplicitSubsList
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should strip leading and trailing blank lines when converting raw block`() {
        // Input: asciidoctor/blocks_test_should_strip_leading_and_trailing_blank_lines_when_converting_raw_block.adoc
        // Expected: blocksTestShouldStripLeadingAndTrailingBlankLinesWhenConvertingRawBlock
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not crash when converting stem block that has no lines`() {
        // Input: asciidoctor/blocks_test_should_not_crash_when_converting_stem_block_that_has_no_lines.adoc
        // Expected: blocksTestShouldNotCrashWhenConvertingStemBlockThatHasNoLines
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should return content as empty string for stem or pass block that has no lines`() {
        // Input: asciidoctor/blocks_test_should_return_content_as_empty_string_for_stem_or_pass_block_that_has_no_lines.adoc
        // Expected: blocksTestShouldReturnContentAsEmptyStringForStemOrPassBlockThatHasNoLines
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not add LaTeX math delimiters around latexmath block content if already present`() {
        // Input: asciidoctor/blocks_test_should_not_add_la_te_x_math_delimiters_around_latexmath_block_content_if_already_present.adoc
        // Expected: blocksTestShouldNotAddLaTeXMathDelimitersAroundLatexmathBlockContentIfAlreadyPresent
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should display latexmath block in alt of equation in DocBook backend`() {
        // Input: asciidoctor/blocks_test_should_display_latexmath_block_in_alt_of_equation_in_doc_book_backend.adoc
        // Expected: blocksTestShouldDisplayLatexmathBlockInAltOfEquationInDocBookBackend
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should set autoNumber option for latexmath to none by default`() {
        // Input: asciidoctor/blocks_test_should_set_auto_number_option_for_latexmath_to_none_by_default.adoc
        // Expected: blocksTestShouldSetAutoNumberOptionForLatexmathToNoneByDefault
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should set autoNumber option for latexmath to none if eqnums is set to none`() {
        // Input: asciidoctor/blocks_test_should_set_auto_number_option_for_latexmath_to_none_if_eqnums_is_set_to_none.adoc
        // Expected: blocksTestShouldSetAutoNumberOptionForLatexmathToNoneIfEqnumsIsSetToNone
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should set autoNumber option for latexmath to AMS if eqnums is set`() {
        // Input: asciidoctor/blocks_test_should_set_auto_number_option_for_latexmath_to_ams_if_eqnums_is_set.adoc
        // Expected: blocksTestShouldSetAutoNumberOptionForLatexmathToAmsIfEqnumsIsSet
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should set autoNumber option for latexmath to all if eqnums is set to all`() {
        // Input: asciidoctor/blocks_test_should_set_auto_number_option_for_latexmath_to_all_if_eqnums_is_set_to_all.adoc
        // Expected: blocksTestShouldSetAutoNumberOptionForLatexmathToAllIfEqnumsIsSetToAll
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not split equation in AsciiMath block at single newline`() {
        // Input: asciidoctor/blocks_test_should_not_split_equation_in_ascii_math_block_at_single_newline.adoc
        // Expected: blocksTestShouldNotSplitEquationInAsciiMathBlockAtSingleNewline
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should split equation in AsciiMath block at escaped newline`() {
        // Input: asciidoctor/blocks_test_should_split_equation_in_ascii_math_block_at_escaped_newline.adoc
        // Expected: blocksTestShouldSplitEquationInAsciiMathBlockAtEscapedNewline
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should split equation in AsciiMath block at sequence of escaped newlines`() {
        // Input: asciidoctor/blocks_test_should_split_equation_in_ascii_math_block_at_sequence_of_escaped_newlines.adoc
        // Expected: blocksTestShouldSplitEquationInAsciiMathBlockAtSequenceOfEscapedNewlines
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should split equation in AsciiMath block at newline sequence and preserve breaks`() {
        // Input: asciidoctor/blocks_test_should_split_equation_in_ascii_math_block_at_newline_sequence_and_preserve_breaks.adoc
        // Expected: blocksTestShouldSplitEquationInAsciiMathBlockAtNewlineSequenceAndPreserveBreaks
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should add AsciiMath delimiters around asciimath block content`() {
        // Input: asciidoctor/blocks_test_should_add_ascii_math_delimiters_around_asciimath_block_content.adoc
        // Expected: blocksTestShouldAddAsciiMathDelimitersAroundAsciimathBlockContent
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not add AsciiMath delimiters around asciimath block content if already present`() {
        // Input: asciidoctor/blocks_test_should_not_add_ascii_math_delimiters_around_asciimath_block_content_if_already_present.adoc
        // Expected: blocksTestShouldNotAddAsciiMathDelimitersAroundAsciimathBlockContentIfAlreadyPresent
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should convert contents of asciimath block to MathML in DocBook output if asciimath gem is available`() {
        // Input: asciidoctor/blocks_test_should_convert_contents_of_asciimath_block_to_math_ml_in_doc_book_output_if_asciimath_gem_is_available.adoc
        // Expected: blocksTestShouldConvertContentsOfAsciimathBlockToMathMlInDocBookOutputIfAsciimathGemIsAvailable
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should output title for latexmath block if defined`() {
        // Input: asciidoctor/blocks_test_should_output_title_for_latexmath_block_if_defined.adoc
        // Expected: blocksTestShouldOutputTitleForLatexmathBlockIfDefined
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should output title for asciimath block if defined`() {
        // Input: asciidoctor/blocks_test_should_output_title_for_asciimath_block_if_defined.adoc
        // Expected: blocksTestShouldOutputTitleForAsciimathBlockIfDefined
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should add AsciiMath delimiters around stem block content if stem attribute is asciimath, empty, or not set`() {
        // Input: asciidoctor/blocks_test_should_add_ascii_math_delimiters_around_stem_block_content_if_stem_attribute_is_asciimath_empty_or_not_set.adoc
        // Expected: blocksTestShouldAddAsciiMathDelimitersAroundStemBlockContentIfStemAttributeIsAsciimathEmptyOrNotSet
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should add LaTeX math delimiters around stem block content if stem attribute is latexmath, latex, or tex`() {
        // Input: asciidoctor/blocks_test_should_add_la_te_x_math_delimiters_around_stem_block_content_if_stem_attribute_is_latexmath_latex_or_tex.adoc
        // Expected: blocksTestShouldAddLaTeXMathDelimitersAroundStemBlockContentIfStemAttributeIsLatexmathLatexOrTex
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should allow stem style to be set using second positional argument of block attributes`() {
        // Input: asciidoctor/blocks_test_should_allow_stem_style_to_be_set_using_second_positional_argument_of_block_attributes.adoc
        // Expected: blocksTestShouldAllowStemStyleToBeSetUsingSecondPositionalArgumentOfBlockAttributes
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not warn if block style is unknown`() {
        // Input: asciidoctor/blocks_test_should_not_warn_if_block_style_is_unknown.adoc
        // Expected: blocksTestShouldNotWarnIfBlockStyleIsUnknown
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should log debug message if block style is unknown and debug level is enabled`() {
        // Input: asciidoctor/blocks_test_should_log_debug_message_if_block_style_is_unknown_and_debug_level_is_enabled.adoc
        // Expected: blocksTestShouldLogDebugMessageIfBlockStyleIsUnknownAndDebugLevelIsEnabled
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `block title above section gets carried over to first block in section`() {
        // Input: asciidoctor/blocks_test_block_title_above_section_gets_carried_over_to_first_block_in_section.adoc
        // Expected: blocksTestBlockTitleAboveSectionGetsCarriedOverToFirstBlockInSection
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `block title above document title demotes document title to a section title`() {
        // Input: asciidoctor/blocks_test_block_title_above_document_title_demotes_document_title_to_a_section_title.adoc
        // Expected: blocksTestBlockTitleAboveDocumentTitleDemotesDocumentTitleToASectionTitle
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `block title above document title gets carried over to first block in first section if no preamble`() {
        // Input: asciidoctor/blocks_test_block_title_above_document_title_gets_carried_over_to_first_block_in_first_section_if_no_preamble.adoc
        // Expected: blocksTestBlockTitleAboveDocumentTitleGetsCarriedOverToFirstBlockInFirstSectionIfNoPreamble
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should apply substitutions to a block title in normal order`() {
        // Input: asciidoctor/blocks_test_should_apply_substitutions_to_a_block_title_in_normal_order.adoc
        // Expected: blocksTestShouldApplySubstitutionsToABlockTitleInNormalOrder
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `empty attribute list should not appear in output`() {
        // Input: asciidoctor/blocks_test_empty_attribute_list_should_not_appear_in_output.adoc
        // Expected: blocksTestEmptyAttributeListShouldNotAppearInOutput
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `empty block anchor should not appear in output`() {
        // Input: asciidoctor/blocks_test_empty_block_anchor_should_not_appear_in_output.adoc
        // Expected: blocksTestEmptyBlockAnchorShouldNotAppearInOutput
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `can convert block image with alt text defined in macro`() {
        // Input: asciidoctor/blocks_test_can_convert_block_image_with_alt_text_defined_in_macro.adoc
        // Expected: blocksTestCanConvertBlockImageWithAltTextDefinedInMacro
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `converts SVG image with alt text using img element when safe mode is secure`() {
        // Input: asciidoctor/blocks_test_converts_svg_image_with_alt_text_using_img_element_when_safe_mode_is_secure.adoc
        // Expected: blocksTestConvertsSvgImageWithAltTextUsingImgElementWhenSafeModeIsSecure
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `inserts fallback image for SVG inside object element using same dimensions`() {
        // Input: asciidoctor/blocks_test_inserts_fallback_image_for_svg_inside_object_element_using_same_dimensions.adoc
        // Expected: blocksTestInsertsFallbackImageForSvgInsideObjectElementUsingSameDimensions
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `detects SVG image URI that contains a query string`() {
        // Input: asciidoctor/blocks_test_detects_svg_image_uri_that_contains_a_query_string.adoc
        // Expected: blocksTestDetectsSvgImageUriThatContainsAQueryString
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `detects SVG image when format attribute is svg`() {
        // Input: asciidoctor/blocks_test_detects_svg_image_when_format_attribute_is_svg.adoc
        // Expected: blocksTestDetectsSvgImageWhenFormatAttributeIsSvg
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `converts to inline SVG image when inline option is set on block`() {
        // Input: asciidoctor/blocks_test_converts_to_inline_svg_image_when_inline_option_is_set_on_block.adoc
        // Expected: blocksTestConvertsToInlineSvgImageWhenInlineOptionIsSetOnBlock
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should ignore link attribute if value is self and image target is inline SVG`() {
        // Input: asciidoctor/blocks_test_should_ignore_link_attribute_if_value_is_self_and_image_target_is_inline_svg.adoc
        // Expected: blocksTestShouldIgnoreLinkAttributeIfValueIsSelfAndImageTargetIsInlineSvg
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should honor percentage width for SVG image with inline option`() {
        // Input: asciidoctor/blocks_test_should_honor_percentage_width_for_svg_image_with_inline_option.adoc
        // Expected: blocksTestShouldHonorPercentageWidthForSvgImageWithInlineOption
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not crash if explicit width on SVG image block is an integer`() {
        // Input: asciidoctor/blocks_test_should_not_crash_if_explicit_width_on_svg_image_block_is_an_integer.adoc
        // Expected: blocksTestShouldNotCrashIfExplicitWidthOnSvgImageBlockIsAnInteger
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `converts to inline SVG image when inline option is set on block and data-uri is set on document`() {
        // Input: asciidoctor/blocks_test_converts_to_inline_svg_image_when_inline_option_is_set_on_block_and_data_uri_is_set_on_document.adoc
        // Expected: blocksTestConvertsToInlineSvgImageWhenInlineOptionIsSetOnBlockAndDataUriIsSetOnDocument
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not throw exception if SVG to inline is empty`() {
        // Input: asciidoctor/blocks_test_should_not_throw_exception_if_svg_to_inline_is_empty.adoc
        // Expected: blocksTestShouldNotThrowExceptionIfSvgToInlineIsEmpty
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `can convert block image with alt text defined in macro containing square bracket`() {
        // Input: asciidoctor/blocks_test_can_convert_block_image_with_alt_text_defined_in_macro_containing_square_bracket.adoc
        // Expected: blocksTestCanConvertBlockImageWithAltTextDefinedInMacroContainingSquareBracket
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `alt text in macro overrides alt text above macro`() {
        // Input: asciidoctor/blocks_test_alt_text_in_macro_overrides_alt_text_above_macro.adoc
        // Expected: blocksTestAltTextInMacroOverridesAltTextAboveMacro
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should substitute attribute references in alt text defined in image block macro`() {
        // Input: asciidoctor/blocks_test_should_substitute_attribute_references_in_alt_text_defined_in_image_block_macro.adoc
        // Expected: blocksTestShouldSubstituteAttributeReferencesInAltTextDefinedInImageBlockMacro
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should set direction CSS class on image if float attribute is set`() {
        // Input: asciidoctor/blocks_test_should_set_direction_css_class_on_image_if_float_attribute_is_set.adoc
        // Expected: blocksTestShouldSetDirectionCssClassOnImageIfFloatAttributeIsSet
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should set text alignment CSS class on image if align attribute is set`() {
        // Input: asciidoctor/blocks_test_should_set_text_alignment_css_class_on_image_if_align_attribute_is_set.adoc
        // Expected: blocksTestShouldSetTextAlignmentCssClassOnImageIfAlignAttributeIsSet
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `style attribute is dropped from image macro`() {
        // Input: asciidoctor/blocks_test_style_attribute_is_dropped_from_image_macro.adoc
        // Expected: blocksTestStyleAttributeIsDroppedFromImageMacro
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should auto-generate alt text for block image if alt text is not specified`() {
        // Input: asciidoctor/blocks_test_should_auto_generate_alt_text_for_block_image_if_alt_text_is_not_specified.adoc
        // Expected: blocksTestShouldAutoGenerateAltTextForBlockImageIfAltTextIsNotSpecified
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `can convert block image with link to self`() {
        // Input: asciidoctor/blocks_test_can_convert_block_image_with_link_to_self.adoc
        // Expected: blocksTestCanConvertBlockImageWithLinkToSelf
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `adds rel=noopener attribute to block image with link that targets _blank window`() {
        // Input: asciidoctor/blocks_test_adds_rel=noopener_attribute_to_block_image_with_link_that_targets__blank_window.adoc
        // Expected: blocksTestAddsRelnoopenerAttributeToBlockImageWithLinkThatTargetsBlankWindow
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `can convert block image with explicit caption`() {
        // Input: asciidoctor/blocks_test_can_convert_block_image_with_explicit_caption.adoc
        // Expected: blocksTestCanConvertBlockImageWithExplicitCaption
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `can align image in DocBook backend`() {
        // Input: asciidoctor/blocks_test_can_align_image_in_doc_book_backend.adoc
        // Expected: blocksTestCanAlignImageInDocBookBackend
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not drop line if image target is missing attribute reference and attribute-missing is drop`() {
        // Input: asciidoctor/blocks_test_should_not_drop_line_if_image_target_is_missing_attribute_reference_and_attribute_missing_is_drop.adoc
        // Expected: blocksTestShouldNotDropLineIfImageTargetIsMissingAttributeReferenceAndAttributeMissingIsDrop
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `drops line if image target is missing attribute reference and attribute-missing is drop-line`() {
        // Input: asciidoctor/blocks_test_drops_line_if_image_target_is_missing_attribute_reference_and_attribute_missing_is_drop_line.adoc
        // Expected: blocksTestDropsLineIfImageTargetIsMissingAttributeReferenceAndAttributeMissingIsDropLine
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not drop line if image target resolves to blank and attribute-missing is drop-line`() {
        // Input: asciidoctor/blocks_test_should_not_drop_line_if_image_target_resolves_to_blank_and_attribute_missing_is_drop_line.adoc
        // Expected: blocksTestShouldNotDropLineIfImageTargetResolvesToBlankAndAttributeMissingIsDropLine
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `dropped image does not break processing of following section and attribute-missing is drop-line`() {
        // Input: asciidoctor/blocks_test_dropped_image_does_not_break_processing_of_following_section_and_attribute_missing_is_drop_line.adoc
        // Expected: blocksTestDroppedImageDoesNotBreakProcessingOfFollowingSectionAndAttributeMissingIsDropLine
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should pass through image that references uri`() {
        // Input: asciidoctor/blocks_test_should_pass_through_image_that_references_uri.adoc
        // Expected: blocksTestShouldPassThroughImageThatReferencesUri
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should encode spaces in image target if value is a URI`() {
        // Input: asciidoctor/blocks_test_should_encode_spaces_in_image_target_if_value_is_a_uri.adoc
        // Expected: blocksTestShouldEncodeSpacesInImageTargetIfValueIsAUri
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `embeds base64-encoded data uri for image when data-uri attribute is set`() {
        // Input: asciidoctor/blocks_test_embeds_base_64_encoded_data_uri_for_image_when_data_uri_attribute_is_set.adoc
        // Expected: blocksTestEmbedsBase64EncodedDataUriForImageWhenDataUriAttributeIsSet
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `embeds SVG image with image_svg+xml mimetype when file extension is _svg`() {
        // Input: asciidoctor/blocks_test_embeds_svg_image_with_image_svg+xml_mimetype_when_file_extension_is__svg.adoc
        // Expected: blocksTestEmbedsSvgImageWithImageSvgxmlMimetypeWhenFileExtensionIsSvg
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should link to data URI if value of link attribute is self and image is embedded`() {
        // Input: asciidoctor/blocks_test_should_link_to_data_uri_if_value_of_link_attribute_is_self_and_image_is_embedded.adoc
        // Expected: blocksTestShouldLinkToDataUriIfValueOfLinkAttributeIsSelfAndImageIsEmbedded
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `embeds empty base64-encoded data uri for unreadable image when data-uri attribute is set`() {
        // Input: asciidoctor/blocks_test_embeds_empty_base_64_encoded_data_uri_for_unreadable_image_when_data_uri_attribute_is_set.adoc
        // Expected: blocksTestEmbedsEmptyBase64EncodedDataUriForUnreadableImageWhenDataUriAttributeIsSet
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `embeds base64-encoded data uri with application_octet-stream mimetype when file extension is missing`() {
        // Input: asciidoctor/blocks_test_embeds_base_64_encoded_data_uri_with_application_octet_stream_mimetype_when_file_extension_is_missing.adoc
        // Expected: blocksTestEmbedsBase64EncodedDataUriWithApplicationOctetStreamMimetypeWhenFileExtensionIsMissing
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `can handle embedded data uri images`() {
        // Input: asciidoctor/blocks_test_can_handle_embedded_data_uri_images.adoc
        // Expected: blocksTestCanHandleEmbeddedDataUriImages
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `cleans reference to ancestor directories in imagesdir before reading image if safe mode level is at least SAFE`() {
        // Input: asciidoctor/blocks_test_cleans_reference_to_ancestor_directories_in_imagesdir_before_reading_image_if_safe_mode_level_is_at_least_safe.adoc
        // Expected: blocksTestCleansReferenceToAncestorDirectoriesInImagesdirBeforeReadingImageIfSafeModeLevelIsAtLeastSafe
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `cleans reference to ancestor directories in target before reading image if safe mode level is at least SAFE`() {
        // Input: asciidoctor/blocks_test_cleans_reference_to_ancestor_directories_in_target_before_reading_image_if_safe_mode_level_is_at_least_safe.adoc
        // Expected: blocksTestCleansReferenceToAncestorDirectoriesInTargetBeforeReadingImageIfSafeModeLevelIsAtLeastSafe
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should detect and convert video macro`() {
        // Input: asciidoctor/blocks_test_should_detect_and_convert_video_macro.adoc
        // Expected: blocksTestShouldDetectAndConvertVideoMacro
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `video macro should not use imagesdir attribute to resolve target if target is a URL`() {
        // Input: asciidoctor/blocks_test_video_macro_should_not_use_imagesdir_attribute_to_resolve_target_if_target_is_a_url.adoc
        // Expected: blocksTestVideoMacroShouldNotUseImagesdirAttributeToResolveTargetIfTargetIsAUrl
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `video macro should output custom HTML with iframe for vimeo service`() {
        // Input: asciidoctor/blocks_test_video_macro_should_output_custom_html_with_iframe_for_vimeo_service.adoc
        // Expected: blocksTestVideoMacroShouldOutputCustomHtmlWithIframeForVimeoService
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `audio macro should not use imagesdir attribute to resolve target if target is a URL`() {
        // Input: asciidoctor/blocks_test_audio_macro_should_not_use_imagesdir_attribute_to_resolve_target_if_target_is_a_url.adoc
        // Expected: blocksTestAudioMacroShouldNotUseImagesdirAttributeToResolveTargetIfTargetIsAUrl
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `audio macro should honor all options`() {
        // Input: asciidoctor/blocks_test_audio_macro_should_honor_all_options.adoc
        // Expected: blocksTestAudioMacroShouldHonorAllOptions
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `can resolve icon relative to custom iconsdir`() {
        // Input: asciidoctor/blocks_test_can_resolve_icon_relative_to_custom_iconsdir.adoc
        // Expected: blocksTestCanResolveIconRelativeToCustomIconsdir
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should add file extension to custom icon if not specified`() {
        // Input: asciidoctor/blocks_test_should_add_file_extension_to_custom_icon_if_not_specified.adoc
        // Expected: blocksTestShouldAddFileExtensionToCustomIconIfNotSpecified
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should allow icontype to be specified when using built-in admonition icon`() {
        // Input: asciidoctor/blocks_test_should_allow_icontype_to_be_specified_when_using_built_in_admonition_icon.adoc
        // Expected: blocksTestShouldAllowIcontypeToBeSpecifiedWhenUsingBuiltInAdmonitionIcon
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `embeds base64-encoded data uri of icon when data-uri attribute is set and safe mode level is less than SECURE`() {
        // Input: asciidoctor/blocks_test_embeds_base_64_encoded_data_uri_of_icon_when_data_uri_attribute_is_set_and_safe_mode_level_is_less_than_secure.adoc
        // Expected: blocksTestEmbedsBase64EncodedDataUriOfIconWhenDataUriAttributeIsSetAndSafeModeLevelIsLessThanSecure
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should embed base64-encoded data uri of custom icon when data-uri attribute is set`() {
        // Input: asciidoctor/blocks_test_should_embed_base_64_encoded_data_uri_of_custom_icon_when_data_uri_attribute_is_set.adoc
        // Expected: blocksTestShouldEmbedBase64EncodedDataUriOfCustomIconWhenDataUriAttributeIsSet
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `does not embed base64-encoded data uri of icon when safe mode level is SECURE or greater`() {
        // Input: asciidoctor/blocks_test_does_not_embed_base_64_encoded_data_uri_of_icon_when_safe_mode_level_is_secure_or_greater.adoc
        // Expected: blocksTestDoesNotEmbedBase64EncodedDataUriOfIconWhenSafeModeLevelIsSecureOrGreater
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `cleans reference to ancestor directories before reading icon if safe mode level is at least SAFE`() {
        // Input: asciidoctor/blocks_test_cleans_reference_to_ancestor_directories_before_reading_icon_if_safe_mode_level_is_at_least_safe.adoc
        // Expected: blocksTestCleansReferenceToAncestorDirectoriesBeforeReadingIconIfSafeModeLevelIsAtLeastSafe
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should import Font Awesome and use font-based icons when value of icons attribute is font`() {
        // Input: asciidoctor/blocks_test_should_import_font_awesome_and_use_font_based_icons_when_value_of_icons_attribute_is_font.adoc
        // Expected: blocksTestShouldImportFontAwesomeAndUseFontBasedIconsWhenValueOfIconsAttributeIsFont
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `font-based icon should not override icon specified on admonition`() {
        // Input: asciidoctor/blocks_test_font_based_icon_should_not_override_icon_specified_on_admonition.adoc
        // Expected: blocksTestFontBasedIconShouldNotOverrideIconSpecifiedOnAdmonition
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should use http uri scheme for assets when asset-uri-scheme is http`() {
        // Input: asciidoctor/blocks_test_should_use_http_uri_scheme_for_assets_when_asset_uri_scheme_is_http.adoc
        // Expected: blocksTestShouldUseHttpUriSchemeForAssetsWhenAssetUriSchemeIsHttp
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should use no uri scheme for assets when asset-uri-scheme is blank`() {
        // Input: asciidoctor/blocks_test_should_use_no_uri_scheme_for_assets_when_asset_uri_scheme_is_blank.adoc
        // Expected: blocksTestShouldUseNoUriSchemeForAssetsWhenAssetUriSchemeIsBlank
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `restricts access to ancestor directories when safe mode level is at least SAFE`() {
        // Input: asciidoctor/blocks_test_restricts_access_to_ancestor_directories_when_safe_mode_level_is_at_least_safe.adoc
        // Expected: blocksTestRestrictsAccessToAncestorDirectoriesWhenSafeModeLevelIsAtLeastSafe
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not recognize fenced code blocks with more than three delimiters`() {
        // Input: asciidoctor/blocks_test_should_not_recognize_fenced_code_blocks_with_more_than_three_delimiters.adoc
        // Expected: blocksTestShouldNotRecognizeFencedCodeBlocksWithMoreThanThreeDelimiters
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should support fenced code blocks with languages`() {
        // Input: asciidoctor/blocks_test_should_support_fenced_code_blocks_with_languages.adoc
        // Expected: blocksTestShouldSupportFencedCodeBlocksWithLanguages
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should support fenced code blocks with languages and numbering`() {
        // Input: asciidoctor/blocks_test_should_support_fenced_code_blocks_with_languages_and_numbering.adoc
        // Expected: blocksTestShouldSupportFencedCodeBlocksWithLanguagesAndNumbering
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should allow source style to be specified on literal block`() {
        // Input: asciidoctor/blocks_test_should_allow_source_style_to_be_specified_on_literal_block.adoc
        // Expected: blocksTestShouldAllowSourceStyleToBeSpecifiedOnLiteralBlock
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should allow source style and language to be specified on literal block`() {
        // Input: asciidoctor/blocks_test_should_allow_source_style_and_language_to_be_specified_on_literal_block.adoc
        // Expected: blocksTestShouldAllowSourceStyleAndLanguageToBeSpecifiedOnLiteralBlock
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should make abstract on open block without title a quote block for article`() {
        // Input: asciidoctor/blocks_test_should_make_abstract_on_open_block_without_title_a_quote_block_for_article.adoc
        // Expected: blocksTestShouldMakeAbstractOnOpenBlockWithoutTitleAQuoteBlockForArticle
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should make abstract on open block with title a quote block with title for article`() {
        // Input: asciidoctor/blocks_test_should_make_abstract_on_open_block_with_title_a_quote_block_with_title_for_article.adoc
        // Expected: blocksTestShouldMakeAbstractOnOpenBlockWithTitleAQuoteBlockWithTitleForArticle
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should allow abstract in document with title if doctype is book`() {
        // Input: asciidoctor/blocks_test_should_allow_abstract_in_document_with_title_if_doctype_is_book.adoc
        // Expected: blocksTestShouldAllowAbstractInDocumentWithTitleIfDoctypeIsBook
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not allow abstract as direct child of document if doctype is book`() {
        // Input: asciidoctor/blocks_test_should_not_allow_abstract_as_direct_child_of_document_if_doctype_is_book.adoc
        // Expected: blocksTestShouldNotAllowAbstractAsDirectChildOfDocumentIfDoctypeIsBook
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should make abstract on open block without title converted to DocBook`() {
        // Input: asciidoctor/blocks_test_should_make_abstract_on_open_block_without_title_converted_to_doc_book.adoc
        // Expected: blocksTestShouldMakeAbstractOnOpenBlockWithoutTitleConvertedToDocBook
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should make abstract on open block with title converted to DocBook`() {
        // Input: asciidoctor/blocks_test_should_make_abstract_on_open_block_with_title_converted_to_doc_book.adoc
        // Expected: blocksTestShouldMakeAbstractOnOpenBlockWithTitleConvertedToDocBook
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should allow abstract in document with title if doctype is book converted to DocBook`() {
        // Input: asciidoctor/blocks_test_should_allow_abstract_in_document_with_title_if_doctype_is_book_converted_to_doc_book.adoc
        // Expected: blocksTestShouldAllowAbstractInDocumentWithTitleIfDoctypeIsBookConvertedToDocBook
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not allow abstract as direct child of document if doctype is book converted to DocBook`() {
        // Input: asciidoctor/blocks_test_should_not_allow_abstract_as_direct_child_of_document_if_doctype_is_book_converted_to_doc_book.adoc
        // Expected: blocksTestShouldNotAllowAbstractAsDirectChildOfDocumentIfDoctypeIsBookConvertedToDocBook
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should accept partintro on open block without title`() {
        // Input: asciidoctor/blocks_test_should_accept_partintro_on_open_block_without_title.adoc
        // Expected: blocksTestShouldAcceptPartintroOnOpenBlockWithoutTitle
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should accept partintro on open block with title`() {
        // Input: asciidoctor/blocks_test_should_accept_partintro_on_open_block_with_title.adoc
        // Expected: blocksTestShouldAcceptPartintroOnOpenBlockWithTitle
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should exclude partintro if not a child of part`() {
        // Input: asciidoctor/blocks_test_should_exclude_partintro_if_not_a_child_of_part.adoc
        // Expected: blocksTestShouldExcludePartintroIfNotAChildOfPart
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not allow partintro unless doctype is book`() {
        // Input: asciidoctor/blocks_test_should_not_allow_partintro_unless_doctype_is_book.adoc
        // Expected: blocksTestShouldNotAllowPartintroUnlessDoctypeIsBook
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should accept partintro on open block without title converted to DocBook`() {
        // Input: asciidoctor/blocks_test_should_accept_partintro_on_open_block_without_title_converted_to_doc_book.adoc
        // Expected: blocksTestShouldAcceptPartintroOnOpenBlockWithoutTitleConvertedToDocBook
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should accept partintro on open block with title converted to DocBook`() {
        // Input: asciidoctor/blocks_test_should_accept_partintro_on_open_block_with_title_converted_to_doc_book.adoc
        // Expected: blocksTestShouldAcceptPartintroOnOpenBlockWithTitleConvertedToDocBook
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should exclude partintro if not a child of part converted to DocBook`() {
        // Input: asciidoctor/blocks_test_should_exclude_partintro_if_not_a_child_of_part_converted_to_doc_book.adoc
        // Expected: blocksTestShouldExcludePartintroIfNotAChildOfPartConvertedToDocBook
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not allow partintro unless doctype is book converted to DocBook`() {
        // Input: asciidoctor/blocks_test_should_not_allow_partintro_unless_doctype_is_book_converted_to_doc_book.adoc
        // Expected: blocksTestShouldNotAllowPartintroUnlessDoctypeIsBookConvertedToDocBook
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `processor should not crash if subs are empty`() {
        // Input: asciidoctor/blocks_test_processor_should_not_crash_if_subs_are_empty.adoc
        // Expected: blocksTestProcessorShouldNotCrashIfSubsAreEmpty
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should be able to append subs to default block substitution list`() {
        // Input: asciidoctor/blocks_test_should_be_able_to_append_subs_to_default_block_substitution_list.adoc
        // Expected: blocksTestShouldBeAbleToAppendSubsToDefaultBlockSubstitutionList
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should be able to prepend subs to default block substitution list`() {
        // Input: asciidoctor/blocks_test_should_be_able_to_prepend_subs_to_default_block_substitution_list.adoc
        // Expected: blocksTestShouldBeAbleToPrependSubsToDefaultBlockSubstitutionList
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should be able to remove subs to default block substitution list`() {
        // Input: asciidoctor/blocks_test_should_be_able_to_remove_subs_to_default_block_substitution_list.adoc
        // Expected: blocksTestShouldBeAbleToRemoveSubsToDefaultBlockSubstitutionList
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should be able to prepend, append and remove subs from default block substitution list`() {
        // Input: asciidoctor/blocks_test_should_be_able_to_prepend_append_and_remove_subs_from_default_block_substitution_list.adoc
        // Expected: blocksTestShouldBeAbleToPrependAppendAndRemoveSubsFromDefaultBlockSubstitutionList
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should be able to set subs then modify them`() {
        // Input: asciidoctor/blocks_test_should_be_able_to_set_subs_then_modify_them.adoc
        // Expected: blocksTestShouldBeAbleToSetSubsThenModifyThem
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not recognize block anchor with illegal id characters`() {
        // Input: asciidoctor/blocks_test_should_not_recognize_block_anchor_with_illegal_id_characters.adoc
        // Expected: blocksTestShouldNotRecognizeBlockAnchorWithIllegalIdCharacters
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not recognize block anchor that starts with digit`() {
        // Input: asciidoctor/blocks_test_should_not_recognize_block_anchor_that_starts_with_digit.adoc
        // Expected: blocksTestShouldNotRecognizeBlockAnchorThatStartsWithDigit
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should recognize block anchor that starts with colon`() {
        // Input: asciidoctor/blocks_test_should_recognize_block_anchor_that_starts_with_colon.adoc
        // Expected: blocksTestShouldRecognizeBlockAnchorThatStartsWithColon
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should use specified id and reftext when registering block reference`() {
        // Input: asciidoctor/blocks_test_should_use_specified_id_and_reftext_when_registering_block_reference.adoc
        // Expected: blocksTestShouldUseSpecifiedIdAndReftextWhenRegisteringBlockReference
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should allow square brackets in block reference text`() {
        // Input: asciidoctor/blocks_test_should_allow_square_brackets_in_block_reference_text.adoc
        // Expected: blocksTestShouldAllowSquareBracketsInBlockReferenceText
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should allow comma in block reference text`() {
        // Input: asciidoctor/blocks_test_should_allow_comma_in_block_reference_text.adoc
        // Expected: blocksTestShouldAllowCommaInBlockReferenceText
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should resolve attribute reference in title using attribute defined at location of block`() {
        // Input: asciidoctor/blocks_test_should_resolve_attribute_reference_in_title_using_attribute_defined_at_location_of_block.adoc
        // Expected: blocksTestShouldResolveAttributeReferenceInTitleUsingAttributeDefinedAtLocationOfBlock
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should substitute attribute references in reftext when registering block reference`() {
        // Input: asciidoctor/blocks_test_should_substitute_attribute_references_in_reftext_when_registering_block_reference.adoc
        // Expected: blocksTestShouldSubstituteAttributeReferencesInReftextWhenRegisteringBlockReference
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should use specified reftext when registering block reference`() {
        // Input: asciidoctor/blocks_test_should_use_specified_reftext_when_registering_block_reference.adoc
        // Expected: blocksTestShouldUseSpecifiedReftextWhenRegisteringBlockReference
    }

}
