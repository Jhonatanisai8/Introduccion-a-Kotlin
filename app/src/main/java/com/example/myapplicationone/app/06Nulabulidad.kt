package com.example.myapplicationone.app

fun main() {
    var nombre: String = "Aris"
    println(nombre[0])

    var applicacion: String? = null
    //println(applicacion!![0])

    var meme: String? = null
    println(meme?.get(3))

    var dia: String = "hola"
    println(dia?.get(2) ?: "es nulo")
}