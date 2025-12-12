package com.example.project1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class success_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.success_activity) // connects to complete_activity.xml

        // Find button by its ID
        val backHomeBtn : Button = findViewById(R.id.backHomeBtn)

        // When button is clicked → open login
        backHomeBtn.setOnClickListener {
            //Navigate to login
            val intent = Intent(this, home_activity::class.java)
            startActivity(intent)
        }
    }
}