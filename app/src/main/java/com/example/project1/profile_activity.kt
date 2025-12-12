package com.example.project1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class profile_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile_activity) // connects to complete_activity.xml

        // Find button by its ID
        val btn_pet : Button = findViewById(R.id.btn_pet)

        // When button is clicked → open login
        btn_pet.setOnClickListener {
            //Navigate to login
            val intent = Intent(this, petprofile_activity::class.java)
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