package com.example.testeimc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editNome = findViewById<EditText>(R.id.editNome)
        val editPeso = findViewById<EditText>(R.id.editPeso)
        val editAltura = findViewById<EditText>(R.id.editAltura)
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)
        val radioHomem = findViewById<RadioButton>(R.id.radioHomem)

        btnCalcular.setOnClickListener {
            val nome = editNome.text.toString()
            val pesoStr = editPeso.text.toString()
            val alturaStr = editAltura.text.toString()

            if (nome.isEmpty() || pesoStr.isEmpty() || alturaStr.isEmpty()) {
                Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val peso = pesoStr.toDoubleOrNull()
            val alturaCm = alturaStr.toDoubleOrNull()
            val genero = if (radioHomem.isChecked) "Homem" else "Mulher"

            if (peso != null && alturaCm != null) {
                // Navega para a tela de resultados enviando os dados
                val intent = Intent(this, ResultActivity::class.java).apply {
                    putExtra("NOME", nome)
                    putExtra("GENERO", genero)
                    putExtra("PESO", peso)
                    putExtra("ALTURA", alturaCm)
                }
                startActivity(intent)
            }
        }
    }
}
