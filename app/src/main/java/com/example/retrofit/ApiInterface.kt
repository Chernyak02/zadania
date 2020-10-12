package com.example.retrofit

import com.example.retrofit.Models.Example
import com.example.retrofit.Models.ViewModel
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiInterface {
    @GET("top-headlines?country=us&category=business&apiKey=8568c9b49aea4bce9e74b754d4493957")
    fun getFile(): Call<ViewModel>

    @POST("/posts")
    @FormUrlEncoded
    fun getPost(
        @Field("title") title: String,
        @Field("body") body: String,
        @Field("userId") userId: Int
    ): Call<Example>
}