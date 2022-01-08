package Testes

import java.math.BigDecimal
import java.math.RoundingMode

fun Array<BigDecimal>.somatoria() : BigDecimal {
    return this.reduce { acumulador, valor ->
        acumulador + valor
    }
}

fun Array<BigDecimal>.fatorial() : BigDecimal {
    return this.reduce { acumulador, valor ->
        acumulador * valor
    }
}

fun Array<BigDecimal>.media() : BigDecimal {

    return if(this.isEmpty()){
        BigDecimal.ZERO
    }else{
        // calculando uma media simples
        this.somatoria() / this.size.toBigDecimal()
    }
}


fun calculaAumentoRelativo(salario: BigDecimal, aumento: BigDecimal) =
    if (salario < "5000.00".toBigDecimal()) {
        salario + "500".toBigDecimal()
    } else {
        (salario * aumento).setScale(2, RoundingMode.UP)
    }

fun BigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    return Array<BigDecimal>(valores.size) { i ->
        valores[i].toBigDecimal()
    }
}