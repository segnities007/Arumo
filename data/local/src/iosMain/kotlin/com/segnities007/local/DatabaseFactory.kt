package com.segnities007.local

import androidx.room.Room
import com.segnities007.local.db.ExpenseDatabase
import com.segnities007.local.db.ItemDatabase
import com.segnities007.local.db.StorageDatabase
import com.segnities007.local.db.UserDatabase
import org.koin.core.scope.Scope
import platform.Foundation.NSHomeDirectory

actual fun Scope.createStorageDatabase(): StorageDatabase {
    val dbFile = NSHomeDirectory() + "/storage.db"
    return Room
        .databaseBuilder<StorageDatabase>(
            name = dbFile,
        ).build()
}

actual fun Scope.createUserDatabase(): UserDatabase {
    val dbFile = NSHomeDirectory() + "/user.db"
    return Room
        .databaseBuilder<UserDatabase>(
            name = dbFile,
        ).build()
}

actual fun Scope.createItemDatabase(): ItemDatabase {
    val dbFile = NSHomeDirectory() + "/item.db"
    return Room
        .databaseBuilder<ItemDatabase>(
            name = dbFile,
        ).build()
}

actual fun Scope.createExpenseDatabase(): ExpenseDatabase {
    val dbFile = NSHomeDirectory() + "/expense.db"
    return Room
        .databaseBuilder<ExpenseDatabase>(
            name = dbFile,
        ).build()
}
