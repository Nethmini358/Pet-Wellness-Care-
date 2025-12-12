package com.example.project1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class signin_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signin_activity) // connects to login_activity.xml

        // Find button by its ID
        val btnOpenlogin : Button = findViewById(R.id.btn_open_login)

        // When button is clicked → open login
        btnOpenlogin.setOnClickListener {
            //Navigate to login
            val intent = Intent(this, login_activity::class.java)
            startActivity(intent)
        }
    }
}