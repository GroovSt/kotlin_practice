package org.example.lesson_12

class TheWeatherFirst(
    dayWeatherKelvin: Int,
    nightWeatherKelvin: Int,
    precipitation: Boolean,
) {
    init {
        val dayWeatherCelsius = dayWeatherKelvin - 273
        val nightWeatherCelsius = nightWeatherKelvin - 273
        println("Погода днем: $dayWeatherCelsius")
        println("Погода ночью: $nightWeatherCelsius")
        println("Осадки: $precipitation")
    }
}

fun main() {
    TheWeatherFirst(300, 290, false)
}