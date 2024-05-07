package org.example.lesson_6

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    val hiddenNum = Random.nextInt(1..9)
    var counter = 5

    while (counter > 0) {
        println("Угадай число от 1 до 9:")
        val userNum = readln().toInt()

        counter --

        if (hiddenNum == userNum) {
            println("Это была великолепная игра!")
            break
        } else
            println("Неверно")

        if (counter == 0)
            println("Было загадано число $hiddenNum")
    }
}