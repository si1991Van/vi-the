package com.example.appvithe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : BaseActivity() {

    private lateinit var btnContinue : Button
    private lateinit var edPhone : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        initView()
    }


    private fun initView(){
        btnContinue = findViewById(R.id.btnContinue)
        edPhone = findViewById(R.id.edPhone)

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
