package com.example.practzabunyanka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val ButtonDis : Button = findViewById(R.id.button)
        ButtonDis.setOnClickListener{
            val intent : Intent = Intent(this, DissActivity::class.java)
            startActivity(intent)
        }

        val ButtonBlin : Button = findViewById(R.id.button2)
        ButtonBlin.setOnClickListener{
            val intent2 : Intent = Intent(this, BlinActivity::class.java)
            startActivity(intent2)
        }

        val Cofe : Button = findViewById(R.id.button3)
        Cofe.setOnClickListener{
            val intent3 : Intent = Intent(this, CofeActivity::class.java)
            startActivity(intent3)
        }

        val about : Button = findViewById(R.id.button4)
        about.setOnClickListener{
            val intent4 : Intent = Intent(this, AboutActivity::class.java)
            startActivity(intent4)
        }
    }
}