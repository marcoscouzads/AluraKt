package Testes

fun TestesListasInicio() {
    val pares = 0..100 step 2
    for (n in pares) print("$n ")
    println()
    println()
    println()
    val regredir = 100 downTo 0
    // esse codigo faz a mesma coisa que o for
    regredir.forEach { print("$it ") }
    println()

    for (n in regredir) {
        if (n == 50) println()
        print("$n ")
    }
    println()

    val intervalo = 150..500
    val testar = 300

    if (testar in intervalo) println("Esta contido")
    else println("Não estar contido")
    println()

    val idades = intArrayOf(10, 12, 15, 20, 22, 46, 95, 51, 40, 18, 45, 21, 54, 78, 99, 55, 44, 66)
    val maiorIdade = idades.maxOrNull()
    val menorIdade = idades.minOrNull()
    val mediaIdade = idades.average()
    val ultimaIdade = idades.last()
    val primeiraIdade = idades.first()
    println("Maior: $maiorIdade \n,Menor: $menorIdade \n,Média $mediaIdade \n,Primeiro $primeiraIdade \n,Ultimo $ultimaIdade \n")

    val todosMaiores = idades.all { it >= 18 }
    println("todos maiores de 18? $todosMaiores")

    val umMaior = idades.any { it >= 18 }
    println("qualquer um maior de 18? $umMaior")

    val maiores = idades.filter { it >= 18 }
    println("Só os maiores ${maiores.size} ")
    println("quem são os maiores $maiores")

    val idadeVelho = idades.find { it == 75 } ?: "não achou e veio null"
    println("achou alguem com 75? $idadeVelho")
}