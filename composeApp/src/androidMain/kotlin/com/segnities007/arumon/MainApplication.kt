package com.segnities007.arumon

import android.app.Application
import com.segnities007.common.databaseModule
import org.koin.core.context.GlobalContext.startKoin
import org.koin.android.ext.koin.androidContext

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MainApplication)
            modules(databaseModule)
        }
    }
}