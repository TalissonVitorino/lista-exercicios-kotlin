package lista

import java.time.LocalDate

fun main() {
    print("Digite seu ano de nascimento: ")
    val anoNascimento = readln().toInt()
    val idade = calculaIdade(anoNascimento)
    println("Sua idade atual é: $idade")
}

fun calculaIdade(anoNascimento: Int): Int {
    val anoAtual = LocalDate.now().year
    val idade = anoAtual - anoNascimento
    return idade
}
