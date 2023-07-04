package com.example.astro

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.cardview.widget.CardView

class DashboardActivity : AppCompatActivity() {
    lateinit var about:CardView
    lateinit var learn:CardView
    lateinit var Trade:CardView
    lateinit var market:CardView
    lateinit var community:CardView
    lateinit var logout:CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        about = findViewById(R.id.cardHome1)
        learn = findViewById(R.id.cardHome2)
        Trade = findViewById(R.id.cardHome3)
        market = findViewById(R.id.cardHome4)
        community = findViewById(R.id.cardHome5)
        logout = findViewById(R.id.cardHome6)

        about.setOnClickListener {
            val intent = Intent(this,AboutActivity::class.java)
            startActivity(intent)


        }

        learn.setOnClickListener {
            val intent = Intent(this,BabypipsActivity::class.java)
            startActivity(intent)
        }

        Trade.setOnClickListener {
            val intent = Intent(this,TradingViewActivity::class.java)
            startActivity(intent)
        }

        market.setOnClickListener {
            val intent = Intent(this,InvestingComActivity::class.java)
            startActivity(intent)
        }

        community.setOnClickListener {
            val intent = Intent(this,ShopActivity::class.java)
            startActivity(intent)
        }

        logout.setOnClickListener {
            var box = AlertDialog.Builder(this)

            box.setMessage("Do you want to Logout?")
            box.setPositiveButton("PROCEED", DialogInterface.OnClickListener { dialog, id -> finish() })
            box.setNegativeButton("CANCEL", DialogInterface.OnClickListener { dialog, id -> onVisibleBehindCanceled() })

            var alert = box.create()
            alert.setTitle("Hello User")
            alert.show()
        }

    }
}