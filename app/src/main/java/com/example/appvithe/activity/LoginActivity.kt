package com.example.appvithe.activity

import android.content.Intent
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.widget.Toast
import com.example.appvithe.BaseActivity
import com.example.appvithe.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : BaseActivity() {

    private var isCheckedPass: Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        onClick()
        img_visibility_pass.setOnClickListener {
            showPassword()
        }
    }

    private fun onClick(){
        var phone = edt_user_name.text.toString().trim()
        if (phone.isNullOrEmpty()){
            btn_login.setOnClickListener {
                hideKeyBoard()
                var intent = Intent(this, MainActivity::class.java)
                intent.putExtra("PHONE", phone)
                startActivity(intent)
            }
        }else{
            Toast.makeText(this, "Bạn chưa nhập số điện thoại", Toast.LENGTH_LONG).show()
        }
    }

    private fun showPassword() {
        isCheckedPass = !isCheckedPass
        if (isCheckedPass) {
            edt_password.transformationMethod = HideReturnsTransformationMethod.getInstance()
            img_visibility_pass.setImageResource(R.drawable.ic_visibility_off)
        } else {
            edt_password.transformationMethod = PasswordTransformationMethod.getInstance()
            img_visibility_pass.setImageResource(R.drawable.ic_visibility_on)
        }
    }

}
