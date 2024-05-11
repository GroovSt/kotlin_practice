package org.example.lesson_9

fun main() {
    var listIngredientsForOmelet = mutableListOf(2, 50, 15)

    println("Какое количество порций вам необходимо?")
    val numberOfServings = readln().toInt()

    listIngredientsForOmelet = listIngredientsForOmelet.map { it * numberOfServings }.toMutableList()

    println("На $numberOfServings порций вам понадобится: Яиц – ${listIngredientsForOmelet[0]}," +
            " молока – ${listIngredientsForOmelet[1]}, сливочного масла – ${listIngredientsForOmelet[2]}")
}