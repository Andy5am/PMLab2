package com.example.menurestaurante

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView

class Menu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val BotonInicio = findViewById<Button>(R.id.BotonInicio)
        BotonInicio.setOnClickListener{val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)}

        val lista: ListView = findViewById(R.id.Menu)
        val menu:ArrayList<String> = arrayListOf("Pizza","Hamburguesa","Tacos","Pie de queso","Pollo")
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, menu)
        lista.adapter = adapter


    }
}
