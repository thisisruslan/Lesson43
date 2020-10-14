package com.example.lesson43

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class HorizontalAdapter : RecyclerView.Adapter<HorizontalViewHolder>() {
    var hModels: MutableList<PostItemClass> = mutableListOf()
    set(value) {
        field = value
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HorizontalViewHolder {
        val postItem = LayoutInflater.from(parent.context).inflate(R.layout.post_item_xml, parent, false)
        return HorizontalViewHolder(postItem)
    }

    override fun onBindViewHolder(holder: HorizontalViewHolder, position: Int) {
        holder.setInfo(hModels[position])
    }

    override fun getItemCount(): Int {
        return hModels.size
    }
}