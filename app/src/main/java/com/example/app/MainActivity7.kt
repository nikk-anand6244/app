package com.example.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity7 : AppCompatActivity() {
    var btn:Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main7)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btn=findViewById(R.id.btnDone)
        btn?.setOnClickListener {
            Toast.makeText( this,"Login", Toast.LENGTH_SHORT).show()

        }
        btn=findViewById(R.id.btnSignup)
        btn?.setOnClickListener {
            Toast.makeText( this,"Signup", Toast.LENGTH_SHORT).show()
            val intent= Intent(this,MainActivity8::class.java)
            startActivity(intent)
        }
    }
}