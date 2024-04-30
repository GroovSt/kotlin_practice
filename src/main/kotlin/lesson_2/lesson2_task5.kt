package org.example.lesson_2

import kotlin.math.pow

fun main() {
    val clientSum = 70_000
    val interestRate = 16.7
    val term = 20.0 //использован тип Double для использования pow

    val interestRateForOneYear = 1 + interestRate / 100
    val interestRateForTwentyYears = interestRateForOneYear.pow(term)
    val totalDepositAmount = clientSum * interestRateForTwentyYears

    println("%.3f".format(totalDepositAmount))
}