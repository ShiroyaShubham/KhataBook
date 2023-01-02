package com.example.khatabook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.khatabook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initView()

    }


    private fun initView() {

        binding.loutAddCategory.setOnClickListener {

            val i = Intent(this, AddCategoryActivity::class.java)
            startActivity(i)
            finish()
        }
    }
}