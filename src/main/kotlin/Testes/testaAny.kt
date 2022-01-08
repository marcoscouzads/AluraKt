package Testes

import Modelo.Endereco

fun testaAny() {
    val endereco = Endereco("rua nova aurora", 199, "nova aurora", "belford roxo", "RJ", "26155-070", "nenhum")
    val enderecoNovo = Endereco(cidade = "belfor", cep = "26155-0701")

    println(endereco.toString())
    println(enderecoNovo.toString())

    println(endereco.equals(enderecoNovo))
}