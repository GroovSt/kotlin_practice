package org.example.lesson_8

fun main() {
    val arrayIngredientsPotatoPancakes = arrayOf("картофель", "лук", "яйцо", "молотый перец", "соль", "растительное масло")

    println("Список ингредиентов: ${arrayIngredientsPotatoPancakes.joinToString()}")

    println("Напишите, какой ингредиент вы хотите заменить:")
    val userIngredient = readln()

    if (userIngredient !in arrayIngredientsPotatoPancakes) {
        println("Такого ингредиента в рецепте нет")
        return
    }

    println("Напишите, какой ингредиент вы хотите добавить:")
    val newUserIngredient = readln()

    arrayIngredientsPotatoPancakes[arrayIngredientsPotatoPancakes.indexOf(userIngredient)] = newUserIngredient

    println("Готово! Вы сохранили следующий список: ${arrayIngredientsPotatoPancakes.joinToString()}")
}