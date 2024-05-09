package org.example.lesson_8

fun main() {
    val arrayIngredientsPotatoPancakes = arrayOf("картофель", "лук", "яйцо", "молотый перец", "соль", "растительное масло")

    println("Введите название ингредиента, который хотите найти:")
    val usersIngredient = readln()

    if (arrayIngredientsPotatoPancakes.contains(usersIngredient)) {
        println("Ингредиент $usersIngredient в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}