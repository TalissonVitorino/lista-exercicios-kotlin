/*
ler quantidade de alunos dos alunos
fazer variavel quantidadedealunos
ferificar se a quantiada de a luno é valida
caso nao for encerrar programa
soma = 0
fazer um for de i ate .. quantidade de notas
    digite nota do alunos $i:
    val nota = ler nota
    somar = soma + nota

val media = soma / quantidade
prit media
 */

package lista

fun main() {
    println("Digite quantidade de alunos: ")
    val quantidadeDeAlunos = readln().toInt()

    if (quantidadeDeAlunos <= 0  || quantidadeDeAlunos > 10){
        println("Encerrando o programa!")
        return
    }

    var somaDasNotas = 0.0
    for (i in 1..quantidadeDeAlunos){
        println("Digite a nota do aluno $i: ")
        val nota = readln().toDouble()
        somaDasNotas += nota
    }
    val mediaDasNotas = somaDasNotas / quantidadeDeAlunos
    println(mediaDasNotas)



}