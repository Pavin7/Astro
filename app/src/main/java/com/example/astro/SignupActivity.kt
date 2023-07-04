package com.example.astro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class SignupActivity : AppCompatActivity() {
    lateinit var myemail: EditText
    lateinit var mypassword: EditText
    lateinit var mysignup: Button
    lateinit var passy:EditText
    private lateinit var auth: FirebaseAuth
    lateinit var login: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        myemail=findViewById(R.id.email1)
        mypassword=findViewById(R.id.password1)
        passy= findViewById(R.id.confirmpassword)
        mysignup=findViewById(R.id.signup)
        login = findViewById(R.id.createacc1)
        auth= FirebaseAuth.getInstance()

        mysignup.setOnClickListener {
            SignUpUser()

        }

        login.setOnClickListener {

            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)

        }




    }

    private fun SignUpUser(){
        val email=myemail.text.toString()
        val pass=mypassword.text.toString()
        val confirmpass=passy.text.toString()
        if (email.isBlank() || pass.isBlank() || confirmpass.isBlank()){
            Toast.makeText(this,"Email and password cant be blank", Toast.LENGTH_LONG).show()
            return

        }  else if (pass != confirmpass){
            Toast.makeText(this,"Password do not match", Toast.LENGTH_LONG).show()
            return

        }

        auth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener(this) {
            if (it.isSuccessful){
                Toast.makeText(this,"Signed up successfully", Toast.LENGTH_LONG).show()

            }else{
                Toast.makeText(this,"Failed to create", Toast.LENGTH_LONG).show()
            }

        }

    }



}