package com.time1043.composedemo

import androidx.compose.runtime.*

data class CounterState(
    val count: Int,
    val double: Int,
    val increment: () -> Unit
)

// like useCounter()
@Composable
fun rememberCounterState(initialValue: Int = 1): CounterState {
    var count by remember { mutableStateOf(initialValue) }
    val double by remember { derivedStateOf { count * 2 } }

    return remember(count, double) {
        CounterState(
            count = count,
            double = double,
            increment = { count++ }
        )
    }
}