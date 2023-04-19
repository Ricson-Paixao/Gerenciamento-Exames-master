package com.br.gexame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        findViewById<TextView>(R.id.perfil).setOnClickListener {
            val intent = Intent(this,Perfil::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.listaExames).setOnClickListener {
            val intent = Intent(this,ListaExames::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.solicitarexame).setOnClickListener {
            val intent = Intent(this,Form_Solicitacao_Exame::class.java)
            startActivity(intent)
        }
    }
}