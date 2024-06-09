package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Next = findViewById<Button>(R.id.button2)
        val Exit = findViewById<Button>(R.id.button)

        Next.setOnClickListener {
            // Move to next page
            val intent = Intent(this, MainScreen::class.java)
        }

        Exit.setOnClickListener{
            // CLose the app
            finish()
        }

    }

}
