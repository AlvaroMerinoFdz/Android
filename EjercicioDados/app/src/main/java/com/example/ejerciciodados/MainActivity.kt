package com.example.ejerciciodados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun jugar(view: View){
        var ordenador:Int = (1..6).random()
        var tuyo:Int = (1..6).random()
        var imagenOrdenador:ImageView = findViewById(R.id.imgOrdenador)
        var imagenTuya:ImageView = findViewById(R.id.imgTuya)
        when(ordenador){
            1 -> imagenOrdenador.setImageResource(R.drawable.dado1)
            2 -> imagenOrdenador.setImageResource(R.drawable.dado2)
            3 -> imagenOrdenador.setImageResource(R.drawable.dado3)
            4 -> imagenOrdenador.setImageResource(R.drawable.dado4)
            5-> imagenOrdenador.setImageResource(R.drawable.dado5)
            else -> imagenOrdenador.setImageResource(R.drawable.dado6)
        }
        when(tuyo){
            1 -> imagenTuya.setImageResource(R.drawable.dado1)
            2 -> imagenTuya.setImageResource(R.drawable.dado2)
            3 -> imagenTuya.setImageResource(R.drawable.dado3)
            4 -> imagenTuya.setImageResource(R.drawable.dado4)
            5-> imagenTuya.setImageResource(R.drawable.dado5)
            else -> imagenTuya.setImageResource(R.drawable.dado6)
        }
    }
}