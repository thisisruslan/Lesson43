package com.example.lesson43

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.post_item_xml.view.*

class HorizontalViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    fun setInfo(postItem: PostItemClass) {
        itemView.postItemID.setImageResource(postItem.imageView)
        itemView.postDescriptionID.text = postItem.description
    }
}