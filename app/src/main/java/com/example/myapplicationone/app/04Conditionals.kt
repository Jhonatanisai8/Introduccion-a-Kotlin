package com.example.myapplicationone.app

fun main() {
    ifStringExample()
    ifAninado()
    ifBolean()
    mayorEdad()
}

fun ifBasic() {
    println("Sentencia if-else")
    var numeroA = 12
    var numeroB = 9

    if (numeroA == numeroB) {
        println("Los numeros son iguales")
    } else {
        println("Los numeros son diferentes")
    }
}

fun ifStringExample() {
    var nombre = "David"
    if (nombre == "David") {
        println("Ingreso...")
    }
}

fun ifElseIf() {
    val tiempo = 22

    if (tiempo < 10) {
        println("Buenos dias")
    } else if (tiempo > 20) {
        println("Buen dia")
    } else {
        println("Buenas noches")
    }
}

fun ifAninado() {
    val animal = "dog"
    if (animal == "dog") {
        println("Es un perrito")
    } else if (animal == "cat") {
        println("Es un gato")
    } else if (animal == "bird") {
        println("Es un pajaro")
    } else {
        println("No es un uno de los animales aninados")
    }
}

fun ifBolean() {
    var soyFeliz = true
    if (!soyFeliz) {
        println("Estado de la persona triste")
    } else {
        println("Estado de la persona feliz")
    }
}

fun mayorEdad() {
    val edad: Int = 18

    if (edad >= 18) {
        println("Acceso permitido...")
    } else {
        println("Acceso denegado...")
    }
}

fun permisoPadres() {
    val edad = 23
    val permisoPadre: Boolean = false

    if (edad >= 18) {
        if (permisoPadre) {
            println("Puedes beber una cerveza....")
        }
    }
}


fun permisosPadresyMayorEdad() {
    val edad = 12
    val permisosPadres: Boolean = true
    if (edad == 18 && permisosPadres) {
        println("Puedes salir de casa")
    } else {
        println("No tienes los requisitos para entrar a la fiesta....")
    }
}
