package me.user

data class Funcionario(
    val nome: String,
    val salario: Double,
    val contrato: String
) {
    override fun toString(): String =
        """
            Nome:     $nome
            Salário:  $salario
            Contrato: $contrato
            -------------------
            
        """.trimIndent()
}