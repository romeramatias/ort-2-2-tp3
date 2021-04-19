package com.example.ejercicio03.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ejercicio03.R
import com.example.ejercicio03.entities.Libro

// Necesita la mutable lista
// Clase que va a hereder del recyclerview adapter
class ListaLibrosAdapter(
    private var librosList: MutableList<Libro>
) :
    RecyclerView.Adapter<ListaLibrosAdapter.ListaLibrosHolder>() {

    companion object {
        private val TAG = "ListaLibrosAdapter"
    }

    fun setData(newData: ArrayList<Libro>) {
        this.librosList = newData
        this.notifyDataSetChanged()
    }

    // Metodos de la interfaz a implementar
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListaLibrosHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_libro, parent, false)
        return (ListaLibrosHolder(view))
    }

    override fun getItemCount(): Int {
        return librosList.size
    }

    override fun onBindViewHolder(holder: ListaLibrosHolder, position: Int) {
        holder.setNombre(librosList[position].nombre)
    }

    // Hereda de Recyclerview Holder
    // Va a contener las acciones y las referencias en cuanto a la vista
    // Poner los textos y esas boludeces
    // Representa a una vista por eso la recibe por parametros
    class ListaLibrosHolder(v: View) : RecyclerView.ViewHolder(v) {
        private var view: View

        init {
            this.view = v
        }

        // Funciones para modelar el item
        fun setNombre(nombre: String) {
            val texto: TextView = this.view.findViewById(R.id.text_item_name)
            texto.text = nombre
        }

        fun setAutor(autor: String) {
            val texto: TextView = this.view.findViewById(R.id.text_item_autor)
            texto.text = autor
        }

        fun setAnio(anio: Int) {
            val texto: TextView = this.view.findViewById(R.id.text_item_anio)
            texto.text = anio.toString()
        }
    }

}