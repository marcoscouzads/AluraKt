package Modelo

import Interfaces.Autenticavel

abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
): Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
), Autenticavel{

    override fun autentica(senha: Int): Boolean {
        println("autentica Funcionario")
        if (this.senha == senha) {
            return true
        }
        return false
    }

}