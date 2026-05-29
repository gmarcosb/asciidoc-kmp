package com.kmplibs.asciidoc.integration

import kotlin.test.Test
import kotlin.test.Ignore

class ManpageTest {

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should set proper manpage-related attributes`() {
        // Input: asciidoctor/manpage_test_should_set_proper_manpage_related_attributes.adoc
        // Expected: manpageTestShouldSetProperManpageRelatedAttributes
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should substitute attributes in manname and manpurpose in NAME section`() {
        // Input: asciidoctor/manpage_test_should_substitute_attributes_in_manname_and_manpurpose_in_name_section.adoc
        // Expected: manpageTestShouldSubstituteAttributesInMannameAndManpurposeInNameSection
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not parse NAME section if manname and manpurpose attributes are set`() {
        // Input: asciidoctor/manpage_test_should_not_parse_name_section_if_manname_and_manpurpose_attributes_are_set.adoc
        // Expected: manpageTestShouldNotParseNameSectionIfMannameAndManpurposeAttributesAreSet
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should normalize whitespace and skip line comments before and inside NAME section`() {
        // Input: asciidoctor/manpage_test_should_normalize_whitespace_and_skip_line_comments_before_and_inside_name_section.adoc
        // Expected: manpageTestShouldNormalizeWhitespaceAndSkipLineCommentsBeforeAndInsideNameSection
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should parse malformed document with warnings`() {
        // Input: asciidoctor/manpage_test_should_parse_malformed_document_with_warnings.adoc
        // Expected: manpageTestShouldParseMalformedDocumentWithWarnings
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should warn if first section is not name section`() {
        // Input: asciidoctor/manpage_test_should_warn_if_first_section_is_not_name_section.adoc
        // Expected: manpageTestShouldWarnIfFirstSectionIsNotNameSection
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should preserve hard line breaks in verse block`() {
        // Input: asciidoctor/manpage_test_should_preserve_hard_line_breaks_in_verse_block.adoc
        // Expected: manpageTestShouldPreserveHardLineBreaksInVerseBlock
    }

}
