package com.segnities007.arumon

import android.app.Application
import com.segnities007.common.storageDatabaseModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MainApplication)
            modules(storageDatabaseModule)
        }
    }
}
