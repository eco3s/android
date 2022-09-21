package com.example.eco3s

import com.google.gson.annotations.SerializedName

data class ResultResponse(
    @SerializedName("key")
    val key: String?,
    @SerializedName("user")
    val user: UserResponse
)
