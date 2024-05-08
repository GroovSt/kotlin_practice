package org.example.lesson_9

fun main() {
    val listIngredients = mutableListOf("beer", "vodka", "gin")

    println("В рецепте есть базовые ингредиенты: ${listIngredients.joinToString(", ")}")

    println("Желаете добавить еще?")
    val userAnswer = readln()

    if (userAnswer == "да")
        println("Какой ингредиент вы хотите добавить?")
    else
        return

    val userIngredient = readln()

    listIngredients.add(userIngredient)

    println("Теперь в рецепте есть следующие ингредиенты: ${listIngredients.joinToString(", ")}")
}