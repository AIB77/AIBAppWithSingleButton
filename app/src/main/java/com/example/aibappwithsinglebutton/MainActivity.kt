package com.example.aibappwithsinglebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var EDT:EditText
    lateinit var BTN:Button
    lateinit var TV:TextView
    lateinit var useriput:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        EDT=findViewById(R.id.theeditText)
        BTN=findViewById(R.id.Thebutton)
        TV=findViewById(R.id.thetextView)

        BTN.setOnClickListener {
            useriput=EDT.text.toString()
            TV.text=useriput
        }



    }
}