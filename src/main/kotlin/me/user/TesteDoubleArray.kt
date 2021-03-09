package me.user

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 1000.0
    salarios[1] = 3000.0
    salarios[2] = 500.0

    separador("Listagem do Array tipo Double criado:")

    salarios.forEach{ println(it)}

    separador("Ajuste dos valores com .forEachIndexed{}:")
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach{ println(it)}

    separador("Criando com doubleArrayOf() e ordenando:")
    val salarios2 = doubleArrayOf(1500.0, 1250.0, 5000.0)
    salarios2.sort()
    salarios2.forEach{println(it)}

}