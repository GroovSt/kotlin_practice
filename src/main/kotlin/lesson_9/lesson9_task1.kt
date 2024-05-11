package org.example.lesson_9

fun main() {
    val listIngredientsPotatoPancakes = listOf("картофель", "лук", "яйцо", "молотый перец", "соль", "растительное масло")

    println("В рецепте есть следующие ингредиенты:")
    listIngredientsPotatoPancakes.forEach { println(it) }
}