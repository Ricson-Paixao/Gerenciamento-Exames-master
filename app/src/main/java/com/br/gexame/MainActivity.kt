package com.br.gexame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        findViewById<Button>(R.id.login).setOnClickListener { 
            val intent_Perfil = Intent(this,Perfil::class.java)

            val nome = findViewById<EditText>(R.id.nome).text.toString()
            val senha = findViewById<EditText>(R.id.cpf).text.toString()

            if(nome.equals("ricson") and senha.equals("12345")){
                intent_Perfil.putExtra("nome",nome)
                intent_Perfil.putExtra("senha",senha)

                startActivity(intent_Perfil)
            }else{
                Toast.makeText(this,"Dados Inválidos",Toast.LENGTH_SHORT).show()
            }
        }
    }
}