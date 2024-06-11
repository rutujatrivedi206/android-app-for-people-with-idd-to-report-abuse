package com.example.reportmodule


import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class SkilledBasedLearningActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skilled_based_learning)
        val paintingcard: CardView = findViewById(R.id.painting)
        val diyacard: CardView = findViewById(R.id.diyamaking)
        val candlecard: CardView = findViewById(R.id.candlemaking)
        val drawingcard: CardView = findViewById(R.id.drawing)
        val cookingcard:CardView=findViewById(R.id.cooking)
        val gamescard:CardView=findViewById(R.id.games)

        // Set click listeners for each CardView
        paintingcard.setOnClickListener {
            // Handle click on Static Learning CardView
            startActivity(Intent(this, painting::class.java))
        }

        diyacard.setOnClickListener {
            // Handle click on Skilled Based Learning CardView
            startActivity(Intent(this, diyamaking::class.java))
        }

        candlecard.setOnClickListener {
            // Handle click on Video Based Learning CardView
            startActivity(Intent(this, candlemaking::class.java))
        }

        drawingcard.setOnClickListener {
            // Handle click on Quiz CardView
            startActivity(Intent(this, drawing::class.java))
        }
        cookingcard.setOnClickListener {
            // Handle click on Quiz CardView
            startActivity(Intent(this, cooking::class.java))
        }
        gamescard.setOnClickListener {
            // Handle click on Quiz CardView
            startActivity(Intent(this, games::class.java))
        }
    }
}