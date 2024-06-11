package com.example.reportmodule

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val educationCard: CardView = findViewById(R.id.education)
        val reportCard: CardView = findViewById(R.id.report)

        educationCard.setOnClickListener {
            // Handle click on Education CardView
            val intent = Intent(this, homepage::class.java)
            startActivity(intent)
        }

        reportCard.setOnClickListener {
            // Handle click on Report CardView
            val intent = Intent(this, ReportActivity::class.java)
            startActivity(intent)
        }
    }
    }
