package com.codingwithjks.coroutineswithretrofit.ViewModel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.codingwithjks.coroutineswithretrofit.Model.Post
import com.codingwithjks.coroutineswithretrofit.Repository.PostRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Call
import retrofit2.Response

class PostViewModel(private val postRepository: PostRepository) : ViewModel() {
    val myResponse:MutableLiveData<List<Post>> = MutableLiveData()
    fun getPost()
    {
        viewModelScope.launch{
           try{
                   val response = postRepository.getPost()
                   myResponse.value = response

           }catch (e:Exception){
               Log.d("main", "getPost: ${e.message}")
           }
        }
    }
}