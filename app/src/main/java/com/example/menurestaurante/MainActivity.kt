package com.example.menurestaurante

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val botonMenu = findViewById<Button>(R.id.BotonMenu)
        botonMenu.setOnClickListener{val intent = Intent(this,Menu::class.java)
        startActivity(intent)}

        val botonPedido =findViewById<Button>(R.id.BotonPedido)
        botonPedido.setOnClickListener{val intent2 = Intent(this, Pedido::class.java)
        startActivity(intent2)}
    }
}
