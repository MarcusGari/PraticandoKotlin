package me.user

fun main() {
    val onda = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
    val matriz = IntArray(5)
    matriz[0] = 1
    matriz[1] = 7
    matriz[2] = 6
    matriz[3] = 3
    matriz[4] = 2

    println(onda + "\nListagem do Array usando comando for():\n" + onda)
    for (i in matriz) {
        println(i)
    }

    println(onda + "\nListagem do Array usando comando forEach{}:\n" + onda)
    matriz.forEach { variavel ->
        println(variavel)
    }

    println(onda + "\nListagem do Array por índices usando for():\n" + onda)
    for (indice in matriz.indices) {
        println(matriz[indice])
    }

    println(onda + "\n" + "Ordenando o Array usando .sort():\n" + onda)
    matriz.sort()
    matriz.forEach {
        println(it)
    }


}