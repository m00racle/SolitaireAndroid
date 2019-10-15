package com.ideproject.mooracle.solitaireandroid

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.button
import org.jetbrains.anko.onClick
import org.jetbrains.anko.relativeLayout
import org.jetbrains.anko.textView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //set the counter variable which will be incremented and printed in textView later
        var counter = 0
        //setting relative layout using anko
        relativeLayout {
            //here let set the textView that will hold the counter variable
            //the id of this textView will be counterTextView
            val counterTextView = textView {
                //here we initiate the condition of the text View
                text = "0"
                //also set the properties of the text as in text size
                textSize = 24f //f here denotes the number 24 is not an integer but a float
            }
            button {
                //set onClick listner
                onClick {
                    // when clicked increment the counter by 1
                    counter++
                    //set the counter text view to display the latest counter value
                    counterTextView.text = counter.toString()
                }
            }
        }
    }
}
