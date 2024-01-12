package lista

fun main() {

    for (linha in 1..10) {
        print("Linha $linha: ")
        for (coluna in linha..10) {
            print("$coluna ")
        }
        println()
    }
}