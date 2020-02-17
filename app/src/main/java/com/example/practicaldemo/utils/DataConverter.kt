package com.example.practicaldemo.utils

import androidx.room.TypeConverter
import com.example.practicaldemo.rest.response.Item
import com.google.gson.reflect.TypeToken
import com.google.gson.Gson



class DataConverter {
    @TypeConverter
    fun fromCountryLangList(countryLang: List<Item>?): String? {
        if (countryLang == null) {
            return null
        }
        val gson = Gson()
        val type = object : TypeToken<List<Item>>() {

        }.type
        return gson.toJson(countryLang, type)
    }

    @TypeConverter
    fun toCountryLangList(countryLangString: String?): List<Item>? {
        if (countryLangString == null) {
            return null
        }
        val gson = Gson()
        val type = object : TypeToken<List<Item>>() {

        }.type
        return gson.fromJson<List<Item>>(countryLangString, type)
    }
}