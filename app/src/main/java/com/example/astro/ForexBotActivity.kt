package com.example.astro

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ForexBotActivity : AppCompatActivity() {
    lateinit var gitbot: Button
    lateinit var pay: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forex_bot)


        gitbot =  findViewById(R.id.botbutton1)

        gitbot.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://github.com/Pavin7/bot2.git")
            startActivity(intent)
        }

        pay = findViewById(R.id.paybutton1)
        pay.setOnClickListener {
            val simToolKitLaunchIntent = applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let{startActivity(it)}
        }




    }
}