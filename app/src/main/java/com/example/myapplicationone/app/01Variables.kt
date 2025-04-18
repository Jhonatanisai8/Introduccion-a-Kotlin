package com.example.myapplicationone.app
/*
VARIABLES EN KOTLIN
 */
fun main() {
    println("Hola Mundo")

    //variables de tipo numericas
    println("VARIABLES NUMERICAS")
    val age02: Int = 30
    val exampleLong: Long = 1200
    val exampleFloat: Float = 340.34F
    val exampleDouble: Double = 12333.23
    println(age02)
    println(exampleFloat)
    println(exampleLong)
    println(exampleDouble)

    //VARIABLES ALFANUMERICAS
    println("VARIABLES ALFANUMERICAS")
    val charExample: Char = 'A'
    val charExample02: Char = '$'
    val charExample03: Char = '2'
    println(charExample03)
    println(charExample02)
    println(charExample)

    val stringExample = "Jhon Doe"
    println(stringExample)

    //VARIABLES DE TIPO BOLEANAS
    val booleanExample: Boolean = false
    val booleanExample02: Boolean = true
    println(booleanExample)
    println(booleanExample02)

    //VARIABLE MUTABLES
    var myName = "Juan"
    println(myName)
    myName = "Doe"
    println(myName)
    //VARIABLES INMUTABLES
    val myFirstName = "Perez"
    println(myFirstName)
}