package org.example.lesson_12

import kotlin.math.roundToInt

class WeatherSecond(
    dayWeather: Int,
    nightWeather: Int,
    precipitation: Boolean,
) {

}

fun main() {
    var dayWeather: Int
    var nightWeather: Int
    var precipitation: Boolean

    val weatherList = mutableListOf<WeatherSecond>()
    val dayTemp = mutableListOf<Int>()
    val nightTemp = mutableListOf<Int>()
    val precipitationDays = mutableListOf<Boolean>()

    for (i in 1..30) {
        dayWeather = (-55..70).random() // 0°C to 40°C
        nightWeather = (-80..55).random() // -10°C to 20°C
        precipitation = listOf(true, false).random()

        val weather = WeatherSecond(dayWeather, nightWeather, precipitation)
        weatherList.add(weather)

        dayTemp.add(dayWeather)
        nightTemp.add(nightWeather)

        if (precipitation == true)
            precipitationDays.add(precipitation)
    }

    val avgDayTemp = dayTemp.average().roundToInt()
    val avgNightTemp = nightTemp.average().roundToInt()
    val daysWithPrecipitation = precipitationDays.size

    println("Средняя дневная температура: $avgDayTemp")
    println("Средняя ночная температура: $avgNightTemp")
    println("Количество дней с осадками: $daysWithPrecipitation")
}
