package com.br.gexame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class ListaExames : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_exames)

        val arrayAdapter: ArrayAdapter<*>
        val users = arrayOf(
            "Exame01", "Exame02", "Exame03",
            "Exame04", "Exame05"
        )

        val mListView = findViewById<ListView>(R.id.listaExame)
        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, users)
        mListView.adapter = arrayAdapter
    }
}