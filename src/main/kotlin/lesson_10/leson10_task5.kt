package org.example.lesson_10

const val USERNAME = "Anton"
const val PASSWORD = "bestPassword"
val PRODUCT_LIST = listOf("вода", "молоко", "хлеб")

fun main() {
    println("Введите логин:")
    val userLogin = readln()

    println("Введите пароль:")
    val userPassword = readln()

    val token = getToken(userLogin, userPassword)
    val cart = getCart(token)

    println(cart)
}

fun getToken(loginForToken: String, passwordForToken: String): String? {
    return if (USERNAME == loginForToken && PASSWORD == passwordForToken) {
        val tokenLength = 32
        val charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"
        val token = StringBuilder()

        for (i in 0 until tokenLength) {
            token.append(charset.random())
        }

        token.toString()
    } else {
        null
    }
}

fun getCart(token: String?): String {
    return if (token != null) {
        PRODUCT_LIST.joinToString()
    } else {
        "Неудачная авторизация"
    }
}
