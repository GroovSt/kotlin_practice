package org.example.lesson_7

fun main() {
    do {
        val randomCode = (1000..9999).random()

        println("Ваш код авторизации: $randomCode")

        println("Введите код, чтобы авторизоваться:")
        val userCode = readln().toInt()

        if (randomCode == userCode) {
            println("Добро пожаловать!")
            break
        } else {
            println("Код введён неверно")
        }
    } while (true)
}