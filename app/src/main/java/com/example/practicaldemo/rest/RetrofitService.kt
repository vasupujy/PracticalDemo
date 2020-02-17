package com.example.practicaldemo.rest

import com.example.practicaldemo.utils.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitService {
    companion object{
        private val retrofit = Retrofit.Builder()
            .baseUrl("https://api.stackexchange.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()


        fun <S> cteateService(serviceClass: Class<S>): S {
            return retrofit.create(serviceClass)
        }
    }

}