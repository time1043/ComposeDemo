package com.time1043.composedemo

import kotlin.test.Test
import kotlin.test.assertEquals

class CounterStateTest {

    @Test
    fun testCounterState() {
        var count = 1
        val state = CounterState(
            count = count,
            double = count * 2,
            increment = { count++ }
        )

        // Test destructuring
        val (c, double, increment) = state
        assertEquals(1, c)
        assertEquals(2, double)

        // Test increment callback
        increment()
        assertEquals(2, count)
        // assertEquals(4, double) // error, double is not mutable
    }

    @Test
    fun testCounterState2() {
        var count = 1
        val state = CounterState(
            count = count,
            double = count * 2,
            increment = { count++ }
        )

        // Test destructuring
        val (c, double, increment) = state
        assertEquals(1, c)
        assertEquals(2, double)

        // Test increment callback
        increment()
        assertEquals(2, count)

        // Compose environment
        val newState = CounterState(
            count = count,
            double = count * 2,
            increment = {}
        )
        assertEquals(4, newState.double)
    }
}
