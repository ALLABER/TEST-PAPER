package com.allaber.domain.repository

import com.allaber.domain.model.User

interface UserRepository {
    fun getUser(): User
}