package com.example.ejercicio03.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ejercicio03.R
import com.example.ejercicio03.adapters.ListaLibrosAdapter
import com.example.ejercicio03.entities.Libro

class ListaLibros : Fragment() {

    lateinit var v: View
    lateinit var recLibros: RecyclerView
    private lateinit var linearLayoutManager: LinearLayoutManager
    var libros: MutableList<Libro> = ArrayList<Libro>()
    private lateinit var listaLibrosAdapter: ListaLibrosAdapter

    companion object {
        fun newInstance() = ListaLibros()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Aca se agregan todos los mambos
        v = inflater.inflate(R.layout.fragment_lista_libros, container, false)
        recLibros = v.findViewById(R.id.rec_libros)
        return v;
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        super.onStart()

        this.libros.add(Libro("Divina Comedia", "Dante", 1425))
        this.libros.add(Libro("HP 7", "JK", 2007))

        // Config del recycler view
        recLibros.setHasFixedSize(true)
        linearLayoutManager = LinearLayoutManager(context)
        recLibros.layoutManager = linearLayoutManager

        listaLibrosAdapter = ListaLibrosAdapter(libros)
        recLibros.adapter = listaLibrosAdapter

    }
}