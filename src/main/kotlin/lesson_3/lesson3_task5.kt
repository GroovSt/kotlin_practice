package org.example.lesson_3

fun main() {
    val serverAnswer = "D2-D4;0"

    val data = serverAnswer.split('-', ';')
    val from = data[0]
    val to = data[1]
    val moveNumber = data[2]

    println(from)
    println(to)
    println(moveNumber)
}