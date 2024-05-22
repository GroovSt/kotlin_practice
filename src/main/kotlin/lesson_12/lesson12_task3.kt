package org.example.lesson_12

class TheWeatherFirst(
    dayWeatherKelvin: Int,
    nightWeatherKelvin: Int,
    precipitation: Boolean,
) {
    val dayWeatherKelvin = dayWeatherKelvin
    val nightWeatherKelvin = nightWeatherKelvin
    val precipitation = precipitation

    val dayWeatherCelsius = dayWeatherKelvin - 273
    val nightWeatherCelsius = nightWeatherKelvin - 273

    fun displayWeather() {
        println("Погода днем: $dayWeatherCelsius")
        println("Погода ночью: $nightWeatherCelsius")
        println("Осадки: $precipitation")
    }
}

fun main() {
    val day = TheWeatherFirst(300, 290, false)

    day.displayWeather()
}
