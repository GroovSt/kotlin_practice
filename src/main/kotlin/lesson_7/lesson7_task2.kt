package org.example.lesson_7

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    while (true) {
        val randomCode = Random.nextInt(1000..9999)

        println("Ваш код авторизации: $randomCode")

        println("Введите код, чтобы авторизоваться:")
        val userCode = readln().toInt()

        if (randomCode == userCode) {
            println("Добро пожаловать!")
            break
        } else
            println("Код введён неверно")
    }
}