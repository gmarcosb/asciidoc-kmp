pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "alchemy-asciidoc-kmp"

includeBuild("xarpeg") {
    dependencySubstitution {
        substitute(module("io.github.mirrgieriana:xarpeg")).using(project(":"))
    }
}
