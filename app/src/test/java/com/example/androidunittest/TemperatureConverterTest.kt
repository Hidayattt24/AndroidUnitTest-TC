package com.example.androidunittest

import com.example.androidunittest.util.TemperatureConverter
import org.junit.Assert.assertEquals
import org.junit.Test
import kotlin.system.measureTimeMillis

class TemperatureConverterTest {

    /* Test case untuk memastikan konversi Celsius ke Fahrenheit benar */
    @Test
    fun testCelsiusToFahrenheit() {
        val time = measureTimeMillis {
            val result = TemperatureConverter.celsiusToFahrenheit(0.0)
            assertEquals(32.0, result, 0.001)
        }
        println("Execution time for testCelsiusToFahrenheit: $time ms")
    }

    /* Test case untuk memastikan konversi Fahrenheit ke Celsius benar */
    @Test
    fun testFahrenheitToCelsius() {
        val time = measureTimeMillis {
            val result = TemperatureConverter.fahrenheitToCelsius(32.0)
            assertEquals(0.0, result, 0.001)
        }
        println("Execution time for testFahrenheitToCelsius: $time ms")
    }
}
