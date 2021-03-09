package me.user

fun main() {
    val joao = Funcionario("João Antônio", 2000.0, "CLT")
    val pedro = Funcionario("Pedro Henrique", 1500.0, "PJ")
    val maria = Funcionario("Maria Raimunda", 4000.0, "CLT")

    separador("Criando Lista Mutável com mutableListOf():")
    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach{println(it)}

    separador("Adicionando elemento 'pedro' com .add():")
    funcionarios.add(pedro)
    funcionarios.forEach{println(it)}

    separador("Removendo elemento 'joao' com .remove():")
    funcionarios.remove(joao)
    funcionarios.forEach{println(it)}

    separador("Criando Conjunto Mutável com mutableSetOf():")
    val funcionariosSet = mutableSetOf(joao)
    funcionariosSet.forEach{println(it)}

    separador("Adicionando elementos 'pedro' e 'maria' com .add():")
    funcionariosSet.add(pedro)
    funcionariosSet.add(maria)
    funcionariosSet.forEach{println(it)}

    separador("Removendo elemento 'maria' com .remove():")
    funcionariosSet.remove(maria)
    funcionariosSet.forEach{println(it)}

}