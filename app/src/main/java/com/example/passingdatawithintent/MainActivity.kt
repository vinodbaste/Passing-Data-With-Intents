package com.example.passingdatawithintent

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

lateinit var name : EditText
lateinit var age : EditText
lateinit var address : EditText
lateinit var apply : Button

//Creating An Array Object
val test: ArrayList<String> = ArrayList()

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.name)
        age = findViewById(R.id.age)
        address = findViewById(R.id.address)
        apply = findViewById(R.id.apply)


        apply.setOnClickListener {
            val name = name.text.toString()
            val age = age.text.toString().toInt()
            val address = address.text.toString()

            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("EXTRA_NAME", name)
            intent.putExtra("EXTRA_AGE", age)
            intent.putExtra("EXTRA_ADDRESS", address)
            intent.putExtra("STRING_EXTRA", test)

//inserting into test array
            test.add("$name")
            test.add("$age")
            test.add("$address")

            startActivity(intent)
        }
    }
}