package com.example.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodapp.databinding.ActivityStartBinding
import com.google.firebase.auth.FirebaseAuth

class StartScreen : AppCompatActivity() {
    private lateinit var auth : FirebaseAuth
    val binding by lazy{
        ActivityStartBinding.inflate(layoutInflater)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        auth = FirebaseAuth.getInstance()
        binding.nextBtn.setOnClickListener {
            startActivity(Intent(this,LogInActivity::class.java))
            finish()
        }

    }

    override fun onStart() {
        super.onStart()
        val user = auth.currentUser
        if (user != null){
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
    }
}