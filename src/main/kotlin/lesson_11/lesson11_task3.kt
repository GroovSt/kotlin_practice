package org.example.lesson_11

class Room(
    val cover: String,
    val roomName: String,
    val listOfParticipants: MutableList<String> = mutableListOf(),
) {
    fun addParticipant(participant: String) {
        listOfParticipants.add(participant)
    }

    fun updateStatus(username: String, status: String) {
        println("У пользователя $username новый статус: $status")
    }

    fun displayUserInfo(username: String) {
        println(username)
    }
}

fun main() {
    val room = Room(
        "cover.jpg",
        "Best room ever!",
    )

    room.addParticipant("Ivan")
    room.addParticipant("Sergey")
    room.addParticipant("Irina")

    room.updateStatus("Ivan", "разговаривает")
    room.updateStatus("Sergey", "микрофон выключен")
    room.updateStatus("Irina", "пользователь заглушен")

    room.displayUserInfo("Ivan")
}
