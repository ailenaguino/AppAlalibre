package com.tp.alalibre

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_agregar_producto.*

class AgregarProducto : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agregar_producto)
        btnVolver.setOnClickListener{finish()}
    }
}
