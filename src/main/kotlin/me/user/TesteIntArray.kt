package me.user

fun main() {
    val linha = "------------------------------------"
    val matriz = IntArray(5)
    matriz[0] = 1
    matriz[1] = 7
    matriz[2] = 6
    matriz[3] = 3
    matriz[4] = 2

    println(linha)
    println("Listagem do Array usando comando for")
    println(linha)
    for (valor in matriz) {
        println(valor)
    }

    println(linha)
    println("Listagem do Array usando comando forEach")
    println(linha)
    matriz.forEach {
        println(it)
    }

    println(linha)
    println("Listagem do Array por índices usando for")
    println(linha)
    for (indice in matriz.indices) {
        println(matriz[indice])
    }

}