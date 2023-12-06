package com.example.practzabunyanka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DissActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diss)

        val bt : Button = findViewById(R.id.bt)
        bt.setOnClickListener{
            val intent : Intent = Intent(this, ChocActivity::class.java)
            startActivity(intent)
        }

        val bt2 : Button = findViewById(R.id.bt2)
        bt2.setOnClickListener{
            val intent2 : Intent = Intent(this, TrActivity::class.java)
            startActivity(intent2)
        }

        val bt3 : Button = findViewById(R.id.bt3)
        bt3.setOnClickListener{
            val intent3 : Intent = Intent(this, MindActivity::class.java)
            startActivity(intent3)
        }

        val bt4 : Button = findViewById(R.id.bt4)
        bt4.setOnClickListener{
            val intent4 : Intent = Intent(this, MacActivity::class.java)
            startActivity(intent4)
        }

        val bt5 : Button = findViewById(R.id.bt5)
        bt5.setOnClickListener{
            val intent5 : Intent = Intent(this, LOVEActivity::class.java)
            startActivity(intent5)
        }
    }
}