package com.example.daggerviewmodel.di

import androidx.lifecycle.ViewModel
import com.example.daggerviewmodel.MainViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun providesMainViewModel(mainViewModel: MainViewModel): ViewModel
}