package org.example.lesson_2

fun main() {
    val employees = 50
    val employeeSalary = 30_000
    val trainees = 30
    val traineeSalary = 20_000

    val costEmployeesSalary = employeeSalary * employees
    val costTraineesSalary = traineeSalary * trainees
    val generalExpenses = costEmployeesSalary + costTraineesSalary
    val avgEmployeesSalary = generalExpenses / (employees + trainees)

    println(costEmployeesSalary)
    println(generalExpenses)
    println(avgEmployeesSalary)
}