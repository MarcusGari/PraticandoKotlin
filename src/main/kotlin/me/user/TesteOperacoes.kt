package me.user

fun main(){
    val onda = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    println(onda + "\nListagem do Array criado:\n" + onda)
    salarios.forEach{println(it)}

    println(onda + "\nPrints usando comparativos max, min e average\n" + onda)
    println("Maior salário: " + salarios.maxOrNull())
    println("Menor salário: ${salarios.minOrNull()}")
    println("Média salarial: ${salarios.average()}")

    println(onda + "\nFiltrando com .filter{}:\n" + onda)
    val maiorque2500 = salarios.filter { it > 2500.0 }
    maiorque2500.forEach{ println(it)}
}