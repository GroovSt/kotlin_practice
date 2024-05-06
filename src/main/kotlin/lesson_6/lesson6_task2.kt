package org.example.lesson_6

fun main() {
    println("Введите количество секунд, которые нужно засечь:")
    var counterSec = readln().toInt()
    val userTime = counterSec

    while (counterSec > 0) {
        Thread.sleep(1000)
        counterSec --
    }

    println("Прошло $userTime секунд")
}