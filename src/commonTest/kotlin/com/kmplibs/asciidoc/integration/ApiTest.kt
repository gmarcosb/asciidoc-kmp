package com.kmplibs.asciidoc.integration

import com.kmplibs.asciidoc.*
import kotlin.test.Test
import kotlin.test.Ignore

class ApiTest {

    @Test
    @Ignore // Tests require full manual AST object creation. Setting back to ignore due to missing functionality in AST constructors right now
    fun `should load input file`() {
        // Expected: apiTestShouldLoadInputFile
    }

    @Test
    @Ignore // TODO: Implement AST comparison
    fun `should load input string`() {
        // Input: asciidoctor/api_test_should_load_input_string.adoc
        // Expected: apiTestShouldLoadInputString
    }
}
