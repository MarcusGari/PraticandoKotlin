package me.user

fun main() {
    val onda = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"
    val salarios = DoubleArray(3)
    salarios[0] = 1000.0
    salarios[1] = 3000.0
    salarios[2] = 500.0

    println(onda + "\n Listagem do Array tipo Double criado:\n" + onda)

    salarios.forEach{ println(it)}

    println(onda + "\n Ajuste dos valores com .forEachIndexed{}:\n" + onda)
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach{ println(it)}

    println(onda + "\n Criando com doubleArrayOf() e ordenando:\n" + onda)
    val salarios2 = doubleArrayOf(1500.0, 1250.0, 5000.0)
    salarios2.sort()
    salarios2.forEach{println(it)}

}