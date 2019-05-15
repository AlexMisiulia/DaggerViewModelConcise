package com.example.daggerviewmodel.di

object Injector {
    val appComponent by lazy { DaggerAppComponent.create() }
}