package lista

fun main() {
    for (n in 1..10){
        println("Tabuada do $n".uppercase())
        for (i in 1..10){
            println("$n x $i = ${n * i}")
        }
        println()
    }
}