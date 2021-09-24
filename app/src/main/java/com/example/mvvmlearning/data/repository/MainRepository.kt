package com.example.mvvmlearning.data.repository

import com.example.mvvmlearning.data.api.ApiHelper
import com.example.mvvmlearning.data.model.User
import io.reactivex.Single

class MainRepository(private val apiHelper: ApiHelper) {
    fun getUsers(): Single<List<User>> {
        return apiHelper.getUsers()
    }
}