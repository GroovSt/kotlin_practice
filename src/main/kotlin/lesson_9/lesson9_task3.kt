package org.example.lesson_9

fun main() {
    val listIngredientsForOmelet = mutableListOf(2, 50, 15)

    println("Какое количество порций вам необходимо?")
    val numberOfServings = readln().toInt()

    val listOmeletPortions = listIngredientsForOmelet.map { it * numberOfServings }

    println("На $numberOfServings порций вам понадобится: Яиц – ${listOmeletPortions[0]}," +
            " молока – ${listOmeletPortions[1]}, сливочного масла – ${listOmeletPortions[2]}")
}