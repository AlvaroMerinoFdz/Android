package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var sumando1:EditText = findViewById(R.id.etNumero1)
        var sumando2:EditText = findViewById(R.id.etNumero2)
        var boton: Button = findViewById(R.id.btnSumar)
        var resul : TextView = findViewById(R.id.txtResultado)

        boton.setOnClickListener(){
            var s1 = Integer.parseInt(sumando1.text.toString())
            var s2 = Integer.parseInt(sumando2.text.toString())
            var resultado = s1+s2
            resul.text = "${getString(R.string.resultado)} : $resultado"
            Toast.makeText(this,"Sumando...",Toast.LENGTH_LONG).show()

        }

    }
}