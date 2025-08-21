// Conditionals&Loops.kt
package edu.unicatolica.kotlin

fun main() {
    val nota = 3.7
    val estado = if (nota >= 3.0) "Aprobado" else "Reprobado"
    println("Estado: $estado")

    val edad = 20
    if (edad < 13) {
        println("Niñez")
    } else if (edad < 18) {
        println("Adolescencia")
    } else {
        println("Adultez")
    }

    val dia = 3
    when (dia) {
        1 -> println("Lunes")
        2 -> println("Martes")
        3 -> println("Miércoles")
        4 -> println("Jueves")
        5 -> println("Viernes")
        6, 7 -> println("Fin de semana")
        else -> println("Día inválido")
    }

    val puntuacion = 87
    val nivel = when (puntuacion) {
        in 90..100 -> "Excelente"
        in 80..89  -> "Muy bien"
        in 70..79  -> "Bien"
        in 0..69   -> "Mejorar"
        else       -> "Fuera de rango"
    }
    println("Nivel: $nivel")

    for (i in 1..5) {
        print("$i ")
    }
    println()

    for (i in 5 downTo 1 step 2) {
        print("$i ")
    }
    println()

    val lenguajes = listOf("Kotlin", "Java", "Swift")
    for ((index, lang) in lenguajes.withIndex()) {
        println("$index -> $lang")
    }

    var contador = 3
    while (contador > 0) {
        println("Cuenta regresiva: $contador")
        contador--
    }

    var x = 0
    do {
        println("do-while ejecuta al menos una vez. x=$x")
        x++
    } while (x < 1)

    outer@ for (i in 1..3) {
        for (j in 1..3) {
            if (i == 2 && j == 2) {
                println("Rompiendo el bucle externo en i=$i, j=$j")
                break@outer
            }
        }
    }
}