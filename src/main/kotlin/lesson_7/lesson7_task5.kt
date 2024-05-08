package org.example.lesson_7

import kotlin.collections.mutableListOf

fun main() {
    println("Введите желаемую длину пароля:")
    var passwordLength = readln().toInt()

    if (passwordLength < 6) {   //Если пользователь ввел длину пароля менее 6 символов, то по умолчанию установится 6 символов
        passwordLength = 6
    }

    val generatedPassword = mutableListOf<Any>()

    val randomNum = (0..9).random()
    val randomCharLower = ('a'..'z').random()
    val randomCharUpper = ('A'..'Z').random()

    generatedPassword.add(randomNum)
    generatedPassword.add(randomCharLower)
    generatedPassword.add(randomCharUpper)

    for (i in 4..passwordLength) {
        val randomSymbol = mutableListOf<Any>()
        randomSymbol.addAll((0..9))
        randomSymbol.addAll(('a'..'z'))
        randomSymbol.addAll(('A'..'Z'))

        generatedPassword.add(randomSymbol.random())
    }

    generatedPassword.shuffle()

    println(generatedPassword.joinToString(""))
}