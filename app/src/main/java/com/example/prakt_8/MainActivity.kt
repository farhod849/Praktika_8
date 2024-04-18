package com.example.prakt_8

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn1: Button = findViewById(R.id.button);
        val btn2: Button = findViewById(R.id.button2);
        val btn3: Button = findViewById(R.id.button3);
        val clrtxt: TextView = findViewById(R.id.colortext);
        val mainlay: ConstraintLayout = findViewById(R.id.main)

        btn1.setOnClickListener{
            clrtxt.text = "Красный"
            mainlay.setBackgroundColor(resources.getColor(R.color.red, null))
        }
        btn2.setOnClickListener{
            clrtxt.text = "Синий"
            mainlay.setBackgroundColor(resources.getColor(R.color.blue, null))
        }
        btn3.setOnClickListener{
            clrtxt.text = "Фиолетовый"
            mainlay.setBackgroundColor(resources.getColor(R.color.purple, null))
        }

    }
}