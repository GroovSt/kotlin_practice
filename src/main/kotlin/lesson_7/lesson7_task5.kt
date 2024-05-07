package org.example.lesson_7

import kotlin.random.Random
import kotlin.random.nextInt


fun main() {
    println("Введите желаемую длину пароля:")
    var passwordLength = readln().toInt()

    if (passwordLength < 6) {   //Если пользователь ввел длину пароля менее 6 символов, то по умолчанию установится 6 символов
        passwordLength = 6
    }

    val generatedPassword = StringBuilder()

    for (i in 1..passwordLength) {
        val randomNum = Random.nextInt(0..9)
        val charRangeLower: CharRange = 'a'..'z'
        val randomCharLower = charRangeLower.random()
        val charRangeUpper: CharRange = 'A'..'Z'
        val randomCharUpper = charRangeUpper.random()

        val randomCall = Random.nextInt(1..3) //Вызов рандомного типа сиволов

        if (randomCall == 1)
            generatedPassword.append(randomNum)
        else if (randomCall == 2)
            generatedPassword.append(randomCharLower)
        else
            generatedPassword.append(randomCharUpper)
    }

    println(generatedPassword)
}