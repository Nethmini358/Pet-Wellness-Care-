package com.example.project1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.project1.R
import com.google.android.material.badge.BadgeDrawable
import com.google.android.material.bottomnavigation.BottomNavigationView

class navigation_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.navigation_activity)

        val bottom_navigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        // Optional: Set up with Navigation Component if using fragments
        // val navController = findNavController(R.id.nav_host_fragment)  // If you have a NavHostFragment
        // bottomNavigationView.setupWithNavController(navController)

        // Handle item selections manually (e.g., switch fragments or show toasts)
        bottom_navigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    // Load Home fragment or content
                    // e.g., supportFragmentManager.beginTransaction().replace(R.id.fragment_container, HomeFragment()).commit()
                    true
                }

                R.id.nav_shop -> {
                    // Load Settings fragment
                    true
                }

                R.id.nav_calendar -> {
                    // Load Profile fragment
                    true
                }

                R.id.nav_profile -> {
                    // Load Profile fragment
                    true
                }

                else -> false
            }
        }
    }

}