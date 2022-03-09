package com.example.kinokursovaya

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.kinokursovaya.api.RestApiManager
import com.example.kinokursovaya.models.ModelClassAuthorization
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAuto.setOnClickListener {
            authorization()
        }
        btnReg.setOnClickListener {
            val intent = Intent(this@MainActivity, RegistrationActivity::class.java)
            startActivity(intent)
        }
    }

    private fun authorization() {
        val apiService = RestApiManager()
        val modelClass = ModelClassAuthorization(
            Login = editLogin.text.toString(),
            Password = editPassword.text.toString()
        )

        apiService.userAuthorization(modelClass) {
            Toast.makeText(applicationContext, "Вход...", Toast.LENGTH_LONG).show()
            val intent = Intent(this@MainActivity, MainMenuActivity::class.java)
            startActivity(intent)
        }
    }
}

