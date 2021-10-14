package com.example.ejemplo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //var miBoton: Button = findViewById(R.id.btnAceptar)
        var check:CheckBox = findViewById(R.id.cbCheck)
        check.setOnClickListener(){
            if(check.isChecked){
                Toast.makeText(this,"Marcada",Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this,"Desmarcada",Toast.LENGTH_LONG).show()
            }
        }

    }

    fun alPulsarBoton(view: View){
        var miEditText:EditText = findViewById(R.id.etNumero)
        var texto = miEditText.text
        var check:CheckBox = findViewById(R.id.cbCheck)
        if(check.isChecked){
            Toast.makeText(this,"Marcada: $texto",Toast.LENGTH_LONG).show()
        }else{
            Toast.makeText(this,"Desmarcada: $texto",Toast.LENGTH_LONG).show()
        }
        //Toast.makeText(this,"$texto",Toast.LENGTH_LONG).show()
    }
}