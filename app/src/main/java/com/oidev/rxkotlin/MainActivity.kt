package com.oidev.rxkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val message = findViewById<EditText>(R.id.message)
        val btn = findViewById<Button>(R.id.btn)

        btn.setOnClickListener({
           var msg=message.text.toString()
            print(msg)
            val intent = Intent(this,Activity2::class.java)
            intent.putExtra("msg", msg)
            msg= message.text.clear().toString()
            startActivity(intent)
        })
    }
}