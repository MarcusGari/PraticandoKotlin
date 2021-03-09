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

    println(onda + "\nContando elementos entre 2000 e 5000 com .count{}:\n" + onda)
    println(salarios.count{it in 2000.0..5000.0})

    println(onda + "\nProcurando elementos iguais a 2250 e 500 com .find{}:\n" + onda)
    println(salarios.find{it == 2250.0})
    println(salarios.find{it == 500.0})

    println(onda + "\nBuscando elementos iguais a 1000 e 500 com .any{}:\n" + onda)
    println(salarios.any{it == 1000.0})
    println(salarios.any{it == 500.0})

}