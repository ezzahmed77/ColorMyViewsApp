package com.example.android.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set onClickListener for all views to be colored when clicking on them
        setListeners()
    }

    private fun setListeners() {
        val myViews : List<View> =  listOf(findViewById(R.id.box_one_text), findViewById(R.id.box_two_text),
            findViewById(R.id.box_three_text), findViewById(R.id.box_four_text), findViewById(R.id.box_five_text),
            findViewById(R.id.button_red), findViewById(R.id.button_green), findViewById(R.id.button_yellow),
            findViewById(R.id.constraint_layout))
        for(item in myViews){
            item.setOnClickListener { makeColored(item) }
        }
    }

    private fun makeColored(view: View) {
        when(view.id){
            // Boxes using Color class colors for background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_dark)

            // Boxes using custom colors for background
            R.id.button_red -> findViewById<TextView>(R.id.box_three_text).setBackgroundResource(R.color.my_red)
            R.id.button_yellow -> findViewById<TextView>(R.id.box_four_text).setBackgroundResource(R.color.my_yellow)
            R.id.button_green -> findViewById<TextView>(R.id.box_five_text).setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }

    }
}