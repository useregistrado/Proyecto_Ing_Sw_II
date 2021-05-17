package com.example.taskapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    //Método botoón Login
    fun Siguiente(view: View?) {
        val siguiente = Intent(this, MainActivity::class.java)
        startActivity(siguiente)
    }
}