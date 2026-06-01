package com.kmplibs.asciidoc.integration

import kotlin.test.Test
import kotlin.test.Ignore

class ParserTest {

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `parse name with more than 3 parts in author attribute`() {
        // Input: asciidoctor/parser_test_parse_name_with_more_than_3_parts_in_author_attribute.adoc
        // Expected: parserTestParseNameWithMoreThan3PartsInAuthorAttribute
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `use explicit authorinitials if set after author attribute`() {
        // Input: asciidoctor/parser_test_use_explicit_authorinitials_if_set_after_author_attribute.adoc
        // Expected: parserTestUseExplicitAuthorinitialsIfSetAfterAuthorAttribute
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `use implicit authors if value of authors attribute matches computed value`() {
        // Input: asciidoctor/parser_test_use_implicit_authors_if_value_of_authors_attribute_matches_computed_value.adoc
        // Expected: parserTestUseImplicitAuthorsIfValueOfAuthorsAttributeMatchesComputedValue
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `replace implicit authors if value of authors attribute does not match computed value`() {
        // Input: asciidoctor/parser_test_replace_implicit_authors_if_value_of_authors_attribute_does_not_match_computed_value.adoc
        // Expected: parserTestReplaceImplicitAuthorsIfValueOfAuthorsAttributeDoesNotMatchComputedValue
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `sets authorcount to 0 if document has no authors`() {
        // Input: asciidoctor/parser_test_sets_authorcount_to_0_if_document_has_no_authors.adoc
        // Expected: parserTestSetsAuthorcountTo0IfDocumentHasNoAuthors
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `parse rev number date remark`() {
        // Input: asciidoctor/parser_test_parse_rev_number_date_remark.adoc
        // Expected: parserTestParseRevNumberDateRemark
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `parse rev number, data, and remark as attribute references`() {
        // Input: asciidoctor/parser_test_parse_rev_number_data_and_remark_as_attribute_references.adoc
        // Expected: parserTestParseRevNumberDataAndRemarkAsAttributeReferences
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should resolve attribute references in rev number, data, and remark`() {
        // Input: asciidoctor/parser_test_should_resolve_attribute_references_in_rev_number_data_and_remark.adoc
        // Expected: parserTestShouldResolveAttributeReferencesInRevNumberDataAndRemark
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `parse rev date`() {
        // Input: asciidoctor/parser_test_parse_rev_date.adoc
        // Expected: parserTestParseRevDate
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `parse rev number with trailing comma`() {
        // Input: asciidoctor/parser_test_parse_rev_number_with_trailing_comma.adoc
        // Expected: parserTestParseRevNumberWithTrailingComma
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `parse rev number`() {
        // Input: asciidoctor/parser_test_parse_rev_number.adoc
        // Expected: parserTestParseRevNumber
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `treats arbitrary text on rev line as revdate`() {
        // Input: asciidoctor/parser_test_treats_arbitrary_text_on_rev_line_as_revdate.adoc
        // Expected: parserTestTreatsArbitraryTextOnRevLineAsRevdate
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `parse rev date remark`() {
        // Input: asciidoctor/parser_test_parse_rev_date_remark.adoc
        // Expected: parserTestParseRevDateRemark
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not mistake attribute entry as rev remark`() {
        // Input: asciidoctor/parser_test_should_not_mistake_attribute_entry_as_rev_remark.adoc
        // Expected: parserTestShouldNotMistakeAttributeEntryAsRevRemark
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `parse rev remark only`() {
        // Input: asciidoctor/parser_test_parse_rev_remark_only.adoc
        // Expected: parserTestParseRevRemarkOnly
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `skip line comments before author`() {
        // Input: asciidoctor/parser_test_skip_line_comments_before_author.adoc
        // Expected: parserTestSkipLineCommentsBeforeAuthor
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `skip block comment before author`() {
        // Input: asciidoctor/parser_test_skip_block_comment_before_author.adoc
        // Expected: parserTestSkipBlockCommentBeforeAuthor
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `skip block comment before rev`() {
        // Input: asciidoctor/parser_test_skip_block_comment_before_rev.adoc
        // Expected: parserTestSkipBlockCommentBeforeRev
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `break header at line with three forward slashes`() {
        // Input: asciidoctor/parser_test_break_header_at_line_with_three_forward_slashes.adoc
        // Expected: parserTestBreakHeaderAtLineWithThreeForwardSlashes
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `expands tabs to spaces`() {
        // Input: asciidoctor/parser_test_expands_tabs_to_spaces.adoc
        // Expected: parserTestExpandsTabsToSpaces
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `adjust indentation handles empty lines gracefully`() {
        // Input: asciidoctor/parser_test_adjust_indentation_handles_empty_lines_gracefully.adoc
        // Expected: parserTestAdjustIndentationHandlesEmptyLinesGracefully
    }

}
