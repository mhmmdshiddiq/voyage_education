package com.dicoding.voyageeducation.ui.hasil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dicoding.voyageeducation.R
import com.dicoding.voyageeducation.databinding.ActivityHasilBinding
import com.dicoding.voyageeducation.ui.main.MainActivity

class HasilAcivity : AppCompatActivity() {

    lateinit var binding: ActivityHasilBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHasilBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.title = getString(R.string.hasil)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        val score = intent.getIntExtra("SCORE", 0)
        binding.tvScore.text = "$score"

        // Mendapatkan skor kategori dari Intent
        val categoryScores =
            intent.getSerializableExtra("CATEGORY_SCORES") as? Map<String, Int> ?: emptyMap()
        val resultType = getResultType(categoryScores)
        binding.tvTypeQuiz.text = resultType
    }

    private fun getResultType(categoryScores: Map<String, Int>): String {
        // Menentukan kategori dengan jawaban benar paling banyak
        var maxType = ""
        var maxCount = 0

        for (entry in categoryScores.entries) {
            if (entry.value > maxCount) {
                maxType = entry.key
                maxCount = entry.value
            }
        }

        return maxType
    }

    override fun onSupportNavigateUp(): Boolean {
        val intent = Intent(this@HasilAcivity, MainActivity::class.java)
        startActivity(intent)
        return true
    }
}