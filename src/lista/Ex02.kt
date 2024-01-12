package lista

fun main() {

    print("Digite a quantidade de maçãs que deseja comprar: ")
    val quantidade = readln().toInt()
    val precoFinal = calculaPrecoTotal(quantidade)
    println("Valor total a apargar: $precoFinal")
}

fun calculaPrecoTotal(quantidade: Int): Double {
    val pcNormal = 1.30
    val pcPromocao = 1.00
    val resultado: Double

    if (quantidade >= 12) {
        resultado = pcPromocao * quantidade
    } else {
        resultado = pcNormal * quantidade
    }
    return resultado
}