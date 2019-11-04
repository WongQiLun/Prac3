package com.example.prac2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        val resultText: TextView = findViewById(R.id.result_text)
        rollButton.setOnClickListener { rollDice() }
        val countUpButton: Button = findViewById(R.id.btnCount)
        countUpButton.setOnClickListener{countUp()}
    }
    private fun rollDice() {
        val resultText: TextView = findViewById(R.id.result_text)
        //Toast.makeText(this, "button clicked",Toast.LENGTH_SHORT).show()
        val randomInt = Random().nextInt(6) + 1
        resultText.text = randomInt.toString()

    }

    private fun countUp(){
        val resultText: TextView = findViewById(R.id.result_text)
         val y = resultText.text.toString()
        var x =y.toInt()
        if( x< 6) x++
        resultText.text = x.toString()
    }
}
