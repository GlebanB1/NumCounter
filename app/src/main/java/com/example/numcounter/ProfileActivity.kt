package com.example.numcounter


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        supportActionBar?.hide()

        val button2 = findViewById(R.id.button2) as Button
        val editTextTextPersonName = findViewById(R.id.editTextTextPersonName) as EditText
        button2.setOnClickListener {
            Toast.makeText(this@ProfileActivity, "Welcome to NumCounter!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this@ProfileActivity, HomeActivity::class.java)
            var name1: String = editTextTextPersonName.getText().toString()
            if (name1=="") {
                name1 = "Noname"
            }
            intent.putExtra("Username",name1)
            startActivity(intent)
            finish()
        }

    }

}
