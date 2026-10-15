package com.time1043.composedemo

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    var count by remember { mutableStateOf(1) }
    val double by remember { derivedStateOf { count * 2 } }

    Column {
        Text(text = "$count x 2 = $double")
        Button(onClick = { count++ }) { Text("Inc") }
    }
}