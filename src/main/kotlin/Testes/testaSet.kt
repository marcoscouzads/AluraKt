package Testes


fun testaSet() {
    val assistiramCursoAndroid = setOf("Marcos", "Pollyana", "Atila")
    val assistiramCursoKotlin = setOf("Marcio", "Marcelo", "Maria", "Aristelson", "Marcos")
    //val assistiramAmbos = mutableListOf<String>()
    val assistiramAmbos: MutableSet<String> = mutableSetOf<String>()
    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)
    assistiramAmbos.add("Ana")
    println(assistiramAmbos)

    println(assistiramCursoAndroid + assistiramCursoKotlin)
    println(assistiramCursoAndroid union assistiramCursoKotlin)

    println(assistiramCursoAndroid - assistiramCursoKotlin)
    println(assistiramCursoAndroid subtract assistiramCursoKotlin)


    println(assistiramCursoAndroid intersect assistiramCursoKotlin)

    val assistiramList = assistiramAmbos.toMutableList()
    assistiramList.add("Marcos")
    println(assistiramList[2])
    println(assistiramList)
}