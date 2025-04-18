package com.example.myapplicationone.app
fun main() {
    helloWord()
    val numeroA: Int = 23
    val numeroB: Int = 89
    val suma = sum(numeroA, numeroB)
    println(suma)
    escribirMensaje(prefijo = "Log", mensaje = "Hola")
    println("Es mayor de edad: ${esMayorEdad(23)}")
    println("Es Par: ${esPar(23)}")

    val convertirNombreMayuscula = { nombre: String -> nombre.uppercase() }
    println(convertirNombreMayuscula("Jho"))

    println(unirPalabras("Hola", "Mundo"))

    restar(45)
    println("Resultado de la division: ${dividir(12, 3)}")
}

fun helloWord() {
    return println("Hola Mundo")
}

fun sum(numeroA: Int, numeroB: Int): Int {
    return numeroA + numeroB
}

fun escribirMensaje(mensaje: String, prefijo: String) {
    println("[$prefijo] $mensaje")
}

fun esMayorEdad(edad: Int): Boolean {
    return edad >= 18
}

fun esPar(numero: Int): Boolean {
    return numero % 2 == 0
}

fun unirPalabras(string01: String, string02: String): String {
    return "$string01 $string02"
}

fun restar(numeroA: Int = 34) {
    println(numeroA)
}

fun dividir(n1: Int, n2: Int): Int = n1 / n2