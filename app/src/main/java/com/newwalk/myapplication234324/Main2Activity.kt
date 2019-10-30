package com.newwalk.myapplication234324

import android.content.Context
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import android.graphics.Canvas as Canvas1

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    fun myFun(v: View) {

    }
}

class Myclass(context: Context, attributeSet: AttributeSet) : View(context,attributeSet) {
    var map: Array<Array<Int>> = arrayOf(
        arrayOf(0, 1, 2, 3, 4, 5, 6, 7),
        arrayOf(0, 1, 2, 3, 4, 5, 6, 7),
        arrayOf(0, 1, 2, 3, 4, 5, 6, 7),
        arrayOf(0, 1, 2, 3, 4, 5, 6, 7),
        arrayOf(0, 1, 2, 3, 4, 5, 6, 7),
        arrayOf(0, 1, 2, 3, 4, 5, 6, 7),
        arrayOf(0, 1, 2, 3, 4, 5, 6, 7),
        arrayOf(0, 1, 2, 3, 4, 5, 6, 7)
    )
    var m : Array<Int>  = arrayOf(0, 1,0, 1, 0, 1, 0, 1)


    override fun onDraw(canvas: Canvas1) {
        super.onDraw(canvas)
        var paint = Paint()
var STEP= 100F
        for (i in (0..map.size - 1)) {
            for (j in (0..map[i].size - 1)) {
                if (map[j][i] == 0) {
                    paint.color = Color.RED
                    canvas.drawCircle(i * STEP, j * STEP, STEP, paint)

                }
                if (map[j][i] == 7) {
                    paint.color = Color.BLUE
                    canvas.drawCircle(i * STEP, j * STEP, STEP, paint)

                }
                if (map[j][i] == 4) {
                    paint.color = Color.BLUE
                    canvas.drawRect(i * STEP, j * STEP, i * STEP + STEP, j * STEP + STEP, paint)

                }
                //canvas.drawCircle(i * 50f, j * 50f, 50f, paint)
            }
        }
            //   var Rect : Rect(map[i][b])
    // canvas.drawRect(Rect?)
    }
}