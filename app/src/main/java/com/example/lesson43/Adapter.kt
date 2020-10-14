package com.example.lesson43

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class Adapter(var activity: MainActivity): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var models: List<CommonItemClass> = listOf()
    set(value) {
        field = value
        notifyDataSetChanged()
    }

    override fun getItemViewType(position: Int): Int {
        return models[position].type
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val itemView: View
        return if (viewType == CommonItemClass.AD_TYPE) {
            itemView = LayoutInflater.from(parent.context).inflate(R.layout.ad_xml, parent, false)
            AdViewHolder(itemView)
        } else {
            itemView = LayoutInflater.from(parent.context).inflate(R.layout.post_xml, parent, false)
            PostViewHolder(itemView)
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (getItemViewType(position) == CommonItemClass.AD_TYPE) {
            (holder as AdViewHolder).populateAdModel(models[position] as AdClass)
        } else {
            (holder as PostViewHolder).populatePostModel(models[position] as PostClass, activity)
        }
    }

    override fun getItemCount(): Int {
        return models.size
    }
}