package com.example.feedback1_gestornovelas

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity

class VerNovelaActivity: ComponentActivity() {

    private lateinit var txt1: TextView
    private lateinit var txt2: TextView
    private lateinit var txt3: TextView
    private lateinit var txt4: TextView
    private lateinit var btnVolver: Button
    /*
    private var txtTitulo: TextView = findViewById(R.id.txtTitulo)
    private var txtAutor: TextView = findViewById(R.id.txtAutor)
    //private var txtAño: TextView = findViewById(R.id.txtAño)
    private var txtSinopsis: TextView = findViewById(R.id.txtSinopsis)

     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ver)
        txt1 = findViewById(R.id.txt1)
        val titulo = intent.getStringExtra("Titulo")
        txt1.text = titulo

        txt2 = findViewById(R.id.txt2)
        val autor = intent.getStringExtra("Autor")
        txt2.text = autor

        txt3 = findViewById(R.id.txt3)
        val sinopsis = intent.getStringExtra("Sinopsis")
        txt3.text = sinopsis

        txt4 = findViewById(R.id.txt4)
        val año = intent.getIntExtra("Año", 0).toString()
        txt4.text = año

        btnVolver = findViewById(R.id.btnVolver)
        btnVolver.setOnClickListener {
            finish()
        }

        /*
        val titulo = intent.getStringExtra("Titulo")
        val autor = intent.getStringExtra("Autor")
        //val año = intent.getIntExtra("Año", 0).toString()
        val sinopsis = intent.getStringExtra("Sinopsis")

        txtTitulo.text = titulo
        txtAutor.text = autor
        //txtAño.text = año
        txtSinopsis.text = sinopsis

         */

    }

}