package org.example.lesson_10

fun main() {
    println("Введите желаемую длину пароля:")
    val passwordLength = readln().toInt()

    println(generatePassword(passLength = passwordLength))
}

fun generatePassword(passLength: Int): String {
    val generatedPassword = StringBuilder()
    val randomNum = (0..9).random()
    val randomChar = (32..47).random().toChar()

    for (i in 1..passLength) {
        if (i % 2 == 0)
            generatedPassword.append(randomNum)
        else
            generatedPassword.append(randomChar)
    }
    return generatedPassword.toString()
}

