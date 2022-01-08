package Testes
//sempre usar crtl + alt + L = para formatar o codigo

import Modelo.Cliente
import Modelo.ContaCorrente
import Modelo.ContaPoupanca
import exception.FalhaAutenticacaoException
import exception.SaldoInsuficienteException

fun modulo1ByteBank() {

    println("Bem Vindo!")

    val conta1 = ContaCorrente(
        Cliente(
            "Marcos",
            "111.111.111-11",
            123
        ), 1000
    )
    conta1.deposita(100.00)

    val conta2 = ContaCorrente(
        Cliente(
            "pollyana",
            "222.222.222-22",
            123
        ), 1001
    )
    conta2.deposita(120.00)

    val conta3 = ContaPoupanca(
        Cliente(
            "Atila",
            "333.333.333-33",
            123
        ), 1002
    )
    conta3.titular.nome = "atila"


    println("Bem Vindo ${conta1.titular},conta ${conta1.numero} seu saldo é ${conta1.saldo}")
    println("depositando valor para conta")
    conta1.deposita(70.00)
    println("deposito feito, saldo atual: ${conta1.saldo}")

    println("realizar sanque da conta de 50,00 reais")
    conta1.sacar(50.00)

    println("Realizar outro saque, de 200,00 reais")
    conta1.sacar(200.00)

    println("realizando transferencia")

    try {
        conta2.tranferir(valor = 70.0, destino = conta1, senha = 123)
        println("realizado com sucesso")
    } catch (e: SaldoInsuficienteException) {
        println("ERROR na Transferencia")
        println("Saldo insuficiente")
        e.printStackTrace()
    } catch (e: FalhaAutenticacaoException) {
        println("Falha na transferencia")
        println("Falha na autenticação")
        e.printStackTrace()
    } catch (e: Exception) {
        println("erro desconhecido")
        e.printStackTrace()
    }
    println("saldo da pollyana é de ${conta2.saldo}")
    println("saldo do marcos é de ${conta1.saldo}")
}


