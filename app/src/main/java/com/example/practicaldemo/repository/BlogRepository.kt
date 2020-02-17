package com.example.practicaldemo.repository

import androidx.databinding.adapters.NumberPickerBindingAdapter.setValue
import androidx.lifecycle.MutableLiveData
import com.example.practicaldemo.rest.ApiInterface
import com.example.practicaldemo.rest.RestClient
import com.example.practicaldemo.rest.response.Item
import com.example.practicaldemo.rest.response.MainResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class BlogRepository {
    private val movies = ArrayList<Object>()
    private val mutableLiveData = MutableLiveData<List<Item>>()

    fun getMutableLiveData(): MutableLiveData<List<Item>> {
        val apiService = RestClient.getService()
        val call = apiService.callGetData("desc","activity","stackoverflow")
        call.enqueue(object : Callback<MainResponse>{
            override fun onFailure(call: Call<MainResponse>, t: Throwable) {
            }

            override fun onResponse(call: Call<MainResponse>, response: Response<MainResponse>) {
                var mainResponse=response.body() as MainResponse
                mutableLiveData.value= mainResponse.items
            }

        })
        return mutableLiveData
    }
}