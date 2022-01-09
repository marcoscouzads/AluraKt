package Testes

import Modelo.Endereco

fun testaNullable(){
    var enderecoNulo: Endereco? = Endereco(logradouro = "rua Nova Aurora", complemento = "predio")
    val logradouroNovo: String? = enderecoNulo?.logradouro
    enderecoNulo?.let {
        println(it.logradouro.length)
        val tamanhoComplemento: Int =
            it.complemento?.length ?: throw IllegalStateException("Complemento nã pode ser vazio")
        println(tamanhoComplemento)
    }
    teste("")
    teste(1)
}

fun teste(valor: Any){
    val numero: Int? = valor as? Int
}