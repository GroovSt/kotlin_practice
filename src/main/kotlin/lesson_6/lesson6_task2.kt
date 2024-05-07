package org.example.lesson_6

fun main() {
    println("Введите количество секунд, которые нужно засечь:")
    val counterSec = readln().toInt()

    Thread.sleep(counterSec.toLong() * 1000)

    println("Прошло $counterSec секунд")
}