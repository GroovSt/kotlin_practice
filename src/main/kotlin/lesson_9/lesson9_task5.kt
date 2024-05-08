package org.example.lesson_9

fun main() {
    val ingredients: MutableList<String> = mutableListOf()

    println("Напишите пять названий ингредиентов:")

    var index = 0
    while (index < 5) {
        val userIngredient = readln()

        if (ingredients.contains(userIngredient))
            println("Этот ингредиент уже присутствует в списке. Введите другой ингредиент.")
        else
            ingredients.add(userIngredient)

        index++
    }

    ingredients.sort()

    ingredients[0] = ingredients[0].replaceFirstChar { it.uppercase() }

    println(ingredients.joinToString(", "))
}
