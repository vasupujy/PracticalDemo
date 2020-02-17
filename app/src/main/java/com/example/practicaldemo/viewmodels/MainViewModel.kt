package com.example.practicaldemo.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.LiveData
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import com.example.practicaldemo.repository.BlogRepository
import com.example.practicaldemo.rest.response.Item


class MainViewModel : ViewModel{
    private var movieRepository: BlogRepository? = null

    constructor(){
        movieRepository= BlogRepository()

    }
    fun getAllBlog(): LiveData<List<Item>> {
        return movieRepository!!.getMutableLiveData()
    }

}