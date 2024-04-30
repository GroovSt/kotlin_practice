package org.example.lesson_2

import kotlin.math.roundToInt

const val BUFF_INDEX = 0.2

fun main() {
    val crystalsWithoutBuff = 7
    val ironWithoutBuff = 11

    val crystalsBuff = (crystalsWithoutBuff * BUFF_INDEX).roundToInt()
    val ironBuff = (ironWithoutBuff * BUFF_INDEX).roundToInt()

    println("Бонусные кристалы: $crystalsBuff")
    println("Бонусное железо: $ironBuff")
}