package com.example.practicaldemo.rest

import com.example.practicaldemo.utils.Constants
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.net.HttpURLConnection
import java.util.concurrent.TimeUnit


/**
 * Class is used for to set connection for retrofit
 * Manage Network chaining and interceptor in this class
 * Ok Http is used for connection timeout
 */
class RestClient {

    companion object {
        //default time 20 seconds
        private val TIME = 20
        private val TAG = RestClient::class.java.simpleName


        private val logging = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
        private var restService: ApiInterface? = null
        var retrofit: Retrofit? = null
        fun getService(): ApiInterface {
            if (restService == null) {
                retrofit = Retrofit.Builder().baseUrl(Constants.BASE_URL)
                        /*.addCallAdapterFactory(RxJavaCallAdapterFactory.create())*/
                        .addConverterFactory(GsonConverterFactory.create())
                        .client(httpClient)
                        .build()
                restService = retrofit!!.create(ApiInterface::class.java)

            }
            return restService!!
        }

        /*
         * adding okhttp client for webservice call builder
         */
        private val httpClient = OkHttpClient().newBuilder()
                .addInterceptor(logging)
                .build()

        fun retrofit(): Retrofit {
            return retrofit!!
        }
    }


}