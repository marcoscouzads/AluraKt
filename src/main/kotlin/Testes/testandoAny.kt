package Testes

import Modelo.Endereco

fun testandoAny(){
    println()
    println(1)
    println(1.0)
    println(true)
    println("teste")

    imprime(5)
    imprime(Any())
    imprime(Unit)
}

fun imprime() {}
fun imprime(valor: Int) {}
fun imprime(valor: Double) {}
fun imprime(valor: Boolean) {}
fun imprime(valor: String) {}
fun imprime(valor: Any) : Unit { println(valor)}

//funciona com classes e ou objetos
fun imprime(endereco: Endereco) {}

