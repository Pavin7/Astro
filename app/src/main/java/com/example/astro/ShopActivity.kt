package com.example.astro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.cardview.widget.CardView

class ShopActivity : AppCompatActivity() {
    lateinit var boty:CardView
    lateinit var boty2:CardView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shop)


        boty =  findViewById(R.id.cardHome1)
        boty2 = findViewById(R.id.cardHome2)

        boty.setOnClickListener {

            val intent = Intent(this,BotActivity::class.java)
            startActivity(intent)

        }

        boty2.setOnClickListener {

            val intent = Intent(this,BotActivity::class.java)
            startActivity(intent)

        }
    }
}