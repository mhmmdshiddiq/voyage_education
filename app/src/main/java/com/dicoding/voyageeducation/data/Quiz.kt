package com.dicoding.voyageeducation.data

data class Quiz(
    val id: Int,
    val typeQuestion: String,
    val profesi: List<String>,
    val question: String,
    val options: List<String>,
    val correctOption: String
)
