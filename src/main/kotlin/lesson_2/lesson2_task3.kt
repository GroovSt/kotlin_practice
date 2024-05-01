package org.example.lesson_2

const val TRANSLATE_OF_TIME = 60

fun main() {
    val startHour = 9
    val startMinute = 39
    val departureTimeInMinute = startHour * TRANSLATE_OF_TIME + startMinute // перевел время отправления поезда в минуты
    val travelTime = 457

    val arrivalTime = departureTimeInMinute + travelTime // время прибытия поезда переведенные в минуты
    val arrivalTimeHour = arrivalTime / TRANSLATE_OF_TIME
    val arrivalTimeMinute = arrivalTime % TRANSLATE_OF_TIME

    println("$arrivalTimeHour:$arrivalTimeMinute")
}