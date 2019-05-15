package com.example.daggerviewmodel.di

import com.example.daggerviewmodel.MainActivity
import dagger.Component
import javax.inject.Singleton

@Component(modules = [ViewModelModule::class])
@Singleton
interface AppComponent {
    fun inject(mainActivity: MainActivity)
}