package com.saya.practical

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton

class NewFormLab7Activity : AppCompatActivity() {
    private lateinit var etname: EditText
    private lateinit var etaddress: EditText
    private lateinit var etmobile : EditText
    private  lateinit var btnmale: RadioButton
    private lateinit var  btnfemale: RadioButton
    private lateinit var btnsubmit: Button
    var gender =""
    var list = arrayListOf<Person>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_form_lab7)

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
            var intent = Intent()
            intent.putExtra("data",person) // person data is added to the send back
            setResult(Activity.RESULT_OK,intent);
            finish()
        }


        btnfemale.setOnClickListener{
            gender="Female"
        }

        btnmale.setOnClickListener{
            gender="Male"
        }
    }
}