fun main() {

    val minhaFuncaoLambda: (Int, Int) -> Int = { a, b ->
        println("executa como lambda")
        a + b
    }
    println(minhaFuncaoLambda(15, 10))

//    val minhaFuncaoAnonima: (Int, Int) -> Int = fun(a, b): Int {
//        println("executa como anonima")
//        return a + b
//    }
    val minhaFuncaoAnonima = fun(a: Int, b: Int): Int {
        println("executa como anonima")
        return a + b
    }
    println(minhaFuncaoAnonima(56, 4))

//    val calcular:(salario: Double) -> Double = lambda@{
//        if(it > 1000.0){
//            return@lambda it + 50
//        }
////        return@lambda it + 100
//         it + 100
//    }
//    println(calcular(1100.0))

    val calcular:(salario: Double) -> Double = lambda@{salario ->
        if(salario > 1000.0){
            return@lambda salario + 50
        }
//        return@lambda it + 100
        salario + 100
    }
    println(calcular(1100.0))


    val calcularAnonima: (salario: Double) -> Double = fun(salario): Double {
        if(salario > 1000.0){
            return salario + 50
        }
        return salario + 100
    }
    println(calcularAnonima(1000.0))

}

fun testaTipoFuncaoClasse() {
    val div: (Int, Int) -> Double = Divider()
    div(50, 2)
    println(div(50, 2))
}

fun testaTipoFuncaoReferencia() {
    val f: (Int, Int) -> Double = ::safeDivide

    val quotient = f(3, 2)

    println(quotient)
    println(f(9, 3))
}

fun safeDivide(num: Int, deno: Int) =
    if (deno == 0) 0.0 else num.toDouble() / deno

class Divider : (Int, Int) -> Double {
    override fun invoke(num: Int, deno: Int): Double =
        if (deno == 0) 0.0 else num.toDouble() / deno
}