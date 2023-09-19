package com.example.day13_messagingapp

import android.annotation.SuppressLint
import android.app.Activity
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.WindowInsetsControllerCompat
import com.example.day13_messagingapp.adapter.ChatMessageRowAdapter
import com.example.day13_messagingapp.data.ChatRowObject
import com.example.day13_messagingapp.data.chatRowObjectList
import com.example.day13_messagingapp.data.sampleGroupChat
import com.example.day13_messagingapp.data.sampleSingleChat
import com.example.day13_messagingapp.databinding.ActivityMessageBinding

class MessageActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMessageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMessageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setStatusBarColorAndAppearance("#abbbea", true)

        val position = intent.getIntExtra("chatRowIndex", 0)
        val selectedChat = chatRowObjectList[position]
        val isGroup = selectedChat.isGroup

        val adapter : ChatMessageRowAdapter = if(isGroup){
            ChatMessageRowAdapter(sampleGroupChat, isGroup)
        } else{
            ChatMessageRowAdapter(sampleSingleChat, isGroup)
        }

        topBarSetup(adapter, isGroup, selectedChat)
    }

    @SuppressLint("SetTextI18n")
    fun topBarSetup(adapter: ChatMessageRowAdapter, isGroup: Boolean, selectedChat: ChatRowObject) {

        if(isGroup) {
            binding.activeDot.visibility = View.GONE
            binding.singleProfileImage.visibility = View.GONE
            binding.multiProfileImage.visibility = View.VISIBLE
            binding.personName.text = selectedChat.name
            binding.activeStatus.text = "4 active"
        }else{
            binding.activeDot.visibility = View.VISIBLE
            binding.singleProfileImage.visibility = View.VISIBLE
            binding.multiProfileImage.visibility = View.GONE
            binding.personName.text = selectedChat.name
            binding.activeStatus.text = "Active"
        }

        binding.rvMessageList.adapter = adapter
        binding.rvMessageList.smoothScrollToPosition(adapter.itemCount-1)

        binding.backBtn.setOnClickListener {
            finish()
        }
    }

    fun Activity.setStatusBarColorAndAppearance(statusBarColor: String, isLight: Boolean ) {
        try {
            window.statusBarColor =
                (Color.parseColor(statusBarColor))// Or we can use from resource color:  ContextCompat.getColor(mContext, R.color.colorPrimary)
            WindowInsetsControllerCompat(window, window.decorView).isAppearanceLightStatusBars =
                isLight
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}