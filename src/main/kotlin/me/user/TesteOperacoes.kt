package me.user

fun main(){
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    separador("Listagem do Array criado:")
    salarios.forEach{println(it)}

    separador("Prints usando comparativos max, min e average")
    println("Maior salário: " + salarios.maxOrNull())
    println("Menor salário: ${salarios.minOrNull()}")
    println("Média salarial: ${salarios.average()}")

    separador("Filtrando com .filter{}:")
    val maiorque2500 = salarios.filter { it > 2500.0 }
    maiorque2500.forEach{ println(it)}

    separador("Contando elementos entre 2000 e 5000 com .count{}:")
    println(salarios.count{it in 2000.0..5000.0})

    separador("Procurando elementos iguais a 2250 e 500 com .find{}:")
    println(salarios.find{it == 2250.0})
    println(salarios.find{it == 500.0})

    separador("Buscando elementos iguais a 1000 e 500 com .any{}:")
    println(salarios.any{it == 1000.0})
    println(salarios.any{it == 500.0})

}