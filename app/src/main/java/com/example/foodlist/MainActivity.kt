package com.example.foodlist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Perfil: ImageButton = findViewById(R.id.Perfil)
        Perfil.setOnClickListener {

            val intent1: Intent = Intent(this, PerfilParte1::class.java)
            startActivity(intent1)
        }

        val Carrito: ImageButton = findViewById(R.id.Carrito)
        Carrito.setOnClickListener {

            val intent2: Intent = Intent(this, CarritoParte1::class.java)
            startActivity(intent2)
        }
        val Categorias: ImageButton = findViewById(R.id.Categorias)
        Categorias.setOnClickListener {

            val intent3: Intent = Intent(this, CategoriasParte1::class.java)
            startActivity(intent3)
        }
    }
}