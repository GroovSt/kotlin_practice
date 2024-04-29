package org.example.lesson_1

fun main() {
    val secondsInSpace = 6480
    val second = secondsInSpace % 60
    val minute = secondsInSpace / 60 % 60
    val hour = secondsInSpace / 60 / 60

    println("%02d:%02d:%02d".format(hour, minute, second))
}