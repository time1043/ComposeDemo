package com.time1043.composedemo

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    var count by remember { mutableStateOf(1) } // preserve across recompositions
    println("App recomposed, count is: $count") // 1, 2, 3, ...

    Button(onClick = { count++ }) { Text("$count") }
}