package com.newwalk.myapplication234324

import android.content.Context
import android.graphics.Canvas
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var i : Int = 0
    var totalsum : Float = 0f
    var middlemark : Float = 0f
    var qwerty : Float = 0f
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun myFun (v: View){
        var library : Array<Float> = arrayOf(2f,3f,4f,5f)
        var hints : Array<String> = arrayOf("Введите двойки", "Введите тройки", "Введите четвери", "Введите пятерки")

     //   hints
            //var i : Int = 0

      marks.hint=hints[i]
        i++
library [0] = marks.text.toString().toFloat()
        library [1] = marks.text.toString().toFloat()
        library [2] = marks.text.toString().toFloat()
        library [3] = marks.text.toString().toFloat()
        totalsum = library [0] * 2 + library[1] * 3 + library[2] * 4 + library [3] * 5
        qwerty = library [0] + library[1] + library[2] + library[3]
        middlemark = totalsum / qwerty
        middlemarks.setText(middlemark.toString())
    }
}
