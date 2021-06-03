package com.codingwithjks.coroutineswithretrofit.Repository

import com.codingwithjks.coroutineswithretrofit.Model.Post
import com.codingwithjks.coroutineswithretrofit.Network.RetrofitBuilder
import retrofit2.Call
import retrofit2.Response

class PostRepository {

    suspend fun getPost(): List<Post> = RetrofitBuilder.api.getAllPost()

}