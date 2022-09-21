package com.example.eco3s

import com.google.gson.annotations.SerializedName

data class SignupResponseBody(
    @SerializedName("errorCode")
    val errorCode: Int,
    @SerializedName("message")
    val message: String?,
    @SerializedName("additionalData")
    val additionalData: ResultResponse
)