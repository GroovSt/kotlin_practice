package org.example.lesson_11

class User(
    val id: String,
    val login: String,
    val password: String,
    val email: String,
)

fun main() {
    val user1 = User(
        "123456",
        "john_doe",
        "password123",
        "john.doe@mail.ru",
    )
    val user2 = User(
        "654321",
        "jane_smith",
        "password456",
        "jane.smith@mail.ru",
    )

    println("Пользователь 1:")
    println("Уникальный идентификатор: ${user1.id}")
    println("Логин: ${user1.login}")
    println("Пароль: ${user1.password}")
    println("Почта: ${user1.email}")
    println()
    println("Пользователь 2:")
    println("Уникальный идентификатор: ${user2.id}")
    println("Логин: ${user2.login}")
    println("Пароль: ${user2.password}")
    println("Почта: ${user2.email}")
}