package com.example.feedback1_gestornovelas

class NovelasRepository {
    companion object {
        val novelas = mutableListOf<Novela>().apply {
            add(Novela("La llamada de Cthulhu", "H. P. Lovecraft", 1928, "gyugdef"))
            add(Novela("La llamada de Pepito", "Manuel", 1948, ""))
            add(Novela("La llamada de Manuel", "Jose", 1932, ""))
            add(Novela("La llamada de Juan", "Anonimo", 1928, ""))
            add(Novela("La llamada de Pedro", "Maria", 1976, ""))
        }
        //creamos una lista de novelas que se puedan utilizar en todas las activities del programa
    }
}