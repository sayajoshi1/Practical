package com.saya.practical

import android.location.Address
import java.io.Serializable

class Person:Serializable{
    lateinit var Name: String;
     lateinit var Address : String;
     lateinit var Gender : String;
      lateinit var Mobile : String

    constructor(name:String, address: String,mobile: String, gender: String){
        this.Name = name;
        this.Address = address;
        this.Mobile= mobile;
        this.Gender = gender;
    }

    override fun toString(): String {
        return Name;
    }


}