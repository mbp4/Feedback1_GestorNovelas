package com.example.feedback1_gestornovelas

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
        val nuevaNovela = Novela(
                editTitulo.text.toString(), editAutor.text.toString(), editAño.text.toString().toInt(), editSinopsis.text.toString()
        )
        novelas.add(nuevaNovela)

    }
}