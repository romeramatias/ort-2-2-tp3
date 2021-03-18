package com.example.ejercicio02.domain

import android.os.Parcel
import android.os.Parcelable

// La clase viene con un constructor asi por defecto
class User(nombre: String, password: String) : Parcelable {

    // Variables de la clase, no hace falta el private, ya viene por defecto
    var nombre: String
    var password: String

    // Me pide que las debo inicializar con los datos que me llegan del constructor
    init {
        this.nombre = nombre
        this.password = password
    }

    // Esto la verdad no se ni que es
    constructor(source: Parcel) : this(
        source.readString()!!,
        source.readString()!!
    )

    companion object {
        @JvmField
        val CREATOR: Parcelable.Creator<User> = object : Parcelable.Creator<User> {
            override fun createFromParcel(source: Parcel): User = User(source)
            override fun newArray(size: Int): Array<User?> = arrayOfNulls(size)
        }
    }

    // Metodos a implementar de Parcelable
    override fun writeToParcel(dest: Parcel?, flags: Int) {
        TODO("Not yet implemented")
    }

    override fun describeContents(): Int {
        TODO("Not yet implemented")
    }


}