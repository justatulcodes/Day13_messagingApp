package com.example.day13_messagingapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.day13_messagingapp.data.SampleMessage
import com.example.day13_messagingapp.databinding.ChatMessgaeRowItemBinding

class ChatMessageRowAdapter(private val messageList: List<SampleMessage>, private val isGroup: Boolean)
    : RecyclerView.Adapter<ChatMessageRowAdapter.ViewHolder>(){


    class ViewHolder(binding: ChatMessgaeRowItemBinding): RecyclerView.ViewHolder(binding.root) {
        val sentMessageRow = binding.sentMsgRow
        val recievedMessageRow = binding.recievedMsgRow

        val singleProfileImg = binding.singleProfileImage
        val senderName = binding.chatMsgSenderName
        val recievedText = binding.recievedText
        val recievedTime = binding.recievedTime

        val sentTime = binding.sentTime
        val sentText = binding.sentText
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        return ViewHolder(ChatMessgaeRowItemBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        ))
    }

    override fun getItemCount(): Int {
        return messageList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val chatItem = messageList[position]

        if(chatItem.isSent) {
            holder.recievedMessageRow.visibility = View.GONE
            holder.sentMessageRow.visibility = View.VISIBLE

            holder.sentText.text = chatItem.message
            holder.sentTime.text = chatItem.time

        } else {
            holder.recievedMessageRow.visibility = View.VISIBLE
            holder.sentMessageRow.visibility = View.GONE

            holder.recievedText.text = chatItem.message
            holder.singleProfileImg.setImageResource(chatItem.sendersPicId)
            if(isGroup){
                holder.senderName.visibility = View.VISIBLE
                holder.senderName.text = chatItem.sendersName
            }else{
                holder.senderName.visibility = View.GONE
            }

            holder.recievedTime.text = chatItem.time

        }
    }

}