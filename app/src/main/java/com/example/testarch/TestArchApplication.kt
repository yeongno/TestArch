package com.example.testarch

import android.app.Application
import android.content.Context
import com.example.testarch.di.appModule
import org.koin.core.context.startKoin

class TestArchApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        appContext = this

        startKoin {
            modules(appModule)
        }

    }

    override fun onTerminate() {
        super.onTerminate()
        appContext = null
    }

    companion object {
        var appContext: Context? = null
        private set
    }
}