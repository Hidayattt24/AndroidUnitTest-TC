package com.example.androidunittest

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.androidunittest.util.TemperatureConverter
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class TemperatureConverterInstrumentedTest {

    /* Test instrumental: Konversi Celsius ke Fahrenheit di lingkungan Android */
    @Test
    fun testCelsiusToFahrenheit_Instrumented() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = TemperatureConverter.celsiusToFahrenheit(100.0)
        assertEquals(212.0, result, 0.001)
    }

    /* Test instrumental: Konversi Fahrenheit ke Celsius di lingkungan Android */
    @Test
    fun testFahrenheitToCelsius_Instrumented() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = TemperatureConverter.fahrenheitToCelsius(212.0)
        assertEquals(100.0, result, 0.001)
    }
}
