package com.example.mad_practical4_21012011082

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val login: Button = findViewById(R.id.Login)
        login.setOnClickListener() {

            Intent(this, LoginActivity::class.java).also { startActivity(it)
        }
            }
        val signup: Button = findViewById(R.id.signuptologin)
        signup.setOnClickListener() {
            Intent(this, RegistrarionAvtivity::class.java).also { startActivity(it) }
        }
    }
}


