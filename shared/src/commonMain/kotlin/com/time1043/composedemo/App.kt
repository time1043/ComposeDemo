package com.time1043.composedemo

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    val (count, double, increment) = rememberCounterState(initialValue = 1)

    Column {
        Text(text = "$count x 2 = $double")
        Button(onClick = increment) { Text("Inc") }
    }
}