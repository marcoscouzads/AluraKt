package Testes

import Modelo.*

fun testaFuncionarios() {
    var atila = Analista(
        nome = "Atila",
        cpf = "111.111.111-11",
        salario = 1000.00
    )

    var pollyana = Gerente(
        nome = "Pollyana",
        cpf = "222.222.222-22",
        salario = 2000.00,
        senha = 1234
    )

    var marcos = Diretor(
        nome = "Marcos",
        cpf = "333.333.333-33",
        salario = 4000.00,
        senha = 4321,
        plr = 200.00
    )

    println("Bem vindo ${atila.nome} do cpf: ${atila.cpf}. Seu salário é de: ${atila.salario} e bonus de ${atila.bonificacao()}")
    println("Bem vindo ${pollyana.nome} do cpf: ${pollyana.cpf}. Seu salário é de: ${pollyana.salario} e bonus de ${pollyana.bonificacao()}")
    println(" autenticar ${pollyana.nome} ... ")
    if (pollyana.autentica(12343)) {
        println("autenticado com sucesso")
    } else {
        println("falha na autenticação")
    }
    println("Bem vindo ${marcos.nome} do cpf: ${marcos.cpf}. Seu salário é de: ${marcos.salario} e bonus de ${marcos.bonificacao()}")

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(atila)
    calculadora.registra(pollyana)
    calculadora.registra(marcos)

    println("Modelo.getTotal de bonificação dos funcionarios: ${calculadora.total}")
}
