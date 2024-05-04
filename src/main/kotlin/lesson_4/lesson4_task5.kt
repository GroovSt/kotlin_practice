package org.example.lesson_4

const val NO_DAMAGE_SHIP = true
const val MIN_CREW = 55
const val MAX_CREW = 70
const val MIN_FOOD = 50
const val GOOD_WEATHER = true

fun main() {
    val noDamage = readln().toBoolean()
    val crew = readln().toInt()
    val food = readln().toInt()
    val goodWeather = readln().toBoolean()

    val canSwim =
        (noDamage == NO_DAMAGE_SHIP && crew >= MIN_CREW && crew <= MAX_CREW && food >= MIN_FOOD) || (crew == MAX_CREW && food >= MIN_FOOD && goodWeather == GOOD_WEATHER)

    println("Корабль может отправиться в плавание: $canSwim")
}