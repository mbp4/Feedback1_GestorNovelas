package com.example.feedback1_gestornovelas

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NovelasAdapter (private val novelas: MutableList<Novela>): RecyclerView.Adapter<NovelasAdapter.NovelasViewHolder>(){

    class NovelasViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
         val textTituloNovel: TextView = itemView.findViewById(R.id.textTituloNovel)
         val textAutorNovel: TextView = itemView.findViewById(R.id.textAutorNovel)

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): NovelasAdapter.NovelasViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_novela, parent, false)
        return NovelasViewHolder(view)
    }

    override fun onBindViewHolder(holder: NovelasAdapter.NovelasViewHolder, position: Int) {
        val novela = novelas[position]
        holder.textTituloNovel.text = novela.titulo
        holder.textAutorNovel.text = novela.autor
    }

    override fun getItemCount(): Int {
        return novelas.size
    }
}

