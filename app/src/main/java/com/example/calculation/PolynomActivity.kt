package com.example.calculation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jjoe64.graphview.GraphView
import com.jjoe64.graphview.series.DataPoint
import com.jjoe64.graphview.series.LineGraphSeries

class PolynomActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_polynom)

        val field = findViewById<GraphView>(R.id.graph)

        field.viewport.isScrollable = true

        field.viewport.isScalable = true

        field.viewport.setScalableY(true)

        field.viewport.setScrollableY(true)

        var myData = Array<DataPoint?>(1000){null}

        val degre0: Float = Poly.valOrde0
        val degre1: Float = Poly.valOrde1
        val degre2: Float = Poly.valOrde2
        val degre3: Float = Poly.valOrde3
        val degre4: Float = Poly.valOrde4
        val degre5: Float = Poly.valOrde5

        var t = 0
        var x:Float = 0F

        while(t < 1000){
            var y = (degre5 * Math.pow(x.toDouble(), 5.0)) + (degre4 * Math.pow(x.toDouble(), 4.0)) +
                    (degre3 * Math.pow(x.toDouble(), 3.0)) + (degre2 * Math.pow(x.toDouble(), 2.0)) +
                    (degre1 * Math.pow(x.toDouble(), 1.0)) + (degre0)
            myData[t] = DataPoint(x.toDouble(), y)
            t = t + 1
            x = x + 0.1F
        }
        var data = LineGraphSeries<DataPoint>(myData)
        field.addSeries(data)
    }
}