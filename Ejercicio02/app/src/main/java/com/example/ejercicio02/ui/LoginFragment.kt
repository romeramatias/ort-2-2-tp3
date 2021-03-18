package com.example.ejercicio02.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.ejercicio02.R
import com.google.android.material.snackbar.Snackbar

class LoginFragment : Fragment() {

    lateinit var txtLogin: TextView
    lateinit var userInput: EditText
    lateinit var passInput: EditText
    lateinit var loginBtn: Button
    lateinit var loginLayout: ConstraintLayout
    private val user: String = "matias"
    private val password: String = "123"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        txtLogin = view.findViewById(R.id.txtLogin)
        userInput = view.findViewById(R.id.userInput)
        passInput = view.findViewById(R.id.passInput)
        loginBtn = view.findViewById(R.id.loginBtn)
        loginLayout = view.findViewById(R.id.loginLayout)

        arguments

        loginBtn.setOnClickListener {
            if (userInput.text.toString() == (user)) {

                if (passInput.text.toString() == (password)) {
                    Snackbar.make(loginLayout, "Todo ok", Snackbar.LENGTH_SHORT).show()
                    findNavController().navigate(R.id.userFragment)
                } else {
                    Snackbar.make(loginLayout, "Password Incorrecta", Snackbar.LENGTH_SHORT).show()
                }

            } else {
                Snackbar.make(loginLayout, "Usuario Incorrecto", Snackbar.LENGTH_SHORT).show()
            }


        }
    }

}