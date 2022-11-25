package com.example.foodlist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class CategoriasParte3Verduras : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categorias_parte3_verduras)

        val DatosZanahorias: TextView = findViewById(R.id.DatosZanahorias)
        DatosZanahorias.setOnClickListener {

            val intent1: Intent = Intent(this, CarritoParte2::class.java)
            startActivity(intent1)
        }

        val DatosTomates: TextView = findViewById(R.id.DatosTomates)
        DatosTomates.setOnClickListener {

            val intent2: Intent = Intent(this, CarritoParte2::class.java)
            startActivity(intent2)

            val salir10: ImageButton = findViewById(R.id.salir10)
            salir10.setOnClickListener {

                val intent3 = Intent(this, MainActivity::class.java)
                startActivity(intent3)
                val carrito3: ImageButton = findViewById(R.id.carrito3)
                carrito3.setOnClickListener {

                    val intent4 = Intent(this, CategoriasParte1::class.java)
                    startActivity(intent4)
                }
            }
        }
    }
}