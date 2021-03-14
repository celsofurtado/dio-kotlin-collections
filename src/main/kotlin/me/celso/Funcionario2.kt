package me.celso

data class Funcionario2(
    val nome: String,
    val salario: Double,
    val tipo: String
) {

    override fun toString(): String {
        return """
            Nome: $nome 
            Salário: $salario""".trimIndent()
    }

}