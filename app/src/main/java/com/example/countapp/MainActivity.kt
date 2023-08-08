package com.example.countapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.countapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var score:Int = 0;


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.inecrementBtn.setOnClickListener {
            score++
            setValue(score)
        }
        binding.decrementBtn.setOnClickListener {
            score--
            setValue(score)
        }

        binding.resetBtn.setOnClickListener {
            score = 0
            setValue(score)
        }
    }

    private fun setValue(score: Int) {

        binding.scoreTv.text = "$score"
    }
}