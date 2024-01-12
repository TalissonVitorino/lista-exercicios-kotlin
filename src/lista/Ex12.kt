package lista

fun main() {

    val totalNumeros = 10
    var negativoConte = 0
    println("Digite $totalNumeros números:")

    for (i in 1..totalNumeros) {
        print("Número $i: ")
        val numero = readLine()!!.toDouble()

        if (numero < 0) {
            negativoConte++
        }
    }
    println("Quantidade de números negativos: $negativoConte")
}
