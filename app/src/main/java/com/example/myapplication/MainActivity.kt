package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val comodo1 = Comodo("Sala", 120)
        val comodo2 = Comodo("Cozinha", 10)
        val comodo3 = Comodo("Quarto", 12)

        val lista = mutableListOf(comodo1, comodo2, comodo3)

        val adapter = ListaDeItensAdapter(lista)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerComodos)

        recyclerView.adapter = adapter
    }
}