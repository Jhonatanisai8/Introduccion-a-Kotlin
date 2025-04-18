package com.example.myapplicationone.app
fun main() {
    var numeroA = 30
    var numeroB = 2
    val suma = numeroB + numeroA
    val resta = numeroA - numeroB
    val multiplicacion = numeroB * numeroA
    val division = numeroB / numeroA
    val modulo = numeroA % numeroB

    println(suma)
    println(resta)
    println(multiplicacion)
    println(division)
    println(modulo)

    var precioLong: Long = 23
    val suma02 = numeroB + precioLong
    println(suma02.toInt())

    var ciudad = "Bogoto"
    var pais = "Colombia"

    val resultadoPaisCiudad = ciudad + pais
    println(resultadoPaisCiudad)

    var lenguajeProgramacoin: String = "Kotlin"
    println(lenguajeProgramacoin.equals("Kotlin"))
    println(lenguajeProgramacoin == "Kotlin")

    val soyMayorEdad = true
    println("Hola me llamo Jhon Doe  y vivo en $ciudad en el pais $pais")

    var promedioNotas: String = precioLong.toString()
    println(promedioNotas)
}