package com.example.appvithe.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.appvithe.R
import com.example.appvithe.model.NewsPaperItemResponse


class NewPageAdapter(var mContext: Context, private var listMyCourse: ArrayList<NewsPaperItemResponse>?, private var onClick: (NewsPaperItemResponse?) -> Unit) : RecyclerView.Adapter<NewPageAdapter.NewsPaperViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsPaperViewHolder {
        val view = LayoutInflater.from(mContext).inflate(R.layout.item_new_page, parent, false)
        return NewsPaperViewHolder(view)
    }

    override fun onBindViewHolder(holder: NewsPaperViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return listMyCourse?.size ?: 0
    }




    inner class NewsPaperViewHolder(view: View) : RecyclerView.ViewHolder(view){


        
    }
}