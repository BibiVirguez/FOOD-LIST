package com.example.foodlist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Perfil: ImageButton = findViewById(R.id.Perfil)
        Perfil.setOnClickListener {

            val intent1: Intent = Intent(this, PerfilParte1::class.java)
            startActivity(intent1)
        }
    }
}