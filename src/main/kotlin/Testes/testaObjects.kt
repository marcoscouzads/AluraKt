package Testes

import Interfaces.Autenticavel
import Modelo.Conta

fun testaObjects() {
    //Objeto anonimo sem implementação
    val maria = object {
        val nome: String = "Maria"
        val cpf: String = "123.123.123.12"
        val senha: Int = 1010

        fun autentica(senha: Int) = this.senha == senha
    }
    println("retornando o objeto anonimo maria ${maria.nome} e ${maria.cpf} senha 1231 errada ${maria.autentica(1231)}")

//objeto anonimo com implementação
    val mario = object : Autenticavel {
        val nome: String = "Mario"
        val cpf: String = "123.123.123.12"
        val senha: Int = 1010

        override fun autentica(senha: Int) = this.senha == senha
    }
    println("retornando o objeto anonimo mario ${mario.nome} e ${mario.cpf} senha 1231 errada ${mario.autentica(1231)}")


    println("Total de contas ${Conta.total}")
}