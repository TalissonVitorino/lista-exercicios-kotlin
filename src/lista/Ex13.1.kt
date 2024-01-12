package lista

fun main() {
    println("Digite quantidade de alunos: ")
    val quantidadeDeAlunos = readln().toInt()

    if (quantidadeDeAlunos <= 0 || quantidadeDeAlunos > 10) {
        println("Encerrando o programa!")
        return
    }

    var somaDasNotas = 0.0
    for (i in 1..quantidadeDeAlunos) {
        println("Digite a nota do aluno $i: ")
        val nota = readln().toDouble()
        somaDasNotas += nota
    }
    val mediaDasNotas = somaDasNotas / quantidadeDeAlunos
    println(mediaDasNotas)
}