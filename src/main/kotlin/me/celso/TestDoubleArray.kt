package me.celso

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 1500.0
    salarios[1] = 3000.0
    salarios[2] = 500.0

    println("----------------------------------")
    salarios.forEach { println(it) }

    println("----------------------------------")
    for (sal in salarios) {
        println(sal)
    }

    println("----------------------------------")
    for (i in salarios.indices) {
        println("$i - ${salarios[i]}")
    }

    println("----------------------------------")
    salarios.sort()
    salarios.forEachIndexed { i, salario ->
        salarios[i] = salario * 1.1
    }

    salarios.forEach { println(it) }

    val salarios2 = doubleArrayOf(1500.0, 1250.0, 5000.0)
    salarios2.sort()
    println("----------------------------------")
    salarios2.forEach { println(it) }

}