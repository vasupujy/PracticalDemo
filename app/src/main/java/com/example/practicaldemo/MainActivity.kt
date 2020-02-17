package com.example.practicaldemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.room.Room
import com.example.practicaldemo.databinding.ActivityMainBinding
import com.example.practicaldemo.db.AppDatabase
import com.example.practicaldemo.db.Task
import com.example.practicaldemo.rest.response.Item
import com.example.practicaldemo.viewmodels.MainViewModel

/*
 *18 February 2020 2:20 PM
 * Created By Vasupujy Patel
 */


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        viewModel = ViewModelProvider.AndroidViewModelFactory.getInstance(application)
            .create(MainViewModel::class.java)
        val db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "database-name"
        ).allowMainThreadQueries()
            .build()
        viewModel.getAllBlog().observe(this, Observer {
            var list = it
            val productionList=ArrayList<Item>()
            val  productList=Task()
            productList.first_name="asasd"
            productionList.addAll(it)
            productList.optionValues=productionList
            db.taskDao().insert(productList)
            db.taskDao().all
            print(list)
        })



    }
}
