package com.example.app

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity6 : AppCompatActivity() {
    var btn:Button?=null
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main6)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btn=findViewById(R.id.log_in)
        btn?.setOnClickListener {
            Toast.makeText( this,"Login", Toast.LENGTH_SHORT).show()
            val intent= Intent(this,MainActivity7::class.java)
            startActivity(intent)
        }
        btn=findViewById(R.id.sign_up)
        btn?.setOnClickListener {
            Toast.makeText( this,"login done", Toast.LENGTH_SHORT).show()
            val intent=Intent(this,MainActivity8::class.java)
            startActivity(intent)
        }
    }
}