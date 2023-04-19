package com.br.gexame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Perfil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil)

        val nome = intent.getStringExtra("nome")
        val senha = intent.getStringExtra("senha")

        findViewById<TextView>(R.id.nomePerfil).setText(nome)
        findViewById<TextView>(R.id.senhaPerfil).setText(senha)

        findViewById<Button>(R.id.homebtn).setOnClickListener {
            val intent = Intent(this,Home::class.java)
            startActivity(intent)
        }
    }
}