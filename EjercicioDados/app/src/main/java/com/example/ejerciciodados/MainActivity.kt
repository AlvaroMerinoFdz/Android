package com.example.ejerciciodados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

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
        var resultado:TextView = findViewById(R.id.txtResultado)
        elegirImagen(ordenador,imagenOrdenador)
        elegirImagen(tuyo,imagenTuya)
        when {
            ordenador<tuyo -> resultado.text = "Has ganado"
            ordenador>tuyo -> resultado.text = "Has perdido"
            else -> resultado.text = "Empate"

        }
    }
    fun elegirImagen(numero:Int, imagen:ImageView){
        when(numero){
            1 -> imagen.setImageResource(R.drawable.dado1)
            2 -> imagen.setImageResource(R.drawable.dado2)
            3 -> imagen.setImageResource(R.drawable.dado3)
            4 -> imagen.setImageResource(R.drawable.dado4)
            5-> imagen.setImageResource(R.drawable.dado5)
            else -> imagen.setImageResource(R.drawable.dado6)
        }
    }
}