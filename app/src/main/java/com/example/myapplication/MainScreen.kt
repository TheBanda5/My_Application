package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)


        val btnNavigateToDetail = findViewById<Button>(R.id.btnNavigateToDetail)
        val btnReInputData = findViewById<Button>(R.id.btnReInputData)
        val btnClearData = findViewById<Button>(R.id.btnClearData)

        btnNavigateToDetail.setOnClickListener{

        }
    }
}