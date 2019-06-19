package com.example.kotlintutorials.reository.remote.services

import com.example.kotlintutorials.reository.remote.pojo.Users
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("/users")
    fun getAllUsers() : Call<List<Users>>
}