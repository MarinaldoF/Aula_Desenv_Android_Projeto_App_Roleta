
package com.example.projetoroleta

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Carregando o botão da tela
        val randomico = findViewById<Button>(R.id.btn_rodar)

        // Dar uma ação para o botão
        randomico.setOnClickListener {

            // É carregado o número
            val resp = findViewById<TextView>(R.id.num_sort)
            // É carregado o numero que o usuário digitou
            val valorNumero = findViewById<EditText>(R.id.numero)

            // Condição para verificar se foi digitado valor
            if (valorNumero.text.isEmpty()) {
                // É exibido uma frase que deve ser preenchido
                resp.text = getString(R.string.erro)
                return@setOnClickListener
            }

            // Pega o valor que o usuario digitou
            val numDiferente = valorNumero.text.toString().toInt()

            // É verificado se o valor digitado atende as condições
            if (numDiferente in 11 downTo -1) {
                // Sorteando um número aleatorio

                val sorteado = Random().nextInt(11)
                println("O número sorteado foi $sorteado e o usuáruo escolheu $numDiferente")

                // condição contendo o valor sorteado
                if (sorteado.toString() == valorNumero.text.toString()) {
                    resp.text = getString(R.string.sorteado)
                } else {
                    resp.text = getString(R.string.nao_sorteado)
                }
            } else {
                resp.text = getString(R.string.erro)
            }
        }
    }
}
