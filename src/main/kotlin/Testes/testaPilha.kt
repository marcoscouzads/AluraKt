package Testes

import exception.SaldoInsuficienteException

fun testaPilha(){
    println("Inicio main")
//    throw Exception("I am carente!")
    modulo1ByteBank()
    println("Fim main")
}

fun funcao1() {
    println("inicio funcao1")
    funcao2()
    println("fim funcao1")
}

fun funcao2() {
    println("inicio funcao2")
    for (i in 1..5) {
        println(i)
    }
    throw SaldoInsuficienteException()
    println("fim funcao2")
}