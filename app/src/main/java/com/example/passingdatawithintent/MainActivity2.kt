package com.example.passingdatawithintent

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

lateinit var txtview : TextView
lateinit var array1 : TextView


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        txtview = findViewById(R.id.txtview)
        array1 = findViewById(R.id.array)

        val name =intent.getStringExtra("EXTRA_NAME")
        val age = intent.getIntExtra("EXTRA_AGE", 0)
        val address = intent.getStringExtra("EXTRA_ADDRESS")

        //Calling The Array Objects
        val mylist = intent.getSerializableExtra("STRING_EXTRA") as ArrayList<String>?

        val txt = "$name is $age is $address"
        val arry = "$mylist"

        txtview.text = txt
        array1.text = arry
    }
}