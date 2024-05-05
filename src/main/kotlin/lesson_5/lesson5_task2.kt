package org.example.lesson_5

const val AGE_OF_MAJORITY = 18

fun main() {
    println("Введите ваш год рождения")
    val userAgeYear = readln().toInt()

    val userAge = 2024 - userAgeYear

    if (userAge >= AGE_OF_MAJORITY)
        println("Показать экран со скрытым контентом")
    else
        println("Вернутся на главный экран")
}