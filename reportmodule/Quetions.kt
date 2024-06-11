package com.example.reportmodule


data class Question(
    val id: Int,
    val questionText: String,
    val image: Int=0,
    val alternatives: ArrayList<String>,
    val correctAnswerIndex: Int,
)
