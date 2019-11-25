package com.example.a4_1_listas

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lista = findViewById<ListView>(R.id.lvFrutas)

        // Se crea adaptador
        val frutas = arrayOf("Peras","Manzanas","Naranjas","Uvas")
        var adaptador: ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_2, frutas)

        // se asigna a la listview
        lista.adapter = adaptador

        lista.setOnItemClickListener {parent,view,position, id ->

            Toast.makeText(this, "pulsado = ${position}",Toast.LENGTH_LONG).show()

        }
    }

}
