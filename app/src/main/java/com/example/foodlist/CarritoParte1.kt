package com.example.foodlist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class CarritoParte1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carrito_parte1)

        val Categorias2: ImageButton = findViewById(R.id.Categorias2)
        Categorias2.setOnClickListener {

            val intent1 = Intent(this, CategoriasParte1::class.java)
            startActivity(intent1)
}
    }
}