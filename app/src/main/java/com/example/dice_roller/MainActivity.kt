package com.example.dice_roller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Button=findViewById<Button>(R.id.button2)
        val Dice=findViewById<ImageView>(R.id.imageView)
        Dice.setImageResource(R.drawable.dice_1)
        Button.setOnClickListener {
            var num= (1..6).random()
            when(num){
                1->Dice.setImageResource((R.drawable.dice_1))
                2->Dice.setImageResource((R.drawable.dice_2))
                3->Dice.setImageResource((R.drawable.dice_3))
                4->Dice.setImageResource((R.drawable.dice_4))
                5->Dice.setImageResource((R.drawable.dice_5))
                6->Dice.setImageResource((R.drawable.dice_6))
            }
        }
    }
}