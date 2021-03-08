package me.user

fun main() {
    val onda = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
    val matriz = intArrayOf(2, 3, 4, 1, 10, 7)

    println(onda + "\nListagem do Array criado pelo comando intArrayOf:\n" + onda)
    matriz.forEach {
        println(it)
    }

    println(onda + "\nOrdenando o 'ArrayOf' usando .sort:\n" + onda)
    matriz.sort()
    matriz.forEach {
        println(it)
    }

}