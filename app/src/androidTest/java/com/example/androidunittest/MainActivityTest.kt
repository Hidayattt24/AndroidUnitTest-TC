package com.example.androidunittest

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.espresso.action.ViewActions.closeSoftKeyboard // ✅ Impor yang benar

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    var activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    /* Test case untuk memastikan input dan tombol Celsius ke Fahrenheit bekerja */
    @Test
    fun testCelsiusToFahrenheitConversion() {
        onView(withId(R.id.inputTemp)).perform(typeText("100"), closeSoftKeyboard()) // ✅ Perbaikan `closeSoftKeyboard()`
        onView(withId(R.id.btnToFahrenheit)).perform(click())
        onView(withId(R.id.resultText)).check(matches(withText("Hasil: 212.0 °F")))
    }

    /* Test case untuk memastikan input dan tombol Fahrenheit ke Celsius bekerja */
    @Test
    fun testFahrenheitToCelsiusConversion() {
        onView(withId(R.id.inputTemp)).perform(typeText("212"), closeSoftKeyboard()) // ✅ Perbaikan `closeSoftKeyboard()`
        onView(withId(R.id.btnToCelsius)).perform(click())
        onView(withId(R.id.resultText)).check(matches(withText("Hasil: 100.0 °C")))
    }
}
