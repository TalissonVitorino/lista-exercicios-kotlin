package lista

fun main() {
    for (linha in 1..10) {
        print("Linha $linha: ")
        for (coluna in 1..linha) {
            print("$coluna ")
        }
        println()
    }
}