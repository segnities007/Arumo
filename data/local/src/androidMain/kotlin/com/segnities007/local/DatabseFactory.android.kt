package com.segnities007.local

import android.content.Context
import androidx.room.Room
import org.koin.core.scope.Scope

actual fun Scope.createRoomDatabase(): Database {
    val context = get<Context>()
    return Room
        .databaseBuilder(
            context,
            Database::class.java,
            "database.db",
        ).build()
}
