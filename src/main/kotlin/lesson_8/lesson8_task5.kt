package org.example.lesson_8

fun main() {
    println("Сколько планируется ингредиентов:")
    val userIngredientsNum = readln().toInt()

    val userIngredients = Array<String>(userIngredientsNum) { "" }

    var index = 0
    while (index < userIngredientsNum) {
        println("Введите название ингредиента:")
        val introducedIngredient = readln()

        userIngredients[index] = introducedIngredient

        index++
    }
}