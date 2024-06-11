package com.example.reportmodule


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class VideoBasedLearningActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_based_learning)

        val button1 = findViewById<Button>(R.id.Button1)
        val button2 = findViewById<Button>(R.id.Button2)
        val button3 = findViewById<Button>(R.id.Button3)
        val button4 = findViewById<Button>(R.id.Button4)
        val button5 = findViewById<Button>(R.id.Button5)
        val button6 = findViewById<Button>(R.id.Button6)
        val button7 = findViewById<Button>(R.id.Button7)
        val button8 = findViewById<Button>(R.id.Button8)


        // Set click listeners for each button
        button1.setOnClickListener {
            // Handle click for button1
            Toast.makeText(this, "Abuse Video clicked", Toast.LENGTH_SHORT).show()
            // Add code to play physical abuse video
            val intent = Intent(this, Abuse::class.java)
            startActivity(intent)

        }

        button2.setOnClickListener {
            // Handle click for button1
            Toast.makeText(this, "Good Touch Video clicked", Toast.LENGTH_SHORT).show()
            // Add code to play physical abuse video
            val intent = Intent(this, GoodTouch::class.java)
            startActivity(intent)

        }

        button3.setOnClickListener {
            // Handle click for button2
            Toast.makeText(this, "Bad Touch Video clicked", Toast.LENGTH_SHORT).show()
            // Add code to play sexual abuse video
            val intent = Intent(this, BadTouch::class.java)
            startActivity(intent)
        }

        button4.setOnClickListener {
            // Handle click for button3
            Toast.makeText(this, "Physical Abuse Video clicked", Toast.LENGTH_SHORT).show()
            // Add code to play neglect abuse video
            val intent = Intent(this, PhysicalAbuse::class.java)
            startActivity(intent)
        }

        button5.setOnClickListener {
            // Handle click for button4
            Toast.makeText(this, "Sexual Abuse Video clicked", Toast.LENGTH_SHORT).show()
            // Add code to play financial abuse video
            val intent = Intent(this, SexualAbuse::class.java)
            startActivity(intent)
        }

        button6.setOnClickListener {
            // Handle click for button5
            Toast.makeText(this, "Neglect Abuse Video clicked", Toast.LENGTH_SHORT).show()
            // Add code to play emotional abuse video
            val intent = Intent(this, Neglect::class.java)
            startActivity(intent)
        }
        button7.setOnClickListener {
            // Handle click for button4
            Toast.makeText(this, "Financial Abuse Video clicked", Toast.LENGTH_SHORT).show()
            // Add code to play financial abuse video
            val intent = Intent(this, FinancialAbuse::class.java)
            startActivity(intent)
        }

        button8.setOnClickListener {
            // Handle click for button5
            Toast.makeText(this, "Emotional Abuse Video clicked", Toast.LENGTH_SHORT).show()
            // Add code to play emotional abuse video
            val intent = Intent(this, EmotionalAbuse::class.java)
            startActivity(intent)
        }
    }
    }
