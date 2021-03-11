package com.example.ejercicio_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    // Declaracion de variables
    lateinit var txtLogin: TextView
    lateinit var userInput: EditText
    lateinit var passInput: EditText
    lateinit var loginBtn: Button
    lateinit var mainLayout: ConstraintLayout
    private val user: String = "matias"
    private val password: String = "123"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtLogin = findViewById(R.id.txtLogin)
        userInput = findViewById(R.id.userInput)
        passInput = findViewById(R.id.passInput)
        loginBtn = findViewById(R.id.loginBtn)
        mainLayout = findViewById(R.id.mainLayout)

        loginBtn.setOnClickListener  {
            if (userInput.text.toString().equals(this.user)) {

                if (passInput.text.toString().equals(this.password)) {
                    Snackbar.make(mainLayout, "Todo ok", Snackbar.LENGTH_SHORT).show()
                } else {
                    Snackbar.make(mainLayout, "Password Incorrecta", Snackbar.LENGTH_SHORT).show()
                }

            } else {
                Snackbar.make(mainLayout, this.user, Snackbar.LENGTH_SHORT).show()
            }

        }
    }
}