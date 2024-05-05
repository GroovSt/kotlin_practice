package org.example.lesson_5

fun main() {
    val winNumOne = 10
    val winNumTwo = 22

    println("Введите первое число для участия в лотереи (диапазон чисел от 0 до 42)")
    val userFirstNum = readln().toInt()

    println("Введите второе число для участия в лотереи (диапазон чисел от 0 до 42)")
    val userSecondNum = readln().toInt()

    if ((winNumOne == userFirstNum || winNumOne == userSecondNum) && (winNumTwo == userFirstNum || winNumTwo == userSecondNum))
        println("Поздравляем! Вы выиграли главный приз!")
    else if (winNumOne == userFirstNum || winNumOne == userSecondNum || winNumTwo == userFirstNum || winNumTwo == userSecondNum)
        println("Вы выиграли утешительный приз!")
    else
        println("Неудача!")

    println("Выигрышными числами были: $winNumOne и $winNumTwo")
}