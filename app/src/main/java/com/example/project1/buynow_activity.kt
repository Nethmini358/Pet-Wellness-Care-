package com.example.project1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class buynow_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.buynow_activity) // connects to complete_activity.xml

        // Find button by its ID
        val btnProceedPayment : Button = findViewById(R.id.btnProceedPayment)

        // When button is clicked → open login
        btnProceedPayment.setOnClickListener {
            //Navigate to login
            val intent = Intent(this, paymethod_activity::class.java)
            startActivity(intent)
        }

        // Find the BottomNavigationView
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        // Handle item selections with navigation to activities
        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    startActivity(Intent(this, home_activity::class.java))
                    true
                }
                R.id.nav_shop -> {
                    true
                }
                R.id.nav_calendar -> {
                    startActivity(Intent(this, vaccine_activity::class.java))
                    true
                }
                R.id.nav_profile -> {
                    startActivity(Intent(this, profile_activity::class.java))
                    true
                }
                else -> false
            }
        }

        // Set Vaccine Schedule as the default selected item
        bottomNavigationView.selectedItemId = R.id.nav_shop
    }
}
