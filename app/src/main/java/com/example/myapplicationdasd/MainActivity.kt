package com.example.myapplicationdasd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        val dice= Dice(6)
        val diceRoll=dice.roll()

        val rollResult: ImageView = findViewById(R.id.roll_result)
        when (diceRoll) {
            1 -> rollResult.setImageResource(R.drawable.dice_1)
            2 -> rollResult.setImageResource(R.drawable.dice_2)
            3 -> rollResult.setImageResource(R.drawable.dice_3)
            4 -> rollResult.setImageResource(R.drawable.dice_4)
            5 -> rollResult.setImageResource(R.drawable.dice_5)
            6 -> rollResult.setImageResource(R.drawable.dice_6)
        }
        var toast = Toast.makeText(applicationContext,"You got a ${diceRoll}",Toast.LENGTH_SHORT)
        toast.show()
    }

}

class Dice(private val numSides: Int){
    fun roll(): Int {
        return (1..numSides).random()
    }
}
