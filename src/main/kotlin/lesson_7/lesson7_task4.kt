package org.example.lesson_7

fun main() {
    println("Введите количество секунд, которое нужно засечь:")
    var userSec = readln().toInt()

    for (i in userSec downTo 0) {
        println("До конца таймера осталось ${userSec--} секунд.")
        Thread.sleep(1000)
    }

    println("Время вышло")
}