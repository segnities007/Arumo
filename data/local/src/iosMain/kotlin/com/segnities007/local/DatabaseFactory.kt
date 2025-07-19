package com.segnities007.local

import androidx.room.Room
import com.segnities007.local.db.StorageDatabase
import org.koin.core.scope.Scope
import platform.Foundation.NSHomeDirectory

actual fun Scope.createRoomDatabase(): StorageDatabase {
    val dbFile = NSHomeDirectory() + "/database.db"
    return Room
        .databaseBuilder<StorageDatabase>(
            name = dbFile,
        ).build()
}
