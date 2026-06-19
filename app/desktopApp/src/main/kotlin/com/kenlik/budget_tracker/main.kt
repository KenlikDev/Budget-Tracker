package com.kenlik.budget_tracker

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Budget-Tracker",
    ) {
        App()
    }
}