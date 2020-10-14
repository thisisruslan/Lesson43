package com.example.lesson43

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var adapter = Adapter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerID.adapter = adapter
        recyclerID.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        SetData()
    }


    fun SetData() {
        val models: MutableList<CommonItemClass> = mutableListOf()
        for (i in 1..15) {
            if (i % 4 ==0) {
                val adModel = AdClass(CommonItemClass.AD_TYPE, R.drawable.texnopos,"Learn programming with TexnoPOS and create your future! \nt.me/texnopos")
                models.add(adModel)
            } else {
                val postModel = PostClass(CommonItemClass.POST_TYPE)
                models.add(postModel)
            }
        }
        adapter.models = models
    }

}