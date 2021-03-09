package me.user

fun main(){
    val joao = Funcionario("João Antônio", 2000.0)
    val pedro = Funcionario("Pedro Henrique", 1500.0)
    val maria = Funcionario("Maria Raimunda", 4000.0)

    val funcionarios = listOf(joao, pedro, maria)

    separador("Listagem de todas as entradas em 'funcionarios':")
    funcionarios.forEach{println(it)}

    separador("Buscando 'Maria Raimunda' em 'funcionarios' com .find{}:")
    println(funcionarios.find{it.nome == "Maria Raimunda"})

    separador("Ordenando coleção com .sortedBy{}:")
    funcionarios.sortedBy{it.salario}.forEach{println(it)}

}

data class Funcionario(
    val nome: String,
    val salario: Double
) {
    override fun toString(): String =
        """
            Nome:    $nome
            Salário: $salario
            -------------------
        """.trimIndent()
}