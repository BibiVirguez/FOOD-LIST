package com.example.foodlist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class CarritoParte3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carrito_parte3)

        val salir14: ImageButton = findViewById(R.id.salir14)
        salir14.setOnClickListener {

            val intent1 = Intent(this, MainActivity::class.java)
            startActivity(intent1)
        }
    }
}