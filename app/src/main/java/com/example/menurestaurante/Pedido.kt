package com.example.menurestaurante

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Pedido : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pedido)

        val BotonRegresar = findViewById<Button>(R.id.BotonRegresar)
        BotonRegresar.setOnClickListener{val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)}
    }
}
