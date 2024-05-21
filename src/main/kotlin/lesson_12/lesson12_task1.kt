package org.example.lesson_12

class Weather {
    var dayWeather = 30
    var nightWeather = 10
    var precipitation = false
}

fun main() {
    val day1 = Weather()
    day1.dayWeather = 35
    day1.nightWeather = 20
    day1.precipitation = false

    val day2 = Weather()
    day2.dayWeather = 10
    day2.nightWeather = -8
    day2.precipitation = true

    println("Погода днем в первый день: ${day1.dayWeather}")
    println("Погода ночью в первый день: ${day1.nightWeather}")
    println("Осадки: ${day1.precipitation}")
    println()
    println("Погода днем во второй день: ${day2.dayWeather}")
    println("Погода ночью во второй день: ${day2.nightWeather}")
    println("Осадки: ${day2.precipitation}")
}