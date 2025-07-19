package com.segnities007.local

import android.content.Context
import androidx.room.Room
import com.segnities007.local.db.StorageDatabase
import org.koin.core.scope.Scope

actual fun Scope.createRoomDatabase(): StorageDatabase {
    val context = get<Context>()
    return Room
        .databaseBuilder(
            context,
            StorageDatabase::class.java,
            "database.db",
        ).build()
}
