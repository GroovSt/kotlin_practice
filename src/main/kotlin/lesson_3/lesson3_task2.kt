package org.example.lesson_3

fun main() {
    var applicantSurname = "Андреева"
    val applicantName = "Татьяна"
    val applicantPatronymic = "Сергеевна"
    var applicantAge = 20

    println("$applicantSurname $applicantName $applicantPatronymic, $applicantAge")

    applicantSurname = "Сидорова"
    applicantAge = 22

    println("$applicantSurname $applicantName $applicantPatronymic, $applicantAge")
}