package org.example.lesson_5

fun main() {
    val userIsRegistered = true
    val userName = "Zaphod"
    val userPassword = "PanGalactic"

    println("Введите имя пользователя для входа в систему:")
    val enteredUserName = readln()

    if (userName == enteredUserName && userIsRegistered) {
        println("Пользователь обнаружен. Введите пароль:")
        val enteredUserPassword = readln()

        if (userPassword == enteredUserPassword)
            println("Добро пожаловать!")
        else {
            println("Неверный пароль.")
        }
    } else
        println("Пользователь не найден. Вам необходимо зарегестрироваться.")
}