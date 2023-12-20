package com.dicoding.voyageeducation.ui.prequiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.dicoding.voyageeducation.R
import com.dicoding.voyageeducation.ui.quiz.QuizActivity

class PrequizActivity : AppCompatActivity(),View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prequiz)

        supportActionBar!!.title = getString(R.string.title_prequiz)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        val quizActivity: Button = findViewById(R.id.btn_start_quiz)
        quizActivity.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_start_quiz -> {
                val moveIntent = Intent(this@PrequizActivity, QuizActivity::class.java)
                moveIntent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
                startActivity(moveIntent)
                finish()
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}