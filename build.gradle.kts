plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.androidLibrary) apply false
    alias(libs.plugins.composeHotReload) apply false
    alias(libs.plugins.composeMultiplatform) apply false
    alias(libs.plugins.composeCompiler) apply false
    alias(libs.plugins.kotlinMultiplatform) apply false
    alias(libs.plugins.kotlinAndroid) apply false
    alias(libs.plugins.androidKotlinMultiplatformLibrary) apply false
    id("com.google.devtools.ksp") version "2.2.0-2.0.2" apply false
    id("androidx.room") version "2.7.2" apply false
    id("org.jetbrains.kotlin.plugin.serialization") version "2.2.0" apply false
}
