package me.user

fun main() {
    val joao = Funcionario("João Antônio", 2000.0, "CLT")
    val pedro = Funcionario("Pedro Henrique", 1500.0, "PJ")
    val maria = Funcionario("Maria Raimunda", 4000.0, "CLT")

    val deposito = Repositorio<Funcionario>()

    deposito.create(joao.nome, joao)
    deposito.create(pedro.nome, pedro)
    deposito.create(maria.nome, maria)

    separador("Buscando entradas pelo ID com .findById():")
    println(deposito.findById(joao.nome))

    separador("Listando todos os elementos de 'deposito' via .findAll():")
    println(deposito.findAll())

    separador("Removendo o elemento 'maria' de 'deposito' via .remove():")
    println("Elemento removido:\n" + deposito.remove(maria.nome))

    separador("Listando todos os elementos de 'deposito' com forEach{}:")
    deposito.findAll().forEach{println(it)}

}