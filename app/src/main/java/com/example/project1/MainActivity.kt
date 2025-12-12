package com.example.project1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // connects to activity_main.xml

        // Find button by its ID
        val btnOpenlogin : Button = findViewById(R.id.btn_open_login)

        // When button is clicked → open login
        btnOpenlogin.setOnClickListener {
            //Navigate to login
            val intent = Intent(this, SplashActivity::class.java)
            startActivity(intent)
        }
    }
}