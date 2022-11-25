package com.example.foodlist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class CategoriasParte1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categorias_parte1)

        val Lacteos1: ImageButton = findViewById(R.id.Lacteos1)
        Lacteos1.setOnClickListener {

            val intent1: Intent = Intent(this, CategoriasParte2Lacteos::class.java)
            startActivity(intent1)
        }

        val Verduras1: ImageButton = findViewById(R.id.Verduras1)
        Verduras1.setOnClickListener {

            val intent2: Intent = Intent(this, CategoriasParte3Verduras::class.java)
            startActivity(intent2)
        }

        val Carnes1: ImageButton = findViewById(R.id.Carnes1)
        Carnes1.setOnClickListener {

            val intent3: Intent = Intent(this, CategoriasParte4Carnes::class.java)
            startActivity(intent3)

            val salir8: ImageButton = findViewById(R.id.salir8)
            salir8.setOnClickListener {

                val intent4 = Intent(this, MainActivity::class.java)
                startActivity(intent4)
            }
        }

    }
}