package org.example.lesson_10

const val USERNAME = "Anton"
const val PASSWORD = "bestPassword"
val PRODUCT_LIST = listOf("вода", "молоко", "хлеб")

fun main() {
    println("Введите логин:")
    val userLogin = readln()

    println("Введите пароль:")
    val userPassword = readln()

    println(
        getCart(
            token = getToken(
                loginForToken = userLogin,
                passwordForToken = userPassword
            )
        )
    )
}

fun getToken(loginForToken: String, passwordForToken: String): String? {
    val token = StringBuilder()
    val tokenLength = 32
    val charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"

    if (USERNAME == loginForToken && PASSWORD == passwordForToken) {
        for (i in 0 until tokenLength) {
            token.append(charset.random())
        }

        return token.toString()
    } else
        return null
}

fun getCart(token: String?): String {
    if (token != null) {
        return PRODUCT_LIST.joinToString()
    } else
        return "Неудачная авторизация"
}
