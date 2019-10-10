package com.ideproject.mooracle.solitaireandroid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //set the counter variable which will be incremented and printed in textView later
        var counter = 0

        //set the on click listener on the counter button
        counterButton.setOnClickListener {
            //when the button is clicked then the counter will be incremented
            counter++
            //then print the counter (in string) to counter text view
            counterTextView.text = counter.toString()
        }
    }
}
