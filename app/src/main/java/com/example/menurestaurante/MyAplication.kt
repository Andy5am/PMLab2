package com.example.menurestaurante

import android.app.Application
import com.example.oscar.myfirstapp.MenuOrder

class MyAplication: Application() {
    private var orden: MenuOrderImp = MenuOrderImp()

    fun getOrden(): MenuOrderImp{
        return orden
    }
    fun setOrden(orden:MenuOrderImp){
        this.orden = orden
    }
}