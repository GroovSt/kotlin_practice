package org.example.lesson_11

class User2(
    val id: String,
    val login: String,
    var password: String,
    val email: String,
    var bio: String?,
) {

    fun displayUserInfo() {
        println("ID: $id")
        println("Login: $login")
        println("Password: $password")
        println("Email: $email")
        println("Bio: $bio")
    }

    fun updateBio() {
        println("Введите информацию о себе:")
        val userAnswer = readln()
        bio = userAnswer
    }

    fun changePassword() {
        println("Введите текущий пароль:")
        val currentPassword = readln()
        val newPassword: String

        if (currentPassword == password) {
            println("Введите новый пароль:")
            newPassword = readln()
            password = newPassword
            println("Пароль успешно изменен.")
        } else {
            println("Неверный текущий пароль. Изменение пароля невозможно.")
        }
    }
}

fun main() {
    val user = User2(
        "123456",
        "john_doe",
        "password123",
        "john.doe@example.com",
        null,
    )

    user.updateBio()
    println()
    user.changePassword()
    println()
    user.displayUserInfo()
}