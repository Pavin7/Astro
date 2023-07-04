package com.example.astro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {

    private lateinit var myemail: EditText
    private lateinit var mypassword:EditText
    private lateinit var mylogin:Button
    private lateinit var auth: FirebaseAuth

    private lateinit var signup:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        myemail=findViewById(R.id.email)
        mypassword=findViewById(R.id.password)
        mylogin=findViewById(R.id.login)
        signup = findViewById(R.id.createacc)
        auth= FirebaseAuth.getInstance()

        mylogin.setOnClickListener {
            login()
        }





        signup.setOnClickListener {
            val sign = Intent(this,SignupActivity::class.java)
            startActivity(sign)
        }





    }



    private fun login() {
        val email = myemail.text.toString()
        val pass = mypassword.text.toString()

        auth.signInWithEmailAndPassword(email, pass).addOnCompleteListener(this) {
            if (it.isSuccessful) {
                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, DashboardActivity::class.java)
                startActivity(intent)

            } else
                Toast.makeText(this, "Log In failed ", Toast.LENGTH_SHORT).show()
        }


    }
}