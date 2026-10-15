package com.time1043.composedemo

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

// @Composable marks a composable function:
// a function that emits UI elements in Compose
@Composable
@Preview
fun App() {
    MaterialTheme {
        var timeAtLocation by remember { mutableStateOf("No location selected") }

        // Declares the UI as a column that holds
        // a text label above a button
        Column(
            // Basic layout improvements that make sure that the Column()
            // fills all available space without overlapping the system bars
            modifier = Modifier
                .safeContentPadding()
                .fillMaxSize(),
        ) {
            // Declares a Text() that observes the timeAtLocation state
            Text(timeAtLocation)
            // Declares a Button() that also observes the timeAtLocation state
            // but shows a hardcoded time for now
            Button(onClick = { timeAtLocation = "13:30" }) {
                Text("Show Time At Location")
            }
        }
    }
}