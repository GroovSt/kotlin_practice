package org.example.lesson_5

import kotlin.random.Random

fun main() {
    val winningNumbers = List(3) { Random.nextInt(0, 43) }
    val userNumbers = mutableListOf<Int>()

    println("Введите первое число для участия в лотереи (диапазон чисел от 0 до 42)")
    userNumbers.add(readln().toInt())

    println("Введите второе число для участия в лотереи (диапазон чисел от 0 до 42)")
    userNumbers.add(readln().toInt())

    println("Введите третье число для участия в лотереи (диапазон чисел от 0 до 42)")
    userNumbers.add(readln().toInt())

    val listComparison = winningNumbers.intersect(userNumbers.toSet())
    val numberOfCoincidences = listComparison.size

    when (numberOfCoincidences) {
        3 -> println("Вы угадали все числа и выиграли джекпот!")
        2 -> println("Вы угадали два числа и получаете крупный приз!")
        1 -> println("Вы угадали одно число и получаете утешительный приз!")
        else -> println("К сожалению, вы не угадали ни одного числа.")
    }

    println("Выигрышные числа: ${winningNumbers.joinToString()}")
}