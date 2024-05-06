package org.example.lesson_6

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    var counter = 3

    while (counter > 0) {
        val hiddenNumOne = Random.nextInt(1..9)
        val hiddenNumTwo = Random.nextInt(1..9)
        val sumHiddenNumbs = hiddenNumOne + hiddenNumTwo

        println("Для входа в приложение нужно доказать, что Вы не бот. " +
                "Необходимо решить следующее выражение: $hiddenNumOne + $hiddenNumTwo. " +
                "Напишите ответ:")
        val userAnswer = readln().toInt()

        counter--

        if (sumHiddenNumbs == userAnswer){
            println("Добро пожаловать!")
            break
        } else if (counter == 0)
            println("Доступ запрещен")
    }
}