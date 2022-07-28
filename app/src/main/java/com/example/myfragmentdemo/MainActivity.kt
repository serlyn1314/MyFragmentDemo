package com.example.myfragmentdemo

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var btn = findViewById<Button>(R.id.btnCall)
        btn.setOnClickListener(){

            var number = Uri.parse("tel:999")
//            var location = Uri.parse("geko: 3.214411583154627, 101.7266601637175")
            var intent = Intent(Intent.ACTION_DIAL,number)
//            var view = Intent(Intent.ACTION_VIEW, location)
            startActivity(intent)
        }
    }
}