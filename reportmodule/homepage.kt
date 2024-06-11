package com.example.reportmodule

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class homepage : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)
        val staticlearningcard: CardView = findViewById(R.id.static_learning)
        val skiledbasedlearningcard: CardView = findViewById(R.id.skilled_base)
        val videobasedlearningcard: CardView = findViewById(R.id.video_base)
        val quizcard: CardView = findViewById(R.id.quiz)

        // Set click listeners for each CardView
        staticlearningcard.setOnClickListener {
            // Handle click on Static Learning CardView
            startActivity(Intent(this, StaticLearningActivity::class.java))
        }

        skiledbasedlearningcard.setOnClickListener {
            // Handle click on Skilled Based Learning CardView
            startActivity(Intent(this, SkilledBasedLearningActivity::class.java))
        }

        videobasedlearningcard.setOnClickListener {
            // Handle click on Video Based Learning CardView
            startActivity(Intent(this, VideoBasedLearningActivity::class.java))
        }

        quizcard.setOnClickListener {
            // Handle click on Quiz CardView
            startActivity(Intent(this, QuizActivity::class.java))
        }
    }
}