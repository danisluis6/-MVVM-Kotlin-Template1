package com.vogo.superbrain

import android.app.Application
import com.vogo.superbrain.frameworks.di.module.appModule
import com.vogo.superbrain.frameworks.di.module.engineModule
import com.vogo.superbrain.frameworks.di.module.networkModule
import com.vogo.superbrain.frameworks.di.module.viewModelModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class SBApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin{
            androidContext(this@SBApplication)
            listOf(modules(appModule, networkModule, viewModelModules, engineModule))
        }
    }

}