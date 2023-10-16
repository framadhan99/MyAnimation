package com.fajar.myanimation.loginwithanimation.data.pref

data class UserModel(
    val email: String,
    val token: String,
    val isLogin: Boolean = false
)