package com.example.astro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class CopyTradingActivity : AppCompatActivity() {

    lateinit var card1:CardView
    lateinit var card2:CardView
    lateinit var card3:CardView
    lateinit var card4:CardView
    lateinit var card5:CardView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_copy_trading)

        card1 = findViewById(R.id.cardtrade1)
        card2 = findViewById(R.id.cardtrade2)
        card3 = findViewById(R.id.cardtrade3)
        card4 = findViewById(R.id.cardtrade4)
        card5 = findViewById(R.id.cardtrade5)

        card1.setOnClickListener {
            val intent =Intent(this,AdenPerez::class.java)
            startActivity(intent)
        }

        card2.setOnClickListener {
            val intent =Intent(this,AdenPerez::class.java)
            startActivity(intent)
        }

        card3.setOnClickListener {
            val intent =Intent(this,AdenPerez::class.java)
            startActivity(intent)
        }

        card4.setOnClickListener {
            val intent =Intent(this,AdenPerez::class.java)
            startActivity(intent)
        }

        card5.setOnClickListener {
            val intent =Intent(this,AdenPerez::class.java)
            startActivity(intent)
        }







    }
}