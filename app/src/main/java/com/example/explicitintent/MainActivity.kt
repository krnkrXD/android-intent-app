package com.example.explicitintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.clickone);
        btn.setOnClickListener {
            // Open a new Activity/Screen

            intent = Intent(applicationContext, SecondActivity::class.java);
            startActivity(intent);
        }
    }
}