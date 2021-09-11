package com.example.testarch.di

import com.example.testarch.screen.main.home.HomeViewModel
import com.example.testarch.screen.main.my.MyViewModel
import com.example.testarch.util.provider.DefaultResourcesProvider
import com.example.testarch.util.provider.ResourcesProvider
import kotlinx.coroutines.Dispatchers
import org.koin.android.ext.koin.androidApplication
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    viewModel { HomeViewModel() }
    viewModel { MyViewModel() }

    single{provideGsonConvertFactory()}
    single{buildOkHttpClient()}

    single{provideRetrofit(get(),get())}

    single<ResourcesProvider>{DefaultResourcesProvider(androidApplication())}

    single{ Dispatchers.IO}
    single{ Dispatchers.Main}

}