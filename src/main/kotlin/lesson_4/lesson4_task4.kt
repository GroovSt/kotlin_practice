package org.example.lesson_4

fun main() {
    val handExercises = 1
    val absExercises = 1
    val legExercises = 0
    val backExercises = 0

    val trainingDay = 6

    println("""
        Упражнения для рук:    ${trainingDay % 2 == handExercises}
        Упражнения для ног:    ${trainingDay % 2 == legExercises}
        Упражнения для спины:  ${trainingDay % 2 == backExercises}
        Упражнения для пресса: ${trainingDay % 2 == absExercises}
    """.trimIndent())
}