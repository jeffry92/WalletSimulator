package com.example.walletsimulator.data

import com.example.walletsimulator.data.model.User
import com.example.walletsimulator.domain.ApiService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class UserRepository @Inject constructor(private val apiService: ApiService) {

    suspend fun getUser(name: String): User {
        return withContext(Dispatchers.IO) {
            val userResponse = apiService.getUser(name)
            User(userResponse.name, userResponse.amount, userResponse.cardNumber)
        }
    }
}