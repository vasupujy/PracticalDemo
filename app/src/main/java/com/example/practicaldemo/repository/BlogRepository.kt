package com.example.practicaldemo.repository

import androidx.databinding.adapters.NumberPickerBindingAdapter.setValue
import androidx.lifecycle.MutableLiveData
import com.example.practicaldemo.rest.ApiInterface
import com.example.practicaldemo.rest.RestClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class BlogRepository {
    private val movies = ArrayList<Object>()
    private val mutableLiveData = MutableLiveData<List<Object>>()

    fun getMutableLiveData(): MutableLiveData<List<Object>> {
        val apiService = RestClient.getService()
        val call = apiService.callGetData("desc","activity","stackoverflow")
        call.enqueue(object : Callback<Object> {
            override fun onResponse(call: Call<Object>, response: Response<Object>) {
                val mBlogWrapper = response.body()
//                if (mBlogWrapper != null && mBlogWrapper!!.getBlog() != null) {
//                    movies = mBlogWrapper!!.getBlog() as ArrayList<Blog>
//                    mutableLiveData.setValue(movies)
//                }
            }

            override fun onFailure(call: Call<Object>, t: Throwable) {
                print(t.message)
            }
        })
        return mutableLiveData
    }
}