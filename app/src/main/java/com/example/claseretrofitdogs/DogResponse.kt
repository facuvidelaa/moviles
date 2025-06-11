package com.example.claseretrofitdogs

import com.google.gson.annotations.SerializedName

data class DogResponse(
    @SerializedName("message") var images: List<String>,
    val status: String,
)