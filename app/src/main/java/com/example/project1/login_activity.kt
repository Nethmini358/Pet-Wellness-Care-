package com.example.project1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
class login_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity) // connects to login_activity.xml

        // Find button by its ID
        val btnOpensignin : Button = findViewById(R.id.btn_open_Signinin)

        // When button is clicked → open login
        btnOpensignin.setOnClickListener {
            //Navigate to login
            val intent = Intent(this, signin_activity::class.java)
            startActivity(intent)
        }

        val btn_gohome: Button = findViewById(R.id.btn_gohome)
        btn_gohome.setOnClickListener {
            val intent = Intent(this, home_activity::class.java)
            startActivity(intent)
        }

     }
}
