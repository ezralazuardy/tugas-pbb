package com.ezralazuardy.tugaspbb.ui.auth

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.ezralazuardy.tugaspbb.databinding.ActivityLoginBinding
import com.ezralazuardy.tugaspbb.ui.db.Credential
import com.ezralazuardy.tugaspbb.ui.main.MainActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        binding.buttonLogin.setOnClickListener {
            val email = binding.inputTextEmail.text.toString()
            val password = binding.inputTextPassword.text.toString()
            var registered = false
            Credential.getRegisteredCredentials().forEach {
                if (it.email == email && it.password == password) {
                    registered = true
                    startActivity(Intent(this, MainActivity::class.java))
                    finish()
                }
            }
            if (!registered) {
                Toast.makeText(
                    this,
                    "Wrong credential!, please try again.",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
        setContentView(binding.root)
    }
}