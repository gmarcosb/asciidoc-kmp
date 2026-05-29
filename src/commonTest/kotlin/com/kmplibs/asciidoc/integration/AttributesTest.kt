package com.kmplibs.asciidoc.integration

import kotlin.test.Test
import kotlin.test.Ignore

class AttributesTest {

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `creates an attribute by fusing a legacy multi-line value`() {
        // Input: asciidoctor/attributes_test_creates_an_attribute_by_fusing_a_legacy_multi_line_value.adoc
        // Expected: attributesTestCreatesAnAttributeByFusingALegacyMultiLineValue
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `creates an attribute by fusing a multi-line value`() {
        // Input: asciidoctor/attributes_test_creates_an_attribute_by_fusing_a_multi_line_value.adoc
        // Expected: attributesTestCreatesAnAttributeByFusingAMultiLineValue
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `honors line break characters in multi-line values`() {
        // Input: asciidoctor/attributes_test_honors_line_break_characters_in_multi_line_values.adoc
        // Expected: attributesTestHonorsLineBreakCharactersInMultiLineValues
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should allow pass macro to surround a multi-line value that contains line breaks`() {
        // Input: asciidoctor/attributes_test_should_allow_pass_macro_to_surround_a_multi_line_value_that_contains_line_breaks.adoc
        // Expected: attributesTestShouldAllowPassMacroToSurroundAMultiLineValueThatContainsLineBreaks
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `performs attribute substitution on attribute value`() {
        // Input: asciidoctor/attributes_test_performs_attribute_substitution_on_attribute_value.adoc
        // Expected: attributesTestPerformsAttributeSubstitutionOnAttributeValue
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `resolves attributes inside attribute value within header`() {
        // Input: asciidoctor/attributes_test_resolves_attributes_inside_attribute_value_within_header.adoc
        // Expected: attributesTestResolvesAttributesInsideAttributeValueWithinHeader
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `resolves attributes and pass macro inside attribute value outside header`() {
        // Input: asciidoctor/attributes_test_resolves_attributes_and_pass_macro_inside_attribute_value_outside_header.adoc
        // Expected: attributesTestResolvesAttributesAndPassMacroInsideAttributeValueOutsideHeader
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should handle multibyte characters when limiting attribute value size`() {
        // Input: asciidoctor/attributes_test_should_handle_multibyte_characters_when_limiting_attribute_value_size.adoc
        // Expected: attributesTestShouldHandleMultibyteCharactersWhenLimitingAttributeValueSize
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not mangle multibyte characters when limiting attribute value size`() {
        // Input: asciidoctor/attributes_test_should_not_mangle_multibyte_characters_when_limiting_attribute_value_size.adoc
        // Expected: attributesTestShouldNotMangleMultibyteCharactersWhenLimitingAttributeValueSize
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `resolves user-home attribute if safe mode is less than SERVER`() {
        // Input: asciidoctor/attributes_test_resolves_user_home_attribute_if_safe_mode_is_less_than_server.adoc
        // Expected: attributesTestResolvesUserHomeAttributeIfSafeModeIsLessThanServer
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `user-home attribute resolves to _ if safe mode is SERVER or greater`() {
        // Input: asciidoctor/attributes_test_user_home_attribute_resolves_to___if_safe_mode_is_server_or_greater.adoc
        // Expected: attributesTestUserHomeAttributeResolvesToIfSafeModeIsServerOrGreater
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `user-home attribute can be overridden by API if safe mode is less than SERVER`() {
        // Input: asciidoctor/attributes_test_user_home_attribute_can_be_overridden_by_api_if_safe_mode_is_less_than_server.adoc
        // Expected: attributesTestUserHomeAttributeCanBeOverriddenByApiIfSafeModeIsLessThanServer
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `user-home attribute can be overridden by API if safe mode is SERVER or greater`() {
        // Input: asciidoctor/attributes_test_user_home_attribute_can_be_overridden_by_api_if_safe_mode_is_server_or_greater.adoc
        // Expected: attributesTestUserHomeAttributeCanBeOverriddenByApiIfSafeModeIsServerOrGreater
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not recognize pass macro with invalid substitution list in attribute value`() {
        // Input: asciidoctor/attributes_test_should_not_recognize_pass_macro_with_invalid_substitution_list_in_attribute_value.adoc
        // Expected: attributesTestShouldNotRecognizePassMacroWithInvalidSubstitutionListInAttributeValue
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `attribute set via API overrides attribute set in document`() {
        // Input: asciidoctor/attributes_test_attribute_set_via_api_overrides_attribute_set_in_document.adoc
        // Expected: attributesTestAttributeSetViaApiOverridesAttributeSetInDocument
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `backend and doctype attributes are set by default in custom configuration`() {
        // Input: asciidoctor/attributes_test_backend_and_doctype_attributes_are_set_by_default_in_custom_configuration.adoc
        // Expected: attributesTestBackendAndDoctypeAttributesAreSetByDefaultInCustomConfiguration
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `backend attributes are updated if backend attribute is defined in document and safe mode is less than SERVER`() {
        // Input: asciidoctor/attributes_test_backend_attributes_are_updated_if_backend_attribute_is_defined_in_document_and_safe_mode_is_less_than_server.adoc
        // Expected: attributesTestBackendAttributesAreUpdatedIfBackendAttributeIsDefinedInDocumentAndSafeModeIsLessThanServer
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `backend attributes defined in document options overrides backend attribute in document`() {
        // Input: asciidoctor/attributes_test_backend_attributes_defined_in_document_options_overrides_backend_attribute_in_document.adoc
        // Expected: attributesTestBackendAttributesDefinedInDocumentOptionsOverridesBackendAttributeInDocument
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `set_attribute should set attribute if key is not locked`() {
        // Input: asciidoctor/attributes_test_set_attribute_should_set_attribute_if_key_is_not_locked.adoc
        // Expected: attributesTestSetAttributeShouldSetAttributeIfKeyIsNotLocked
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `convert properly with simple names`() {
        // Input: asciidoctor/attributes_test_convert_properly_with_simple_names.adoc
        // Expected: attributesTestConvertProperlyWithSimpleNames
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `convert properly with single character name`() {
        // Input: asciidoctor/attributes_test_convert_properly_with_single_character_name.adoc
        // Expected: attributesTestConvertProperlyWithSingleCharacterName
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `ignores lines with bad attributes if attribute-missing is drop-line`() {
        // Input: asciidoctor/attributes_test_ignores_lines_with_bad_attributes_if_attribute_missing_is_drop_line.adoc
        // Expected: attributesTestIgnoresLinesWithBadAttributesIfAttributeMissingIsDropLine
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `attribute value gets interpreted when converting`() {
        // Input: asciidoctor/attributes_test_attribute_value_gets_interpreted_when_converting.adoc
        // Expected: attributesTestAttributeValueGetsInterpretedWhenConverting
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not drop line with reference to missing attribute by default`() {
        // Input: asciidoctor/attributes_test_should_not_drop_line_with_reference_to_missing_attribute_by_default.adoc
        // Expected: attributesTestShouldNotDropLineWithReferenceToMissingAttributeByDefault
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should drop line with attribute unassignment by default`() {
        // Input: asciidoctor/attributes_test_should_drop_line_with_attribute_unassignment_by_default.adoc
        // Expected: attributesTestShouldDropLineWithAttributeUnassignmentByDefault
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not drop line with attribute unassignment if attribute-undefined is drop`() {
        // Input: asciidoctor/attributes_test_should_not_drop_line_with_attribute_unassignment_if_attribute_undefined_is_drop.adoc
        // Expected: attributesTestShouldNotDropLineWithAttributeUnassignmentIfAttributeUndefinedIsDrop
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should drop line that only contains attribute assignment`() {
        // Input: asciidoctor/attributes_test_should_drop_line_that_only_contains_attribute_assignment.adoc
        // Expected: attributesTestShouldDropLineThatOnlyContainsAttributeAssignment
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should drop line that only contains unresolved attribute when attribute-missing is drop`() {
        // Input: asciidoctor/attributes_test_should_drop_line_that_only_contains_unresolved_attribute_when_attribute_missing_is_drop.adoc
        // Expected: attributesTestShouldDropLineThatOnlyContainsUnresolvedAttributeWhenAttributeMissingIsDrop
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `substitutes inside unordered list items`() {
        // Input: asciidoctor/attributes_test_substitutes_inside_unordered_list_items.adoc
        // Expected: attributesTestSubstitutesInsideUnorderedListItems
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `interpolates author attribute inside attribute entry in header`() {
        // Input: asciidoctor/attributes_test_interpolates_author_attribute_inside_attribute_entry_in_header.adoc
        // Expected: attributesTestInterpolatesAuthorAttributeInsideAttributeEntryInHeader
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `interpolates revinfo attribute inside attribute entry in header`() {
        // Input: asciidoctor/attributes_test_interpolates_revinfo_attribute_inside_attribute_entry_in_header.adoc
        // Expected: attributesTestInterpolatesRevinfoAttributeInsideAttributeEntryInHeader
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `attribute entries can resolve previously defined attributes`() {
        // Input: asciidoctor/attributes_test_attribute_entries_can_resolve_previously_defined_attributes.adoc
        // Expected: attributesTestAttributeEntriesCanResolvePreviouslyDefinedAttributes
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should warn if unterminated block comment is detected in document header`() {
        // Input: asciidoctor/attributes_test_should_warn_if_unterminated_block_comment_is_detected_in_document_header.adoc
        // Expected: attributesTestShouldWarnIfUnterminatedBlockCommentIsDetectedInDocumentHeader
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `substitutes inside block title`() {
        // Input: asciidoctor/attributes_test_substitutes_inside_block_title.adoc
        // Expected: attributesTestSubstitutesInsideBlockTitle
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `sets attribute until it is deleted`() {
        // Input: asciidoctor/attributes_test_sets_attribute_until_it_is_deleted.adoc
        // Expected: attributesTestSetsAttributeUntilItIsDeleted
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should allow compat-mode to be set and unset in middle of document`() {
        // Input: asciidoctor/attributes_test_should_allow_compat_mode_to_be_set_and_unset_in_middle_of_document.adoc
        // Expected: attributesTestShouldAllowCompatModeToBeSetAndUnsetInMiddleOfDocument
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `does not disturb attribute-looking things escaped with backslash`() {
        // Input: asciidoctor/attributes_test_does_not_disturb_attribute_looking_things_escaped_with_backslash.adoc
        // Expected: attributesTestDoesNotDisturbAttributeLookingThingsEscapedWithBackslash
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `does not substitute attributes inside literal blocks`() {
        // Input: asciidoctor/attributes_test_does_not_substitute_attributes_inside_literal_blocks.adoc
        // Expected: attributesTestDoesNotSubstituteAttributesInsideLiteralBlocks
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `does not show docdir and shows relative docfile if safe mode is SERVER or greater`() {
        // Input: asciidoctor/attributes_test_does_not_show_docdir_and_shows_relative_docfile_if_safe_mode_is_server_or_greater.adoc
        // Expected: attributesTestDoesNotShowDocdirAndShowsRelativeDocfileIfSafeModeIsServerOrGreater
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `shows absolute docdir and docfile paths if safe mode is less than SERVER`() {
        // Input: asciidoctor/attributes_test_shows_absolute_docdir_and_docfile_paths_if_safe_mode_is_less_than_server.adoc
        // Expected: attributesTestShowsAbsoluteDocdirAndDocfilePathsIfSafeModeIsLessThanServer
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `assigns attribute defined in attribute reference with set prefix and value`() {
        // Input: asciidoctor/attributes_test_assigns_attribute_defined_in_attribute_reference_with_set_prefix_and_value.adoc
        // Expected: attributesTestAssignsAttributeDefinedInAttributeReferenceWithSetPrefixAndValue
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `creates counter`() {
        // Input: asciidoctor/attributes_test_creates_counter.adoc
        // Expected: attributesTestCreatesCounter
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `can seed counter to start at A`() {
        // Input: asciidoctor/attributes_test_can_seed_counter_to_start_at_a.adoc
        // Expected: attributesTestCanSeedCounterToStartAtA
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `increments counter with positive numeric value`() {
        // Input: asciidoctor/attributes_test_increments_counter_with_positive_numeric_value.adoc
        // Expected: attributesTestIncrementsCounterWithPositiveNumericValue
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `increments counter with negative numeric value`() {
        // Input: asciidoctor/attributes_test_increments_counter_with_negative_numeric_value.adoc
        // Expected: attributesTestIncrementsCounterWithNegativeNumericValue
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `increments counter with ASCII character value`() {
        // Input: asciidoctor/attributes_test_increments_counter_with_ascii_character_value.adoc
        // Expected: attributesTestIncrementsCounterWithAsciiCharacterValue
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `increments counter with non-ASCII character value`() {
        // Input: asciidoctor/attributes_test_increments_counter_with_non_ascii_character_value.adoc
        // Expected: attributesTestIncrementsCounterWithNonAsciiCharacterValue
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `increments counter with emoji character value`() {
        // Input: asciidoctor/attributes_test_increments_counter_with_emoji_character_value.adoc
        // Expected: attributesTestIncrementsCounterWithEmojiCharacterValue
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `increments counter with multi-character value`() {
        // Input: asciidoctor/attributes_test_increments_counter_with_multi_character_value.adoc
        // Expected: attributesTestIncrementsCounterWithMultiCharacterValue
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `counter uses 0 as seed value if seed attribute is nil`() {
        // Input: asciidoctor/attributes_test_counter_uses_0_as_seed_value_if_seed_attribute_is_nil.adoc
        // Expected: attributesTestCounterUses0AsSeedValueIfSeedAttributeIsNil
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `counter value can be reset by attribute entry`() {
        // Input: asciidoctor/attributes_test_counter_value_can_be_reset_by_attribute_entry.adoc
        // Expected: attributesTestCounterValueCanBeResetByAttributeEntry
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `counter value can be advanced by attribute entry`() {
        // Input: asciidoctor/attributes_test_counter_value_can_be_advanced_by_attribute_entry.adoc
        // Expected: attributesTestCounterValueCanBeAdvancedByAttributeEntry
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `nested document should use counter from parent document`() {
        // Input: asciidoctor/attributes_test_nested_document_should_use_counter_from_parent_document.adoc
        // Expected: attributesTestNestedDocumentShouldUseCounterFromParentDocument
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not allow counter to modify locked attribute`() {
        // Input: asciidoctor/attributes_test_should_not_allow_counter_to_modify_locked_attribute.adoc
        // Expected: attributesTestShouldNotAllowCounterToModifyLockedAttribute
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not allow counter2 to modify locked attribute`() {
        // Input: asciidoctor/attributes_test_should_not_allow_counter_2_to_modify_locked_attribute.adoc
        // Expected: attributesTestShouldNotAllowCounter2ToModifyLockedAttribute
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not allow counter to modify built-in locked attribute`() {
        // Input: asciidoctor/attributes_test_should_not_allow_counter_to_modify_built_in_locked_attribute.adoc
        // Expected: attributesTestShouldNotAllowCounterToModifyBuiltInLockedAttribute
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should not allow counter2 to modify built-in locked attribute`() {
        // Input: asciidoctor/attributes_test_should_not_allow_counter_2_to_modify_built_in_locked_attribute.adoc
        // Expected: attributesTestShouldNotAllowCounter2ToModifyBuiltInLockedAttribute
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `parses named attribute with valid name`() {
        // Input: asciidoctor/attributes_test_parses_named_attribute_with_valid_name.adoc
        // Expected: attributesTestParsesNamedAttributeWithValidName
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `does not parse named attribute if name is invalid`() {
        // Input: asciidoctor/attributes_test_does_not_parse_named_attribute_if_name_is_invalid.adoc
        // Expected: attributesTestDoesNotParseNamedAttributeIfNameIsInvalid
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `positional attributes assigned to block`() {
        // Input: asciidoctor/attributes_test_positional_attributes_assigned_to_block.adoc
        // Expected: attributesTestPositionalAttributesAssignedToBlock
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `normal substitutions are performed on single-quoted positional attribute`() {
        // Input: asciidoctor/attributes_test_normal_substitutions_are_performed_on_single_quoted_positional_attribute.adoc
        // Expected: attributesTestNormalSubstitutionsArePerformedOnSingleQuotedPositionalAttribute
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `normal substitutions are performed on single-quoted named attribute`() {
        // Input: asciidoctor/attributes_test_normal_substitutions_are_performed_on_single_quoted_named_attribute.adoc
        // Expected: attributesTestNormalSubstitutionsArePerformedOnSingleQuotedNamedAttribute
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `normal substitutions are performed once on single-quoted named title attribute`() {
        // Input: asciidoctor/attributes_test_normal_substitutions_are_performed_once_on_single_quoted_named_title_attribute.adoc
        // Expected: attributesTestNormalSubstitutionsArePerformedOnceOnSingleQuotedNamedTitleAttribute
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `attribute list may not begin with space`() {
        // Input: asciidoctor/attributes_test_attribute_list_may_not_begin_with_space.adoc
        // Expected: attributesTestAttributeListMayNotBeginWithSpace
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `attribute list may begin with comma`() {
        // Input: asciidoctor/attributes_test_attribute_list_may_begin_with_comma.adoc
        // Expected: attributesTestAttributeListMayBeginWithComma
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `first attribute in list may be double quoted`() {
        // Input: asciidoctor/attributes_test_first_attribute_in_list_may_be_double_quoted.adoc
        // Expected: attributesTestFirstAttributeInListMayBeDoubleQuoted
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `first attribute in list may be single quoted`() {
        // Input: asciidoctor/attributes_test_first_attribute_in_list_may_be_single_quoted.adoc
        // Expected: attributesTestFirstAttributeInListMayBeSingleQuoted
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `attribute with value None without quotes is ignored`() {
        // Input: asciidoctor/attributes_test_attribute_with_value_none_without_quotes_is_ignored.adoc
        // Expected: attributesTestAttributeWithValueNoneWithoutQuotesIsIgnored
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `role? returns true if role is assigned`() {
        // Input: asciidoctor/attributes_test_role_returns_true_if_role_is_assigned.adoc
        // Expected: attributesTestRoleReturnsTrueIfRoleIsAssigned
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `role? does not return true if role attribute is set on document`() {
        // Input: asciidoctor/attributes_test_role_does_not_return_true_if_role_attribute_is_set_on_document.adoc
        // Expected: attributesTestRoleDoesNotReturnTrueIfRoleAttributeIsSetOnDocument
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `role? can check for exact role name match`() {
        // Input: asciidoctor/attributes_test_role_can_check_for_exact_role_name_match.adoc
        // Expected: attributesTestRoleCanCheckForExactRoleNameMatch
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `has_role? can check for presence of role name`() {
        // Input: asciidoctor/attributes_test_has_role_can_check_for_presence_of_role_name.adoc
        // Expected: attributesTestHasRoleCanCheckForPresenceOfRoleName
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `has_role? does not look for role defined as document attribute`() {
        // Input: asciidoctor/attributes_test_has_role_does_not_look_for_role_defined_as_document_attribute.adoc
        // Expected: attributesTestHasRoleDoesNotLookForRoleDefinedAsDocumentAttribute
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `roles returns array of role names`() {
        // Input: asciidoctor/attributes_test_roles_returns_array_of_role_names.adoc
        // Expected: attributesTestRolesReturnsArrayOfRoleNames
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `roles returns empty array if role attribute is not set`() {
        // Input: asciidoctor/attributes_test_roles_returns_empty_array_if_role_attribute_is_not_set.adoc
        // Expected: attributesTestRolesReturnsEmptyArrayIfRoleAttributeIsNotSet
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `roles= sets the role attribute on the node`() {
        // Input: asciidoctor/attributes_test_roles=_sets_the_role_attribute_on_the_node.adoc
        // Expected: attributesTestRolesSetsTheRoleAttributeOnTheNode
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `id, role and options attributes can be specified on block style using shorthand syntax`() {
        // Input: asciidoctor/attributes_test_id_role_and_options_attributes_can_be_specified_on_block_style_using_shorthand_syntax.adoc
        // Expected: attributesTestIdRoleAndOptionsAttributesCanBeSpecifiedOnBlockStyleUsingShorthandSyntax
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `id, role and options attributes can be specified using shorthand syntax on block style using multiple block attribute lines`() {
        // Input: asciidoctor/attributes_test_id_role_and_options_attributes_can_be_specified_using_shorthand_syntax_on_block_style_using_multiple_block_attribute_lines.adoc
        // Expected: attributesTestIdRoleAndOptionsAttributesCanBeSpecifiedUsingShorthandSyntaxOnBlockStyleUsingMultipleBlockAttributeLines
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `multiple roles and options can be specified in block style using shorthand syntax`() {
        // Input: asciidoctor/attributes_test_multiple_roles_and_options_can_be_specified_in_block_style_using_shorthand_syntax.adoc
        // Expected: attributesTestMultipleRolesAndOptionsCanBeSpecifiedInBlockStyleUsingShorthandSyntax
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `options specified using shorthand syntax on block style across multiple lines should be additive`() {
        // Input: asciidoctor/attributes_test_options_specified_using_shorthand_syntax_on_block_style_across_multiple_lines_should_be_additive.adoc
        // Expected: attributesTestOptionsSpecifiedUsingShorthandSyntaxOnBlockStyleAcrossMultipleLinesShouldBeAdditive
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `roles specified using shorthand syntax on block style across multiple lines should be additive`() {
        // Input: asciidoctor/attributes_test_roles_specified_using_shorthand_syntax_on_block_style_across_multiple_lines_should_be_additive.adoc
        // Expected: attributesTestRolesSpecifiedUsingShorthandSyntaxOnBlockStyleAcrossMultipleLinesShouldBeAdditive
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `setting a role using the role attribute replaces any existing roles`() {
        // Input: asciidoctor/attributes_test_setting_a_role_using_the_role_attribute_replaces_any_existing_roles.adoc
        // Expected: attributesTestSettingARoleUsingTheRoleAttributeReplacesAnyExistingRoles
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `setting a role using the shorthand syntax on block style should not clear the ID`() {
        // Input: asciidoctor/attributes_test_setting_a_role_using_the_shorthand_syntax_on_block_style_should_not_clear_the_id.adoc
        // Expected: attributesTestSettingARoleUsingTheShorthandSyntaxOnBlockStyleShouldNotClearTheId
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `a role can be added using add_role when the node has no roles`() {
        // Input: asciidoctor/attributes_test_a_role_can_be_added_using_add_role_when_the_node_has_no_roles.adoc
        // Expected: attributesTestARoleCanBeAddedUsingAddRoleWhenTheNodeHasNoRoles
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `a role is not added using add_role if the node already has that role`() {
        // Input: asciidoctor/attributes_test_a_role_is_not_added_using_add_role_if_the_node_already_has_that_role.adoc
        // Expected: attributesTestARoleIsNotAddedUsingAddRoleIfTheNodeAlreadyHasThatRole
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `an existing role can be removed using remove_role`() {
        // Input: asciidoctor/attributes_test_an_existing_role_can_be_removed_using_remove_role.adoc
        // Expected: attributesTestAnExistingRoleCanBeRemovedUsingRemoveRole
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `roles are removed when last role is removed using remove_role`() {
        // Input: asciidoctor/attributes_test_roles_are_removed_when_last_role_is_removed_using_remove_role.adoc
        // Expected: attributesTestRolesAreRemovedWhenLastRoleIsRemovedUsingRemoveRole
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `roles are not changed when a non-existent role is removed using remove_role`() {
        // Input: asciidoctor/attributes_test_roles_are_not_changed_when_a_non_existent_role_is_removed_using_remove_role.adoc
        // Expected: attributesTestRolesAreNotChangedWhenANonExistentRoleIsRemovedUsingRemoveRole
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `roles are not changed when using remove_role if the node has no roles`() {
        // Input: asciidoctor/attributes_test_roles_are_not_changed_when_using_remove_role_if_the_node_has_no_roles.adoc
        // Expected: attributesTestRolesAreNotChangedWhenUsingRemoveRoleIfTheNodeHasNoRoles
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `id and role attributes can be specified on section style using shorthand syntax`() {
        // Input: asciidoctor/attributes_test_id_and_role_attributes_can_be_specified_on_section_style_using_shorthand_syntax.adoc
        // Expected: attributesTestIdAndRoleAttributesCanBeSpecifiedOnSectionStyleUsingShorthandSyntax
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `id attribute specified using shorthand syntax should not create a special section`() {
        // Input: asciidoctor/attributes_test_id_attribute_specified_using_shorthand_syntax_should_not_create_a_special_section.adoc
        // Expected: attributesTestIdAttributeSpecifiedUsingShorthandSyntaxShouldNotCreateASpecialSection
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `Block attributes are additive`() {
        // Input: asciidoctor/attributes_test_block_attributes_are_additive.adoc
        // Expected: attributesTestBlockAttributesAreAdditive
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `Last wins for id attribute`() {
        // Input: asciidoctor/attributes_test_last_wins_for_id_attribute.adoc
        // Expected: attributesTestLastWinsForIdAttribute
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `trailing block attributes transfer to the following section`() {
        // Input: asciidoctor/attributes_test_trailing_block_attributes_transfer_to_the_following_section.adoc
        // Expected: attributesTestTrailingBlockAttributesTransferToTheFollowingSection
    }

}
