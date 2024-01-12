package lista

fun main() {

    println("Digite um número: ")
    val numero1 = readln().toInt()
    println("Digite um número: ")
    val numero2 = readln().toInt()
    println("Digite um número: ")
    val numero3 = readln().toInt()
    val resulatdoFun = maior(numero1, numero2, numero3)
    println("O número maior e: $resulatdoFun")
}

fun maior(numero1: Int, numero2: Int, numero3: Int): Int {
    if (numero1 > numero2) {
        if (numero1 > numero3) {
            return numero1
        } else {
            return numero3
        }
    } else if (numero2 > numero3) {
        return numero2
    } else {
        return numero3
    }
}
