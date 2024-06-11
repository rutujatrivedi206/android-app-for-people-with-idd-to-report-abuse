package com.example.reportmodule

object Constants {
    val USER_NAME: String = "user_name"
    val TOTAL_QUESTIONS: String = "total_questions"
    val SCORE: String = "score"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val questionOne = Question(
            1,
            "What is IDD?",
            0,
            arrayListOf("Intellectual And development Disability", "International Dial Directly", "Interactive Digital Display", "Input Data Device"),
            0
        )
        questionsList.add(questionOne)

        // 2
        val questionTwo = Question(
            2,
            "If something doesn't feel right, what should you do?",
            0,
            arrayListOf("Keep it a secret", "Talk to someone you trust", "Ignore it", "Be quiet"),
            1
        )
        questionsList.add(questionTwo)

        // 3
        val questionThree = Question(
            3,
            "How can you speak up for yourself and say what you need?",
            0,
            arrayListOf("Be very quiet", "Say what you want and need", "Ignore everyone", " Let others decide for you"),
            1
        )
        questionsList.add(questionThree)

        // 4
        val questionFour = Question(
            4,
            "What are the different types of abuse?",
            0,
            arrayListOf("Physical Abuse", "Verbal Abuse", "Sexual Abuse", "All Of These"),
            3
        )
        questionsList.add(questionFour)

        // 5
        val questionFive = Question(
            5,
            "What is the type of Abuse shown in below image?",
            R.drawable.image,
            arrayListOf("Verbal Abuse", "Sexual Abuse", "Physical Abuse", "Financial Abuse"),
            2
        )
        questionsList.add(questionFive)

        // 6
        val questionSix = Question(
            6,
            "What is it in below image?",
            R.drawable.verbal,
            arrayListOf("Verbal Abuse", "Sexual Abuse", "Physical Abuse","Financial Abuse"),
            0
        )
        questionsList.add(questionSix)

        return questionsList
    }
}