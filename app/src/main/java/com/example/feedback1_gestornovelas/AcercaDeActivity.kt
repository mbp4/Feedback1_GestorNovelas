package com.example.feedback1_gestornovelas

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class AcercaDeActivity: ComponentActivity() {
    private lateinit var btnAceptar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acerca_de)

        btnAceptar = findViewById(R.id.aceptar)

        btnAceptar.setOnClickListener {
            finish()
        }
    }
}