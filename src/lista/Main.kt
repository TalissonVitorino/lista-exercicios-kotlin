fun main() {


    print("Digite um numero: ")
    val numero = readln().toInt()

    if (numero < 0){
        print("Este número $numero é negativo.")
    }else{
        if (numero >= 0){
            print("Este número $numero é positivo.")
        }
    }
}