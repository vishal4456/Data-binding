package com.databunding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.databunding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
        SubmitBtn.setOnClickListener {
            val a = FirstNoEdt.text.toString().toInt()
            val b = SecondNoEdt.text.toString().toInt()
            val c = a + b
            val resultValue = "Addition of Two Number is $c"
            val intent = Intent(this@MainActivity, ResultActivity ::class.java)
            intent.putExtra("Resultkey", resultValue)
            startActivity(intent)
        }

        }
    }
}