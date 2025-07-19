package com.segnities007.local

import android.content.Context
import androidx.room.Room
import com.segnities007.local.db.ExpenseDatabase
import com.segnities007.local.db.ItemDatabase
import com.segnities007.local.db.StorageDatabase
import com.segnities007.local.db.UserDatabase
import org.koin.core.scope.Scope

actual fun Scope.createStorageDatabase(): StorageDatabase {
    val context = get<Context>()
    return Room
        .databaseBuilder(
            context,
            StorageDatabase::class.java,
            "storage.db",
        ).build()
}

actual fun Scope.createUserDatabase(): UserDatabase {
    val context = get<Context>()
    return Room
        .databaseBuilder(
            context,
            UserDatabase::class.java,
            "user.db",
        ).build()
}

actual fun Scope.createItemDatabase(): ItemDatabase {
    val context = get<Context>()
    return Room
        .databaseBuilder(
            context,
            ItemDatabase::class.java,
            "item.db",
        ).build()
}

actual fun Scope.createExpenseDatabase(): ExpenseDatabase {
    val context = get<Context>()
    return Room
        .databaseBuilder(
            context,
            ExpenseDatabase::class.java,
            "expense.db",
        ).build()
}
