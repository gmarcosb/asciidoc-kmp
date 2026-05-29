# Asciidoc KMP

This library provides a Kotlin Multiplatform (KMP) parser and renderer for Asciidoc.

## Derivation

This library is a direct Kotlin translation of the Go `asciidoc` parser and renderer found in the [project-chip/alchemy](https://github.com/project-chip/alchemy) repository. It utilizes the [Xarpeg](https://github.com/MirrgieRiana/xarpeg-kotlin-peg-parser) PEG grammar parser to implement the Asciidoc grammar rules defined in the original source, adapting the abstract syntax tree (AST) and parsing/rendering algorithms for a modern Kotlin Multiplatform environment.

## Usage

You can include this library in your Kotlin Multiplatform project using Gradle.

```kotlin
// build.gradle.kts

kotlin {
    // Target configurations (JVM, JS, Native, etc.)
    jvm()
    js(IR) { browser() }
    linuxX64()
    macosX64()
    macosArm64()
    iosX64()
    iosArm64()
    iosSimulatorArm64()

    sourceSets {
        val commonMain by getting {
            dependencies {
                // Add the Asciidoc KMP dependency
                implementation("com.kmplibs:asciidoc-kmp:<version>")
            }
        }
    }
}
```
