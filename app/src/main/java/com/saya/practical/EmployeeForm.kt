package com.saya.practical

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import org.w3c.dom.Text
import java.util.*

class EmployeeForm : AppCompatActivity() {
    private lateinit var etname : EditText
    private  lateinit var spdepartment : Spinner
    private  lateinit var  acaddress : AutoCompleteTextView
    private lateinit var  btnsubmit : Button
    private  lateinit var tvjoindate : TextView
    private lateinit var  tvresult: TextView
    var selectedItem=""
    private  val departments = arrayOf("management","administration","marketing","academic")
    private val places = arrayOf("Kathmandu","lalitpur","Chitwan","Bhaktapur")
    var chosenyear =""
    var chosenmonth =""
    var chosenday =""
    val flag = true


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employee_form)
        etname=findViewById(R.id.etname)
        spdepartment=findViewById(R.id.spdepartment)
        acaddress=findViewById(R.id.acaddress)
        tvjoindate=findViewById(R.id.tvjoindate)
        btnsubmit=findViewById(R.id.btnsubmit)
        tvresult=findViewById(R.id.tvresult)

        //autoComplete
        //For autocomplete textview

        val autoCompleteAdapter = ArrayAdapter(

            this,
            android.R.layout.simple_dropdown_item_1line, places



        )
        acaddress.setAdapter(autoCompleteAdapter)
        acaddress.threshold=1



//spinner code
        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            departments
        )

        spdepartment.adapter = adapter

        spdepartment.onItemSelectedListener=
            object : AdapterView.OnItemSelectedListener{

                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    selectedItem = parent?.getItemAtPosition(position).toString()
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }


            }

        //spinner end

        //datepicker

        tvjoindate.setOnClickListener{

            if (flag== true){
                loadCalendar()
            }
            else{
                loadedCalendar()
            }


        }


        btnsubmit.setOnClickListener{
            tvresult.text=" Name: ${etname.text} \n department: $selectedItem \n address: ${acaddress.text} \n and your join date is ${tvjoindate.text} "
        }

    }

    private fun loadCalendar(){
        val c= Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month= c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        val datePickerDialog = DatePickerDialog(
            this,
            {view, yearNew,monthOfYear, dayOfMonth ->
                tvjoindate.text="$dayOfMonth- ${monthOfYear+1} - $yearNew (dd-mm-yy)"


            },
            year,
            month,
            day
        ).show()
    }

    private fun loadedCalendar(){
        loadCalendar()
    }

}