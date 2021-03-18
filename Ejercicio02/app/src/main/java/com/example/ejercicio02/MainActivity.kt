package com.example.ejercicio02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.ejercicio02.domain.User

class MainActivity : AppCompatActivity() {

    // Cosas del Nav
    private lateinit var navHostFragment: NavHostFragment
    private lateinit var navController: NavController

    // User
    var user : User = User("matias","123")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        this.navController = navHostFragment.navController

        NavigationUI.setupActionBarWithNavController(this, this.navController)

    }

    override fun onSupportNavigateUp(): Boolean {
        return this.navController.navigateUp()
    }
}