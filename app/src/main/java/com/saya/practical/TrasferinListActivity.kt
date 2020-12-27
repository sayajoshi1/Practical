package com.saya.practical

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import org.w3c.dom.Text

class TrasferinListActivity : AppCompatActivity() {

    private lateinit var txtMobile: TextView
    private lateinit var txtGender: TextView
    private lateinit var txtAddress: TextView
    private lateinit var txtName: TextView
    private lateinit var lstperson: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trasferin_list)
        lstperson=findViewById(R.id.lstperson)
        txtName = findViewById(R.id.txt_personName)
        txtAddress = findViewById(R.id.txtPersonAddress)
        txtGender = findViewById(R.id.txtPersonGender)
        txtMobile = findViewById(R.id.txtPersonMobile)
        var data = intent.getSerializableExtra("mydata") as ArrayList<Person>

        var a = ArrayAdapter(this,android.R.layout.simple_list_item_1,data);
        lstperson.adapter = a;

        lstperson.setOnItemClickListener(object:AdapterView.OnItemClickListener{
            override fun onItemClick(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(this@TrasferinListActivity,data.get(position).Name,Toast.LENGTH_SHORT).show()
                txtName.setText(data.get(position).Name)
                txtAddress.setText(data.get(position).Address)
                txtGender.setText(data.get(position).Gender)
                txtMobile.setText(data.get(position).Mobile)
            }
        })
    }
}