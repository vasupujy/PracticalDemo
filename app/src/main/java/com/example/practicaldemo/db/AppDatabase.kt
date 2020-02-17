package com.example.practicaldemo.db

import androidx.room.RoomDatabase
import androidx.room.Database
import com.example.practicaldemo.db.dao.TaskDao


@Database(entities = [Task::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun taskDao(): TaskDao
}