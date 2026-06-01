package com.kmplibs.asciidoc.integration

import kotlin.test.Test
import kotlin.test.Ignore

class ListsTest {

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `dash elements with no blank lines`() {
        // Input: asciidoctor/lists_test_dash_elements_with_no_blank_lines.adoc
        // Expected: listsTestDashElementsWithNoBlankLines
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `dash elements separated by blank lines should merge lists`() {
        // Input: asciidoctor/lists_test_dash_elements_separated_by_blank_lines_should_merge_lists.adoc
        // Expected: listsTestDashElementsSeparatedByBlankLinesShouldMergeLists
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `dash elements with interspersed line comments should be skipped and not break list`() {
        // Input: asciidoctor/lists_test_dash_elements_with_interspersed_line_comments_should_be_skipped_and_not_break_list.adoc
        // Expected: listsTestDashElementsWithInterspersedLineCommentsShouldBeSkippedAndNotBreakList
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `dash elements separated by a line comment offset by blank lines should not merge lists`() {
        // Input: asciidoctor/lists_test_dash_elements_separated_by_a_line_comment_offset_by_blank_lines_should_not_merge_lists.adoc
        // Expected: listsTestDashElementsSeparatedByALineCommentOffsetByBlankLinesShouldNotMergeLists
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `dash elements separated by a block title offset by a blank line should not merge lists`() {
        // Input: asciidoctor/lists_test_dash_elements_separated_by_a_block_title_offset_by_a_blank_line_should_not_merge_lists.adoc
        // Expected: listsTestDashElementsSeparatedByABlockTitleOffsetByABlankLineShouldNotMergeLists
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `dash elements separated by an attribute entry offset by a blank line should not merge lists`() {
        // Input: asciidoctor/lists_test_dash_elements_separated_by_an_attribute_entry_offset_by_a_blank_line_should_not_merge_lists.adoc
        // Expected: listsTestDashElementsSeparatedByAnAttributeEntryOffsetByABlankLineShouldNotMergeLists
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `a non-indented wrapped line is folded into text of list item`() {
        // Input: asciidoctor/lists_test_a_non_indented_wrapped_line_is_folded_into_text_of_list_item.adoc
        // Expected: listsTestANonIndentedWrappedLineIsFoldedIntoTextOfListItem
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `a non-indented wrapped line that resembles a block title is folded into text of list item`() {
        // Input: asciidoctor/lists_test_a_non_indented_wrapped_line_that_resembles_a_block_title_is_folded_into_text_of_list_item.adoc
        // Expected: listsTestANonIndentedWrappedLineThatResemblesABlockTitleIsFoldedIntoTextOfListItem
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `a non-indented wrapped line that resembles an attribute entry is folded into text of list item`() {
        // Input: asciidoctor/lists_test_a_non_indented_wrapped_line_that_resembles_an_attribute_entry_is_folded_into_text_of_list_item.adoc
        // Expected: listsTestANonIndentedWrappedLineThatResemblesAnAttributeEntryIsFoldedIntoTextOfListItem
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `a list item with a nested marker terminates non-indented paragraph for text of list item`() {
        // Input: asciidoctor/lists_test_a_list_item_with_a_nested_marker_terminates_non_indented_paragraph_for_text_of_list_item.adoc
        // Expected: listsTestAListItemWithANestedMarkerTerminatesNonIndentedParagraphForTextOfListItem
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `a list item for a different list terminates non-indented paragraph for text of list item`() {
        // Input: asciidoctor/lists_test_a_list_item_for_a_different_list_terminates_non_indented_paragraph_for_text_of_list_item.adoc
        // Expected: listsTestAListItemForADifferentListTerminatesNonIndentedParagraphForTextOfListItem
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `an indented wrapped line is unindented and folded into text of list item`() {
        // Input: asciidoctor/lists_test_an_indented_wrapped_line_is_unindented_and_folded_into_text_of_list_item.adoc
        // Expected: listsTestAnIndentedWrappedLineIsUnindentedAndFoldedIntoTextOfListItem
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `wrapped list item with hanging indent followed by non-indented line`() {
        // Input: asciidoctor/lists_test_wrapped_list_item_with_hanging_indent_followed_by_non_indented_line.adoc
        // Expected: listsTestWrappedListItemWithHangingIndentFollowedByNonIndentedLine
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `a list item with a nested marker terminates indented paragraph for text of list item`() {
        // Input: asciidoctor/lists_test_a_list_item_with_a_nested_marker_terminates_indented_paragraph_for_text_of_list_item.adoc
        // Expected: listsTestAListItemWithANestedMarkerTerminatesIndentedParagraphForTextOfListItem
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `a list item for a different list terminates indented paragraph for text of list item`() {
        // Input: asciidoctor/lists_test_a_list_item_for_a_different_list_terminates_indented_paragraph_for_text_of_list_item.adoc
        // Expected: listsTestAListItemForADifferentListTerminatesIndentedParagraphForTextOfListItem
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `a literal paragraph offset by blank lines in list content is appended as a literal block`() {
        // Input: asciidoctor/lists_test_a_literal_paragraph_offset_by_blank_lines_in_list_content_is_appended_as_a_literal_block.adoc
        // Expected: listsTestALiteralParagraphOffsetByBlankLinesInListContentIsAppendedAsALiteralBlock
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should escape special characters in all literal paragraphs attached to list item`() {
        // Input: asciidoctor/lists_test_should_escape_special_characters_in_all_literal_paragraphs_attached_to_list_item.adoc
        // Expected: listsTestShouldEscapeSpecialCharactersInAllLiteralParagraphsAttachedToListItem
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `a literal paragraph offset by a blank line in list content followed by line with continuation is appended as two blocks`() {
        // Input: asciidoctor/lists_test_a_literal_paragraph_offset_by_a_blank_line_in_list_content_followed_by_line_with_continuation_is_appended_as_two_blocks.adoc
        // Expected: listsTestALiteralParagraphOffsetByABlankLineInListContentFollowedByLineWithContinuationIsAppendedAsTwoBlocks
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `an admonition paragraph attached by a line continuation to a list item with wrapped text should produce admonition`() {
        // Input: asciidoctor/lists_test_an_admonition_paragraph_attached_by_a_line_continuation_to_a_list_item_with_wrapped_text_should_produce_admonition.adoc
        // Expected: listsTestAnAdmonitionParagraphAttachedByALineContinuationToAListItemWithWrappedTextShouldProduceAdmonition
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `paragraph-like blocks attached to an ancestor list item by a list continuation should produce blocks`() {
        // Input: asciidoctor/lists_test_paragraph_like_blocks_attached_to_an_ancestor_list_item_by_a_list_continuation_should_produce_blocks.adoc
        // Expected: listsTestParagraphLikeBlocksAttachedToAnAncestorListItemByAListContinuationShouldProduceBlocks
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not inherit block attributes from previous block when block is attached using a list continuation`() {
        // Input: asciidoctor/lists_test_should_not_inherit_block_attributes_from_previous_block_when_block_is_attached_using_a_list_continuation.adoc
        // Expected: listsTestShouldNotInheritBlockAttributesFromPreviousBlockWhenBlockIsAttachedUsingAListContinuation
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should continue to parse blocks attached by a list continuation after block is dropped`() {
        // Input: asciidoctor/lists_test_should_continue_to_parse_blocks_attached_by_a_list_continuation_after_block_is_dropped.adoc
        // Expected: listsTestShouldContinueToParseBlocksAttachedByAListContinuationAfterBlockIsDropped
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `appends line as paragraph if attached by continuation following line comment`() {
        // Input: asciidoctor/lists_test_appends_line_as_paragraph_if_attached_by_continuation_following_line_comment.adoc
        // Expected: listsTestAppendsLineAsParagraphIfAttachedByContinuationFollowingLineComment
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `a literal paragraph with a line that appears as a list item that is followed by a continuation should create two blocks`() {
        // Input: asciidoctor/lists_test_a_literal_paragraph_with_a_line_that_appears_as_a_list_item_that_is_followed_by_a_continuation_should_create_two_blocks.adoc
        // Expected: listsTestALiteralParagraphWithALineThatAppearsAsAListItemThatIsFollowedByAContinuationShouldCreateTwoBlocks
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `consecutive literal paragraph offset by blank lines in list content are appended as a literal blocks`() {
        // Input: asciidoctor/lists_test_consecutive_literal_paragraph_offset_by_blank_lines_in_list_content_are_appended_as_a_literal_blocks.adoc
        // Expected: listsTestConsecutiveLiteralParagraphOffsetByBlankLinesInListContentAreAppendedAsALiteralBlocks
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `a literal paragraph without a trailing blank line consumes following list items`() {
        // Input: asciidoctor/lists_test_a_literal_paragraph_without_a_trailing_blank_line_consumes_following_list_items.adoc
        // Expected: listsTestALiteralParagraphWithoutATrailingBlankLineConsumesFollowingListItems
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `asterisk elements with no blank lines`() {
        // Input: asciidoctor/lists_test_asterisk_elements_with_no_blank_lines.adoc
        // Expected: listsTestAsteriskElementsWithNoBlankLines
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `asterisk elements separated by blank lines should merge lists`() {
        // Input: asciidoctor/lists_test_asterisk_elements_separated_by_blank_lines_should_merge_lists.adoc
        // Expected: listsTestAsteriskElementsSeparatedByBlankLinesShouldMergeLists
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `asterisk elements with interspersed line comments should be skipped and not break list`() {
        // Input: asciidoctor/lists_test_asterisk_elements_with_interspersed_line_comments_should_be_skipped_and_not_break_list.adoc
        // Expected: listsTestAsteriskElementsWithInterspersedLineCommentsShouldBeSkippedAndNotBreakList
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `asterisk elements separated by a line comment offset by blank lines should not merge lists`() {
        // Input: asciidoctor/lists_test_asterisk_elements_separated_by_a_line_comment_offset_by_blank_lines_should_not_merge_lists.adoc
        // Expected: listsTestAsteriskElementsSeparatedByALineCommentOffsetByBlankLinesShouldNotMergeLists
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `asterisk elements separated by a block title offset by a blank line should not merge lists`() {
        // Input: asciidoctor/lists_test_asterisk_elements_separated_by_a_block_title_offset_by_a_blank_line_should_not_merge_lists.adoc
        // Expected: listsTestAsteriskElementsSeparatedByABlockTitleOffsetByABlankLineShouldNotMergeLists
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `asterisk elements separated by an attribute entry offset by a blank line should not merge lists`() {
        // Input: asciidoctor/lists_test_asterisk_elements_separated_by_an_attribute_entry_offset_by_a_blank_line_should_not_merge_lists.adoc
        // Expected: listsTestAsteriskElementsSeparatedByAnAttributeEntryOffsetByABlankLineShouldNotMergeLists
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `list should terminate before next lower section heading`() {
        // Input: asciidoctor/lists_test_list_should_terminate_before_next_lower_section_heading.adoc
        // Expected: listsTestListShouldTerminateBeforeNextLowerSectionHeading
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `list should terminate before next lower section heading with implicit id`() {
        // Input: asciidoctor/lists_test_list_should_terminate_before_next_lower_section_heading_with_implicit_id.adoc
        // Expected: listsTestListShouldTerminateBeforeNextLowerSectionHeadingWithImplicitId
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not find section title immediately below last list item`() {
        // Input: asciidoctor/lists_test_should_not_find_section_title_immediately_below_last_list_item.adoc
        // Expected: listsTestShouldNotFindSectionTitleImmediatelyBelowLastListItem
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `quoted text`() {
        // Input: asciidoctor/lists_test_quoted_text.adoc
        // Expected: listsTestQuotedText
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `attribute substitutions`() {
        // Input: asciidoctor/lists_test_attribute_substitutions.adoc
        // Expected: listsTestAttributeSubstitutions
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `leading dot is treated as text not block title`() {
        // Input: asciidoctor/lists_test_leading_dot_is_treated_as_text_not_block_title.adoc
        // Expected: listsTestLeadingDotIsTreatedAsTextNotBlockTitle
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `word ending sentence on continuing line not treated as a list item`() {
        // Input: asciidoctor/lists_test_word_ending_sentence_on_continuing_line_not_treated_as_a_list_item.adoc
        // Expected: listsTestWordEndingSentenceOnContinuingLineNotTreatedAsAListItem
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should discover anchor at start of unordered list item text and register it as a reference`() {
        // Input: asciidoctor/lists_test_should_discover_anchor_at_start_of_unordered_list_item_text_and_register_it_as_a_reference.adoc
        // Expected: listsTestShouldDiscoverAnchorAtStartOfUnorderedListItemTextAndRegisterItAsAReference
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should discover anchor at start of ordered list item text and register it as a reference`() {
        // Input: asciidoctor/lists_test_should_discover_anchor_at_start_of_ordered_list_item_text_and_register_it_as_a_reference.adoc
        // Expected: listsTestShouldDiscoverAnchorAtStartOfOrderedListItemTextAndRegisterItAsAReference
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should discover anchor at start of callout list item text and register it as a reference`() {
        // Input: asciidoctor/lists_test_should_discover_anchor_at_start_of_callout_list_item_text_and_register_it_as_a_reference.adoc
        // Expected: listsTestShouldDiscoverAnchorAtStartOfCalloutListItemTextAndRegisterItAsAReference
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `asterisk element mixed with dash elements should be nested`() {
        // Input: asciidoctor/lists_test_asterisk_element_mixed_with_dash_elements_should_be_nested.adoc
        // Expected: listsTestAsteriskElementMixedWithDashElementsShouldBeNested
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `dash element mixed with asterisks elements should be nested`() {
        // Input: asciidoctor/lists_test_dash_element_mixed_with_asterisks_elements_should_be_nested.adoc
        // Expected: listsTestDashElementMixedWithAsterisksElementsShouldBeNested
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `lines prefixed with alternating list markers separated by blank lines should be nested`() {
        // Input: asciidoctor/lists_test_lines_prefixed_with_alternating_list_markers_separated_by_blank_lines_should_be_nested.adoc
        // Expected: listsTestLinesPrefixedWithAlternatingListMarkersSeparatedByBlankLinesShouldBeNested
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `nested elements (2) with asterisks`() {
        // Input: asciidoctor/lists_test_nested_elements_(2)_with_asterisks.adoc
        // Expected: listsTestNestedElements2WithAsterisks
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `nested elements (3) with asterisks`() {
        // Input: asciidoctor/lists_test_nested_elements_(3)_with_asterisks.adoc
        // Expected: listsTestNestedElements3WithAsterisks
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `nested elements (4) with asterisks`() {
        // Input: asciidoctor/lists_test_nested_elements_(4)_with_asterisks.adoc
        // Expected: listsTestNestedElements4WithAsterisks
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `nested elements (5) with asterisks`() {
        // Input: asciidoctor/lists_test_nested_elements_(5)_with_asterisks.adoc
        // Expected: listsTestNestedElements5WithAsterisks
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `level of unordered list should match section level`() {
        // Input: asciidoctor/lists_test_level_of_unordered_list_should_match_section_level.adoc
        // Expected: listsTestLevelOfUnorderedListShouldMatchSectionLevel
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `does not recognize lists with repeating unicode bullets`() {
        // Input: asciidoctor/lists_test_does_not_recognize_lists_with_repeating_unicode_bullets.adoc
        // Expected: listsTestDoesNotRecognizeListsWithRepeatingUnicodeBullets
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `nested ordered elements (3)`() {
        // Input: asciidoctor/lists_test_nested_ordered_elements_(3).adoc
        // Expected: listsTestNestedOrderedElements3
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `level of ordered list should match section level`() {
        // Input: asciidoctor/lists_test_level_of_ordered_list_should_match_section_level.adoc
        // Expected: listsTestLevelOfOrderedListShouldMatchSectionLevel
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `nested unordered inside ordered elements`() {
        // Input: asciidoctor/lists_test_nested_unordered_inside_ordered_elements.adoc
        // Expected: listsTestNestedUnorderedInsideOrderedElements
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `nested ordered inside unordered elements`() {
        // Input: asciidoctor/lists_test_nested_ordered_inside_unordered_elements.adoc
        // Expected: listsTestNestedOrderedInsideUnorderedElements
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `three levels of alternating unordered and ordered elements`() {
        // Input: asciidoctor/lists_test_three_levels_of_alternating_unordered_and_ordered_elements.adoc
        // Expected: listsTestThreeLevelsOfAlternatingUnorderedAndOrderedElements
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `lines with alternating markers of unordered and ordered list types separated by blank lines should be nested`() {
        // Input: asciidoctor/lists_test_lines_with_alternating_markers_of_unordered_and_ordered_list_types_separated_by_blank_lines_should_be_nested.adoc
        // Expected: listsTestLinesWithAlternatingMarkersOfUnorderedAndOrderedListTypesSeparatedByBlankLinesShouldBeNested
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `list item with literal content should not consume nested list of different type`() {
        // Input: asciidoctor/lists_test_list_item_with_literal_content_should_not_consume_nested_list_of_different_type.adoc
        // Expected: listsTestListItemWithLiteralContentShouldNotConsumeNestedListOfDifferentType
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `nested list item does not eat the title of the following detached block`() {
        // Input: asciidoctor/lists_test_nested_list_item_does_not_eat_the_title_of_the_following_detached_block.adoc
        // Expected: listsTestNestedListItemDoesNotEatTheTitleOfTheFollowingDetachedBlock
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `lines with alternating markers of bulleted and description list types separated by blank lines should be nested`() {
        // Input: asciidoctor/lists_test_lines_with_alternating_markers_of_bulleted_and_description_list_types_separated_by_blank_lines_should_be_nested.adoc
        // Expected: listsTestLinesWithAlternatingMarkersOfBulletedAndDescriptionListTypesSeparatedByBlankLinesShouldBeNested
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `nested ordered with attribute inside unordered elements`() {
        // Input: asciidoctor/lists_test_nested_ordered_with_attribute_inside_unordered_elements.adoc
        // Expected: listsTestNestedOrderedWithAttributeInsideUnorderedElements
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `adjacent list continuation line attaches following paragraph`() {
        // Input: asciidoctor/lists_test_adjacent_list_continuation_line_attaches_following_paragraph.adoc
        // Expected: listsTestAdjacentListContinuationLineAttachesFollowingParagraph
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `adjacent list continuation line attaches following block`() {
        // Input: asciidoctor/lists_test_adjacent_list_continuation_line_attaches_following_block.adoc
        // Expected: listsTestAdjacentListContinuationLineAttachesFollowingBlock
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `adjacent list continuation line attaches following block with block attributes`() {
        // Input: asciidoctor/lists_test_adjacent_list_continuation_line_attaches_following_block_with_block_attributes.adoc
        // Expected: listsTestAdjacentListContinuationLineAttachesFollowingBlockWithBlockAttributes
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `trailing block attribute line attached by continuation should not create block`() {
        // Input: asciidoctor/lists_test_trailing_block_attribute_line_attached_by_continuation_should_not_create_block.adoc
        // Expected: listsTestTrailingBlockAttributeLineAttachedByContinuationShouldNotCreateBlock
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `trailing block title line attached by continuation should not create block`() {
        // Input: asciidoctor/lists_test_trailing_block_title_line_attached_by_continuation_should_not_create_block.adoc
        // Expected: listsTestTrailingBlockTitleLineAttachedByContinuationShouldNotCreateBlock
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `consecutive blocks in list continuation attach to list item`() {
        // Input: asciidoctor/lists_test_consecutive_blocks_in_list_continuation_attach_to_list_item.adoc
        // Expected: listsTestConsecutiveBlocksInListContinuationAttachToListItem
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `list item with hanging indent followed by block attached by list continuation`() {
        // Input: asciidoctor/lists_test_list_item_with_hanging_indent_followed_by_block_attached_by_list_continuation.adoc
        // Expected: listsTestListItemWithHangingIndentFollowedByBlockAttachedByListContinuation
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `list item paragraph in list item and nested list item`() {
        // Input: asciidoctor/lists_test_list_item_paragraph_in_list_item_and_nested_list_item.adoc
        // Expected: listsTestListItemParagraphInListItemAndNestedListItem
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `trailing list continuations should attach to list items at respective levels`() {
        // Input: asciidoctor/lists_test_trailing_list_continuations_should_attach_to_list_items_at_respective_levels.adoc
        // Expected: listsTestTrailingListContinuationsShouldAttachToListItemsAtRespectiveLevels
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `trailing list continuations should attach to list items of different types at respective levels`() {
        // Input: asciidoctor/lists_test_trailing_list_continuations_should_attach_to_list_items_of_different_types_at_respective_levels.adoc
        // Expected: listsTestTrailingListContinuationsShouldAttachToListItemsOfDifferentTypesAtRespectiveLevels
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `repeated list continuations should attach to list items at respective levels`() {
        // Input: asciidoctor/lists_test_repeated_list_continuations_should_attach_to_list_items_at_respective_levels.adoc
        // Expected: listsTestRepeatedListContinuationsShouldAttachToListItemsAtRespectiveLevels
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `repeated list continuations attached directly to list item should attach to list items at respective levels`() {
        // Input: asciidoctor/lists_test_repeated_list_continuations_attached_directly_to_list_item_should_attach_to_list_items_at_respective_levels.adoc
        // Expected: listsTestRepeatedListContinuationsAttachedDirectlyToListItemShouldAttachToListItemsAtRespectiveLevels
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `repeated list continuations should attach to list items at respective levels ignoring blank lines`() {
        // Input: asciidoctor/lists_test_repeated_list_continuations_should_attach_to_list_items_at_respective_levels_ignoring_blank_lines.adoc
        // Expected: listsTestRepeatedListContinuationsShouldAttachToListItemsAtRespectiveLevelsIgnoringBlankLines
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `trailing list continuations should ignore preceding blank lines`() {
        // Input: asciidoctor/lists_test_trailing_list_continuations_should_ignore_preceding_blank_lines.adoc
        // Expected: listsTestTrailingListContinuationsShouldIgnorePrecedingBlankLines
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `indented outline list item with different marker offset by a blank line should be recognized as a nested list`() {
        // Input: asciidoctor/lists_test_indented_outline_list_item_with_different_marker_offset_by_a_blank_line_should_be_recognized_as_a_nested_list.adoc
        // Expected: listsTestIndentedOutlineListItemWithDifferentMarkerOffsetByABlankLineShouldBeRecognizedAsANestedList
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `indented description list item inside outline list item offset by a blank line should be recognized as a nested list`() {
        // Input: asciidoctor/lists_test_indented_description_list_item_inside_outline_list_item_offset_by_a_blank_line_should_be_recognized_as_a_nested_list.adoc
        // Expected: listsTestIndentedDescriptionListItemInsideOutlineListItemOffsetByABlankLineShouldBeRecognizedAsANestedList
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `consecutive list continuation lines are folded`() {
        // Input: asciidoctor/lists_test_consecutive_list_continuation_lines_are_folded.adoc
        // Expected: listsTestConsecutiveListContinuationLinesAreFolded
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should warn if unterminated block is detected in list item`() {
        // Input: asciidoctor/lists_test_should_warn_if_unterminated_block_is_detected_in_list_item.adoc
        // Expected: listsTestShouldWarnIfUnterminatedBlockIsDetectedInListItem
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `dot elements with no blank lines`() {
        // Input: asciidoctor/lists_test_dot_elements_with_no_blank_lines.adoc
        // Expected: listsTestDotElementsWithNoBlankLines
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should represent explicit role attribute as style class`() {
        // Input: asciidoctor/lists_test_should_represent_explicit_role_attribute_as_style_class.adoc
        // Expected: listsTestShouldRepresentExplicitRoleAttributeAsStyleClass
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should base list style on marker length rather than list depth`() {
        // Input: asciidoctor/lists_test_should_base_list_style_on_marker_length_rather_than_list_depth.adoc
        // Expected: listsTestShouldBaseListStyleOnMarkerLengthRatherThanListDepth
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should allow list style to be specified explicitly when using markers with implicit style`() {
        // Input: asciidoctor/lists_test_should_allow_list_style_to_be_specified_explicitly_when_using_markers_with_implicit_style.adoc
        // Expected: listsTestShouldAllowListStyleToBeSpecifiedExplicitlyWhenUsingMarkersWithImplicitStyle
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should represent custom numbering and explicit role attribute as style classes`() {
        // Input: asciidoctor/lists_test_should_represent_custom_numbering_and_explicit_role_attribute_as_style_classes.adoc
        // Expected: listsTestShouldRepresentCustomNumberingAndExplicitRoleAttributeAsStyleClasses
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should set reversed attribute on list if reversed option is set`() {
        // Input: asciidoctor/lists_test_should_set_reversed_attribute_on_list_if_reversed_option_is_set.adoc
        // Expected: listsTestShouldSetReversedAttributeOnListIfReversedOptionIsSet
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should represent implicit role attribute as style class`() {
        // Input: asciidoctor/lists_test_should_represent_implicit_role_attribute_as_style_class.adoc
        // Expected: listsTestShouldRepresentImplicitRoleAttributeAsStyleClass
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should represent custom numbering and implicit role attribute as style classes`() {
        // Input: asciidoctor/lists_test_should_represent_custom_numbering_and_implicit_role_attribute_as_style_classes.adoc
        // Expected: listsTestShouldRepresentCustomNumberingAndImplicitRoleAttributeAsStyleClasses
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `dot elements separated by blank lines should merge lists`() {
        // Input: asciidoctor/lists_test_dot_elements_separated_by_blank_lines_should_merge_lists.adoc
        // Expected: listsTestDotElementsSeparatedByBlankLinesShouldMergeLists
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `dot elements with interspersed line comments should be skipped and not break list`() {
        // Input: asciidoctor/lists_test_dot_elements_with_interspersed_line_comments_should_be_skipped_and_not_break_list.adoc
        // Expected: listsTestDotElementsWithInterspersedLineCommentsShouldBeSkippedAndNotBreakList
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `dot elements separated by line comment offset by blank lines should not merge lists`() {
        // Input: asciidoctor/lists_test_dot_elements_separated_by_line_comment_offset_by_blank_lines_should_not_merge_lists.adoc
        // Expected: listsTestDotElementsSeparatedByLineCommentOffsetByBlankLinesShouldNotMergeLists
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `dot elements separated by a block title offset by a blank line should not merge lists`() {
        // Input: asciidoctor/lists_test_dot_elements_separated_by_a_block_title_offset_by_a_blank_line_should_not_merge_lists.adoc
        // Expected: listsTestDotElementsSeparatedByABlockTitleOffsetByABlankLineShouldNotMergeLists
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `dot elements separated by an attribute entry offset by a blank line should not merge lists`() {
        // Input: asciidoctor/lists_test_dot_elements_separated_by_an_attribute_entry_offset_by_a_blank_line_should_not_merge_lists.adoc
        // Expected: listsTestDotElementsSeparatedByAnAttributeEntryOffsetByABlankLineShouldNotMergeLists
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should use start number in docbook5 backend`() {
        // Input: asciidoctor/lists_test_should_use_start_number_in_docbook_5_backend.adoc
        // Expected: listsTestShouldUseStartNumberInDocbook5Backend
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should warn if explicit uppercase roman numerals in list are out of sequence`() {
        // Input: asciidoctor/lists_test_should_warn_if_explicit_uppercase_roman_numerals_in_list_are_out_of_sequence.adoc
        // Expected: listsTestShouldWarnIfExplicitUppercaseRomanNumeralsInListAreOutOfSequence
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should warn if explicit lowercase roman numerals in list are out of sequence`() {
        // Input: asciidoctor/lists_test_should_warn_if_explicit_lowercase_roman_numerals_in_list_are_out_of_sequence.adoc
        // Expected: listsTestShouldWarnIfExplicitLowercaseRomanNumeralsInListAreOutOfSequence
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not parse a bare dlist delimiter as a dlist`() {
        // Input: asciidoctor/lists_test_should_not_parse_a_bare_dlist_delimiter_as_a_dlist.adoc
        // Expected: listsTestShouldNotParseABareDlistDelimiterAsADlist
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should parse sibling items using same rules`() {
        // Input: asciidoctor/lists_test_should_parse_sibling_items_using_same_rules.adoc
        // Expected: listsTestShouldParseSiblingItemsUsingSameRules
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should allow term to end with a semicolon when using double semicolon delimiter`() {
        // Input: asciidoctor/lists_test_should_allow_term_to_end_with_a_semicolon_when_using_double_semicolon_delimiter.adoc
        // Expected: listsTestShouldAllowTermToEndWithASemicolonWhenUsingDoubleSemicolonDelimiter
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `single-line indented adjacent elements`() {
        // Input: asciidoctor/lists_test_single_line_indented_adjacent_elements.adoc
        // Expected: listsTestSingleLineIndentedAdjacentElements
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `single-line elements separated by blank line should create a single list`() {
        // Input: asciidoctor/lists_test_single_line_elements_separated_by_blank_line_should_create_a_single_list.adoc
        // Expected: listsTestSingleLineElementsSeparatedByBlankLineShouldCreateASingleList
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `a line comment between elements should divide them into separate lists`() {
        // Input: asciidoctor/lists_test_a_line_comment_between_elements_should_divide_them_into_separate_lists.adoc
        // Expected: listsTestALineCommentBetweenElementsShouldDivideThemIntoSeparateLists
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `a ruler between elements should divide them into separate lists`() {
        // Input: asciidoctor/lists_test_a_ruler_between_elements_should_divide_them_into_separate_lists.adoc
        // Expected: listsTestARulerBetweenElementsShouldDivideThemIntoSeparateLists
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `a block title between elements should divide them into separate lists`() {
        // Input: asciidoctor/lists_test_a_block_title_between_elements_should_divide_them_into_separate_lists.adoc
        // Expected: listsTestABlockTitleBetweenElementsShouldDivideThemIntoSeparateLists
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `multi-line elements with paragraph content`() {
        // Input: asciidoctor/lists_test_multi_line_elements_with_paragraph_content.adoc
        // Expected: listsTestMultiLineElementsWithParagraphContent
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `multi-line elements with indented paragraph content`() {
        // Input: asciidoctor/lists_test_multi_line_elements_with_indented_paragraph_content.adoc
        // Expected: listsTestMultiLineElementsWithIndentedParagraphContent
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `multi-line elements with indented paragraph content that includes comment lines`() {
        // Input: asciidoctor/lists_test_multi_line_elements_with_indented_paragraph_content_that_includes_comment_lines.adoc
        // Expected: listsTestMultiLineElementsWithIndentedParagraphContentThatIncludesCommentLines
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not strip comment line in literal paragraph block attached to list item`() {
        // Input: asciidoctor/lists_test_should_not_strip_comment_line_in_literal_paragraph_block_attached_to_list_item.adoc
        // Expected: listsTestShouldNotStripCommentLineInLiteralParagraphBlockAttachedToListItem
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `multi-line element with paragraph starting with multiple dashes should not be seen as list`() {
        // Input: asciidoctor/lists_test_multi_line_element_with_paragraph_starting_with_multiple_dashes_should_not_be_seen_as_list.adoc
        // Expected: listsTestMultiLineElementWithParagraphStartingWithMultipleDashesShouldNotBeSeenAsList
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `multi-line element with multiple terms`() {
        // Input: asciidoctor/lists_test_multi_line_element_with_multiple_terms.adoc
        // Expected: listsTestMultiLineElementWithMultipleTerms
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `consecutive terms share same varlistentry in docbook`() {
        // Input: asciidoctor/lists_test_consecutive_terms_share_same_varlistentry_in_docbook.adoc
        // Expected: listsTestConsecutiveTermsShareSameVarlistentryInDocbook
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `multi-line elements with blank line before paragraph content`() {
        // Input: asciidoctor/lists_test_multi_line_elements_with_blank_line_before_paragraph_content.adoc
        // Expected: listsTestMultiLineElementsWithBlankLineBeforeParagraphContent
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `multi-line elements with paragraph and literal content`() {
        // Input: asciidoctor/lists_test_multi_line_elements_with_paragraph_and_literal_content.adoc
        // Expected: listsTestMultiLineElementsWithParagraphAndLiteralContent
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `mixed single and multi-line adjacent elements`() {
        // Input: asciidoctor/lists_test_mixed_single_and_multi_line_adjacent_elements.adoc
        // Expected: listsTestMixedSingleAndMultiLineAdjacentElements
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should discover anchor at start of description term text and register it as a reference`() {
        // Input: asciidoctor/lists_test_should_discover_anchor_at_start_of_description_term_text_and_register_it_as_a_reference.adoc
        // Expected: listsTestShouldDiscoverAnchorAtStartOfDescriptionTermTextAndRegisterItAsAReference
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `missing space before term does not produce description list`() {
        // Input: asciidoctor/lists_test_missing_space_before_term_does_not_produce_description_list.adoc
        // Expected: listsTestMissingSpaceBeforeTermDoesNotProduceDescriptionList
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `literal block inside description list`() {
        // Input: asciidoctor/lists_test_literal_block_inside_description_list.adoc
        // Expected: listsTestLiteralBlockInsideDescriptionList
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `literal block inside description list with trailing line continuation`() {
        // Input: asciidoctor/lists_test_literal_block_inside_description_list_with_trailing_line_continuation.adoc
        // Expected: listsTestLiteralBlockInsideDescriptionListWithTrailingLineContinuation
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `multiple listing blocks inside description list`() {
        // Input: asciidoctor/lists_test_multiple_listing_blocks_inside_description_list.adoc
        // Expected: listsTestMultipleListingBlocksInsideDescriptionList
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `open block inside description list`() {
        // Input: asciidoctor/lists_test_open_block_inside_description_list.adoc
        // Expected: listsTestOpenBlockInsideDescriptionList
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `paragraph attached by a list continuation on either side in a description list`() {
        // Input: asciidoctor/lists_test_paragraph_attached_by_a_list_continuation_on_either_side_in_a_description_list.adoc
        // Expected: listsTestParagraphAttachedByAListContinuationOnEitherSideInADescriptionList
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `paragraph attached by a list continuation on either side to a multi-line element in a description list`() {
        // Input: asciidoctor/lists_test_paragraph_attached_by_a_list_continuation_on_either_side_to_a_multi_line_element_in_a_description_list.adoc
        // Expected: listsTestParagraphAttachedByAListContinuationOnEitherSideToAMultiLineElementInADescriptionList
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should continue to parse subsequent blocks attached to list item after first block is dropped`() {
        // Input: asciidoctor/lists_test_should_continue_to_parse_subsequent_blocks_attached_to_list_item_after_first_block_is_dropped.adoc
        // Expected: listsTestShouldContinueToParseSubsequentBlocksAttachedToListItemAfterFirstBlockIsDropped
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `verse paragraph inside a description list`() {
        // Input: asciidoctor/lists_test_verse_paragraph_inside_a_description_list.adoc
        // Expected: listsTestVerseParagraphInsideADescriptionList
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `list inside a description list`() {
        // Input: asciidoctor/lists_test_list_inside_a_description_list.adoc
        // Expected: listsTestListInsideADescriptionList
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `list inside a description list offset by blank lines`() {
        // Input: asciidoctor/lists_test_list_inside_a_description_list_offset_by_blank_lines.adoc
        // Expected: listsTestListInsideADescriptionListOffsetByBlankLines
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should only grab one line following last item if item has no inline description`() {
        // Input: asciidoctor/lists_test_should_only_grab_one_line_following_last_item_if_item_has_no_inline_description.adoc
        // Expected: listsTestShouldOnlyGrabOneLineFollowingLastItemIfItemHasNoInlineDescription
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should only grab one literal line following last item if item has no inline description`() {
        // Input: asciidoctor/lists_test_should_only_grab_one_literal_line_following_last_item_if_item_has_no_inline_description.adoc
        // Expected: listsTestShouldOnlyGrabOneLiteralLineFollowingLastItemIfItemHasNoInlineDescription
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should append subsequent paragraph literals to list item as block content`() {
        // Input: asciidoctor/lists_test_should_append_subsequent_paragraph_literals_to_list_item_as_block_content.adoc
        // Expected: listsTestShouldAppendSubsequentParagraphLiteralsToListItemAsBlockContent
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not match comment line that looks like description list term`() {
        // Input: asciidoctor/lists_test_should_not_match_comment_line_that_looks_like_description_list_term.adoc
        // Expected: listsTestShouldNotMatchCommentLineThatLooksLikeDescriptionListTerm
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not match comment line following list that looks like description list term`() {
        // Input: asciidoctor/lists_test_should_not_match_comment_line_following_list_that_looks_like_description_list_term.adoc
        // Expected: listsTestShouldNotMatchCommentLineFollowingListThatLooksLikeDescriptionListTerm
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not match comment line that looks like sibling description list term`() {
        // Input: asciidoctor/lists_test_should_not_match_comment_line_that_looks_like_sibling_description_list_term.adoc
        // Expected: listsTestShouldNotMatchCommentLineThatLooksLikeSiblingDescriptionListTerm
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not hang on description list item in list that begins with ___`() {
        // Input: asciidoctor/lists_test_should_not_hang_on_description_list_item_in_list_that_begins_with.adoc
        // Expected: listsTestShouldNotHangOnDescriptionListItemInListThatBeginsWith
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not hang on sibling description list item that begins with ___`() {
        // Input: asciidoctor/lists_test_should_not_hang_on_sibling_description_list_item_that_begins_with.adoc
        // Expected: listsTestShouldNotHangOnSiblingDescriptionListItemThatBeginsWith
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should skip dlist term that begins with __ unless it begins with ___`() {
        // Input: asciidoctor/lists_test_should_skip_dlist_term_that_begins_with____unless_it_begins_with.adoc
        // Expected: listsTestShouldSkipDlistTermThatBeginsWithUnlessItBeginsWith
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `more than 4 consecutive colons should become part of description list term`() {
        // Input: asciidoctor/lists_test_more_than_4_consecutive_colons_should_become_part_of_description_list_term.adoc
        // Expected: listsTestMoreThan4ConsecutiveColonsShouldBecomePartOfDescriptionListTerm
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `text method of dd node should return nil if dd node only contains blocks`() {
        // Input: asciidoctor/lists_test_text_method_of_dd_node_should_return_nil_if_dd_node_only_contains_blocks.adoc
        // Expected: listsTestTextMethodOfDdNodeShouldReturnNilIfDdNodeOnlyContainsBlocks
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not parse a nested dlist delimiter without a term as a dlist`() {
        // Input: asciidoctor/lists_test_should_not_parse_a_nested_dlist_delimiter_without_a_term_as_a_dlist.adoc
        // Expected: listsTestShouldNotParseANestedDlistDelimiterWithoutATermAsADlist
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not parse a nested indented dlist delimiter without a term as a dlist`() {
        // Input: asciidoctor/lists_test_should_not_parse_a_nested_indented_dlist_delimiter_without_a_term_as_a_dlist.adoc
        // Expected: listsTestShouldNotParseANestedIndentedDlistDelimiterWithoutATermAsADlist
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `single-line adjacent nested elements`() {
        // Input: asciidoctor/lists_test_single_line_adjacent_nested_elements.adoc
        // Expected: listsTestSingleLineAdjacentNestedElements
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `single-line adjacent maximum nested elements`() {
        // Input: asciidoctor/lists_test_single_line_adjacent_maximum_nested_elements.adoc
        // Expected: listsTestSingleLineAdjacentMaximumNestedElements
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `single-line nested elements separated by blank line at top level`() {
        // Input: asciidoctor/lists_test_single_line_nested_elements_separated_by_blank_line_at_top_level.adoc
        // Expected: listsTestSingleLineNestedElementsSeparatedByBlankLineAtTopLevel
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `single-line nested elements separated by blank line at nested level`() {
        // Input: asciidoctor/lists_test_single_line_nested_elements_separated_by_blank_line_at_nested_level.adoc
        // Expected: listsTestSingleLineNestedElementsSeparatedByBlankLineAtNestedLevel
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `single-line adjacent nested elements with alternate delimiters`() {
        // Input: asciidoctor/lists_test_single_line_adjacent_nested_elements_with_alternate_delimiters.adoc
        // Expected: listsTestSingleLineAdjacentNestedElementsWithAlternateDelimiters
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `multi-line adjacent nested elements`() {
        // Input: asciidoctor/lists_test_multi_line_adjacent_nested_elements.adoc
        // Expected: listsTestMultiLineAdjacentNestedElements
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `multi-line nested elements separated by blank line at nested level repeated`() {
        // Input: asciidoctor/lists_test_multi_line_nested_elements_separated_by_blank_line_at_nested_level_repeated.adoc
        // Expected: listsTestMultiLineNestedElementsSeparatedByBlankLineAtNestedLevelRepeated
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `multi-line element with indented nested element`() {
        // Input: asciidoctor/lists_test_multi_line_element_with_indented_nested_element.adoc
        // Expected: listsTestMultiLineElementWithIndentedNestedElement
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `mixed single and multi-line elements with indented nested elements`() {
        // Input: asciidoctor/lists_test_mixed_single_and_multi_line_elements_with_indented_nested_elements.adoc
        // Expected: listsTestMixedSingleAndMultiLineElementsWithIndentedNestedElements
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `multi-line elements with first paragraph folded to text with adjacent nested element`() {
        // Input: asciidoctor/lists_test_multi_line_elements_with_first_paragraph_folded_to_text_with_adjacent_nested_element.adoc
        // Expected: listsTestMultiLineElementsWithFirstParagraphFoldedToTextWithAdjacentNestedElement
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `nested dlist attached by list continuation should not consume detached paragraph`() {
        // Input: asciidoctor/lists_test_nested_dlist_attached_by_list_continuation_should_not_consume_detached_paragraph.adoc
        // Expected: listsTestNestedDlistAttachedByListContinuationShouldNotConsumeDetachedParagraph
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `nested dlist with attached block offset by empty line`() {
        // Input: asciidoctor/lists_test_nested_dlist_with_attached_block_offset_by_empty_line.adoc
        // Expected: listsTestNestedDlistWithAttachedBlockOffsetByEmptyLine
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should convert glossary list with proper semantics`() {
        // Input: asciidoctor/lists_test_should_convert_glossary_list_with_proper_semantics.adoc
        // Expected: listsTestShouldConvertGlossaryListWithProperSemantics
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `consecutive glossary terms should share same glossentry element in docbook`() {
        // Input: asciidoctor/lists_test_consecutive_glossary_terms_should_share_same_glossentry_element_in_docbook.adoc
        // Expected: listsTestConsecutiveGlossaryTermsShouldShareSameGlossentryElementInDocbook
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should convert horizontal list with proper markup`() {
        // Input: asciidoctor/lists_test_should_convert_horizontal_list_with_proper_markup.adoc
        // Expected: listsTestShouldConvertHorizontalListWithProperMarkup
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should set col widths of item and label if specified`() {
        // Input: asciidoctor/lists_test_should_set_col_widths_of_item_and_label_if_specified.adoc
        // Expected: listsTestShouldSetColWidthsOfItemAndLabelIfSpecified
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should set col widths of item and label in docbook if specified`() {
        // Input: asciidoctor/lists_test_should_set_col_widths_of_item_and_label_in_docbook_if_specified.adoc
        // Expected: listsTestShouldSetColWidthsOfItemAndLabelInDocbookIfSpecified
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should add strong class to label if strong option is set`() {
        // Input: asciidoctor/lists_test_should_add_strong_class_to_label_if_strong_option_is_set.adoc
        // Expected: listsTestShouldAddStrongClassToLabelIfStrongOptionIsSet
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `consecutive terms in horizontal list should share same cell`() {
        // Input: asciidoctor/lists_test_consecutive_terms_in_horizontal_list_should_share_same_cell.adoc
        // Expected: listsTestConsecutiveTermsInHorizontalListShouldShareSameCell
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `consecutive terms in horizontal list should share same entry in docbook`() {
        // Input: asciidoctor/lists_test_consecutive_terms_in_horizontal_list_should_share_same_entry_in_docbook.adoc
        // Expected: listsTestConsecutiveTermsInHorizontalListShouldShareSameEntryInDocbook
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should convert horizontal list in docbook with proper markup`() {
        // Input: asciidoctor/lists_test_should_convert_horizontal_list_in_docbook_with_proper_markup.adoc
        // Expected: listsTestShouldConvertHorizontalListInDocbookWithProperMarkup
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should convert qanda list in HTML with proper semantics`() {
        // Input: asciidoctor/lists_test_should_convert_qanda_list_in_html_with_proper_semantics.adoc
        // Expected: listsTestShouldConvertQandaListInHtmlWithProperSemantics
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should convert qanda list in DocBook with proper semantics`() {
        // Input: asciidoctor/lists_test_should_convert_qanda_list_in_doc_book_with_proper_semantics.adoc
        // Expected: listsTestShouldConvertQandaListInDocBookWithProperSemantics
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `consecutive questions should share same question element in docbook`() {
        // Input: asciidoctor/lists_test_consecutive_questions_should_share_same_question_element_in_docbook.adoc
        // Expected: listsTestConsecutiveQuestionsShouldShareSameQuestionElementInDocbook
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should convert bibliography list with proper semantics`() {
        // Input: asciidoctor/lists_test_should_convert_bibliography_list_with_proper_semantics.adoc
        // Expected: listsTestShouldConvertBibliographyListWithProperSemantics
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should convert bibliography list with proper semantics to DocBook`() {
        // Input: asciidoctor/lists_test_should_convert_bibliography_list_with_proper_semantics_to_doc_book.adoc
        // Expected: listsTestShouldConvertBibliographyListWithProperSemanticsToDocBook
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should warn if a bibliography ID is already in use`() {
        // Input: asciidoctor/lists_test_should_warn_if_a_bibliography_id_is_already_in_use.adoc
        // Expected: listsTestShouldWarnIfABibliographyIdIsAlreadyInUse
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should automatically add bibliography style to top-level lists in bibliography section`() {
        // Input: asciidoctor/lists_test_should_automatically_add_bibliography_style_to_top_level_lists_in_bibliography_section.adoc
        // Expected: listsTestShouldAutomaticallyAddBibliographyStyleToTopLevelListsInBibliographySection
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not recognize bibliography anchor that begins with a digit`() {
        // Input: asciidoctor/lists_test_should_not_recognize_bibliography_anchor_that_begins_with_a_digit.adoc
        // Expected: listsTestShouldNotRecognizeBibliographyAnchorThatBeginsWithADigit
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should recognize bibliography anchor that contains a digit but does not start with one`() {
        // Input: asciidoctor/lists_test_should_recognize_bibliography_anchor_that_contains_a_digit_but_does_not_start_with_one.adoc
        // Expected: listsTestShouldRecognizeBibliographyAnchorThatContainsADigitButDoesNotStartWithOne
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should catalog bibliography anchors in bibliography list`() {
        // Input: asciidoctor/lists_test_should_catalog_bibliography_anchors_in_bibliography_list.adoc
        // Expected: listsTestShouldCatalogBibliographyAnchorsInBibliographyList
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should use reftext from bibliography anchor at xref and entry`() {
        // Input: asciidoctor/lists_test_should_use_reftext_from_bibliography_anchor_at_xref_and_entry.adoc
        // Expected: listsTestShouldUseReftextFromBibliographyAnchorAtXrefAndEntry
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should assign reftext of bibliography anchor to xreflabel in DocBook backend`() {
        // Input: asciidoctor/lists_test_should_assign_reftext_of_bibliography_anchor_to_xreflabel_in_doc_book_backend.adoc
        // Expected: listsTestShouldAssignReftextOfBibliographyAnchorToXreflabelInDocBookBackend
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `folds text from subsequent line`() {
        // Input: asciidoctor/lists_test_folds_text_from_subsequent_line.adoc
        // Expected: listsTestFoldsTextFromSubsequentLine
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `folds text from first line after blank lines`() {
        // Input: asciidoctor/lists_test_folds_text_from_first_line_after_blank_lines.adoc
        // Expected: listsTestFoldsTextFromFirstLineAfterBlankLines
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `folds text from first line after blank line and immediately preceding next item`() {
        // Input: asciidoctor/lists_test_folds_text_from_first_line_after_blank_line_and_immediately_preceding_next_item.adoc
        // Expected: listsTestFoldsTextFromFirstLineAfterBlankLineAndImmediatelyPrecedingNextItem
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `paragraph offset by blank lines does not break list if label does not have inline text`() {
        // Input: asciidoctor/lists_test_paragraph_offset_by_blank_lines_does_not_break_list_if_label_does_not_have_inline_text.adoc
        // Expected: listsTestParagraphOffsetByBlankLinesDoesNotBreakListIfLabelDoesNotHaveInlineText
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `folds text from first line after comment line`() {
        // Input: asciidoctor/lists_test_folds_text_from_first_line_after_comment_line.adoc
        // Expected: listsTestFoldsTextFromFirstLineAfterCommentLine
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `folds text from line following comment line offset by blank line`() {
        // Input: asciidoctor/lists_test_folds_text_from_line_following_comment_line_offset_by_blank_line.adoc
        // Expected: listsTestFoldsTextFromLineFollowingCommentLineOffsetByBlankLine
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `folds text from subsequent indented line`() {
        // Input: asciidoctor/lists_test_folds_text_from_subsequent_indented_line.adoc
        // Expected: listsTestFoldsTextFromSubsequentIndentedLine
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `folds text from indented line after blank line`() {
        // Input: asciidoctor/lists_test_folds_text_from_indented_line_after_blank_line.adoc
        // Expected: listsTestFoldsTextFromIndentedLineAfterBlankLine
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `folds text that looks like ruler offset by blank line`() {
        // Input: asciidoctor/lists_test_folds_text_that_looks_like_ruler_offset_by_blank_line.adoc
        // Expected: listsTestFoldsTextThatLooksLikeRulerOffsetByBlankLine
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `folds text that looks like ruler offset by blank line and line comment`() {
        // Input: asciidoctor/lists_test_folds_text_that_looks_like_ruler_offset_by_blank_line_and_line_comment.adoc
        // Expected: listsTestFoldsTextThatLooksLikeRulerOffsetByBlankLineAndLineComment
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `folds text that looks like ruler and the line following it offset by blank line`() {
        // Input: asciidoctor/lists_test_folds_text_that_looks_like_ruler_and_the_line_following_it_offset_by_blank_line.adoc
        // Expected: listsTestFoldsTextThatLooksLikeRulerAndTheLineFollowingItOffsetByBlankLine
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `folds text that looks like title offset by blank line`() {
        // Input: asciidoctor/lists_test_folds_text_that_looks_like_title_offset_by_blank_line.adoc
        // Expected: listsTestFoldsTextThatLooksLikeTitleOffsetByBlankLine
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `folds text that looks like title offset by blank line and line comment`() {
        // Input: asciidoctor/lists_test_folds_text_that_looks_like_title_offset_by_blank_line_and_line_comment.adoc
        // Expected: listsTestFoldsTextThatLooksLikeTitleOffsetByBlankLineAndLineComment
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `folds text that looks like admonition offset by blank line`() {
        // Input: asciidoctor/lists_test_folds_text_that_looks_like_admonition_offset_by_blank_line.adoc
        // Expected: listsTestFoldsTextThatLooksLikeAdmonitionOffsetByBlankLine
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `folds text that looks like section title offset by blank line`() {
        // Input: asciidoctor/lists_test_folds_text_that_looks_like_section_title_offset_by_blank_line.adoc
        // Expected: listsTestFoldsTextThatLooksLikeSectionTitleOffsetByBlankLine
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `folds text of first literal line offset by blank line appends subsequent literals offset by blank line as blocks`() {
        // Input: asciidoctor/lists_test_folds_text_of_first_literal_line_offset_by_blank_line_appends_subsequent_literals_offset_by_blank_line_as_blocks.adoc
        // Expected: listsTestFoldsTextOfFirstLiteralLineOffsetByBlankLineAppendsSubsequentLiteralsOffsetByBlankLineAsBlocks
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `folds text of subsequent line and appends following literal line offset by blank line as block if term has no inline description`() {
        // Input: asciidoctor/lists_test_folds_text_of_subsequent_line_and_appends_following_literal_line_offset_by_blank_line_as_block_if_term_has_no_inline_description.adoc
        // Expected: listsTestFoldsTextOfSubsequentLineAndAppendsFollowingLiteralLineOffsetByBlankLineAsBlockIfTermHasNoInlineDescription
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `appends literal line attached by continuation as block if item has no inline description`() {
        // Input: asciidoctor/lists_test_appends_literal_line_attached_by_continuation_as_block_if_item_has_no_inline_description.adoc
        // Expected: listsTestAppendsLiteralLineAttachedByContinuationAsBlockIfItemHasNoInlineDescription
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `appends literal line attached by continuation as block if item has no inline description followed by ruler`() {
        // Input: asciidoctor/lists_test_appends_literal_line_attached_by_continuation_as_block_if_item_has_no_inline_description_followed_by_ruler.adoc
        // Expected: listsTestAppendsLiteralLineAttachedByContinuationAsBlockIfItemHasNoInlineDescriptionFollowedByRuler
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `appends line attached by continuation as block if item has no inline description followed by ruler`() {
        // Input: asciidoctor/lists_test_appends_line_attached_by_continuation_as_block_if_item_has_no_inline_description_followed_by_ruler.adoc
        // Expected: listsTestAppendsLineAttachedByContinuationAsBlockIfItemHasNoInlineDescriptionFollowedByRuler
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `appends line attached by continuation as block if item has no inline description followed by block`() {
        // Input: asciidoctor/lists_test_appends_line_attached_by_continuation_as_block_if_item_has_no_inline_description_followed_by_block.adoc
        // Expected: listsTestAppendsLineAttachedByContinuationAsBlockIfItemHasNoInlineDescriptionFollowedByBlock
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `appends block attached by continuation but not subsequent block not attached by continuation`() {
        // Input: asciidoctor/lists_test_appends_block_attached_by_continuation_but_not_subsequent_block_not_attached_by_continuation.adoc
        // Expected: listsTestAppendsBlockAttachedByContinuationButNotSubsequentBlockNotAttachedByContinuation
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `appends list if item has no inline description`() {
        // Input: asciidoctor/lists_test_appends_list_if_item_has_no_inline_description.adoc
        // Expected: listsTestAppendsListIfItemHasNoInlineDescription
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `appends list to first term when followed immediately by second term`() {
        // Input: asciidoctor/lists_test_appends_list_to_first_term_when_followed_immediately_by_second_term.adoc
        // Expected: listsTestAppendsListToFirstTermWhenFollowedImmediatelyBySecondTerm
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `appends indented list to first term that is adjacent to second term`() {
        // Input: asciidoctor/lists_test_appends_indented_list_to_first_term_that_is_adjacent_to_second_term.adoc
        // Expected: listsTestAppendsIndentedListToFirstTermThatIsAdjacentToSecondTerm
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `appends indented list to first term that is attached by a continuation and adjacent to second term`() {
        // Input: asciidoctor/lists_test_appends_indented_list_to_first_term_that_is_attached_by_a_continuation_and_adjacent_to_second_term.adoc
        // Expected: listsTestAppendsIndentedListToFirstTermThatIsAttachedByAContinuationAndAdjacentToSecondTerm
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `appends list and paragraph block when line following list attached by continuation`() {
        // Input: asciidoctor/lists_test_appends_list_and_paragraph_block_when_line_following_list_attached_by_continuation.adoc
        // Expected: listsTestAppendsListAndParagraphBlockWhenLineFollowingListAttachedByContinuation
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `first continued line associated with nested list item and second continued line associated with term`() {
        // Input: asciidoctor/lists_test_first_continued_line_associated_with_nested_list_item_and_second_continued_line_associated_with_term.adoc
        // Expected: listsTestFirstContinuedLineAssociatedWithNestedListItemAndSecondContinuedLineAssociatedWithTerm
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `literal line attached by continuation swallows adjacent line that looks like term`() {
        // Input: asciidoctor/lists_test_literal_line_attached_by_continuation_swallows_adjacent_line_that_looks_like_term.adoc
        // Expected: listsTestLiteralLineAttachedByContinuationSwallowsAdjacentLineThatLooksLikeTerm
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `line attached by continuation is appended as paragraph if term has no inline description`() {
        // Input: asciidoctor/lists_test_line_attached_by_continuation_is_appended_as_paragraph_if_term_has_no_inline_description.adoc
        // Expected: listsTestLineAttachedByContinuationIsAppendedAsParagraphIfTermHasNoInlineDescription
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `attached paragraph does not break on adjacent nested description list term`() {
        // Input: asciidoctor/lists_test_attached_paragraph_does_not_break_on_adjacent_nested_description_list_term.adoc
        // Expected: listsTestAttachedParagraphDoesNotBreakOnAdjacentNestedDescriptionListTerm
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `attached paragraph is terminated by adjacent sibling description list term`() {
        // Input: asciidoctor/lists_test_attached_paragraph_is_terminated_by_adjacent_sibling_description_list_term.adoc
        // Expected: listsTestAttachedParagraphIsTerminatedByAdjacentSiblingDescriptionListTerm
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `attached styled paragraph does not break on adjacent nested description list term`() {
        // Input: asciidoctor/lists_test_attached_styled_paragraph_does_not_break_on_adjacent_nested_description_list_term.adoc
        // Expected: listsTestAttachedStyledParagraphDoesNotBreakOnAdjacentNestedDescriptionListTerm
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `appends line as paragraph if attached by continuation following blank line and line comment when term has no inline description`() {
        // Input: asciidoctor/lists_test_appends_line_as_paragraph_if_attached_by_continuation_following_blank_line_and_line_comment_when_term_has_no_inline_description.adoc
        // Expected: listsTestAppendsLineAsParagraphIfAttachedByContinuationFollowingBlankLineAndLineCommentWhenTermHasNoInlineDescription
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `line attached by continuation offset by blank line is appended as paragraph if term has no inline description`() {
        // Input: asciidoctor/lists_test_line_attached_by_continuation_offset_by_blank_line_is_appended_as_paragraph_if_term_has_no_inline_description.adoc
        // Expected: listsTestLineAttachedByContinuationOffsetByBlankLineIsAppendedAsParagraphIfTermHasNoInlineDescription
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `delimited block breaks list even when term has no inline description`() {
        // Input: asciidoctor/lists_test_delimited_block_breaks_list_even_when_term_has_no_inline_description.adoc
        // Expected: listsTestDelimitedBlockBreaksListEvenWhenTermHasNoInlineDescription
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `block attribute line above delimited block that breaks a dlist is not duplicated`() {
        // Input: asciidoctor/lists_test_block_attribute_line_above_delimited_block_that_breaks_a_dlist_is_not_duplicated.adoc
        // Expected: listsTestBlockAttributeLineAboveDelimitedBlockThatBreaksADlistIsNotDuplicated
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `block attribute line above paragraph breaks list even when term has no inline description`() {
        // Input: asciidoctor/lists_test_block_attribute_line_above_paragraph_breaks_list_even_when_term_has_no_inline_description.adoc
        // Expected: listsTestBlockAttributeLineAboveParagraphBreaksListEvenWhenTermHasNoInlineDescription
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `block attribute line above paragraph that breaks a dlist is not duplicated`() {
        // Input: asciidoctor/lists_test_block_attribute_line_above_paragraph_that_breaks_a_dlist_is_not_duplicated.adoc
        // Expected: listsTestBlockAttributeLineAboveParagraphThatBreaksADlistIsNotDuplicated
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `block anchor line breaks list even when term has no inline description`() {
        // Input: asciidoctor/lists_test_block_anchor_line_breaks_list_even_when_term_has_no_inline_description.adoc
        // Expected: listsTestBlockAnchorLineBreaksListEvenWhenTermHasNoInlineDescription
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `block attribute lines above nested horizontal list does not break list`() {
        // Input: asciidoctor/lists_test_block_attribute_lines_above_nested_horizontal_list_does_not_break_list.adoc
        // Expected: listsTestBlockAttributeLinesAboveNestedHorizontalListDoesNotBreakList
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `block attribute lines above nested list with style does not break list`() {
        // Input: asciidoctor/lists_test_block_attribute_lines_above_nested_list_with_style_does_not_break_list.adoc
        // Expected: listsTestBlockAttributeLinesAboveNestedListWithStyleDoesNotBreakList
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `multiple block attribute lines above nested list does not break list`() {
        // Input: asciidoctor/lists_test_multiple_block_attribute_lines_above_nested_list_does_not_break_list.adoc
        // Expected: listsTestMultipleBlockAttributeLinesAboveNestedListDoesNotBreakList
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `multiple block attribute lines separated by empty line above nested list does not break list`() {
        // Input: asciidoctor/lists_test_multiple_block_attribute_lines_separated_by_empty_line_above_nested_list_does_not_break_list.adoc
        // Expected: listsTestMultipleBlockAttributeLinesSeparatedByEmptyLineAboveNestedListDoesNotBreakList
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `folds text from inline description and subsequent line`() {
        // Input: asciidoctor/lists_test_folds_text_from_inline_description_and_subsequent_line.adoc
        // Expected: listsTestFoldsTextFromInlineDescriptionAndSubsequentLine
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `folds text from inline description and subsequent lines`() {
        // Input: asciidoctor/lists_test_folds_text_from_inline_description_and_subsequent_lines.adoc
        // Expected: listsTestFoldsTextFromInlineDescriptionAndSubsequentLines
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `folds text from inline description and line following comment line`() {
        // Input: asciidoctor/lists_test_folds_text_from_inline_description_and_line_following_comment_line.adoc
        // Expected: listsTestFoldsTextFromInlineDescriptionAndLineFollowingCommentLine
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `folds text from inline description and subsequent indented line`() {
        // Input: asciidoctor/lists_test_folds_text_from_inline_description_and_subsequent_indented_line.adoc
        // Expected: listsTestFoldsTextFromInlineDescriptionAndSubsequentIndentedLine
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `appends literal line offset by blank line as block if item has inline description`() {
        // Input: asciidoctor/lists_test_appends_literal_line_offset_by_blank_line_as_block_if_item_has_inline_description.adoc
        // Expected: listsTestAppendsLiteralLineOffsetByBlankLineAsBlockIfItemHasInlineDescription
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `appends literal line offset by blank line as block and appends line after continuation as block if item has inline description`() {
        // Input: asciidoctor/lists_test_appends_literal_line_offset_by_blank_line_as_block_and_appends_line_after_continuation_as_block_if_item_has_inline_description.adoc
        // Expected: listsTestAppendsLiteralLineOffsetByBlankLineAsBlockAndAppendsLineAfterContinuationAsBlockIfItemHasInlineDescription
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `appends line after continuation as block and literal line offset by blank line as block if item has inline description`() {
        // Input: asciidoctor/lists_test_appends_line_after_continuation_as_block_and_literal_line_offset_by_blank_line_as_block_if_item_has_inline_description.adoc
        // Expected: listsTestAppendsLineAfterContinuationAsBlockAndLiteralLineOffsetByBlankLineAsBlockIfItemHasInlineDescription
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `appends list if item has inline description`() {
        // Input: asciidoctor/lists_test_appends_list_if_item_has_inline_description.adoc
        // Expected: listsTestAppendsListIfItemHasInlineDescription
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `appends literal line attached by continuation as block if item has inline description followed by ruler`() {
        // Input: asciidoctor/lists_test_appends_literal_line_attached_by_continuation_as_block_if_item_has_inline_description_followed_by_ruler.adoc
        // Expected: listsTestAppendsLiteralLineAttachedByContinuationAsBlockIfItemHasInlineDescriptionFollowedByRuler
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `line offset by blank line breaks list if term has inline description`() {
        // Input: asciidoctor/lists_test_line_offset_by_blank_line_breaks_list_if_term_has_inline_description.adoc
        // Expected: listsTestLineOffsetByBlankLineBreaksListIfTermHasInlineDescription
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `nested term with description does not consume following heading`() {
        // Input: asciidoctor/lists_test_nested_term_with_description_does_not_consume_following_heading.adoc
        // Expected: listsTestNestedTermWithDescriptionDoesNotConsumeFollowingHeading
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `line attached by continuation is appended as paragraph if term has inline description followed by detached paragraph`() {
        // Input: asciidoctor/lists_test_line_attached_by_continuation_is_appended_as_paragraph_if_term_has_inline_description_followed_by_detached_paragraph.adoc
        // Expected: listsTestLineAttachedByContinuationIsAppendedAsParagraphIfTermHasInlineDescriptionFollowedByDetachedParagraph
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `line attached by continuation is appended as paragraph if term has inline description followed by detached block`() {
        // Input: asciidoctor/lists_test_line_attached_by_continuation_is_appended_as_paragraph_if_term_has_inline_description_followed_by_detached_block.adoc
        // Expected: listsTestLineAttachedByContinuationIsAppendedAsParagraphIfTermHasInlineDescriptionFollowedByDetachedBlock
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `line attached by continuation offset by line comment is appended as paragraph if term has inline description`() {
        // Input: asciidoctor/lists_test_line_attached_by_continuation_offset_by_line_comment_is_appended_as_paragraph_if_term_has_inline_description.adoc
        // Expected: listsTestLineAttachedByContinuationOffsetByLineCommentIsAppendedAsParagraphIfTermHasInlineDescription
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `line attached by continuation offset by blank line is appended as paragraph if term has inline description`() {
        // Input: asciidoctor/lists_test_line_attached_by_continuation_offset_by_blank_line_is_appended_as_paragraph_if_term_has_inline_description.adoc
        // Expected: listsTestLineAttachedByContinuationOffsetByBlankLineIsAppendedAsParagraphIfTermHasInlineDescription
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `line comment offset by blank line divides lists because item has text`() {
        // Input: asciidoctor/lists_test_line_comment_offset_by_blank_line_divides_lists_because_item_has_text.adoc
        // Expected: listsTestLineCommentOffsetByBlankLineDividesListsBecauseItemHasText
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `ruler offset by blank line divides lists because item has text`() {
        // Input: asciidoctor/lists_test_ruler_offset_by_blank_line_divides_lists_because_item_has_text.adoc
        // Expected: listsTestRulerOffsetByBlankLineDividesListsBecauseItemHasText
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `block title offset by blank line divides lists and becomes title of second list because item has text`() {
        // Input: asciidoctor/lists_test_block_title_offset_by_blank_line_divides_lists_and_becomes_title_of_second_list_because_item_has_text.adoc
        // Expected: listsTestBlockTitleOffsetByBlankLineDividesListsAndBecomesTitleOfSecondListBecauseItemHasText
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `does not recognize callout list denoted by markers that only have a trailing bracket`() {
        // Input: asciidoctor/lists_test_does_not_recognize_callout_list_denoted_by_markers_that_only_have_a_trailing_bracket.adoc
        // Expected: listsTestDoesNotRecognizeCalloutListDenotedByMarkersThatOnlyHaveATrailingBracket
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not hang if obsolete callout list is found inside list item`() {
        // Input: asciidoctor/lists_test_should_not_hang_if_obsolete_callout_list_is_found_inside_list_item.adoc
        // Expected: listsTestShouldNotHangIfObsoleteCalloutListIsFoundInsideListItem
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not hang if obsolete callout list is found inside dlist item`() {
        // Input: asciidoctor/lists_test_should_not_hang_if_obsolete_callout_list_is_found_inside_dlist_item.adoc
        // Expected: listsTestShouldNotHangIfObsoleteCalloutListIsFoundInsideDlistItem
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should recognize auto-numberd callout list inside list`() {
        // Input: asciidoctor/lists_test_should_recognize_auto_numberd_callout_list_inside_list.adoc
        // Expected: listsTestShouldRecognizeAutoNumberdCalloutListInsideList
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `listing block with sequential callouts followed by adjacent callout list`() {
        // Input: asciidoctor/lists_test_listing_block_with_sequential_callouts_followed_by_adjacent_callout_list.adoc
        // Expected: listsTestListingBlockWithSequentialCalloutsFollowedByAdjacentCalloutList
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `listing block with sequential callouts followed by non-adjacent callout list`() {
        // Input: asciidoctor/lists_test_listing_block_with_sequential_callouts_followed_by_non_adjacent_callout_list.adoc
        // Expected: listsTestListingBlockWithSequentialCalloutsFollowedByNonAdjacentCalloutList
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `listing block with a callout that refers to two different lines`() {
        // Input: asciidoctor/lists_test_listing_block_with_a_callout_that_refers_to_two_different_lines.adoc
        // Expected: listsTestListingBlockWithACalloutThatRefersToTwoDifferentLines
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `source block with non-sequential callouts followed by adjacent callout list`() {
        // Input: asciidoctor/lists_test_source_block_with_non_sequential_callouts_followed_by_adjacent_callout_list.adoc
        // Expected: listsTestSourceBlockWithNonSequentialCalloutsFollowedByAdjacentCalloutList
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `two listing blocks can share the same callout list`() {
        // Input: asciidoctor/lists_test_two_listing_blocks_can_share_the_same_callout_list.adoc
        // Expected: listsTestTwoListingBlocksCanShareTheSameCalloutList
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `two listing blocks each followed by an adjacent callout list`() {
        // Input: asciidoctor/lists_test_two_listing_blocks_each_followed_by_an_adjacent_callout_list.adoc
        // Expected: listsTestTwoListingBlocksEachFollowedByAnAdjacentCalloutList
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `callout list retains block content`() {
        // Input: asciidoctor/lists_test_callout_list_retains_block_content.adoc
        // Expected: listsTestCalloutListRetainsBlockContent
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `callout list retains block content when converted to DocBook`() {
        // Input: asciidoctor/lists_test_callout_list_retains_block_content_when_converted_to_doc_book.adoc
        // Expected: listsTestCalloutListRetainsBlockContentWhenConvertedToDocBook
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `escaped callout should not be interpreted as a callout`() {
        // Input: asciidoctor/lists_test_escaped_callout_should_not_be_interpreted_as_a_callout.adoc
        // Expected: listsTestEscapedCalloutShouldNotBeInterpretedAsACallout
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should autonumber ___ callouts`() {
        // Input: asciidoctor/lists_test_should_autonumber___callouts.adoc
        // Expected: listsTestShouldAutonumberCallouts
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not recognize callouts in middle of line`() {
        // Input: asciidoctor/lists_test_should_not_recognize_callouts_in_middle_of_line.adoc
        // Expected: listsTestShouldNotRecognizeCalloutsInMiddleOfLine
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should allow multiple callouts on the same line`() {
        // Input: asciidoctor/lists_test_should_allow_multiple_callouts_on_the_same_line.adoc
        // Expected: listsTestShouldAllowMultipleCalloutsOnTheSameLine
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should allow XML comment-style callouts`() {
        // Input: asciidoctor/lists_test_should_allow_xml_comment_style_callouts.adoc
        // Expected: listsTestShouldAllowXmlCommentStyleCallouts
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not allow callouts with half an XML comment`() {
        // Input: asciidoctor/lists_test_should_not_allow_callouts_with_half_an_xml_comment.adoc
        // Expected: listsTestShouldNotAllowCalloutsWithHalfAnXmlComment
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not recognize callouts in an indented description list paragraph`() {
        // Input: asciidoctor/lists_test_should_not_recognize_callouts_in_an_indented_description_list_paragraph.adoc
        // Expected: listsTestShouldNotRecognizeCalloutsInAnIndentedDescriptionListParagraph
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not recognize callouts in an indented outline list paragraph`() {
        // Input: asciidoctor/lists_test_should_not_recognize_callouts_in_an_indented_outline_list_paragraph.adoc
        // Expected: listsTestShouldNotRecognizeCalloutsInAnIndentedOutlineListParagraph
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should warn if numbers in callout list are out of sequence`() {
        // Input: asciidoctor/lists_test_should_warn_if_numbers_in_callout_list_are_out_of_sequence.adoc
        // Expected: listsTestShouldWarnIfNumbersInCalloutListAreOutOfSequence
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should preserve line comment chars that precede callout number if icons is not set`() {
        // Input: asciidoctor/lists_test_should_preserve_line_comment_chars_that_precede_callout_number_if_icons_is_not_set.adoc
        // Expected: listsTestShouldPreserveLineCommentCharsThatPrecedeCalloutNumberIfIconsIsNotSet
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should remove line comment chars that precede callout number if icons is font`() {
        // Input: asciidoctor/lists_test_should_remove_line_comment_chars_that_precede_callout_number_if_icons_is_font.adoc
        // Expected: listsTestShouldRemoveLineCommentCharsThatPrecedeCalloutNumberIfIconsIsFont
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should allow line comment chars that precede callout number to be specified`() {
        // Input: asciidoctor/lists_test_should_allow_line_comment_chars_that_precede_callout_number_to_be_specified.adoc
        // Expected: listsTestShouldAllowLineCommentCharsThatPrecedeCalloutNumberToBeSpecified
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should allow line comment chars preceding callout number to be configurable when source-highlighter is coderay`() {
        // Input: asciidoctor/lists_test_should_allow_line_comment_chars_preceding_callout_number_to_be_configurable_when_source_highlighter_is_coderay.adoc
        // Expected: listsTestShouldAllowLineCommentCharsPrecedingCalloutNumberToBeConfigurableWhenSourceHighlighterIsCoderay
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not eat whitespace before callout number if line-comment attribute is empty`() {
        // Input: asciidoctor/lists_test_should_not_eat_whitespace_before_callout_number_if_line_comment_attribute_is_empty.adoc
        // Expected: listsTestShouldNotEatWhitespaceBeforeCalloutNumberIfLineCommentAttributeIsEmpty
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `literal block with callouts`() {
        // Input: asciidoctor/lists_test_literal_block_with_callouts.adoc
        // Expected: listsTestLiteralBlockWithCallouts
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `callout list with icons enabled`() {
        // Input: asciidoctor/lists_test_callout_list_with_icons_enabled.adoc
        // Expected: listsTestCalloutListWithIconsEnabled
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `callout list with font-based icons enabled`() {
        // Input: asciidoctor/lists_test_callout_list_with_font_based_icons_enabled.adoc
        // Expected: listsTestCalloutListWithFontBasedIconsEnabled
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should create checklist if at least one item has checkbox syntax`() {
        // Input: asciidoctor/lists_test_should_create_checklist_if_at_least_one_item_has_checkbox_syntax.adoc
        // Expected: listsTestShouldCreateChecklistIfAtLeastOneItemHasCheckboxSyntax
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should create checklist with font icons if at least one item has checkbox syntax and icons attribute is font`() {
        // Input: asciidoctor/lists_test_should_create_checklist_with_font_icons_if_at_least_one_item_has_checkbox_syntax_and_icons_attribute_is_font.adoc
        // Expected: listsTestShouldCreateChecklistWithFontIconsIfAtLeastOneItemHasCheckboxSyntaxAndIconsAttributeIsFont
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should create interactive checklist if interactive option is set even with icons attribute is font`() {
        // Input: asciidoctor/lists_test_should_create_interactive_checklist_if_interactive_option_is_set_even_with_icons_attribute_is_font.adoc
        // Expected: listsTestShouldCreateInteractiveChecklistIfInteractiveOptionIsSetEvenWithIconsAttributeIsFont
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `content should return items in list`() {
        // Input: asciidoctor/lists_test_content_should_return_items_in_list.adoc
        // Expected: listsTestContentShouldReturnItemsInList
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `list item should be the parent of block attached to a list item`() {
        // Input: asciidoctor/lists_test_list_item_should_be_the_parent_of_block_attached_to_a_list_item.adoc
        // Expected: listsTestListItemShouldBeTheParentOfBlockAttachedToAListItem
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `outline? should return true for unordered list`() {
        // Input: asciidoctor/lists_test_outline_should_return_true_for_unordered_list.adoc
        // Expected: listsTestOutlineShouldReturnTrueForUnorderedList
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `outline? should return true for ordered list`() {
        // Input: asciidoctor/lists_test_outline_should_return_true_for_ordered_list.adoc
        // Expected: listsTestOutlineShouldReturnTrueForOrderedList
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `outline? should return false for description list`() {
        // Input: asciidoctor/lists_test_outline_should_return_false_for_description_list.adoc
        // Expected: listsTestOutlineShouldReturnFalseForDescriptionList
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `simple? should return true for list item with nested outline list`() {
        // Input: asciidoctor/lists_test_simple_should_return_true_for_list_item_with_nested_outline_list.adoc
        // Expected: listsTestSimpleShouldReturnTrueForListItemWithNestedOutlineList
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `simple? should return false for list item with block content`() {
        // Input: asciidoctor/lists_test_simple_should_return_false_for_list_item_with_block_content.adoc
        // Expected: listsTestSimpleShouldReturnFalseForListItemWithBlockContent
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should allow text of ListItem to be assigned`() {
        // Input: asciidoctor/lists_test_should_allow_text_of_list_item_to_be_assigned.adoc
        // Expected: listsTestShouldAllowTextOfListItemToBeAssigned
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `id and role assigned to ulist item in model are transmitted to output`() {
        // Input: asciidoctor/lists_test_id_and_role_assigned_to_ulist_item_in_model_are_transmitted_to_output.adoc
        // Expected: listsTestIdAndRoleAssignedToUlistItemInModelAreTransmittedToOutput
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `id and role assigned to olist item in model are transmitted to output`() {
        // Input: asciidoctor/lists_test_id_and_role_assigned_to_olist_item_in_model_are_transmitted_to_output.adoc
        // Expected: listsTestIdAndRoleAssignedToOlistItemInModelAreTransmittedToOutput
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should allow API control over substitutions applied to ListItem text`() {
        // Input: asciidoctor/lists_test_should_allow_api_control_over_substitutions_applied_to_list_item_text.adoc
        // Expected: listsTestShouldAllowApiControlOverSubstitutionsAppliedToListItemText
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should set lineno to line number in source where list starts`() {
        // Input: asciidoctor/lists_test_should_set_lineno_to_line_number_in_source_where_list_starts.adoc
        // Expected: listsTestShouldSetLinenoToLineNumberInSourceWhereListStarts
    }

}
