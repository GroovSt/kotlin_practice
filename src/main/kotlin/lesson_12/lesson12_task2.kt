package org.example.lesson_12

class TheWeather(
    var dayWeather: Int,
    var nightWeather: Int,
    var precipitation: Boolean,
) {
}

fun main() {
    val day1 = TheWeather(45, 0, true)

    println("Погода днем в первый день: ${day1.dayWeather}")
    println("Погода ночью в первый день: ${day1.nightWeather}")
    println("Осадки: ${day1.precipitation}")
}

