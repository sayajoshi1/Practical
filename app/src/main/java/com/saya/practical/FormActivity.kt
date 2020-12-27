package com.saya.practical

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import androidx.appcompat.app.AlertDialog

class FormActivity : AppCompatActivity() {
    private lateinit var etname:EditText
    private lateinit var etaddress: EditText
    private lateinit var etmobile :EditText
    private  lateinit var btnmale: RadioButton
    private lateinit var  btnfemale: RadioButton
    private lateinit var btnsubmit: Button
    var gender =""
    var list = arrayListOf<Person>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        etname=findViewById(R.id.etname)
        etaddress=findViewById(R.id.etaddress)
        etmobile=findViewById(R.id.etmobile)
        btnmale=findViewById(R.id.btnmale)
        btnfemale=findViewById(R.id.btnfemale)
        btnsubmit=findViewById(R.id.btn_form_submit)


//        btnSubmit.setOnClickListener(object : View.OnClickListener{
//            override fun onClick(v: View?) {
//
//            }
//        })

      btnsubmit.setOnClickListener{
          var person = Person(etname.text.toString(),etaddress.text.toString(),etmobile.text.toString(),gender)
          list.add(person)
          startActivity(Intent(this, TrasferinListActivity::class.java)
              .putExtra("mydata",list))
      }


        btnfemale.setOnClickListener{
            gender="Female"
        }

        btnmale.setOnClickListener{
            gender="Male"
        }

    }
}