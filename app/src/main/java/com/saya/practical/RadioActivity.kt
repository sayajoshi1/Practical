package com.saya.practical

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.TextView

class RadioActivity : AppCompatActivity() {
    private lateinit var  txtgender : TextView
    private  lateinit var btnmale : RadioButton
    private lateinit var  btnfemale : RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio2)
        txtgender = findViewById(R.id.txtgender)
        btnfemale = findViewById(R.id.btnfemale)
        btnmale = findViewById(R.id.btnmale)


        btnmale.setOnClickListener {
            txtgender.text="Male"

        }

        btnfemale.setOnClickListener {
            txtgender.text="Female"

        }

    }


}