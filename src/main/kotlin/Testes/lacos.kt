package Testes


fun lacos() {
    for (i in 1..12 step 3) {
        if (i == 7) {
            break // para o contador(for) de vez
        }
        println("contando $i")

    }
    for (i in 10 downTo 1 step 2) {
        if (i == 4) {
            continue // ele para o contador, porem continua pulando apenas onde colocamos a condicional.
        }
        println("contando $i")
    }
    var i = 0
    while (i < 5) {
        println("contando $i")
        i++
    }

    var x = 10
    do {
        x--
        println("contando $x")
    } while (x > 0)
}