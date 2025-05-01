package com.example.myapplicationone.app

fun main() {
    examplesArrays()
    example02()
}

fun examplesArrays() {
    println("Arreglo")
    var grupoAmigos = arrayOf("Juan", "Pedro", "Jose")
    println("Mi grupo de amigos")
    for (amigo in grupoAmigos) {
        println(amigo)
    }
    println("Tamaño del arreglo: " + grupoAmigos.size)

    if (grupoAmigos.size <= 8){
        println("El tamño es menor")
    }
    println(grupoAmigos.get(2))
}

fun example02() {
    var arregloNombres = arrayOf("lunes", "martes", "miercoles", "jueves", "viernes")
    println(arregloNombres[0])
    println(arregloNombres.size)

    println("DIAS DE LA SEMANA")
    for ((position,value) in arregloNombres.withIndex()){
        println("La posicion $position contiene $value")
    }

}