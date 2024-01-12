package lista

fun main() {
    println("Digite a quantidade de números que você deseja digitar: ")
    val quntidadeNumeros = readln().toInt()
    if (quntidadeNumeros <= 0) return
    var maior = 0
    var menor = Int.MAX_VALUE

    for (i in 1..quntidadeNumeros) {
        print("Qual número você deseja informar? ")
        val numeroInformado = readln().toInt()
        if (numeroInformado > maior) {
            maior = numeroInformado
        }
        // Alternativa: maior = max(numeroInformado, maior)

        if (numeroInformado < menor) {
            menor = numeroInformado
        }
        // Alternativa: menor = min(numeroInformado, menor)
    }
    println("O maior número é: $maior")
    println("O menor número é: $menor")
}
