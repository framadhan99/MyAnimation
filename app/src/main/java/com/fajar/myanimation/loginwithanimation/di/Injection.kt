package com.fajar.myanimation.loginwithanimation.di

import android.content.Context
import com.fajar.myanimation.loginwithanimation.data.UserRepository
import com.fajar.myanimation.loginwithanimation.data.pref.UserPreference
import com.fajar.myanimation.loginwithanimation.data.pref.dataStore

object Injection {
    fun provideRepository(context: Context): UserRepository {
        val pref = UserPreference.getInstance(context.dataStore)
        return UserRepository.getInstance(pref)
    }
}