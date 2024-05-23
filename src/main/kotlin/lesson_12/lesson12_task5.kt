package org.example.lesson_12

import kotlin.math.roundToInt

class WeatherSecond(
    val dayWeather: Int,
    val nightWeather: Int,
    val precipitation: Boolean,
) {
}

fun main() {
    var dayWeather: Int
    var nightWeather: Int
    var precipitation: Boolean

    val weatherList = mutableListOf<WeatherSecond>()

    for (i in 1..30) {
        dayWeather = (-55..70).random()
        nightWeather = (-80..55).random()
        precipitation = listOf(true, false).random()

        val weather = WeatherSecond(dayWeather, nightWeather, precipitation)
        weatherList.add(weather)
    }

    val dayTemp = mutableListOf<Int>()
    val nightTemp = mutableListOf<Int>()
    val precipitationDays = mutableListOf<Boolean>()

    for (weather in weatherList) {
        dayTemp.add(weather.dayWeather)
        nightTemp.add(weather.nightWeather)
        if (weather.precipitation) {
            precipitationDays.add(weather.precipitation)
        }
    }

    val avgDayTemp = dayTemp.average().roundToInt()
    val avgNightTemp = nightTemp.average().roundToInt()
    val daysWithPrecipitation = precipitationDays.size

    println("Средняя дневная температура: $avgDayTemp")
    println("Средняя ночная температура: $avgNightTemp")
    println("Количество дней с осадками: $daysWithPrecipitation")
}
