package com.example.practicaldemo.utils

import androidx.room.TypeConverter
import com.google.gson.reflect.TypeToken
import com.google.gson.Gson



class DataConverter {
    @TypeConverter
    fun fromCountryLangList(countryLang: List<Object>?): String? {
        if (countryLang == null) {
            return null
        }
        val gson = Gson()
        val type = object : TypeToken<List<Object>>() {

        }.type
        return gson.toJson(countryLang, type)
    }

    @TypeConverter
    fun toCountryLangList(countryLangString: String?): List<Object>? {
        if (countryLangString == null) {
            return null
        }
        val gson = Gson()
        val type = object : TypeToken<List<Object>>() {

        }.type
        return gson.fromJson<List<Object>>(countryLangString, type)
    }
}