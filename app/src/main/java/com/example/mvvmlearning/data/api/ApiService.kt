package com.example.mvvmlearning.data.api

import com.example.mvvmlearning.data.model.User
import io.reactivex.Single

interface ApiService {
    fun getUsers(): Single<List<User>>
}