package Testes

import Modelo.Cliente
import Modelo.ContaCorrente
import Modelo.ContaPoupanca


fun testaCopiaeReferencias() {

    val conta1 = ContaCorrente(titular = Cliente("Marcos", "111.111",123), numero = 1564)
    //conta1.saldo = 60.0

    val conta2 = ContaPoupanca(titular = Cliente("pollyana","111",123), numero = 1234)

    println(conta1.titular.nome)
    println(conta2.titular.nome)

    val ct1 = ContaCorrente(titular = Cliente("teste","",1), numero = 1)
    var ct2 = ct1
    ct2.numero = 2

    println(ct1.numero)
    println(ct2.numero)


}