package com.example.menurestaurante

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.example.menurestaurante.Logica.MenuOrderImp

class Menu : AppCompatActivity() {

    val menu:ArrayList<String> = arrayListOf("Pizza de queso","Pizza de peperoni","Pizza de jamon","Pizza suprema","Pizza vegetariana")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)


        val listaMenu = findViewById<ListView>(R.id.Menu)


        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, menu)
        listaMenu.adapter = adapter

        listaMenu.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val order: MenuOrderImp = (this.application as MyAplication).getOrden()
            order.add(menu[position])
            val toastAgregado = Toast.makeText(applicationContext, "Se ha agregado ${parent.getItemAtPosition(position)} a la orden", Toast.LENGTH_LONG)
            toastAgregado.show()
        }

        val botonInicio = findViewById<Button>(R.id.BotonInicio)
        botonInicio.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}
