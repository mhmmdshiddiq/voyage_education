package com.dicoding.voyageeducation.ui.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import com.dicoding.voyageeducation.R
import com.dicoding.voyageeducation.data.FakeData
import com.dicoding.voyageeducation.databinding.ActivityQuizBinding
import com.dicoding.voyageeducation.ui.hasil.HasilAcivity
import java.io.Serializable

class QuizActivity : AppCompatActivity() {

    private lateinit var binding: ActivityQuizBinding
    private var currentQuizIndex = 0
    private var score = 0
    private var categoryScores = mutableMapOf<String, Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.title = getString(R.string.title_quiz)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        binding.submitButton.setOnClickListener {
            checkAnswer()
        }

        displayCurrentQuiz()
    }

    private fun displayCurrentQuiz() {
        if (currentQuizIndex < FakeData.quizList.size) {
            val currentQuiz = FakeData.quizList[currentQuizIndex]

            binding.tvNumber.text = currentQuiz.id.toString()
            binding.tvJenisPertanyaan.text = currentQuiz.typeQuestion
            binding.questionTextView.text = currentQuiz.question
            binding.option1RadioButton.text = currentQuiz.options[0]
            binding.option2RadioButton.text = currentQuiz.options[1]
            binding.option3RadioButton.text = currentQuiz.options[2]
            binding.option4RadioButton.text = currentQuiz.options[3]

            // Clear radio group selection
            binding.optionsRadioGroup.clearCheck()
        } else {
            // All quizzes have been answered
            showResult()
        }
    }

    private fun checkAnswer() {
        val selectedOptionId = binding.optionsRadioGroup.checkedRadioButtonId

        if (selectedOptionId != -1) {
            val selectedOption = findViewById<RadioButton>(selectedOptionId).text.toString()
            val currentQuiz = FakeData.quizList[currentQuizIndex]

            if (selectedOption == currentQuiz.correctOption) {
                // Correct answer
                score++

                val categoryScore = categoryScores[currentQuiz.typeQuestion] ?: 0
                categoryScores[currentQuiz.typeQuestion] = categoryScore + 1
            }

            currentQuizIndex++
            displayCurrentQuiz()
        } else {
            // No option selected
            Toast.makeText(this, "Pilih jawaban terlebih dahulu", Toast.LENGTH_SHORT).show()
        }
    }

    private fun showResult() {
        Toast.makeText(this, "Skor Anda: $score", Toast.LENGTH_SHORT).show()
        val intent = Intent(this@QuizActivity, HasilAcivity::class.java)
        intent.putExtra("SCORE", score)
        intent.putExtra("CATEGORY_SCORES", categoryScores as Serializable)
        startActivity(intent)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}