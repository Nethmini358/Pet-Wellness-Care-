package com.example.project1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class home_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_activity) // connects to login_activity.xml

        val bottom_navigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        // Handle item selections manually (e.g., switch fragments or show toasts)
        bottom_navigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
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
                    startActivity(Intent(this, profile_activity::class.java))
                    true
                }
                else -> false
            }
        }
    }
}