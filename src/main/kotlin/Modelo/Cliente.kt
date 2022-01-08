package Modelo

import Interfaces.Autenticavel

class Cliente(
    var nome: String,
    val cpf: String,
    val senha: Int,
    var endereco: Endereco = Endereco()
) : Autenticavel {

    override fun autentica(senha: Int): Boolean {
        println("Autentica cliente")
        if (this.senha == senha) {
            return true
        }
        return false
    }

}