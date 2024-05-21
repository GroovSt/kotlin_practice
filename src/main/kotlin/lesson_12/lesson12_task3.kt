package org.example.lesson_12

class TheWeatherFirst(
    val dayWeatherKelvin: Int,
    val nightWeatherKelvin: Int,
    val precipitation: Boolean,
) {
    fun displayWeather() {
        val dayWeatherCelsius = dayWeatherKelvin - 273
        val nightWeatherCelsius = nightWeatherKelvin - 273
        println("Погода днем: $dayWeatherCelsius")
        println("Погода ночью: $nightWeatherCelsius")
        println("Осадки: $precipitation")
    }
}

fun main() {
    val day = TheWeatherFirst(300, 290, false)

    day.displayWeather()
}
