package com.example.menurestaurante

import com.example.oscar.myfirstapp.MenuOrder

class MenuOrderImp: MenuOrder {

    override var menuOrder = ArrayList<String>()
    get() = field

    override fun clear() {
        this.menuOrder.clear()
    }

    override fun add(element: String) {
        this.menuOrder.add(element)
    }

    override fun del(elementIndex: Int) {
        this.menuOrder.removeAt(elementIndex)
    }

    override fun done() {
        this.clear()
    }

}