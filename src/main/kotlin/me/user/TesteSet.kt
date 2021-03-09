package me.user

fun main() {
    val joao = Funcionario("João Antônio", 2000.0, "CLT")
    val pedro = Funcionario("Pedro Henrique", 1500.0, "PJ")
    val maria = Funcionario("Maria Raimunda", 4000.0, "CLT")

    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria)

    separador("Listando coleção 'funcionarios1':")
    funcionarios1.forEach{println(it)}

    separador("Listando coleção 'funcionarios2':")
    funcionarios2.forEach{println(it)}

    separador("Listando a união das duas coleções acima:")
    val uniao = funcionarios1.union(funcionarios2)
    uniao.forEach{println(it)}

    separador("Listando a união das duas coleções sem criar outra variável:")
    funcionarios1.union(funcionarios2).forEach{println(it)}

    separador("Subtraindo a coleção 'funcionarios2' da união:")
    uniao.subtract(funcionarios2).forEach{println(it)}

    separador("Listando a Interceção da coleção 'uniao' com 'funcionarios2':")
    uniao.intersect(funcionarios2).forEach{println(it)}

}