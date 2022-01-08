package Testes

import Modelo.Livro
import Modelo.Prateleira


fun auladeListas() {
    println("***********************Inicio do MAIN***********************")


    val livros: MutableList<Livro> = mutableListOf(
        Livro(
            titulo = "abc",
            autor = "abc",
            anoPublicacao = 1900
        ),

        Livro(
            titulo = "pqr",
            autor = "pqr",
            anoPublicacao = 1980
        ),

        Livro(
            titulo = "def",
            autor = "def",
            anoPublicacao = 1920,
            editora = "editor A"
        ),

        Livro(
            titulo = "ghi",
            autor = "ghi",
            anoPublicacao = 1940
        ),

        Livro(
            titulo = "jkl",
            autor = "jkl",
            anoPublicacao = 1960,
            editora = "editor B"
        )

    )

    val livrosNulos: MutableList<Livro?> = mutableListOf(
        Livro(
            titulo = "abc",
            autor = "abc",
            anoPublicacao = 1900
        ),
        null,

        Livro(
            titulo = "pqr",
            autor = "pqr",
            anoPublicacao = 1980
        ),

        Livro(
            titulo = "def",
            autor = "def",
            anoPublicacao = 1920,
            editora = "editor A"
        ),
        null,

        Livro(
            titulo = "ghi",
            autor = "ghi",
            anoPublicacao = 1940
        ),
        null,

        Livro(
            titulo = "jkl",
            autor = "jkl",
            anoPublicacao = 1960,
            editora = "editor B"
        )

    )

    livros.add(
        Livro(
            titulo = "mno",
            autor = "mno",
            anoPublicacao = 1980
        )
    )

    println(livros)
    println()
    livros.imprimeComMarcadores()

    //o sorted retorna um List então precisamos mudar a fun imprimeComMarcadores para receber List
    // e não mais MutableList

    val ordenadoAnoPublicado: List<Livro> = livros.sorted()
    ordenadoAnoPublicado.imprimeComMarcadores()

    val ordenarPorTitulo = livros.sortedBy { it.titulo }
    ordenarPorTitulo.imprimeComMarcadores()

    val ordenarPorAutor = livros.sortedBy { it.autor }
    ordenarPorAutor.imprimeComMarcadores()


    //filtrar para pegar um determinado autor
    //com startwith posso filtrar sem precisar digitar o nome inteiro
    livros
        .filter { it.autor.startsWith("d") }
        .sortedBy { it.anoPublicacao }
        .imprimeComMarcadores()


    val titulos = livros
        .filter { it.autor.startsWith("m") }
        .sortedBy { it.anoPublicacao }
        .map { it.titulo }

    println(titulos)


    livrosNulos.imprimeComMarcadores()

    livros
        .groupBy { it.editora ?: "editora desconhecida" }
        .forEach { (editora: String?, livros: List<Livro>) ->
            println("$editora: ${livros.joinToString { it.titulo }}")
        }


    val prateleira = Prateleira(genero = "literatura", livros = livros)
    val organizarPorAutor = prateleira.organizarPorAutor()
    val organizarPorAnoPublicacao = prateleira.organizarPorAnoPublicacao()
}

fun List<Livro?>.imprimeComMarcadores() {
    val textoFormatado = this
        .filterNotNull()
        .joinToString(separator = "\n") {
            " - ${it.titulo} de ${it.autor}"
        }
    println("### Lista de Livros ### \n$textoFormatado")
}