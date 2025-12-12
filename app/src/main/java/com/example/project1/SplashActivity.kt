package com.example.project1

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    private lateinit var ivLogo: ImageView
    private lateinit var tvAppName: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.animation) // Link to your splash XML

        // Initialize views
        ivLogo = findViewById(R.id.ivLogo)
        tvAppName = findViewById(R.id.tvAppName)

        // Step 1: Animate logo falling from top to center
        val fallAnimation = AnimationUtils.loadAnimation(this, R.anim.fall_from_top)
        fallAnimation.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation?) {}
            override fun onAnimationEnd(animation: Animation?) {
                tvAppName.visibility = View.VISIBLE
                val fadeInAnimation = AnimationUtils.loadAnimation(this@SplashActivity, R.anim.fade_in)
                tvAppName.startAnimation(fadeInAnimation)

                Handler(Looper.getMainLooper()).postDelayed({
                    val intent = Intent(this@SplashActivity, onboard1::class.java)
                    startActivity(intent)
                    finish()
                }, 2000)
            }
            override fun onAnimationRepeat(animation: Animation?) {}
        })

        ivLogo.startAnimation(fallAnimation)
    }
}