package com.example.project1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class petprofile_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.petprofile_activity) // connects to complete_activity.xml

        // Find button by its ID
        val btn_prof : Button = findViewById(R.id.btn_prof)

        // When button is clicked → open login
        btn_prof.setOnClickListener {
            //Navigate to login
            val intent = Intent(this, profile_activity::class.java)
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
                    startActivity(Intent(this, food_activity::class.java))
                    true
                }
                R.id.nav_calendar -> {
                    startActivity(Intent(this, vaccine_activity::class.java))
                    true
                }
                R.id.nav_profile -> {
                    true
                }
                else -> false
            }
        }

        // Set Vaccine Schedule as the default selected item
        bottomNavigationView.selectedItemId = R.id.nav_profile
    }
}