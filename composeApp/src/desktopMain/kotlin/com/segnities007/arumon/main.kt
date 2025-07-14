package com.segnities007.arumon

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Arumon",
    ) {
        App()
    }
}