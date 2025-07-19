package com.segnities007.common

import com.segnities007.local.createExpenseDatabase
import com.segnities007.local.createItemDatabase
import com.segnities007.local.createStorageDatabase
import com.segnities007.local.createUserDatabase
import com.segnities007.local.db.ExpenseDatabase
import com.segnities007.local.db.ItemDatabase
import com.segnities007.local.db.StorageDatabase
import com.segnities007.local.db.UserDatabase
import org.koin.dsl.module

val databaseModule =
    module {
        single { createUserDatabase() }
        single { createItemDatabase() }
        single { createExpenseDatabase() }
        single { createStorageDatabase() }
        single { get<UserDatabase>().userDao() }
        single { get<ItemDatabase>().itemDao() }
        single { get<ExpenseDatabase>().expenseDao() }
        single { get<StorageDatabase>().storageDao() }
    }
