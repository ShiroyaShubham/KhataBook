package com.example.khatabook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.widget.AppCompatButton

class AddCategoryActivity : AppCompatActivity() {

    lateinit var btnAdd: AppCompatButton
    lateinit var edtCategory: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_add_category)
        initView()
    }

    private fun initView() {
        btnAdd = findViewById(R.id.btnAdd)
        edtCategory = findViewById(R.id.edtCategory)
        val dataBaseHelper = DataBaseHelper(this)

        btnAdd.setOnClickListener {

            val name = edtCategory.text.toString()

            if (name.isEmpty()) {
                edtCategory.setError("Please Enter Category Name")
            } else {

                dataBaseHelper.insertData(name)

                val i = Intent(this, MainActivity::class.java)
                startActivity(i)
                finish()

            }
        }

    }
}