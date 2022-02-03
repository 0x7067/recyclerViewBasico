package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListaDeItensAdapter(val dataset: MutableList<Comodo>): RecyclerView.Adapter<ListaDeItensAdapter.ViewHolder>() {
    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val titulo: TextView = view.findViewById(R.id.textTitulo)
        val consumo: TextView = view.findViewById(R.id.textConsumo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_comodo, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.titulo.text = dataset[position].nome
        holder.consumo.text = dataset[position].consumo.toString()
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}