package com.example.lesson43

import android.view.View
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.post_xml.view.*

class PostViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)  {

    fun populatePostModel(postModel: PostClass, activity: MainActivity) {
        val hModels: MutableList<PostItemClass> = mutableListOf()
        for (i in 1..3) {
            hModels.add(PostItemClass(R.drawable.pubg, "PUBG MOBILE \n556 MB"))
            hModels.add(PostItemClass(R.drawable.zombie, "Plants vs Zombies \n98 MB"))
            hModels.add(PostItemClass(R.drawable.clash, "Clash of Clans \n151 MB"))
            hModels.add(PostItemClass(R.drawable.angrybirds, "Angry Birds 2 \n213 MB"))
            postModel.adapter.hModels = hModels
        }

        itemView.recyclerPostID.adapter = postModel.adapter
        itemView.recyclerPostID.addItemDecoration(DividerItemDecoration(activity, DividerItemDecoration.HORIZONTAL))

    }
}