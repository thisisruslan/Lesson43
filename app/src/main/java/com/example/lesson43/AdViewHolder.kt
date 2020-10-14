package com.example.lesson43

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.ad_xml.view.*

class AdViewHolder(itemView: View) :  RecyclerView.ViewHolder(itemView) {

    fun populateAdModel(model: AdClass) {
        itemView.ad_imgID.setImageResource(model.imageView)
        itemView.ad_textID.text = model.description
    }
}