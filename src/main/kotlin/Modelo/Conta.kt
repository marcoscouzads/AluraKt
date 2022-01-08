package Modelo

import Interfaces.Autenticavel
import exception.FalhaAutenticacaoException
import exception.SaldoInsuficienteException
import java.lang.RuntimeException


abstract class Conta(
    var titular: Cliente,
    var numero: Int
) : Autenticavel {
    var saldo = 0.0
        protected set


    companion object {
        var total = 0
            private set
    }

    init {
        total++
        println("criando conta")
    }


    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha)
    }

    abstract fun sacar(valor: Double)
//        if (saldo >= valor) {
//            saldo -= valor
//            println("Saque realizado! saldo atual de ${this.saldo}")
//        } else {
//            println("ERROR! Saldo insuficiente!")
//        }


    fun tranferir(valor: Double, destino: Conta, senha: Int) {
        if (saldo < valor) {
            throw SaldoInsuficienteException(mensagem = "saldo insuficiente, saldo atual: $saldo e valor requerido: $valor")
        }
        if (! autentica(senha)){
            throw FalhaAutenticacaoException()
        }
//        throw RuntimeException()
        saldo -= valor
        destino.deposita(valor)

    }

}