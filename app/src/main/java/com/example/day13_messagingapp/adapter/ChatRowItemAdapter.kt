package com.example.day13_messagingapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.day13_messagingapp.data.ChatRowObject
import com.example.day13_messagingapp.data.SampleMessage
import com.example.day13_messagingapp.data.sampleGroupChat
import com.example.day13_messagingapp.databinding.ChatItemviewBinding

class ChatRowItemAdapter (private val chatRowItems: List<ChatRowObject>)
    : RecyclerView.Adapter<ChatRowItemAdapter.ViewHolder>(){

    private var onClickListener: OnClickListener? = null

    class ViewHolder(binding: ChatItemviewBinding): RecyclerView.ViewHolder(binding.root) {
        val chatName = binding.personName
        val lastMsg = binding.lastMsg
        val activeDot = binding.activeDot
        val profileImg = binding.singleProfileImage
        val groupFirstImg = binding.groupProfileFirstPersonImg
        val groupSecondImg = binding.groupProfileSecondPersonImg
        val groupThirdImg = binding.groupProfileThirdPersonImg
        val groupFourthImg = binding.groupProfileForthPersonImg
        val unreadMsgCount = binding.unreadTextCount
        val lastMsgTime = binding.lastMsgTime
        val groupProfileImage = binding.multiProfileImage
        val unreadMsgShape = binding.unreadMsgShape
        val chatRowContainer = binding.chatRowContainer
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ChatItemviewBinding.inflate(
            LayoutInflater.from(parent.context),parent, false
        ))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val chatRow = chatRowItems[position]

        holder.chatRowContainer.setOnClickListener {
            if(onClickListener!= null){
                onClickListener?.onClick(position)
            }
        }

        holder.chatName.text = chatRow.name
        holder.lastMsg.text = chatRow.lastMessage
        holder.lastMsgTime.text = chatRow.time
        if(chatRow.unreadMessageCount > 0) {
            holder.unreadMsgShape.visibility = View.VISIBLE
            holder.unreadMsgCount.text = chatRow.unreadMessageCount.toString()
        }else{
            holder.unreadMsgShape.visibility = View.GONE
        }


        //when chat is a group
        if(chatRow.isGroup) {
            holder.groupProfileImage.visibility = View.VISIBLE
            holder.groupFirstImg.setImageResource(chatRow.picId[0])
            holder.groupSecondImg.setImageResource(chatRow.picId[1])
            holder.groupThirdImg.setImageResource(chatRow.picId[2])
            holder.groupFourthImg.setImageResource(chatRow.picId[3])

            holder.activeDot.visibility = View.GONE
            holder.profileImg.visibility = View.GONE

        //when chat is not a group
        } else{
            holder.profileImg.visibility = View.VISIBLE
            holder.profileImg.setImageResource(chatRow.picId[0])
            holder.groupProfileImage.visibility = View.GONE

            if(chatRow.isActive)
                holder.activeDot.visibility = View.VISIBLE
            else
                holder.activeDot.visibility = View.GONE
        }
    }

    override fun getItemCount(): Int {
        return chatRowItems.size
    }

    fun setOnClickListener(onClickListener: OnClickListener) {
        this.onClickListener = onClickListener
    }

    interface OnClickListener{
        fun onClick(position: Int)
    }
}