package com.example.myapplicationone.app

fun main() {
    val diames = 13
    println(obtenerMes(diames))
    println(obtenerTrimistre(diames))
    obtenerTrimestre02(diames)
    exampleResultado(23)
}

fun obtenerMes(diaMes: Int): String {
    return when (diaMes) {
        1 -> "Enero"
        2 -> "Febrero"
        3 -> "Marzo"
        4 -> "Abril"
        5 -> "Mayo"
        6 -> "Junio"
        7 -> "Julio"
        8 -> "Agosto"
        9 -> "Septiembre"
        10 -> "Octubre"
        11 -> "Noviembre"
        12 -> "Diciembre"
        else -> "No se encontró"
    }
}

fun obtenerTrimistre(diaMes: Int): String {
    return when (diaMes) {
        1,
        2,
        3 -> "Primer Trimestre"

        4,
        5,
        6 -> "Segundo Trimestre"

        7,
        8,
        9 -> "Tercer Trimestre"

        10,
        11,
        12 -> "Cuarto Trimestre"

        else -> "No se encontró"
    }
}

fun obtenerTrimestre02(diaMes: Int) {
    when (diaMes) {
        in 1..3 -> println("PRIMER TRIMESTRE")
        in 4..5 -> println("SEGUNDO TRIMESTRE")
        in 6..9 -> println("TERCERO TRIMESTRE")
        in 10..12 -> println("CUARTO TRIMESTRE")
        !in 1..12 -> println("SEMESTRE NO ENCONTRADO")
    }
}

fun exampleResultado(valor: Any) {
    when (valor) {
        is Int -> valor + valor
        is String -> println(valor)
        is Boolean -> if (valor) println("Hola")
    }
}