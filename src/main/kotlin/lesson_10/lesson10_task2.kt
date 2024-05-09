package org.example.lesson_10

fun main() {
    println("Введите логин:")
    val userLogin = readln()

    println("Введите пароль:")
    val userPassword = readln()

    if (validateInput(input = userLogin) &&
        validateInput(input = userPassword)) {
        println("Приветствуем вас!")
    } else {
        println("Логин или пароль недостаточно длинные")
    }
}

fun validateInput(input: String): Boolean {
    return input.length >= 4
}
