package edu.unicatolica.kotlin

fun main(){
    val name: String = "Luis Vera"
    var age: Int = 25
    val carreer: String = "Tecnología en Desarrollo de software"
    val interests: String = "quiero ser backend developer, con conceptos avanzados en arquitectura de Microservicios y DevOps"

    age = 21

    var message: String

    message = "Hola mi nombre es $name, tengo $age, estudio $carreer en la universidad Catolica \ny $interests"

    println(message)
}