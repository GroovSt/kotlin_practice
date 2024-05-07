package org.example.lesson_8

fun main() {
    val viewsPerWeek = arrayOf(150, 222, 333, 553, 125, 36, 129)
    var counter = 0

    for (i in viewsPerWeek) {
        counter += i
    }

    println("Количество просмотров рекламы за неделю: $counter")
}