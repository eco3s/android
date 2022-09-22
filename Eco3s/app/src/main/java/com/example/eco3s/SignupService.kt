package com.example.eco3s

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface SignupService {

    @Headers("Content-Type: application/json")
    @POST("login")
    fun addUserByEnqueue(@Body userInfo: SignupRequestBody): Call<SignupResponseBody>
}