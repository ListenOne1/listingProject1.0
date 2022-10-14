package com.example.listingproject1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.util.LinkedList

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // linked list variable
        val value = LinkedList<String>()
        // input value
        val input = findViewById<EditText>(R.id.TextInputEditText)
        // find the button
        val inputButton: Button = findViewById(R.id.button)
        val deleteButton: Button = findViewById(R.id.button2)
//        val completeButton: Button = findViewById(R.id.button3)

        //press the input
        inputButton.setOnClickListener{
            // get the input
            val note = input.text
            // add to the list
            value.addLast(note.toString())
//            val resultTextView: TextView = findViewById(R.id.textView2)
//            resultTextView.text = value.toString()
            for (i in 0 until value.size) {
                when (i) {
                    0 -> {
                        // stored first value in first textview
                        val resultTextView: TextView = findViewById(R.id.textView2)
                        resultTextView.text = value[i]
                    }
                    1 -> {
                        // stored second value in second textview
                        val resultTextView: TextView = findViewById(R.id.textView3)
                        resultTextView.text = value[i]
                    }
                    2 -> {
                        val resultTextView: TextView = findViewById(R.id.textView4)
                        resultTextView.text = value[i]
                    }
                    3 -> {
                        val resultTextView: TextView = findViewById(R.id.textView5)
                        resultTextView.text = value[i]
                    }
                    else -> {
                        // display "there is no space"
                        Toast.makeText(this,"There is no space",Toast.LENGTH_SHORT).show()
                        value.remove(note.toString())
                    }
                }
            }
            // clear the input
            input.text.clear()
        }


        // press delete button
        deleteButton.setOnClickListener{
            // clear the list
            val resultTextView2: TextView = findViewById(R.id.textView2)
            resultTextView2.text = ""
            val resultTextView3: TextView = findViewById(R.id.textView3)
            resultTextView3.text = ""
            val resultTextView4: TextView = findViewById(R.id.textView4)
            resultTextView4.text = ""
            val resultTextView5: TextView = findViewById(R.id.textView5)
            resultTextView5.text = ""

            val note = input.text
            value.remove(note.toString())
            for (i in 0 until value.size) {
                when (i) {
                    0 -> {
                        val resultTextView: TextView = findViewById(R.id.textView2)
                        resultTextView.text = value[i]
                    }
                    1 -> {
                        val resultTextView: TextView = findViewById(R.id.textView3)
                        resultTextView.text = value[i]
                    }
                    2 -> {
                        val resultTextView: TextView = findViewById(R.id.textView4)
                        resultTextView.text = value[i]
                    }
                    3 -> {
                        val resultTextView: TextView = findViewById(R.id.textView5)
                        resultTextView.text = value[i]
                    }
                    else -> {
                        Toast.makeText(this,"There is no space",Toast.LENGTH_SHORT).show()
                    }
                }
            }
            // clear the input
            input.text.clear()
        }
    }
}