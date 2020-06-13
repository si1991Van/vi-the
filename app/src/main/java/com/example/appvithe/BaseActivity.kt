package com.example.appvithe

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat

abstract class BaseActivity: AppCompatActivity(){
    private lateinit var imgBack: ImageView
    private lateinit var txtTitle: TextView
    private lateinit var clHeader: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        imgBack = findViewById(R.id.imgBack)
        txtTitle = findViewById(R.id.txtName)
        clHeader = findViewById(R.id.clHeader)
        imgBack.setOnClickListener {
            onBackPressed()
        }
    }

    fun  setTitleHeader(title: String?){
        txtTitle.text = title
    }

    fun setBackgroundHeader(color: Int){
        clHeader.setBackgroundColor(ContextCompat.getColor(this, color))
    }
    override fun onBackPressed() {
        super.onBackPressed()
    }
}