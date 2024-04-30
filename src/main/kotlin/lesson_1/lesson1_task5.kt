package org.example.lesson_1

const val TRANSLATE_OF_TIME = 60

fun main() {
    val secondsInSpace = 6480
    val second = secondsInSpace % TRANSLATE_OF_TIME
    val minute = secondsInSpace / TRANSLATE_OF_TIME % TRANSLATE_OF_TIME
    val hour = secondsInSpace / TRANSLATE_OF_TIME / TRANSLATE_OF_TIME

    println("%02d:%02d:%02d".format(hour, minute, second))
}