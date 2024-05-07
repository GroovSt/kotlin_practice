package org.example.lesson_7

import kotlin.random.Random
import kotlin.random.nextInt


fun main() {
    val passwordLength = 6

    val generatedPassword = StringBuilder()

    for (i in 1..passwordLength) {
        val randomNum = Random.nextInt(0..9)
        val charRange: CharRange = 'a'..'z'
        val randomChar = charRange.random()

        if (i % 2 == 0)
            generatedPassword.append(randomNum)
        else
            generatedPassword.append(randomChar)
    }

    println(generatedPassword)
}
