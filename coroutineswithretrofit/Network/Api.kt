package com.codingwithjks.coroutineswithretrofit.Network


import com.codingwithjks.coroutineswithretrofit.Model.Post
import retrofit2.Call
import retrofit2.http.GET

interface Api
{
    @GET("posts")
    suspend fun getAllPost(): List<Post>
}