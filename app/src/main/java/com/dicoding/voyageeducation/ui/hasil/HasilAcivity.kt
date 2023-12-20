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

        val categoryScores =
            intent.getSerializableExtra("CATEGORY_SCORES") as? Map<String, Int> ?: emptyMap()
        val resultType = getResultType(categoryScores)
        binding.tvTypeQuiz.text = resultType

        val professions = getProfessions(resultType)
        binding.tvProfesi1.text = professions.first
        binding.tvProfesi2.text = professions.second
        binding.tvProfesi3.text = professions.third
    }

    private fun getResultType(categoryScores: Map<String, Int>): String {
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

    private fun getProfessions(resultType: String): Triple<String, String, String> {
        return when (resultType) {
            "Spasial" -> Triple("Architect", "Desainer", "Aerospace")
            "Linguistik" -> Triple("Journalist", "Writer", "Law")
            "Logis" -> Triple("Data Scientist", "Programmer", "Engineering")
            "Kinestetik" -> Triple("Athlete", "Therapist", "Surgeon")
            "Musik" -> Triple("Musician","Composer","Singer")
            "Intrapersonal" -> Triple("Teacher","Counselor","Lecturers")
            "Naturalistik" -> Triple("Life Coach","Psychologist","Consultant")
            else -> Triple("Profession not specified", "Profession not specified", "Profession not specified")
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        navigateToMainActivity()
    }

    private fun navigateToMainActivity() {
        val intent = Intent(this@HasilAcivity, MainActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
        startActivity(intent)
        finish()
    }

    override fun onSupportNavigateUp(): Boolean {
        val intent = Intent(this@HasilAcivity, MainActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
        startActivity(intent)
        return true
    }
}