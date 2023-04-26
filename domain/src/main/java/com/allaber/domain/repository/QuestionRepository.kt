package com.allaber.domain.repository

import com.allaber.domain.model.Question

interface QuestionRepository {
    fun getQuestionList(): List<Question>
}