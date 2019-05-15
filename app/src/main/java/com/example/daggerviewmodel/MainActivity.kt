package com.example.daggerviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders
import com.example.daggerviewmodel.di.Injector
import com.example.daggerviewmodel.di.ViewModelFactory
import javax.inject.Inject

private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {

    @Inject lateinit var viewModeFactory: ViewModelFactory<MainViewModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Injector.appComponent.inject(this)

        val viewModel = ViewModelProviders.of(this, viewModeFactory).get(MainViewModel::class.java)

        Log.d(TAG, "created ViewModel#${viewModel.hashCode()}")
    }
}

class MainViewModel @Inject constructor(): ViewModel()
