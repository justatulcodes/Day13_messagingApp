package com.example.day13_messagingapp.data

import com.example.day13_messagingapp.R


class ChatRowObject (
    val name: String,
    val lastMessage: String,
    val time: String,
    val unreadMessageCount : Int,
    val picId: List<Int>,
    val isActive : Boolean,
    val isGroup: Boolean
)

val chatRowObjectList = listOf(
    ChatRowObject(
        name = "Julian Desliva",
        lastMessage = "Hey, how are you doing?",
        time = "17:40",
        unreadMessageCount = 2,
        picId = listOf(R.drawable.p1),
        isActive = true,
        isGroup = false
    ),
    ChatRowObject(
        name = "Class B1 Boys",
        lastMessage = "Anyone has the notes of today's lectures?",
        time = "11:40",
        unreadMessageCount = 1,
        picId = listOf(R.drawable.p1, R.drawable.p3, R.drawable.p8, R.drawable.p2),
        isActive = false,
        isGroup = true
    ),
    ChatRowObject(
        name = "Trip Plan To Paris",
        lastMessage = "Let's plan our trip!",
        time = "09:30",
        unreadMessageCount = 3,
        picId = listOf(R.drawable.p4, R.drawable.p5, R.drawable.p6, R.drawable.p7),
        isActive = false,
        isGroup = true
    ),
    ChatRowObject(
        name = "Sista Rico",
        lastMessage = "Are we meeting tomorrow?",
        time = "14:15",
        unreadMessageCount = 0,
        picId = listOf(R.drawable.p2),
        isActive = true,
        isGroup = false
    ),
    ChatRowObject(
        name = "Uni Graduates",
        lastMessage = "Let's grab lunch together.",
        time = "12:20",
        unreadMessageCount = 1,
        picId = listOf(R.drawable.p5, R.drawable.p6, R.drawable.p9, R.drawable.p4),
        isActive = true,
        isGroup = true
    ),
    ChatRowObject(
        name = "Atul Kumar",
        lastMessage = "Don't forget the deadline!",
        time = "16:55",
        unreadMessageCount = 0,
        picId = listOf(R.drawable.p7),
        isActive = false,
        isGroup = false
    ),
    ChatRowObject(
        name = "Alex Johnson",
        lastMessage = "See you tomorrow!",
        time = "21:10",
        unreadMessageCount = 0,
        picId = listOf(R.drawable.p1),
        isActive = false,
        isGroup = false
    ),
    ChatRowObject(
        name = "Emily Davis",
        lastMessage = "I have a surprise for you!",
        time = "10:05",
        unreadMessageCount = 0,
        picId = listOf(R.drawable.p2),
        isActive = true,
        isGroup = false
    ),
    ChatRowObject(
        name = "Norman Freeman",
        lastMessage = "Let's celebrate tonight!",
        time = "19:30",
        unreadMessageCount = 2,
        picId = listOf(R.drawable.p9),
        isActive = true,
        isGroup = false
    ),
    ChatRowObject(
        name = "Sophia Roberts",
        lastMessage = "Can you help me with this?",
        time = "15:40",
        unreadMessageCount = 1,
        picId = listOf(R.drawable.p4),
        isActive = false,
        isGroup = false
    ),
    ChatRowObject(
        name = "Sophia Turner",
        lastMessage = "New project update!",
        time = "13:55",
        unreadMessageCount = 0,
        picId = listOf(R.drawable.p1),
        isActive = false,
        isGroup = false
    ),
    ChatRowObject(
        name = "Liam Wilson",
        lastMessage = "Thanks for the help!",
        time = "18:20",
        unreadMessageCount = 0,
        picId = listOf(R.drawable.p9),
        isActive = true,
        isGroup = false
    )
)
