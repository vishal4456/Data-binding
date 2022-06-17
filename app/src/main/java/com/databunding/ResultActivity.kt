package com.databunding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.databunding.databinding.ActivityMainBinding
import com.databunding.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    lateinit var binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityResultBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val result = intent.getStringExtra("Resultkey")
        binding.resultTextView.setText(result)




    }
}