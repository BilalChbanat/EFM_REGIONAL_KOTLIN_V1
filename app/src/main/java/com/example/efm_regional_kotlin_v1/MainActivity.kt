package com.example.efm_regional_kotlin_v1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var editText: EditText
    lateinit var textView2: TextView
    lateinit var textView3: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputText = findViewById<EditText>(R.id.e1)
        val resultEmpty = findViewById<TextView>(R.id.tv2)
        val resultSigle = findViewById<TextView>(R.id.tv3)

        val button = findViewById<Button>(R.id.btn)
        button.setOnClickListener {
            val input = editText.text.toString()
            if (input.isBlank() || input.isEmpty()) {
                textView2.text = ""
                textView3.text = ""
            } else {

            }
    }
}