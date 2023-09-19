package com.example.day13_messagingapp.data

import com.example.day13_messagingapp.R


class SampleMessage (
        val message: String,
        val time: String,
        val sendersPicId: Int,
        val sendersName: String,
        val isSent: Boolean,
        val isRead : Boolean
)


val sampleGroupChat = listOf(
        SampleMessage(
                message = "Hey! How was the trip to Busan?",
                time = "11:07",
                sendersPicId = R.drawable.p2,
                sendersName = "Sanya Mirza",
                isSent = false,
                isRead = true
        ),
        SampleMessage(
                message = "It was very good. I can't wait to tell you the things that happened there.",
                time = "11:09",
                sendersPicId = R.drawable.profile,
                sendersName = "Atul",
                isSent = true,
                isRead = true
        ),
        SampleMessage(
                message = "I'm glad to hear that! I'm looking forward to hearing your stories.",
                time = "11:12",
                sendersPicId = R.drawable.p2,
                sendersName = "Sanya Mirza",
                isSent = false,
                isRead = true
        ),
        SampleMessage(
                message = "Sure, I'll share all the details with you. It was an amazing experience.",
                time = "11:15",
                sendersPicId = R.drawable.profile,
                sendersName = "Atul",
                isSent = true,
                isRead = true
        ),
        SampleMessage(
                message = "Hey! How's it going?",
                time = "11:25",
                sendersPicId = R.drawable.p3,
                sendersName = "Emma Thompson",
                isSent = false,
                isRead = true
        ),
        SampleMessage(
                message = "I'm doing great! Just finished a new painting.",
                time = "11:27",
                sendersPicId = R.drawable.profile,
                sendersName = "Atul",
                isSent = true,
                isRead = true
        ),
        SampleMessage(
                message = "That's awesome! I'd love to see it sometime.",
                time = "11:29",
                sendersPicId = R.drawable.p3,
                sendersName = "Emma Thompson",
                isSent = false,
                isRead = true
        ),
        SampleMessage(
                message = "Sure, I'll show it to you. I'm really proud of this one.",
                time = "11:32",
                sendersPicId = R.drawable.profile,
                sendersName = "Atul",
                isSent = true,
                isRead = true
        ),
        SampleMessage(
                message = "Good morning! Are you free for a coffee later?",
                time = "9:15",
                sendersPicId = R.drawable.p4,
                sendersName = "Sophia Roberts",
                isSent = false,
                isRead = true
        ),
        SampleMessage(
                message = "Absolutely! Let's meet at our favorite cafe at 2 PM.",
                time = "9:18",
                sendersPicId = R.drawable.profile,
                sendersName = "Atul",
                isSent = true,
                isRead = true
        ),
        SampleMessage(
                message = "Great! Looking forward to it.",
                time = "9:20",
                sendersPicId = R.drawable.p4,
                sendersName = "Sophia Roberts",
                isSent = false,
                isRead = true
        ),
        SampleMessage(
                message = "Hey, have you seen the latest episode of our favorite show?",
                time = "8:30",
                sendersPicId = R.drawable.p5,
                sendersName = "Ethan Davis",
                isSent = false,
                isRead = true
        ),
        SampleMessage(
                message = "Yes! It was mind-blowing! The plot twists are incredible.",
                time = "8:32",
                sendersPicId = R.drawable.profile,
                sendersName = "Atul",
                isSent = true,
                isRead = true
        ),
        SampleMessage(
                message = "I know, right? I can't wait for the next episode!",
                time = "8:34",
                sendersPicId = R.drawable.p5,
                sendersName = "Ethan Davis",
                isSent = false,
                isRead = true
        ),
        SampleMessage(
                message = "Hey, are you free for a game night this weekend?",
                time = "5:40",
                sendersPicId = R.drawable.p6,
                sendersName = "Olivia Wilson",
                isSent = false,
                isRead = true
        ),
        SampleMessage(
                message = "Sure! I'll bring my favorite board games. What time should we start?",
                time = "5:43",
                sendersPicId = R.drawable.profile,
                sendersName = "Atul",
                isSent = true,
                isRead = true
        ),
        SampleMessage(
                message = "Let's start at 7 PM. See you then!",
                time = "5:45",
                sendersPicId = R.drawable.p6,
                sendersName = "Olivia Wilson",
                isSent = false,
                isRead = true
        ),
        SampleMessage(
                message = "Hey, do you have any recommendations for a good book to read?",
                time = "3:20",
                sendersPicId = R.drawable.p7,
                sendersName = "Alexander Martin",
                isSent = false,
                isRead = true
        ),
        SampleMessage(
                message = "Absolutely! I recently read 'The Alchemist' by Paulo Coelho. It's a must-read!",
                time = "3:23",
                sendersPicId = R.drawable.profile,
                sendersName = "Atul",
                isSent = true,
                isRead = true
        ),
        SampleMessage(
                message = "Thanks for the recommendation. I'll check it out!",
                time = "3:25",
                sendersPicId = R.drawable.p7,
                sendersName = "Alexander Martin",
                isSent = false,
                isRead = true
        ),
        SampleMessage(
                message = "Great!",
                time = "3:29",
                sendersPicId = R.drawable.p4,
                sendersName = "Sophia Roberts",
                isSent = false,
                isRead = true
        ),
)

