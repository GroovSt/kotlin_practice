package org.example.lesson_4


const val SUNNY_WEATHER = true
const val OPEN_TENT = true
const val AIR_HUMIDITY = 20
const val SEASON = "no winter"

fun main() {
    val sunnyWeatherToday = true
    val openTentToday = true
    val airHumidityToday = 20
    val seasonToday = "winter"

    val favorableConditions = ((SUNNY_WEATHER == sunnyWeatherToday) && (OPEN_TENT == openTentToday) && (AIR_HUMIDITY == airHumidityToday) && (SEASON == seasonToday))

    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditions")
}