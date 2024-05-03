package org.example.lesson_5

fun main() {
    println("Для того чтобы выяснить, что вы человек, напишите ответ для выражения: 150 + 150")
    val example = 300
    val answer = readln().toInt()

    if (answer == example)
        println("Добро пожаловать!")
    else
        println("Доступ запрещен.")
}