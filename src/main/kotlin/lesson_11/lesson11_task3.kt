package org.example.lesson_11

class Room(
    val cover: String,
    val roomName: String,
    val members: MutableList<Member> = mutableListOf(),
) {
    fun addMember(member: Member) {
        members.add(member)
    }

    fun updateStatus(username: String, status: String) {
        val member = members.find { it.username == username }
        member?.status = status
        println("У пользователя $username новый статус: $status")
    }

    fun displayUserInfo(username: String) {
        println(username)
    }
}

class Member(
    val username: String,
    var status: String = "микрофон выключен", // По умолчанию статус "микрофон выключен"
    val avatarUrl: String = "", // URL аватарки участника
)

fun main() {
    val room = Room(
        "cover.jpg",
        "Best room ever!",
    )

    room.addMember(
        Member(
            "Ivan",
            "разговаривает",
            "ivan_avatar.jpg",
        )
    )
    room.addMember(
        Member(
            "Sergey",
            "микрофон выключен",
            "sergey_avatar.jpg",
        )
    )
    room.addMember(
        Member(
            "Irina",
            "пользователь заглушен",
            "irina_avatar.jpg",
        )
    )

    // Обновляем статусы участников
    room.updateStatus("Ivan", "разговаривает")
    room.updateStatus("Sergey", "микрофон выключен")
    room.updateStatus("Irina", "пользователь заглушен")

    // Отображаем информацию о комнате и участниках
    room.displayUserInfo("Ivan")
}
