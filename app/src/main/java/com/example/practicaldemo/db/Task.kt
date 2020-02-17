package com.example.practicaldemo.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import java.io.Serializable
import androidx.room.PrimaryKey
import com.example.practicaldemo.utils.DataConverter
import androidx.room.TypeConverters
import com.example.practicaldemo.rest.response.Item

@Entity
class Task : Serializable{
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0


    @ColumnInfo(name = "first_name")
    var first_name=""

    @TypeConverters(DataConverter::class)
    @ColumnInfo(name = "option_values")
    var optionValues: List<Item> = ArrayList()

//    constructor(itemList:List<Item>){
//        this.optionValues=itemList
//    }
}