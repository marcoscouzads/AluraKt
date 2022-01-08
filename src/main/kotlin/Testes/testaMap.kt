package Testes


fun testaComportamentosMap() {
    //mapOf(1,2,3,4,5)
    val pedidos = mutableMapOf(
        1 to 10.00,
        Pair(2, 20.00),
        3 to 10.00,
        1 to 15.00
    )

    println(pedidos.getOrElse(1, {
        println("pedido não existe")
    }))

    val filtroPedido = pedidos.filter { (numero, valor) ->
        numero % 2 == 0 && valor > 15.00
    }
    println(filtroPedido)

    pedidos.putAll(
        setOf(
            4 to 50.00,
            5 to 60.00,
            6 to 70.00,
            7 to 80.00,
            8 to 90.00,
            9 to 100.00
        )
    )

    println(pedidos)

    pedidos += (listOf(15 to 200.00, 16 to 300.00))
    println(pedidos)

    pedidos.values.remove(15.0)
    println(pedidos)
}

fun testaMap(pedidos: MutableMap<Int, Double>) {
    val pedido = pedidos[2]
    pedido?.let {
        println("pedido: $it")
    }
    for (p: Map.Entry<Int, Double> in pedidos) {
        println("numero do pedido: ${p.key}")
        println("valor do pedido: ${p.value}")
    }

    pedidos[4] = 30.00
    println(pedidos)
    pedidos[6] = 50.0
    println(pedidos)

    pedidos.putIfAbsent(3, 30.00)

    pedidos.remove(6, 10.00)
    println(pedidos)
    pedidos.remove(6)
    println(pedidos)
}


fun mapas() {
    val pedidos = listOf(
        Pedido(1, 20.0),
        Pedido(2, 60.0),
        Pedido(3, 30.0),
        Pedido(4, 70.0)
    )
    println(pedidos)
//    val pedidosMapeados = pedidos.associate { pedido: Pedido ->
//        Pair(pedido.numero, pedido)
//    }
    val pedidosMapeados = pedidos.associateBy { pedido -> pedido.numero }

    println(pedidosMapeados)
    println(pedidosMapeados[1])
    println(pedidosMapeados.keys)
    println(pedidosMapeados.values)

    val pedidosFreteGratis = pedidos.associateWith { pedido ->
        pedido.valor > 50.0
    }
    println(pedidosFreteGratis)
    println(pedidosFreteGratis[Pedido(numero = 2, valor = 60.0)])

    val pedidosFreteGratisAgrupados = pedidos.groupBy { pedido: Pedido ->
        pedido.valor > 50.0
    }
    println(pedidosFreteGratisAgrupados)
    println(pedidosFreteGratisAgrupados[true])

    val nomes = listOf(
        "Alex",
        "fran",
        "gui",
        "ana",
        "paulo",
        "maria",
        "mario",
        "gisele"
    )
    val agenda = nomes.groupBy { nome ->
        nome.first()
    }
    println(nomes)
    println()
    println(agenda)
}

data class Pedido(val numero: Int, val valor: Double)
