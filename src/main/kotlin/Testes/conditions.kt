package Testes


fun conditions(idade: Int) {
    if (idade in 18..64) {
        println("Obrigatorio votar")
    } else if (idade in 16..17 || idade >= 65) {
        println("Votar é opcional")
    } else {
        println("Não pode Votar ")
    }

    when {
        idade in 18..64 -> println("Obrigatorio votar")
        idade in 16..17 || idade >= 65 -> println("Votar é opcional")
        else -> println("Não pode Votar ")
    }
}