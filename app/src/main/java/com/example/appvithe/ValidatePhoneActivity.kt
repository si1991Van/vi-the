package com.example.appvithe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_validate_phone.*

class ValidatePhoneActivity : BaseActivity() {

    private lateinit var txtPhone: TextView
    private lateinit var edCode: EditText
    private lateinit var btnContinue: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_validate_phone)
        initView()
    }

    private fun initView(){
        txtPhone = findViewById(R.id.txtPhone)
        edCode = findViewById(R.id.edCode)
        btnContinue = findViewById(R.id.button)
        var bundle = intent.extras
        txtPhone.text = bundle?.getString("PHONE")
        onClick()
    }




    private fun onClick(){
        var code = edCode.text.toString().trim()
        if (code.isNullOrEmpty()){
            btnContinue.setOnClickListener {
                startActivity(Intent(this, MainActivity::class.java))
            }
        }else{
            Toast.makeText(this, "Bạn chưa nhập số điện thoại", Toast.LENGTH_LONG).show()
        }

        imgBack.setOnClickListener {
            onBackPressed()
        }
    }
}
