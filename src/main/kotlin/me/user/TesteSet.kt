package me.user

fun main() {
    val joao = Funcionario("João Antônio", 2000.0, "CLT")
    val pedro = Funcionario("Pedro Henrique", 1500.0, "PJ")
    val maria = Funcionario("Maria Raimunda", 4000.0, "CLT")

    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria)

    separador("Listando o SET 'funcionarios1':")
    funcionarios1.forEach{println(it)}

    separador("Listando o SET 'funcionarios2':")
    funcionarios2.forEach{println(it)}

    separador("Listando a união dos dois SETs acima:")
    val uniao = funcionarios1.union(funcionarios2)
    uniao.forEach{println(it)}

    separador("Listando a união dos dois SETs sem criar outra variável:")
    funcionarios1.union(funcionarios2).forEach{println(it)}

    separador("Subtraindo o SET 'funcionarios2' do união:")
    uniao.subtract(funcionarios2).forEach{println(it)}

    separador("Listando a Interceção do SET 'uniao' com 'funcionarios2':")
    uniao.intersect(funcionarios2).forEach{println(it)}

}