package com.example.foodlist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class CategoriasParte4Carnes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categorias_parte4_carnes)

        val DatosCarneCerdo: TextView = findViewById(R.id.DatosCarneCerdo)
        DatosCarneCerdo.setOnClickListener {

            val intent1: Intent = Intent(this, CarritoParte2::class.java)
            startActivity(intent1)
        }

        val DatosCarneRes: TextView = findViewById(R.id.DatosCarneRes)
        DatosCarneRes.setOnClickListener {

            val intent2: Intent = Intent(this, CarritoParte2::class.java)
            startActivity(intent2)

            val salir11: ImageButton = findViewById(R.id.salir11)
            salir11.setOnClickListener {

                val intent3 = Intent(this, MainActivity::class.java)
                startActivity(intent3)

                val carrito4: ImageButton = findViewById(R.id.carrito4)
                carrito4.setOnClickListener {

                    val intent4 = Intent(this, CategoriasParte1::class.java)
                    startActivity(intent4)
                }
            }
        }
    }
}