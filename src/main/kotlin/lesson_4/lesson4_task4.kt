package org.example.lesson_4

fun main() {
    val trainingDay = 5
    val isArmAndAbsExercisesDay = (trainingDay % 2 == 1)

    val handExercises = isArmAndAbsExercisesDay
    val absExercises = isArmAndAbsExercisesDay
    val legExercises = !isArmAndAbsExercisesDay
    val backExercises = !isArmAndAbsExercisesDay

    println(
        """
        Упражнения для рук:    $handExercises
        Упражнения для ног:    $legExercises
        Упражнения для спины:  $backExercises
        Упражнения для пресса: $absExercises
    """.trimIndent()
    )
}
