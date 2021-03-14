package me.celso

fun main() {

    val salarios = doubleArrayOf(1000.0, 2250.0, 4500.0)

    for (salario in salarios) {
        println(salario)
    }

    println("---------------------------------")

    println("Maior salário ${salarios.max()}")
    println("Menor salário ${salarios.min()}")
    println("Média dos salários ${salarios.average()}")

    println("------------------------------- MAX MIN novo -------------------------------")
    println("------------------ Dever ser usado no lugar de max e min  ------------------")
    println("Maior salário ${salarios.maxOrNull()}")
    println("Menor salário ${salarios.minOrNull()}")

    val salarioMaiorQue2500 = salarios.filter { it > 2500.0 }

    println("---------------------------------")
    salarioMaiorQue2500.forEach { println("Maior que 2500 = $it") }

    val funcionarios = arrayListOf<Funcionario>()
    funcionarios.add(Funcionario("Ana", "454545", 5000.0))
    funcionarios.add(Funcionario("Pedro", "43322", 1000.0))
    funcionarios.add(Funcionario("Mariana", "552222", 6000.0))
    funcionarios.add(Funcionario("Bruno", "99999", 4000.0))
    funcionarios.add(Funcionario("Bruno", "99999", 4000.0))

    println("---------------------------------")
    val sal = 1000

    val funcionariosGanhaMaisQue3000 = funcionarios.filter { it.salario > sal } as ArrayList<Funcionario>
    funcionariosGanhaMaisQue3000.sortBy { it.nome }

    funcionarios.sortBy { it.nome }
    funcionarios.forEach { println("${it.nome}") }

    println("---------------------------------")
    println("Funcionarios que ganham mais que $sal")
    funcionariosGanhaMaisQue3000.forEach { println("${it.nome} - ${it.salario}") }


    println("---------------------------------")
    println(salarios.count { it in 2000.0 .. 5000.0 })

    println("---------------------------------")
    println(salarios.find { it == 2250.0 })

    println("---------------------------------")
    val fMais5000 = funcionarios.filter { it.salario >= 5000.0 }
    for (f in fMais5000){
        println(f.nome)
    }

    println((funcionarios.find { it.nome == "Bruno" })?.nome)

    println("--------------teste-------------------")
    println(funcionarios.any { it.salario > 2000 })

    println("--------------teste-------------------")
    println(funcionarios.any { it.salario > 10000 })

}