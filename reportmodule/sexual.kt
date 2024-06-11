package com.example.reportmodule

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class sexual : AppCompatActivity() {
    private lateinit var imageView: ImageView
    private lateinit var imageNameTextView: TextView
    private lateinit var backwardButton: Button
    private lateinit var forwardButton: Button
    private val imageIds = arrayOf(
        R.drawable.image11,
        R.drawable.image12,
        R.drawable.image13
        // Add more image resource IDs as needed
    )
    private val imageNames = arrayOf(
        "Taking picture of private body parts",
        "Forcefully Touching",
        "forces to kiss"
        // Add more image names as needed
    )
    private var currentIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sexual)

        imageView = findViewById(R.id.imageView)
        imageNameTextView = findViewById(R.id.imageName)
        backwardButton = findViewById(R.id.backwardButton)
        forwardButton = findViewById(R.id.forwardButton)

        backwardButton.setOnClickListener {
            showImage(currentIndex - 1)
        }

        forwardButton.setOnClickListener {
            showImage(currentIndex + 1)
        }

        showImage(currentIndex)
    }

    private fun showImage(index: Int) {
        if (index < 0 || index >= imageIds.size)
            return

        imageView.setImageResource(imageIds[index])
        imageNameTextView.text = imageNames[index]
        currentIndex = index

        // Hide backward button if it's the first image
        if (index == 0) {
            backwardButton.visibility = Button.GONE
            forwardButton.visibility = Button.VISIBLE // Always show forward button for non-last images
        }
        // Hide forward button if it's the last image
        else if (index == imageIds.size - 1) {
            backwardButton.visibility = Button.VISIBLE // Always show backward button for non-first images
            forwardButton.visibility = Button.GONE
        }
        // Show both buttons for images in between
        else {
            backwardButton.visibility = Button.VISIBLE
            forwardButton.visibility = Button.VISIBLE
        }
    }

}
