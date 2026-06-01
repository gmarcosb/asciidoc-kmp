package com.kmplibs.asciidoc.integration

import com.kmplibs.asciidoc.*
import kotlin.test.Test
import kotlin.test.Ignore

class TablesTest {

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `converts simple psv table`() {
        // Input: asciidoctor/tables_test_converts_simple_psv_table.adoc
        // Expected Go AST:
        // var tablesTestConvertsSimplePsvTable =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: nil,
        // 			ColumnCount:   3,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "A",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "B",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "C",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "a",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "b",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "c",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "2",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "3",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should add direction CSS class if float attribute is set on table`() {
        // Input: asciidoctor/tables_test_should_add_direction_css_class_if_float_attribute_is_set_on_table.adoc
        // Expected Go AST:
        // var tablesTestShouldAddDirectionCssClassIfFloatAttributeIsSetOnTable =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.NamedAttribute{
        // 					Name: "float",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "left",
        // 						},
        // 					},
        // 					Quote: 0,
        // 				},
        // 			},
        // 			ColumnCount: 3,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "A",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "B",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "C",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "a",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "b",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "c",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "2",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "3",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should set stripes class if stripes option is set`() {
        // Input: asciidoctor/tables_test_should_set_stripes_class_if_stripes_option_is_set.adoc
        // Expected Go AST:
        // var tablesTestShouldSetStripesClassIfStripesOptionIsSet =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.NamedAttribute{
        // 					Name: "stripes",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "odd",
        // 						},
        // 					},
        // 					Quote: 0,
        // 				},
        // 			},
        // 			ColumnCount: 3,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "A",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "B",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "C",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "a",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "b",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "c",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "2",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "3",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `outputs a caption on simple psv table`() {
        // Input: asciidoctor/tables_test_outputs_a_caption_on_simple_psv_table.adoc
        // Expected Go AST:
        // var tablesTestOutputsACaptionOnSimplePsvTable =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Simple psv table",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ColumnCount: 3,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "A",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "B",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "C",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "a",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "b",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "c",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "2",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "3",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `only increments table counter for tables that have a title`() {
        // Input: asciidoctor/tables_test_only_increments_table_counter_for_tables_that_have_a_title.adoc
        // Expected Go AST:
        // var tablesTestOnlyIncrementsTableCounterForTablesThatHaveATitle =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "First numbered table",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ColumnCount: 3,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "2",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "3",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: nil,
        // 			ColumnCount:   3,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "4",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "5",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "6",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Second numbered table",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ColumnCount: 3,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "7",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "8",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "9",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `uses explicit caption in front of title in place of default caption and number`() {
        // Input: asciidoctor/tables_test_uses_explicit_caption_in_front_of_title_in_place_of_default_caption_and_number.adoc
        // Expected Go AST:
        // var tablesTestUsesExplicitCaptionInFrontOfTitleInPlaceOfDefaultCaptionAndNumber =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.NamedAttribute{
        // 					Name: "caption",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "All the Data. ",
        // 						},
        // 					},
        // 					Quote: 2,
        // 				},
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Simple psv table",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ColumnCount: 3,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "A",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "B",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "C",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "a",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "b",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "c",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "2",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "3",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `disables caption when caption attribute on table is empty`() {
        // Input: asciidoctor/tables_test_disables_caption_when_caption_attribute_on_table_is_empty.adoc
        // Expected Go AST:
        // var tablesTestDisablesCaptionWhenCaptionAttributeOnTableIsEmpty =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "[caption=]",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Simple psv table",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ColumnCount: 3,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "A",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "B",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "C",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "a",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "b",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "c",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "2",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "3",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `disables caption when caption attribute on table is empty string`() {
        // Input: asciidoctor/tables_test_disables_caption_when_caption_attribute_on_table_is_empty_string.adoc
        // Expected Go AST:
        // var tablesTestDisablesCaptionWhenCaptionAttributeOnTableIsEmptyString =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.NamedAttribute{
        // 					Name:  "caption",
        // 					Val:   nil,
        // 					Quote: 2,
        // 				},
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Simple psv table",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ColumnCount: 3,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "A",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "B",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "C",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "a",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "b",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "c",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "2",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "3",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `disables caption on table when table-caption document attribute is unset`() {
        // Input: asciidoctor/tables_test_disables_caption_on_table_when_table_caption_document_attribute_is_unset.adoc
        // Expected Go AST:
        // var tablesTestDisablesCaptionOnTableWhenTableCaptionDocumentAttributeIsUnset =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeReset{
        // 			Name: "table-caption",
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Simple psv table",
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ColumnCount: 3,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "A",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "B",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "C",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "a",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "b",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "c",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "2",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "3",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `ignores escaped separators`() {
        // Input: asciidoctor/tables_test_ignores_escaped_separators.adoc
        // Expected Go AST:
        // var tablesTestIgnoresEscapedSeparators =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: nil,
        // 			ColumnCount:   2,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "A \\| here",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "a \\| there",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `preserves escaped delimiters at the end of the line`() {
        // Input: asciidoctor/tables_test_preserves_escaped_delimiters_at_the_end_of_the_line.adoc
        // Expected Go AST:
        // var tablesTestPreservesEscapedDelimitersAtTheEndOfTheLine =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: nil,
        // 					ID:    nil,
        // 					Roles: nil,
        // 					Options: []*asciidoc.ShorthandOption{
        // 						&asciidoc.ShorthandOption{
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "header",
        // 								},
        // 							},
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableColumnsAttribute{
        // 					Columns: []*asciidoc.TableColumn{
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: true,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: true,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ColumnCount: 2,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "A",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "B\\|",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "A1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "B1\\|",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "A2",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "B2\\|",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should treat trailing pipe as an empty cell`() {
        // Input: asciidoctor/tables_test_should_treat_trailing_pipe_as_an_empty_cell.adoc
        // Expected Go AST:
        // var tablesTestShouldTreatTrailingPipeAsAnEmptyCell =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: nil,
        // 			ColumnCount:   2,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "A1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{},
        // 							Blank:    false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "B1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "B2",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "C1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "C2",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should auto recover with warning if missing leading separator on first cell`() {
        // Input: asciidoctor/tables_test_should_auto_recover_with_warning_if_missing_leading_separator_on_first_cell.adoc
        // Expected Go AST:
        // var tablesTestShouldAutoRecoverWithWarningIfMissingLeadingSeparatorOnFirstCell =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "|===",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "A | here| a | there",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "| x",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "| y",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "| z",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "| end",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "|===",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `performs normal substitutions on cell content`() {
        // Input: asciidoctor/tables_test_performs_normal_substitutions_on_cell_content.adoc
        // Expected Go AST:
        // var tablesTestPerformsNormalSubstitutionsOnCellContent =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "show_title",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Cool new show",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: nil,
        // 			ColumnCount:   2,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.UserAttributeReference{
        // 									Value: "show_title",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Coming soon...",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should only substitute specialchars for literal table cells`() {
        // Input: asciidoctor/tables_test_should_only_substitute_specialchars_for_literal_table_cells.adoc
        // Expected Go AST:
        // var tablesTestShouldOnlySubstituteSpecialcharsForLiteralTableCells =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: nil,
        // 			ColumnCount:   1,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 4,
        // 									IsSet: true,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "one",
        // 								},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.Bold{
        // 									AttributeList: nil,
        // 									Elements: asciidoc.Elements{
        // 										&asciidoc.String{
        // 											Value: "two",
        // 										},
        // 									},
        // 								},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.String{
        // 									Value: "three",
        // 								},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.String{
        // 									Value: "<four>",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should preserving leading spaces but not leading newlines or trailing spaces in literal table cells`() {
        // Input: asciidoctor/tables_test_should_preserving_leading_spaces_but_not_leading_newlines_or_trailing_spaces_in_literal_table_cells.adoc
        // Expected Go AST:
        // var tablesTestShouldPreservingLeadingSpacesButNotLeadingNewlinesOrTrailingSpacesInLiteralTableCells =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TableColumnsAttribute{
        // 					Columns: []*asciidoc.TableColumn{
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 2,
        // 								IsSet: true,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ColumnCount: 2,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 4,
        // 									IsSet: true,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.String{
        // 									Value: "  one",
        // 								},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.String{
        // 									Value: "  two",
        // 								},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.String{
        // 									Value: "three",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "normal",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "\n",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should ignore v table cell style`() {
        // Input: asciidoctor/tables_test_should_ignore_v_table_cell_style.adoc
        // Expected Go AST:
        // var tablesTestShouldIgnoreVTableCellStyle =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TableColumnsAttribute{
        // 					Columns: []*asciidoc.TableColumn{
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 2,
        // 								IsSet: true,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "|===",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "v|",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "  one",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "  two",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "three",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 0,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "  | normal",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "|===",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `table and column width not assigned when autowidth option is specified`() {
        // Input: asciidoctor/tables_test_table_and_column_width_not_assigned_when_autowidth_option_is_specified.adoc
        // Expected Go AST:
        // var tablesTestTableAndColumnWidthNotAssignedWhenAutowidthOptionIsSpecified =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.NamedAttribute{
        // 					Name: "options",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "autowidth",
        // 						},
        // 					},
        // 					Quote: 2,
        // 				},
        // 			},
        // 			ColumnCount: 3,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "A",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "B",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "C",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "a",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "b",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "c",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "2",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "3",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `does not assign column width for autowidth columns in HTML output`() {
        // Input: asciidoctor/tables_test_does_not_assign_column_width_for_autowidth_columns_in_html_output.adoc
        // Expected Go AST:
        // var tablesTestDoesNotAssignColumnWidthForAutowidthColumnsInHtmlOutput =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TableColumnsAttribute{
        // 					Columns: []*asciidoc.TableColumn{
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 15,
        // 								IsSet: true,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 3,
        // 								IsSet: true,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: -1,
        // 								IsSet: true,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ColumnCount: 4,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "A",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "B",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "C",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "D",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "a",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "b",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "c",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "d",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "2",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "3",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "4",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `can assign autowidth to all columns even when table has a width`() {
        // Input: asciidoctor/tables_test_can_assign_autowidth_to_all_columns_even_when_table_has_a_width.adoc
        // Expected Go AST:
        // var tablesTestCanAssignAutowidthToAllColumnsEvenWhenTableHasAWidth =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TableColumnsAttribute{
        // 					Columns: []*asciidoc.TableColumn{
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 4,
        // 								IsSet: true,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: -1,
        // 								IsSet: true,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.NamedAttribute{
        // 					Name: "width",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "50%",
        // 						},
        // 					},
        // 					Quote: 0,
        // 				},
        // 			},
        // 			ColumnCount: 4,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "A",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "B",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "C",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "D",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "a",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "b",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "c",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "d",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "2",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "3",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "4",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `equally distributes remaining column width to autowidth columns in DocBook output`() {
        // Input: asciidoctor/tables_test_equally_distributes_remaining_column_width_to_autowidth_columns_in_doc_book_output.adoc
        // Expected Go AST:
        // var tablesTestEquallyDistributesRemainingColumnWidthToAutowidthColumnsInDocBookOutput =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TableColumnsAttribute{
        // 					Columns: []*asciidoc.TableColumn{
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 15,
        // 								IsSet: true,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 3,
        // 								IsSet: true,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: -1,
        // 								IsSet: true,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ColumnCount: 4,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "A",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "B",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "C",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "D",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "a",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "b",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "c",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "d",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "2",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "3",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "4",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should compute column widths based on pagewidth when width is set on table in DocBook output`() {
        // Input: asciidoctor/tables_test_should_compute_column_widths_based_on_pagewidth_when_width_is_set_on_table_in_doc_book_output.adoc
        // Expected Go AST:
        // var tablesTestShouldComputeColumnWidthsBasedOnPagewidthWhenWidthIsSetOnTableInDocBookOutput =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name: "pagewidth",
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "500",
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.NamedAttribute{
        // 					Name: "width",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "50%",
        // 						},
        // 					},
        // 					Quote: 0,
        // 				},
        // 			},
        // 			ColumnCount: 4,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "A",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "B",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "C",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "D",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "\n",
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "a",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "b",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "c",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "d",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "2",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "3",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "4",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `explicit table width is used even when autowidth option is specified`() {
        // Input: asciidoctor/tables_test_explicit_table_width_is_used_even_when_autowidth_option_is_specified.adoc
        // Expected Go AST:
        // var tablesTestExplicitTableWidthIsUsedEvenWhenAutowidthOptionIsSpecified =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: nil,
        // 					ID:    nil,
        // 					Roles: nil,
        // 					Options: []*asciidoc.ShorthandOption{
        // 						&asciidoc.ShorthandOption{
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "autowidth",
        // 								},
        // 							},
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.NamedAttribute{
        // 					Name: "width",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "75%",
        // 						},
        // 					},
        // 					Quote: 0,
        // 				},
        // 			},
        // 			ColumnCount: 3,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "A",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "B",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "C",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "a",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "b",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "c",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "2",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "3",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `first row sets number of columns when not specified`() {
        // Input: asciidoctor/tables_test_first_row_sets_number_of_columns_when_not_specified.adoc
        // Expected Go AST:
        // var tablesTestFirstRowSetsNumberOfColumnsWhenNotSpecified =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: nil,
        // 			ColumnCount:   4,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "first",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "second",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "third",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "fourth",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "2",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "3",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "4",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `colspec attribute using asterisk syntax sets number of columns`() {
        // Input: asciidoctor/tables_test_colspec_attribute_using_asterisk_syntax_sets_number_of_columns.adoc
        // Expected Go AST:
        // var tablesTestColspecAttributeUsingAsteriskSyntaxSetsNumberOfColumns =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TableColumnsAttribute{
        // 					Columns: []*asciidoc.TableColumn{
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 3,
        // 								IsSet: true,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ColumnCount: 3,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "A",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "B",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "C",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "a",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "b",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "c",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "2",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "3",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `table with explicit column count can have multiple rows on a single line`() {
        // Input: asciidoctor/tables_test_table_with_explicit_column_count_can_have_multiple_rows_on_a_single_line.adoc
        // Expected Go AST:
        // var tablesTestTableWithExplicitColumnCountCanHaveMultipleRowsOnASingleLine =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TableColumnsAttribute{
        // 					Columns: []*asciidoc.TableColumn{
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 3,
        // 								IsSet: true,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ColumnCount: 3,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "one",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "two",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "2",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "a",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "b",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `table with explicit deprecated colspec syntax can have multiple rows on a single line`() {
        // Input: asciidoctor/tables_test_table_with_explicit_deprecated_colspec_syntax_can_have_multiple_rows_on_a_single_line.adoc
        // Expected Go AST:
        // var tablesTestTableWithExplicitDeprecatedColspecSyntaxCanHaveMultipleRowsOnASingleLine =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TableColumnsAttribute{
        // 					Columns: []*asciidoc.TableColumn{
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ColumnCount: 3,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "one",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "two",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "2",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "a",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "b",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `columns are added for empty records in colspec attribute`() {
        // Input: asciidoctor/tables_test_columns_are_added_for_empty_records_in_colspec_attribute.adoc
        // Expected Go AST:
        // var tablesTestColumnsAreAddedForEmptyRecordsInColspecAttribute =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TableColumnsAttribute{
        // 					Columns: []*asciidoc.TableColumn{
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: true,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ColumnCount: 2,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "one",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "two",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "2",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "a",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "b",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `cols may be separated by semi-colon instead of comma`() {
        // Input: asciidoctor/tables_test_cols_may_be_separated_by_semi_colon_instead_of_comma.adoc
        // Expected Go AST:
        // var tablesTestColsMayBeSeparatedBySemiColonInsteadOfComma =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TableColumnsAttribute{
        // 					Columns: []*asciidoc.TableColumn{
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: true,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 6,
        // 								IsSet: true,
        // 							},
        // 						},
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 3,
        // 								IsSet: true,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 5,
        // 								IsSet: true,
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ColumnCount: 2,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "strong",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "mono",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `cols attribute may include spaces`() {
        // Input: asciidoctor/tables_test_cols_attribute_may_include_spaces.adoc
        // Expected Go AST:
        // var tablesTestColsAttributeMayIncludeSpaces =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TableColumnsAttribute{
        // 					Columns: []*asciidoc.TableColumn{
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: true,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: true,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ColumnCount: 2,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "one",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "two",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "2",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "a",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "b",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `blank cols attribute should be ignored`() {
        // Input: asciidoctor/tables_test_blank_cols_attribute_should_be_ignored.adoc
        // Expected Go AST:
        // var tablesTestBlankColsAttributeShouldBeIgnored =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TableColumnsAttribute{
        // 					Columns: nil,
        // 				},
        // 			},
        // 			ColumnCount: 2,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "one",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "two",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "2",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "a",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "b",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `empty cols attribute should be ignored`() {
        // Input: asciidoctor/tables_test_empty_cols_attribute_should_be_ignored.adoc
        // Expected Go AST:
        // var tablesTestEmptyColsAttributeShouldBeIgnored =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TableColumnsAttribute{
        // 					Columns: nil,
        // 				},
        // 			},
        // 			ColumnCount: 2,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "one",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "two",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "2",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "a",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "b",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `table with header and footer`() {
        // Input: asciidoctor/tables_test_table_with_header_and_footer.adoc
        // Expected Go AST:
        // var tablesTestTableWithHeaderAndFooter =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.NamedAttribute{
        // 					Name: "options",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "header,footer",
        // 						},
        // 					},
        // 					Quote: 2,
        // 				},
        // 			},
        // 			ColumnCount: 2,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Item",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Quantity",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Item 1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Item 2",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "2",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Item 3",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "3",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Total",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "6",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `table with header and footer docbook`() {
        // Input: asciidoctor/tables_test_table_with_header_and_footer_docbook.adoc
        // Expected Go AST:
        // var tablesTestTableWithHeaderAndFooterDocbook =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Table with header, body and footer",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.NamedAttribute{
        // 					Name: "options",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "header,footer",
        // 						},
        // 					},
        // 					Quote: 2,
        // 				},
        // 			},
        // 			ColumnCount: 2,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Item",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Quantity",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Item 1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Item 2",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "2",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Item 3",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "3",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Total",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "6",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should set horizontal and vertical alignment when converting to DocBook`() {
        // Input: asciidoctor/tables_test_should_set_horizontal_and_vertical_alignment_when_converting_to_doc_book.adoc
        // Expected Go AST:
        // var tablesTestShouldSetHorizontalAndVerticalAlignmentWhenConvertingToDocBook =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: nil,
        // 			ColumnCount:   3,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "A",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 2,
        // 									IsSet: true,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 2,
        // 									IsSet: true,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "B",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 1,
        // 									IsSet: true,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "C",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "\n",
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "A1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 2,
        // 									IsSet: true,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 2,
        // 									IsSet: true,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "B1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 1,
        // 									IsSet: true,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "C1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should preserve frame value ends when converting to HTML`() {
        // Input: asciidoctor/tables_test_should_preserve_frame_value_ends_when_converting_to_html.adoc
        // Expected Go AST:
        // var tablesTestShouldPreserveFrameValueEndsWhenConvertingToHtml =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.NamedAttribute{
        // 					Name: "frame",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "ends",
        // 						},
        // 					},
        // 					Quote: 0,
        // 				},
        // 			},
        // 			ColumnCount: 3,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "A",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "B",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "C",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should normalize frame value topbot as ends when converting to HTML`() {
        // Input: asciidoctor/tables_test_should_normalize_frame_value_topbot_as_ends_when_converting_to_html.adoc
        // Expected Go AST:
        // var tablesTestShouldNormalizeFrameValueTopbotAsEndsWhenConvertingToHtml =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.NamedAttribute{
        // 					Name: "frame",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "topbot",
        // 						},
        // 					},
        // 					Quote: 0,
        // 				},
        // 			},
        // 			ColumnCount: 3,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "A",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "B",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "C",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should preserve frame value topbot when converting to DocBook`() {
        // Input: asciidoctor/tables_test_should_preserve_frame_value_topbot_when_converting_to_doc_book.adoc
        // Expected Go AST:
        // var tablesTestShouldPreserveFrameValueTopbotWhenConvertingToDocBook =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.NamedAttribute{
        // 					Name: "frame",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "topbot",
        // 						},
        // 					},
        // 					Quote: 0,
        // 				},
        // 			},
        // 			ColumnCount: 3,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "A",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "B",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "C",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should convert frame value ends to topbot when converting to DocBook`() {
        // Input: asciidoctor/tables_test_should_convert_frame_value_ends_to_topbot_when_converting_to_doc_book.adoc
        // Expected Go AST:
        // var tablesTestShouldConvertFrameValueEndsToTopbotWhenConvertingToDocBook =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.NamedAttribute{
        // 					Name: "frame",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "ends",
        // 						},
        // 					},
        // 					Quote: 0,
        // 				},
        // 			},
        // 			ColumnCount: 3,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "A",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "B",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "C",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `table with implicit header row`() {
        // Input: asciidoctor/tables_test_table_with_implicit_header_row.adoc
        // Expected Go AST:
        // var tablesTestTableWithImplicitHeaderRow =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: nil,
        // 			ColumnCount:   2,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Column 1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Column 2",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "\n",
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Data A1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Data B1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "\n",
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Data A2",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Data B2",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `table with implicit header row only`() {
        // Input: asciidoctor/tables_test_table_with_implicit_header_row_only.adoc
        // Expected Go AST:
        // var tablesTestTableWithImplicitHeaderRowOnly =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: nil,
        // 			ColumnCount:   2,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Column 1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Column 2",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "\n",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `table with implicit header row when other options set`() {
        // Input: asciidoctor/tables_test_table_with_implicit_header_row_when_other_options_set.adoc
        // Expected Go AST:
        // var tablesTestTableWithImplicitHeaderRowWhenOtherOptionsSet =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: nil,
        // 					ID:    nil,
        // 					Roles: nil,
        // 					Options: []*asciidoc.ShorthandOption{
        // 						&asciidoc.ShorthandOption{
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "autowidth",
        // 								},
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ColumnCount: 2,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Column 1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Column 2",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "\n",
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Data A1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Data B1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `no implicit header row if second line not blank`() {
        // Input: asciidoctor/tables_test_no_implicit_header_row_if_second_line_not_blank.adoc
        // Expected Go AST:
        // var tablesTestNoImplicitHeaderRowIfSecondLineNotBlank =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: nil,
        // 			ColumnCount:   2,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Column 1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Column 2",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Data A1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Data B1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "\n",
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Data A2",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Data B2",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `no implicit header row if cell in first line spans multiple lines`() {
        // Input: asciidoctor/tables_test_no_implicit_header_row_if_cell_in_first_line_spans_multiple_lines.adoc
        // Expected Go AST:
        // var tablesTestNoImplicitHeaderRowIfCellInFirstLineSpansMultipleLines =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TableColumnsAttribute{
        // 					Columns: []*asciidoc.TableColumn{
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 2,
        // 								IsSet: true,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ColumnCount: 2,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "A1",
        // 								},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.EmptyLine{
        // 									Text: "\n",
        // 								},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.String{
        // 									Value: "A1 continued",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "B1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "\n",
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "A2",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "B2",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should format first cell as literal if there is no implicit header row and column has l style`() {
        // Input: asciidoctor/tables_test_should_format_first_cell_as_literal_if_there_is_no_implicit_header_row_and_column_has_l_style.adoc
        // Expected Go AST:
        // var tablesTestShouldFormatFirstCellAsLiteralIfThereIsNoImplicitHeaderRowAndColumnHasLStyle =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TableColumnsAttribute{
        // 					Columns: []*asciidoc.TableColumn{
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: true,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 4,
        // 								IsSet: true,
        // 							},
        // 						},
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: true,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ColumnCount: 2,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "literal",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "normal",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should format first cell as AsciiDoc if there is no implicit header row and column has a style`() {
        // Input: asciidoctor/tables_test_should_format_first_cell_as_ascii_doc_if_there_is_no_implicit_header_row_and_column_has_a_style.adoc
        // Expected Go AST:
        // var tablesTestShouldFormatFirstCellAsAsciiDocIfThereIsNoImplicitHeaderRowAndColumnHasAStyle =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TableColumnsAttribute{
        // 					Columns: []*asciidoc.TableColumn{
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: true,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 1,
        // 								IsSet: true,
        // 							},
        // 						},
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: true,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ColumnCount: 2,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.UnorderedListItem{
        // 									Elements: asciidoc.Elements{
        // 										&asciidoc.String{
        // 											Value: "list",
        // 										},
        // 									},
        // 									AttributeList: nil,
        // 									Indent:        " ",
        // 									Marker:        "*",
        // 									Checklist:     0,
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "normal",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should interpret leading indent if first cell is AsciiDoc and there is no implicit header row`() {
        // Input: asciidoctor/tables_test_should_interpret_leading_indent_if_first_cell_is_ascii_doc_and_there_is_no_implicit_header_row.adoc
        // Expected Go AST:
        // var tablesTestShouldInterpretLeadingIndentIfFirstCellIsAsciiDocAndThereIsNoImplicitHeaderRow =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TableColumnsAttribute{
        // 					Columns: []*asciidoc.TableColumn{
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: true,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 1,
        // 								IsSet: true,
        // 							},
        // 						},
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: true,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ColumnCount: 2,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.String{
        // 									Value: "literal",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "normal",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should format first cell as AsciiDoc if there is no implicit header row and cell has a style`() {
        // Input: asciidoctor/tables_test_should_format_first_cell_as_ascii_doc_if_there_is_no_implicit_header_row_and_cell_has_a_style.adoc
        // Expected Go AST:
        // var tablesTestShouldFormatFirstCellAsAsciiDocIfThereIsNoImplicitHeaderRowAndCellHasAStyle =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: nil,
        // 			ColumnCount:   1,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 1,
        // 									IsSet: true,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.UnorderedListItem{
        // 									Elements: asciidoc.Elements{
        // 										&asciidoc.String{
        // 											Value: "list",
        // 										},
        // 									},
        // 									AttributeList: nil,
        // 									Indent:        " ",
        // 									Marker:        "*",
        // 									Checklist:     0,
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "normal",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `no implicit header row if AsciiDoc cell in first line spans multiple lines`() {
        // Input: asciidoctor/tables_test_no_implicit_header_row_if_ascii_doc_cell_in_first_line_spans_multiple_lines.adoc
        // Expected Go AST:
        // var tablesTestNoImplicitHeaderRowIfAsciiDocCellInFirstLineSpansMultipleLines =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TableColumnsAttribute{
        // 					Columns: []*asciidoc.TableColumn{
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 2,
        // 								IsSet: true,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ColumnCount: 2,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 1,
        // 									IsSet: true,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "contains AsciiDoc content",
        // 								},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.EmptyLine{
        // 									Text: "",
        // 								},
        // 								&asciidoc.UnorderedListItem{
        // 									Elements: asciidoc.Elements{
        // 										&asciidoc.String{
        // 											Value: "a",
        // 										},
        // 									},
        // 									AttributeList: nil,
        // 									Indent:        "",
        // 									Marker:        "*",
        // 									Checklist:     0,
        // 								},
        // 								&asciidoc.UnorderedListItem{
        // 									Elements: asciidoc.Elements{
        // 										&asciidoc.String{
        // 											Value: "b",
        // 										},
        // 									},
        // 									AttributeList: nil,
        // 									Indent:        "",
        // 									Marker:        "*",
        // 									Checklist:     0,
        // 								},
        // 								&asciidoc.UnorderedListItem{
        // 									Elements: asciidoc.Elements{
        // 										&asciidoc.String{
        // 											Value: "c",
        // 										},
        // 									},
        // 									AttributeList: nil,
        // 									Indent:        "",
        // 									Marker:        "*",
        // 									Checklist:     0,
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 1,
        // 									IsSet: true,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "contains no AsciiDoc content",
        // 								},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.EmptyLine{
        // 									Text: "",
        // 								},
        // 								&asciidoc.String{
        // 									Value: "just text",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "A2",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "B2",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `no implicit header row if first line blank`() {
        // Input: asciidoctor/tables_test_no_implicit_header_row_if_first_line_blank.adoc
        // Expected Go AST:
        // var tablesTestNoImplicitHeaderRowIfFirstLineBlank =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: nil,
        // 			ColumnCount:   2,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.EmptyLine{
        // 					Text: "\n",
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Column 1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Column 2",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "\n",
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Data A1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Data B1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "\n",
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Data A2",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Data B2",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "\n",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `no implicit header row if noheader option is specified`() {
        // Input: asciidoctor/tables_test_no_implicit_header_row_if_noheader_option_is_specified.adoc
        // Expected Go AST:
        // var tablesTestNoImplicitHeaderRowIfNoheaderOptionIsSpecified =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: nil,
        // 					ID:    nil,
        // 					Roles: nil,
        // 					Options: []*asciidoc.ShorthandOption{
        // 						&asciidoc.ShorthandOption{
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "noheader",
        // 								},
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ColumnCount: 2,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Column 1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Column 2",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "\n",
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Data A1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Data B1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "\n",
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Data A2",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Data B2",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `styles not applied to header cells`() {
        // Input: asciidoctor/tables_test_styles_not_applied_to_header_cells.adoc
        // Expected Go AST:
        // var tablesTestStylesNotAppliedToHeaderCells =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TableColumnsAttribute{
        // 					Columns: []*asciidoc.TableColumn{
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: true,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 3,
        // 								IsSet: true,
        // 							},
        // 						},
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: true,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 6,
        // 								IsSet: true,
        // 							},
        // 						},
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: true,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 2,
        // 								IsSet: true,
        // 							},
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.NamedAttribute{
        // 					Name: "options",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "header,footer",
        // 						},
        // 					},
        // 					Quote: 2,
        // 				},
        // 			},
        // 			ColumnCount: 3,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Name",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Occupation",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Website",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Octocat",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Social coding",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.Link{
        // 									AttributeList: nil,
        // 									URL: asciidoc.URL{
        // 										Scheme: "https://",
        // 										Path: asciidoc.Elements{
        // 											&asciidoc.String{
        // 												Value: "github.com",
        // 											},
        // 										},
        // 									},
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Name",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Occupation",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Website",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should apply text formatting to cells in implicit header row when column has a style`() {
        // Input: asciidoctor/tables_test_should_apply_text_formatting_to_cells_in_implicit_header_row_when_column_has_a_style.adoc
        // Expected Go AST:
        // var tablesTestShouldApplyTextFormattingToCellsInImplicitHeaderRowWhenColumnHasAStyle =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TableColumnsAttribute{
        // 					Columns: []*asciidoc.TableColumn{
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 2,
        // 								IsSet: true,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 1,
        // 								IsSet: true,
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ColumnCount: 2,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: " ",
        // 								},
        // 								&asciidoc.Italic{
        // 									AttributeList: nil,
        // 									Elements: asciidoc.Elements{
        // 										&asciidoc.String{
        // 											Value: "foo",
        // 										},
        // 									},
        // 								},
        // 								&asciidoc.String{
        // 									Value: " ",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.Bold{
        // 									AttributeList: nil,
        // 									Elements: asciidoc.Elements{
        // 										&asciidoc.String{
        // 											Value: "bar",
        // 										},
        // 									},
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "\n",
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.UnorderedListItem{
        // 									Elements: asciidoc.Elements{
        // 										&asciidoc.String{
        // 											Value: "list item",
        // 										},
        // 									},
        // 									AttributeList: nil,
        // 									Indent:        " ",
        // 									Marker:        "*",
        // 									Checklist:     0,
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "paragraph",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should apply style and text formatting to cells in first row if no implicit header`() {
        // Input: asciidoctor/tables_test_should_apply_style_and_text_formatting_to_cells_in_first_row_if_no_implicit_header.adoc
        // Expected Go AST:
        // var tablesTestShouldApplyStyleAndTextFormattingToCellsInFirstRowIfNoImplicitHeader =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TableColumnsAttribute{
        // 					Columns: []*asciidoc.TableColumn{
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 6,
        // 								IsSet: true,
        // 							},
        // 						},
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 2,
        // 								IsSet: true,
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ColumnCount: 2,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.Italic{
        // 									AttributeList: nil,
        // 									Elements: asciidoc.Elements{
        // 										&asciidoc.String{
        // 											Value: "strong",
        // 										},
        // 									},
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.Bold{
        // 									AttributeList: nil,
        // 									Elements: asciidoc.Elements{
        // 										&asciidoc.String{
        // 											Value: "emphasis",
        // 										},
        // 									},
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "strong",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "emphasis",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `vertical table headers use th element instead of header class`() {
        // Input: asciidoctor/tables_test_vertical_table_headers_use_th_element_instead_of_header_class.adoc
        // Expected Go AST:
        // var tablesTestVerticalTableHeadersUseThElementInsteadOfHeaderClass =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TableColumnsAttribute{
        // 					Columns: []*asciidoc.TableColumn{
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: true,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 3,
        // 								IsSet: true,
        // 							},
        // 						},
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: true,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 6,
        // 								IsSet: true,
        // 							},
        // 						},
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: true,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 2,
        // 								IsSet: true,
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ColumnCount: 3,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.EmptyLine{
        // 					Text: "\n",
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Name",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Occupation",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Website",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "\n",
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Octocat",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Social coding",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.Link{
        // 									AttributeList: nil,
        // 									URL: asciidoc.URL{
        // 										Scheme: "https://",
        // 										Path: asciidoc.Elements{
        // 											&asciidoc.String{
        // 												Value: "github.com",
        // 											},
        // 										},
        // 									},
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "\n",
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Name",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Occupation",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Website",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "\n",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `supports horizontal and vertical source data with blank lines and table header`() {
        // Input: asciidoctor/tables_test_supports_horizontal_and_vertical_source_data_with_blank_lines_and_table_header.adoc
        // Expected Go AST:
        // var tablesTestSupportsHorizontalAndVerticalSourceDataWithBlankLinesAndTableHeader =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Horizontal and vertical source data",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.NamedAttribute{
        // 					Name: "width",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "80%",
        // 						},
        // 					},
        // 					Quote: 2,
        // 				},
        // 				&asciidoc.TableColumnsAttribute{
        // 					Columns: []*asciidoc.TableColumn{
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 3,
        // 								IsSet: true,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 2,
        // 								IsSet: true,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 2,
        // 								IsSet: true,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 2,
        // 								IsSet: true,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 2,
        // 								IsSet: true,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 10,
        // 								IsSet: true,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.NamedAttribute{
        // 					Name: "options",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "header",
        // 						},
        // 					},
        // 					Quote: 2,
        // 				},
        // 			},
        // 			ColumnCount: 4,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Date",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Duration",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Avg HR",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Notes",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "\n",
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "22-Aug-08",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "10:24",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "157",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.String{
        // 									Value: "Worked out MSHR (max sustainable heart rate) by going hard",
        // 								},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.String{
        // 									Value: "for this interval.",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "\n",
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "22-Aug-08",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "23:03",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "152",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.String{
        // 									Value: "Back-to-back with previous interval.",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "\n",
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "24-Aug-08",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "40:00",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "145",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.String{
        // 									Value: "Moderately hard interspersed with 3x 3min intervals (2 min",
        // 								},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.String{
        // 									Value: "hard + 1 min really hard taking the HR up to 160).",
        // 								},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.String{
        // 									Value: "I am getting in shape!",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "\n",
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `percentages as column widths`() {
        // Input: asciidoctor/tables_test_percentages_as_column_widths.adoc
        // Expected Go AST:
        // var tablesTestPercentagesAsColumnWidths =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TableColumnsAttribute{
        // 					Columns: []*asciidoc.TableColumn{
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: true,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 2,
        // 								IsSet: true,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 10,
        // 								IsSet: true,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: true,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 90,
        // 								IsSet: true,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ColumnCount: 2,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "column A",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "column B",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `spans, alignments and styles`() {
        // Input: asciidoctor/tables_test_spans_alignments_and_styles.adoc
        // Expected Go AST:
        // var tablesTestSpansAlignmentsAndStyles =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TableColumnsAttribute{
        // 					Columns: []*asciidoc.TableColumn{
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 2,
        // 								IsSet: true,
        // 							},
        // 						},
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 5,
        // 								IsSet: true,
        // 							},
        // 						},
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 2,
        // 								IsSet: true,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 1,
        // 								IsSet: true,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 6,
        // 								IsSet: true,
        // 							},
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.NamedAttribute{
        // 					Name: "width",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "25%",
        // 						},
        // 					},
        // 					Quote: 2,
        // 				},
        // 			},
        // 			ColumnCount: 4,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 1,
        // 									IsSet: true,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 6,
        // 									IsSet: true,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "2",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "3",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "4",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 2,
        // 									IsSet: true,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "5",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 2,
        // 										IsSet: true,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 2,
        // 										IsSet: true,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 2,
        // 									IsSet: true,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 2,
        // 									IsSet: true,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "6",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format:   nil,
        // 							Elements: nil,
        // 							Blank:    true,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 3,
        // 										IsSet: true,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: true,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 1,
        // 									IsSet: true,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 5,
        // 									IsSet: true,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "7",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 2,
        // 									IsSet: true,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "8",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format:   nil,
        // 							Elements: nil,
        // 							Blank:    true,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: true,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "9",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format:   nil,
        // 							Elements: nil,
        // 							Blank:    true,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 2,
        // 										IsSet: true,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 1,
        // 									IsSet: true,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "10",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format:   nil,
        // 							Elements: nil,
        // 							Blank:    true,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format:   nil,
        // 							Elements: nil,
        // 							Blank:    true,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format:   nil,
        // 							Elements: nil,
        // 							Blank:    true,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `sets up columns correctly if first row has cell that spans columns`() {
        // Input: asciidoctor/tables_test_sets_up_columns_correctly_if_first_row_has_cell_that_spans_columns.adoc
        // Expected Go AST:
        // var tablesTestSetsUpColumnsCorrectlyIfFirstRowHasCellThatSpansColumns =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: nil,
        // 			ColumnCount:   3,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 2,
        // 										IsSet: true,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 2,
        // 									IsSet: true,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "AAA",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format:   nil,
        // 							Elements: nil,
        // 							Blank:    true,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "CCC",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "AAA",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "BBB",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "CCC",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "AAA",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "BBB",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "CCC",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `supports repeating cells`() {
        // Input: asciidoctor/tables_test_supports_repeating_cells.adoc
        // Expected Go AST:
        // var tablesTestSupportsRepeatingCells =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: nil,
        // 			ColumnCount:   1,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 3,
        // 									IsSet: true,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "A",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 3,
        // 									IsSet: true,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "2",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "b",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "c",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `calculates colnames correctly when using implicit column count and single cell with colspan`() {
        // Input: asciidoctor/tables_test_calculates_colnames_correctly_when_using_implicit_column_count_and_single_cell_with_colspan.adoc
        // Expected Go AST:
        // var tablesTestCalculatesColnamesCorrectlyWhenUsingImplicitColumnCountAndSingleCellWithColspan =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: nil,
        // 			ColumnCount:   2,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 2,
        // 										IsSet: true,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Two Columns",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format:   nil,
        // 							Elements: nil,
        // 							Blank:    true,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "One Column",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "One Column",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `calculates colnames correctly when using implicit column count and cells with mixed colspans`() {
        // Input: asciidoctor/tables_test_calculates_colnames_correctly_when_using_implicit_column_count_and_cells_with_mixed_colspans.adoc
        // Expected Go AST:
        // var tablesTestCalculatesColnamesCorrectlyWhenUsingImplicitColumnCountAndCellsWithMixedColspans =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: nil,
        // 			ColumnCount:   3,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 2,
        // 										IsSet: true,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Two Columns",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format:   nil,
        // 							Elements: nil,
        // 							Blank:    true,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "One Column",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "One Column",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "One Column",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "One Column",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `assigns unique column names for table with implicit column count and colspans in first row`() {
        // Input: asciidoctor/tables_test_assigns_unique_column_names_for_table_with_implicit_column_count_and_colspans_in_first_row.adoc
        // Expected Go AST:
        // var tablesTestAssignsUniqueColumnNamesForTableWithImplicitColumnCountAndColspansInFirstRow =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: nil,
        // 			ColumnCount:   5,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{},
        // 							Blank:    false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 2,
        // 										IsSet: true,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Node 0",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format:   nil,
        // 							Elements: nil,
        // 							Blank:    true,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 2,
        // 										IsSet: true,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Node 1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format:   nil,
        // 							Elements: nil,
        // 							Blank:    true,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "\n",
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Host processes",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Core 0",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Core 1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Core 4",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Core 5",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Guest processes",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Core 2",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Core 3",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Core 6",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Core 7",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should drop row but preserve remaining rows after cell with colspan exceeds number of columns`() {
        // Input: asciidoctor/tables_test_should_drop_row_but_preserve_remaining_rows_after_cell_with_colspan_exceeds_number_of_columns.adoc
        // Expected Go AST:
        // var tablesTestShouldDropRowButPreserveRemainingRowsAfterCellWithColspanExceedsNumberOfColumns =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TableColumnsAttribute{
        // 					Columns: []*asciidoc.TableColumn{
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 2,
        // 								IsSet: true,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ColumnCount: 2,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 3,
        // 										IsSet: true,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "A",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format:   nil,
        // 							Elements: nil,
        // 							Blank:    true,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format:   nil,
        // 							Elements: nil,
        // 							Blank:    true,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "B",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 1,
        // 									IsSet: true,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "C",
        // 								},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.EmptyLine{
        // 									Text: "",
        // 								},
        // 								&asciidoc.String{
        // 									Value: "more C",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should drop last row if last cell in table has colspan that exceeds specified number of columns`() {
        // Input: asciidoctor/tables_test_should_drop_last_row_if_last_cell_in_table_has_colspan_that_exceeds_specified_number_of_columns.adoc
        // Expected Go AST:
        // var tablesTestShouldDropLastRowIfLastCellInTableHasColspanThatExceedsSpecifiedNumberOfColumns =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TableColumnsAttribute{
        // 					Columns: []*asciidoc.TableColumn{
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 2,
        // 								IsSet: true,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ColumnCount: 2,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "a",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 2,
        // 										IsSet: true,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "b",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should drop last row if last cell in table has colspan that exceeds implicit number of columns`() {
        // Input: asciidoctor/tables_test_should_drop_last_row_if_last_cell_in_table_has_colspan_that_exceeds_implicit_number_of_columns.adoc
        // Expected Go AST:
        // var tablesTestShouldDropLastRowIfLastCellInTableHasColspanThatExceedsImplicitNumberOfColumns =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: nil,
        // 			ColumnCount:   2,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "a",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "b",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "c",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 2,
        // 										IsSet: true,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "d",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should take colspan into account when taking cells for row`() {
        // Input: asciidoctor/tables_test_should_take_colspan_into_account_when_taking_cells_for_row.adoc
        // Expected Go AST:
        // var tablesTestShouldTakeColspanIntoAccountWhenTakingCellsForRow =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TableColumnsAttribute{
        // 					Columns: []*asciidoc.TableColumn{
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ColumnCount: 7,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 2,
        // 										IsSet: true,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "a",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format:   nil,
        // 							Elements: nil,
        // 							Blank:    true,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 2,
        // 										IsSet: true,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "b",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format:   nil,
        // 							Elements: nil,
        // 							Blank:    true,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 2,
        // 										IsSet: true,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "c",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format:   nil,
        // 							Elements: nil,
        // 							Blank:    true,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 2,
        // 										IsSet: true,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "d",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "e",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "f",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "g",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "h",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "i",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "j",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "k",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should drop incomplete row at end of table and log an error`() {
        // Input: asciidoctor/tables_test_should_drop_incomplete_row_at_end_of_table_and_log_an_error.adoc
        // Expected Go AST:
        // var tablesTestShouldDropIncompleteRowAtEndOfTableAndLogAnError =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TableColumnsAttribute{
        // 					Columns: []*asciidoc.TableColumn{
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 2,
        // 								IsSet: true,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ColumnCount: 2,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "a",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "b",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "c",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "d",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "e",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format:   nil,
        // 							Elements: nil,
        // 							Blank:    true,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should apply cell style for column to repeated content`() {
        // Input: asciidoctor/tables_test_should_apply_cell_style_for_column_to_repeated_content.adoc
        // Expected Go AST:
        // var tablesTestShouldApplyCellStyleForColumnToRepeatedContent =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TableColumnsAttribute{
        // 					Columns: []*asciidoc.TableColumn{
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 2,
        // 								IsSet: true,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 4,
        // 								IsSet: true,
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ColumnCount: 2,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Paragraphs",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Literal",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "\n",
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 2,
        // 									IsSet: true,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "The discussion about what is good,",
        // 								},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.String{
        // 									Value: "what is beautiful, what is noble,",
        // 								},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.String{
        // 									Value: "what is pure, and what is true",
        // 								},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.String{
        // 									Value: "could always go on.",
        // 								},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.String{
        // 									Value: "Why is that important?",
        // 								},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.String{
        // 									Value: "Why would I like to do that?",
        // 								},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.String{
        // 									Value: "Because that's the only conversation worth having.",
        // 								},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.String{
        // 									Value: "And whether it goes on or not after I die, I don't know.",
        // 								},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.String{
        // 									Value: "But, I do know that it is the conversation I want to have while I am still alive.",
        // 								},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.String{
        // 									Value: "Which means that to me the offer of certainty,",
        // 								},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.String{
        // 									Value: "the offer of complete security,",
        // 								},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.String{
        // 									Value: "the offer of an impermeable faith that can't give way",
        // 								},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.String{
        // 									Value: "is an offer of something not worth having.",
        // 								},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.String{
        // 									Value: "I want to live my life taking the risk all the time",
        // 								},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.String{
        // 									Value: "that I don't know anything like enough yet...",
        // 								},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.String{
        // 									Value: "that I haven't understood enough...",
        // 								},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.String{
        // 									Value: "that I can't know enough...",
        // 								},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.String{
        // 									Value: "that I am always hungrily operating on the margins",
        // 								},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.String{
        // 									Value: "of a potentially great harvest of future knowledge and wisdom.",
        // 								},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.String{
        // 									Value: "I wouldn't have it any other way.",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format:   nil,
        // 							Elements: nil,
        // 							Blank:    true,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not split paragraph at line containing only {blank} that is directly adjacent to non-blank lines`() {
        // Input: asciidoctor/tables_test_should_not_split_paragraph_at_line_containing_only_{blank}_that_is_directly_adjacent_to_non_blank_lines.adoc
        // Expected Go AST:
        // var tablesTestShouldNotSplitParagraphAtLineContainingOnlyblankThatIsDirectlyAdjacentToNonBlankLines =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: nil,
        // 			ColumnCount:   1,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "paragraph",
        // 								},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.CharacterReplacementReference{
        // 									Value: "blank",
        // 								},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.String{
        // 									Value: "still one paragraph",
        // 								},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.CharacterReplacementReference{
        // 									Value: "blank",
        // 								},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.String{
        // 									Value: "still one paragraph",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should strip trailing newlines when splitting paragraphs`() {
        // Input: asciidoctor/tables_test_should_strip_trailing_newlines_when_splitting_paragraphs.adoc
        // Expected Go AST:
        // var tablesTestShouldStripTrailingNewlinesWhenSplittingParagraphs =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: nil,
        // 			ColumnCount:   1,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "first wrapped",
        // 								},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.String{
        // 									Value: "paragraph",
        // 								},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.String{
        // 									Value: "second paragraph",
        // 								},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.String{
        // 									Value: "third paragraph",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `basic AsciiDoc cell`() {
        // Input: asciidoctor/tables_test_basic_ascii_doc_cell.adoc
        // Expected Go AST:
        // var tablesTestBasicAsciiDocCell =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: nil,
        // 			ColumnCount:   1,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 1,
        // 									IsSet: true,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.OpenBlock{
        // 									AttributeList: nil,
        // 									Delimiter: asciidoc.Delimiter{
        // 										Type:   7,
        // 										Length: 2,
        // 									},
        // 									Elements: asciidoc.Elements{
        // 										&asciidoc.Admonition{
        // 											AdmonitionType: 1,
        // 											AttributeList:  nil,
        // 										},
        // 										&asciidoc.String{
        // 											Value: "content",
        // 										},
        // 										&asciidoc.NewLine{},
        // 										&asciidoc.EmptyLine{
        // 											Text: "",
        // 										},
        // 										&asciidoc.String{
        // 											Value: "content",
        // 										},
        // 										&asciidoc.NewLine{},
        // 									},
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `doctype can be set in AsciiDoc table cell`() {
        // Input: asciidoctor/tables_test_doctype_can_be_set_in_ascii_doc_table_cell.adoc
        // Expected Go AST:
        // var tablesTestDoctypeCanBeSetInAsciiDocTableCell =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: nil,
        // 			ColumnCount:   1,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 1,
        // 									IsSet: true,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.AttributeEntry{
        // 									Name: "doctype",
        // 									Elements: asciidoc.Elements{
        // 										&asciidoc.String{
        // 											Value: "inline",
        // 										},
        // 									},
        // 								},
        // 								&asciidoc.EmptyLine{
        // 									Text: "",
        // 								},
        // 								&asciidoc.String{
        // 									Value: "content",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should reset doctype to default in AsciiDoc table cell`() {
        // Input: asciidoctor/tables_test_should_reset_doctype_to_default_in_ascii_doc_table_cell.adoc
        // Expected Go AST:
        // var tablesTestShouldResetDoctypeToDefaultInAsciiDocTableCell =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Section{
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.AttributeEntry{
        // 					Name: "doctype",
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "book",
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
        // 						&asciidoc.Table{
        // 							AttributeList: nil,
        // 							ColumnCount:   1,
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.TableRow{
        // 									Elements: asciidoc.Elements{
        // 										&asciidoc.TableCell{
        // 											Format: &asciidoc.TableCellFormat{
        // 												Multiplier: asciidoc.Optional[int]{
        // 													Value: 1,
        // 													IsSet: false,
        // 												},
        // 												Span: asciidoc.TableCellSpan{
        // 													Column: asciidoc.Optional[int]{
        // 														Value: 1,
        // 														IsSet: false,
        // 													},
        // 													Row: asciidoc.Optional[int]{
        // 														Value: 1,
        // 														IsSet: false,
        // 													},
        // 												},
        // 												HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 													Value: 0,
        // 													IsSet: false,
        // 												},
        // 												VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 													Value: 0,
        // 													IsSet: false,
        // 												},
        // 												Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 													Value: 1,
        // 													IsSet: true,
        // 												},
        // 											},
        // 											Elements: asciidoc.Elements{
        // 												&asciidoc.NewLine{},
        // 												&asciidoc.Section{
        // 													AttributeList: nil,
        // 													Elements: asciidoc.Elements{
        // 														&asciidoc.EmptyLine{
        // 															Text: "",
        // 														},
        // 														&asciidoc.String{
        // 															Value: "doctype=",
        // 														},
        // 														&asciidoc.UserAttributeReference{
        // 															Value: "doctype",
        // 														},
        // 														&asciidoc.NewLine{},
        // 														&asciidoc.UserAttributeReference{
        // 															Value: "backend-html5-doctype-article",
        // 														},
        // 														&asciidoc.NewLine{},
        // 														&asciidoc.UserAttributeReference{
        // 															Value: "backend-html5-doctype-book",
        // 														},
        // 													},
        // 													Title: asciidoc.Elements{
        // 														&asciidoc.String{
        // 															Value: "AsciiDoc Table Cell",
        // 														},
        // 													},
        // 													Level: 0,
        // 												},
        // 											},
        // 											Blank: false,
        // 										},
        // 									},
        // 								},
        // 							},
        // 						},
        // 					},
        // 					Title: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Chapter 1",
        // 						},
        // 					},
        // 					Level: 1,
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Book Title",
        // 				},
        // 			},
        // 			Level: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should update doctype-related attributes in AsciiDoc table cell when doctype is set`() {
        // Input: asciidoctor/tables_test_should_update_doctype_related_attributes_in_ascii_doc_table_cell_when_doctype_is_set.adoc
        // Expected Go AST:
        // var tablesTestShouldUpdateDoctypeRelatedAttributesInAsciiDocTableCellWhenDoctypeIsSet =
        // { // p0
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Section{ // p1
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.AttributeEntry{
        // 					Name: "doctype",
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "article",
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
        // 						&asciidoc.Table{ // p2
        // 							AttributeList: nil,
        // 							ColumnCount:   1,
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.TableRow{ // p3
        // 									Elements: asciidoc.Elements{
        // 										&asciidoc.TableCell{
        // 											Format: &asciidoc.TableCellFormat{
        // 												Multiplier: asciidoc.Optional[int]{
        // 													Value: 1,
        // 													IsSet: false,
        // 												},
        // 												Span: asciidoc.TableCellSpan{
        // 													Column: asciidoc.Optional[int]{
        // 														Value: 1,
        // 														IsSet: false,
        // 													},
        // 													Row: asciidoc.Optional[int]{
        // 														Value: 1,
        // 														IsSet: false,
        // 													},
        // 												},
        // 												HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 													Value: 0,
        // 													IsSet: false,
        // 												},
        // 												VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 													Value: 0,
        // 													IsSet: false,
        // 												},
        // 												Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 													Value: 1,
        // 													IsSet: true,
        // 												},
        // 											},
        // 											Elements: asciidoc.Elements{ // p4
        // 												&asciidoc.NewLine{},
        // 												&asciidoc.Section{
        // 													AttributeList: nil,
        // 													Elements: asciidoc.Elements{
        // 														&asciidoc.AttributeEntry{
        // 															Name: "doctype",
        // 															Elements: asciidoc.Elements{
        // 																&asciidoc.String{
        // 																	Value: "book",
        // 																},
        // 															},
        // 														},
        // 														&asciidoc.EmptyLine{
        // 															Text: "",
        // 														},
        // 														&asciidoc.String{
        // 															Value: "doctype=",
        // 														},
        // 														&asciidoc.UserAttributeReference{
        // 															Value: "doctype",
        // 														},
        // 														&asciidoc.NewLine{},
        // 														&asciidoc.UserAttributeReference{
        // 															Value: "backend-html5-doctype-book",
        // 														},
        // 														&asciidoc.NewLine{},
        // 														&asciidoc.UserAttributeReference{
        // 															Value: "backend-html5-doctype-article",
        // 														},
        // 													},
        // 													Title: asciidoc.Elements{
        // 														&asciidoc.String{
        // 															Value: "AsciiDoc Table Cell",
        // 														},
        // 													},
        // 													Level: 0,
        // 												},
        // 											},
        // 											Blank: false,
        // 										},
        // 									},
        // 								},
        // 							},
        // 						},
        // 					},
        // 					Title: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Chapter 1",
        // 						},
        // 					},
        // 					Level: 1,
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Document Title",
        // 				},
        // 			},
        // 			Level: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not allow AsciiDoc table cell to set a document attribute that was hard set by the API`() {
        // Input: asciidoctor/tables_test_should_not_allow_ascii_doc_table_cell_to_set_a_document_attribute_that_was_hard_set_by_the_api.adoc
        // Expected Go AST:
        // var tablesTestShouldNotAllowAsciiDocTableCellToSetADocumentAttributeThatWasHardSetByTheApi =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: nil,
        // 			ColumnCount:   1,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 1,
        // 									IsSet: true,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.AttributeEntry{
        // 									Name:     "icons",
        // 									Elements: nil,
        // 								},
        // 								&asciidoc.EmptyLine{
        // 									Text: "",
        // 								},
        // 								&asciidoc.Paragraph{
        // 									AttributeList: nil,
        // 									Elements: asciidoc.Elements{
        // 										&asciidoc.String{
        // 											Value: "This admonition does not have a font-based icon.",
        // 										},
        // 									},
        // 									Admonition: 1,
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not allow AsciiDoc table cell to set a document attribute that was hard unset by the API`() {
        // Input: asciidoctor/tables_test_should_not_allow_ascii_doc_table_cell_to_set_a_document_attribute_that_was_hard_unset_by_the_api.adoc
        // Expected Go AST:
        // var tablesTestShouldNotAllowAsciiDocTableCellToSetADocumentAttributeThatWasHardUnsetByTheApi =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: nil,
        // 			ColumnCount:   1,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 1,
        // 									IsSet: true,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.AttributeEntry{
        // 									Name: "icons",
        // 									Elements: asciidoc.Elements{
        // 										&asciidoc.String{
        // 											Value: "font",
        // 										},
        // 									},
        // 								},
        // 								&asciidoc.EmptyLine{
        // 									Text: "",
        // 								},
        // 								&asciidoc.Paragraph{
        // 									AttributeList: nil,
        // 									Elements: asciidoc.Elements{
        // 										&asciidoc.String{
        // 											Value: "This admonition does not have a font-based icon.",
        // 										},
        // 									},
        // 									Admonition: 1,
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should keep attribute unset in AsciiDoc table cell if unset in parent document`() {
        // Input: asciidoctor/tables_test_should_keep_attribute_unset_in_ascii_doc_table_cell_if_unset_in_parent_document.adoc
        // Expected Go AST:
        // var tablesTestShouldKeepAttributeUnsetInAsciiDocTableCellIfUnsetInParentDocument =
        // { // p0
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeReset{
        // 			Name: "sectids",
        // 		},
        // 		&asciidoc.AttributeReset{
        // 			Name: "table-caption",
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Section{
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.Table{ // p1
        // 					AttributeList: asciidoc.AttributeList{
        // 						&asciidoc.TitleAttribute{
        // 							Val: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Outer Table",
        // 								},
        // 							},
        // 						},
        // 					},
        // 					ColumnCount: 1,
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableRow{ // p2
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.TableCell{
        // 									Format: &asciidoc.TableCellFormat{
        // 										Multiplier: asciidoc.Optional[int]{
        // 											Value: 1,
        // 											IsSet: false,
        // 										},
        // 										Span: asciidoc.TableCellSpan{
        // 											Column: asciidoc.Optional[int]{
        // 												Value: 1,
        // 												IsSet: false,
        // 											},
        // 											Row: asciidoc.Optional[int]{
        // 												Value: 1,
        // 												IsSet: false,
        // 											},
        // 										},
        // 										HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 											Value: 0,
        // 											IsSet: false,
        // 										},
        // 										VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 											Value: 0,
        // 											IsSet: false,
        // 										},
        // 										Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 											Value: 1,
        // 											IsSet: true,
        // 										},
        // 									},
        // 									Elements: asciidoc.Elements{ // p3
        // 										&asciidoc.NewLine{},
        // 										&asciidoc.EmptyLine{
        // 											Text: "",
        // 										},
        // 										&asciidoc.Section{
        // 											AttributeList: nil,
        // 											Elements: asciidoc.Elements{
        // 												&asciidoc.EmptyLine{
        // 													Text: "",
        // 												},
        // 												&asciidoc.Paragraph{
        // 													AttributeList: asciidoc.AttributeList{
        // 														&asciidoc.TitleAttribute{
        // 															Val: asciidoc.Elements{
        // 																&asciidoc.String{
        // 																	Value: "Inner Table",
        // 																},
        // 															},
        // 														},
        // 													},
        // 													Elements: asciidoc.Elements{
        // 														&asciidoc.String{
        // 															Value: "!===",
        // 														},
        // 														&asciidoc.NewLine{},
        // 														&asciidoc.String{
        // 															Value: "! table cell",
        // 														},
        // 														&asciidoc.NewLine{},
        // 														&asciidoc.String{
        // 															Value: "!===",
        // 														},
        // 													},
        // 													Admonition: 0,
        // 												},
        // 											},
        // 											Title: asciidoc.Elements{
        // 												&asciidoc.String{
        // 													Value: "Inner Heading",
        // 												},
        // 											},
        // 											Level: 1,
        // 										},
        // 									},
        // 									Blank: false,
        // 								},
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Outer Heading",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should allow attribute unset in parent document to be set in AsciiDoc table cell`() {
        // Input: asciidoctor/tables_test_should_allow_attribute_unset_in_parent_document_to_be_set_in_ascii_doc_table_cell.adoc
        // Expected Go AST:
        // var tablesTestShouldAllowAttributeUnsetInParentDocumentToBeSetInAsciiDocTableCell =
        // { // p0
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeReset{
        // 			Name: "sectids",
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Section{
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.Table{ // p1
        // 					AttributeList: nil,
        // 					ColumnCount:   1,
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableRow{ // p2
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.TableCell{
        // 									Format: &asciidoc.TableCellFormat{
        // 										Multiplier: asciidoc.Optional[int]{
        // 											Value: 1,
        // 											IsSet: false,
        // 										},
        // 										Span: asciidoc.TableCellSpan{
        // 											Column: asciidoc.Optional[int]{
        // 												Value: 1,
        // 												IsSet: false,
        // 											},
        // 											Row: asciidoc.Optional[int]{
        // 												Value: 1,
        // 												IsSet: false,
        // 											},
        // 										},
        // 										HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 											Value: 0,
        // 											IsSet: false,
        // 										},
        // 										VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 											Value: 0,
        // 											IsSet: false,
        // 										},
        // 										Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 											Value: 1,
        // 											IsSet: true,
        // 										},
        // 									},
        // 									Elements: asciidoc.Elements{ // p3
        // 										&asciidoc.NewLine{},
        // 										&asciidoc.EmptyLine{
        // 											Text: "",
        // 										},
        // 										&asciidoc.Section{
        // 											AttributeList: nil,
        // 											Elements: asciidoc.Elements{
        // 												&asciidoc.EmptyLine{
        // 													Text: "",
        // 												},
        // 												&asciidoc.AttributeEntry{
        // 													Name:     "sectids",
        // 													Elements: nil,
        // 												},
        // 												&asciidoc.EmptyLine{
        // 													Text: "",
        // 												},
        // 											},
        // 											Title: asciidoc.Elements{
        // 												&asciidoc.String{
        // 													Value: "No ID",
        // 												},
        // 											},
        // 											Level: 1,
        // 										},
        // 										&asciidoc.Section{
        // 											AttributeList: nil,
        // 											Elements:      nil,
        // 											Title: asciidoc.Elements{
        // 												&asciidoc.String{
        // 													Value: "Has ID",
        // 												},
        // 											},
        // 											Level: 1,
        // 										},
        // 									},
        // 									Blank: false,
        // 								},
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "No ID",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should not allow locked attribute unset in parent document to be set in AsciiDoc table cell`() {
        // Input: asciidoctor/tables_test_should_not_allow_locked_attribute_unset_in_parent_document_to_be_set_in_ascii_doc_table_cell.adoc
        // Expected Go AST:
        // var tablesTestShouldNotAllowLockedAttributeUnsetInParentDocumentToBeSetInAsciiDocTableCell =
        // { // p0
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Section{
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.Table{ // p1
        // 					AttributeList: nil,
        // 					ColumnCount:   1,
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableRow{ // p2
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.TableCell{
        // 									Format: &asciidoc.TableCellFormat{
        // 										Multiplier: asciidoc.Optional[int]{
        // 											Value: 1,
        // 											IsSet: false,
        // 										},
        // 										Span: asciidoc.TableCellSpan{
        // 											Column: asciidoc.Optional[int]{
        // 												Value: 1,
        // 												IsSet: false,
        // 											},
        // 											Row: asciidoc.Optional[int]{
        // 												Value: 1,
        // 												IsSet: false,
        // 											},
        // 										},
        // 										HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 											Value: 0,
        // 											IsSet: false,
        // 										},
        // 										VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 											Value: 0,
        // 											IsSet: false,
        // 										},
        // 										Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 											Value: 1,
        // 											IsSet: true,
        // 										},
        // 									},
        // 									Elements: asciidoc.Elements{ // p3
        // 										&asciidoc.NewLine{},
        // 										&asciidoc.EmptyLine{
        // 											Text: "",
        // 										},
        // 										&asciidoc.Section{
        // 											AttributeList: nil,
        // 											Elements: asciidoc.Elements{
        // 												&asciidoc.EmptyLine{
        // 													Text: "",
        // 												},
        // 												&asciidoc.AttributeEntry{
        // 													Name:     "sectids",
        // 													Elements: nil,
        // 												},
        // 												&asciidoc.EmptyLine{
        // 													Text: "",
        // 												},
        // 											},
        // 											Title: asciidoc.Elements{
        // 												&asciidoc.String{
        // 													Value: "No ID",
        // 												},
        // 											},
        // 											Level: 1,
        // 										},
        // 										&asciidoc.Section{
        // 											AttributeList: nil,
        // 											Elements:      nil,
        // 											Title: asciidoc.Elements{
        // 												&asciidoc.String{
        // 													Value: "Has ID",
        // 												},
        // 											},
        // 											Level: 1,
        // 										},
        // 									},
        // 									Blank: false,
        // 								},
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "No ID",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `AsciiDoc content`() {
        // Input: asciidoctor/tables_test_ascii_doc_content.adoc
        // Expected Go AST:
        // var tablesTestAsciiDocContent =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TableColumnsAttribute{
        // 					Columns: []*asciidoc.TableColumn{
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: true,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 2,
        // 								IsSet: true,
        // 							},
        // 						},
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: true,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 5,
        // 								IsSet: true,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 1,
        // 								IsSet: true,
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ColumnCount: 3,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Name",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Backends",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Description",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "\n",
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "badges",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "xhtml11, html5",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.String{
        // 									Value: "Link badges ('XHTML 1.1' and 'CSS') in document footers.",
        // 								},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.EmptyLine{
        // 									Text: "",
        // 								},
        // 								&asciidoc.ExampleBlock{
        // 									Delimiter: asciidoc.Delimiter{
        // 										Type:   3,
        // 										Length: 4,
        // 									},
        // 									AttributeList: asciidoc.AttributeList{
        // 										&asciidoc.ShorthandAttribute{
        // 											Style: &asciidoc.ShorthandStyle{
        // 												Elements: asciidoc.Elements{
        // 													&asciidoc.String{
        // 														Value: "NOTE",
        // 													},
        // 												},
        // 											},
        // 											ID:      nil,
        // 											Roles:   nil,
        // 											Options: nil,
        // 										},
        // 									},
        // 									Elements: asciidoc.Elements{
        // 										&asciidoc.String{
        // 											Value: "The path names of images, icons and scripts are relative path",
        // 										},
        // 										&asciidoc.NewLine{},
        // 										&asciidoc.String{
        // 											Value: "names to the output document not the source document.",
        // 										},
        // 										&asciidoc.NewLine{},
        // 									},
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.Anchor{
        // 									ID: asciidoc.Elements{
        // 										&asciidoc.String{
        // 											Value: "X97",
        // 										},
        // 									},
        // 									Elements: nil,
        // 								},
        // 								&asciidoc.String{
        // 									Value: " docinfo, docinfo1, docinfo2",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "All backends",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.String{
        // 									Value: "These three attributes control which document information",
        // 								},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.String{
        // 									Value: "files will be included in the the header of the output file:",
        // 								},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.EmptyLine{
        // 									Text: "",
        // 								},
        // 								&asciidoc.String{
        // 									Value: "docinfo:: Include ",
        // 								},
        // 								&asciidoc.Monospace{
        // 									AttributeList: nil,
        // 									Elements: asciidoc.Elements{
        // 										asciidoc.SpecialCharacter{
        // 											Character: "<",
        // 										},
        // 										&asciidoc.String{
        // 											Value: "filename",
        // 										},
        // 										asciidoc.SpecialCharacter{
        // 											Character: ">",
        // 										},
        // 										&asciidoc.String{
        // 											Value: "-docinfo.",
        // 										},
        // 										asciidoc.SpecialCharacter{
        // 											Character: "<",
        // 										},
        // 										&asciidoc.String{
        // 											Value: "ext",
        // 										},
        // 										asciidoc.SpecialCharacter{
        // 											Character: ">",
        // 										},
        // 									},
        // 								},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.String{
        // 									Value: "docinfo1:: Include ",
        // 								},
        // 								&asciidoc.Monospace{
        // 									AttributeList: nil,
        // 									Elements: asciidoc.Elements{
        // 										&asciidoc.String{
        // 											Value: "docinfo.",
        // 										},
        // 										asciidoc.SpecialCharacter{
        // 											Character: "<",
        // 										},
        // 										&asciidoc.String{
        // 											Value: "ext",
        // 										},
        // 										asciidoc.SpecialCharacter{
        // 											Character: ">",
        // 										},
        // 									},
        // 								},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.String{
        // 									Value: "docinfo2:: Include ",
        // 								},
        // 								&asciidoc.Monospace{
        // 									AttributeList: nil,
        // 									Elements: asciidoc.Elements{
        // 										&asciidoc.String{
        // 											Value: "docinfo.",
        // 										},
        // 										asciidoc.SpecialCharacter{
        // 											Character: "<",
        // 										},
        // 										&asciidoc.String{
        // 											Value: "ext",
        // 										},
        // 										asciidoc.SpecialCharacter{
        // 											Character: ">",
        // 										},
        // 									},
        // 								},
        // 								&asciidoc.String{
        // 									Value: " and ",
        // 								},
        // 								&asciidoc.Monospace{
        // 									AttributeList: nil,
        // 									Elements: asciidoc.Elements{
        // 										asciidoc.SpecialCharacter{
        // 											Character: "<",
        // 										},
        // 										&asciidoc.String{
        // 											Value: "filename",
        // 										},
        // 										asciidoc.SpecialCharacter{
        // 											Character: ">",
        // 										},
        // 										&asciidoc.String{
        // 											Value: "-docinfo.",
        // 										},
        // 										asciidoc.SpecialCharacter{
        // 											Character: "<",
        // 										},
        // 										&asciidoc.String{
        // 											Value: "ext",
        // 										},
        // 										asciidoc.SpecialCharacter{
        // 											Character: ">",
        // 										},
        // 									},
        // 								},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.EmptyLine{
        // 									Text: "",
        // 								},
        // 								&asciidoc.String{
        // 									Value: "Where ",
        // 								},
        // 								&asciidoc.Monospace{
        // 									AttributeList: nil,
        // 									Elements: asciidoc.Elements{
        // 										asciidoc.SpecialCharacter{
        // 											Character: "<",
        // 										},
        // 										&asciidoc.String{
        // 											Value: "filename",
        // 										},
        // 										asciidoc.SpecialCharacter{
        // 											Character: ">",
        // 										},
        // 									},
        // 								},
        // 								&asciidoc.String{
        // 									Value: " is the file name (sans extension) of the AsciiDoc",
        // 								},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.String{
        // 									Value: "input file and ",
        // 								},
        // 								&asciidoc.Monospace{
        // 									AttributeList: nil,
        // 									Elements: asciidoc.Elements{
        // 										asciidoc.SpecialCharacter{
        // 											Character: "<",
        // 										},
        // 										&asciidoc.String{
        // 											Value: "ext",
        // 										},
        // 										asciidoc.SpecialCharacter{
        // 											Character: ">",
        // 										},
        // 									},
        // 								},
        // 								&asciidoc.String{
        // 									Value: " is ",
        // 								},
        // 								&asciidoc.Monospace{
        // 									AttributeList: nil,
        // 									Elements: asciidoc.Elements{
        // 										&asciidoc.String{
        // 											Value: ".html",
        // 										},
        // 									},
        // 								},
        // 								&asciidoc.String{
        // 									Value: " for HTML outputs or ",
        // 								},
        // 								&asciidoc.Monospace{
        // 									AttributeList: nil,
        // 									Elements: asciidoc.Elements{
        // 										&asciidoc.String{
        // 											Value: ".xml",
        // 										},
        // 									},
        // 								},
        // 								&asciidoc.String{
        // 									Value: " for",
        // 								},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.String{
        // 									Value: "DocBook outputs. If the input file is the standard input then the",
        // 								},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.String{
        // 									Value: "output file name is used.",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should preserve leading indentation in contents of AsciiDoc table cell if contents starts with newline`() {
        // Input: asciidoctor/tables_test_should_preserve_leading_indentation_in_contents_of_ascii_doc_table_cell_if_contents_starts_with_newline.adoc
        // Expected Go AST:
        // var tablesTestShouldPreserveLeadingIndentationInContentsOfAsciiDocTableCellIfContentsStartsWithNewline =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: nil,
        // 			ColumnCount:   1,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 1,
        // 									IsSet: true,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.String{
        // 									Value: "$ command",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 1,
        // 									IsSet: true,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: " paragraph",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `preprocessor directive on first line of an AsciiDoc table cell should be processed`() {
        // Input: asciidoctor/tables_test_preprocessor_directive_on_first_line_of_an_ascii_doc_table_cell_should_be_processed.adoc
        // Expected Go AST:
        // var tablesTestPreprocessorDirectiveOnFirstLineOfAnAsciiDocTableCellShouldBeProcessed =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: nil,
        // 			ColumnCount:   1,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 1,
        // 									IsSet: true,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.FileInclude{
        // 									AttributeList: nil,
        // 									Elements: asciidoc.Elements{
        // 										&asciidoc.String{
        // 											Value: "fixtures/include-file.adoc",
        // 										},
        // 									},
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `error about unresolved preprocessor directive on first line of an AsciiDoc table cell should have correct cursor`() {
        // Input: asciidoctor/tables_test_error_about_unresolved_preprocessor_directive_on_first_line_of_an_ascii_doc_table_cell_should_have_correct_cursor.adoc
        // Expected Go AST:
        // var tablesTestErrorAboutUnresolvedPreprocessorDirectiveOnFirstLineOfAnAsciiDocTableCellShouldHaveCorrectCursor =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: nil,
        // 			ColumnCount:   2,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "A",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "B",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "\n",
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "text",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 1,
        // 									IsSet: true,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.FileInclude{
        // 									AttributeList: nil,
        // 									Elements: asciidoc.Elements{
        // 										&asciidoc.String{
        // 											Value: "does-not-exist.adoc",
        // 										},
        // 									},
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `cross reference link in an AsciiDoc table cell should resolve to reference in main document`() {
        // Input: asciidoctor/tables_test_cross_reference_link_in_an_ascii_doc_table_cell_should_resolve_to_reference_in_main_document.adoc
        // Expected Go AST:
        // var tablesTestCrossReferenceLinkInAnAsciiDocTableCellShouldResolveToReferenceInMainDocument =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Section{
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.Table{
        // 					AttributeList: nil,
        // 					ColumnCount:   1,
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableRow{
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.TableCell{
        // 									Format: &asciidoc.TableCellFormat{
        // 										Multiplier: asciidoc.Optional[int]{
        // 											Value: 1,
        // 											IsSet: false,
        // 										},
        // 										Span: asciidoc.TableCellSpan{
        // 											Column: asciidoc.Optional[int]{
        // 												Value: 1,
        // 												IsSet: false,
        // 											},
        // 											Row: asciidoc.Optional[int]{
        // 												Value: 1,
        // 												IsSet: false,
        // 											},
        // 										},
        // 										HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 											Value: 0,
        // 											IsSet: false,
        // 										},
        // 										VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 											Value: 0,
        // 											IsSet: false,
        // 										},
        // 										Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 											Value: 1,
        // 											IsSet: true,
        // 										},
        // 									},
        // 									Elements: asciidoc.Elements{
        // 										&asciidoc.String{
        // 											Value: "See ",
        // 										},
        // 										&asciidoc.CrossReference{
        // 											AttributeList: nil,
        // 											Elements:      nil,
        // 											ID: asciidoc.Elements{
        // 												&asciidoc.String{
        // 													Value: "_more",
        // 												},
        // 											},
        // 											Format: 0,
        // 										},
        // 									},
        // 									Blank: false,
        // 								},
        // 							},
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Some",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 		&asciidoc.Section{
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.String{
        // 					Value: "content",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "More",
        // 				},
        // 			},
        // 			Level: 1,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should discover anchor at start of cell and register it as a reference`() {
        // Input: asciidoctor/tables_test_should_discover_anchor_at_start_of_cell_and_register_it_as_a_reference.adoc
        // Expected Go AST:
        // var tablesTestShouldDiscoverAnchorAtStartOfCellAndRegisterItAsAReference =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "The highest peak in the Front Range is ",
        // 		},
        // 		&asciidoc.CrossReference{
        // 			AttributeList: nil,
        // 			Elements:      nil,
        // 			ID: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "grays-peak",
        // 				},
        // 			},
        // 			Format: 0,
        // 		},
        // 		&asciidoc.String{
        // 			Value: ", which tops ",
        // 		},
        // 		&asciidoc.CrossReference{
        // 			AttributeList: nil,
        // 			Elements:      nil,
        // 			ID: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "mount-evans",
        // 				},
        // 			},
        // 			Format: 0,
        // 		},
        // 		&asciidoc.String{
        // 			Value: " by just a few feet.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TableColumnsAttribute{
        // 					Columns: []*asciidoc.TableColumn{
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: true,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 6,
        // 								IsSet: true,
        // 							},
        // 						},
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: true,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ColumnCount: 2,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.Anchor{
        // 									ID: asciidoc.Elements{
        // 										&asciidoc.String{
        // 											Value: "mount-evans",
        // 										},
        // 									},
        // 									Elements: asciidoc.Elements{
        // 										&asciidoc.String{
        // 											Value: "Mount Evans",
        // 										},
        // 									},
        // 								},
        // 								&asciidoc.String{
        // 									Value: "Mount Evans",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "14,271 feet",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "\n",
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 3,
        // 									IsSet: true,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.Anchor{
        // 									ID: asciidoc.Elements{
        // 										&asciidoc.String{
        // 											Value: "grays-peak",
        // 										},
        // 									},
        // 									Elements: asciidoc.Elements{
        // 										&asciidoc.String{
        // 											Value: "Grays Peak",
        // 										},
        // 									},
        // 								},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.String{
        // 									Value: "Grays Peak",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "14,278 feet",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should catalog anchor at start of cell in implicit header row when column has a style`() {
        // Input: asciidoctor/tables_test_should_catalog_anchor_at_start_of_cell_in_implicit_header_row_when_column_has_a_style.adoc
        // Expected Go AST:
        // var tablesTestShouldCatalogAnchorAtStartOfCellInImplicitHeaderRowWhenColumnHasAStyle =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TableColumnsAttribute{
        // 					Columns: []*asciidoc.TableColumn{
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: true,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 1,
        // 								IsSet: true,
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ColumnCount: 1,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.Anchor{
        // 									ID: asciidoc.Elements{
        // 										&asciidoc.String{
        // 											Value: "foo",
        // 										},
        // 									},
        // 									Elements: asciidoc.Elements{
        // 										&asciidoc.String{
        // 											Value: "Foo",
        // 										},
        // 									},
        // 								},
        // 								&asciidoc.String{
        // 									Value: "* not AsciiDoc",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.EmptyLine{
        // 					Text: "\n",
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: " AsciiDoc",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should catalog anchor at start of cell in explicit header row when column has a style`() {
        // Input: asciidoctor/tables_test_should_catalog_anchor_at_start_of_cell_in_explicit_header_row_when_column_has_a_style.adoc
        // Expected Go AST:
        // var tablesTestShouldCatalogAnchorAtStartOfCellInExplicitHeaderRowWhenColumnHasAStyle =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: nil,
        // 					ID:    nil,
        // 					Roles: nil,
        // 					Options: []*asciidoc.ShorthandOption{
        // 						&asciidoc.ShorthandOption{
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "header",
        // 								},
        // 							},
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableColumnsAttribute{
        // 					Columns: []*asciidoc.TableColumn{
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: true,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 1,
        // 								IsSet: true,
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ColumnCount: 1,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.Anchor{
        // 									ID: asciidoc.Elements{
        // 										&asciidoc.String{
        // 											Value: "foo",
        // 										},
        // 									},
        // 									Elements: asciidoc.Elements{
        // 										&asciidoc.String{
        // 											Value: "Foo",
        // 										},
        // 									},
        // 								},
        // 								&asciidoc.String{
        // 									Value: "* not AsciiDoc",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: " AsciiDoc",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should catalog anchor at start of cell in first row`() {
        // Input: asciidoctor/tables_test_should_catalog_anchor_at_start_of_cell_in_first_row.adoc
        // Expected Go AST:
        // var tablesTestShouldCatalogAnchorAtStartOfCellInFirstRow =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: nil,
        // 			ColumnCount:   1,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.Anchor{
        // 									ID: asciidoc.Elements{
        // 										&asciidoc.String{
        // 											Value: "foo",
        // 										},
        // 									},
        // 									Elements: asciidoc.Elements{
        // 										&asciidoc.String{
        // 											Value: "Foo",
        // 										},
        // 									},
        // 								},
        // 								&asciidoc.String{
        // 									Value: "foo",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "bar",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `footnotes should not be shared between an AsciiDoc table cell and the main document`() {
        // Input: asciidoctor/tables_test_footnotes_should_not_be_shared_between_an_ascii_doc_table_cell_and_the_main_document.adoc
        // Expected Go AST:
        // var tablesTestFootnotesShouldNotBeSharedBetweenAnAsciiDocTableCellAndTheMainDocument =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: nil,
        // 			ColumnCount:   1,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 1,
        // 									IsSet: true,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "AsciiDoc footnote:[A lightweight markup language.]",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `callout numbers should be globally unique, including AsciiDoc table cells`() {
        // Input: asciidoctor/tables_test_callout_numbers_should_be_globally_unique_including_ascii_doc_table_cells.adoc
        // Expected Go AST:
        // var tablesTestCalloutNumbersShouldBeGloballyUniqueIncludingAsciiDocTableCells =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Section{
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.Section{
        // 					AttributeList: nil,
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.EmptyLine{
        // 							Text: "",
        // 						},
        // 						&asciidoc.Table{
        // 							AttributeList: nil,
        // 							ColumnCount:   1,
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.TableRow{
        // 									Elements: asciidoc.Elements{
        // 										&asciidoc.TableCell{
        // 											Format: &asciidoc.TableCellFormat{
        // 												Multiplier: asciidoc.Optional[int]{
        // 													Value: 1,
        // 													IsSet: false,
        // 												},
        // 												Span: asciidoc.TableCellSpan{
        // 													Column: asciidoc.Optional[int]{
        // 														Value: 1,
        // 														IsSet: false,
        // 													},
        // 													Row: asciidoc.Optional[int]{
        // 														Value: 1,
        // 														IsSet: false,
        // 													},
        // 												},
        // 												HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 													Value: 0,
        // 													IsSet: false,
        // 												},
        // 												VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 													Value: 0,
        // 													IsSet: false,
        // 												},
        // 												Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 													Value: 1,
        // 													IsSet: true,
        // 												},
        // 											},
        // 											Elements: asciidoc.Elements{
        // 												&asciidoc.NewLine{},
        // 												&asciidoc.Listing{
        // 													AttributeList: asciidoc.AttributeList{
        // 														&asciidoc.ShorthandAttribute{
        // 															Style: &asciidoc.ShorthandStyle{
        // 																Elements: asciidoc.Elements{
        // 																	&asciidoc.String{
        // 																		Value: "source",
        // 																	},
        // 																},
        // 															},
        // 															ID:      nil,
        // 															Roles:   nil,
        // 															Options: nil,
        // 														},
        // 														&asciidoc.PositionalAttribute{
        // 															Offset:      1,
        // 															ImpliedName: "",
        // 															Val: asciidoc.Elements{
        // 																&asciidoc.String{
        // 																	Value: "yaml",
        // 																},
        // 															},
        // 														},
        // 													},
        // 													Delimiter: asciidoc.Delimiter{
        // 														Type:   5,
        // 														Length: 4,
        // 													},
        // 													LineList: asciidoc.LineList{
        // 														"key: value <1>",
        // 													},
        // 												},
        // 												&asciidoc.String{
        // 													Value: "<1> First callout",
        // 												},
        // 											},
        // 											Blank: false,
        // 										},
        // 									},
        // 								},
        // 							},
        // 						},
        // 						&asciidoc.EmptyLine{
        // 							Text: "",
        // 						},
        // 					},
        // 					Title: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Section 1",
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
        // 						&asciidoc.Table{
        // 							AttributeList: nil,
        // 							ColumnCount:   1,
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.TableRow{
        // 									Elements: asciidoc.Elements{
        // 										&asciidoc.TableCell{
        // 											Format: &asciidoc.TableCellFormat{
        // 												Multiplier: asciidoc.Optional[int]{
        // 													Value: 1,
        // 													IsSet: false,
        // 												},
        // 												Span: asciidoc.TableCellSpan{
        // 													Column: asciidoc.Optional[int]{
        // 														Value: 1,
        // 														IsSet: false,
        // 													},
        // 													Row: asciidoc.Optional[int]{
        // 														Value: 1,
        // 														IsSet: false,
        // 													},
        // 												},
        // 												HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 													Value: 0,
        // 													IsSet: false,
        // 												},
        // 												VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 													Value: 0,
        // 													IsSet: false,
        // 												},
        // 												Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 													Value: 1,
        // 													IsSet: true,
        // 												},
        // 											},
        // 											Elements: asciidoc.Elements{
        // 												&asciidoc.NewLine{},
        // 												&asciidoc.Listing{
        // 													AttributeList: asciidoc.AttributeList{
        // 														&asciidoc.ShorthandAttribute{
        // 															Style: &asciidoc.ShorthandStyle{
        // 																Elements: asciidoc.Elements{
        // 																	&asciidoc.String{
        // 																		Value: "source",
        // 																	},
        // 																},
        // 															},
        // 															ID:      nil,
        // 															Roles:   nil,
        // 															Options: nil,
        // 														},
        // 														&asciidoc.PositionalAttribute{
        // 															Offset:      1,
        // 															ImpliedName: "",
        // 															Val: asciidoc.Elements{
        // 																&asciidoc.String{
        // 																	Value: "yaml",
        // 																},
        // 															},
        // 														},
        // 													},
        // 													Delimiter: asciidoc.Delimiter{
        // 														Type:   5,
        // 														Length: 4,
        // 													},
        // 													LineList: asciidoc.LineList{
        // 														"key: value <1>",
        // 													},
        // 												},
        // 												&asciidoc.String{
        // 													Value: "<1> Second callout",
        // 												},
        // 											},
        // 											Blank: false,
        // 										},
        // 									},
        // 								},
        // 							},
        // 						},
        // 						&asciidoc.EmptyLine{
        // 							Text: "",
        // 						},
        // 					},
        // 					Title: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Section 2",
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
        // 						&asciidoc.Listing{
        // 							AttributeList: asciidoc.AttributeList{
        // 								&asciidoc.ShorthandAttribute{
        // 									Style: &asciidoc.ShorthandStyle{
        // 										Elements: asciidoc.Elements{
        // 											&asciidoc.String{
        // 												Value: "source",
        // 											},
        // 										},
        // 									},
        // 									ID:      nil,
        // 									Roles:   nil,
        // 									Options: nil,
        // 								},
        // 								&asciidoc.PositionalAttribute{
        // 									Offset:      1,
        // 									ImpliedName: "",
        // 									Val: asciidoc.Elements{
        // 										&asciidoc.String{
        // 											Value: "yaml",
        // 										},
        // 									},
        // 								},
        // 							},
        // 							Delimiter: asciidoc.Delimiter{
        // 								Type:   5,
        // 								Length: 4,
        // 							},
        // 							LineList: asciidoc.LineList{
        // 								"key: value <1>",
        // 							},
        // 						},
        // 						&asciidoc.String{
        // 							Value: "<1> Third callout",
        // 						},
        // 						&asciidoc.NewLine{},
        // 					},
        // 					Title: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Section 3",
        // 						},
        // 					},
        // 					Level: 1,
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Document Title",
        // 				},
        // 			},
        // 			Level: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `compat mode can be activated in AsciiDoc table cell`() {
        // Input: asciidoctor/tables_test_compat_mode_can_be_activated_in_ascii_doc_table_cell.adoc
        // Expected Go AST:
        // var tablesTestCompatModeCanBeActivatedInAsciiDocTableCell =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: nil,
        // 			ColumnCount:   1,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 1,
        // 									IsSet: true,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.AttributeEntry{
        // 									Name:     "compat-mode",
        // 									Elements: nil,
        // 								},
        // 								&asciidoc.EmptyLine{
        // 									Text: "",
        // 								},
        // 								&asciidoc.String{
        // 									Value: "The word 'italic' is emphasized.",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `compat mode in AsciiDoc table cell inherits from parent document`() {
        // Input: asciidoctor/tables_test_compat_mode_in_ascii_doc_table_cell_inherits_from_parent_document.adoc
        // Expected Go AST:
        // var tablesTestCompatModeInAsciiDocTableCellInheritsFromParentDocument =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name:     "compat-mode",
        // 			Elements: nil,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "The word 'italic' is emphasized.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TableColumnsAttribute{
        // 					Columns: []*asciidoc.TableColumn{
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: true,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ColumnCount: 1,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "The word 'oblique' is emphasized.",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 1,
        // 									IsSet: true,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.String{
        // 									Value: "The word 'slanted' is emphasized.",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "The word 'askew' is emphasized.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `compat mode in AsciiDoc table cell can be unset if set in parent document`() {
        // Input: asciidoctor/tables_test_compat_mode_in_ascii_doc_table_cell_can_be_unset_if_set_in_parent_document.adoc
        // Expected Go AST:
        // var tablesTestCompatModeInAsciiDocTableCellCanBeUnsetIfSetInParentDocument =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.AttributeEntry{
        // 			Name:     "compat-mode",
        // 			Elements: nil,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "The word 'italic' is emphasized.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TableColumnsAttribute{
        // 					Columns: []*asciidoc.TableColumn{
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: true,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ColumnCount: 1,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "The word 'oblique' is emphasized.",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 1,
        // 									IsSet: true,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.AttributeReset{
        // 									Name: "compat-mode",
        // 								},
        // 								&asciidoc.EmptyLine{
        // 									Text: "",
        // 								},
        // 								&asciidoc.String{
        // 									Value: "The word 'slanted' is not emphasized.",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "The word 'askew' is emphasized.",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `nested table`() {
        // Input: asciidoctor/tables_test_nested_table.adoc
        // Expected Go AST:
        // var tablesTestNestedTable =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TableColumnsAttribute{
        // 					Columns: []*asciidoc.TableColumn{
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: true,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 2,
        // 								IsSet: true,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 1,
        // 								IsSet: true,
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ColumnCount: 2,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Normal cell",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Cell with nested table",
        // 								},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.Paragraph{
        // 									AttributeList: asciidoc.AttributeList{
        // 										&asciidoc.TableColumnsAttribute{
        // 											Columns: []*asciidoc.TableColumn{
        // 												&asciidoc.TableColumn{
        // 													Multiplier: asciidoc.Optional[int]{
        // 														Value: 1,
        // 														IsSet: false,
        // 													},
        // 													HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 														Value: 0,
        // 														IsSet: false,
        // 													},
        // 													VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 														Value: 0,
        // 														IsSet: false,
        // 													},
        // 													Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 														Value: 2,
        // 														IsSet: true,
        // 													},
        // 													Percentage: asciidoc.Optional[int]{
        // 														Value: 0,
        // 														IsSet: false,
        // 													},
        // 													Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 														Value: 0,
        // 														IsSet: false,
        // 													},
        // 												},
        // 												&asciidoc.TableColumn{
        // 													Multiplier: asciidoc.Optional[int]{
        // 														Value: 1,
        // 														IsSet: false,
        // 													},
        // 													HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 														Value: 0,
        // 														IsSet: false,
        // 													},
        // 													VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 														Value: 0,
        // 														IsSet: false,
        // 													},
        // 													Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 														Value: 1,
        // 														IsSet: true,
        // 													},
        // 													Percentage: asciidoc.Optional[int]{
        // 														Value: 0,
        // 														IsSet: false,
        // 													},
        // 													Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 														Value: 0,
        // 														IsSet: false,
        // 													},
        // 												},
        // 											},
        // 										},
        // 									},
        // 									Elements: asciidoc.Elements{
        // 										&asciidoc.String{
        // 											Value: "!===",
        // 										},
        // 										&asciidoc.NewLine{},
        // 										&asciidoc.String{
        // 											Value: "!Nested table cell 1 !Nested table cell 2",
        // 										},
        // 										&asciidoc.NewLine{},
        // 										&asciidoc.String{
        // 											Value: "!===",
        // 										},
        // 									},
        // 									Admonition: 0,
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `can set format of nested table to psv`() {
        // Input: asciidoctor/tables_test_can_set_format_of_nested_table_to_psv.adoc
        // Expected Go AST:
        // var tablesTestCanSetFormatOfNestedTableToPsv =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TableColumnsAttribute{
        // 					Columns: []*asciidoc.TableColumn{
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 2,
        // 								IsSet: true,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ColumnCount: 2,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "normal cell",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 1,
        // 									IsSet: true,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.Paragraph{
        // 									AttributeList: asciidoc.AttributeList{
        // 										&asciidoc.NamedAttribute{
        // 											Name: "format",
        // 											Val: asciidoc.Elements{
        // 												&asciidoc.String{
        // 													Value: "psv",
        // 												},
        // 											},
        // 											Quote: 0,
        // 										},
        // 									},
        // 									Elements: asciidoc.Elements{
        // 										&asciidoc.String{
        // 											Value: "!===",
        // 										},
        // 										&asciidoc.NewLine{},
        // 										&asciidoc.String{
        // 											Value: "!nested cell",
        // 										},
        // 										&asciidoc.NewLine{},
        // 										&asciidoc.String{
        // 											Value: "!===",
        // 										},
        // 									},
        // 									Admonition: 0,
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `AsciiDoc table cell should inherit to_dir option from parent document`() {
        // Input: asciidoctor/tables_test_ascii_doc_table_cell_should_inherit_to_dir_option_from_parent_document.adoc
        // Expected Go AST:
        // var tablesTestAsciiDocTableCellShouldInheritToDirOptionFromParentDocument =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.String{
        // 			Value: ", parse: true, to_dir: testdir",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "      |===",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "      a|",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "      AsciiDoc table cell",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "      |===",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `AsciiDoc table cell should not inherit toc setting from parent document`() {
        // Input: asciidoctor/tables_test_ascii_doc_table_cell_should_not_inherit_toc_setting_from_parent_document.adoc
        // Expected Go AST:
        // var tablesTestAsciiDocTableCellShouldNotInheritTocSettingFromParentDocument =
        // { // p0
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Section{ // p1
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.AttributeEntry{
        // 					Name:     "toc",
        // 					Elements: nil,
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
        // 						&asciidoc.Table{ // p2
        // 							AttributeList: nil,
        // 							ColumnCount:   1,
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.TableRow{ // p3
        // 									Elements: asciidoc.Elements{
        // 										&asciidoc.TableCell{
        // 											Format: &asciidoc.TableCellFormat{
        // 												Multiplier: asciidoc.Optional[int]{
        // 													Value: 1,
        // 													IsSet: false,
        // 												},
        // 												Span: asciidoc.TableCellSpan{
        // 													Column: asciidoc.Optional[int]{
        // 														Value: 1,
        // 														IsSet: false,
        // 													},
        // 													Row: asciidoc.Optional[int]{
        // 														Value: 1,
        // 														IsSet: false,
        // 													},
        // 												},
        // 												HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 													Value: 0,
        // 													IsSet: false,
        // 												},
        // 												VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 													Value: 0,
        // 													IsSet: false,
        // 												},
        // 												Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 													Value: 1,
        // 													IsSet: true,
        // 												},
        // 											},
        // 											Elements: asciidoc.Elements{ // p4
        // 												&asciidoc.NewLine{},
        // 												&asciidoc.Section{
        // 													AttributeList: nil,
        // 													Elements: asciidoc.Elements{
        // 														&asciidoc.EmptyLine{
        // 															Text: "",
        // 														},
        // 														&asciidoc.String{
        // 															Value: "content",
        // 														},
        // 													},
        // 													Title: asciidoc.Elements{
        // 														&asciidoc.String{
        // 															Value: "Section in Nested Document",
        // 														},
        // 													},
        // 													Level: 1,
        // 												},
        // 											},
        // 											Blank: false,
        // 										},
        // 									},
        // 								},
        // 							},
        // 						},
        // 					},
        // 					Title: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Section",
        // 						},
        // 					},
        // 					Level: 1,
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Document Title",
        // 				},
        // 			},
        // 			Level: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should be able to enable toc in an AsciiDoc table cell`() {
        // Input: asciidoctor/tables_test_should_be_able_to_enable_toc_in_an_ascii_doc_table_cell.adoc
        // Expected Go AST:
        // var tablesTestShouldBeAbleToEnableTocInAnAsciiDocTableCell =
        // { // p0
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Section{ // p1
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.Section{
        // 					AttributeList: nil,
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.EmptyLine{
        // 							Text: "",
        // 						},
        // 						&asciidoc.Table{ // p2
        // 							AttributeList: nil,
        // 							ColumnCount:   1,
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.TableRow{ // p3
        // 									Elements: asciidoc.Elements{
        // 										&asciidoc.TableCell{
        // 											Format: &asciidoc.TableCellFormat{
        // 												Multiplier: asciidoc.Optional[int]{
        // 													Value: 1,
        // 													IsSet: false,
        // 												},
        // 												Span: asciidoc.TableCellSpan{
        // 													Column: asciidoc.Optional[int]{
        // 														Value: 1,
        // 														IsSet: false,
        // 													},
        // 													Row: asciidoc.Optional[int]{
        // 														Value: 1,
        // 														IsSet: false,
        // 													},
        // 												},
        // 												HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 													Value: 0,
        // 													IsSet: false,
        // 												},
        // 												VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 													Value: 0,
        // 													IsSet: false,
        // 												},
        // 												Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 													Value: 1,
        // 													IsSet: true,
        // 												},
        // 											},
        // 											Elements: asciidoc.Elements{ // p4
        // 												&asciidoc.NewLine{},
        // 												&asciidoc.Section{ // p5
        // 													AttributeList: nil,
        // 													Elements: asciidoc.Elements{
        // 														&asciidoc.AttributeEntry{
        // 															Name:     "toc",
        // 															Elements: nil,
        // 														},
        // 														&asciidoc.EmptyLine{
        // 															Text: "",
        // 														},
        // 														&asciidoc.Section{
        // 															AttributeList: nil,
        // 															Elements: asciidoc.Elements{
        // 																&asciidoc.EmptyLine{
        // 																	Text: "",
        // 																},
        // 																&asciidoc.String{
        // 																	Value: "content",
        // 																},
        // 															},
        // 															Title: asciidoc.Elements{
        // 																&asciidoc.String{
        // 																	Value: "Subdocument Section A",
        // 																},
        // 															},
        // 															Level: 1,
        // 														},
        // 													},
        // 													Title: asciidoc.Elements{
        // 														&asciidoc.String{
        // 															Value: "Subdocument Title",
        // 														},
        // 													},
        // 													Level: 0,
        // 												},
        // 											},
        // 											Blank: false,
        // 										},
        // 									},
        // 								},
        // 							},
        // 						},
        // 					},
        // 					Title: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Section A",
        // 						},
        // 					},
        // 					Level: 1,
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Document Title",
        // 				},
        // 			},
        // 			Level: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should be able to enable toc in an AsciiDoc table cell even if hard unset by API`() {
        // Input: asciidoctor/tables_test_should_be_able_to_enable_toc_in_an_ascii_doc_table_cell_even_if_hard_unset_by_api.adoc
        // Expected Go AST:
        // var tablesTestShouldBeAbleToEnableTocInAnAsciiDocTableCellEvenIfHardUnsetByApi =
        // { // p0
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Section{ // p1
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.Section{
        // 					AttributeList: nil,
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.EmptyLine{
        // 							Text: "",
        // 						},
        // 						&asciidoc.Table{ // p2
        // 							AttributeList: nil,
        // 							ColumnCount:   1,
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.TableRow{ // p3
        // 									Elements: asciidoc.Elements{
        // 										&asciidoc.TableCell{
        // 											Format: &asciidoc.TableCellFormat{
        // 												Multiplier: asciidoc.Optional[int]{
        // 													Value: 1,
        // 													IsSet: false,
        // 												},
        // 												Span: asciidoc.TableCellSpan{
        // 													Column: asciidoc.Optional[int]{
        // 														Value: 1,
        // 														IsSet: false,
        // 													},
        // 													Row: asciidoc.Optional[int]{
        // 														Value: 1,
        // 														IsSet: false,
        // 													},
        // 												},
        // 												HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 													Value: 0,
        // 													IsSet: false,
        // 												},
        // 												VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 													Value: 0,
        // 													IsSet: false,
        // 												},
        // 												Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 													Value: 1,
        // 													IsSet: true,
        // 												},
        // 											},
        // 											Elements: asciidoc.Elements{ // p4
        // 												&asciidoc.NewLine{},
        // 												&asciidoc.Section{ // p5
        // 													AttributeList: nil,
        // 													Elements: asciidoc.Elements{
        // 														&asciidoc.AttributeEntry{
        // 															Name:     "toc",
        // 															Elements: nil,
        // 														},
        // 														&asciidoc.EmptyLine{
        // 															Text: "",
        // 														},
        // 														&asciidoc.Section{
        // 															AttributeList: nil,
        // 															Elements: asciidoc.Elements{
        // 																&asciidoc.EmptyLine{
        // 																	Text: "",
        // 																},
        // 																&asciidoc.String{
        // 																	Value: "content",
        // 																},
        // 															},
        // 															Title: asciidoc.Elements{
        // 																&asciidoc.String{
        // 																	Value: "Subdocument Section A",
        // 																},
        // 															},
        // 															Level: 1,
        // 														},
        // 													},
        // 													Title: asciidoc.Elements{
        // 														&asciidoc.String{
        // 															Value: "Subdocument Title",
        // 														},
        // 													},
        // 													Level: 0,
        // 												},
        // 											},
        // 											Blank: false,
        // 										},
        // 									},
        // 								},
        // 							},
        // 						},
        // 					},
        // 					Title: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Section A",
        // 						},
        // 					},
        // 					Level: 1,
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Document Title",
        // 				},
        // 			},
        // 			Level: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should be able to enable toc in both outer document and in an AsciiDoc table cell`() {
        // Input: asciidoctor/tables_test_should_be_able_to_enable_toc_in_both_outer_document_and_in_an_ascii_doc_table_cell.adoc
        // Expected Go AST:
        // var tablesTestShouldBeAbleToEnableTocInBothOuterDocumentAndInAnAsciiDocTableCell =
        // { // p0
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Section{ // p1
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.AttributeEntry{
        // 					Name:     "toc",
        // 					Elements: nil,
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
        // 						&asciidoc.Table{ // p2
        // 							AttributeList: nil,
        // 							ColumnCount:   1,
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.TableRow{ // p3
        // 									Elements: asciidoc.Elements{
        // 										&asciidoc.TableCell{
        // 											Format: &asciidoc.TableCellFormat{
        // 												Multiplier: asciidoc.Optional[int]{
        // 													Value: 1,
        // 													IsSet: false,
        // 												},
        // 												Span: asciidoc.TableCellSpan{
        // 													Column: asciidoc.Optional[int]{
        // 														Value: 1,
        // 														IsSet: false,
        // 													},
        // 													Row: asciidoc.Optional[int]{
        // 														Value: 1,
        // 														IsSet: false,
        // 													},
        // 												},
        // 												HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 													Value: 0,
        // 													IsSet: false,
        // 												},
        // 												VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 													Value: 0,
        // 													IsSet: false,
        // 												},
        // 												Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 													Value: 1,
        // 													IsSet: true,
        // 												},
        // 											},
        // 											Elements: asciidoc.Elements{ // p4
        // 												&asciidoc.NewLine{},
        // 												&asciidoc.Section{ // p5
        // 													AttributeList: nil,
        // 													Elements: asciidoc.Elements{
        // 														&asciidoc.AttributeEntry{
        // 															Name: "toc",
        // 															Elements: asciidoc.Elements{
        // 																&asciidoc.String{
        // 																	Value: "macro",
        // 																},
        // 															},
        // 														},
        // 														&asciidoc.EmptyLine{
        // 															Text: "",
        // 														},
        // 														&asciidoc.Paragraph{
        // 															AttributeList: asciidoc.AttributeList{
        // 																&asciidoc.ShorthandAttribute{
        // 																	Style: nil,
        // 																	ID: &asciidoc.ShorthandID{
        // 																		Elements: asciidoc.Elements{
        // 																			&asciidoc.String{
        // 																				Value: "table-cell-toc",
        // 																			},
        // 																		},
        // 																	},
        // 																	Roles:   nil,
        // 																	Options: nil,
        // 																},
        // 															},
        // 															Elements: asciidoc.Elements{
        // 																&asciidoc.String{
        // 																	Value: "toc::[]",
        // 																},
        // 																&asciidoc.NewLine{},
        // 															},
        // 															Admonition: 0,
        // 														},
        // 														&asciidoc.EmptyLine{
        // 															Text: "",
        // 														},
        // 														&asciidoc.Section{
        // 															AttributeList: nil,
        // 															Elements: asciidoc.Elements{
        // 																&asciidoc.EmptyLine{
        // 																	Text: "",
        // 																},
        // 																&asciidoc.String{
        // 																	Value: "content",
        // 																},
        // 															},
        // 															Title: asciidoc.Elements{
        // 																&asciidoc.String{
        // 																	Value: "Subdocument Section A",
        // 																},
        // 															},
        // 															Level: 1,
        // 														},
        // 													},
        // 													Title: asciidoc.Elements{
        // 														&asciidoc.String{
        // 															Value: "Subdocument Title",
        // 														},
        // 													},
        // 													Level: 0,
        // 												},
        // 											},
        // 											Blank: false,
        // 										},
        // 									},
        // 								},
        // 							},
        // 						},
        // 					},
        // 					Title: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Section A",
        // 						},
        // 					},
        // 					Level: 1,
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Document Title",
        // 				},
        // 			},
        // 			Level: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `document in an AsciiDoc table cell should not see doctitle of parent`() {
        // Input: asciidoctor/tables_test_document_in_an_ascii_doc_table_cell_should_not_see_doctitle_of_parent.adoc
        // Expected Go AST:
        // var tablesTestDocumentInAnAsciiDocTableCellShouldNotSeeDoctitleOfParent =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Section{
        // 			AttributeList: nil,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.EmptyLine{
        // 					Text: "",
        // 				},
        // 				&asciidoc.Table{
        // 					AttributeList: asciidoc.AttributeList{
        // 						&asciidoc.TableColumnsAttribute{
        // 							Columns: []*asciidoc.TableColumn{
        // 								&asciidoc.TableColumn{
        // 									Multiplier: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 										Value: 0,
        // 										IsSet: false,
        // 									},
        // 									VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 										Value: 0,
        // 										IsSet: false,
        // 									},
        // 									Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 										Value: 1,
        // 										IsSet: true,
        // 									},
        // 									Percentage: asciidoc.Optional[int]{
        // 										Value: 0,
        // 										IsSet: false,
        // 									},
        // 									Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 										Value: 1,
        // 										IsSet: true,
        // 									},
        // 								},
        // 							},
        // 						},
        // 					},
        // 					ColumnCount: 1,
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableRow{
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.TableCell{
        // 									Format: &asciidoc.TableCellFormat{
        // 										Multiplier: asciidoc.Optional[int]{
        // 											Value: 1,
        // 											IsSet: false,
        // 										},
        // 										Span: asciidoc.TableCellSpan{
        // 											Column: asciidoc.Optional[int]{
        // 												Value: 1,
        // 												IsSet: false,
        // 											},
        // 											Row: asciidoc.Optional[int]{
        // 												Value: 1,
        // 												IsSet: false,
        // 											},
        // 										},
        // 										HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 											Value: 0,
        // 											IsSet: false,
        // 										},
        // 										VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 											Value: 0,
        // 											IsSet: false,
        // 										},
        // 										Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 											Value: 0,
        // 											IsSet: false,
        // 										},
        // 									},
        // 									Elements: asciidoc.Elements{
        // 										&asciidoc.String{
        // 											Value: "AsciiDoc content",
        // 										},
        // 									},
        // 									Blank: false,
        // 								},
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Title: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "Document Title",
        // 				},
        // 			},
        // 			Level: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `cell background color`() {
        // Input: asciidoctor/tables_test_cell_background_color.adoc
        // Expected Go AST:
        // var tablesTestCellBackgroundColor =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TableColumnsAttribute{
        // 					Columns: []*asciidoc.TableColumn{
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: true,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 2,
        // 								IsSet: true,
        // 							},
        // 						},
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: true,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.NamedAttribute{
        // 					Name: "options",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "header",
        // 						},
        // 					},
        // 					Quote: 2,
        // 				},
        // 			},
        // 			ColumnCount: 2,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "{set:cellbgcolor:green}green",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "{set:cellbgcolor!}",
        // 								},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.String{
        // 									Value: "plain",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "{set:cellbgcolor:red}red",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "{set:cellbgcolor!}",
        // 								},
        // 								&asciidoc.NewLine{},
        // 								&asciidoc.String{
        // 									Value: "plain",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should warn if table block is not terminated`() {
        // Input: asciidoctor/tables_test_should_warn_if_table_block_is_not_terminated.adoc
        // Expected Go AST:
        // var tablesTestShouldWarnIfTableBlockIsNotTerminated =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "outside",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "|===",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "|",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "inside",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "still inside",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "eof",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should show correct line number in warning about unterminated block inside AsciiDoc table cell`() {
        // Input: asciidoctor/tables_test_should_show_correct_line_number_in_warning_about_unterminated_block_inside_ascii_doc_table_cell.adoc
        // Expected Go AST:
        // var tablesTestShouldShowCorrectLineNumberInWarningAboutUnterminatedBlockInsideAsciiDocTableCell =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "outside",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.UnorderedListItem{
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "list item",
        // 				},
        // 				&asciidoc.ListContinuation{
        // 					ChildElement: &asciidoc.Table{
        // 						AttributeList: nil,
        // 						ColumnCount:   1,
        // 						Elements: asciidoc.Elements{
        // 							&asciidoc.TableRow{
        // 								Elements: asciidoc.Elements{
        // 									&asciidoc.TableCell{
        // 										Format: &asciidoc.TableCellFormat{
        // 											Multiplier: asciidoc.Optional[int]{
        // 												Value: 1,
        // 												IsSet: false,
        // 											},
        // 											Span: asciidoc.TableCellSpan{
        // 												Column: asciidoc.Optional[int]{
        // 													Value: 1,
        // 													IsSet: false,
        // 												},
        // 												Row: asciidoc.Optional[int]{
        // 													Value: 1,
        // 													IsSet: false,
        // 												},
        // 											},
        // 											HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 												Value: 0,
        // 												IsSet: false,
        // 											},
        // 											VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 												Value: 0,
        // 												IsSet: false,
        // 											},
        // 											Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 												Value: 0,
        // 												IsSet: false,
        // 											},
        // 										},
        // 										Elements: asciidoc.Elements{
        // 											&asciidoc.String{
        // 												Value: "cell",
        // 											},
        // 										},
        // 										Blank: false,
        // 									},
        // 								},
        // 							},
        // 							&asciidoc.TableRow{
        // 								Elements: asciidoc.Elements{
        // 									&asciidoc.TableCell{
        // 										Format: &asciidoc.TableCellFormat{
        // 											Multiplier: asciidoc.Optional[int]{
        // 												Value: 1,
        // 												IsSet: false,
        // 											},
        // 											Span: asciidoc.TableCellSpan{
        // 												Column: asciidoc.Optional[int]{
        // 													Value: 1,
        // 													IsSet: false,
        // 												},
        // 												Row: asciidoc.Optional[int]{
        // 													Value: 1,
        // 													IsSet: false,
        // 												},
        // 											},
        // 											HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 												Value: 0,
        // 												IsSet: false,
        // 											},
        // 											VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 												Value: 0,
        // 												IsSet: false,
        // 											},
        // 											Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 												Value: 1,
        // 												IsSet: true,
        // 											},
        // 										},
        // 										Elements: asciidoc.Elements{
        // 											&asciidoc.String{
        // 												Value: "inside",
        // 											},
        // 											&asciidoc.NewLine{},
        // 											&asciidoc.NewLine{},
        // 											&asciidoc.String{
        // 												Value: "====",
        // 											},
        // 											&asciidoc.NewLine{},
        // 											&asciidoc.String{
        // 												Value: "unterminated example block",
        // 											},
        // 										},
        // 										Blank: false,
        // 									},
        // 								},
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			AttributeList: nil,
        // 			Indent:        "",
        // 			Marker:        "*",
        // 			Checklist:     0,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "eof",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `custom separator for an AsciiDoc table cell`() {
        // Input: asciidoctor/tables_test_custom_separator_for_an_ascii_doc_table_cell.adoc
        // Expected Go AST:
        // var tablesTestCustomSeparatorForAnAsciiDocTableCell =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TableColumnsAttribute{
        // 					Columns: []*asciidoc.TableColumn{
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.NamedAttribute{
        // 					Name: "separator",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "!",
        // 						},
        // 					},
        // 					Quote: 0,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "|===",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "!Pipe output to vim",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "a!",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 0,
        // 		},
        // 		&asciidoc.Listing{
        // 			AttributeList: nil,
        // 			Delimiter: asciidoc.Delimiter{
        // 				Type:   5,
        // 				Length: 4,
        // 			},
        // 			LineList: asciidoc.LineList{
        // 				"asciidoctor -o - -s test.adoc | view -",
        // 			},
        // 		},
        // 		&asciidoc.String{
        // 			Value: "|===",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `table with breakable option docbook 5`() {
        // Input: asciidoctor/tables_test_table_with_breakable_option_docbook_5.adoc
        // Expected Go AST:
        // var tablesTestTableWithBreakableOptionDocbook5 =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Table with breakable",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: nil,
        // 					ID:    nil,
        // 					Roles: nil,
        // 					Options: []*asciidoc.ShorthandOption{
        // 						&asciidoc.ShorthandOption{
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "breakable",
        // 								},
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ColumnCount: 2,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Item",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Quantity",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Item 1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `table with unbreakable option docbook 5`() {
        // Input: asciidoctor/tables_test_table_with_unbreakable_option_docbook_5.adoc
        // Expected Go AST:
        // var tablesTestTableWithUnbreakableOptionDocbook5 =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Table{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TitleAttribute{
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "Table with unbreakable",
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.ShorthandAttribute{
        // 					Style: nil,
        // 					ID:    nil,
        // 					Roles: nil,
        // 					Options: []*asciidoc.ShorthandOption{
        // 						&asciidoc.ShorthandOption{
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "unbreakable",
        // 								},
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			ColumnCount: 2,
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Item",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Quantity",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.TableRow{
        // 					Elements: asciidoc.Elements{
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "Item 1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 						&asciidoc.TableCell{
        // 							Format: &asciidoc.TableCellFormat{
        // 								Multiplier: asciidoc.Optional[int]{
        // 									Value: 1,
        // 									IsSet: false,
        // 								},
        // 								Span: asciidoc.TableCellSpan{
        // 									Column: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 									Row: asciidoc.Optional[int]{
        // 										Value: 1,
        // 										IsSet: false,
        // 									},
        // 								},
        // 								HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 								Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 									Value: 0,
        // 									IsSet: false,
        // 								},
        // 							},
        // 							Elements: asciidoc.Elements{
        // 								&asciidoc.String{
        // 									Value: "1",
        // 								},
        // 							},
        // 							Blank: false,
        // 						},
        // 					},
        // 				},
        // 			},
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `no implicit header row if cell in first line is quoted and spans multiple lines`() {
        // Input: asciidoctor/tables_test_no_implicit_header_row_if_cell_in_first_line_is_quoted_and_spans_multiple_lines.adoc
        // Expected Go AST:
        // var tablesTestNoImplicitHeaderRowIfCellInFirstLineIsQuotedAndSpansMultipleLines =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TableColumnsAttribute{
        // 					Columns: []*asciidoc.TableColumn{
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 2,
        // 								IsSet: true,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 4,
        // 								IsSet: true,
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: ",===",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "\"A1",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 0,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "A1 continued\",B1",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "A2,B2",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: ",===",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `converts simple dsv table`() {
        // Input: asciidoctor/tables_test_converts_simple_dsv_table.adoc
        // Expected Go AST:
        // var tablesTestConvertsSimpleDsvTable =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.NamedAttribute{
        // 					Name: "width",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "75%",
        // 						},
        // 					},
        // 					Quote: 2,
        // 				},
        // 				&asciidoc.NamedAttribute{
        // 					Name: "format",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "dsv",
        // 						},
        // 					},
        // 					Quote: 2,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "|===",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "root:x:0:0:root:/root:/bin/bash",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "bin:x:1:1:bin:/bin:/sbin/nologin",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "mysql:x:27:27:MySQL\\:Server:/var/lib/mysql:/bin/bash",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "gdm:x:42:42::/var/lib/gdm:/sbin/nologin",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "sshd:x:74:74:Privilege-separated SSH:/var/empty/sshd:/sbin/nologin",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "nobody:x:99:99:Nobody:/:/sbin/nologin",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "|===",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `dsv format shorthand`() {
        // Input: asciidoctor/tables_test_dsv_format_shorthand.adoc
        // Expected Go AST:
        // var tablesTestDsvFormatShorthand =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: ":===",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "a:b:c",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "1:2:3",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: ":===",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `single cell in DSV table should only produce single row`() {
        // Input: asciidoctor/tables_test_single_cell_in_dsv_table_should_only_produce_single_row.adoc
        // Expected Go AST:
        // var tablesTestSingleCellInDsvTableShouldOnlyProduceSingleRow =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: ":===",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "single cell",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: ":===",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should treat trailing colon as an empty cell`() {
        // Input: asciidoctor/tables_test_should_treat_trailing_colon_as_an_empty_cell.adoc
        // Expected Go AST:
        // var tablesTestShouldTreatTrailingColonAsAnEmptyCell =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: ":===",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "A1:",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "B1:B2",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "C1:C2",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: ":===",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should treat trailing comma as an empty cell`() {
        // Input: asciidoctor/tables_test_should_treat_trailing_comma_as_an_empty_cell.adoc
        // Expected Go AST:
        // var tablesTestShouldTreatTrailingCommaAsAnEmptyCell =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: ",===",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "A1,",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "B1,B2",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "C1,C2",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: ",===",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should log error but not crash if cell data has unclosed quote`() {
        // Input: asciidoctor/tables_test_should_log_error_but_not_crash_if_cell_data_has_unclosed_quote.adoc
        // Expected Go AST:
        // var tablesTestShouldLogErrorButNotCrashIfCellDataHasUnclosedQuote =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: ",===",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "a,b",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "c,\"",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: ",===",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should preserve newlines in quoted CSV values`() {
        // Input: asciidoctor/tables_test_should_preserve_newlines_in_quoted_csv_values.adoc
        // Expected Go AST:
        // var tablesTestShouldPreserveNewlinesInQuotedCsvValues =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TableColumnsAttribute{
        // 					Columns: []*asciidoc.TableColumn{
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: true,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: true,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: true,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 4,
        // 								IsSet: true,
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: ",===",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "\"A",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "B",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "C\",\"one",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 0,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "two",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "three\",\"do",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "re",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "me\"",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: ",===",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `mixed unquoted records and quoted records with escaped quotes, commas, and wrapped lines`() {
        // Input: asciidoctor/tables_test_mixed_unquoted_records_and_quoted_records_with_escaped_quotes_commas_and_wrapped_lines.adoc
        // Expected Go AST:
        // var tablesTestMixedUnquotedRecordsAndQuotedRecordsWithEscapedQuotesCommasAndWrappedLines =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.NamedAttribute{
        // 					Name: "format",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "csv",
        // 						},
        // 					},
        // 					Quote: 2,
        // 				},
        // 				&asciidoc.NamedAttribute{
        // 					Name: "options",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "header",
        // 						},
        // 					},
        // 					Quote: 2,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "|===",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "Year,Make,Model,Description,Price",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "1997,Ford,E350,\"ac, abs, moon\",3000.00",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "1999,Chevy,\"Venture \"\"Extended Edition\"\"\",\"\",4900.00",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "1999,Chevy,\"Venture \"\"Extended Edition, Very Large\"\"\",,5000.00",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "1996,Jeep,Grand Cherokee,\"MUST SELL!",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "air, moon roof, loaded\",4799.00",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "2000,Toyota,Tundra,\"\"\"This one's gonna to blow you're socks off,\"\" per the sticker\",10000.00",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "2000,Toyota,Tundra,\"Check it, \"\"this one's gonna to blow you're socks off\"\", per the sticker\",10000.00",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "|===",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should allow quotes around a CSV value to be on their own lines`() {
        // Input: asciidoctor/tables_test_should_allow_quotes_around_a_csv_value_to_be_on_their_own_lines.adoc
        // Expected Go AST:
        // var tablesTestShouldAllowQuotesAroundACsvValueToBeOnTheirOwnLines =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TableColumnsAttribute{
        // 					Columns: []*asciidoc.TableColumn{
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 2,
        // 								IsSet: true,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 					},
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: ",===",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "\"",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "A",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "\",\"",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "B",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "\"",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: ",===",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `csv format shorthand`() {
        // Input: asciidoctor/tables_test_csv_format_shorthand.adoc
        // Expected Go AST:
        // var tablesTestCsvFormatShorthand =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: ",===",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "a,b,c",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "1,2,3",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: ",===",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `custom csv separator`() {
        // Input: asciidoctor/tables_test_custom_csv_separator.adoc
        // Expected Go AST:
        // var tablesTestCustomCsvSeparator =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.NamedAttribute{
        // 					Name: "format",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: "csv",
        // 						},
        // 					},
        // 					Quote: 0,
        // 				},
        // 				&asciidoc.NamedAttribute{
        // 					Name: "separator",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: ";",
        // 						},
        // 					},
        // 					Quote: 0,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: "|===",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "a;b;c",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "1;2;3",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "|===",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 0,
        // 		},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `single cell in CSV table should only produce single row`() {
        // Input: asciidoctor/tables_test_single_cell_in_csv_table_should_only_produce_single_row.adoc
        // Expected Go AST:
        // var tablesTestSingleCellInCsvTableShouldOnlyProduceSingleRow =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: ",===",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "single cell",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: ",===",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `cell formatted with AsciiDoc style`() {
        // Input: asciidoctor/tables_test_cell_formatted_with_ascii_doc_style.adoc
        // Expected Go AST:
        // var tablesTestCellFormattedWithAsciiDocStyle =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TableColumnsAttribute{
        // 					Columns: []*asciidoc.TableColumn{
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: true,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: true,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: true,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 1,
        // 								IsSet: true,
        // 							},
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.NamedAttribute{
        // 					Name: "separator",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: ";",
        // 						},
        // 					},
        // 					Quote: 0,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: ",===",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "element;description;example",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 0,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "thematic break,a visible break; also known as a horizontal rule;---",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: ",===",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

    @Test
    @Ignore // TODO: Implement AST comparison and constructors
    fun `should strip whitespace around contents of AsciiDoc cell`() {
        // Input: asciidoctor/tables_test_should_strip_whitespace_around_contents_of_ascii_doc_cell.adoc
        // Expected Go AST:
        // var tablesTestShouldStripWhitespaceAroundContentsOfAsciiDocCell =
        // {
        // 	Elements: asciidoc.Elements{
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.Paragraph{
        // 			AttributeList: asciidoc.AttributeList{
        // 				&asciidoc.TableColumnsAttribute{
        // 					Columns: []*asciidoc.TableColumn{
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: true,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: true,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 						},
        // 						&asciidoc.TableColumn{
        // 							Multiplier: asciidoc.Optional[int]{
        // 								Value: 1,
        // 								IsSet: false,
        // 							},
        // 							HorizontalAlign: asciidoc.Optional[asciidoc.TableCellHorizontalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							VerticalAlign: asciidoc.Optional[asciidoc.TableCellVerticalAlign]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Width: asciidoc.Optional[asciidoc.TableColumnWidth]{
        // 								Value: 1,
        // 								IsSet: true,
        // 							},
        // 							Percentage: asciidoc.Optional[int]{
        // 								Value: 0,
        // 								IsSet: false,
        // 							},
        // 							Style: asciidoc.Optional[asciidoc.TableCellStyle]{
        // 								Value: 1,
        // 								IsSet: true,
        // 							},
        // 						},
        // 					},
        // 				},
        // 				&asciidoc.NamedAttribute{
        // 					Name: "separator",
        // 					Val: asciidoc.Elements{
        // 						&asciidoc.String{
        // 							Value: ";",
        // 						},
        // 					},
        // 					Quote: 0,
        // 				},
        // 			},
        // 			Elements: asciidoc.Elements{
        // 				&asciidoc.String{
        // 					Value: ",===",
        // 				},
        // 				&asciidoc.NewLine{},
        // 				&asciidoc.String{
        // 					Value: "element;description;example",
        // 				},
        // 				&asciidoc.NewLine{},
        // 			},
        // 			Admonition: 0,
        // 		},
        // 		&asciidoc.EmptyLine{
        // 			Text: "",
        // 		},
        // 		&asciidoc.String{
        // 			Value: "paragraph;contiguous lines of words and phrases;\"",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "  one sentence, one line",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: "  \"",
        // 		},
        // 		&asciidoc.NewLine{},
        // 		&asciidoc.String{
        // 			Value: ",===",
        // 		},
        // 		&asciidoc.NewLine{},
        // 	},
        // }
    }

}
