package com.example.ejercicio03.entities

// DUDA Para que era el signo de pregunta?
// En la declaracion de la clase va el constructor
//
class Libro(nombre: String, autor: String, anio: Int) {

    // Declaracion de atributos
    // DUDA Hay que inicializar si o si los atributos?
    var nombre: String = ""
    var autor: String = ""
    var anio: Int = 0

    // DUDA El init para que es?
    init {
        this.nombre = nombre
        this.autor = autor
        this.anio = anio
    }


}