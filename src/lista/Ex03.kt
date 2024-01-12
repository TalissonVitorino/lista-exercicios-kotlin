package lista

import java.time.LocalDate

fun main() {
    print("Digite seu ano de nascimento: ")
    val anoNascimento = readln().toInt()
    val anoAtual = LocalDate.now().year
    val idade = anoAtual - anoNascimento
    println("Sua idade atual é: $idade")



}