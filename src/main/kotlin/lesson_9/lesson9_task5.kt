package org.example.lesson_9

fun main() {
    var ingredients: MutableSet<String> = mutableSetOf()

    println("Напишите пять названий ингредиентов:")
    var ingredient: String

    for (i in 0 until 5) {
        ingredient = readln()

        ingredients.add(ingredient)
    }
    ingredients = ingredients.sorted().toMutableSet()

    val ingredientsStr = ingredients.joinToString(", ")

    println(ingredientsStr.replaceFirstChar { it.uppercase() })
}
