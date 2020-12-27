package com.saya.practical

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class FormActivityLab7 : AppCompatActivity() {
    private lateinit var lstperson: ListView
    private lateinit var txtMobile: TextView
    private lateinit var txtGender: TextView
    private lateinit var txtAddress: TextView
    private lateinit var txtName: TextView
    private lateinit var btnaddstudent: Button
    var persons = arrayListOf<Person>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_lab7)

        lstperson = findViewById(R.id.lstperson)
        txtName = findViewById(R.id.txt_personName)
        txtAddress = findViewById(R.id.txtPersonAddress)
        txtGender = findViewById(R.id.txtPersonGender)
        txtMobile = findViewById(R.id.txtPersonMobile)
        btnaddstudent = findViewById(R.id.btnaddstudent)


//        var data = intent.getSerializableExtra("mydata") as ArrayList<Person>




        btnaddstudent.setOnClickListener {
            startActivityForResult(Intent(this, NewFormLab7Activity::class.java),1)


        }


    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode==1){
            if (resultCode==Activity.RESULT_OK){
                var person = data?.getSerializableExtra("data") as Person
                println(person.Name)
                persons.add(person);
                var a = ArrayAdapter(this,android.R.layout.simple_list_item_1,persons);
                lstperson.adapter = a;

                lstperson.setOnItemClickListener(object: AdapterView.OnItemClickListener{
                    override fun onItemClick(
                        parent: AdapterView<*>?,
                        view: View?,
                        position: Int,
                        id: Long
                    ) {
                        Toast.makeText(this@FormActivityLab7,persons.get(position).Name, Toast.LENGTH_SHORT).show()
                        txtName.setText(persons.get(position).Name)
                        txtAddress.setText(persons.get(position).Address)
                        txtGender.setText(persons.get(position).Gender)
                        txtMobile.setText(persons.get(position).Mobile)
                    }
                })

            }
        }

    }
}