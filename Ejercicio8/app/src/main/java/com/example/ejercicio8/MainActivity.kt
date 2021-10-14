package com.example.ejercicio8

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.SeekBar
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }
    @SuppressLint("WrongViewCast")
    fun avanzaBarra(view: View){
        var barra: SeekBar = findViewById(R.id.skHoras)
        var numeroHoras: TextView = findViewById(R.id.txtHoras)
        numeroHoras.text = barra.progress.toString()
    }
}