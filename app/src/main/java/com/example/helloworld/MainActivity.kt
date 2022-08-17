package com.example.helloworld

import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout


// This Kotlin file is where we are going to handle user interaction
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Show this layout file: activity_main
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.helloButton).setOnClickListener {
            Toast.makeText(this,"Hello, friend!", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.textStringButton).setOnClickListener {
            if (findViewById<EditText>(R.id.editText).text.isNullOrEmpty()) {
                findViewById<TextView>(R.id.textView).setText("Android is Awesome!")
            } else {
                findViewById<TextView>(R.id.textView).setText(findViewById<EditText>(R.id.editText).text)
            }

        }

        findViewById<Button>(R.id.backgroundColorButton).setOnClickListener {
            findViewById<ConstraintLayout>(R.id.backgroundView).setBackgroundColor(resources.getColor(R.color.teal_700))
        }

    }
}