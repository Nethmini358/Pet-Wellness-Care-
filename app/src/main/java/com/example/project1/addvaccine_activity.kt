package com.example.project1

import android.app.DatePickerDialog
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import java.util.Calendar

class addvaccine_activity : AppCompatActivity() {
    //@SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.addvaccine_activity) // connects to login_activity.xml

        // Find button by its ID
        val btn_submit: Button = findViewById(R.id.btn_submit)
        val editTextDate: EditText = findViewById(R.id.editTextDate)
        val ivCalendar: ImageView = findViewById(R.id.ivCalendar)
        val editTextText5: EditText = findViewById(R.id.editTextText5)
        val ivMap: ImageView = findViewById(R.id.ivMap)

        // When button is clicked → open login
        btn_submit.setOnClickListener {
            //Navigate to login
            val intent = Intent(this, vaccine_activity::class.java)
            startActivity(intent)
        }

        // Calendar icon click → show DatePickerDialog
        ivCalendar.setOnClickListener {
            val c = Calendar.getInstance()
            val year = c.get(Calendar.YEAR)
            val month = c.get(Calendar.MONTH)
            val day = c.get(Calendar.DAY_OF_MONTH)

            val datePickerDialog = DatePickerDialog(
                this,
                { _, selectedYear, selectedMonth, selectedDay ->
                    // Month is 0-indexed in Calendar, so add 1
                    val date = "$selectedDay/${selectedMonth + 1}/$selectedYear"
                    editTextDate.setText(date)
                }, year, month, day
            )
            datePickerDialog.show()
        }

        // Map icon click → open Google Maps
        ivMap.setOnClickListener {
            val hospital = editTextText5.text.toString()
            if (hospital.isNotEmpty()) {
                val gmmIntentUri = Uri.parse("geo:0,0?q=${Uri.encode(hospital)}")
                val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
                mapIntent.setPackage("com.google.android.apps.maps")
                startActivity(mapIntent)
            } else {
                Toast.makeText(this, "Please enter hospital name", Toast.LENGTH_SHORT).show()
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
                    startActivity(Intent(this, food_activity::class.java))
                    true
                }
                R.id.nav_calendar -> {
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
        bottomNavigationView.selectedItemId = R.id.nav_calendar
    }
}

