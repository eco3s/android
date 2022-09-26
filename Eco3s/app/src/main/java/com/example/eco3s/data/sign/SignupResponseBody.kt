package com.example.eco3s.data.sign

import com.example.eco3s.data.sign.ResultResponse
import com.google.gson.annotations.SerializedName

data class SignupResponseBody(
    @SerializedName("errorCode")
    val errorCode: Int,
    @SerializedName("message")
    val message: String?,
    @SerializedName("additionalData")
    val additionalData: ResultResponse
)