package com.example.biggernumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity(){

    var points = 0
    var randomNum = Random.nextInt(10)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<EditText>(R.id.plain_text_input).setOnEditorActionListener{ v, actionID, event ->
            return@setOnEditorActionListener when(actionID){
                EditorInfo.IME_ACTION_SEND -> {
                    if (findViewById<EditText>(R.id.plain_text_input).text.toString().toInt() == randomNum){
                        findViewById<TextView>(R.id.textView4).text = "You win!"
                        randomNum = Random.nextInt(10)
                    }
                    else
                    {
                        findViewById<TextView>(R.id.textView4).text = "Sorry try again!"
                    }

                    true
                }
                else -> false
            }

        }
    }
    fun onClick(view:View){

    }



}
