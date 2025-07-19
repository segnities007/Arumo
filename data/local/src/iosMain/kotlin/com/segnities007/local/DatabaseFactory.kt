package com.segnities007.local

import androidx.room.Room
import org.koin.core.scope.Scope
import platform.Foundation.NSHomeDirectory

actual fun Scope.createRoomDatabase(): Database {
    val dbFile = NSHomeDirectory() + "/database.db"
    return Room
        .databaseBuilder<Database>(
            name = dbFile,
        ).build()
}
