package me.user
//  window.open((document.getElementsByTagName('iframe')[0].attributes.src.value).replace('controls=0', 'controls=1'))

fun separador(mensagem:String){
    val linha = "^"
    val tamanho = mensagem.length
    print("\n")
    for (i in 0..(tamanho+7)) {
        print(linha)
    }
    println("\n/   $mensagem   |")
    for (i in 0..(tamanho+7)) {
        print(linha)
    }
    print("\n")
}

fun main() {
    val matriz = IntArray(5)
    matriz[0] = 1
    matriz[1] = 7
    matriz[2] = 6
    matriz[3] = 3
    matriz[4] = 2

    separador("Listagem do Array usando comando for():")
    for (i in matriz) {
        println(i)
    }

    separador("Listagem do Array usando comando forEach{}:")
    matriz.forEach { variavel ->
        println(variavel)
    }

    separador("Listagem do Array por índices usando for():")
    for (indice in matriz.indices) {
        println(matriz[indice])
    }

    separador("Ordenando o Array usando .sort():")
    matriz.sort()
    matriz.forEach {
        println(it)
    }


}