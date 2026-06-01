package com.kmplibs.asciidoc.integration

import kotlin.test.Test
import kotlin.test.Ignore

class PreambleTest {

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `title and single paragraph preamble before section`() {
        // Input: asciidoctor/preamble_test_title_and_single_paragraph_preamble_before_section.adoc
        // Expected: preambleTestTitleAndSingleParagraphPreambleBeforeSection
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `title of preface is blank by default in DocBook output`() {
        // Input: asciidoctor/preamble_test_title_of_preface_is_blank_by_default_in_doc_book_output.adoc
        // Expected: preambleTestTitleOfPrefaceIsBlankByDefaultInDocBookOutput
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `preface-title attribute is assigned as title of preface in DocBook output`() {
        // Input: asciidoctor/preamble_test_preface_title_attribute_is_assigned_as_title_of_preface_in_doc_book_output.adoc
        // Expected: preambleTestPrefaceTitleAttributeIsAssignedAsTitleOfPrefaceInDocBookOutput
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `title and multi-paragraph preamble before section`() {
        // Input: asciidoctor/preamble_test_title_and_multi_paragraph_preamble_before_section.adoc
        // Expected: preambleTestTitleAndMultiParagraphPreambleBeforeSection
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not wrap content in preamble if document has title but no sections`() {
        // Input: asciidoctor/preamble_test_should_not_wrap_content_in_preamble_if_document_has_title_but_no_sections.adoc
        // Expected: preambleTestShouldNotWrapContentInPreambleIfDocumentHasTitleButNoSections
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `title and section without preamble`() {
        // Input: asciidoctor/preamble_test_title_and_section_without_preamble.adoc
        // Expected: preambleTestTitleAndSectionWithoutPreamble
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `no title with preamble and section`() {
        // Input: asciidoctor/preamble_test_no_title_with_preamble_and_section.adoc
        // Expected: preambleTestNoTitleWithPreambleAndSection
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `preamble in book doctype`() {
        // Input: asciidoctor/preamble_test_preamble_in_book_doctype.adoc
        // Expected: preambleTestPreambleInBookDoctype
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should output table of contents in preamble if toc-placement attribute value is preamble`() {
        // Input: asciidoctor/preamble_test_should_output_table_of_contents_in_preamble_if_toc_placement_attribute_value_is_preamble.adoc
        // Expected: preambleTestShouldOutputTableOfContentsInPreambleIfTocPlacementAttributeValueIsPreamble
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should move abstract in implicit preface to info tag when converting to DocBook`() {
        // Input: asciidoctor/preamble_test_should_move_abstract_in_implicit_preface_to_info_tag_when_converting_to_doc_book.adoc
        // Expected: preambleTestShouldMoveAbstractInImplicitPrefaceToInfoTagWhenConvertingToDocBook
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should move abstract as first section to info tag when converting to DocBook`() {
        // Input: asciidoctor/preamble_test_should_move_abstract_as_first_section_to_info_tag_when_converting_to_doc_book.adoc
        // Expected: preambleTestShouldMoveAbstractAsFirstSectionToInfoTagWhenConvertingToDocBook
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should move abstract in preface section to info tag when converting to DocBook`() {
        // Input: asciidoctor/preamble_test_should_move_abstract_in_preface_section_to_info_tag_when_converting_to_doc_book.adoc
        // Expected: preambleTestShouldMoveAbstractInPrefaceSectionToInfoTagWhenConvertingToDocBook
    }

}
