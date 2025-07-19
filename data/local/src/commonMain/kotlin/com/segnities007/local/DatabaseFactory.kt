package com.segnities007.local

import com.segnities007.local.db.ExpenseDatabase
import com.segnities007.local.db.ItemDatabase
import com.segnities007.local.db.StorageDatabase
import com.segnities007.local.db.UserDatabase
import org.koin.core.scope.Scope

expect fun Scope.createStorageDatabase(): StorageDatabase
expect fun Scope.createUserDatabase(): UserDatabase
expect fun Scope.createItemDatabase(): ItemDatabase
expect fun Scope.createExpenseDatabase(): ExpenseDatabase