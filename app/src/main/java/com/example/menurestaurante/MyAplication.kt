package com.example.menurestaurante

import android.app.Application
import com.example.menurestaurante.Logica.MenuOrderImp

class MyAplication: Application() {
    private var orden: MenuOrderImp =
        MenuOrderImp()

    fun getOrden(): MenuOrderImp {
        return this.orden
    }
    fun setOrden(orden: MenuOrderImp){
        this.orden = orden

    }
}