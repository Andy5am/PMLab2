package com.example.menurestaurante

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class Pedido : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pedido)

        val orden = (this.application as MyAplication).getOrden()

        val listaDePedidos: ListView = findViewById(R.id.listaPedidos)

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, orden.menuOrder)
        listaDePedidos.adapter = adapter

        listaDePedidos.setOnItemLongClickListener { parent, view, position, id ->
            orden.del(position)
            adapter.notifyDataSetChanged()
            Toast.makeText(this, "Se elimino: ${parent.getItemAtPosition(position)}" , Toast.LENGTH_SHORT).show()
            true
        }

        val botonRegresar = findViewById<Button>(R.id.BotonRegresar)
        botonRegresar.setOnClickListener{val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)}

        val botonLimpiar = findViewById<Button>(R.id.BotonLimpiarPedido)
        botonLimpiar.setOnClickListener {
            orden.clear()
            adapter.notifyDataSetChanged()
            val toastLimpio: Toast = Toast.makeText(applicationContext,"El pedido ha sido limpiado con éxito",Toast.LENGTH_LONG)
            toastLimpio.show()
        }

        val botonHacerPedido = findViewById<Button>(R.id.BotonHacerPedido)
        botonHacerPedido.setOnClickListener{
            orden.done()
            adapter.notifyDataSetChanged()
            val toastPedido : Toast = Toast.makeText(applicationContext, "Se ha hecho el pedido", Toast.LENGTH_LONG)
            toastPedido.show()
        }
    }
}
