package com.example.numcounter

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class Play_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play)

        supportActionBar?.hide()

        val button1 = findViewById(R.id.button1) as Button

        button1.setOnClickListener {
            finish()
        }


    }
}