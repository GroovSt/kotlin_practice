package org.example.lesson_5

fun main() {
    val numSumOne = 150
    val numSumTwo = 150

    println("Для того чтобы выяснить, что вы человек, напишите ответ для выражения: $numSumOne + $numSumTwo")
    val example = numSumOne + numSumTwo
    val answer = readln().toInt()

    if (answer == example)
        println("Добро пожаловать!")
    else
        println("Доступ запрещен.")
}