package com.example.project1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class onboard1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboard1) // connects to complete_activity.xml

        // Find button by its ID
        val buttonsk1 : Button = findViewById(R.id.buttonsk3)

        // When button is clicked → open login
        buttonsk1.setOnClickListener {
            //Navigate to login
            val intent = Intent(this, onboard2::class.java)
            startActivity(intent)
        }
    }
}
