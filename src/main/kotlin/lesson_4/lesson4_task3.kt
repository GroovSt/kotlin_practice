package org.example.lesson_4


const val IS_SUNNY = true
const val  IS_AWNING_OPEN = true
const val AIR_HUMIDITY = 20
const val SEASON = "summer"

fun main() {
    val sunnyWeatherToday = true
    val openTentToday = true
    val airHumidityToday = 20
    val seasonToday = "winter"

    val favorableConditions = ((IS_SUNNY == sunnyWeatherToday) && (IS_AWNING_OPEN == openTentToday) &&
            (AIR_HUMIDITY == airHumidityToday) && (SEASON == seasonToday))

    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditions")
}