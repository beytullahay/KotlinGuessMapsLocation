package com.example.kotlinguessmapslocation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinguessmapslocation.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.guessThePlaceBtn?.setOnClickListener {
            startActivity(Intent(this,GuessPlaceActivity::class.java))
        }


    }
}