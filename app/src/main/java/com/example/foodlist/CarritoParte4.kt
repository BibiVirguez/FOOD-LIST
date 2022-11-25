package com.example.foodlist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class CarritoParte4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carrito_parte4)

        val salir15: ImageButton = findViewById(R.id.salir15)
        salir15.setOnClickListener {

            val intent1 = Intent(this, MainActivity::class.java)
            startActivity(intent1)

            val cancelar: ImageButton = findViewById(R.id.Cancelar)
            cancelar1.setOnClickListener {

                val intent1 = Intent(this, CarritoParte4::class.java)
                startActivity(intent1)
            }
        }
    }
}