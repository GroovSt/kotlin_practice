package org.example.lesson_2

import kotlin.math.roundToInt


fun main() {
    val crystalsWithoutBuff = 7
    val ironWithoutBuff = 11
    val buff = 20.0
    val buffIndex = buff / 100

    val crystalsBuff = (crystalsWithoutBuff * buffIndex).roundToInt()
    val ironBuff = (ironWithoutBuff * buffIndex).roundToInt()

    println("Бонусные кристалы: $crystalsBuff")
    println("Бонусное железо: $ironBuff")
}