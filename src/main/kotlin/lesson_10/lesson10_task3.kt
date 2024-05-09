package org.example.lesson_10

fun main() {
    println("Введите желаемую длину пароля:")
    val passwordLength = readln().toInt()

    println(generatePassword(passLength = passwordLength))
}

fun generatePassword(passLength: Int): String {
    val generatedPassword = StringBuilder()

    for (i in 1..passLength) {
        val randomNum = (0..9).random()
        val randomChar = "!\"#\$%&'()*+,-./ ".random()

        if (i % 2 == 0)
            generatedPassword.append(randomNum)
        else
            generatedPassword.append(randomChar)
    }
    return generatedPassword.toString()
}

