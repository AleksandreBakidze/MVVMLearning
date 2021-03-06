package com.example.mvvmlearning.data.model


import com.google.gson.annotations.SerializedName

data class UserItem(
    @SerializedName("avatar")
    val avatar: String,
    @SerializedName("email")
    val email: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String
)