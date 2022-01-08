package Modelo

import Interfaces.Autenticavel

class SistemaInterno {

    fun entrar(admin: Autenticavel, senha: Int){
        if(admin.autentica(senha))
            println("Autenticação sucedida!")
        else
            println("falhar na autenticação!")
    }
}