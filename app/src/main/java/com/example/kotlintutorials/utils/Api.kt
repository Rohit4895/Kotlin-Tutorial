package com.example.kotlintutorials.utils

import com.example.kotlintutorials.reository.remote.services.ApiInterface
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Api {
    companion object{
     private var retrofit : Retrofit? = null

        fun getClient() : ApiInterface{
            if (retrofit == null){
                retrofit = Retrofit.Builder()
                        .baseUrl("https://api.github.com")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
            }

            return retrofit?.create(ApiInterface::class.java)!!
        }
    }

}