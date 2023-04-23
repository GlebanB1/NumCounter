package com.example.numcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class h_play : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hplay)

        supportActionBar?.hide()

        val button1 = findViewById(R.id.button1) as Button

        button1.setOnClickListener {
            finish()
        }


    }
}