package com.example.kotlintutorials.utils

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.example.kotlintutorials.reository.local.dao.UsersDBDao
import com.example.kotlintutorials.reository.local.model.UsersDB

@Database(entities = arrayOf(UsersDB::class), version = 1)
abstract class MainDatabase : RoomDatabase() {
    abstract fun usersDBDao() : UsersDBDao
}