package com.example.myapplicationone.app.ejercicios
/*
En el mundo, se usan tres escalas de temperatura principales: Celsius, Fahrenheit y Kelvin.

En el código inicial que se proporciona en el siguiente fragmento de código, escribe un programa
que convierta una temperatura de una escala a otra con estas fórmulas:

De grados Celsius a Fahrenheit: °F = 9/5 (°C) + 32
Kelvin a Celsius: °C = K - 273.15
De Fahrenheit a Kelvin: K = 5/9 (°F - 32) + 273.15
Ten en cuenta que el método String.format("%.2f", /* measurement */ ) se usa para convertir
 un número en un tipo String con 2 decimales.
*/

fun main() {
    printFinalTemperature(27.00, "Celsius", "Fahrenheit") { celsius ->
        (9.0 / 5) * celsius + 32
    }

    printFinalTemperature(300.0, "Kelvin", "Celsius") { kelvin ->
        kelvin - 273.15
    }

    printFinalTemperature(80.0, "Fahrenheit", "Kelvin") { fahrenheit ->
        (5.0 / 9) * (fahrenheit - 32) + 273.15
    }
}


fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement =
        String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}