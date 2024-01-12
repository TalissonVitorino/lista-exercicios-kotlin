package lista

fun main() {
    println("Digite o valor de N: ")
    var n = readln().toInt()

    while (n <= 110){
        println("${n++}")


    }
    println()
    for (d in 100..110){
        println(d)

    }
}