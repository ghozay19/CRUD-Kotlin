package com.example.ghozy.crud_kotlin.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiClient {

    companion object {
        fun getApiClient(): Retrofit {
            val BASE_URL: String? = "http://gojaydroid.000webhostapp.com/"
            val retrofit: Retrofit = Retrofit.Builder().baseUrl(BASE_URL).
                    addConverterFactory(GsonConverterFactory.create())
                    .build()

            return retrofit
        }
    }
}