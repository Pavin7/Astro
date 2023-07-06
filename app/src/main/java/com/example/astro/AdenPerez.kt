package com.example.astro

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class AdenPerez : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        lateinit var cardy1: CardView
        lateinit var cardy2: CardView
        lateinit var cardy3: CardView
        lateinit var cardy4: CardView
        lateinit var cardy5: CardView




        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aden_perez)

        cardy1 = findViewById(R.id.cardcopy1)
        cardy2 = findViewById(R.id.cardcopy2)
        cardy3 = findViewById(R.id.cardcopy3)
        cardy4 = findViewById(R.id.cardcopy4)
        cardy5 = findViewById(R.id.cardcopy5)

        //call
        cardy1.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + "0732745819")
            startActivity(dialIntent)
        }

        //call
        cardy2.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + "0745754839")
            startActivity(dialIntent)
        }

        //call
        cardy3.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + "0742734329")
            startActivity(dialIntent)
        }

        //call
        cardy4.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + "0754673921")
            startActivity(dialIntent)
        }

        //call
        cardy5.setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:" + "0751376892")
            startActivity(dialIntent)
        }
    }
}