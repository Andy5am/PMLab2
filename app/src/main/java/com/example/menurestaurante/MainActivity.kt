package com.example.menurestaurante

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val BotonMenu = findViewById<Button>(R.id.BotonMenu)
        BotonMenu.setOnClickListener{val intent = Intent(this,Menu::class.java)
        startActivity(intent)}

        val BotonPedido =findViewById<Button>(R.id.BotonPedido)
        BotonPedido.setOnClickListener{val intent = Intent(this,Pedido::class.java)
        startActivity(intent)}
    }
}
