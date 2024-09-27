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
    private lateinit var novelas: MutableList <Novela>
    private lateinit var recyclerNovelas: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAlta = findViewById(R.id.btnAlta)
        btnAcercaDe = findViewById(R.id.btnAcercaDe)

        btnAlta.setOnClickListener {
            val intent = Intent(this, NuevaNovelaActivity::class.java)
            startActivity(intent)
        }

        btnAcercaDe.setOnClickListener {
            val intent = Intent(this, AcercaDeActivity::class.java)
            startActivity(intent)
        }

        novelas = mutableListOf()
        novelas.add(Novela("La llamada de Cthulhu", "H. P. Lovecraft", 1928, ""))
        novelas.add(Novela("La llamada de Pepito", "Manuel", 1948, ""))
        novelas.add(Novela("La llamada de Manuel", "Jose", 1932, ""))
        novelas.add(Novela("La llamada de Juan", "Anonimo", 1928, ""))
        novelas.add(Novela("La llamada de Pedro", "Maria", 1976, ""))

        recyclerNovelas = findViewById(R.id.recyclerNovelas)
        recyclerNovelas.adapter = NovelasAdapter(novelas)
        recyclerNovelas.layoutManager = LinearLayoutManager(this)


    }

}
