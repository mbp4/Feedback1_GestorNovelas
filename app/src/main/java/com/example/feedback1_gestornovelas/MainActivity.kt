package com.example.feedback1_gestornovelas

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.feedback1_gestornovelas.ui.theme.Feedback1_GestorNovelasTheme

class MainActivity : ComponentActivity() {
    private lateinit var btnAlta: Button
    private lateinit var btnAcercaDe: Button
    private lateinit var recyclerNovelas: RecyclerView
    private lateinit var novelasAdapter: NovelasAdapter
    private var listadoNovelas: MutableList <Novela> = NovelasRepository.novelas

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAlta = findViewById(R.id.btnAlta)
        btnAcercaDe = findViewById(R.id.btnAcercaDe)

        btnAlta.setOnClickListener {
            val intent = Intent(this, NuevaNovelaActivity::class.java)
            startActivityForResult(intent, REQUEST_CODE_ALTA_NOVELA)
        }

        btnAcercaDe.setOnClickListener {
            val intent = Intent(this, AcercaDeActivity::class.java)
            startActivity(intent)
        }

        novelasAdapter = NovelasAdapter(listadoNovelas){
            novela -> val intent = Intent(this, VerNovelaActivity::class.java)
            intent.putExtra("Titulo", novela.titulo)
            intent.putExtra("Autor", novela.autor)
            intent.putExtra("Año", novela.año)
            intent.putExtra("Sinopsis", novela.sinopsis)
            startActivity(intent)
        }

        recyclerNovelas = findViewById(R.id.recyclerNovelas)
        recyclerNovelas.adapter = novelasAdapter
        recyclerNovelas.layoutManager = LinearLayoutManager(this)

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUEST_CODE_ALTA_NOVELA && resultCode == RESULT_OK) {
            novelasAdapter.notifyDataSetChanged()
        }
    }

    companion object {
        private const val REQUEST_CODE_ALTA_NOVELA = 1
    }

}
