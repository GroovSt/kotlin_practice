package org.example.lesson_9

fun main() {
    println("Введите через запятую и пробел пять ингредиентов блюда:")
    val ingredients = readln().split(", ")

    val sortedIngredients = ingredients.sorted()

    println(sortedIngredients)
}