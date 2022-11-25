package com.example.foodlist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class CategoriasParte5Frutas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categorias_parte5_frutas)

        val DatosBanano: TextView = findViewById(R.id.DatosBanano)
        DatosBanano.setOnClickListener {

            val intent1: Intent = Intent(this, CarritoParte2::class.java)
            startActivity(intent1)
        }

        val DatosPapaya: TextView = findViewById(R.id.DatosPapaya)
        DatosPapaya.setOnClickListener {

            val intent2: Intent = Intent(this, CarritoParte2::class.java)
            startActivity(intent2)
        }
        val salir12: ImageButton = findViewById(R.id.salir12)
        salir12.setOnClickListener {

            val intent3 = Intent(this, MainActivity::class.java)
            startActivity(intent3)
            val carrito: ImageButton = findViewById(R.id.carrito)
            carrito.setOnClickListener {

                val intent4 = Intent(this, CategoriasParte1::class.java)
                startActivity(intent4)
            }
        }
    }
}
