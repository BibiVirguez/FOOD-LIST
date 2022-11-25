package com.example.foodlist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class CategoriasParte2Lacteos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categorias_parte2_lacteos)

        val DatosLeche: TextView = findViewById(R.id.DatosLeche)
        DatosLeche.setOnClickListener {

            val intent1: Intent = Intent(this, CarritoParte2::class.java)
            startActivity(intent1)

            val DatosYogur: TextView = findViewById(R.id.DatosYogur)
            DatosYogur.setOnClickListener {

                val intent2: Intent = Intent(this, CarritoParte2::class.java)
                startActivity(intent2)

                val salir9: ImageButton = findViewById(R.id.salir9)
                salir9.setOnClickListener {

                    val intent3 = Intent(this, MainActivity::class.java)
                    startActivity(intent3)

                    val carrito7: ImageButton = findViewById(R.id.carrito7)
                    carrito7.setOnClickListener {

                        val intent4 = Intent(this, CategoriasParte1::class.java)
                        startActivity(intent4)
                    }
                }
            }
        }
    }
}