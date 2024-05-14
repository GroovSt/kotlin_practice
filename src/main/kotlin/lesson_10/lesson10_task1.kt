package org.example.lesson_10

fun main() {
    var manThrow: Int
    var computerThrow: Int

    do {
        println("Бросает человек!")
        manThrow = rollTheDice1()
        println("Результат человека: $manThrow!")

        println("Бросает компьютер!")
        computerThrow = rollTheDice1()
        println("Результат компьютер: $computerThrow!")

        if (manThrow > computerThrow)
            println("Победило человечество")
        else if (manThrow < computerThrow)
            println("Победила машина")
        else
            println("Ничья, кидаем заново")

    } while (manThrow == computerThrow)

}

fun rollTheDice1(): Int = (1..6).random()
