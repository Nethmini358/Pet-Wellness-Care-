package com.example.project1

import android.content.Intent
import android.os.Bundle
import android.widget.CheckBox
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class paymethod_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.paymethod_activity)

        // Get references to checkboxes
        val cardCheckBox = findViewById<CheckBox>(R.id.checkBox)
        val mobileCheckBox = findViewById<CheckBox>(R.id.checkBox2)

        // Handle Card Payment checkbox
        cardCheckBox.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                // Uncheck the other one to make sure only one is active
                mobileCheckBox.isChecked = false
                // Navigate to Card Payment Page
                val intent = Intent(this, cardpayment_activity::class.java)
                startActivity(intent)
            }
        }

        // Handle Mobile Payment checkbox
        mobileCheckBox.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                // Uncheck the other one
                cardCheckBox.isChecked = false
                // Navigate to Mobile Payment Page
                val intent = Intent(this, mobilepayment_activity::class.java)
                startActivity(intent)
            }
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
