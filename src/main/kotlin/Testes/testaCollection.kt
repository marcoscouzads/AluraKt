package Testes


class BancoDeNomes{
    val nomes: Collection<String> get() = Companion.dados.toList()

    fun salvarNome(nome: String) {
        dados.add(nome)
    }

    companion object {
        private val dados = mutableListOf<String>()
    }
}


fun testaCopia() {
    val banco = BancoDeNomes()
//    try {
//        val nomesSalvos: MutableCollection<String> =banco.nomes as MutableCollection<String>
//        nomesSalvos.add("Marcio")
//    }catch (e: ClassCastException){
//        println("Não pode tentar forçar a conversão")
//    }
//    banco.nomes.add("Marcos")

    println(banco.nomes)
    println(BancoDeNomes().nomes)
    banco.salvarNome("Marcos")
    println(banco.nomes)
    println(BancoDeNomes().nomes)
}


fun procurarEmLista(){
    val pesquisar = "juão"

    val nomes: Iterable<String> = listOf(
        "alex",
        "marcos",
        "joão",
        "maria",
        "juliana",
        "pedro"
    )

    for (nome in nomes.iterator()){
        println(nome)
    }
    if (nomes.contains("$pesquisar")) println("$pesquisar esta na lista")
    else println("$pesquisar não esta na lista")
    println("O $pesquisar esta na lista? ${nomes.contains("$pesquisar")}")
}