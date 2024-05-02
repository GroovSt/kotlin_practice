package org.example.lesson_4

const val NUMBER_OF_TABLES = 13

fun main() {
    val bookedToday = NUMBER_OF_TABLES
    val bookedTomorrow = NUMBER_OF_TABLES - 4

    println("Доступность столиков на сегодня: ${bookedToday < NUMBER_OF_TABLES}")
    println("Доступность столиков на завтра: ${bookedTomorrow < NUMBER_OF_TABLES}")
}