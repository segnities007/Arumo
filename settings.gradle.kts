rootProject.name = "Arumon"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

include(":composeApp")
include(":core")
include(":domain")
include(":data")
include(":feature")
include(":data:repository")
include(":data:dto")
include(":data:remote")
include(":domain:remote")
include(":domain:repository")
include(":domain:model")
include(":domain:usecase")
include(":core:ui")
include(":core:common")
include(":core:navigation")
include(":data:local")
