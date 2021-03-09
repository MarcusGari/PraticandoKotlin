package me.user

fun main() {
    val nomes = Array(3) {""}
    nomes[0] = "Maria"
    nomes[1] = "Zazá"
    nomes[2] = "José"

    separador("Listagem do Array tipo String criado:")
    for(i in nomes) {
        println(i)
    }

    separador("Listagem do Array tipo String ordenado por .sort():")
    nomes.sort()
    nomes.forEach { println(it) }

    separador("Listagem do Array criado por arrayOf():")
    val nomes2 = arrayOf("Maria", "Zazá", "Pedro")
    nomes2.sort()
    nomes2.forEach {println(it)}

}