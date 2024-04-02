package com.example.walletsimulator.data.model

import com.google.gson.annotations.SerializedName

data class User (
    @SerializedName("name") val name: String,
    @SerializedName("amount") val amount: Int,
    @SerializedName("card_number") val cardNumber: String,
)