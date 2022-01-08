package Testes

import Modelo.*

fun testacontasDiferente() {
    val contaCorrente = ContaCorrente(
        titular = Cliente(
            nome ="Marcos",
            cpf ="111.111.111-11",
            senha = 123,
            endereco = Endereco(
                logradouro = "Rua Pintamonhagaba"
            )
        ),
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = Cliente(
            nome = "pollyana",
            cpf = "222.222.222-22",
            senha = 123
        ),
        numero = 1001
    )
    contaPoupanca.deposita(1000.00)
    contaCorrente.deposita(1000.00)

    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupança: ${contaPoupanca.saldo}")

    contaCorrente.sacar(100.00)
    contaPoupanca.sacar(100.00)

    println("saldo corrente apos saque: ${contaCorrente.saldo}")
    println("saldo poupança apos saque: ${contaPoupanca.saldo}")

    println("Titular")
    println("nome do titular ${contaCorrente.titular.nome}")
    println("cpf do titular ${contaCorrente.titular.cpf}")
    println("endereço do titular ${contaCorrente.titular.endereco.logradouro}")

    println("Modelo.getTotal de contas $")
}