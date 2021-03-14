package me.celso

fun main() {

    val pair: Pair<String, Double> = Pair("João", 1000.0)
    val pair2: Pair<String, Double> = Pair("Ana", 3000.0)
    val map1 = mapOf(pair, pair2)

    println("MAP 1 ------")
    map1.forEach { (k, v) -> println("Chave: $k - Valor: $v") }
    
    val map2 = mapOf(
        "Pedro" to 2500.0,
        "Mariana" to 5000.0
    )

    println("MAP 2 ------")
    map2.forEach { (k, v) -> println("Chave: $k - Valor: $v")  }

}