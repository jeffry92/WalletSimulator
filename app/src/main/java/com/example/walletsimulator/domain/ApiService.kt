package com.example.walletsimulator.domain

import com.example.walletsimulator.data.model.User
import com.example.walletsimulator.rest.Constants.GET_USERS
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET(GET_USERS)
    suspend fun getUser(@Path("name") name: String): User
}