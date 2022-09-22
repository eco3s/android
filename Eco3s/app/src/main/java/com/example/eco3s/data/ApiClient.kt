package com.example.eco3s.data

import com.example.eco3s.SignupService
import okhttp3.JavaNetCookieJar
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.net.CookieManager

object ApiClient {
    private var instance : Retrofit?= null
    private val BASE_URL = ""

    val okHttpClient = OkHttpClient.Builder()
        .cookieJar(JavaNetCookieJar(CookieManager()))
        .build()

    fun getInstance() : Retrofit{
        if (instance == null){
            instance = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }

        return instance!!
    }

    val signService = instance?.create(SignupService::class.java)

}