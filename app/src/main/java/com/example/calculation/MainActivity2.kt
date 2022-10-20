package com.example.calculation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // sine segment
        generateSine.setOnClickListener{ v ->
            val amplitude: Float = amplitudeInput.text.toString().toFloat()
            val frequency: Float = frequencyInput.text.toString().toFloat()
            Sine.amplitude = amplitude
            Sine.frequency = frequency
            val intent = Intent(this, SineActivity::class.java)
            startActivity(intent)
        }

        radioGroupSine.clearCheck()

        radioGroupSine.setOnCheckedChangeListener { radioGroup, checkedId ->
            val rb = radioGroup.findViewById<View>(checkedId)
            when(rb.id){
                R.id.sinusRadioButton -> {
                    Sine.isSine = true
                    Sine.isCos = false
                    Sine.isTangen = false
                    Sine.isCosine = false
                    Sine.isCosecant = false
                    Sine.isCotangent = false
                }
                R.id.cosRadioButton -> {
                    Sine.isSine = false
                    Sine.isCos = true
                    Sine.isTangen = false
                    Sine.isCosine = false
                    Sine.isCosecant = false
                    Sine.isCotangent = false
                }
                R.id.tangenRadioButton -> {
                    Sine.isSine = false
                    Sine.isCos = false
                    Sine.isTangen = true
                    Sine.isCosine = false
                    Sine.isCosecant = false
                    Sine.isCotangent = false
                }
                R.id.cosinusRadioButton -> {
                    Sine.isSine = false
                    Sine.isCos = false
                    Sine.isTangen = false
                    Sine.isCosine = true
                    Sine.isCosecant = false
                    Sine.isCotangent = false
                }
                R.id.cosecantRadioButton -> {
                    Sine.isSine = false
                    Sine.isCos = false
                    Sine.isTangen = false
                    Sine.isCosine = false
                    Sine.isCosecant = true
                    Sine.isCotangent = false
                }
                R.id.cotangenRadioButton -> {
                    Sine.isSine = false
                    Sine.isCos = false
                    Sine.isTangen = false
                    Sine.isCosine = false
                    Sine.isCosecant = false
                    Sine.isCotangent = true
                }
            }
        }

        // polynomial segment
        generatePoly.setOnClickListener{ v ->
            val inputOrde0: Float = inputOrde0.text.toString().toFloat()
            val inputOrde1: Float = inputOrde1.text.toString().toFloat()
            val inputOrde2: Float = inputOrde2.text.toString().toFloat()
            val inputOrde3: Float = inputOrde3.text.toString().toFloat()
            val inputOrde4: Float = inputOrde4.text.toString().toFloat()
            val inputOrde5: Float = inputOrde5.text.toString().toFloat()

            Poly.valOrde0 = inputOrde0
            Poly.valOrde1 = inputOrde1
            Poly.valOrde2 = inputOrde2
            Poly.valOrde3 = inputOrde3
            Poly.valOrde4 = inputOrde4
            Poly.valOrde5 = inputOrde5

            val inten = Intent(this, PolynomActivity::class.java)
            startActivity(inten)
        }

        imageButton.setOnClickListener{ v ->
            val infoDialog = InfoDialog()
            infoDialog.show(supportFragmentManager, "")
        }

    }
}