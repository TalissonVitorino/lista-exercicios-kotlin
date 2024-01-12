/*

ler denominador
ler numerador

enquanto denominadior for 0
    da erro
    repetir pergunta ("Digite o denominador: ")
    ler donominador teclado
divisao = nume / deno
prit





 */


package lista

fun main() {
    print("Digite o numerador: ")
    val numerador = readln().toDouble()
    val denominador = lerDenominador()
    val divisao = numerador / denominador
    println(divisao)
}

fun lerDenominador(): Double {
    print("Digite o denominador: ")
    var denominador = readln().toDouble()

    while (denominador == 0.0) {
        println("Número inválido para a divisão! ")
        print("Digite o denominador: ")
        denominador = readln().toDouble()
    }
    return denominador
}