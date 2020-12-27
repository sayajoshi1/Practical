package com.saya.practical

import android.nfc.NfcAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.core.view.isInvisible
import androidx.core.view.isVisible

private lateinit var etname : EditText
private lateinit var etemail : EditText
private lateinit var btnstudent : RadioButton
private lateinit var btnstaff : RadioButton
private lateinit var tvbatch : TextView
private lateinit var spbatch : Spinner
private  lateinit var tvid : TextView
private lateinit var etid: EditText
private lateinit var btnregister: Button
private  val batch = arrayOf("25A","25B","25C","24A","24B")
private  val Department = arrayOf("management","Academic","Administration")




class CustomActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom)

        etname=findViewById(R.id.etname)
        etemail=findViewById(R.id.etemail)
        btnstaff=findViewById(R.id.btnstaff)
        tvbatch=findViewById(R.id.tvbatch)
        spbatch=findViewById(R.id.spbatch)
        tvid=findViewById(R.id.tvid)
        etid=findViewById(R.id.etid)
        btnregister=findViewById(R.id.btnregister)

        btnstudent.setOnClickListener{
            tvbatch.text="Batch"
            tvid.visibility = View.VISIBLE
            etid.visibility = View.VISIBLE



            val adapter = ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                batch
            )


            //setting the adapter to spinners adapter
            spbatch.adapter= adapter
            //on item selected listener on spinner
            spbatch.onItemSelectedListener=
                object : AdapterView.OnItemSelectedListener{

                    override fun onItemSelected(
                        parent: AdapterView<*>?,
                        view: View?,
                        position: Int,
                        id: Long
                    ) {
                        val selectedItem = parent?.getItemAtPosition(position).toString()
                        Toast.makeText(
                            applicationContext,"Selected item:$selectedItem",
                            Toast.LENGTH_SHORT
                        ).show()
                    }

                    override fun onNothingSelected(parent: AdapterView<*>?) {
                        TODO("Not yet implemented")
                    }


                }



        }

        btnstaff.setOnClickListener{
            tvbatch.text="Department"
            tvid.visibility = View.GONE
            etid.visibility = View.GONE

            val adapter = ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                Department
            )


            //setting the adapter to spinners adapter
            spbatch.adapter= adapter
            //on item selected listener on spinner
            spbatch.onItemSelectedListener=
                object : AdapterView.OnItemSelectedListener{

                    override fun onItemSelected(
                        parent: AdapterView<*>?,
                        view: View?,
                        position: Int,
                        id: Long
                    ) {
                        val selectedItem = parent?.getItemAtPosition(position).toString()
                        Toast.makeText(
                            applicationContext,"Selected item:$selectedItem",
                            Toast.LENGTH_SHORT
                        ).show()
                    }

                    override fun onNothingSelected(parent: AdapterView<*>?) {
                        TODO("Not yet implemented")
                    }


                }




        }

        btnregister.setOnClickListener{



        }


    }


}