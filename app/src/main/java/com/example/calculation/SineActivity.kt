package com.example.calculation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jjoe64.graphview.GraphView
import com.jjoe64.graphview.series.DataPoint
import com.jjoe64.graphview.series.LineGraphSeries
import kotlinx.android.synthetic.main.activity_sine.*

class SineActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sine)
        val field = findViewById<GraphView>(R.id.graph)

        field.viewport.isScrollable = true

        field.viewport.isScalable = true

        field.viewport.setScalableY(true)

        field.viewport.setScrollableY(true)

        field.getViewport().setMinX(-2147483647.0);

        var myData = Array<DataPoint?>(1000){null}

        if(Sine.isSine){
            var t = 0
            var x = 0F
            while(t < 1000){
                var y = Sine.amplitude * Math.sin(x.toDouble() * Sine.frequency)
                var point:DataPoint = DataPoint(x.toDouble(), y)
                x = x + 0.1F
                myData[t] = point
                t = t + 1
            }
            var data = LineGraphSeries<DataPoint>(myData)
            field.addSeries(data)
        }else if(Sine.isCos){
            var t = 0
            var x = 0F
            while(t < 1000){
                var y = Sine.amplitude * Math.cos(x.toDouble() * Sine.frequency)
                var point:DataPoint = DataPoint(x.toDouble(), y)
                x = x + 0.1F
                myData[t] = point
                t = t + 1
            }
            var data = LineGraphSeries<DataPoint>(myData)
            field.addSeries(data)
        }else if(Sine.isTangen){
            var t = 0
            var x = 0F
            while(t < 1000){
                var y = Sine.amplitude * Math.tan(x.toDouble() * Sine.frequency)
                var point:DataPoint = DataPoint(x.toDouble(), y)
                x = x + 0.1F
                myData[t] = point
                t = t + 1
            }
            var data = LineGraphSeries<DataPoint>(myData)
            field.addSeries(data)
        }else if(Sine.isCosine){
            var t = 0
            var x = 0F
            while(t < 1000){
                var y = Sine.amplitude * (1.0 / Math.sin(x.toDouble() * Sine.frequency))
                var point:DataPoint = DataPoint(x.toDouble(), y)
                x = x + 0.1F
                myData[t] = point
                t = t + 1
            }
            var data = LineGraphSeries<DataPoint>(myData)
            field.addSeries(data)
        }else if(Sine.isCosecant){
            var t = 0
            var x = 0F
            while(t < 1000){
                var y = Sine.amplitude * (1.0 / Math.cos(x.toDouble() * Sine.frequency))
                var point:DataPoint = DataPoint(x.toDouble(), y)
                x = x + 0.1F
                myData[t] = point
                t = t + 1
            }
            var data = LineGraphSeries<DataPoint>(myData)
            field.addSeries(data)
        }else if(Sine.isCotangent){
            var t = 0
            var x = 0F
            while(t < 1000){
                var y = Sine.amplitude * (1.0 / Math.tan(x.toDouble() * Sine.frequency))
                var point:DataPoint = DataPoint(x.toDouble(), y)
                x = x + 0.1F
                myData[t] = point
                t = t + 1
            }
            var data = LineGraphSeries<DataPoint>(myData)
            field.addSeries(data)
        }

    }
}