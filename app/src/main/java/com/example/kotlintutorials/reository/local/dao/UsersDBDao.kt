package com.example.kotlintutorials.reository.local.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query
import com.example.kotlintutorials.reository.local.model.UsersDB

@Dao
interface UsersDBDao {
    @Query("select * from UsersDB")
    fun getAllUsersFromDB() : UsersDB
}