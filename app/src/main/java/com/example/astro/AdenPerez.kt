package com.example.astro

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.cardview.widget.CardView
import org.w3c.dom.Text

class AdenPerez : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        lateinit var cardy1: TextView
        lateinit var cardy2: TextView
        lateinit var cardy3: TextView
        lateinit var cardy4: TextView
        lateinit var cardy5: TextView




        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aden_perez)

        cardy1 = findViewById(R.id.textcard1)
        cardy2 = findViewById(R.id.textcard2)
        cardy3 = findViewById(R.id.textcard3)
        cardy4 = findViewById(R.id.textcard4)
        cardy5 = findViewById(R.id.textcard5)

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