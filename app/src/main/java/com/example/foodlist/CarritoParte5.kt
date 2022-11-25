package com.example.foodlist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class CarritoParte5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carrito_parte5)

        val salir3: ImageButton = findViewById(R.id.salir3)
        salir3.setOnClickListener {

            val intent1 = Intent(this, MainActivity::class.java)
            startActivity(intent1)
            val cancelar1: ImageButton = findViewById(R.id.Cancelar1)
            cancelar1.setOnClickListener {

                val intent1 = Intent(this, CarritoParte5::class.java)
                startActivity(intent1)
            }
        }
    }
}