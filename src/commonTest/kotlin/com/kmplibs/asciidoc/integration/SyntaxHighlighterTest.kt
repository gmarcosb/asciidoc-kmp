package com.kmplibs.asciidoc.integration

import kotlin.test.Test
import kotlin.test.Ignore

class SyntaxHighlighterTest {

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should set syntax_highlighter property on document if source highlighter is set and basebackend is html`() {
        // Input: asciidoctor/syntax_highlighter_test_should_set_syntax_highlighter_property_on_document_if_source_highlighter_is_set_and_basebackend_is_html.adoc
        // Expected: syntaxHighlighterTestShouldSetSyntaxHighlighterPropertyOnDocumentIfSourceHighlighterIsSetAndBasebackendIsHtml
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not set syntax_highlighter property on document if source highlighter is set and basebackend is not html`() {
        // Input: asciidoctor/syntax_highlighter_test_should_not_set_syntax_highlighter_property_on_document_if_source_highlighter_is_set_and_basebackend_is_not_html.adoc
        // Expected: syntaxHighlighterTestShouldNotSetSyntaxHighlighterPropertyOnDocumentIfSourceHighlighterIsSetAndBasebackendIsNotHtml
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not set syntax_highlighter property on document if source highlighter is not set`() {
        // Input: asciidoctor/syntax_highlighter_test_should_not_set_syntax_highlighter_property_on_document_if_source_highlighter_is_not_set.adoc
        // Expected: syntaxHighlighterTestShouldNotSetSyntaxHighlighterPropertyOnDocumentIfSourceHighlighterIsNotSet
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not set syntax_highlighter property on document if syntax highlighter cannot be resolved`() {
        // Input: asciidoctor/syntax_highlighter_test_should_not_set_syntax_highlighter_property_on_document_if_syntax_highlighter_cannot_be_resolved.adoc
        // Expected: syntaxHighlighterTestShouldNotSetSyntaxHighlighterPropertyOnDocumentIfSyntaxHighlighterCannotBeResolved
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should set language on output of source block when source-highlighter attribute is not set`() {
        // Input: asciidoctor/syntax_highlighter_test_should_set_language_on_output_of_source_block_when_source_highlighter_attribute_is_not_set.adoc
        // Expected: syntaxHighlighterTestShouldSetLanguageOnOutputOfSourceBlockWhenSourceHighlighterAttributeIsNotSet
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should set language on output of source block when source-highlighter attribute is not recognized`() {
        // Input: asciidoctor/syntax_highlighter_test_should_set_language_on_output_of_source_block_when_source_highlighter_attribute_is_not_recognized.adoc
        // Expected: syntaxHighlighterTestShouldSetLanguageOnOutputOfSourceBlockWhenSourceHighlighterAttributeIsNotRecognized
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should highlight source if source highlighter is set even if language is not set`() {
        // Input: asciidoctor/syntax_highlighter_test_should_highlight_source_if_source_highlighter_is_set_even_if_language_is_not_set.adoc
        // Expected: syntaxHighlighterTestShouldHighlightSourceIfSourceHighlighterIsSetEvenIfLanguageIsNotSet
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not crash if source block has no lines and source highlighter is set`() {
        // Input: asciidoctor/syntax_highlighter_test_should_not_crash_if_source_block_has_no_lines_and_source_highlighter_is_set.adoc
        // Expected: syntaxHighlighterTestShouldNotCrashIfSourceBlockHasNoLinesAndSourceHighlighterIsSet
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should highlight source inside AsciiDoc table cell if source-highlighter attribute is set`() {
        // Input: asciidoctor/syntax_highlighter_test_should_highlight_source_inside_ascii_doc_table_cell_if_source_highlighter_attribute_is_set.adoc
        // Expected: syntaxHighlighterTestShouldHighlightSourceInsideAsciiDocTableCellIfSourceHighlighterAttributeIsSet
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should set starting line number in DocBook output if linenums option is enabled and start attribute is set`() {
        // Input: asciidoctor/syntax_highlighter_test_should_set_starting_line_number_in_doc_book_output_if_linenums_option_is_enabled_and_start_attribute_is_set.adoc
        // Expected: syntaxHighlighterTestShouldSetStartingLineNumberInDocBookOutputIfLinenumsOptionIsEnabledAndStartAttributeIsSet
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should read source language from source-language document attribute if not specified on source block`() {
        // Input: asciidoctor/syntax_highlighter_test_should_read_source_language_from_source_language_document_attribute_if_not_specified_on_source_block.adoc
        // Expected: syntaxHighlighterTestShouldReadSourceLanguageFromSourceLanguageDocumentAttributeIfNotSpecifiedOnSourceBlock
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should rename document attribute named language to source-language when compat-mode is enabled`() {
        // Input: asciidoctor/syntax_highlighter_test_should_rename_document_attribute_named_language_to_source_language_when_compat_mode_is_enabled.adoc
        // Expected: syntaxHighlighterTestShouldRenameDocumentAttributeNamedLanguageToSourceLanguageWhenCompatModeIsEnabled
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should highlight source if source-highlighter attribute is set`() {
        // Input: asciidoctor/syntax_highlighter_test_should_highlight_source_if_source_highlighter_attribute_is_set.adoc
        // Expected: syntaxHighlighterTestShouldHighlightSourceIfSourceHighlighterAttributeIsSet
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not fail if source language is invalid`() {
        // Input: asciidoctor/syntax_highlighter_test_should_not_fail_if_source_language_is_invalid.adoc
        // Expected: syntaxHighlighterTestShouldNotFailIfSourceLanguageIsInvalid
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should number lines if third positional attribute is set`() {
        // Input: asciidoctor/syntax_highlighter_test_should_number_lines_if_third_positional_attribute_is_set.adoc
        // Expected: syntaxHighlighterTestShouldNumberLinesIfThirdPositionalAttributeIsSet
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should number lines if linenums option is set on source block`() {
        // Input: asciidoctor/syntax_highlighter_test_should_number_lines_if_linenums_option_is_set_on_source_block.adoc
        // Expected: syntaxHighlighterTestShouldNumberLinesIfLinenumsOptionIsSetOnSourceBlock
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should number lines of source block if source-linenums-option document attribute is set`() {
        // Input: asciidoctor/syntax_highlighter_test_should_number_lines_of_source_block_if_source_linenums_option_document_attribute_is_set.adoc
        // Expected: syntaxHighlighterTestShouldNumberLinesOfSourceBlockIfSourceLinenumsOptionDocumentAttributeIsSet
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should set starting line number in HTML output if linenums option is enabled and start attribute is set`() {
        // Input: asciidoctor/syntax_highlighter_test_should_set_starting_line_number_in_html_output_if_linenums_option_is_enabled_and_start_attribute_is_set.adoc
        // Expected: syntaxHighlighterTestShouldSetStartingLineNumberInHtmlOutputIfLinenumsOptionIsEnabledAndStartAttributeIsSet
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should replace callout marks but not highlight them if source-highlighter attribute is coderay`() {
        // Input: asciidoctor/syntax_highlighter_test_should_replace_callout_marks_but_not_highlight_them_if_source_highlighter_attribute_is_coderay.adoc
        // Expected: syntaxHighlighterTestShouldReplaceCalloutMarksButNotHighlightThemIfSourceHighlighterAttributeIsCoderay
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should support autonumbered callout marks if source-highlighter attribute is coderay`() {
        // Input: asciidoctor/syntax_highlighter_test_should_support_autonumbered_callout_marks_if_source_highlighter_attribute_is_coderay.adoc
        // Expected: syntaxHighlighterTestShouldSupportAutonumberedCalloutMarksIfSourceHighlighterAttributeIsCoderay
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should restore callout marks to correct lines if source highlighter is coderay and table line numbering is enabled`() {
        // Input: asciidoctor/syntax_highlighter_test_should_restore_callout_marks_to_correct_lines_if_source_highlighter_is_coderay_and_table_line_numbering_is_enabled.adoc
        // Expected: syntaxHighlighterTestShouldRestoreCalloutMarksToCorrectLinesIfSourceHighlighterIsCoderayAndTableLineNumberingIsEnabled
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should restore isolated callout mark on last line of source when source highlighter is coderay`() {
        // Input: asciidoctor/syntax_highlighter_test_should_restore_isolated_callout_mark_on_last_line_of_source_when_source_highlighter_is_coderay.adoc
        // Expected: syntaxHighlighterTestShouldRestoreIsolatedCalloutMarkOnLastLineOfSourceWhenSourceHighlighterIsCoderay
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should preserve passthrough placeholders when highlighting source using coderay`() {
        // Input: asciidoctor/syntax_highlighter_test_should_preserve_passthrough_placeholders_when_highlighting_source_using_coderay.adoc
        // Expected: syntaxHighlighterTestShouldPreservePassthroughPlaceholdersWhenHighlightingSourceUsingCoderay
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should link to CodeRay stylesheet if source-highlighter is coderay and linkcss is set`() {
        // Input: asciidoctor/syntax_highlighter_test_should_link_to_code_ray_stylesheet_if_source_highlighter_is_coderay_and_linkcss_is_set.adoc
        // Expected: syntaxHighlighterTestShouldLinkToCodeRayStylesheetIfSourceHighlighterIsCoderayAndLinkcssIsSet
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should highlight source inline if source-highlighter attribute is coderay and coderay-css is style`() {
        // Input: asciidoctor/syntax_highlighter_test_should_highlight_source_inline_if_source_highlighter_attribute_is_coderay_and_coderay_css_is_style.adoc
        // Expected: syntaxHighlighterTestShouldHighlightSourceInlineIfSourceHighlighterAttributeIsCoderayAndCoderayCssIsStyle
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should read stylesheet`() {
        // Input: asciidoctor/syntax_highlighter_test_should_read_stylesheet.adoc
        // Expected: syntaxHighlighterTestShouldReadStylesheet
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should include remote highlight_js assets if source-highlighter attribute is highlight_js`() {
        // Input: asciidoctor/syntax_highlighter_test_should_include_remote_highlight_js_assets_if_source_highlighter_attribute_is_highlight_js.adoc
        // Expected: syntaxHighlighterTestShouldIncludeRemoteHighlightJsAssetsIfSourceHighlighterAttributeIsHighlightJs
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should add language-none class to source block when source-highlighter is highlight_js and language is not set`() {
        // Input: asciidoctor/syntax_highlighter_test_should_add_language_none_class_to_source_block_when_source_highlighter_is_highlight_js_and_language_is_not_set.adoc
        // Expected: syntaxHighlighterTestShouldAddLanguageNoneClassToSourceBlockWhenSourceHighlighterIsHighlightJsAndLanguageIsNotSet
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should load additional languages specified by highlightjs-languages`() {
        // Input: asciidoctor/syntax_highlighter_test_should_load_additional_languages_specified_by_highlightjs_languages.adoc
        // Expected: syntaxHighlighterTestShouldLoadAdditionalLanguagesSpecifiedByHighlightjsLanguages
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should add language classes to child code element when source-highlighter is prettify`() {
        // Input: asciidoctor/syntax_highlighter_test_should_add_language_classes_to_child_code_element_when_source_highlighter_is_prettify.adoc
        // Expected: syntaxHighlighterTestShouldAddLanguageClassesToChildCodeElementWhenSourceHighlighterIsPrettify
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should set linenums start if linenums are enabled and start attribute is set when source-highlighter is prettify`() {
        // Input: asciidoctor/syntax_highlighter_test_should_set_linenums_start_if_linenums_are_enabled_and_start_attribute_is_set_when_source_highlighter_is_prettify.adoc
        // Expected: syntaxHighlighterTestShouldSetLinenumsStartIfLinenumsAreEnabledAndStartAttributeIsSetWhenSourceHighlighterIsPrettify
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should set lang attribute on pre when source-highlighter is html-pipeline`() {
        // Input: asciidoctor/syntax_highlighter_test_should_set_lang_attribute_on_pre_when_source_highlighter_is_html_pipeline.adoc
        // Expected: syntaxHighlighterTestShouldSetLangAttributeOnPreWhenSourceHighlighterIsHtmlPipeline
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should syntax highlight source if source-highlighter attribute is set`() {
        // Input: asciidoctor/syntax_highlighter_test_should_syntax_highlight_source_if_source_highlighter_attribute_is_set.adoc
        // Expected: syntaxHighlighterTestShouldSyntaxHighlightSourceIfSourceHighlighterAttributeIsSet
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should highlight source using a mixed lexer (HTML + JavaScript)`() {
        // Input: asciidoctor/syntax_highlighter_test_should_highlight_source_using_a_mixed_lexer_(html_+_java_script).adoc
        // Expected: syntaxHighlighterTestShouldHighlightSourceUsingAMixedLexerHtmlJavaScript
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should enable start_inline for PHP by default`() {
        // Input: asciidoctor/syntax_highlighter_test_should_enable_start_inline_for_php_by_default.adoc
        // Expected: syntaxHighlighterTestShouldEnableStartInlineForPhpByDefault
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not enable start_inline for PHP if disabled using cgi-style option on language`() {
        // Input: asciidoctor/syntax_highlighter_test_should_not_enable_start_inline_for_php_if_disabled_using_cgi_style_option_on_language.adoc
        // Expected: syntaxHighlighterTestShouldNotEnableStartInlineForPhpIfDisabledUsingCgiStyleOptionOnLanguage
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not enable start_inline for PHP if mixed option is set`() {
        // Input: asciidoctor/syntax_highlighter_test_should_not_enable_start_inline_for_php_if_mixed_option_is_set.adoc
        // Expected: syntaxHighlighterTestShouldNotEnableStartInlineForPhpIfMixedOptionIsSet
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not crash if source-highlighter attribute is set and source block does not define a language`() {
        // Input: asciidoctor/syntax_highlighter_test_should_not_crash_if_source_highlighter_attribute_is_set_and_source_block_does_not_define_a_language.adoc
        // Expected: syntaxHighlighterTestShouldNotCrashIfSourceHighlighterAttributeIsSetAndSourceBlockDoesNotDefineALanguage
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should default to plain text lexer if lexer cannot be resolved for language`() {
        // Input: asciidoctor/syntax_highlighter_test_should_default_to_plain_text_lexer_if_lexer_cannot_be_resolved_for_language.adoc
        // Expected: syntaxHighlighterTestShouldDefaultToPlainTextLexerIfLexerCannotBeResolvedForLanguage
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should number lines using table layout if linenums option is enabled and linenums mode is not set`() {
        // Input: asciidoctor/syntax_highlighter_test_should_number_lines_using_table_layout_if_linenums_option_is_enabled_and_linenums_mode_is_not_set.adoc
        // Expected: syntaxHighlighterTestShouldNumberLinesUsingTableLayoutIfLinenumsOptionIsEnabledAndLinenumsModeIsNotSet
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should number lines using inline element if linenums option is enabled and linenums mode is inline`() {
        // Input: asciidoctor/syntax_highlighter_test_should_number_lines_using_inline_element_if_linenums_option_is_enabled_and_linenums_mode_is_inline.adoc
        // Expected: syntaxHighlighterTestShouldNumberLinesUsingInlineElementIfLinenumsOptionIsEnabledAndLinenumsModeIsInline
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should gracefully fallback to default style if specified style not recognized`() {
        // Input: asciidoctor/syntax_highlighter_test_should_gracefully_fallback_to_default_style_if_specified_style_not_recognized.adoc
        // Expected: syntaxHighlighterTestShouldGracefullyFallbackToDefaultStyleIfSpecifiedStyleNotRecognized
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should restore isolated callout mark on last line of source`() {
        // Input: asciidoctor/syntax_highlighter_test_should_restore_isolated_callout_mark_on_last_line_of_source.adoc
        // Expected: syntaxHighlighterTestShouldRestoreIsolatedCalloutMarkOnLastLineOfSource
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should number all lines when isolated callout mark is on last line of source and starting line number is set`() {
        // Input: asciidoctor/syntax_highlighter_test_should_number_all_lines_when_isolated_callout_mark_is_on_last_line_of_source_and_starting_line_number_is_set.adoc
        // Expected: syntaxHighlighterTestShouldNumberAllLinesWhenIsolatedCalloutMarkIsOnLastLineOfSourceAndStartingLineNumberIsSet
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should preserve guard in front of callout if icons are not enabled`() {
        // Input: asciidoctor/syntax_highlighter_test_should_preserve_guard_in_front_of_callout_if_icons_are_not_enabled.adoc
        // Expected: syntaxHighlighterTestShouldPreserveGuardInFrontOfCalloutIfIconsAreNotEnabled
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should preserve guard around callout if icons are not enabled`() {
        // Input: asciidoctor/syntax_highlighter_test_should_preserve_guard_around_callout_if_icons_are_not_enabled.adoc
        // Expected: syntaxHighlighterTestShouldPreserveGuardAroundCalloutIfIconsAreNotEnabled
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should read stylesheet for specified style`() {
        // Input: asciidoctor/syntax_highlighter_test_should_read_stylesheet_for_specified_style.adoc
        // Expected: syntaxHighlighterTestShouldReadStylesheetForSpecifiedStyle
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should embed stylesheet for pygments style`() {
        // Input: asciidoctor/syntax_highlighter_test_should_embed_stylesheet_for_pygments_style.adoc
        // Expected: syntaxHighlighterTestShouldEmbedStylesheetForPygmentsStyle
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should restore callout marks to correct lines if table line numbering is enabled`() {
        // Input: asciidoctor/syntax_highlighter_test_should_restore_callout_marks_to_correct_lines_if_table_line_numbering_is_enabled.adoc
        // Expected: syntaxHighlighterTestShouldRestoreCalloutMarksToCorrectLinesIfTableLineNumberingIsEnabled
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not hardcode inline styles on lineno div and pre elements when linenums are enabled in table mode`() {
        // Input: asciidoctor/syntax_highlighter_test_should_not_hardcode_inline_styles_on_lineno_div_and_pre_elements_when_linenums_are_enabled_in_table_mode.adoc
        // Expected: syntaxHighlighterTestShouldNotHardcodeInlineStylesOnLinenoDivAndPreElementsWhenLinenumsAreEnabledInTableMode
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should line highlight specified lines`() {
        // Input: asciidoctor/syntax_highlighter_test_should_line_highlight_specified_lines.adoc
        // Expected: syntaxHighlighterTestShouldLineHighlightSpecifiedLines
    }

}
