package com.codingwithjks.coroutineswithretrofit.Network


import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
//Retrofit Instence
class RetrofitBuilder {
    companion object{
        private val retrofit:Retrofit by lazy {
            Retrofit.Builder()
                .baseUrl(Url.url)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }

        val api:Api by lazy {
            retrofit.create(Api::class.java)
        }
    }
}