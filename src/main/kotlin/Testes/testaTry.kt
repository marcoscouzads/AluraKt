package Testes

import java.lang.NumberFormatException

fun testaTry() {
    //    val a: Int? = try {parseInt("a")}catch (e: NumberFormatException){ null }

    val entrada: String = "56a"

    val valor: Double? = try {
        entrada.toDouble()

    } catch (e: NumberFormatException) {
        println("Problema na conversão")
        e.printStackTrace()
        null
    }
    if (valor != null) {
        println("valor recebido: $valor")
    } else {
        println("valor invalido")
    }

    val valoComTaxa: Double? = if (valor != null) {
        valor + 0.1
    } else {
        null
    }

    try {
        10 / 0

    } catch (e: ArithmeticException) {
        println(e.message)
        println(e.stackTrace)
        println(e.cause)
        e.printStackTrace()
        println("burrooooo!")
    }
}