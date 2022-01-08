package Testes

import java.math.RoundingMode

fun arraysTest() {
    val i1 = 3
    val i2 = 32
    val i3 = 33

    var envolvendoCondicao = if (i1 > i2) {
        i1
    } else {
        i2
    }
    println(envolvendoCondicao)


    val idades = IntArray(4)
    idades[0] = 4
    idades[1] = 3
    idades[2] = 2

    println(idades.indices)

    val salario = doubleArrayOf(150.0, 200.0, 250.0, 300.0)
    val aumento = 1.1

    salario.forEachIndexed { i, test ->
        salario[i] = test * aumento
    }

    println(salario.contentToString())


    val salarios = BigDecimalArrayOf("2544.56", "7845.55", "2000.00", "20042")
    println(salarios.contentToString())

    val aumento2 = "1.1".toBigDecimal()
    val salarioComAumento = salarios
        .map { salario -> calculaAumentoRelativo(salario, aumento2) }
        .toTypedArray()

    println(salarioComAumento.contentToString())

    val gastoInicial = salarioComAumento.somatoria()
    println(gastoInicial)

    val meses = 6.toBigDecimal()

    val gastoTotal = salarioComAumento.fold(gastoInicial) { acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)

    }
    println(gastoTotal)
    // fazendo ordenação dos arrays

//    val salariosOrdenados = salarioComAumento.sorted()
//    val doisUltimos = salariosOrdenados.takeLast(2).toTypedArray()
//
//
//    println(doisUltimos.contentToString())
//
//    val media = doisUltimos.media()
//    println(media)

    //resumido do codigo acima comentado...
    val media = salarioComAumento
        .sorted()
        .takeLast(2)
        .toTypedArray()
        .media()
    println(media)
}