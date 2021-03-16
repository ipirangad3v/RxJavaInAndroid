package com.ipsoft.rxjava.ui.main.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ipsoft.rxjava.data.model.User
import com.ipsoft.rxjava.databinding.ItemLayoutBinding

/**
 *
 *  Author:     Anthoni Ipiranga
 *  Project:    RxJava
 *  Date:       16/03/2021
 */

class MainAdapter(
    private val users: ArrayList<User>
) : RecyclerView.Adapter<MainAdapter.DataViewHolder>() {

    private lateinit var binding: ItemLayoutBinding

    inner class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(user: User) {
            binding.textViewUserName.text = user.name
            binding.textViewUserEmail.text = user.email
            Glide.with(binding.imageViewAvatar.context)
                .load(user.avatar)
                .into(binding.imageViewAvatar)
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        binding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        val rootView = binding.root

        return DataViewHolder(rootView)
    }

    override fun getItemCount(): Int = users.size


    override fun onBindViewHolder(holder: DataViewHolder, position: Int) =
        holder.bind(users[position])

    fun addData(list: List<User>) {
        users.addAll(list)
    }
}