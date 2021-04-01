package com.oidev.rxkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val msg = intent.getStringExtra("msg")
        val msgtxt = findViewById<TextView>(R.id.msgtxt)
        val button_back = findViewById<Button>(R.id.button_back)
        msgtxt.text=msg

        //msgtxt.text = msg
        button_back.setOnClickListener {
            onBackPressed()
        }
    }
}