package org.example.lesson_10

fun main() {
    var manThrow: Int
    var computerThrow: Int
    var counterHumanWin = 0

    do {
        println("Бросает человек!")
        manThrow = rollTheDice4()
        println("Результат человека: $manThrow!")

        println("Бросает компьютер!")
        computerThrow = rollTheDice4()
        println("Результат компьютер: $computerThrow!")

        if (manThrow > computerThrow) {
            println("Победило человечество")

            counterHumanWin++
        } else if (manThrow < computerThrow)
            println("Победила машина")
        else
            println("Ничья")

    } while (startNewRound())

    println("Вы выиграли $counterHumanWin раз!")
}

fun rollTheDice4(): Int {
    val diceRoll = (1..6).random()
    return diceRoll
}

fun startNewRound(): Boolean {
    println("Хотите бросить кости еще раз? Введите Да или Нет")
    val userAnswer = readln()
    val newRound: Boolean

    if (userAnswer.equals("да", ignoreCase = true))
        newRound = true
    else
        newRound = false

    return newRound
}
