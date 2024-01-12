package lista

fun main() {

    println("Digite um número: ")
    val numero1 = readln().toInt()
    println("Digite um número: ")
    val numero2 = readln().toInt()
    println("Digite um número: ")
    val numero3 = readln().toInt()

    if (numero1 > numero2) {
        if (numero1 > numero3) {
            println(numero1)
        } else {
            println(numero3)
        }
    } else if (numero2 > numero3) {
        println(numero2)
    } else {
        println(numero3)
    }

}
