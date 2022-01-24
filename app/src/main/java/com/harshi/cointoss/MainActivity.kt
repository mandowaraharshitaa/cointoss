package com.harshi.cointoss

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toss: Button = findViewById(R.id.button)
        toss.setOnClickListener {
            val coinImage: ImageView = findViewById(R.id.imageView)
            val Tos = (1..2).random()
            when (Tos) {
                1 -> coinImage.setImageResource(R.drawable.tail)
                2 -> coinImage.setImageResource(R.drawable.head)
            }
        }
    }
}





