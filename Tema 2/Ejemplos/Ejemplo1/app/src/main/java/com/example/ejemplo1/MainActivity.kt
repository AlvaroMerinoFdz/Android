package com.example.ejemplo1

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
        var miBoton: Button = findViewById(R.id.btnAceptar)

        miBoton.setOnClickListener(){
            var miCaja:TextView = findViewById(R.id.txtCaja)

            miCaja.text = "Cambiado desde código"
            var miEditText:EditText = findViewById(R.id.etNumero)
            var texto = miEditText.text
            Toast.makeText(this,texto,Toast.LENGTH_LONG).show()

        }
    }
}