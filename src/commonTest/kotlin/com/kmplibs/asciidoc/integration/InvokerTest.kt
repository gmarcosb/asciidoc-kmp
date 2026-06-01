package com.kmplibs.asciidoc.integration

import com.kmplibs.asciidoc.*
import kotlin.test.Test
import kotlin.test.Ignore

class InvokerTest {

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should allow Options to be passed as first argument of constructor`() {
        // Input: asciidoctor/invoker_test_should_allow_options_to_be_passed_as_first_argument_of_constructor.adoc
        // Expected Go AST:
        // var invokerTestShouldAllowOptionsToBePassedAsFirstArgumentOfConstructor =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "second",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "2.",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "third",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "3.",
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should change level on logger when --log-level is specified`() {
        // Input: asciidoctor/invoker_test_should_change_level_on_logger_when___log_level_is_specified.adoc
        // Expected Go AST:
        // var invokerTestShouldChangeLevelOnLoggerWhenLogLevelIsSpecified =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "skip to ",
        // 		},
        // 		&asciidoc.CrossReference{
        // 			AttributeList: nil,
        // 			Elements:      nil,
        // 			ID: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "install",
        // 				},
        // 			},
        // 			Format: 0,
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "download",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        ".",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "install",
        // 				},
        // 				&asciidoc.Anchor{
        // 					ID: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "install",
        // 						},
        // 					},
        // 					Elements: nil,
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        ".",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "run",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        ".",
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not log when --log-level and -q are both specified`() {
        // Input: asciidoctor/invoker_test_should_not_log_when___log_level_and__q_are_both_specified.adoc
        // Expected Go AST:
        // var invokerTestShouldNotLogWhenLogLevelAndQAreBothSpecified =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "skip to ",
        // 		},
        // 		&asciidoc.CrossReference{
        // 			AttributeList: nil,
        // 			Elements:      nil,
        // 			ID: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "install",
        // 				},
        // 			},
        // 			Format: 0,
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "download",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        ".",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "install",
        // 				},
        // 				&asciidoc.Anchor{
        // 					ID: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "install",
        // 						},
        // 					},
        // 					Elements: nil,
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        ".",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "run",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        ".",
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should use specified log level when --log-level and -v are both specified`() {
        // Input: asciidoctor/invoker_test_should_use_specified_log_level_when___log_level_and__v_are_both_specified.adoc
        // Expected Go AST:
        // var invokerTestShouldUseSpecifiedLogLevelWhenLogLevelAndVAreBothSpecified =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "skip to ",
        // 		},
        // 		&asciidoc.CrossReference{
        // 			AttributeList: nil,
        // 			Elements:      nil,
        // 			ID: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "install",
        // 				},
        // 			},
        // 			Format: 0,
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "download",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        ".",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "install",
        // 				},
        // 				&asciidoc.Anchor{
        // 					ID: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "install",
        // 						},
        // 					},
        // 					Elements: nil,
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        ".",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "run",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        ".",
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should enable script warnings if -w flag is specified`() {
        // Input: asciidoctor/invoker_test_should_enable_script_warnings_if__w_flag_is_specified.adoc
        // Expected Go AST:
        // var invokerTestShouldEnableScriptWarningsIfWFlagIsSpecified =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "second",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "2.",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "third",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "3.",
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not fail to check log level when -q flag is specified`() {
        // Input: asciidoctor/invoker_test_should_not_fail_to_check_log_level_when__q_flag_is_specified.adoc
        // Expected Go AST:
        // var invokerTestShouldNotFailToCheckLogLevelWhenQFlagIsSpecified =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "skip to ",
        // 		},
        // 		&asciidoc.CrossReference{
        // 			AttributeList: nil,
        // 			Elements:      nil,
        // 			ID: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "install",
        // 				},
        // 			},
        // 			Format: 0,
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "download",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        ".",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "install",
        // 				},
        // 				&asciidoc.Anchor{
        // 					ID: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "install",
        // 						},
        // 					},
        // 					Elements: nil,
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        ".",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "run",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        ".",
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should return non-zero exit code if failure level is reached`() {
        // Input: asciidoctor/invoker_test_should_return_non_zero_exit_code_if_failure_level_is_reached.adoc
        // Expected Go AST:
        // var invokerTestShouldReturnNonZeroExitCodeIfFailureLevelIsReached =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "second",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "2.",
        // 		},
        // 		&asciidoc.OrderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "third",
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "3.",
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should report usage if no input file given`() {
        // Input: asciidoctor/invoker_test_should_report_usage_if_no_input_file_given.adoc
        // Expected Go AST:
        // var invokerTestShouldReportUsageIfNoInputFileGiven =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Section{
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Andrew Stanton",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "v1.0.0",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.AttributeEntry{
        // 					Name: "doctype",
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "manpage",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.AttributeEntry{
        // 					Name: "manmanual",
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "EVE",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.AttributeEntry{
        // 					Name: "mansource",
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "EVE",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.Section{
        // 					AttributeList: nil,
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.EmptyLine{
        // 							Text: "",
        // 						},
        // 						&asciidoc.String{
        // 							Value: "eve, islifeform - analyzes an image to determine if it's a picture of a life form",
        // 						},
        // 						&asciidoc.NewLine{},
        // 						&asciidoc.EmptyLine{
        // 							Text: "",
        // 						},
        // 					},
        // 					Title: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "NAME",
        // 						},
        // 					},
        // 					Level: 1,
        // 				},
        // 				&asciidoc.Section{
        // 					AttributeList: nil,
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.EmptyLine{
        // 							Text: "",
        // 						},
        // 						&asciidoc.Bold{
        // 							AttributeList: nil,
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "eve",
        // 								},
        // 							},
        // 						},
        // 						&asciidoc.String{
        // 							Value: " ['OPTION']... 'FILE'...",
        // 						},
        // 						&asciidoc.NewLine{},
        // 					},
        // 					Title: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "SYNOPSIS",
        // 						},
        // 					},
        // 					Level: 1,
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "eve(1)",
        // 				},
        // 			},
        // 			Level: 0,
        // 		},
        // 	},
        // }
    }

}
