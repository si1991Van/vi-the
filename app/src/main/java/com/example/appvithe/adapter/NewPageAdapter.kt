package com.example.appvithe.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.appvithe.R
import com.example.appvithe.model.NewsPaperItemResponse


class NewPageAdapter(var mContext: Context, private var listMyCourse: ArrayList<NewsPaperItemResponse>?, private var onClick: (NewsPaperItemResponse?) -> Unit) : RecyclerView.Adapter<NewPageAdapter.NewsPaperViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsPaperViewHolder {
        val view = LayoutInflater.from(mContext).inflate(R.layout.item_new_page, parent, false)
        return NewsPaperViewHolder(view)
    }

    override fun onBindViewHolder(holder: NewsPaperViewHolder, position: Int) {
        holder.bindData(listMyCourse?.get(position))
    }

    override fun getItemCount(): Int {
        return listMyCourse?.size ?: 0
    }




    inner class NewsPaperViewHolder(view: View) : RecyclerView.ViewHolder(view){
        private lateinit var imgCover : ImageView
        private lateinit var txtName: TextView
        private lateinit var txtLocation: TextView
        private lateinit var txtDate: TextView
        private lateinit var txtDecription: TextView

        fun bindData(item: NewsPaperItemResponse?){
            txtName.text = item?.name
            txtLocation.text = item?.location
            txtDate.text = item?.date
            txtDecription.text = item?.decription
        }
        
    }
}