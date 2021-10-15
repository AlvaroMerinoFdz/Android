package com.example.ejercicio8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var etNombre: EditText = findViewById(R.id.etNombre)
        var lista: ArrayList<Encuesta> = ArrayList(0)
        var barra: SeekBar = findViewById(R.id.sbHoras)
        var numeroHoras: TextView = findViewById(R.id.txtHoras)
        var validar: Button = findViewById(R.id.btnValidar)
        var reinicar: Button = findViewById(R.id.btnReinicar)
        var cuantas: Button = findViewById(R.id.btnCuantas)
        var resumen: Button = findViewById(R.id.btnResumen)
        var groupSistema: RadioGroup = findViewById(R.id.rgSistema)
        var anonimo: Switch = findViewById(R.id.swAnonimo)
        var txtLista: TextView = findViewById(R.id.txtLista)
        numeroHoras.setText(barra.progress.toString())

        barra.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                var s = seekBar.progress.toString()
                numeroHoras.setText(s)
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar) {}
        })

        validar.setOnClickListener() {

            var nombre: String = if (anonimo.isChecked) {
                getString(R.string.anonimo)
            } else {

                etNombre.text.toString()
            }
            var radioSistema: RadioButton = findViewById(groupSistema.checkedRadioButtonId)
            var sistemaOperativo = radioSistema.text.toString()
            var especialidades = ArrayList<String>(0)
            var ckbDam: CheckBox = findViewById(R.id.cbDAM)
            if (ckbDam.isChecked) especialidades.add(ckbDam.text.toString())
            var ckbAsir: CheckBox = findViewById(R.id.cbASIR)
            if (ckbAsir.isChecked) especialidades.add(ckbAsir.text.toString())
            var ckbDaw: CheckBox = findViewById(R.id.cbDAW)
            if (ckbDaw.isChecked) especialidades.add(ckbDaw.text.toString())
            var textNumHoras: TextView = findViewById(R.id.txtHoras)
            var numHoras = textNumHoras.text.toString().toInt()
            lista.add(Encuesta(nombre, sistemaOperativo, especialidades, numHoras))
            Toast.makeText(this, getString(R.string.correcto), Toast.LENGTH_SHORT).show()
            reestablecerValores(etNombre, radioSistema, ckbDam, ckbAsir, ckbDaw)
        }

        reinicar.setOnClickListener() {
            txtLista.setText("")
            lista.clear()
        }

        cuantas.setOnClickListener() {
            var cadena:String = getString(R.string.estudiantes) + ": " + lista.count().toString()
            Toast.makeText(this,cadena, Toast.LENGTH_SHORT).show()
        }
        resumen.setOnClickListener() {
            txtLista.text = lista.toString()
        }
    }

    private fun reestablecerValores(etNombre: EditText, radioSistema: RadioButton, ckbDam: CheckBox, ckbAsir: CheckBox, ckbDaw: CheckBox) {
        etNombre.setText("")
        radioSistema.isChecked = false
        ckbDam.isChecked = false
        ckbAsir.isChecked = false
        ckbDaw.isChecked = false
    }
}

data class Encuesta(
    var nombre: String,
    var so: String,
    var especialidades: ArrayList<String>,
    var horasEstudio: Int
) {
    override fun toString(): String {
        var msg = "Encuesta($nombre, $so, ["
        for (especialidad in especialidades) {
            msg += "$especialidad, "
        }
        msg = msg.removeRange(msg.length - 2 until msg.length)//con esto eliminamos la coma
        msg += "], $horasEstudio horas) \n"
        return msg
    }
}