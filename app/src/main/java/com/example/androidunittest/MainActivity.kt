package com.example.androidunittest

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.androidunittest.util.TemperatureConverter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputTemp = findViewById<EditText>(R.id.inputTemp)
        val resultText = findViewById<TextView>(R.id.resultText)
        val btnToFahrenheit = findViewById<Button>(R.id.btnToFahrenheit)
        val btnToCelsius = findViewById<Button>(R.id.btnToCelsius)

        btnToFahrenheit.setOnClickListener {
            val celsius = inputTemp.text.toString().toDoubleOrNull()
            if (celsius != null) {
                val fahrenheit = TemperatureConverter.celsiusToFahrenheit(celsius)
                resultText.text = "Hasil: $fahrenheit °F"
            } else {
                resultText.text = "Masukkan angka valid!"
            }
        }

        btnToCelsius.setOnClickListener {
            val fahrenheit = inputTemp.text.toString().toDoubleOrNull()
            if (fahrenheit != null) {
                val celsius = TemperatureConverter.fahrenheitToCelsius(fahrenheit)
                resultText.text = "Hasil: $celsius °C"
            } else {
                resultText.text = "Masukkan angka valid!"
            }
        }
    }
}
