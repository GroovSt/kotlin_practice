package org.example.lesson_6

fun main() {
    println("Придумайте логин:")
    val createLogin = readln()

    println("Придумайте пароль:")
    val createPassword = readln()

    while (true) {
        println("Введите логин:")
        val userLogin = readln()

        println("Введите пароль:")
        val userPassword = readln()

        if (createLogin == userLogin && createPassword == userPassword) {
            println("Авторизация прошла успешно")
            break
        } else {
            println("Неверные данные. Попробуйте еще раз.")
        }
    }
}