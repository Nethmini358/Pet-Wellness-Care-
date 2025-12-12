package com.example.project1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class onboard3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboard3) // connects to complete_activity.xml

        // Find button by its ID
        val buttonsk3 : Button = findViewById(R.id.buttonsk3)

        // When button is clicked → open login
        buttonsk3.setOnClickListener {
            //Navigate to login
            val intent = Intent(this, login_activity::class.java)
            startActivity(intent)
        }

        // Find button by its ID
        val buttonck : Button = findViewById(R.id.buttonck)

        // When button is clicked → open login
        buttonck.setOnClickListener {
            //Navigate to login
            val intent = Intent(this, signin_activity::class.java)
            startActivity(intent)
        }

    }
}
