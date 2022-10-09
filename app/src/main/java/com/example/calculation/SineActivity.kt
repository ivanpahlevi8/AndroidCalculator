package com.example.calculation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sine.*

class SineActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sine)
        textView11.text = Sine.amplitude.toString()
        textView10.setText(Sine.frequency.toString())
    }
}