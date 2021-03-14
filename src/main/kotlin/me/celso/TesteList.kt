package me.celso

fun main() {
    val joao = Funcionario2("João da Silva", 2000.0, "CLT")
    val pedro = Funcionario2("Pedro Oliveira", 1500.0, "PJ")
    val maria = Funcionario2("Maria Gomes", 4000.0, "CLT")
    val ana = Funcionario2("Ana", 800.0, "CLT")

    val funcionarios = listOf(joao, pedro, maria, ana)

    println("-> ITERAR--------------------------------------")
    funcionarios.forEach { println(it.toString()) }

    println("-> ITERAR COM BUSCA----------------------------")
    println(funcionarios.find { it.nome == "Maria Gomes" })

    println("->ITERAR ORDENANDO POR SALARIO----------------")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("->ITERAR AGRUPANDO POR TIPO-------------------")
    funcionarios
        .groupBy { it.tipo }
        .forEach { println(it) }

    println("->ITERAR COM UNION ---------------------------")
    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria, ana)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach { println(it) }

    println("->ITERAR COM SUBTRACT-------------------------")
    val funcionarios3 = setOf(joao, pedro, maria, ana)
    val resultSubstract = funcionarios1.subtract(funcionarios2)
    resultSubstract.forEach { println(it) }

    println("->ITERAR COM INTERSECT-------------------------")
    val resultIntercect = funcionarios3.intersect(funcionarios2)
    resultIntercect.forEach { println(it) }
}

