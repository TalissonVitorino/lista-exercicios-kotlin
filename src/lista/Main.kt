package lista

fun main() {

    print("Digite um número: ")
    val numero = readln().toInt()

    if (numero < 0) {
        print("Este número $numero é negativo.")
    } else {
        if (numero >= 0) {
            print("Este número $numero é positivo.")
        }
    }
}