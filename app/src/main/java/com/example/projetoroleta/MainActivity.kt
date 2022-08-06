package com.example.projetoroleta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //variavel do tipo constante
        val btn_rodarNumero = findViewById(R.id.btn_rodar) as Button
        //metado para gerar o número randomico
        btn_rodarNumero.setOnClickListener {
            var texto = findViewById<TextView>(R.id.txt_sorteado)
            var numeroSorteado = Random().nextInt(11)
            texto.text = "Número sorteado é: " + numeroSorteado
        }




    }
}