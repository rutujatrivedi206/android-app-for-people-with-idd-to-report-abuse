package com.example.reportmodule

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class StaticLearningActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_static_learning)
        val physicalbutton = findViewById<Button>(R.id.physicalButton)
        val sexualbutton = findViewById<Button>(R.id.sexualButton)
        val verbalbutton = findViewById<Button>(R.id.verbalButton)

        physicalbutton.setOnClickListener {
            // Handle click on Static Learning CardView
            startActivity(Intent(this, physical::class.java))
        }
        sexualbutton.setOnClickListener {
            // Handle click on Static Learning CardView
            startActivity(Intent(this, sexual::class.java))
        }
        verbalbutton.setOnClickListener {
            // Handle click on Static Learning CardView
            startActivity(Intent(this, verbal::class.java))
        }
    }

}