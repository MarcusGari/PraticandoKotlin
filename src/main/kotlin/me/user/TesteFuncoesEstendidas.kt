package me.user

fun main(){
    val salarios = arrayOf(
        "2000" .toBigDecimal(),
        "1500" .toBigDecimal(),
        "4000" .toBigDecimal()
    )

    separador("Imprimindo a soma dos elementos do Array com .somatoria():")
    println(salarios.somatoria())

    separador("Imprimindo a média dos elementos do Array com .media():")
    println(salarios.media())

}