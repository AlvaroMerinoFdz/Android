package com.example.ejercicio4radiobuttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }
    fun sumar(view: View){
        var sumando1: EditText = findViewById(R.id.editTextValor2)
        var sumando2: EditText = findViewById(R.id.editTextValor)
        var resul : TextView = findViewById(R.id.txtResultado)

        var s1 = Integer.parseInt(sumando1.text.toString())
        var s2 = Integer.parseInt(sumando2.text.toString())
        var resultado = s1+s2
        resul.text = "${getString(R.string.resul)} : $resultado"
        Toast.makeText(this,"Sumando...", Toast.LENGTH_LONG).show()
    }

    fun restar(view:View){
        var sumando1: EditText = findViewById(R.id.editTextValor2)
        var sumando2: EditText = findViewById(R.id.editTextValor)
        var resul : TextView = findViewById(R.id.txtResultado)

        var s1 = Integer.parseInt(sumando1.text.toString())
        var s2 = Integer.parseInt(sumando2.text.toString())
        var resultado = s1-s2
        resul.text = "${getString(R.string.resul)} : $resultado"
        Toast.makeText(this,"Restando...", Toast.LENGTH_LONG).show()
    }

    fun multiplicar(view:View){
        var sumando1: EditText = findViewById(R.id.editTextValor2)
        var sumando2: EditText = findViewById(R.id.editTextValor)
        var resul : TextView = findViewById(R.id.txtResultado)

        var s1 = Integer.parseInt(sumando1.text.toString())
        var s2 = Integer.parseInt(sumando2.text.toString())
        var resultado = s1*s2
        resul.text = "${getString(R.string.resul)} : $resultado"
        Toast.makeText(this,"Multiplicando...", Toast.LENGTH_LONG).show()
    }

    fun dividir(view:View){
        var sumando1: EditText = findViewById(R.id.editTextValor2)
        var sumando2: EditText = findViewById(R.id.editTextValor)
        var resul : TextView = findViewById(R.id.txtResultado)

        var s1 = Integer.parseInt(sumando1.text.toString())
        var s2 = Integer.parseInt(sumando2.text.toString())
        var resultado = 0
        try {
            resultado = s1/s2
            resul.text = "${getString(R.string.resul)} : $resultado"
            Toast.makeText(this,"Dividiendo...", Toast.LENGTH_LONG).show()
        } catch (e: Exception) {
            println("division by zero exception")
            Toast.makeText(this,"No se puede dividir entre 0...", Toast.LENGTH_LONG).show()
        }
    }
}