package com.example.appvithe.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.appvithe.BaseActivity
import com.example.appvithe.R

class LoginActivity : BaseActivity() {

    private lateinit var btnContinue : Button
    private lateinit var edPhone : EditText
    private lateinit var edPass : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        initView()
    }


    private fun initView(){
        btnContinue = findViewById(R.id.btnContinue)
        edPhone = findViewById(R.id.edPhone)
        edPass = findViewById(R.id.edPass)
        onClick()
    }

    private fun onClick(){
        var phone = edPhone.text.toString().trim()
        if (phone.isNullOrEmpty()){
            btnContinue.setOnClickListener {
                var intent = Intent(this, ValidatePhoneActivity::class.java)
                intent.putExtra("PHONE", phone)
                startActivity(intent)
            }
        }else{
            Toast.makeText(this, "Bạn chưa nhập số điện thoại", Toast.LENGTH_LONG).show()
        }
    }

}
