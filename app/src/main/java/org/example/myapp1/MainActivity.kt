package org.example.myapp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etEmail: EditText = findViewById(R.id.etEmail)
        val etPassword: EditText = findViewById(R.id.etPassword)
        val btnLogin: Button = findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener {
            val userEmail: String = etEmail.text.toString()
            val userPassword: String = etPassword.text.toString()
            if (userEmail.equals("admin@gmail.com")&& userPassword.equals("admin@123"))
            {
                Toast.makeText(this,"Login successfull",Toast.LENGTH_LONG).show()
            }
            else
            {
                Toast.makeText(this,"Invalid Credentials",Toast.LENGTH_LONG).show()
            }
        }
    }
}