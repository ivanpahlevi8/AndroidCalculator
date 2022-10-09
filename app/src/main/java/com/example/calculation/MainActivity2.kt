package com.example.calculation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        generateSine.setOnClickListener{ v ->
            val amplitude: Float = amplitudeInput.text.toString().toFloat()
            val frequency: Float = frequencyInput.text.toString().toFloat()
            Sine.amplitude = amplitude
            Sine.frequency = frequency
            val intent = Intent(this, SineActivity::class.java)
            startActivity(intent)
        }
    }
}