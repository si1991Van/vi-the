package com.example.appvithe.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appvithe.BaseActivity
import com.example.appvithe.R

class ChatActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)
        setTitleHeader(getString(R.string.screen_phone_card))
    }
}
