package org.example.lesson_11

class Forum {
    private val users: MutableList<User> = mutableListOf()
    private val messages: MutableList<Message> = mutableListOf()

    fun createNewUser(userName: String): User {
        var userIdCounter = 0
        userIdCounter++

        val userId = "User$userIdCounter"

        val newUser = User(userId, userName)
        users.add(newUser)
        return newUser
    }

    fun createNewMessage(userId: String, message: String): Message? {
        val member = users.find { it.userId == userId }
        if (member != null) {
            val newMessage = Message(member.userId, message)
            messages.add(newMessage)
            return newMessage
        }
        return null
    }

    fun printThread() {
        for (message in messages) {
            val member = users.find { it.userId == message.authorId }
            if (member != null) {
                println("${member.userName}: ${message.message}")
            }
        }
    }
}

class User(
    val userId: String,
    val userName: String,
)

class Message(
    val authorId: String,
    val message: String,
)

fun main() {
    val forum = Forum()

    val user1 = forum.createNewUser("Ivan")
    val user2 = forum.createNewUser("Sergey")

    forum.createNewMessage(user1.userId, "Hello, $user2")
    forum.createNewMessage(user2.userId, "Hello, $user1!")
    forum.createNewMessage(user1.userId, "How are you?")
    forum.createNewMessage(user2.userId, "I'm good, thanks!")

    forum.printThread()
}