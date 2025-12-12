package com.example.project1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class otp_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.otp_activity) // connects to complete_activity.xml

        // Find button by its ID
        val btnVerifyOtp : Button = findViewById(R.id.btnVerifyOtp)

        // When button is clicked → open login
        btnVerifyOtp.setOnClickListener {
            //Navigate to login
            val intent = Intent(this, success_activity::class.java)
            startActivity(intent)
        }
    }
}