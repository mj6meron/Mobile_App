package com.example.ageinminutes

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*


class MainActivity : AppCompatActivity() {
    var x:String = ""
    // FINDING COMPONENTS
    val myCalendar = Calendar.getInstance()
    val year = myCalendar.get(Calendar.YEAR)
    val month = myCalendar.get(Calendar.MONTH)
    val day = myCalendar.get(Calendar.DAY_OF_MONTH)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var selectButton = findViewById<Button>(R.id.selectButton)
        var selectedDate = findViewById<TextView>(R.id.selectedDate)
        var ageInMinutes = findViewById<TextView>(R.id.ageInMinutes)
        selectButton.setOnClickListener {view->
            clickDatePicker(view, selectedDate)

        }
        

    }

    // This function implements the creation and selection of date
    fun clickDatePicker(view : View, selectedDateTextView: TextView){

        DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, selectedYear, selectedMonth, selectedDay ->

            // Setting the selected date text
            selectedDateTextView.text = "Chosen year is -> $selectedYear/${selectedMonth+1}/$selectedDay"

            // Just Doing some simple Date Format
            val sdf = SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH)
            val theDate = sdf.parse("$selectedDay/${selectedMonth+1}/$selectedYear")

            // You can do the actual calculation here ---- Boring stuff really but go ahead


        }, year, month, day).show()
    }



}

