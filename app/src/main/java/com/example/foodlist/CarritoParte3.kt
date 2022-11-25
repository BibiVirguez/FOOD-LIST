package com.example.foodlist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class CarritoParte3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carrito_parte3)

        val salir14: ImageButton = findViewById(R.id.salir14)
        salir14.setOnClickListener {

            val intent1 = Intent(this, MainActivity::class.java)
            startActivity(intent1)

            val DatosLeche: TextView = findViewById(R.id.DatosLeche)
            DatosLeche.setOnClickListener {

                val intent1 = Intent(this, CarritoParte4::class.java)
                startActivity(intent1)

                val datosLeche2: TextView = findViewById(R.id.datosLeche2)
                datosLeche2.setOnClickListener {

                    val intent1 = Intent(this, CarritoParte4::class.java)
                    startActivity(intent1)
                }
            }
        }
    }
}