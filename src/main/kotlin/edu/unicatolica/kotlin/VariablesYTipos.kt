// VariablesYTipos.kt
package edu.unicatolica.kotlin

fun main() {
    val nombre: String = "Ana"
    var edad: Int = 22
    edad += 1

    val ciudad = "Cali"
    val temperatura = 28.5

    val entero: Int = 42
    val largo: Long = 3_000_000_000L
    val flotante: Float = 3.14f
    val doble: Double = 2.71828

    val esMayorDeEdad: Boolean = edad >= 18
    val inicial: Char = 'A'

    val suma = 10 + 5
    val resta = 10 - 3
    val producto = 7 * 6
    val division = 22 / 7.0
    val modulo = 17 % 3

    val mensaje = "Hola, $nombre. Tienes $edad años y vives en $ciudad."
    val calculo = "10 + 5 = ${10 + 5}"

    var apodo: String? = null
    apodo = "Any"
    val longitudApodo: Int? = apodo?.length
    val apodoSeguro = apodo ?: "Sin apodo"

    val numeroStr = "123"
    val numeroInt = numeroStr.toInt()
    val numeroDouble = "3.5".toDouble()

    val listaInmutable = listOf("Kotlin", "Java", "Swift")
    val listaMutable = mutableListOf(1, 2, 3)
    listaMutable.add(4)

    val conjunto = setOf(1, 2, 2, 3)
    val mapa = mapOf("CO" to "Colombia", "US" to "Estados Unidos")

    println(mensaje)
    println(calculo)
    println("¿Es mayor de edad? $esMayorDeEdad")
    println("Longitud del apodo: $longitudApodo, apodoSeguro: $apodoSeguro")
    println("listaMutable: $listaMutable, conjunto: $conjunto, mapa: $mapa")
}