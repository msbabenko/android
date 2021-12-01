package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickColorDisplayView = findViewById<TextView>(R.id.clickColorView)
        val clickRedButton = findViewById<TextView>(R.id.clickRedButton)
        val clickGreenButton = findViewById<TextView>(R.id.clickGreenButton)
        val clickBlueButton = findViewById<TextView>(R.id.clickBlueButton)

        clickRedButton.setOnClickListener{
            clickColorDisplayView.text = "Red was clicked"
        }
        clickGreenButton.setOnClickListener{
            clickColorDisplayView.text = "Green was clicked"
        }
        clickBlueButton.setOnClickListener{
            clickColorDisplayView.text = "Blue was clicked"
        }
    }
}