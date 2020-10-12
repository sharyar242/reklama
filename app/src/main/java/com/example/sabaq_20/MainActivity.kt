package com.example.sabaq_20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var adapter = MyAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView.adapter = adapter
        recyclerView.addItemDecoration(DividerItemDecoration(this,DividerItemDecoration.VERTICAL))
        setData()
    }

    private fun setData(){
        val models : MutableList<ListItem> = mutableListOf()
        for (i in 0..100){
            if (i%5==0){
                val reklama = Ad(ListItem.AD_TYPE,"","","")
                models.add(reklama)
            }else{
                val post = Post(ListItem.POST_TYPE,"", "")
                models.add(post)
            }
        }
        adapter.models = models

    }
}