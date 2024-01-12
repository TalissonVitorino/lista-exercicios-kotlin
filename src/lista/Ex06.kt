/*
ler codgo do usuario
ler o ano de nascimento
ler o ano de ingresso na empresa
imprimir idade o tempo trabalhado do em pregador
imprimir Requerer aposentadoria ou Nao requerer aposentadoria


 */
package lista

import java.time.LocalDate

fun main() {
    print("Digite seu código da empresa: ")
    val codigo = readln().toInt()
    print("Digite seu ano de nascimento: ")
    val idade = readln().toInt()
    print("Digite o ano que ingresso na empresa: ")
    val anoIngresso = readln().toInt()
    val anoAtual = LocalDate.now().year
    val idadeAtual = anoAtual - idade
    val tempoIngresso = anoAtual - anoIngresso
    println("Seu código da empresa é: $codigo ")
    println("Sua idade atual é: $idadeAtual ")
    println("Seu tempo de ingresso é: $tempoIngresso ")

    when {
        idadeAtual >= 65 -> println("requer aposentadoria")
        tempoIngresso >= 30 -> println("requer aposentadoria")
        idadeAtual >= 60 && tempoIngresso >= 25 -> println("requer aposentadoria")
        else -> println("Não requerer aposentadoria")
    }


}