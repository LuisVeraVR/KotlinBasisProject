package edu.unicatolica.kotlin

fun main() {
        val edad: Byte = 25
        val año: Short = 2025
        val habitantes: Int = 1_500_000
        val distancia: Long = 9_460_730_472_580

        val pi: Float = 3.1416f
        val gravedad: Double = 9.80665

        val letra: Char = 'K'
        val activo: Boolean = true

        val saludo: String = "Hola Kotlin"

        val suma = edad + año
        val division = habitantes / 1000
        val multiplicacion = pi * 2
        val comparacion = gravedad > 9.0

        println("Edad + Año = $suma")
        println("Habitantes/1000 = $division")
        println("PI * 2 = $multiplicacion")
        println("¿La gravedad > 9? $comparacion")
        println("Letra: $letra, Activo: $activo")
        println("Saludo: $saludo")
}
