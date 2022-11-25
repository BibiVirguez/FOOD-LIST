package com.example.foodlist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class PerfilParte4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil_parte4)

        val salir2: ImageButton = findViewById(R.id.salir2)
        salir2.setOnClickListener {

            val intent1 = Intent(this, MainActivity::class.java)
            startActivity(intent1)
        }
    }
}