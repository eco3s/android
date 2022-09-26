package com.example.eco3s.data.sign

import com.google.gson.annotations.SerializedName

data class UserResponse(
    @SerializedName("id")
    val ObjectId: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("createdAt")
    val Date: Int
)
