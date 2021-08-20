package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice()
        }
        rollDice()
    }

    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice() {
        // Create new Dice object with 6 sides and roll it
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val diceRoll2 = dice.roll2()
        // Update the screen with the dice roll
        val diceImage: ImageView = findViewById(R.id.imageView)
        val diceImage2:ImageView = findViewById(R.id.imageView2)
        when (diceRoll) {
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource((R.drawable.dice_2))
            3 -> diceImage.setImageResource((R.drawable.dice_3))
            4 -> diceImage.setImageResource((R.drawable.dice_4))
            5 -> diceImage.setImageResource((R.drawable.dice_5))
            6 -> diceImage.setImageResource((R.drawable.dice_6))
        }
        when (diceRoll2) {
            1 -> diceImage2.setImageResource(R.drawable.dice_1)
            2 -> diceImage2.setImageResource((R.drawable.dice_2))
            3 -> diceImage2.setImageResource((R.drawable.dice_3))
            4 -> diceImage2.setImageResource((R.drawable.dice_4))
            5 -> diceImage2.setImageResource((R.drawable.dice_5))
            6 -> diceImage2.setImageResource((R.drawable.dice_6))
        }
    }
}

class Dice(private val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
    fun roll2(): Int{
        return (1..numSides).random()
    }
}