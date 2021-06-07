package com.irfanshukri203.checkboxandradiobuttontutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOrder.setOnClickListener {
            val checkedMeatRadioButtonId = rgMeat.checkedRadioButtonId
            val meet = findViewById<RadioButton>(checkedMeatRadioButtonId)
            val cheese = cbCheese.isChecked
            val onions = cbOnion.isChecked
            val salad = cbSalad.isChecked
            val orderString = "You've ordered burger with:\n" +
                    "${meet.text}" +
                    (if(cheese) "\nCheese" else "") +
                    (if(onions) "\nOnions" else "") +
                    (if(salad) "\nSalad" else "")

            tvOrder.text = orderString.toString()
        }
    }
}