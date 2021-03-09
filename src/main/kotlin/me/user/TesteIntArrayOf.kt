package me.user

fun main() {
    val matriz = intArrayOf(2, 3, 4, 1, 10, 7)

    separador("Listagem do Array criado pelo comando intArrayOf:")
    matriz.forEach {
        println(it)
    }

    separador("Ordenando o 'ArrayOf' usando .sort:")
    matriz.sort()
    matriz.forEach {
        println(it)
    }

}