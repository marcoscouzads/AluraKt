package Testes

import Modelo.*


fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "marcos",
        cpf = "111.111.111-11",
        salario = 1000.00,
        senha = 1234
    )
    val diretor = Diretor(
        nome = "pollyan",
        cpf = "222.222.222-22",
        salario = 2000.00,
        senha = 4321,
        plr = 200.00
    )
    val cliente = Cliente(
        nome = "atila",
        cpf = "333.333.333-33",
        senha = 123
    )

    val sistema = SistemaInterno()
    sistema.entrar(gerente, 1234)
    sistema.entrar(diretor, 1234)
    sistema.entrar(cliente, 123)

//    val autenticavel: Autenticavel = Analista()
}