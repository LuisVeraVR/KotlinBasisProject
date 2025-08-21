package edu.unicatolica.kotlin

fun main() {
    print("Ingrese el notas del estudiante: ")
    val n = readln().toInt()

    var suma = 0.0


    var notaMax = Double.NEGATIVE_INFINITY
    var notaMin = Double.POSITIVE_INFINITY

    for (i in 1..n) {
        val nota = leerNotaValida(i)
        suma += nota

        if (nota > notaMax) notaMax = nota
        if (nota < notaMin) notaMin = nota
    }

    val promedio = suma / n
    val clasificacion = when {
        promedio >= 4.5 -> "Excelente"
        promedio >= 4.0 -> "Muy bien"
        promedio >= 3.0 -> "Aprobado"
        else            -> "Reprobado"
    }

    println("\n--- Resultados ---")
    println("Promedio: ${"%.2f".format(promedio)}")
    println("Nota máxima: ${"%.2f".format(notaMax)}")
    println("Nota mínima: ${"%.2f".format(notaMin)}")
    println("Clasificación del promedio: $clasificacion")
}

private fun leerNotaValida(indice: Int): Double {
    while (true) {
        print("Nota $indice del estudiante (0.0 a 5.0): ")
        val entrada = readln()
        val valor = entrada.toDoubleOrNull()

        if (valor != null && valor in 0.0..5.0) {
            return valor
        } else {
            println("Entrada inválida. Intente de nuevo.")
        }
    }
}