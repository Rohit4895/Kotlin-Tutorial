package com.example.kotlintutorials.utils

import android.content.Context

class DataBaseClient{
    private var context : Context? = null
    companion object{
        private var dataBaseClientInstance : DataBaseClient? = null
    }
    private var mainDatabase : MainDatabase? = null


    fun getMainDatabase() : MainDatabase{
        return mainDatabase!!
    }
}