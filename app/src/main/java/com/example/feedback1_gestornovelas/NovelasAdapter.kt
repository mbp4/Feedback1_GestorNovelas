package com.example.feedback1_gestornovelas

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NovelasAdapter (private var novelas: MutableList<Novela>,
                      private val onNovelasClick: (Novela) -> Unit): RecyclerView.Adapter<NovelasAdapter.NovelasViewHolder>(){

    class NovelasViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
         val textTituloNovel: TextView = itemView.findViewById(R.id.textTituloNovel)
         val textAutorNovel: TextView = itemView.findViewById(R.id.textAutorNovel)
         val btnVer: Button = itemView.findViewById(R.id.btnVer)
         val btnBorrar: Button = itemView.findViewById(R.id.btnBorrar)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): NovelasViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_novela, parent, false)
        return NovelasViewHolder(view)
    }

    override fun onBindViewHolder(holder: NovelasViewHolder, position: Int) {
        val novela = novelas[position]
        holder.textTituloNovel.text = novela.titulo
        holder.textAutorNovel.text = novela.autor
        holder.btnVer.setOnClickListener {
            onNovelasClick(novela)
        }
        holder.btnBorrar.setOnClickListener {
            novelas.removeAt(position)
            notifyDataSetChanged()
        }
    }

    override fun getItemCount(): Int {
        return novelas.size
    }
}

