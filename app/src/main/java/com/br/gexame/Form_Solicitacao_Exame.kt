package com.br.gexame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Form_Solicitacao_Exame : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_solicitacao_exame)

        findViewById<Button>(R.id.solicitar).setOnClickListener {
            val intent = Intent(this,ListaExames::class.java)
            startActivity(intent)
        }
    }
}