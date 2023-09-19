package com.example.day13_messagingapp

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.WindowInsetsControllerCompat
import com.example.day13_messagingapp.adapter.ChatRowItemAdapter
import com.example.day13_messagingapp.data.SampleMessage
import com.example.day13_messagingapp.data.chatRowObjectList
import com.example.day13_messagingapp.databinding.ActivityMainBinding

//https://dribbble.com/shots/7080766-Chat-App/attachments/82257?mode=media

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setStatusBarColorAndAppearance("#ffffff", true)

        val adapter = ChatRowItemAdapter(chatRowObjectList)
        adapter.setOnClickListener(object : ChatRowItemAdapter.OnClickListener{
            override fun onClick(position: Int) {
                val intent = Intent(this@MainActivity, MessageActivity::class.java)
                intent.putExtra("chatRowIndex", position)
                startActivity(intent)
            }

        })
        binding.rvChatList.adapter = adapter
    }

    fun Activity.setStatusBarColorAndAppearance(statusBarColor: String, isLight: Boolean ) {
        try {
            window.statusBarColor = (Color.parseColor(statusBarColor))// Or we can use from resource color:  ContextCompat.getColor(mContext, R.color.colorPrimary)
            WindowInsetsControllerCompat(window, window.decorView).isAppearanceLightStatusBars = isLight
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}