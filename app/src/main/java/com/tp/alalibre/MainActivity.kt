package com.tp.alalibre

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnIrDetalleProducto.setOnClickListener{
            startActivity(Intent(this, DetalleProducto::class.java))
        }
        btnirAgregarProducto.setOnClickListener{
            startActivity(Intent(this, AgregarProducto::class.java))
        }
    }

    override fun onStart(){
        super.onStart()
    }
}
