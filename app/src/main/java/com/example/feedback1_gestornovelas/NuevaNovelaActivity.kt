package com.example.feedback1_gestornovelas

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity
import com.example.feedback1_gestornovelas.R
import com.example.feedback1_gestornovelas.Novela

class NuevaNovelaActivity: ComponentActivity() {
    private lateinit var btnGuardarNovela: Button
    private lateinit var btnCancelar: Button
    private lateinit var editTitulo: EditText
    private lateinit var editAutor: EditText
    private lateinit var editAño: EditText
    private lateinit var editSinopsis: EditText
    private var listadoNovelas: MutableList <Novela> = NovelasRepository.novelas

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nueva_novela)

        editTitulo = findViewById(R.id.editTitulo)
        editAutor = findViewById(R.id.editAutor)
        editAño = findViewById(R.id.editAño)
        editSinopsis = findViewById(R.id.editSinopsis)

        btnGuardarNovela = findViewById(R.id.btnGuardarNovela)
        btnCancelar = findViewById(R.id.btnCancelar)

        btnGuardarNovela.setOnClickListener {
            guardarNovela()
            finish()
        }

        btnCancelar.setOnClickListener {
            finish()
        }

    }

    fun guardarNovela(){

        val titulo = editTitulo.text.toString()
        val autor = editAutor.text.toString()
        val año = editAño.text.toString().toInt()
        val sinopsis = editSinopsis.text.toString()
        val nuevaNovela = Novela(titulo, autor, año, sinopsis)

        listadoNovelas.add(nuevaNovela)

        val resultIntent = Intent()
        setResult(RESULT_OK, resultIntent)
    }
}