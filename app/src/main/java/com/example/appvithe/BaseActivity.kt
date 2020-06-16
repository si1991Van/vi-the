package com.example.appvithe

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.example.appvithe.activity.LoginActivity
import com.example.appvithe.utills.IntentActionKeys

abstract class BaseActivity: AppCompatActivity(){
    private lateinit var imgBack: ImageView
    private lateinit var txtTitle: TextView
    private lateinit var clHeader: ConstraintLayout

    private val logoutBroadcastReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
        }
    }

    override fun onStart() {
        super.onStart()
        LocalBroadcastManager.getInstance(this)
            .registerReceiver(logoutBroadcastReceiver, IntentFilter(IntentActionKeys.FORCE_LOGOUT_ACTION))
    }

    override fun onStop() {
        LocalBroadcastManager.getInstance(this).unregisterReceiver(logoutBroadcastReceiver)
        super.onStop()
    }


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