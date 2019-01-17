package com.example.menurestaurante

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class Menu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val BotonInicio = findViewById<Button>(R.id.BotonInicio)
        BotonInicio.setOnClickListener{val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)}

        val listaMenu: ListView = findViewById(R.id.Menu)
        val menu:ArrayList<String> = arrayListOf("Pizza","Hamburguesa","Tacos","Pie de queso","Pollo")
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, menu)
        listaMenu.adapter = adapter

        listaMenu.isClickable = true
        listaMenu.onItemClickListener = AdapterView.OnItemClickListener{arg0,arg1,position,arg3 ->
            val MenuOrder: MenuOrderImp = (this.application as MyAplication).getOrden()
            MenuOrder.add(menu.get(position))

            val toastAgregado: Toast = Toast.makeText(applicationContext,"Se agregó "+menu.get(position)+" a la orden",Toast.LENGTH_LONG)
            toastAgregado.show()
        }


    }
}
