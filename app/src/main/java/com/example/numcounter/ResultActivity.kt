package com.example.numcounter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        supportActionBar?.hide()

        val count = intent.getStringExtra("Count")
        val TextField = findViewById(R.id.textView16) as TextView
       TextField.setText(count)

        val points = intent.getStringExtra("Points")
        val TextField1 = findViewById(R.id.textView15) as TextView
        TextField1.setText(points)

        val name = intent.getStringExtra("Username")
        val TextField2 = findViewById(R.id.textView3) as TextView
        TextField2.setText(name)


        val backBtn = findViewById(R.id.button1) as Button
        val againBtn = findViewById(R.id.button33) as Button

        backBtn.setOnClickListener {
            val intent = Intent(this@ResultActivity, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }

        againBtn.setOnClickListener {
            val intent = Intent(this@ResultActivity, GameActivity::class.java)
            startActivity(intent)
        }
    }
}