package com.example.daggerviewmodel.di

import com.example.daggerviewmodel.MainActivity
import dagger.Component
import javax.inject.Singleton

@Component
@Singleton
interface AppComponent {
    fun inject(mainActivity: MainActivity)
}