package com.saya.practical

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class userLoginActivity : AppCompatActivity() {
    private lateinit var etname : EditText
    private lateinit var  etpassword : EditText
    private lateinit var btnlogin : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_login)

        etname = findViewById(R.id.etname)
        etpassword = findViewById(R.id.etpassword)
        btnlogin = findViewById(R.id.btnlogin)

        btnlogin.setOnClickListener {
            if (etname.text.toString() == "admin" && etpassword.text.toString()=="admin"){
//                Toast.makeText("this","You are logged in", Toast.LENGTH_SHORT).show()
            }
            else{
//                Toast.makeText("this","Failed", Toast.LENGTH_SHORT).show()
            }
        }

    }
}