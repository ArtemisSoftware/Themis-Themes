package com.artemissoftware.themisthemes

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.artemissoftware.themisthemes.di.initKoin

fun main() {
    initKoin()
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "ThemisThemes",
        ) {
            App()
        }
    }
}