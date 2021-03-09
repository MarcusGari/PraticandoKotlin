package me.user

fun main() {

    separador("Criando e listando pares com Pair<> e mapOf()")
    val par: Pair<String, Double> = Pair("João", 1000.0)
    val map1 = mapOf(par)
    map1.forEach{(k, v) -> println("Chave: $k - Valor: $v")}

    separador("Criando e listando pares com mapOf (key to value):")
    val map2 = mapOf(
        "Pedro" to 2500.0,
        "Maria" to 3000.0
    )
    map2.forEach{(k, v) -> println("Chave: $k - Valor: $v")}

}