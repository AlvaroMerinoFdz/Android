package com.example.adivinarnumero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*


/*
* La aplicación generará un número al azar del 1 al 100 (que no mostrará al usuario). El  jugador
* debe  tratar  de  adivinarlo.  La  aplicación  le  irá  dando  pistas  indicando  si  el  número  oculto  es
* mayor o menor que el del usuario. Tendremos 5 intentos (que podemos representar con una
* barra de progreso, según nos quedemos sin vidas la barra irá bajando). Cuando se muestre el
* resultado final del juego solo se habilitará un botón que me permita reiniciar todo.
* Ampliación: añade dos CB (dar pistas, ignorar intentos).*/


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var numero:Int = (0..100).random()
        var intentar: Button = findViewById(R.id.btnIntentar)
        var tuNumero:EditText = findViewById(R.id.etNumero)
        var imagen:ImageView = findViewById(R.id.imgImagen)

        var barra:ProgressBar = findViewById(R.id.pbIntentos)

        intentar.setOnClickListener(){
            var yourNumber:Int = tuNumero.text.toString().toInt()
            var correcto:Boolean = false
            if(barra.progress == 5 || !correcto){
                if(yourNumber < numero){
                    Toast.makeText(this,"Tu numero es menor",Toast.LENGTH_LONG).show()
                    imagen.setImageResource(R.drawable.menor)
                    barra.progress+=1
                }else if(yourNumber > numero){
                    Toast.makeText(this,"Tu numero es mayor",Toast.LENGTH_LONG).show()
                    imagen.setImageResource(R.drawable.mayor)
                    barra.progress+=1
                }else{
                    Toast.makeText(this,"Has acertado",Toast.LENGTH_LONG).show()
                    imagen.setImageResource(R.drawable.ganador)
                }
                correcto = true
            }
            if(barra.progress == 5){
                Toast.makeText(this,"HAS PERDIDO",Toast.LENGTH_LONG).show()
                imagen.setImageResource(R.drawable.perdedor)
            }
        }
    }
}