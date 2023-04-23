package com.example.numcounter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        supportActionBar?.hide()

        val username = intent.getStringExtra("Username")
        val myTextView = findViewById<TextView>(R.id.textView6)
        myTextView.text = username
        val button1 = findViewById(R.id.button1) as Button
        val button4 = findViewById(R.id.button4) as Button
        val button3 = findViewById(R.id.button3) as Button
        val button5 = findViewById(R.id.button5) as Button

        button4.setOnClickListener {
            finishAffinity();
            System.exit(0);
        }

        button5.setOnClickListener {
            val intent = Intent(this@HomeActivity, h_play::class.java)
            startActivity(intent)
        }

        button3.setOnClickListener {
            val intent = Intent(this@HomeActivity, Play_Activity::class.java)
            startActivity(intent)
        }

        button1.setOnClickListener {
            val intent = Intent(this@HomeActivity, GameActivity::class.java)
            intent.putExtra("Username",username)
            startActivity(intent)

        }

    }
}