val sampleSingleChat = listOf(
        SampleMessage(
                message = "Hey! How was the trip to Busan?",
                time = "11:07",
                sendersPicId = R.drawable.p2,
                sendersName = "Sanya Mirza",
                isSent = false,
                isRead = true
        ),
        SampleMessage(
                message = "It was very good. I can't wait to tell you the things that happened there.",
                time = "11:09",
                sendersPicId = R.drawable.profile,
                sendersName = "Atul",
                isSent = true,
                isRead = true
        ),
        SampleMessage(
                message = "I'm glad to hear that! I'm looking forward to hearing your stories.",
                time = "11:12",
                sendersPicId = R.drawable.p2,
                sendersName = "Sanya Mirza",
                isSent = false,
                isRead = true
        ),
        SampleMessage(
                message = "Sure, I'll share all the details with you. It was an amazing experience.",
                time = "11:15",
                sendersPicId = R.drawable.profile,
                sendersName = "Atul",
                isSent = true,
                isRead = true
        ),
        SampleMessage(
                message = "By the way, did you try the local cuisine there?",
                time = "11:20",
                sendersPicId = R.drawable.p2,
                sendersName = "Sanya Mirza",
                isSent = false,
                isRead = true
        ),
        SampleMessage(
                message = "Yes, I tried some delicious seafood dishes. The flavors were incredible.",
                time = "11:22",
                sendersPicId = R.drawable.profile,
                sendersName = "Atul",
                isSent = true,
                isRead = true
        ),
        SampleMessage(
                message = "That sounds amazing! I'll have to try them when I visit.",
                time = "11:25",
                sendersPicId = R.drawable.p2,
                sendersName = "Sanya Mirza",
                isSent = false,
                isRead = true
        ),
        SampleMessage(
                message = "You definitely should. I can recommend some great restaurants too.",
                time = "11:28",
                sendersPicId = R.drawable.profile,
                sendersName = "Atul",
                isSent = true,
                isRead = true
        ),
        SampleMessage(
                message = "Hey, did you watch the latest movie that everyone is talking about?",
                time = "11:35",
                sendersPicId = R.drawable.p2,
                sendersName = "Sanya Mirza",
                isSent = false,
                isRead = true
        ),
        SampleMessage(
                message = "Yes, I watched it last weekend. It was a thrilling experience!",
                time = "11:38",
                sendersPicId = R.drawable.profile,
                sendersName = "Atul",
                isSent = true,
                isRead = true
        ),
        SampleMessage(
                message = "I've been hearing great reviews. I'll have to watch it soon.",
                time = "11:42",
                sendersPicId = R.drawable.p2,
                sendersName = "Sanya Mirza",
                isSent = false,
                isRead = true
        ),
        SampleMessage(
                message = "You'll definitely enjoy it. Let me know what you think after watching.",
                time = "11:45",
                sendersPicId = R.drawable.profile,
                sendersName = "Atul",
                isSent = true,
                isRead = true
        ),
        SampleMessage(
                message = "Hey, have you heard about the new restaurant that opened downtown?",
                time = "11:50",
                sendersPicId = R.drawable.p2,
                sendersName = "Sanya Mirza",
                isSent = false,
                isRead = true
        ),
        SampleMessage(
                message = "Yes, I've heard about it. It's getting quite popular. We should try it sometime.",
                time = "11:53",
                sendersPicId = R.drawable.profile,
                sendersName = "Atul",
                isSent = true,
                isRead = true
        ),
        SampleMessage(
                message = "Definitely! Let's plan a dinner outing soon.",
                time = "11:55",
                sendersPicId = R.drawable.p2,
                sendersName = "Sanya Mirza",
                isSent = false,
                isRead = true
        ),
        SampleMessage(
                message = "Sounds like a plan. I'll check their menu and make a reservation.",
                time = "11:58",
                sendersPicId = R.drawable.profile,
                sendersName = "Atul",
                isSent = true,
                isRead = true
        ),
        SampleMessage(
                message = "K",
                time = "11:59",
                sendersPicId = R.drawable.p2,
                sendersName = "Sanya Mirza",
                isSent = false,
                isRead = true
        ),
)

