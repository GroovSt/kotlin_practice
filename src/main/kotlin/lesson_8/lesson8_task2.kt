package org.example.lesson_8

fun main() {
    val arrayIngredientsPotatoPancakes = arrayOf("картофель", "лук", "яйцо", "молотый перец", "соль", "растительное масло")

    println("Введите название ингредиента, который хотите найти:")
    val usersIngredient = readln()

    for (i in arrayIngredientsPotatoPancakes) {
        if (i == usersIngredient) {
            println("Ингредиент $usersIngredient в рецепте есть")
        }
    }

    if (usersIngredient !in arrayIngredientsPotatoPancakes)
        println("Такого ингредиента в рецепте нет")
}