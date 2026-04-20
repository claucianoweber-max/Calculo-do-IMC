package com.example.testeimc

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Oculta a barra de ação padrão
        supportActionBar?.hide()
        setContentView(R.layout.activity_result)

        val textNomeResult = findViewById<TextView>(R.id.textNomeResult)
        val textCategoriaResult = findViewById<TextView>(R.id.textCategoriaResult)
        val textImcResult = findViewById<TextView>(R.id.textImcResult)
        val textPesoResult = findViewById<TextView>(R.id.textPesoResult)
        val textAlturaResult = findViewById<TextView>(R.id.textAlturaResult)
        val btnVoltar = findViewById<Button>(R.id.btnVoltar)

        // Recebendo dados da tela anterior
        val nome = intent.getStringExtra("NOME") ?: "Desconhecido"
        val genero = intent.getStringExtra("GENERO") ?: "Homem"
        val peso = intent.getDoubleExtra("PESO", 0.0)
        val alturaCm = intent.getDoubleExtra("ALTURA", 0.0)

        // O cálculo do IMC exige a altura em metros
        val alturaMetros = alturaCm / 100
        val imc = if (alturaMetros > 0) peso / (alturaMetros * alturaMetros) else 0.0

        // Classificação do IMC Padrão OMS
        // Nota: A tabela pode ter pequenas variações entre homem/mulher.
        val categoria = when {
            imc < 18.5 -> "Abaixo do peso"
            imc < 25.0 -> "Peso Normal"   // De 18.5 até 24.9
            imc < 30.0 -> "Sobrepeso"     // De 25.0 até 29.9
            else -> "Obesidade"           // 30.0 ou mais
        }


        // Formatando as strings.
        textNomeResult.text = nome
        textCategoriaResult.text = categoria
        textImcResult.text = String.format("Seu IMC %.2f", imc)
        textPesoResult.text = "Seu Peso $peso"
        textAlturaResult.text = "Sua Altura $alturaCm"

        // Botão de voltar.
        btnVoltar.setOnClickListener {
            finish()
        }
    }
}
