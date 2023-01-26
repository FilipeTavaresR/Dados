package com.HHTtecnologia.dados.app

import android.app.Application
import com.HHTtecnologia.dados.di.module
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class DiceViewApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin{

            androidContext(applicationContext)
            modules(module)

        }
    }
}