package lista

fun main() {
    print("Digite um número da tabuada do 5: ")
    val n = readln().toInt()
    val m = 10

    for (x in 1..m){
        println("$n x $x = ${n * x}")
    }
}