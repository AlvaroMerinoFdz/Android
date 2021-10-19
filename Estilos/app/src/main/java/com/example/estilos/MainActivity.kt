package com.example.estilos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun alPulsar(view: View){
        var ima:ImageView = findViewById(R.id.imgImagen)
        ima.setImageResource(R.mipmap.betis)
    }
}