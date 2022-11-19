package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // get reference to button
        val buttonClickMe = findViewById(R.id.button) as Button
        var myTextView = findViewById(R.id.textView) as TextView
        var timeClicked = 0
// set on-click listener
        buttonClickMe.setOnClickListener {
            timeClicked-=1
            myTextView.text = timeClicked.toString()
            // Toast.makeText(this@MainActivity, " it's running =) ", Toast.LENGTH_SHORT).show()
        }
    }
}