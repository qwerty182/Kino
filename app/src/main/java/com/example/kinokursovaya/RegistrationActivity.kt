package com.example.kinokursovaya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.kinokursovaya.api.RestApiManager
import com.example.kinokursovaya.models.ModelClassRegistration
import kotlinx.android.synthetic.main.activity_registration.*

class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        btnRegistration.setOnClickListener {
            registration()
        }
        btnBack.setOnClickListener {
            val intent = Intent(this@RegistrationActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }

    private fun registration(){
        val apiService = RestApiManager()
        val modelClassReg = ModelClassRegistration(
            Login = "log5",
            Password = "pass1",
            RoleName = "Пользователь",
            Number = "",
            Address = "",
            Age = 18,
            Gender = "",
            LastName = "ывмывмв",
            FirstName = "ывмиывм",
            MiddleName = "вмымывмывм"
        )

        apiService.userRegistration(modelClassReg) {
            if (it != null) {
                Toast.makeText(applicationContext, "Пользователь добавлен", Toast.LENGTH_LONG).show()
                val intent = Intent(this@RegistrationActivity, MainActivity::class.java)
                startActivity(intent)
                Log.i("MyLog", "registration: ")
            }
        }
    }
}