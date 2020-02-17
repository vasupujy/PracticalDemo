package com.example.practicaldemo.rest

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface ApiInterface {
    //?order=desc&sort=activity&site=stackoverflow
    @GET("2.2/posts")
     fun callGetData(
        @Query("order") header: String, @Query("sort") path: String, @Query(
            "site"
        ) page: String
    ): Call<Object>

}