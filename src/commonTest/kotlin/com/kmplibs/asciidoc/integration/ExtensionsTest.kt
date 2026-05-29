package com.kmplibs.asciidoc.integration

import kotlin.test.Test
import kotlin.test.Ignore

class ExtensionsTest {

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not activate registry if no extension groups are registered`() {
        // Input: asciidoctor/extensions_test_should_not_activate_registry_if_no_extension_groups_are_registered.adoc
        // Expected: extensionsTestShouldNotActivateRegistryIfNoExtensionGroupsAreRegistered
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should invoke include processor to process include directive`() {
        // Input: asciidoctor/extensions_test_should_invoke_include_processor_to_process_include_directive.adoc
        // Expected: extensionsTestShouldInvokeIncludeProcessorToProcessIncludeDirective
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should invoke include processor if it offers to handle include directive`() {
        // Input: asciidoctor/extensions_test_should_invoke_include_processor_if_it_offers_to_handle_include_directive.adoc
        // Expected: extensionsTestShouldInvokeIncludeProcessorIfItOffersToHandleIncludeDirective
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should invoke tree processors after parsing document`() {
        // Input: asciidoctor/extensions_test_should_invoke_tree_processors_after_parsing_document.adoc
        // Expected: extensionsTestShouldInvokeTreeProcessorsAfterParsingDocument
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should allow tree processor to replace tree`() {
        // Input: asciidoctor/extensions_test_should_allow_tree_processor_to_replace_tree.adoc
        // Expected: extensionsTestShouldAllowTreeProcessorToReplaceTree
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should honor block title assigned in tree processor`() {
        // Input: asciidoctor/extensions_test_should_honor_block_title_assigned_in_tree_processor.adoc
        // Expected: extensionsTestShouldHonorBlockTitleAssignedInTreeProcessor
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should invoke postprocessors after converting document`() {
        // Input: asciidoctor/extensions_test_should_invoke_postprocessors_after_converting_document.adoc
        // Expected: extensionsTestShouldInvokePostprocessorsAfterConvertingDocument
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should yield to document processor block if block has non-zero arity`() {
        // Input: asciidoctor/extensions_test_should_yield_to_document_processor_block_if_block_has_non_zero_arity.adoc
        // Expected: extensionsTestShouldYieldToDocumentProcessorBlockIfBlockHasNonZeroArity
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should invoke processor for custom block`() {
        // Input: asciidoctor/extensions_test_should_invoke_processor_for_custom_block.adoc
        // Expected: extensionsTestShouldInvokeProcessorForCustomBlock
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should invoke processor for custom block in an AsciiDoc table cell`() {
        // Input: asciidoctor/extensions_test_should_invoke_processor_for_custom_block_in_an_ascii_doc_table_cell.adoc
        // Expected: extensionsTestShouldInvokeProcessorForCustomBlockInAnAsciiDocTableCell
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should yield to syntax processor block if block has non-zero arity`() {
        // Input: asciidoctor/extensions_test_should_yield_to_syntax_processor_block_if_block_has_non_zero_arity.adoc
        // Expected: extensionsTestShouldYieldToSyntaxProcessorBlockIfBlockHasNonZeroArity
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should pass cloaked context in attributes passed to process method of custom block`() {
        // Input: asciidoctor/extensions_test_should_pass_cloaked_context_in_attributes_passed_to_process_method_of_custom_block.adoc
        // Expected: extensionsTestShouldPassCloakedContextInAttributesPassedToProcessMethodOfCustomBlock
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should allow extension to promote paragraph to compound block`() {
        // Input: asciidoctor/extensions_test_should_allow_extension_to_promote_paragraph_to_compound_block.adoc
        // Expected: extensionsTestShouldAllowExtensionToPromoteParagraphToCompoundBlock
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should drop block macro line if target references missing attribute and attribute-missing is drop-line`() {
        // Input: asciidoctor/extensions_test_should_drop_block_macro_line_if_target_references_missing_attribute_and_attribute_missing_is_drop_line.adoc
        // Expected: extensionsTestShouldDropBlockMacroLineIfTargetReferencesMissingAttributeAndAttributeMissingIsDropLine
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should invoke processor for custom block macro in an AsciiDoc table cell`() {
        // Input: asciidoctor/extensions_test_should_invoke_processor_for_custom_block_macro_in_an_ascii_doc_table_cell.adoc
        // Expected: extensionsTestShouldInvokeProcessorForCustomBlockMacroInAnAsciiDocTableCell
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should fail to convert if name of block macro is illegal`() {
        // Input: asciidoctor/extensions_test_should_fail_to_convert_if_name_of_block_macro_is_illegal.adoc
        // Expected: extensionsTestShouldFailToConvertIfNameOfBlockMacroIsIllegal
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should parse text in square brackets as attrlist by default`() {
        // Input: asciidoctor/extensions_test_should_parse_text_in_square_brackets_as_attrlist_by_default.adoc
        // Expected: extensionsTestShouldParseTextInSquareBracketsAsAttrlistByDefault
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should prefer attributes parsed from inline macro over default attributes`() {
        // Input: asciidoctor/extensions_test_should_prefer_attributes_parsed_from_inline_macro_over_default_attributes.adoc
        // Expected: extensionsTestShouldPreferAttributesParsedFromInlineMacroOverDefaultAttributes
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not invoke process method or carry over attributes if block processor declares skip content model`() {
        // Input: asciidoctor/extensions_test_should_not_invoke_process_method_or_carry_over_attributes_if_block_processor_declares_skip_content_model.adoc
        // Expected: extensionsTestShouldNotInvokeProcessMethodOrCarryOverAttributesIfBlockProcessorDeclaresSkipContentModel
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should pass attributes by value to block processor`() {
        // Input: asciidoctor/extensions_test_should_pass_attributes_by_value_to_block_processor.adoc
        // Expected: extensionsTestShouldPassAttributesByValueToBlockProcessor
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should allow extension to replace custom block with a section`() {
        // Input: asciidoctor/extensions_test_should_allow_extension_to_replace_custom_block_with_a_section.adoc
        // Expected: extensionsTestShouldAllowExtensionToReplaceCustomBlockWithASection
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `can use parse_content to append blocks to current parent`() {
        // Input: asciidoctor/extensions_test_can_use_parse_content_to_append_blocks_to_current_parent.adoc
        // Expected: extensionsTestCanUseParseContentToAppendBlocksToCurrentParent
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should ignore return value of custom block if value is parent`() {
        // Input: asciidoctor/extensions_test_should_ignore_return_value_of_custom_block_if_value_is_parent.adoc
        // Expected: extensionsTestShouldIgnoreReturnValueOfCustomBlockIfValueIsParent
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should ignore return value of custom block macro if value is parent`() {
        // Input: asciidoctor/extensions_test_should_ignore_return_value_of_custom_block_macro_if_value_is_parent.adoc
        // Expected: extensionsTestShouldIgnoreReturnValueOfCustomBlockMacroIfValueIsParent
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `parse_content should not share attributes between parsed blocks`() {
        // Input: asciidoctor/extensions_test_parse_content_should_not_share_attributes_between_parsed_blocks.adoc
        // Expected: extensionsTestParseContentShouldNotShareAttributesBetweenParsedBlocks
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `can use parse_attributes to parse attrlist`() {
        // Input: asciidoctor/extensions_test_can_use_parse_attributes_to_parse_attrlist.adoc
        // Expected: extensionsTestCanUseParseAttributesToParseAttrlist
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `create_section should set up all section properties`() {
        // Input: asciidoctor/extensions_test_create_section_should_set_up_all_section_properties.adoc
        // Expected: extensionsTestCreateSectionShouldSetUpAllSectionProperties
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should add docinfo to document`() {
        // Input: asciidoctor/extensions_test_should_add_docinfo_to_document.adoc
        // Expected: extensionsTestShouldAddDocinfoToDocument
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should add multiple docinfo to document`() {
        // Input: asciidoctor/extensions_test_should_add_multiple_docinfo_to_document.adoc
        // Expected: extensionsTestShouldAddMultipleDocinfoToDocument
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not assign caption on image block if title is not set on custom block macro`() {
        // Input: asciidoctor/extensions_test_should_not_assign_caption_on_image_block_if_title_is_not_set_on_custom_block_macro.adoc
        // Expected: extensionsTestShouldNotAssignCaptionOnImageBlockIfTitleIsNotSetOnCustomBlockMacro
    }

}
