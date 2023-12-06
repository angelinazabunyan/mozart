package com.example.practzabunyanka

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CofeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cofe)

        val bt2 : Button = findViewById(R.id.bt2)
        bt2.setOnClickListener{
            val intent : Intent = Intent(this, Americfno::class.java)
            startActivity(intent)
        }

        val bt1 : Button = findViewById(R.id.bt1)
        bt1.setOnClickListener{
            val intent1 : Intent = Intent(this, Tyr::class.java)
            startActivity(intent1)
        }

        val bt3 : Button = findViewById(R.id.bt3)
        bt3.setOnClickListener{
            val intent3 : Intent = Intent(this, Latte::class.java)
            startActivity(intent3)
        }

        val bt4 : Button = findViewById(R.id.bt4)
        bt4.setOnClickListener{
            val intent4 : Intent = Intent(this, Cap::class.java)
            startActivity(intent4)
        }

        val bt6 : Button = findViewById(R.id.bt6)
        bt6.setOnClickListener{
            val intent6 : Intent = Intent(this, Paf::class.java)
            startActivity(intent6)
        }

        val bt11 : Button = findViewById(R.id.bt11)
        bt11.setOnClickListener{
            val intent11 : Intent = Intent(this, Ice::class.java)
            startActivity(intent11)
        }

        val bt12 : Button = findViewById(R.id.bt12)
        bt12.setOnClickListener{
            val intent12 : Intent = Intent(this, Estonic::class.java)
            startActivity(intent12)
        }

        val bt13 : Button = findViewById(R.id.bt13)
        bt13.setOnClickListener{
            val intent13 : Intent = Intent(this, Bambl::class.java)
            startActivity(intent13)
        }
    }
}