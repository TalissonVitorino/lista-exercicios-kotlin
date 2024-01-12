package lista

fun main() {

    print("Digite um número de 1 até 10: ")
    val n = readln().toInt()

    for (i in 1..10){
        println("$n x $i = ${n * i}")
    }
}