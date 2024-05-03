package org.example.lesson_3

fun main() {
    var moveNumber = 1
    var from = "E2"
    var to = "E4"

    var log = "$from:$to;$moveNumber"

    println(log)

    moveNumber ++
    from = "D2"
    to = "D3"

    log = "$from:$to;$moveNumber"

    println(log)
}