package org.example.lesson_9

fun main() {
    val listIngredients = mutableListOf("картошка", "лук", "яйцо")

    println("В рецепте есть базовые ингредиенты: ${listIngredients.joinToString(", ")}")

    println("Желаете добавить еще?")
    val userAnswer = readln()

    if (userAnswer.equals("да", ignoreCase = true)) {
        println("Какой ингредиент вы хотите добавить?")
        val userIngredient = readln()

        listIngredients.add(userIngredient)

        println("Теперь в рецепте есть следующие ингредиенты: ${listIngredients.joinToString(", ")}")
    }
}