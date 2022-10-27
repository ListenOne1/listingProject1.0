package com.example.listingproject1

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.Paint
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // linked list variable
        val value = LinkedList<String>()
        // input value
        val input = findViewById<EditText>(R.id.TextInputEditText)
        // display value
        val resultTextView2: TextView = findViewById(R.id.textView2)
        val resultTextView3: TextView = findViewById(R.id.textView3)
        val resultTextView4: TextView = findViewById(R.id.textView4)
        val resultTextView5: TextView = findViewById(R.id.textView5)
        // find the button
        val inputButton: Button = findViewById(R.id.button)
        val deleteButton: Button = findViewById(R.id.button2)
//        val completeButton: Button = findViewById(R.id.button3)
        // find check box
        val checkBox1: CheckBox = findViewById(R.id.checkBox)
        val checkBox2: CheckBox = findViewById(R.id.checkBox2)
        val checkBox3: CheckBox = findViewById(R.id.checkBox3)
        val checkBox4: CheckBox = findViewById(R.id.checkBox4)
        // find delete image button
        val imageButton1: ImageButton = findViewById(R.id.imageButton)
        val imageButton2: ImageButton = findViewById(R.id.imageButton2)
        val imageButton3: ImageButton = findViewById(R.id.imageButton3)
        val imageButton4: ImageButton = findViewById(R.id.imageButton4)

        //press the input
        inputButton.setOnClickListener {
            // get the input
            val note = input.text
            // add to the list
            value.addLast(note.toString())
//            val resultTextView: TextView = findViewById(R.id.textView2)
//            resultTextView.text = value.toString()
            displayFun(value, resultTextView2, resultTextView3, resultTextView4, resultTextView5)

            // clear the input
            input.text.clear()
        }


        // press delete button
        deleteButton.setOnClickListener {
            // clear the list
            displayClear(resultTextView2, resultTextView3, resultTextView4, resultTextView5)

            val note = input.text
            value.remove(note.toString())
            displayFun(value, resultTextView2, resultTextView3, resultTextView4, resultTextView5)

            // clear the input
            input.text.clear()
        }

        // press one of the check box
        checkBox1.setOnClickListener {
            val check: Boolean = checkBox1.isChecked
            if (check) {
                resultTextView2.setTextColor(Color.GRAY)
                resultTextView2.paint.flags = Paint.STRIKE_THRU_TEXT_FLAG
            } else {
                resultTextView2.setTextColor(Color.BLACK)
                resultTextView2.paint.flags = Paint.STRIKE_THRU_TEXT_FLAG.inv()
            }
        }
        checkBox2.setOnClickListener {
            val check: Boolean = checkBox2.isChecked
            if (check) {
                resultTextView3.setTextColor(Color.GRAY)
                resultTextView3.paint.flags = Paint.STRIKE_THRU_TEXT_FLAG
            } else {
                resultTextView3.setTextColor(Color.BLACK)
                resultTextView3.paint.flags = Paint.STRIKE_THRU_TEXT_FLAG.inv()
            }
        }
        checkBox3.setOnClickListener {
            val check: Boolean = checkBox3.isChecked
            if (check) {
                resultTextView4.setTextColor(Color.GRAY)
                resultTextView4.paint.flags = Paint.STRIKE_THRU_TEXT_FLAG
            } else {
                resultTextView4.setTextColor(Color.BLACK)
                resultTextView4.paint.flags = Paint.STRIKE_THRU_TEXT_FLAG.inv()
            }
        }
        checkBox4.setOnClickListener {
            val check: Boolean = checkBox4.isChecked
            if (check) {
                resultTextView5.setTextColor(Color.GRAY)
                resultTextView5.paint.flags = Paint.STRIKE_THRU_TEXT_FLAG
            } else {
                resultTextView5.setTextColor(Color.BLACK)
                resultTextView5.paint.flags = Paint.STRIKE_THRU_TEXT_FLAG.inv()
            }
        }

        // delete function
        imageButton1.setOnClickListener {
            Toast.makeText(this, "click button", Toast.LENGTH_SHORT).show()
            if (value.size > 0){
                value.removeAt(0)
            }
            displayClear(resultTextView2, resultTextView3, resultTextView4, resultTextView5)
            displayFun(value, resultTextView2, resultTextView3, resultTextView4, resultTextView5)
        }
        imageButton2.setOnClickListener {
            Toast.makeText(this, "click button", Toast.LENGTH_SHORT).show()
            if (value.size > 1) {
                value.removeAt(1)
                displayClear(resultTextView2, resultTextView3, resultTextView4, resultTextView5)
                displayFun(value, resultTextView2, resultTextView3, resultTextView4, resultTextView5
                )
            }
        }
        imageButton3.setOnClickListener {
            Toast.makeText(this, "click button", Toast.LENGTH_SHORT).show()
            if (value.size > 2) {
                value.removeAt(2)
                displayClear(resultTextView2, resultTextView3, resultTextView4, resultTextView5)
                displayFun(value, resultTextView2, resultTextView3, resultTextView4, resultTextView5
                )
            }
        }
        imageButton4.setOnClickListener {
            Toast.makeText(this, "click button", Toast.LENGTH_SHORT).show()
            if (value.size > 2) {
                value.removeAt(3)
                displayClear(resultTextView2, resultTextView3, resultTextView4, resultTextView5)
                displayFun(value, resultTextView2, resultTextView3, resultTextView4, resultTextView5
                )
            }
        }
    }
    //abstract class checkBoxPress(private var idName: String){
//    val resultTextView: TextView = findViewById("R.id.$idName")
//    resultTextView.text = value[i]
//    .setTextColor(Color.RED)
//}
    fun displayFun(
        value: LinkedList<String>,
        resultTextView2: TextView,
        resultTextView3: TextView,
        resultTextView4: TextView,
        resultTextView5: TextView
    ) {
        for (i in 0 until value.size) {
            when (i) {
                0 -> {
                    // stored first value in first textview
                    resultTextView2.text = value[i]
                }
                1 -> {
                    // stored second value in second textview
                    resultTextView3.text = value[i]
                }
                2 -> {
                    resultTextView4.text = value[i]
                }
                3 -> {
                    resultTextView5.text = value[i]
                }
                else -> {
                    Toast.makeText(this, "There is no space", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}

fun displayClear(
    resultTextView2: TextView,
    resultTextView3: TextView,
    resultTextView4: TextView,
    resultTextView5: TextView
) {
    resultTextView2.text = ""
    resultTextView3.text = ""
    resultTextView4.text = ""
    resultTextView5.text = ""
}