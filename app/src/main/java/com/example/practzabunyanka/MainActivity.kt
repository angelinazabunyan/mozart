package com.example.practzabunyanka

import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AccelerateDecelerateInterpolator
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private val Splash : Long = 3000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val pr : ProgressBar = findViewById(R.id.progressBar)

        Handler().postDelayed({
            pr.progress = 3000
            startActivity(Intent(this,MainActivity2 ::class.java))
            finish()
        },Splash)

        val tv : TextView = findViewById(R.id.textView5)
        val animator = ObjectAnimator.ofArgb(
            tv, "textColor",
            0xFFFFFFFF.toInt(),
            0xFF4E4242.toInt()
        ).apply {
            duration = 1000 // короткая продолжительность
            interpolator = AccelerateDecelerateInterpolator()
            repeatCount = ObjectAnimator.INFINITE // бесконечное количество повторов
            repeatMode = ObjectAnimator.REVERSE
        }

        animator.start()
    }
}