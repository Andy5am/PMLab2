package com.example.menurestaurante

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Menu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val BotonInicio = findViewById<Button>(R.id.BotonInicio)
        BotonInicio.setOnClickListener{val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)}
    }
}
