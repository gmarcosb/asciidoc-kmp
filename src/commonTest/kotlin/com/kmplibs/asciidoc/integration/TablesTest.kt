package com.kmplibs.asciidoc.integration

import kotlin.test.Test
import kotlin.test.Ignore

class TablesTest {

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `converts simple psv table`() {
        // Input: asciidoctor/tables_test_converts_simple_psv_table.adoc
        // Expected: tablesTestConvertsSimplePsvTable
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should add direction CSS class if float attribute is set on table`() {
        // Input: asciidoctor/tables_test_should_add_direction_css_class_if_float_attribute_is_set_on_table.adoc
        // Expected: tablesTestShouldAddDirectionCssClassIfFloatAttributeIsSetOnTable
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should set stripes class if stripes option is set`() {
        // Input: asciidoctor/tables_test_should_set_stripes_class_if_stripes_option_is_set.adoc
        // Expected: tablesTestShouldSetStripesClassIfStripesOptionIsSet
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `outputs a caption on simple psv table`() {
        // Input: asciidoctor/tables_test_outputs_a_caption_on_simple_psv_table.adoc
        // Expected: tablesTestOutputsACaptionOnSimplePsvTable
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `only increments table counter for tables that have a title`() {
        // Input: asciidoctor/tables_test_only_increments_table_counter_for_tables_that_have_a_title.adoc
        // Expected: tablesTestOnlyIncrementsTableCounterForTablesThatHaveATitle
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `uses explicit caption in front of title in place of default caption and number`() {
        // Input: asciidoctor/tables_test_uses_explicit_caption_in_front_of_title_in_place_of_default_caption_and_number.adoc
        // Expected: tablesTestUsesExplicitCaptionInFrontOfTitleInPlaceOfDefaultCaptionAndNumber
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `disables caption when caption attribute on table is empty`() {
        // Input: asciidoctor/tables_test_disables_caption_when_caption_attribute_on_table_is_empty.adoc
        // Expected: tablesTestDisablesCaptionWhenCaptionAttributeOnTableIsEmpty
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `disables caption when caption attribute on table is empty string`() {
        // Input: asciidoctor/tables_test_disables_caption_when_caption_attribute_on_table_is_empty_string.adoc
        // Expected: tablesTestDisablesCaptionWhenCaptionAttributeOnTableIsEmptyString
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `disables caption on table when table-caption document attribute is unset`() {
        // Input: asciidoctor/tables_test_disables_caption_on_table_when_table_caption_document_attribute_is_unset.adoc
        // Expected: tablesTestDisablesCaptionOnTableWhenTableCaptionDocumentAttributeIsUnset
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `ignores escaped separators`() {
        // Input: asciidoctor/tables_test_ignores_escaped_separators.adoc
        // Expected: tablesTestIgnoresEscapedSeparators
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `preserves escaped delimiters at the end of the line`() {
        // Input: asciidoctor/tables_test_preserves_escaped_delimiters_at_the_end_of_the_line.adoc
        // Expected: tablesTestPreservesEscapedDelimitersAtTheEndOfTheLine
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should treat trailing pipe as an empty cell`() {
        // Input: asciidoctor/tables_test_should_treat_trailing_pipe_as_an_empty_cell.adoc
        // Expected: tablesTestShouldTreatTrailingPipeAsAnEmptyCell
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should auto recover with warning if missing leading separator on first cell`() {
        // Input: asciidoctor/tables_test_should_auto_recover_with_warning_if_missing_leading_separator_on_first_cell.adoc
        // Expected: tablesTestShouldAutoRecoverWithWarningIfMissingLeadingSeparatorOnFirstCell
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `performs normal substitutions on cell content`() {
        // Input: asciidoctor/tables_test_performs_normal_substitutions_on_cell_content.adoc
        // Expected: tablesTestPerformsNormalSubstitutionsOnCellContent
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should only substitute specialchars for literal table cells`() {
        // Input: asciidoctor/tables_test_should_only_substitute_specialchars_for_literal_table_cells.adoc
        // Expected: tablesTestShouldOnlySubstituteSpecialcharsForLiteralTableCells
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should preserving leading spaces but not leading newlines or trailing spaces in literal table cells`() {
        // Input: asciidoctor/tables_test_should_preserving_leading_spaces_but_not_leading_newlines_or_trailing_spaces_in_literal_table_cells.adoc
        // Expected: tablesTestShouldPreservingLeadingSpacesButNotLeadingNewlinesOrTrailingSpacesInLiteralTableCells
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should ignore v table cell style`() {
        // Input: asciidoctor/tables_test_should_ignore_v_table_cell_style.adoc
        // Expected: tablesTestShouldIgnoreVTableCellStyle
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `table and column width not assigned when autowidth option is specified`() {
        // Input: asciidoctor/tables_test_table_and_column_width_not_assigned_when_autowidth_option_is_specified.adoc
        // Expected: tablesTestTableAndColumnWidthNotAssignedWhenAutowidthOptionIsSpecified
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `does not assign column width for autowidth columns in HTML output`() {
        // Input: asciidoctor/tables_test_does_not_assign_column_width_for_autowidth_columns_in_html_output.adoc
        // Expected: tablesTestDoesNotAssignColumnWidthForAutowidthColumnsInHtmlOutput
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `can assign autowidth to all columns even when table has a width`() {
        // Input: asciidoctor/tables_test_can_assign_autowidth_to_all_columns_even_when_table_has_a_width.adoc
        // Expected: tablesTestCanAssignAutowidthToAllColumnsEvenWhenTableHasAWidth
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `equally distributes remaining column width to autowidth columns in DocBook output`() {
        // Input: asciidoctor/tables_test_equally_distributes_remaining_column_width_to_autowidth_columns_in_doc_book_output.adoc
        // Expected: tablesTestEquallyDistributesRemainingColumnWidthToAutowidthColumnsInDocBookOutput
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should compute column widths based on pagewidth when width is set on table in DocBook output`() {
        // Input: asciidoctor/tables_test_should_compute_column_widths_based_on_pagewidth_when_width_is_set_on_table_in_doc_book_output.adoc
        // Expected: tablesTestShouldComputeColumnWidthsBasedOnPagewidthWhenWidthIsSetOnTableInDocBookOutput
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `explicit table width is used even when autowidth option is specified`() {
        // Input: asciidoctor/tables_test_explicit_table_width_is_used_even_when_autowidth_option_is_specified.adoc
        // Expected: tablesTestExplicitTableWidthIsUsedEvenWhenAutowidthOptionIsSpecified
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `first row sets number of columns when not specified`() {
        // Input: asciidoctor/tables_test_first_row_sets_number_of_columns_when_not_specified.adoc
        // Expected: tablesTestFirstRowSetsNumberOfColumnsWhenNotSpecified
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `colspec attribute using asterisk syntax sets number of columns`() {
        // Input: asciidoctor/tables_test_colspec_attribute_using_asterisk_syntax_sets_number_of_columns.adoc
        // Expected: tablesTestColspecAttributeUsingAsteriskSyntaxSetsNumberOfColumns
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `table with explicit column count can have multiple rows on a single line`() {
        // Input: asciidoctor/tables_test_table_with_explicit_column_count_can_have_multiple_rows_on_a_single_line.adoc
        // Expected: tablesTestTableWithExplicitColumnCountCanHaveMultipleRowsOnASingleLine
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `table with explicit deprecated colspec syntax can have multiple rows on a single line`() {
        // Input: asciidoctor/tables_test_table_with_explicit_deprecated_colspec_syntax_can_have_multiple_rows_on_a_single_line.adoc
        // Expected: tablesTestTableWithExplicitDeprecatedColspecSyntaxCanHaveMultipleRowsOnASingleLine
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `columns are added for empty records in colspec attribute`() {
        // Input: asciidoctor/tables_test_columns_are_added_for_empty_records_in_colspec_attribute.adoc
        // Expected: tablesTestColumnsAreAddedForEmptyRecordsInColspecAttribute
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `cols may be separated by semi-colon instead of comma`() {
        // Input: asciidoctor/tables_test_cols_may_be_separated_by_semi_colon_instead_of_comma.adoc
        // Expected: tablesTestColsMayBeSeparatedBySemiColonInsteadOfComma
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `cols attribute may include spaces`() {
        // Input: asciidoctor/tables_test_cols_attribute_may_include_spaces.adoc
        // Expected: tablesTestColsAttributeMayIncludeSpaces
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `blank cols attribute should be ignored`() {
        // Input: asciidoctor/tables_test_blank_cols_attribute_should_be_ignored.adoc
        // Expected: tablesTestBlankColsAttributeShouldBeIgnored
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `empty cols attribute should be ignored`() {
        // Input: asciidoctor/tables_test_empty_cols_attribute_should_be_ignored.adoc
        // Expected: tablesTestEmptyColsAttributeShouldBeIgnored
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `table with header and footer`() {
        // Input: asciidoctor/tables_test_table_with_header_and_footer.adoc
        // Expected: tablesTestTableWithHeaderAndFooter
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `table with header and footer docbook`() {
        // Input: asciidoctor/tables_test_table_with_header_and_footer_docbook.adoc
        // Expected: tablesTestTableWithHeaderAndFooterDocbook
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should set horizontal and vertical alignment when converting to DocBook`() {
        // Input: asciidoctor/tables_test_should_set_horizontal_and_vertical_alignment_when_converting_to_doc_book.adoc
        // Expected: tablesTestShouldSetHorizontalAndVerticalAlignmentWhenConvertingToDocBook
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should preserve frame value ends when converting to HTML`() {
        // Input: asciidoctor/tables_test_should_preserve_frame_value_ends_when_converting_to_html.adoc
        // Expected: tablesTestShouldPreserveFrameValueEndsWhenConvertingToHtml
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should normalize frame value topbot as ends when converting to HTML`() {
        // Input: asciidoctor/tables_test_should_normalize_frame_value_topbot_as_ends_when_converting_to_html.adoc
        // Expected: tablesTestShouldNormalizeFrameValueTopbotAsEndsWhenConvertingToHtml
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should preserve frame value topbot when converting to DocBook`() {
        // Input: asciidoctor/tables_test_should_preserve_frame_value_topbot_when_converting_to_doc_book.adoc
        // Expected: tablesTestShouldPreserveFrameValueTopbotWhenConvertingToDocBook
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should convert frame value ends to topbot when converting to DocBook`() {
        // Input: asciidoctor/tables_test_should_convert_frame_value_ends_to_topbot_when_converting_to_doc_book.adoc
        // Expected: tablesTestShouldConvertFrameValueEndsToTopbotWhenConvertingToDocBook
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `table with implicit header row`() {
        // Input: asciidoctor/tables_test_table_with_implicit_header_row.adoc
        // Expected: tablesTestTableWithImplicitHeaderRow
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `table with implicit header row only`() {
        // Input: asciidoctor/tables_test_table_with_implicit_header_row_only.adoc
        // Expected: tablesTestTableWithImplicitHeaderRowOnly
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `table with implicit header row when other options set`() {
        // Input: asciidoctor/tables_test_table_with_implicit_header_row_when_other_options_set.adoc
        // Expected: tablesTestTableWithImplicitHeaderRowWhenOtherOptionsSet
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `no implicit header row if second line not blank`() {
        // Input: asciidoctor/tables_test_no_implicit_header_row_if_second_line_not_blank.adoc
        // Expected: tablesTestNoImplicitHeaderRowIfSecondLineNotBlank
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `no implicit header row if cell in first line spans multiple lines`() {
        // Input: asciidoctor/tables_test_no_implicit_header_row_if_cell_in_first_line_spans_multiple_lines.adoc
        // Expected: tablesTestNoImplicitHeaderRowIfCellInFirstLineSpansMultipleLines
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should format first cell as literal if there is no implicit header row and column has l style`() {
        // Input: asciidoctor/tables_test_should_format_first_cell_as_literal_if_there_is_no_implicit_header_row_and_column_has_l_style.adoc
        // Expected: tablesTestShouldFormatFirstCellAsLiteralIfThereIsNoImplicitHeaderRowAndColumnHasLStyle
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should format first cell as AsciiDoc if there is no implicit header row and column has a style`() {
        // Input: asciidoctor/tables_test_should_format_first_cell_as_ascii_doc_if_there_is_no_implicit_header_row_and_column_has_a_style.adoc
        // Expected: tablesTestShouldFormatFirstCellAsAsciiDocIfThereIsNoImplicitHeaderRowAndColumnHasAStyle
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should interpret leading indent if first cell is AsciiDoc and there is no implicit header row`() {
        // Input: asciidoctor/tables_test_should_interpret_leading_indent_if_first_cell_is_ascii_doc_and_there_is_no_implicit_header_row.adoc
        // Expected: tablesTestShouldInterpretLeadingIndentIfFirstCellIsAsciiDocAndThereIsNoImplicitHeaderRow
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should format first cell as AsciiDoc if there is no implicit header row and cell has a style`() {
        // Input: asciidoctor/tables_test_should_format_first_cell_as_ascii_doc_if_there_is_no_implicit_header_row_and_cell_has_a_style.adoc
        // Expected: tablesTestShouldFormatFirstCellAsAsciiDocIfThereIsNoImplicitHeaderRowAndCellHasAStyle
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `no implicit header row if AsciiDoc cell in first line spans multiple lines`() {
        // Input: asciidoctor/tables_test_no_implicit_header_row_if_ascii_doc_cell_in_first_line_spans_multiple_lines.adoc
        // Expected: tablesTestNoImplicitHeaderRowIfAsciiDocCellInFirstLineSpansMultipleLines
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `no implicit header row if first line blank`() {
        // Input: asciidoctor/tables_test_no_implicit_header_row_if_first_line_blank.adoc
        // Expected: tablesTestNoImplicitHeaderRowIfFirstLineBlank
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `no implicit header row if noheader option is specified`() {
        // Input: asciidoctor/tables_test_no_implicit_header_row_if_noheader_option_is_specified.adoc
        // Expected: tablesTestNoImplicitHeaderRowIfNoheaderOptionIsSpecified
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `styles not applied to header cells`() {
        // Input: asciidoctor/tables_test_styles_not_applied_to_header_cells.adoc
        // Expected: tablesTestStylesNotAppliedToHeaderCells
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should apply text formatting to cells in implicit header row when column has a style`() {
        // Input: asciidoctor/tables_test_should_apply_text_formatting_to_cells_in_implicit_header_row_when_column_has_a_style.adoc
        // Expected: tablesTestShouldApplyTextFormattingToCellsInImplicitHeaderRowWhenColumnHasAStyle
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should apply style and text formatting to cells in first row if no implicit header`() {
        // Input: asciidoctor/tables_test_should_apply_style_and_text_formatting_to_cells_in_first_row_if_no_implicit_header.adoc
        // Expected: tablesTestShouldApplyStyleAndTextFormattingToCellsInFirstRowIfNoImplicitHeader
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `vertical table headers use th element instead of header class`() {
        // Input: asciidoctor/tables_test_vertical_table_headers_use_th_element_instead_of_header_class.adoc
        // Expected: tablesTestVerticalTableHeadersUseThElementInsteadOfHeaderClass
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `supports horizontal and vertical source data with blank lines and table header`() {
        // Input: asciidoctor/tables_test_supports_horizontal_and_vertical_source_data_with_blank_lines_and_table_header.adoc
        // Expected: tablesTestSupportsHorizontalAndVerticalSourceDataWithBlankLinesAndTableHeader
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `percentages as column widths`() {
        // Input: asciidoctor/tables_test_percentages_as_column_widths.adoc
        // Expected: tablesTestPercentagesAsColumnWidths
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `spans, alignments and styles`() {
        // Input: asciidoctor/tables_test_spans_alignments_and_styles.adoc
        // Expected: tablesTestSpansAlignmentsAndStyles
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `sets up columns correctly if first row has cell that spans columns`() {
        // Input: asciidoctor/tables_test_sets_up_columns_correctly_if_first_row_has_cell_that_spans_columns.adoc
        // Expected: tablesTestSetsUpColumnsCorrectlyIfFirstRowHasCellThatSpansColumns
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `supports repeating cells`() {
        // Input: asciidoctor/tables_test_supports_repeating_cells.adoc
        // Expected: tablesTestSupportsRepeatingCells
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `calculates colnames correctly when using implicit column count and single cell with colspan`() {
        // Input: asciidoctor/tables_test_calculates_colnames_correctly_when_using_implicit_column_count_and_single_cell_with_colspan.adoc
        // Expected: tablesTestCalculatesColnamesCorrectlyWhenUsingImplicitColumnCountAndSingleCellWithColspan
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `calculates colnames correctly when using implicit column count and cells with mixed colspans`() {
        // Input: asciidoctor/tables_test_calculates_colnames_correctly_when_using_implicit_column_count_and_cells_with_mixed_colspans.adoc
        // Expected: tablesTestCalculatesColnamesCorrectlyWhenUsingImplicitColumnCountAndCellsWithMixedColspans
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `assigns unique column names for table with implicit column count and colspans in first row`() {
        // Input: asciidoctor/tables_test_assigns_unique_column_names_for_table_with_implicit_column_count_and_colspans_in_first_row.adoc
        // Expected: tablesTestAssignsUniqueColumnNamesForTableWithImplicitColumnCountAndColspansInFirstRow
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should drop row but preserve remaining rows after cell with colspan exceeds number of columns`() {
        // Input: asciidoctor/tables_test_should_drop_row_but_preserve_remaining_rows_after_cell_with_colspan_exceeds_number_of_columns.adoc
        // Expected: tablesTestShouldDropRowButPreserveRemainingRowsAfterCellWithColspanExceedsNumberOfColumns
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should drop last row if last cell in table has colspan that exceeds specified number of columns`() {
        // Input: asciidoctor/tables_test_should_drop_last_row_if_last_cell_in_table_has_colspan_that_exceeds_specified_number_of_columns.adoc
        // Expected: tablesTestShouldDropLastRowIfLastCellInTableHasColspanThatExceedsSpecifiedNumberOfColumns
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should drop last row if last cell in table has colspan that exceeds implicit number of columns`() {
        // Input: asciidoctor/tables_test_should_drop_last_row_if_last_cell_in_table_has_colspan_that_exceeds_implicit_number_of_columns.adoc
        // Expected: tablesTestShouldDropLastRowIfLastCellInTableHasColspanThatExceedsImplicitNumberOfColumns
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should take colspan into account when taking cells for row`() {
        // Input: asciidoctor/tables_test_should_take_colspan_into_account_when_taking_cells_for_row.adoc
        // Expected: tablesTestShouldTakeColspanIntoAccountWhenTakingCellsForRow
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should drop incomplete row at end of table and log an error`() {
        // Input: asciidoctor/tables_test_should_drop_incomplete_row_at_end_of_table_and_log_an_error.adoc
        // Expected: tablesTestShouldDropIncompleteRowAtEndOfTableAndLogAnError
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should apply cell style for column to repeated content`() {
        // Input: asciidoctor/tables_test_should_apply_cell_style_for_column_to_repeated_content.adoc
        // Expected: tablesTestShouldApplyCellStyleForColumnToRepeatedContent
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not split paragraph at line containing only {blank} that is directly adjacent to non-blank lines`() {
        // Input: asciidoctor/tables_test_should_not_split_paragraph_at_line_containing_only_{blank}_that_is_directly_adjacent_to_non_blank_lines.adoc
        // Expected: tablesTestShouldNotSplitParagraphAtLineContainingOnlyblankThatIsDirectlyAdjacentToNonBlankLines
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should strip trailing newlines when splitting paragraphs`() {
        // Input: asciidoctor/tables_test_should_strip_trailing_newlines_when_splitting_paragraphs.adoc
        // Expected: tablesTestShouldStripTrailingNewlinesWhenSplittingParagraphs
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `basic AsciiDoc cell`() {
        // Input: asciidoctor/tables_test_basic_ascii_doc_cell.adoc
        // Expected: tablesTestBasicAsciiDocCell
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `doctype can be set in AsciiDoc table cell`() {
        // Input: asciidoctor/tables_test_doctype_can_be_set_in_ascii_doc_table_cell.adoc
        // Expected: tablesTestDoctypeCanBeSetInAsciiDocTableCell
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should reset doctype to default in AsciiDoc table cell`() {
        // Input: asciidoctor/tables_test_should_reset_doctype_to_default_in_ascii_doc_table_cell.adoc
        // Expected: tablesTestShouldResetDoctypeToDefaultInAsciiDocTableCell
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should update doctype-related attributes in AsciiDoc table cell when doctype is set`() {
        // Input: asciidoctor/tables_test_should_update_doctype_related_attributes_in_ascii_doc_table_cell_when_doctype_is_set.adoc
        // Expected: tablesTestShouldUpdateDoctypeRelatedAttributesInAsciiDocTableCellWhenDoctypeIsSet
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not allow AsciiDoc table cell to set a document attribute that was hard set by the API`() {
        // Input: asciidoctor/tables_test_should_not_allow_ascii_doc_table_cell_to_set_a_document_attribute_that_was_hard_set_by_the_api.adoc
        // Expected: tablesTestShouldNotAllowAsciiDocTableCellToSetADocumentAttributeThatWasHardSetByTheApi
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not allow AsciiDoc table cell to set a document attribute that was hard unset by the API`() {
        // Input: asciidoctor/tables_test_should_not_allow_ascii_doc_table_cell_to_set_a_document_attribute_that_was_hard_unset_by_the_api.adoc
        // Expected: tablesTestShouldNotAllowAsciiDocTableCellToSetADocumentAttributeThatWasHardUnsetByTheApi
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should keep attribute unset in AsciiDoc table cell if unset in parent document`() {
        // Input: asciidoctor/tables_test_should_keep_attribute_unset_in_ascii_doc_table_cell_if_unset_in_parent_document.adoc
        // Expected: tablesTestShouldKeepAttributeUnsetInAsciiDocTableCellIfUnsetInParentDocument
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should allow attribute unset in parent document to be set in AsciiDoc table cell`() {
        // Input: asciidoctor/tables_test_should_allow_attribute_unset_in_parent_document_to_be_set_in_ascii_doc_table_cell.adoc
        // Expected: tablesTestShouldAllowAttributeUnsetInParentDocumentToBeSetInAsciiDocTableCell
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not allow locked attribute unset in parent document to be set in AsciiDoc table cell`() {
        // Input: asciidoctor/tables_test_should_not_allow_locked_attribute_unset_in_parent_document_to_be_set_in_ascii_doc_table_cell.adoc
        // Expected: tablesTestShouldNotAllowLockedAttributeUnsetInParentDocumentToBeSetInAsciiDocTableCell
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `AsciiDoc content`() {
        // Input: asciidoctor/tables_test_ascii_doc_content.adoc
        // Expected: tablesTestAsciiDocContent
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should preserve leading indentation in contents of AsciiDoc table cell if contents starts with newline`() {
        // Input: asciidoctor/tables_test_should_preserve_leading_indentation_in_contents_of_ascii_doc_table_cell_if_contents_starts_with_newline.adoc
        // Expected: tablesTestShouldPreserveLeadingIndentationInContentsOfAsciiDocTableCellIfContentsStartsWithNewline
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `preprocessor directive on first line of an AsciiDoc table cell should be processed`() {
        // Input: asciidoctor/tables_test_preprocessor_directive_on_first_line_of_an_ascii_doc_table_cell_should_be_processed.adoc
        // Expected: tablesTestPreprocessorDirectiveOnFirstLineOfAnAsciiDocTableCellShouldBeProcessed
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `error about unresolved preprocessor directive on first line of an AsciiDoc table cell should have correct cursor`() {
        // Input: asciidoctor/tables_test_error_about_unresolved_preprocessor_directive_on_first_line_of_an_ascii_doc_table_cell_should_have_correct_cursor.adoc
        // Expected: tablesTestErrorAboutUnresolvedPreprocessorDirectiveOnFirstLineOfAnAsciiDocTableCellShouldHaveCorrectCursor
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `cross reference link in an AsciiDoc table cell should resolve to reference in main document`() {
        // Input: asciidoctor/tables_test_cross_reference_link_in_an_ascii_doc_table_cell_should_resolve_to_reference_in_main_document.adoc
        // Expected: tablesTestCrossReferenceLinkInAnAsciiDocTableCellShouldResolveToReferenceInMainDocument
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should discover anchor at start of cell and register it as a reference`() {
        // Input: asciidoctor/tables_test_should_discover_anchor_at_start_of_cell_and_register_it_as_a_reference.adoc
        // Expected: tablesTestShouldDiscoverAnchorAtStartOfCellAndRegisterItAsAReference
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should catalog anchor at start of cell in implicit header row when column has a style`() {
        // Input: asciidoctor/tables_test_should_catalog_anchor_at_start_of_cell_in_implicit_header_row_when_column_has_a_style.adoc
        // Expected: tablesTestShouldCatalogAnchorAtStartOfCellInImplicitHeaderRowWhenColumnHasAStyle
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should catalog anchor at start of cell in explicit header row when column has a style`() {
        // Input: asciidoctor/tables_test_should_catalog_anchor_at_start_of_cell_in_explicit_header_row_when_column_has_a_style.adoc
        // Expected: tablesTestShouldCatalogAnchorAtStartOfCellInExplicitHeaderRowWhenColumnHasAStyle
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should catalog anchor at start of cell in first row`() {
        // Input: asciidoctor/tables_test_should_catalog_anchor_at_start_of_cell_in_first_row.adoc
        // Expected: tablesTestShouldCatalogAnchorAtStartOfCellInFirstRow
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `footnotes should not be shared between an AsciiDoc table cell and the main document`() {
        // Input: asciidoctor/tables_test_footnotes_should_not_be_shared_between_an_ascii_doc_table_cell_and_the_main_document.adoc
        // Expected: tablesTestFootnotesShouldNotBeSharedBetweenAnAsciiDocTableCellAndTheMainDocument
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `callout numbers should be globally unique, including AsciiDoc table cells`() {
        // Input: asciidoctor/tables_test_callout_numbers_should_be_globally_unique_including_ascii_doc_table_cells.adoc
        // Expected: tablesTestCalloutNumbersShouldBeGloballyUniqueIncludingAsciiDocTableCells
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `compat mode can be activated in AsciiDoc table cell`() {
        // Input: asciidoctor/tables_test_compat_mode_can_be_activated_in_ascii_doc_table_cell.adoc
        // Expected: tablesTestCompatModeCanBeActivatedInAsciiDocTableCell
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `compat mode in AsciiDoc table cell inherits from parent document`() {
        // Input: asciidoctor/tables_test_compat_mode_in_ascii_doc_table_cell_inherits_from_parent_document.adoc
        // Expected: tablesTestCompatModeInAsciiDocTableCellInheritsFromParentDocument
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `compat mode in AsciiDoc table cell can be unset if set in parent document`() {
        // Input: asciidoctor/tables_test_compat_mode_in_ascii_doc_table_cell_can_be_unset_if_set_in_parent_document.adoc
        // Expected: tablesTestCompatModeInAsciiDocTableCellCanBeUnsetIfSetInParentDocument
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `nested table`() {
        // Input: asciidoctor/tables_test_nested_table.adoc
        // Expected: tablesTestNestedTable
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `can set format of nested table to psv`() {
        // Input: asciidoctor/tables_test_can_set_format_of_nested_table_to_psv.adoc
        // Expected: tablesTestCanSetFormatOfNestedTableToPsv
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `AsciiDoc table cell should inherit to_dir option from parent document`() {
        // Input: asciidoctor/tables_test_ascii_doc_table_cell_should_inherit_to_dir_option_from_parent_document.adoc
        // Expected: tablesTestAsciiDocTableCellShouldInheritToDirOptionFromParentDocument
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `AsciiDoc table cell should not inherit toc setting from parent document`() {
        // Input: asciidoctor/tables_test_ascii_doc_table_cell_should_not_inherit_toc_setting_from_parent_document.adoc
        // Expected: tablesTestAsciiDocTableCellShouldNotInheritTocSettingFromParentDocument
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should be able to enable toc in an AsciiDoc table cell`() {
        // Input: asciidoctor/tables_test_should_be_able_to_enable_toc_in_an_ascii_doc_table_cell.adoc
        // Expected: tablesTestShouldBeAbleToEnableTocInAnAsciiDocTableCell
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should be able to enable toc in an AsciiDoc table cell even if hard unset by API`() {
        // Input: asciidoctor/tables_test_should_be_able_to_enable_toc_in_an_ascii_doc_table_cell_even_if_hard_unset_by_api.adoc
        // Expected: tablesTestShouldBeAbleToEnableTocInAnAsciiDocTableCellEvenIfHardUnsetByApi
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should be able to enable toc in both outer document and in an AsciiDoc table cell`() {
        // Input: asciidoctor/tables_test_should_be_able_to_enable_toc_in_both_outer_document_and_in_an_ascii_doc_table_cell.adoc
        // Expected: tablesTestShouldBeAbleToEnableTocInBothOuterDocumentAndInAnAsciiDocTableCell
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `document in an AsciiDoc table cell should not see doctitle of parent`() {
        // Input: asciidoctor/tables_test_document_in_an_ascii_doc_table_cell_should_not_see_doctitle_of_parent.adoc
        // Expected: tablesTestDocumentInAnAsciiDocTableCellShouldNotSeeDoctitleOfParent
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `cell background color`() {
        // Input: asciidoctor/tables_test_cell_background_color.adoc
        // Expected: tablesTestCellBackgroundColor
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should warn if table block is not terminated`() {
        // Input: asciidoctor/tables_test_should_warn_if_table_block_is_not_terminated.adoc
        // Expected: tablesTestShouldWarnIfTableBlockIsNotTerminated
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should show correct line number in warning about unterminated block inside AsciiDoc table cell`() {
        // Input: asciidoctor/tables_test_should_show_correct_line_number_in_warning_about_unterminated_block_inside_ascii_doc_table_cell.adoc
        // Expected: tablesTestShouldShowCorrectLineNumberInWarningAboutUnterminatedBlockInsideAsciiDocTableCell
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `custom separator for an AsciiDoc table cell`() {
        // Input: asciidoctor/tables_test_custom_separator_for_an_ascii_doc_table_cell.adoc
        // Expected: tablesTestCustomSeparatorForAnAsciiDocTableCell
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `table with breakable option docbook 5`() {
        // Input: asciidoctor/tables_test_table_with_breakable_option_docbook_5.adoc
        // Expected: tablesTestTableWithBreakableOptionDocbook5
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `table with unbreakable option docbook 5`() {
        // Input: asciidoctor/tables_test_table_with_unbreakable_option_docbook_5.adoc
        // Expected: tablesTestTableWithUnbreakableOptionDocbook5
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `no implicit header row if cell in first line is quoted and spans multiple lines`() {
        // Input: asciidoctor/tables_test_no_implicit_header_row_if_cell_in_first_line_is_quoted_and_spans_multiple_lines.adoc
        // Expected: tablesTestNoImplicitHeaderRowIfCellInFirstLineIsQuotedAndSpansMultipleLines
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `converts simple dsv table`() {
        // Input: asciidoctor/tables_test_converts_simple_dsv_table.adoc
        // Expected: tablesTestConvertsSimpleDsvTable
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `dsv format shorthand`() {
        // Input: asciidoctor/tables_test_dsv_format_shorthand.adoc
        // Expected: tablesTestDsvFormatShorthand
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `single cell in DSV table should only produce single row`() {
        // Input: asciidoctor/tables_test_single_cell_in_dsv_table_should_only_produce_single_row.adoc
        // Expected: tablesTestSingleCellInDsvTableShouldOnlyProduceSingleRow
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should treat trailing colon as an empty cell`() {
        // Input: asciidoctor/tables_test_should_treat_trailing_colon_as_an_empty_cell.adoc
        // Expected: tablesTestShouldTreatTrailingColonAsAnEmptyCell
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should treat trailing comma as an empty cell`() {
        // Input: asciidoctor/tables_test_should_treat_trailing_comma_as_an_empty_cell.adoc
        // Expected: tablesTestShouldTreatTrailingCommaAsAnEmptyCell
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should log error but not crash if cell data has unclosed quote`() {
        // Input: asciidoctor/tables_test_should_log_error_but_not_crash_if_cell_data_has_unclosed_quote.adoc
        // Expected: tablesTestShouldLogErrorButNotCrashIfCellDataHasUnclosedQuote
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should preserve newlines in quoted CSV values`() {
        // Input: asciidoctor/tables_test_should_preserve_newlines_in_quoted_csv_values.adoc
        // Expected: tablesTestShouldPreserveNewlinesInQuotedCsvValues
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `mixed unquoted records and quoted records with escaped quotes, commas, and wrapped lines`() {
        // Input: asciidoctor/tables_test_mixed_unquoted_records_and_quoted_records_with_escaped_quotes_commas_and_wrapped_lines.adoc
        // Expected: tablesTestMixedUnquotedRecordsAndQuotedRecordsWithEscapedQuotesCommasAndWrappedLines
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should allow quotes around a CSV value to be on their own lines`() {
        // Input: asciidoctor/tables_test_should_allow_quotes_around_a_csv_value_to_be_on_their_own_lines.adoc
        // Expected: tablesTestShouldAllowQuotesAroundACsvValueToBeOnTheirOwnLines
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `csv format shorthand`() {
        // Input: asciidoctor/tables_test_csv_format_shorthand.adoc
        // Expected: tablesTestCsvFormatShorthand
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `custom csv separator`() {
        // Input: asciidoctor/tables_test_custom_csv_separator.adoc
        // Expected: tablesTestCustomCsvSeparator
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `single cell in CSV table should only produce single row`() {
        // Input: asciidoctor/tables_test_single_cell_in_csv_table_should_only_produce_single_row.adoc
        // Expected: tablesTestSingleCellInCsvTableShouldOnlyProduceSingleRow
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `cell formatted with AsciiDoc style`() {
        // Input: asciidoctor/tables_test_cell_formatted_with_ascii_doc_style.adoc
        // Expected: tablesTestCellFormattedWithAsciiDocStyle
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should strip whitespace around contents of AsciiDoc cell`() {
        // Input: asciidoctor/tables_test_should_strip_whitespace_around_contents_of_ascii_doc_cell.adoc
        // Expected: tablesTestShouldStripWhitespaceAroundContentsOfAsciiDocCell
    }

}
