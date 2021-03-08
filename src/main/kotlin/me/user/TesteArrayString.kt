package me.user

fun main() {
    val onda = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
    val nomes = Array(3) {""}
    nomes[0] = "Maria"
    nomes[1] = "Zazá"
    nomes[2] = "José"

    println(onda + "\n Listagem do Array tipo String criado:\n" + onda)
    for(i in nomes) {
        println(i)
    }

    println(onda + "\nListagem do Array tipo String ordenado por .sort():\n" + onda)
    nomes.sort()
    nomes.forEach { println(it) }

    println(onda + "\nListagem do Array criado por arrayOf():\n" + onda)
    val nomes2 = arrayOf("Maria", "Zazá", "Pedro")
    nomes2.sort()
    nomes2.forEach {println(it)}

}