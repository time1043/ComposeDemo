package com.time1043.composedemo

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    var count = mutableStateOf(1)

    // Button(onClick = { count.value++ }) { Text("$count") } // MutableState(value=1)@937520472
    Button(onClick = { count.value++ }) { Text("${count.value}") }
}