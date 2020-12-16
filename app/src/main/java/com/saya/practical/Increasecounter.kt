package com.saya.practical

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Increasecounter : AppCompatActivity() {

    private lateinit var etcount : EditText
    private lateinit var btnincrease : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_increasecounter)

        etcount = findViewById(R.id.etcount)
        btnincrease = findViewById(R.id.btnincrease)

        btnincrease.setOnClickListener{
            var n : Int = etcount.text.toString().toInt()
            etcount.setText((n+1).toString())


        }

    }
}